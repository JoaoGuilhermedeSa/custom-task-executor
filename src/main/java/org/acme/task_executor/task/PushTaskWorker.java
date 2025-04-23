package org.acme.task_executor.task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class PushTaskWorker extends Thread {
	private final BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
	private volatile boolean running = true;

	public PushTaskWorker(String name) {
		super(name);
	}

	public void enqueue(Runnable task) {
		taskQueue.offer(task);
	}

	public int getQueueSize() {
		return taskQueue.size();
	}

	public void shutdown() {
		running = false;
		this.interrupt();
	}

	@Override
	public void run() {
		while (running || !taskQueue.isEmpty()) {
			try {
				Runnable task = taskQueue.take();
				task.run();
			} catch (InterruptedException ignored) {
			}
		}
	}
}

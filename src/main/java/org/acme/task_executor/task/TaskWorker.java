package org.acme.task_executor.task;

import java.util.concurrent.BlockingQueue;

class TaskWorker extends Thread {

	private volatile boolean shuttingDown = false;
	private BlockingQueue<Runnable> taskQueue;

	protected TaskWorker(String name, BlockingQueue<Runnable> taskQueue) {
		super(name);
		this.taskQueue = taskQueue;
	}

	protected void shutDown() {
		this.shuttingDown = true;
	}

	@Override
	public void run() {
		while (!shuttingDown || !taskQueue.isEmpty()) {
			try {
				Runnable task = taskQueue.take();
				task.run();
			} catch (InterruptedException e) {
				if (shuttingDown)
					break;
			} catch (Exception ex) {
				System.err.println(getName() + " encountered an error: " + ex.getMessage());
			}
		}
	}
}

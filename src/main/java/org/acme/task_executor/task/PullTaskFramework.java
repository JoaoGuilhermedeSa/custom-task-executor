package org.acme.task_executor.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PullTaskFramework {
	private final BlockingQueue<Runnable> taskQueue;
	private final List<PullTaskWorker> workers;
	private volatile boolean isActive = true;

	protected PullTaskFramework(int poolSize) {
		this.taskQueue = new LinkedBlockingQueue<>();
		this.workers = new ArrayList<>();

		for (int i = 0; i < poolSize; i++) {
			PullTaskWorker worker = new PullTaskWorker("Worker-" + i, taskQueue);
			worker.start();
			workers.add(worker);
		}
	}

	public void submit(Runnable task) {
		if (isActive) {
			taskQueue.offer(task);
		} else {
			throw new IllegalStateException("TaskFramework is shut down");
		}
	}

	public void shutdown() throws InterruptedException {
		isActive = false;

		System.out.println("TaskFramework is shutting down. No new tasks will be accepted");

		for (PullTaskWorker worker : workers) {
			try {
				worker.shutDown();
				worker.join();
			} catch (InterruptedException e) {
				System.err.println("Interrupted while waiting for worker to terminate: " + worker.getName());
			}
		}

		System.out.println("TaskFramework has shut down.");
	}
}
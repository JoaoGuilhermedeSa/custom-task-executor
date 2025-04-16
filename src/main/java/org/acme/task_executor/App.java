package org.acme.task_executor;

import org.acme.task_executor.task.TaskFramework;
import org.acme.task_executor.task.TaskFrameworkStarter;

public class App {

	public static void main(String[] args) throws InterruptedException {
		TaskFramework framework = TaskFrameworkStarter.withFixedPoolSize(3);

		for (int i = 0; i < 10; i++) {
			int taskId = i;
			framework.submit(() -> {
                String threadName = Thread.currentThread().getName();
				System.out.println(threadName + " is processing task " + taskId);
				try {
					Thread.sleep(2000);
					System.out.println("Task " + taskId + " executed properly.");
				} catch (InterruptedException ex) {
	                System.out.println("[" + threadName + "] was forced to interrupt task " + taskId);
				}
			});
		}

		framework.shutdown();
//		Thread.sleep(15000); // let some tasks finish

	}

}

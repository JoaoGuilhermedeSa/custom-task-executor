package org.acme.task_executor.task;

public class TaskFrameworkStarter {

	public static TaskFramework withFixedPoolSize(int poolSize) {
		return new TaskFramework(poolSize);
	}
	
}
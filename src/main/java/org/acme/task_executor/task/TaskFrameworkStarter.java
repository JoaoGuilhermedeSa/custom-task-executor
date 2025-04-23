package org.acme.task_executor.task;

public class TaskFrameworkStarter {
	
	public static PullTaskFramework pullWithFixedPoolSize(int poolSize) {
		return new PullTaskFramework(poolSize);
	}

	public static PushTaskFramework pushWithFixedPoolSize(int poolSize) {
		return new PushTaskFramework(poolSize);
	}
		
}
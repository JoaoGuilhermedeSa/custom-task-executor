package org.acme.task_executor.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PushTaskFramework {

    private final List<PushTaskWorker> workers;

    public PushTaskFramework(int numThreads) {
        this.workers = new ArrayList<>(numThreads);

        for (int i = 0; i < numThreads; i++) {
        	PushTaskWorker worker = new PushTaskWorker("PushWorker-" + i);
            workers.add(worker);
            worker.start();
        }
    }

    public void submit(Runnable task) {
    	PushTaskWorker leastLoaded = workers.stream()
                .min((w1, w2) -> Integer.compare(w1.getQueueSize(), w2.getQueueSize()))
                .orElseThrow();
        leastLoaded.enqueue(task);
    }

    public void shutdown() {
        for (PushTaskWorker worker : workers) {
            worker.shutdown();
        }
    }
}
package org.acme.task_executor.benchmark;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.acme.task_executor.task.PullTaskFramework;
import org.acme.task_executor.task.PushTaskFramework;
import org.acme.task_executor.task.TaskFrameworkStarter;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class TaskFrameworkBenchmark {

	private PullTaskFramework pullFramework;
	private PushTaskFramework pushFramework;
	private ExecutorService executor;

	@Setup(Level.Trial)
	public void setup() {
		pullFramework = TaskFrameworkStarter.pullWithFixedPoolSize(4);
		pushFramework = TaskFrameworkStarter.pushWithFixedPoolSize(4);
		executor = Executors.newFixedThreadPool(4);
	}

	@TearDown(Level.Trial)
	public void tearDown() throws InterruptedException {
		pullFramework.shutdown();
		pushFramework.shutdown();
		executor.shutdown();
	}

	@Benchmark
	public void customPullThreadPoolBenchmark(Blackhole blackhole) throws InterruptedException {
		AtomicInteger counter = new AtomicInteger();
		CountDownLatch latch = new CountDownLatch(20);

		for (int i = 0; i < 20; i++) {
			pullFramework.submit(() -> {
				counter.incrementAndGet();
				latch.countDown();
			});
		}

		latch.await();
	    blackhole.consume(counter.get());

	}
	
	@Benchmark
	public void customPushThreadPoolBenchmark(Blackhole blackhole) throws InterruptedException {
		AtomicInteger counter = new AtomicInteger();
		CountDownLatch latch = new CountDownLatch(20);

		for (int i = 0; i < 20; i++) {
			pushFramework.submit(() -> {
				counter.incrementAndGet();
				latch.countDown();
			});
		}

		latch.await();
	    blackhole.consume(counter.get());

	}
	

	@Benchmark
	public void executorServiceBenchmark(Blackhole blackhole) throws InterruptedException {
		AtomicInteger counter = new AtomicInteger();
		CountDownLatch latch = new CountDownLatch(20);

		for (int i = 0; i < 20; i++) {
			executor.submit(() -> {
				counter.incrementAndGet();
				latch.countDown();
			});
		}

		latch.await();
	    blackhole.consume(counter.get());
	}
}
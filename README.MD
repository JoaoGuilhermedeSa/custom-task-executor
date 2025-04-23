# JMH version: 1.37
# VM version: JDK 21.0.6, OpenJDK 64-Bit Server VM, 21.0.6+7-LTS
# VM invoker: C:\Program Files\Zulu\zulu-21\bin\java.exe
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.acme.task_executor.benchmark.TaskFrameworkBenchmark.customThreadPoolBenchmark

# Run progress: 0,00% complete, ETA 00:16:40
# Fork: 1 of 5
# Warmup Iteration   1: 92,332 ops/ms
# Warmup Iteration   2: 92,472 ops/ms
# Warmup Iteration   3: 89,546 ops/ms
# Warmup Iteration   4: 87,573 ops/ms
# Warmup Iteration   5: 85,134 ops/ms
Iteration   1: 83,993 ops/ms
Iteration   2: 84,583 ops/ms
Iteration   3: 88,512 ops/ms
Iteration   4: 89,666 ops/ms
Iteration   5: 86,014 ops/ms

# Run progress: 10,00% complete, ETA 00:15:04
# Fork: 2 of 5
# Warmup Iteration   1: 91,800 ops/ms
# Warmup Iteration   2: 92,171 ops/ms
# Warmup Iteration   3: 89,756 ops/ms
# Warmup Iteration   4: 89,945 ops/ms
# Warmup Iteration   5: 92,697 ops/ms
Iteration   1: 96,439 ops/ms
Iteration   2: 96,162 ops/ms
Iteration   3: 98,484 ops/ms
Iteration   4: 93,561 ops/ms
Iteration   5: 96,255 ops/ms

# Run progress: 20,00% complete, ETA 00:13:23
# Fork: 3 of 5
# Warmup Iteration   1: 94,349 ops/ms
# Warmup Iteration   2: 94,549 ops/ms
# Warmup Iteration   3: 96,240 ops/ms
# Warmup Iteration   4: 96,557 ops/ms
# Warmup Iteration   5: 94,670 ops/ms
Iteration   1: 95,284 ops/ms
Iteration   2: 95,958 ops/ms
Iteration   3: 96,258 ops/ms
Iteration   4: 94,768 ops/ms
Iteration   5: 95,791 ops/ms

# Run progress: 30,00% complete, ETA 00:11:43
# Fork: 4 of 5
# Warmup Iteration   1: 95,439 ops/ms
# Warmup Iteration   2: 98,663 ops/ms
# Warmup Iteration   3: 100,419 ops/ms
# Warmup Iteration   4: 99,980 ops/ms
# Warmup Iteration   5: 100,535 ops/ms
Iteration   1: 99,177 ops/ms
Iteration   2: 99,445 ops/ms
Iteration   3: 99,488 ops/ms
Iteration   4: 98,755 ops/ms
Iteration   5: 95,467 ops/ms

# Run progress: 40,00% complete, ETA 00:10:02
# Fork: 5 of 5
# Warmup Iteration   1: 100,011 ops/ms
# Warmup Iteration   2: 99,811 ops/ms
# Warmup Iteration   3: 100,280 ops/ms
# Warmup Iteration   4: 100,356 ops/ms
# Warmup Iteration   5: 100,090 ops/ms
Iteration   1: 99,228 ops/ms
Iteration   2: 99,645 ops/ms
Iteration   3: 99,117 ops/ms
Iteration   4: 99,146 ops/ms
Iteration   5: 98,827 ops/ms


Result "org.acme.task_executor.benchmark.TaskFrameworkBenchmark.customThreadPoolBenchmark":
  95,201 ±(99.9%) 3,626 ops/ms [Average]
  (min, avg, max) = (83,993, 95,201, 99,645), stdev = 4,840
  CI (99.9%): [91,575, 98,827] (assumes normal distribution)

# JMH version: 1.37
# VM version: JDK 21.0.6, OpenJDK 64-Bit Server VM, 21.0.6+7-LTS
# VM invoker: C:\Program Files\Zulu\zulu-21\bin\java.exe
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.acme.task_executor.benchmark.TaskFrameworkBenchmark.executorServiceBenchmark

# Run progress: 50,00% complete, ETA 00:08:22
# Fork: 1 of 5
# Warmup Iteration   1: 81,393 ops/ms
# Warmup Iteration   2: 83,119 ops/ms
# Warmup Iteration   3: 83,159 ops/ms
# Warmup Iteration   4: 83,519 ops/ms
# Warmup Iteration   5: 80,538 ops/ms
Iteration   1: 80,032 ops/ms
Iteration   2: 85,912 ops/ms
Iteration   3: 81,056 ops/ms
Iteration   4: 82,573 ops/ms
Iteration   5: 85,845 ops/ms

# Run progress: 60,00% complete, ETA 00:06:41
# Fork: 2 of 5
# Warmup Iteration   1: 89,001 ops/ms
# Warmup Iteration   2: 88,749 ops/ms
# Warmup Iteration   3: 89,964 ops/ms
# Warmup Iteration   4: 84,567 ops/ms
# Warmup Iteration   5: 85,417 ops/ms
Iteration   1: 87,291 ops/ms
Iteration   2: 82,608 ops/ms
Iteration   3: 86,915 ops/ms
Iteration   4: 83,715 ops/ms
Iteration   5: 81,660 ops/ms

# Run progress: 70,00% complete, ETA 00:05:01
# Fork: 3 of 5
# Warmup Iteration   1: 80,962 ops/ms
# Warmup Iteration   2: 82,956 ops/ms
# Warmup Iteration   3: 81,404 ops/ms
# Warmup Iteration   4: 82,219 ops/ms
# Warmup Iteration   5: 80,223 ops/ms
Iteration   1: 80,576 ops/ms
Iteration   2: 83,060 ops/ms
Iteration   3: 77,488 ops/ms
Iteration   4: 80,195 ops/ms
Iteration   5: 75,636 ops/ms

# Run progress: 80,00% complete, ETA 00:03:20
# Fork: 4 of 5
# Warmup Iteration   1: 79,000 ops/ms
# Warmup Iteration   2: 76,993 ops/ms
# Warmup Iteration   3: 74,095 ops/ms
# Warmup Iteration   4: 73,166 ops/ms
# Warmup Iteration   5: 73,430 ops/ms
Iteration   1: 66,815 ops/ms
Iteration   2: 75,525 ops/ms
Iteration   3: 69,407 ops/ms
Iteration   4: 73,984 ops/ms
Iteration   5: 75,512 ops/ms

# Run progress: 90,00% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 74,237 ops/ms
# Warmup Iteration   2: 73,842 ops/ms
# Warmup Iteration   3: 70,474 ops/ms
# Warmup Iteration   4: 74,222 ops/ms
# Warmup Iteration   5: 77,935 ops/ms
Iteration   1: 73,893 ops/ms
Iteration   2: 69,207 ops/ms
Iteration   3: 73,773 ops/ms
Iteration   4: 72,191 ops/ms
Iteration   5: 67,995 ops/ms

Result "org.acme.task_executor.benchmark.TaskFrameworkBenchmark.executorServiceBenchmark":
  78,115 ±(99.9%) 4,606 ops/ms [Average]
  (min, avg, max) = (66,815, 78,115, 87,291), stdev = 6,149
  CI (99.9%): [73,509, 82,721] (assumes normal distribution)

# Run complete. Total time: 00:16:44

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                          Mode  Cnt   Score   Error   Units
TaskFrameworkBenchmark.customThreadPoolBenchmark  thrpt   25  95,201 ± 3,626  ops/ms
TaskFrameworkBenchmark.executorServiceBenchmark   thrpt   25  78,115 ± 4,606  ops/ms
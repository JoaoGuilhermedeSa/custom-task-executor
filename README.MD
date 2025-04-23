Warmup: 5 iterations, 10 s each
Measurement: 5 iterations, 10 s each
Timeout: 10 min per iteration
Threads: 1 thread, will synchronize iterations
Benchmark mode: Throughput, ops/time
Benchmark: org.acme.task_executor.benchmark.TaskFrameworkBenchmark.customThreadPoolBenchmark

Warmup: 5 iterations, 10 s each
Measurement: 5 iterations, 10 s each
Timeout: 10 min per iteration
Threads: 1 thread, will synchronize iterations
Benchmark mode: Throughput, ops/time
Benchmark: org.acme.task_executor.benchmark.TaskFrameworkBenchmark.executorServiceBenchmark

Benchmark                   Mode   Cnt   Score   Error   Units
customThreadPoolBenchmark  thrpt   25  95,201 ± 3,626  ops/ms
executorServiceBenchmark   thrpt   25  78,115 ± 4,606  ops/ms
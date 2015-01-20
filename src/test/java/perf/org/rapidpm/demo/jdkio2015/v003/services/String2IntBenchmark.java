package perf.org.rapidpm.demo.jdkio2015.v003.services;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by sven on 20.01.15.
 */

@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 1, warmups = 2)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@Threads(value = 2)
@State(Scope.Thread)
public class String2IntBenchmark {
}

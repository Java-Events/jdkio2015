package perf.org.rapidpm.demo.jdkio2015.v003.services;

import org.openjdk.jmh.annotations.*;
import org.rapidpm.demo.jdkio2015.v003.services.AddService;

import java.util.concurrent.TimeUnit;

/**
 * Created by sven on 20.01.15.
 */
@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(value = 1, warmups = 2)
@Measurement(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@Threads(value = 2)
@State(Scope.Thread)
public class AddServiceBenchmark {

    @Benchmark
    public void benchmarkRuntimeOverhead() {
    }

    int result;

    @Benchmark
    public void insertBench( BenchmarkStateThread benchmarkStateThread) {
        AddService service = benchmarkStateThread.service;
        result = service.add(1,2);
    }

    @State(Scope.Thread)//einmal pro thread im TestDruchlauf
    public static class BenchmarkStateThread {

        public AddService service = new AddService();

        public BenchmarkStateThread() {
            System.out.println("constructor " + BenchmarkStateThread.class.getSimpleName());
        }

        @Setup
        public void setUp() throws Exception {
            System.out.println("BenchmarkStateThread-setUp = " + System.nanoTime());
        }

        @TearDown
        public void tearDown() {
            System.out.println("BenchmarkStateThread-tearDown = " + System.nanoTime());
        }
    }

}

import java.util.Date;
import java.util.stream.LongStream;


public class Main
{
    public static void main(String[] args) {
        long n = 100_000_000L;

        // Sequential Sum
        long start = System.currentTimeMillis();
        long sequentialSum = LongStream.rangeClosed(1, n).sum();
        long end = System.currentTimeMillis();
        System.out.println("Sequential Sum: " + sequentialSum + " in " + (end - start) + "ms");

        // Parallel Sum
        start = System.currentTimeMillis();
        long parallelSum = LongStream.rangeClosed(1, n).parallel().sum();
        end = System.currentTimeMillis();
        System.out.println("Parallel Sum: " + parallelSum + " in " + (end - start) + "ms");
    }
}
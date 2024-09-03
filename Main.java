import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static Stream<Long> generateStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long seed = 0; // Початкове значення
        long a = 25214903917L;
        long c = 11L;
        long m = (2L << 48); //

        Stream<Long> randomStream = generateStream(seed, a, c, m);

        randomStream.limit(10).forEach(System.out::println);
    }
}

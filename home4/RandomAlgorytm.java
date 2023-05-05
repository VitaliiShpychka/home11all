package home4;

import java.util.stream.Stream;
public class RandomAlgorytm {
    private   long a, c, m, seed;

    public static Stream<Long> genRandomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}




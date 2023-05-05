package home5;

import java.util.stream.Stream;

public class MainStreamZip {
    public static void main(String[] args) {

        Stream<Integer> firstStream = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> secondStream = Stream.of(2, 4, 6, 8);

        Stream<Integer> zipStream = StreamZip.zip(firstStream, secondStream);
        zipStream.forEach(System.out::println);
    }
}

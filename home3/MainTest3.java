package home3;

import  java.util.Set;
import java.util.stream.Collectors;
import  java.util.stream.Stream;

public class MainTest3 {
    public static void main(String[] args) {
        Set<Integer> collect = (Set<Integer>) Stream.of(6, 2, 1, 7, 3, 8, 4, 5)
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toSet());
    }
}

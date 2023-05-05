package home2;

import java.util.Comparator;
import  java.util.Set;
import java.util.stream.Collectors;
import  java.util.stream.Stream;

public class MainTest2 {
    public static void main(String[] args) {
        Set<String> collect = (Set<String>) Stream.of("Ivan", "Anton", "Zila", "Peter", "John", "Mark", "Mary","Jenifer", "Tom")
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .collect(Collectors.toSet());
    }
}

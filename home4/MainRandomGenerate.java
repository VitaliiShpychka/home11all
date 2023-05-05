package home4;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainRandomGenerate {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
        Stream<Long> randomAlgorytm = RandomAlgorytm.genRandomStream(25214903917L, 11L, (long) Math.pow(2, 48), i +1);
        Set<Long> colLect = randomAlgorytm.limit(10)
                .peek(System.out::println)
                .collect(Collectors.toSet());


    }
    }


}

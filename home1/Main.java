package home1;

import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<String> names = Arrays.asList("Ivan", "Peter", "John", "Mark", "Mary","Jenifer", "Tom");
                String oddIndexNames = IndexNames.IndexNames(names);
                System.out.println(oddIndexNames);
        }
}

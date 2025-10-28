package Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "Charlie", "diana");

        System.out.println("Original names:");
        names.forEach(System.out::println);

        System.out.println();
        System.out.println("Uppercased names using method reference (String::toUpperCase):");
        
        List<String> upper = names.stream()
                .map(String::toUpperCase) 
                .collect(Collectors.toList());

        upper.forEach(System.out::println);
    }
}

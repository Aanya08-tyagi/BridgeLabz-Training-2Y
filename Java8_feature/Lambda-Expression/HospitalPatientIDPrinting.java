package Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class HospitalPatientIDPrinting {

    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P1001", "P1002", "P1003", "P1004");

        System.out.println("Using a lambda to print IDs:");
        
        patientIds.forEach(id -> System.out.println(id));

        System.out.println();
        System.out.println("Using a method reference to print IDs (more concise):");
    
        patientIds.forEach(System.out::println);
    }
}

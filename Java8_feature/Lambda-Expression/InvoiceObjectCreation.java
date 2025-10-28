package Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InvoiceObjectCreation {

    static class Invoice {
        String transactionId;

 
        Invoice(String transactionId) {
            this.transactionId = transactionId;
        }

        @Override
        public String toString() {
            return "Invoice{transactionId='" + transactionId + "'}";
        }
    }

    public static void main(String[] args) {
        List<String> transactions = Arrays.asList("T-100", "T-101", "T-102");

   
        List<Invoice> invoicesWithLambda = transactions.stream()
                .map(id -> new Invoice(id))
                .collect(Collectors.toList());

        System.out.println("Invoices created with lambda:");
        invoicesWithLambda.forEach(System.out::println);

        Function<String, Invoice> constructorRef = Invoice::new;
        List<Invoice> invoicesWithRef = transactions.stream()
                .map(constructorRef)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("Invoices created with constructor reference:");
        invoicesWithRef.forEach(System.out::println);
    }
}

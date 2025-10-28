package Lambda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NotificationFiltering {

    
    static class Alert {
        String type; 
        String message;
        String patientId;

        Alert(String type, String patientId, String message) {
            this.type = type;
            this.patientId = patientId;
            this.message = message;
        }

        @Override
        public String toString() {
            return String.format("[%s] patient=%s: %s", type.toUpperCase(), patientId, message);
        }
    }

    private static void printFiltered(List<Alert> alerts, String title, Predicate<Alert> filter) {
        System.out.println(title);
        alerts.stream().filter(filter).forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("critical", "P1001", "Heart rate above threshold"));
        alerts.add(new Alert("info", "P1002", "Medication administered"));
        alerts.add(new Alert("warning", "P1001", "Blood pressure slightly elevated"));
        alerts.add(new Alert("critical", "P1003", "Oxygen saturation low"));

        
        Predicate<Alert> isCritical = a -> "critical".equalsIgnoreCase(a.type);

        
        Predicate<Alert> isForP1001 = a -> "P1001".equalsIgnoreCase(a.patientId);

        
        Predicate<Alert> criticalForP1001 = isCritical.and(isForP1001);

        
        Predicate<Alert> notInfo = a -> !"info".equalsIgnoreCase(a.type);

       
        System.out.println("All alerts:");
        alerts.forEach(System.out::println);
        System.out.println();

        printFiltered(alerts, "Filtered: critical alerts for P1001:", criticalForP1001);
        printFiltered(alerts, "Filtered: non-info alerts:", notInfo);

        Predicate<Alert> criticalOrWarning = isCritical.or(a -> "warning".equalsIgnoreCase(a.type));
        printFiltered(alerts, "Filtered: critical OR warning:", criticalOrWarning);

        
        printFiltered(alerts, "Filtered inline (alerts for P1003):",
                a -> "P1003".equalsIgnoreCase(a.patientId));
    }
}

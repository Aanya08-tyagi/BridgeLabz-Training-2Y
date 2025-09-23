
public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2]; // [salary, yearsOfService]
        for (int i = 0; i < count; i++) {
            int salary = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            int years = 1 + (int)(Math.random() * 10); // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] result = new double[data.length][2]; // [bonus, newSalary]
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int years = (int)data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to calculate totals and display results
    public static void displayResults(double[][] data, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            int years = (int)data[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("Emp %d\t\t%.2f\t%d\t%.2f\t%.2f\n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }

    // Main method
    public static void main(String[] args) {
        int employeeCount = 10;
        double[][] employeeData = generateEmployeeData(employeeCount);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, bonusData);
    }
}
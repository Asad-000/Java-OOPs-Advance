class Employee {
    int ID;
    String name;
    double basicSalary;
    static double bonusPool;
    static double bonusPercentage = 10;
    static int totalNum;

    public Employee(int ID, String name, double basicSalary) {
        this.ID = ID;
        this.name = name;
        this.basicSalary = basicSalary;
        Employee.totalNum++;
        bonusPool = bonusPool + (basicSalary * bonusPercentage / 100);

    }
    public void displayInfo() {
        System.out.println("Name: " + name + " ID: " + ID + " Basic Salary: " + basicSalary);
    }
    public double calculateTotalCompensation() {
        double totalCompensation = basicSalary + (bonusPool / totalNum);
        return totalCompensation;
    }
    public static void displayBonusPool() {
        System.out.println("Current total bonus pool: " + bonusPool);
        System.out.println();
    }
}

public class Task3 {
    public static void main (String[] args) {

        Employee e1 = new Employee(123,"Ahsan",55000);
        Employee e2 = new Employee(456,"Ali",63000);
        Employee e3 = new Employee(789,"Amna",61000);
        Employee e4 = new Employee(107,"Fahad",72000);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
        e4.displayInfo();

        System.out.println("Total Compensation: " + e1.calculateTotalCompensation());
        System.out.println("Total Compensation: " + e2.calculateTotalCompensation());
        System.out.println("Total Compensation: " + e3.calculateTotalCompensation());
        System.out.println("Total Compensation: " + e4.calculateTotalCompensation());

        Employee.displayBonusPool();
    }
}
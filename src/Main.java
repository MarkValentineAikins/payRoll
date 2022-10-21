public class Main {
    public static void main(String[] args) {
        int regularWage;
        int basePay = 25;
        int regularHours = 40;
        //Regular payments for an employee on a regular day
        regularWage = basePay * regularHours;

        System.out.println("My regular pay: " + regularWage);
        double overTimeWage;
        double overTimeHour = 10;
        double overTimePay = 37.5;

        //Over time pay for a regular employee.
        overTimeWage = overTimeHour * overTimePay;
        System.out.println("Over time Wage is: " + overTimeWage);

        //double totalWage = overTimeWage * overTimePay;

        double totalWage;

        totalWage = regularWage + overTimeWage;

        System.out.println("Total wage is: " + totalWage);

    }
}
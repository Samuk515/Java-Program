package Day5;

public class RelationalLogicalOperator {
    private static boolean hasID;

    static void main(String[] args) {
        int age = 20;
        double gpa = 3.8;
        boolean hasId = true;
        System.out.println("Is adult (age >=18) :" + (age >= 18));
        System.out.println("High GPA (gpa > 3.5 :" + (gpa > 3.5));
        System.out.println("Eligible ( adult AND high GPA):" + ((age >= 18) && (gpa >= 3.5)));
        System.out.println("Has ID or high GPA :" + (hasId || gpa >= 3.5));
        System.out.println("Not has ID: " + (!hasID));
    }
}

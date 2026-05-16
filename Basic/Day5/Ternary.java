package Day5;

public class Ternary {
    static void main(String[] args) {
        int marks = 73;
        String result = marks >= 40 ? "Pass" : "Fail";
        String grade  = marks >= 80 ? "A" : marks >= 60 ? "B" : "C";
        System.out.println("Marks:" + marks);
        System.out.println("Grade:" + grade);
        System.out.println("Result:" + result);
    }
}

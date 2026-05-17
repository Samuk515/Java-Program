package Day6;

public class GradeCalculator {
    static void main(String[] args) {
        int marks = 82;
        String grade, remark;
        if ( marks >= 90) {
            grade = "A+"; remark = "Outstanding";
        } else if ( marks >= 80) {
            grade = "A"; remark = "Excellent";
        }
        else if ( marks >= 70) {
            grade = "B"; remark = "Good";
        } else if ( marks >= 60) {
            grade = "C"; remark = "Average";
        } else if ( marks >= 40){
            grade = "D"; remark = "Below Average";
        } else {
            grade = "F"; remark = "Fail";
        }
        System.out.println("Marks :" +marks);
        System.out.println("Remark :" +remark);
        System.out.println("Grade :" +grade);

    }
}

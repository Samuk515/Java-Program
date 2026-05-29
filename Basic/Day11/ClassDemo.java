package Day11;

class Student {
    String name;
    int rollNO;
    double[] marks = new double[3];

    double getAverage(){
        double sum = 0;
        for (double m : marks) sum += m;
        return sum / marks.length;
    }
    String getGrade() {
        double avg = getAverage();
        if  (avg >= 80) return "A";
        else if ( avg >= 60 ) return "B";
        else if ( avg >= 40 ) return "C";
        else return "F";
    }

    void display(){
        System.out.println("Name  :" + name +  "Roll:" + rollNO);
        System.out.println("Marks :" + marks[0] + "|" + marks[1] + "|" + marks[2]);
        System.out.println("Average: " + getAverage() + "Grade: " + getGrade());
        System.out.println("-----");
    }
}
public class ClassDemo {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arjun"; s1.rollNO = 1;
        s1.marks[0]= 85;
        s1.marks[2] =90 ;
        s1.marks[2] = 78;

        Student s2 = new Student();
        s2.name = "Priya";
        s2.rollNO = 2;
        s2.marks[0]=70;
        s2.marks[1] = 65;
        s2.marks[2] = 80;

        s1.display();
        s2.display();

        if (s1.getAverage() > s2.getAverage()) {
            System.out.println("Top student: " + s1.name);
        } else {
            System.out.println("Top student: " + s2.name);
        }

    }
}

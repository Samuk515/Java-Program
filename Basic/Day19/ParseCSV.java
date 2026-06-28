package Day19;

public class ParseCSV {
    public static void main(String[] args) {
        String data = "Arjun,22,Engineering,3.8|Priya,20,Science,3.9|Ravi,23,Arts,3.2";

        System.out.printf("%-10s %-5s %-13s %s%n", "Name", "Age", "Course", "GPA");
        System.out.println("_".repeat(35));

        String[] students = data.split("\\|");
        for (String student : students) {
            String[] fields = student.split(",");
            System.out.printf("%-10s %-5s %13s %s%n", fields[0], fields[1], fields[2], fields[3]);
        }
    }
}

package Day20;

public class ReportBuilder {
    public static void main(String args[]) {
        String name = "Arjun";
        int day = 20;

        String report = new StringBuilder()
                .append("\n")
                .append(" Title  : Java Progress Report\n")
                .append(" Student: ").append(name).append("\n")
                .append(" Day   : ").append(day).append("of 100\n")
                .append(" Status  : ").append(day >= 10 ? "On Track" : "Just Started").append("\n")
                .append("")
                .toString();
        System.out.println(report);
    }
}

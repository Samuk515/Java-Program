package Day26;

abstract class Report {
    String title;
    String[] data;

    Report(String title, String[] data) {
        this.title = title;
        this.data = data;
    }

    abstract void printHeader();
    abstract void printBody();
    abstract void printFooter();

    int getLineCount() { return data.length; }

    final void generate() {  // template method
        printHeader();
        printBody();
        printFooter();
        System.out.println("(" + getLineCount() + " records)\n");
    }
}

class TextReport extends Report {
    TextReport(String title, String[] data) { super(title, data); }
    @Override void printHeader() {
        System.out.println("=== " + title + " ===");
        System.out.println("-------------------");
    }
    @Override void printBody() {
        for (int i = 0; i < data.length; i++)
            System.out.println((i+1) + ". " + data[i]);
    }
    @Override void printFooter() { System.out.println("-------------------"); }
}

class HTMLReport extends Report {
    HTMLReport(String title, String[] data) { super(title, data); }
    @Override void printHeader() {
        System.out.println("<html>");
        System.out.println("  <head><title>" + title + "</title></head>");
        System.out.println("  <body>");
        System.out.println("    <h1>" + title + "</h1>");
    }
    @Override void printBody() {
        for (String d : data)
            System.out.println("    <p>" + d + "</p>");
    }
    @Override void printFooter() {
        System.out.println("  </body>");
        System.out.println("</html>");
    }
}


class CSVReport extends Report {
    CSVReport(String title, String[] data) { super(title, data); }
    @Override void printHeader() {
        System.out.println("# " + title);
        System.out.println("No,Value");
    }
    @Override void printBody() {
        for (int i = 0; i < data.length; i++)
            System.out.println((i + 1) + "," + data[i]);
    }
    @Override void printFooter() { System.out.println("# End of report"); }
}

public class ReportDemo {
    static void main(String[] args) {
        if (args != null && args.length > 0) {
            System.out.println("Arguments are ignored in this demo.");
        }
        String[] sales = {"Laptop: Rs.85000", "Phone: Rs.25000", "Tablet: Rs.35000"};

        Report[] reports = {
                new TextReport("Sales Report", sales),
                new HTMLReport("Sales Report", sales),
                new CSVReport("Sales Report", sales)
        };

        for (Report r : reports) r.generate();
    }
}

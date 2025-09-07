package SOLID;

class Report {
    public String generateReport() {
        return "This is the report data.";
    }
}
class ReportPrinter {
    public void printReport(String reportData) {
        System.out.println("Printing Report: " + reportData);
    }
}
public class S1 {
    public static void main(String[] args) {
        Report report = new Report();
        String data = report.generateReport();

        ReportPrinter printer = new ReportPrinter();
        printer.printReport(data);
    }
}
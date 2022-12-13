package solid;

import solid.dip.PrintReport;
import solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        PrintReport printReport = new PrintReport();
        printReport.output(report.calculate());
    }
}

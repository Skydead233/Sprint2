import java.util.ArrayList;

public class MonthReport {

    public ArrayList<ItemMonth> monthReport;

    public MonthReport(String[] monthReport) {
        this.monthReport = new ArrayList<>();
        for (int i = 1; i < monthReport.length; i++) {
            String[] monthReport1 = monthReport[i].split(",");
            new ItemMonth(monthReport1);
            this.monthReport.add(new ItemMonth(monthReport1));
        }

    }

    public ArrayList<ItemMonth> getMonthReport() {
        return monthReport;
    }

}


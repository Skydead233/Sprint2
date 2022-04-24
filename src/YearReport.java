import java.util.ArrayList;

public class YearReport {
    public ArrayList<ItemYear> yearReport;

    public YearReport(String[] yearReport) {
        this.yearReport = new ArrayList<>();
        for (int i = 1; i < yearReport.length; i++) {
            String[] yearReport1 = yearReport[i].split(",");
            new ItemYear(yearReport1);
            this.yearReport.add(new ItemYear(yearReport1));
        }
    }

    public ArrayList<ItemYear> getYearReport() {
        return yearReport;
    }
}
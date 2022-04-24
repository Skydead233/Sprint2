import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;


public class ScanReader {
    private final String Name_Of_Month = "resources\\m.20210";
    private final String Extension = ".csv";

    HashMap<Integer, MonthReport> monthlyReader = new HashMap<>();
    ArrayList<YearReport> yearReader = new ArrayList<>();

    public HashMap<Integer, MonthReport> ScanMonth() {

        for (int i = 1; i <= 3; i++) {
            String[] linestwo = readFileContentsOrNull(Name_Of_Month + i + Extension).split(System.lineSeparator());
            monthlyReader.put(i, new MonthReport(linestwo));
        }
        System.out.println(monthlyReader);
        return monthlyReader;

    }
    public ArrayList<YearReport> ScanYear() {

        String[] linesTwo = readFileContentsOrNull("resources\\y.2021.csv").split(System.lineSeparator());
        yearReader.add(new YearReport(linesTwo));
        return yearReader;
    }

    private String readFileContentsOrNull(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }
}


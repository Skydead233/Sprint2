import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ScanReader scanReader = new ScanReader();
        HashMap<Integer, MonthReport> monthlyReportList = new HashMap<>();
        ArrayList<YearReport> yearReportList = new ArrayList<>();
        Calculation calculation = new Calculation();

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1: {
                    monthlyReportList = scanReader.ScanMonth();
                    System.out.println("Все имеющиеся месячные отчеты считаны");
                    break;
                }
                case 2: { //"2 - Считать годовой отчёт"
                    yearReportList = scanReader.ScanYear();
                    System.out.println("Все имеющиеся годовые отчеты считаны");
                    break;
                }
                case 3: {
                    try {
                        calculation.RevisdeExpensesAndIncome(monthlyReportList, yearReportList);
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Пожайлуста, сначала считайте отчеты");
                    }
                    break;
                }
                case 4: {   // "4 - Вывести информацию о всех месячных отчётах"
                    try {
                        calculation.MonthlyReportCalculation(monthlyReportList);

                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Пожайлуста, сначала считайте отчеты");
                    }
                    break;

                }
                case 5: { // "5 - Вывести информацию о годовом отчёте"

                }
                case 6: { // "6 - Выйти из приложения"
                    System.out.println("Программа завершена");
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("Извините, такой команды пока нет");
                    break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Считать все месячные отчёты");
        System.out.println("2 - Считать годовой отчёт");
        System.out.println("3 - Сверить отчёты");
        System.out.println("4 - Вывести информацию о всех месячных отчётах");
        System.out.println("5 - Вывести информацию о годовом отчёте");
        System.out.println("6 - Выйти из приложения");
    }
}

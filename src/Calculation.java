import java.util.ArrayList;
import java.util.HashMap;

public class Calculation {

    public void RevisdeExpensesAndIncome(HashMap<Integer, MonthReport> monthRevise, ArrayList<YearReport> yearRevise) {

        int incomeJanuary = 0;
        int incomeFebruary = 0;
        int incomeMarch = 0;
        int expensesJanuary = 0;
        int expensesFebruary = 0;
        int expensesMarch = 0;
        int incomeYearJanuary = 0;
        int expensesYearJanuary = 0;
        int incomeYearFebruary = 0;
        int expensesYearFebruary = 0;
        int incomeYearMarch = 0;
        int expensesYearMarch = 0;

        for (int i = 0; i < 6; i++) {
            if ((monthRevise.get(1).getMonthReport().get(i).getIsExpense())) {
                expensesJanuary = expensesJanuary + monthRevise.get(1).getMonthReport().get(i).getSumOfOne() * monthRevise.get(1).getMonthReport().get(i).getQuantity();
            } else {
                incomeJanuary = incomeJanuary + monthRevise.get(1).getMonthReport().get(i).getSumOfOne() * monthRevise.get(1).getMonthReport().get(i).getQuantity();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (monthRevise.get(2).getMonthReport().get(i).getIsExpense()) {
                expensesFebruary = expensesFebruary + monthRevise.get(2).getMonthReport().get(i).getSumOfOne() * monthRevise.get(2).getMonthReport().get(i).getQuantity();
            } else {
                incomeFebruary = incomeFebruary + monthRevise.get(2).getMonthReport().get(i).getSumOfOne() * monthRevise.get(2).getMonthReport().get(i).getQuantity();
            }
        }

        for (int i = 0; i < 6; i++) {
            if (monthRevise.get(3).getMonthReport().get(i).getIsExpense()) {
                expensesMarch = expensesMarch + monthRevise.get(3).getMonthReport().get(i).getSumOfOne() * monthRevise.get(3).getMonthReport().get(i).getQuantity();
            } else {
                incomeMarch = incomeMarch + monthRevise.get(3).getMonthReport().get(i).getSumOfOne() * monthRevise.get(3).getMonthReport().get(i).getQuantity();
                ;
            }
        }

        String January = "01";
        String February = "02";
        String March = "03";

        for (int i = 0; i < 6; i++) {
            if ((yearRevise.get(0).getYearReport().get(i).getIsExpense()) && (((yearRevise.get(0).getYearReport().get(i).getMonth()).equals(January)))) {
                expensesYearJanuary = expensesYearJanuary + yearRevise.get(0).getYearReport().get(i).getAmount();
            }
            if (((!(yearRevise.get(0).getYearReport().get(i).getIsExpense()) && (((yearRevise.get(0).getYearReport().get(i).getMonth()).equals(January)))))) {
                incomeYearJanuary = incomeYearJanuary + yearRevise.get(0).getYearReport().get(i).getAmount();
            }

            if ((yearRevise.get(0).getYearReport().get(i).getIsExpense()) && (((yearRevise.get(0).getYearReport().get(i).getMonth()).equals(February)))) {
                expensesYearFebruary = expensesYearFebruary + yearRevise.get(0).getYearReport().get(i).getAmount();
            }
            if (((!(yearRevise.get(0).getYearReport().get(i).getIsExpense()) && (((yearRevise.get(0).getYearReport().get(i).getMonth()).equals(February)))))) {
                incomeYearFebruary = incomeYearFebruary + yearRevise.get(0).getYearReport().get(i).getAmount();
            }
            if ((yearRevise.get(0).getYearReport().get(i).getIsExpense()) && (((yearRevise.get(0).getYearReport().get(i).getMonth()).equals(March)))) {
                expensesYearMarch = expensesYearMarch + yearRevise.get(0).getYearReport().get(i).getAmount();
            }
            if (((!(yearRevise.get(0).getYearReport().get(i).getIsExpense()) && (((yearRevise.get(0).getYearReport().get(i).getMonth()).equals(March)))))) {
                incomeYearMarch = incomeYearMarch + yearRevise.get(0).getYearReport().get(i).getAmount();
            }
        }

        if ((incomeJanuary == incomeYearJanuary) && (expensesJanuary == expensesYearJanuary)) {
            if ((incomeFebruary == incomeYearFebruary) && (expensesFebruary == expensesYearFebruary)) {
                if ((incomeMarch == incomeYearMarch) && (expensesMarch == expensesYearMarch)) {
                    System.out.println("Несоответствий не обнаружено!");
                }
            }
        }
    }
    public void MonthlyReportCalculation(HashMap<Integer, MonthReport> month) {
        HashMap<Integer, MonthReport> monthlyReportCalculation = month;
        int maxIncomeJanuary = 0;
        int maxExpensesJanuary = 0;
        int maxIncomeFebruary = 0;
        int maxExpensesFebruary = 0;
        int maxIncomeMarch = 0;
        int maxExpensesMarch = 0;
        int maxJ = 0;
        int maxF = 0;
        int maxM = 0;
        String maxIncomeJanuaryName = null;
        String maxExpensesJanuaryName = null;
        String maxIncomeFebruaryName = null;
        String maxExpensesFebruaryName = null;
        String maxIncomeMarchName = null;
        String maxExpensesMarchName = null;
        for (int i = 0; i < 6; i++) {
            if ((month.get(1).getMonthReport().get(i).getIsExpense())) {
                maxExpensesJanuary = month.get(1).getMonthReport().get(i).getSumOfOne() * month.get(1).getMonthReport().get(i).getQuantity();
                if (maxExpensesJanuary > maxJ) {
                    maxJ = maxExpensesJanuary;
                    maxExpensesJanuaryName = month.get(1).getMonthReport().get(i).getItemName();

                }
            } else if (!((month.get(1).getMonthReport().get(i).getIsExpense()))) {
                maxIncomeJanuary = month.get(1).getMonthReport().get(i).getSumOfOne() * month.get(1).getMonthReport().get(i).getQuantity();
                if (maxIncomeJanuary > maxJ) {
                    maxJ = maxIncomeJanuary;
                    maxIncomeJanuaryName = month.get(1).getMonthReport().get(i).getItemName();
                } else {
                    maxIncomeJanuary = month.get(1).getMonthReport().get(i - 1).getSumOfOne() * month.get(1).getMonthReport().get(i - 1).getQuantity();
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if ((month.get(2).getMonthReport().get(i).getIsExpense())) {
                maxExpensesFebruary = month.get(2).getMonthReport().get(i).getSumOfOne() * month.get(2).getMonthReport().get(i).getQuantity();
                if (maxExpensesFebruary > maxF) {
                    maxF = maxExpensesFebruary;
                    maxExpensesFebruaryName = month.get(2).getMonthReport().get(i).getItemName();
                }
            } else if (!((month.get(2).getMonthReport().get(i).getIsExpense()))) {
                maxIncomeFebruary = month.get(2).getMonthReport().get(i).getSumOfOne() * month.get(2).getMonthReport().get(i).getQuantity();
                if (maxIncomeFebruary > maxF) {
                    maxF = maxIncomeFebruary;
                    maxIncomeFebruaryName = month.get(2).getMonthReport().get(i).getItemName();
                } else {
                    maxIncomeFebruary = month.get(2).getMonthReport().get(i - 1).getSumOfOne() * month.get(2).getMonthReport().get(i - 1).getQuantity();
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            if ((month.get(3).getMonthReport().get(i).getIsExpense())) {
                maxExpensesMarch = month.get(3).getMonthReport().get(i).getSumOfOne() * month.get(3).getMonthReport().get(i).getQuantity();
                if (maxExpensesMarch > maxM) {
                    maxM = maxExpensesMarch;
                    maxExpensesMarchName = month.get(3).getMonthReport().get(i).getItemName();
                }
            } else if (!((month.get(3).getMonthReport().get(i).getIsExpense()))) {
                maxIncomeMarch = month.get(3).getMonthReport().get(i).getSumOfOne() * month.get(3).getMonthReport().get(i).getQuantity();
                if (maxIncomeMarch > maxM) {
                    maxM = maxIncomeMarch;
                    maxIncomeMarchName = month.get(3).getMonthReport().get(i).getItemName();
                } else {
                    maxIncomeMarch = month.get(3).getMonthReport().get(i - 1).getSumOfOne() * month.get(3).getMonthReport().get(i - 1).getQuantity();
                }
            }
        }
        System.out.println("Январь:");
        System.out.println("Самый прибыльный товар: " + maxIncomeJanuaryName + ". Сумма самого прибыльного товара: " + maxIncomeJanuary);
        System.out.println("Наименование самой большой траты: " + maxExpensesJanuaryName + ". Значение этой траты: " + maxExpensesJanuary);
        System.out.println("Февраль:");
        System.out.println("Самый прибыльный товар: " + maxIncomeFebruaryName + ". Сумма самого прибыльного товара: " + maxIncomeFebruary);
        System.out.println("Наименование самой большой траты: " + maxExpensesFebruaryName + ". Значение этой траты: " + maxExpensesFebruary);
        System.out.println("Март:");
        System.out.println("Самый прибыльный товар: " + maxIncomeMarchName + ". Сумма самого прибыльного товара: " + maxIncomeMarch);
        System.out.println("Наименование самой большой траты: " + maxExpensesMarchName + ". Значение этой траты: " + maxExpensesMarch);
    }
}








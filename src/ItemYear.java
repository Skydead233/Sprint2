public class ItemYear {
    private final String month;
    private final Integer amount;
    private final Boolean isExpense;


    public ItemYear(String[] columns) {
        this.month = columns[0];
        this.amount = Integer.valueOf(columns[1]);
        this.isExpense = Boolean.valueOf(columns[2]);
    }

    public String getMonth() {
        return month;
    }

    public Integer getAmount() {
        return amount;
    }

    public Boolean getIsExpense() {
        return isExpense;
    }


    public String toString() {
        return "Item{" + "month=" + month + ", amount=" + amount + ", is_expense=" + isExpense + '}';
    }

}

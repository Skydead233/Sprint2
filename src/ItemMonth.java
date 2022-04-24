public class ItemMonth {
    private final String itemName;
    private final Boolean isExpense;
    private final Integer quantity;
    private final Integer sumOfOne;

    public ItemMonth(String[] columns) {
        this.itemName = columns[0];
        this.isExpense = Boolean.valueOf(columns[1]);
        this.quantity = Integer.valueOf(columns[2]);
        this.sumOfOne = Integer.valueOf(columns[3]);
    }

    public String getItemName() {
        return itemName;
    }

    public Boolean getIsExpense() {
        return isExpense;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getSumOfOne() {
        return sumOfOne;
    }

    public String toString() {
        return "Item{" + "name=" + itemName + ", isExpense=" + isExpense + ", quantity=" + quantity + ", sumOfOne=" + sumOfOne + '}';
    }
}

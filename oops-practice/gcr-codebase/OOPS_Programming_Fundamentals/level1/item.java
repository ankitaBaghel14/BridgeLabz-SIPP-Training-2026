class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();

        item.itemCode = 1001;
        item.itemName = "Notebook";
        item.price = 50;

        item.displayDetails();

        int quantity = 5;
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + item.totalCost(quantity));
    }
}
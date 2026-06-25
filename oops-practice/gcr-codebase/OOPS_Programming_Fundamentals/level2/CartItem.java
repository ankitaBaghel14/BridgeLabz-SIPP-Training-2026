class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty)
            quantity -= qty;
        else
            System.out.println("Not enough items to remove.");
    }

    void displayTotalCost() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();

        item.itemName = "Laptop Bag";
        item.price = 1200;

        item.addItem(3);
        item.removeItem(1);

        item.displayTotalCost();
    }
}
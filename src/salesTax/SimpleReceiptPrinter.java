package salesTax;

import java.util.ArrayList;
import java.util.List;

class SimpleReceiptPrinter implements ReceiptPrinter {
    private List<String> items;
    
    public SimpleReceiptPrinter() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item, double priceWithTax) {
        items.add(String.format("%d %s: %.2f", 1, item.getName(), priceWithTax));
    }

    @Override
    public void printReceipt(double totalSalesTaxes, double totalPrice) {
        for (String item : items) {
            System.out.println(item);
        }
        System.out.printf("Sales Taxes: %.2f%n", totalSalesTaxes);
        System.out.printf("Total: %.2f%n", totalPrice);
    }
}
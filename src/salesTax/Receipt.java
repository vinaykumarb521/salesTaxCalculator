package salesTax;

import java.util.ArrayList;
import java.util.List;

class Receipt {
	private List<Item> items;
	private TaxCalculator taxCalculator;
	private ReceiptPrinter receiptPrinter;
	private double totalSalesTaxes;
	private double totalPrice;

	public Receipt(TaxCalculator taxCalculator, ReceiptPrinter receiptPrinter) {
		this.taxCalculator = taxCalculator;
		this.receiptPrinter = receiptPrinter;
		this.items = new ArrayList<>();
		this.totalSalesTaxes = 0.0;
		this.totalPrice = 0.0;
	}

	public void addItem(Item item) {
		double tax = taxCalculator.calculateTax(item);
		double finalPrice = item.getPrice() + tax;

		receiptPrinter.addItem(item, finalPrice);
		totalSalesTaxes += tax;
		totalPrice += finalPrice;
	}

	public void printReceipt() {
		receiptPrinter.printReceipt(totalSalesTaxes, totalPrice);
	}
}
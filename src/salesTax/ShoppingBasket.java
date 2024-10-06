package salesTax;

class ShoppingBasket {
	private Receipt receipt;

	public ShoppingBasket(TaxCalculator taxCalculator, ReceiptPrinter receiptPrinter) {
		receipt = new Receipt(taxCalculator, receiptPrinter);
	}

	public void addItem(String name, double price, boolean isExempt, boolean isImported) {
		Item item = new Product(name, price, isExempt, isImported);
		receipt.addItem(item);
	}

	public void checkout() {
		receipt.printReceipt();
	}
}
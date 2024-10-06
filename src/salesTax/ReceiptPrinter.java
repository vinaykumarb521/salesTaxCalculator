package salesTax;

interface ReceiptPrinter {
	void addItem(Item item, double priceWithTax);

	void printReceipt(double totalSalesTaxes, double totalPrice);
}
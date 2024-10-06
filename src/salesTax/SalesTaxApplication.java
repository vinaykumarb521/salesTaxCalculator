package salesTax;

public class SalesTaxApplication {
	public static void main(String[] args) {
		TaxCalculator taxCalculator = new SalesTaxCalculator();

		System.out.println("Output 1:");
		ReceiptPrinter receiptPrinter1 = new SimpleReceiptPrinter();
		ShoppingBasket basket1 = new ShoppingBasket(taxCalculator, receiptPrinter1);
		basket1.addItem("book", 12.49, true, false);
		basket1.addItem("music CD", 14.99, false, false);
		basket1.addItem("chocolate bar", 0.85, true, false);
		basket1.checkout();

		System.out.println("Output 2:");
		ReceiptPrinter receiptPrinter2 = new SimpleReceiptPrinter();
		ShoppingBasket basket2 = new ShoppingBasket(taxCalculator, receiptPrinter2);
		basket2.addItem("imported box of chocolates", 10.00, true, true);
		basket2.addItem("imported bottle of perfume", 47.50, false, true);
		basket2.checkout();

		System.out.println("Output 3:");
		ReceiptPrinter receiptPrinter3 = new SimpleReceiptPrinter();
		ShoppingBasket basket3 = new ShoppingBasket(taxCalculator, receiptPrinter3);
		basket3.addItem("imported bottle of perfume", 27.99, false, true);
		basket3.addItem("bottle of perfume", 18.99, false, false);
		basket3.addItem("packet of headache pills", 9.75, true, false);
		basket3.addItem("box of imported chocolates", 11.25, true, true);
		basket3.checkout();
	}
}
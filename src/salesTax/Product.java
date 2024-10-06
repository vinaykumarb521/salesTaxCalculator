package salesTax;

class Product implements Item {
	private String name;
	private double price;
	private boolean isExempt;
	private boolean isImported;

	public Product(String name, double price, boolean isExempt, boolean isImported) {
		this.name = name;
		this.price = price;
		this.isExempt = isExempt;
		this.isImported = isImported;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public boolean isExempt() {
		return isExempt;
	}

	@Override
	public boolean isImported() {
		return isImported;
	}
}

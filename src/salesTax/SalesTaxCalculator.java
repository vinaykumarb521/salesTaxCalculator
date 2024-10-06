package salesTax;

class SalesTaxCalculator implements TaxCalculator {
    private static final double BASIC_SALES_TAX = 0.10;
    private static final double IMPORT_DUTY = 0.05;

    @Override
    public double calculateTax(Item item) {
        double tax = 0.0;

        if (!item.isExempt()) {
            tax += item.getPrice() * BASIC_SALES_TAX;
        }

        if (item.isImported()) {
            tax += item.getPrice() * IMPORT_DUTY;
        }

        return roundUpTax(tax);
    }

    private double roundUpTax(double tax) {
        return Math.ceil(tax * 20.0) / 20.0;
    }
}

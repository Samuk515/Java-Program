package Day27;

interface Taxable {
     double TAX_RATE =0.13; // public static final implicitly
    double calculateTax();
}

interface Discountable {
    double DISCOUNT_RATE =0.10;
    double calculateDiscount();
}

class Invoice implements Taxable, Discountable {
    double amount;
    Invoice(double amount) { this.amount = amount; }
    @Override
    public double calculateTax() { return amount * TAX_RATE; }

    @Override
    public double calculateDiscount() { return DISCOUNT_RATE; }

    void printBreakdown(){
        double tax = calculateTax();
        double discount = calculateDiscount();
        double final_ = amount + tax - discount;

        System.out.println("Amount   : Rs." + amount);
        System.out.println("Tax (13%)       : Rs." + tax);
        System.out.println("Discount    : Rs." + discount);
        System.out.println("Final : Rs." + final_);
    }
}
public class InvoiceDemo {
    public static void main(String[] args) {
        Invoice inv = new Invoice(1000);
        inv.printBreakdown();

        //Access interface constants directly
        System.out.println("Tax rate   :" + Taxable.TAX_RATE);
        System.out.println("Discount rate:" + Discountable.DISCOUNT_RATE);
    }
}

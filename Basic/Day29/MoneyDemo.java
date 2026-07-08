package Day29;

final class Money {
    private final double amount;
    private final String currency;

    Money(double amount, String currency) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        if (currency == null || currency.isEmpty()) throw new IllegalArgumentException("Currency required");
        this.amount = amount;
        this.currency = currency;
    }
    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }

    public Money add(double extra) {
        return new Money(this.amount + extra, this.currency);
    }
    public Money subtract(double value) {
        return new Money(this.amount - value, this.currency);
    }
    public Money multiply(double factor) {
        return new Money(this.amount * factor, this.currency);
    }
    public Money convertTo(String newCurrency, double rate){
        return new Money(this.amount * rate, newCurrency);
    }
    @Override
    public String toString() {
        return currency + " " + String.format("%.2f", amount);
    }
}

public class MoneyDemo {
    public static void main(String[] args) {
        Money m1 = new Money(100.0, "NPR");
        Money m2 = m1.add(50.0);
        Money m3 = m1.multiply(2);
        Money m4 = m1.convertTo("USD", 0.0075);

        System.out.println("m1 (original);" + m1);
        System.out.println("m2 (add 50 : " + m2);
        System.out.println("m3 (*2) : " + m3);
        System.out.println("m4 (to USD) : " + m4);
    }
}

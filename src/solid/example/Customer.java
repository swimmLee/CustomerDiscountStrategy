package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy;

    public Customer(String customerName, double billAmount, DiscountStrategy discountStrategy) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountStrategy = discountStrategy;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        return discountStrategy.getDiscountedAmount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountStrategy.toString()
                + '}';
    }
}

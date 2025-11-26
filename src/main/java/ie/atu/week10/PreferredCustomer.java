package ie.atu.week10;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer()
    {
        super();
        loyaltyPoints = 0;
        discountLevel = 0;
    }

    public void addLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints += loyaltyPoints;
    }

    public PreferredCustomer (String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel)
    {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    private void updateDiscountLevel()
    {
        if (loyaltyPoints < 500) discountLevel = 0;
        if (loyaltyPoints >= 500 && loyaltyPoints <= 999) discountLevel = 0.05;
        if (loyaltyPoints >= 1000 && loyaltyPoints <= 1499) discountLevel = 0.06;
        if (loyaltyPoints >= 1500 && loyaltyPoints <= 1999) discountLevel = 0.07;
        if (loyaltyPoints >= 2000) discountLevel = 0.1;
    }

    public int getLoyaltyPoints() { return loyaltyPoints; }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() { return discountLevel; }

    public void setDiscountLevel(double discountLevel) { this.discountLevel = discountLevel; }

    @Override
    public String toString() {
        return super.toString() +
                "\nloyaltyPoints=" + loyaltyPoints +
                "\ndiscountLevel=" + discountLevel * 100 + "%";
    }
}

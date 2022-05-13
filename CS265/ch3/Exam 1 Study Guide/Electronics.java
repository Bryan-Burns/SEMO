public class Electronics extends Product {

    private String name;
    private boolean warranty;
    private double warrantyCharge;

    public Electronics(int productID, int manufacturersID, double wholesalePrice,
                       double percentMarkUp, String name, boolean warranty, double warrantyCharge) {
        super(productID, manufacturersID, wholesalePrice, percentMarkUp);
        this.name = name;
        this.warranty = warranty;
        this.warrantyCharge = warrantyCharge;
    }

    public Electronics() {
        this(12345, 1234, 999.99, 2.5, "iPhone",
                false, 0.0);
    }

    public void setElectronics(int productID, int manufacturersID, double wholesalePrice,
                               double percentMarkUp, String name, boolean warranty, double warrantyCharge) {
        super.setProduct(productID, manufacturersID, wholesalePrice, percentMarkUp);
        this.name = name;
        this.warranty = warranty;
        this.warrantyCharge = warrantyCharge;
    }

    public double salePrice() {
        return retailPrice() + warrantyCharge;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + String.format("Electronic name: %s, Warranty: %b, " +
                "Warranty Charge: %f", name, warranty, warrantyCharge);
    }
}
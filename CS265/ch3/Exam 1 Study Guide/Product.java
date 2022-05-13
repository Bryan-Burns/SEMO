public class Product {

    private int productID;
    private int manufacturersID;
    private double wholesalePrice;
    private double percentMarkUp;

    public Product(int productID, int manufacturersID, double wholesalePrice, double percentMarkUp) {
        this.productID = productID;
        this.manufacturersID = manufacturersID;
        this.wholesalePrice = wholesalePrice;
        this.percentMarkUp = percentMarkUp;
    }

    public Product() {
        productID = 12345;
        manufacturersID = 1234;
        wholesalePrice = 699.99;
        percentMarkUp = 15;
    }

    public void setProduct(int productID, int manufacturersID, double wholesalePrice, double percentMarkUp) {
        this.productID = productID;
        this.manufacturersID = manufacturersID;
        this.wholesalePrice = wholesalePrice;
        this.percentMarkUp = percentMarkUp;
    }

    public double retailPrice() {
        return wholesalePrice + (wholesalePrice * (percentMarkUp/100));
    }

    public boolean lessThan(Product p) {
        return this.productID < p.productID;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d, Manufacturer's ID: %d, Wholesale Price: $%f, Percent Mark Up: %f percent.",
                productID, manufacturersID, wholesalePrice, percentMarkUp);
    }
}
public class Product {
    int serial, quantity;
    String name, vendor;
    double price;
    Category category;

    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public String getName() {
        return name;
    }
    public Category getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public int getSerial() {
        return serial;
    }
    public String getVendor() {
        return vendor;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

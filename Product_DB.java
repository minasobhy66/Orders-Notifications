import java.util.ArrayList;

public class Product_DB {
    ArrayList<Product> available = new ArrayList<>();
    public void setProductsInfo() {
        for(int i = 0; i < 6; i++){
            Product product = new Product();
            available.add(product);
        }
        for(int i = 0; i < available.size(); i++){
            available.get(i).setSerial(i+1);
        }
        available.get(0).setCategory(Category.MEATS_CHICKEN);
        available.get(0).setName("Angus Beef");
        available.get(0).setPrice(50.99);
        available.get(0).setVendor("<Debut's Beef Farm>");
        available.get(0).setQuantity(50);
        //////
        available.get(1).setCategory(Category.BAKERY);
        available.get(1).setName("Baguette");
        available.get(1).setPrice(1.75);
        available.get(1).setVendor("♥ Fearless Bakery ♥");
        available.get(1).setQuantity(15);
        //////
        available.get(2).setCategory(Category.SNACKS);
        available.get(2).setName("Chips");
        available.get(2).setPrice(1.00);
        available.get(2).setVendor("Speak Chips!");
        available.get(2).setQuantity(150);
        //////
        available.get(3).setCategory(Category.SWEETS);
        available.get(3).setName("Toffee");
        available.get(3).setPrice(0.83);
        available.get(3).setVendor("Red Autumn Co.");
        available.get(3).setQuantity(83);
        //////
        available.get(4).setCategory(Category.BEVERAGES);
        available.get(4).setName("Sparkling Mojito");
        available.get(4).setPrice(3.33);
        available.get(4).setVendor("Paper Airplanes Co. (EST.1989)");
        available.get(4).setQuantity(48);
        //////
        available.get(5).setCategory(Category.HEALTH);
        available.get(5).setName("Conditioner");
        available.get(5).setPrice(12.99);
        available.get(5).setVendor("Cat's 13th reputation");
        available.get(5).setQuantity(24);
        //////
    }

}

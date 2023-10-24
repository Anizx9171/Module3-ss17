package bt.bt1;

import org.w3c.dom.ls.LSOutput;

import java.io.Serializable;

public class Product implements Serializable {
    int productId;
    String productName;
    String productionPlace;
    float price;
    String description;


    public Product(int maxid, String productName, String productionPlace, float price, String description) {
        this.productId = maxid;
        this.productName = productName;
        this.productionPlace = productionPlace;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductionPlace() {
        return productionPlace;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductionPlace(String productionPlace) {
        this.productionPlace = productionPlace;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product: {\n" +
                "productId=" + productId +
                ",\n productName='" + productName + '\'' +
                ",\n productionPlace='" + productionPlace + '\'' +
                ",\n price=" + price +
                ",\n description='" + description + '\'' +
                '}' + "\n";
    }
}

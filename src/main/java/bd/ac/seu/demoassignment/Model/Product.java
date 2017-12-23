package bd.ac.seu.demoassignment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private int productID;
    private String productName;
    private String productPrice;

    public Product() {
    }

    public Product(int productID, String productName, String productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productID=").append(productID);
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", productPrice='").append(productPrice).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package entity;

public class Product {
    private final String productName;

    public Product(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }
}

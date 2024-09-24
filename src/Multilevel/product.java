package Multilevel;

public class product extends Category {
    String productName;

     public product(String brandName, String productName, String categoryName) {
        super(brandName,categoryName);
        this.productName = productName;
    }
    public void displayProduct() {
        System.out.println("Product Name: " + productName);
    }

}


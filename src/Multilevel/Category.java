package Multilevel;

public class Category extends Brand {
    String categoryName;
    Category(String brandName, String categoryName) {
        super(brandName);
        this.categoryName = categoryName;
    }
    public void displayCategory() {
        System.out.println("Category" + categoryName);
    }

}

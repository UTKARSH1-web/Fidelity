import Multilevel.*;

public class Main {
    public static void main(String[] args) {
          Car car = new Car();
          Motorcycle motorcycle = new Motorcycle();

          car.start();
          car.drive();

          motorcycle.start();
          motorcycle.ride();


          product  product = new product("Nike" , "Shoes" , "Air Max");
          product.displayBrand();
        product.displayCategory();
        product.displayProduct();


    }
}
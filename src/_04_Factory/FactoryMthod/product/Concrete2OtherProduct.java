package _04_Factory.FactoryMthod.product;

import _04_Factory.SimpleFactory.Product;

public class Concrete2OtherProduct extends Product {

    @Override
    public void display() {
        System.out.println("concrete2 other product.");
    }

}

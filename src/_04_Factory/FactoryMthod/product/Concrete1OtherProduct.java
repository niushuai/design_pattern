package _04_Factory.FactoryMthod.product;

import _04_Factory.SimpleFactory.Product;

public class Concrete1OtherProduct extends Product {

    @Override
    public void display() {
        System.out.println("concrete1 other product.");
    }

}

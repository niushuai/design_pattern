package _04_Factory.AbstractFactory.product;

import _04_Factory.SimpleFactory.Product;

public class Concrete1Product extends Product {

    @Override
    public void display() {
        System.out.println("concrete1 product.");
    }

}

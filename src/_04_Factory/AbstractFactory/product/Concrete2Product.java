package _04_Factory.AbstractFactory.product;

import _04_Factory.SimpleFactory.Product;

public class Concrete2Product extends Product {

    @Override
    public void display() {
        System.out.println("concrete2 product.");
    }

}

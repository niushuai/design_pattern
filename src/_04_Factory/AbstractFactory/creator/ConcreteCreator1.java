package _04_Factory.AbstractFactory.creator;

import _04_Factory.AbstractFactory.product.Concrete1OtherProduct;
import _04_Factory.AbstractFactory.product.Concrete1Product;
import _04_Factory.SimpleFactory.Product;

public class ConcreteCreator1 extends Creator {

    @Override
    Product createProduct(String type) {
        if (type.equals("concrete1")) {
            return new Concrete1Product();
        } else if (type.equals("concrete1other")) {
            return new Concrete1OtherProduct();
        } else {
            return null;
        }
    }

}

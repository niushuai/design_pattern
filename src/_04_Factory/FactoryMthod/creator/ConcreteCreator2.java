package _04_Factory.FactoryMthod.creator;

import _04_Factory.FactoryMthod.product.Concrete2OtherProduct;
import _04_Factory.FactoryMthod.product.Concrete2Product;
import _04_Factory.SimpleFactory.Product;

public class ConcreteCreator2 extends Creator {

    @Override
    Product createProduct(String type) {
        if (type.equals("concrete2")) {
            return new Concrete2Product();
        } else if (type.equals("concrete2other")) {
            return new Concrete2OtherProduct();
        } else {
            return null;
        }
    }

}

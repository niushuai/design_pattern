package _04_Factory.SimpleFactory;

public class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("expensive")) {
            return new ExpensiveProduct();
        } else {
            return new CheapProduct();
        }
    }
}

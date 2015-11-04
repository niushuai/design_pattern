package _04_Factory.SimpleFactory;

/**
 * 简单工厂多使用静态方法
 * 
 * @author niushuai
 *
 */
public class SimpleFactory {
    public static Product createProduct(String type) {
        // 这里，如果增加产品类型，就需要进行硬编码，违反了“开闭原则”
        if (type.equals("expensive")) {
            return new ExpensiveProduct();
        } else {
            return new CheapProduct();
        }
    }
}

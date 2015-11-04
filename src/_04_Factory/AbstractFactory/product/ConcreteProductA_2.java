package _04_Factory.AbstractFactory.product;

/**
 * 小米的电视
 * 
 * @author niushuai
 *
 */
public class ConcreteProductA_2 extends ProductB {

    @Override
    public void watchTV() {
        System.out.println("小米电视，屌丝也有高清的春天！");
    }

}

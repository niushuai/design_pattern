package _08_Facade;

import _08_Facade.facade.MotherTVFacade;
import _08_Facade.facade.SonTVFacade;

/**
 * 外观模式比较简单，记住它的核心作用是简化操作。<br>
 * 装饰模式的核心作用是添加功能。<br>
 * 适配器模式的核心功能是不改变接口的情况下兼容新的接口。
 * 
 * 
 * @author niushuai
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("妈妈要看电视了...");
        MotherTVFacade mother = new MotherTVFacade();
        mother.watchTV();

        System.out.println();

        System.out.println("儿子要看电视了...");
        SonTVFacade son = new SonTVFacade();
        son.watchTV();
    }
}

package _02_observer.observer;

public class WebSiteObserver extends Observer {

    @Override
    public void display() {
        System.out.println("1024 网站提示您：");
        System.out.println("    温度：" + temperature);
        System.out.println("    湿度：" + humidity);
        System.out.println("    气压：" + pressure);
    }

}

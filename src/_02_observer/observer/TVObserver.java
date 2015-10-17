package _02_observer.observer;

public class TVObserver extends Observer {

    @Override
    public void display() {
        System.out.println("电视预报：");
        System.out.println("    温度：" + temperature);
        System.out.println("    湿度：" + humidity);
        System.out.println("    气压：" + pressure);
    }

}

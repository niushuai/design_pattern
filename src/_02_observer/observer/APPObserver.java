package _02_observer.observer;

public class APPObserver extends Observer {

    @Override
    public void display() {
        System.out.println("APP推送：");
        System.out.println("    温度：" + temperature);
        System.out.println("    湿度：" + humidity);
        System.out.println("    气压：" + pressure);
    }

}

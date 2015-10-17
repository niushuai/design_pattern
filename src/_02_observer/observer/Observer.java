package _02_observer.observer;

public abstract class Observer {

    // 温度
    protected Integer temperature;
    // 湿度
    protected Integer humidity;
    // 气压
    protected Integer pressure;

    public void update(Integer temperature, Integer humidity, Integer pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // Subject 更新以后，观察者要及时推送消息啊.所以这里在更新时候就推送。
        display();
    }

    public abstract void display();
}

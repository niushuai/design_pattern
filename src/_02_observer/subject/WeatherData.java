package _02_observer.subject;

import java.util.ArrayList;
import java.util.List;

import _02_observer.observer.Observer;

public class WeatherData implements Subject {

    // 温度
    private Integer temperature;
    // 湿度
    private Integer humidity;
    // 气压
    private Integer pressure;

    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void addOvserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeOvserver(Observer observer) {
        for (int i = 0; i < observerList.size(); i++) {
            if (observer == observerList.get(i)) {
                observerList.remove(i);
                break;
            }
        }
    }

    @Override
    public void notifyOvservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(temperature, humidity, pressure);
        }
    }

    public void updateWeatherData(Integer temperature, Integer humidity, Integer pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyOvservers();
        System.out.println("\n");
    }

}

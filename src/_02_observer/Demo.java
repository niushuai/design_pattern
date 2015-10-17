package _02_observer;

import _02_observer.observer.APPObserver;
import _02_observer.observer.NewAPPObserver;
import _02_observer.observer.Observer;
import _02_observer.observer.TVObserver;
import _02_observer.observer.WebSiteObserver;
import _02_observer.subject.WeatherData;

public class Demo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer tv = new TVObserver();
        Observer app = new APPObserver();
        Observer website = new WebSiteObserver();

        weatherData.addOvserver(tv);
        weatherData.addOvserver(app);
        weatherData.addOvserver(website);

        weatherData.updateWeatherData(25, 10, 5);

        weatherData.updateWeatherData(10, 12, 15);

        Observer newapp = new NewAPPObserver();
        weatherData.addOvserver(newapp);

        weatherData.updateWeatherData(35, 6, 2);

    }
}

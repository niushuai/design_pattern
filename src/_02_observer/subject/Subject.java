package _02_Observer.subject;

import _02_Observer.observer.Observer;

public interface Subject {

    public void addOvserver(Observer observer);

    public void removeOvserver(Observer observer);

    public void notifyOvservers();
}

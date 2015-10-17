package _02_observer.subject;

import _02_observer.observer.Observer;

public interface Subject {

    public void addOvserver(Observer observer);

    public void removeOvserver(Observer observer);

    public void notifyOvservers();
}

package com.yxy.gitsubmodule.module.observer;

//抽象被观察者
public interface Subject {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String str);
}

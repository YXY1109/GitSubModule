package com.yxy.gitsubmodule.module.observer;

//具体观察者
public class ConcreteObserver implements Observer {
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}

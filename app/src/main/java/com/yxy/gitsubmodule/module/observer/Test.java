package com.yxy.gitsubmodule.module.observer;

public class Test {
    public static void main(String[] args) {
        //一个主题
        ConcreteSubject subject = new ConcreteSubject();

        //两个观察者
        ConcreteObserver per1 = new ConcreteObserver();
        ConcreteObserver per2 = new ConcreteObserver();

        //观察者订阅主题
        subject.addObserver(per1);
        subject.addObserver(per2);

        //通知开饭了
        subject.notifyObservers("干活干活了");
    }
}

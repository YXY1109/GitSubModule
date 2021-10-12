package com.yxy.gitsubmodule.module;

import com.google.android.exoplayer2.metadata.id3.InternalFrame;

/**
 * 参考文章：https://github.com/helen-x/AndroidInterview/blob/master/android/Android%20%E6%BA%90%E7%A0%81%E4%B8%AD%E7%9A%84%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F(%E4%BD%A0%E9%9C%80%E8%A6%81%E7%9F%A5%E9%81%93%E7%9A%84%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E5%85%A8%E5%9C%A8%E8%BF%99%E9%87%8C).md
 * <p>
 * <p>
 * 单例
 * 建造者
 * 工厂：工厂方法，抽象工厂
 * 适配器
 * 观察者
 * <p>
 * 责任链
 * 备忘录
 * 策略
 * 模版
 * 解释器
 * 状态
 * 命令
 * 迭代
 * 组合
 **/

//单例模式
public class Singleton {
    private volatile static Singleton instance;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

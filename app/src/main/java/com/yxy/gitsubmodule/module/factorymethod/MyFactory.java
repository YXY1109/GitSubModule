package com.yxy.gitsubmodule.module.factorymethod;

//工厂方法模式
public class MyFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

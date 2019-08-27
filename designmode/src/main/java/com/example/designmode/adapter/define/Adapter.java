package com.example.designmode.adapter.define;

/**
 * 适配器模式的核心角色，其他两个角色都是已经存在的角色，而适配器角色是需要新建
 * 立的，它的职责非常简单：把源角色转换为目标角色，怎么转换？通过继承或是类关联的方
 * 式。
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        doSomething();

    }
}

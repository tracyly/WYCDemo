package com.example.designmode.strategy;

/**
 * 它也叫做上下文角色，起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，
 * 封装可能存在的变化。
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}

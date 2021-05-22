package com.atguigu.demoreactor8.reactor8;

import java.util.Observable;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/22-15:49
 */

public class ObserveDemo  extends Observable {

    public static void main(String[] args) {
        ObserveDemo observer = new ObserveDemo();
        //添加观察者
        observer.addObserver((o,arg)->{
            System.out.println("发生变化");
        });
        observer.addObserver((o,arg)->{
            System.out.println("手动被观察者通知, 准备改变");
        });
        observer.setChanged();//数据变化
        observer.notifyObservers();//通知
    }
}

package com.example.beetl_test1.service.Duck.DuckImpl;

import com.example.beetl_test1.service.Duck.Duck;
import com.example.beetl_test1.service.Duck.behaveior.fly.FlyWithWings;
import com.example.beetl_test1.service.Duck.behaveior.quack.Quack;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:07
 */
public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I im a MallardDuck");
  }
}

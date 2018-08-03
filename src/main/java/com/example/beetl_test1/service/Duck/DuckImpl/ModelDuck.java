package com.example.beetl_test1.service.Duck.DuckImpl;

import com.example.beetl_test1.service.Duck.Duck;
import com.example.beetl_test1.service.Duck.behaveior.fly.FlyNoWay;
import com.example.beetl_test1.service.Duck.behaveior.quack.Quack;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:14
 */
public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I im model duck");
  }
}

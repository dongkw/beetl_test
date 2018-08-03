package com.example.beetl_test1.service.Duck.test;

import com.example.beetl_test1.service.Duck.Duck;
import com.example.beetl_test1.service.Duck.DuckImpl.MallardDuck;
import com.example.beetl_test1.service.Duck.DuckImpl.ModelDuck;
import com.example.beetl_test1.service.Duck.behaveior.fly.FlyRocketPowerd;
import com.example.beetl_test1.service.Duck.DuckCall;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:13
 */
public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly();
    model.performQuack();
    model.setFlyBehavior(new FlyRocketPowerd());
    model.performFly();

    DuckCall duckCall = new DuckCall();
    duckCall.call();
  }
}

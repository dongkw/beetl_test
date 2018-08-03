package com.example.beetl_test1.service.Duck.behaveior.fly;

import com.example.beetl_test1.service.Duck.behaveior.FlyBehavior;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午3:57
 */
public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can not fly");
  }
}

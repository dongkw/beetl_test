package com.example.beetl_test1.service.Duck.behaveior.quack;

import com.example.beetl_test1.service.Duck.behaveior.QuackBehavior;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午3:59
 */
public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}

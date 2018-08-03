package com.example.beetl_test1.service.Duck;

import com.example.beetl_test1.service.Duck.behaveior.QuackBehavior;
import com.example.beetl_test1.service.Duck.behaveior.quack.Quack;
import com.example.beetl_test1.service.Duck.behaveior.quack.Squeak;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午4:26
 */
public class DuckCall {

  QuackBehavior quackBehavior = new Squeak();

  public void call() {
    quackBehavior.quack();
  }
}

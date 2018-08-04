package com.example.beetl_test1.service.coffee.condiment.impl;

import com.example.beetl_test1.service.coffee.beverage.Beverage;
import com.example.beetl_test1.service.coffee.condiment.CondimentDecorator;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:29
 */
public class Mocha extends CondimentDecorator {

  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ",Mocha";
  }

  @Override
  public double cost() {
    return 0.2 + beverage.cost();
  }
}

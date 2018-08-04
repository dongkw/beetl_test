package com.example.beetl_test1.service.coffee.beverage.impl;

import com.example.beetl_test1.service.coffee.beverage.Beverage;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:25
 */
public class Espresso extends Beverage {

  public Espresso() {
    setDescription("Espresso");
  }

  @Override
  public double cost() {
    return 9.9;
  }
}

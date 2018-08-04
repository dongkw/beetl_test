package com.example.beetl_test1.service.coffee.beverage.impl;

import com.example.beetl_test1.service.coffee.beverage.Beverage;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:28
 */
public class HouseBlend extends Beverage {

  public HouseBlend() {
    setDescription("House Blend");
  }

  @Override
  public double cost() {
    return 8.8;
  }
}

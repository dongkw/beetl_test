package com.example.beetl_test1.service.coffee.beverage;

import lombok.Data;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:20
 */
@Data
public abstract class Beverage {

  private String description = "Unknown Beverage";

  public abstract double cost();
}

package com.example.beetl_test1.service.coffee.test;

import com.example.beetl_test1.service.coffee.beverage.Beverage;
import com.example.beetl_test1.service.coffee.beverage.BeverageEnum;
import com.example.beetl_test1.service.coffee.beverage.impl.Espresso;
import com.example.beetl_test1.service.coffee.beverage.impl.HouseBlend;
import com.example.beetl_test1.service.coffee.condiment.impl.Mocha;
import com.example.beetl_test1.service.coffee.condiment.impl.Soy;
import com.example.beetl_test1.service.coffee.condiment.impl.Whip;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/4 上午10:36
 */
public class StartBuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    beverage.setSize(BeverageEnum.GRANDE);
    System.out.println(beverage.getSize() + beverage.getDescription() + " $ " + beverage.cost());

    Beverage beverage1 = new HouseBlend();
    beverage1.setSize(BeverageEnum.VENTI);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Soy(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());

  }
}

package com.example.beetl_test1.service.pizza.storeFactory.impl;

import com.example.beetl_test1.service.pizza.PizzaStore;
import com.example.beetl_test1.service.pizza.ingredientFactory.PizzaIngredientFactory;
import com.example.beetl_test1.service.pizza.ingredientFactory.impl.NYPizzaIngredientFactory;
import com.example.beetl_test1.service.pizza.pizzaEntity.Pizza;
import com.example.beetl_test1.service.pizza.pizzaEntity.impl.CheesePizza;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/6 下午4:32
 */
public class NYPizzaStore extends PizzaStore {

  PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

  @Override
  public Pizza createPizza(String type) {
    switch (type) {
      case "cheese":
        return new CheesePizza(factory);
      default:
        return null;
    }

  }
}

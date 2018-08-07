package com.example.beetl_test1.service.pizza.ingredientFactory.impl;

import com.example.beetl_test1.service.pizza.ingredientFactory.PizzaIngredientFactory;
import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.Cheese;
import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.Dough;
import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.Sauce;
import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.impl.MarinaraSauce;
import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.impl.ReggianoCheese;
import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.impl.ThinCrustDough;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/7 上午11:17
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }
}

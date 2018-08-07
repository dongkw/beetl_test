package com.example.beetl_test1.service.pizza.ingredientFactory;

import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.Cheese;
import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.Dough;
import com.example.beetl_test1.service.pizza.ingredientFactory.ingredient.Sauce;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/7 上午10:26
 */
public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();
}

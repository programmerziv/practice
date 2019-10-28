package com.ziv.builder.c;

/**
 * <p>title:MealBuilder </p>
 * <p>package: com.ziv.builder.c</p>
 * <p>description:菜单建造类 (可以自由组合套餐)</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 9:13
 */
public class MealBuilder {

    /**
     * 蔬菜套餐
     * @return
     */
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 鸡肉套餐
     * @return
     */
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

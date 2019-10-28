package com.ziv.builder;

import com.ziv.builder.c.Meal;
import com.ziv.builder.c.MealBuilder;

/**
 * <p>title: BuilderDemoMain</p>
 * <p>package: com.ziv.builder</p>
 * <p>description:builderde的Main方法 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 9:18
 */
public class BuilderDemoMain {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}

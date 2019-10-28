package com.ziv.builder.c;

import com.ziv.builder.i.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>title:Meal </p>
 * <p>package: com.ziv.builder.c</p>
 * <p>description: 菜单类</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/28 9:06
 */
public class Meal {

    /**
     * 菜单
     */
    private List<Item> items = new ArrayList<Item>(10);

    /**
     * 向菜单添加商品
     * @param item
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 总钱数
     * @return
     */
    public Float getCost(){
        Float cost = 0.0F;
        for(Item item:items){
            cost += item.price();
        }
        return cost;
    }

    /**
     * 展示
     */
    public void showItems(){
        for(Item item:items){
            System.out.print("Item:" + item.name());
            System.out.print(",Packing:" + item.packing().pack());
            System.out.print(",Price:" + item.price());
            System.out.print("\n");
        }
    }
}

package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public int getTotalCookingTime() {
        int timecooking = 0;
        for (Dish d : dishes) {
            timecooking += d.getDuration();
        }
        return timecooking;
    }

    public boolean isEmpty(){
        if (dishes.isEmpty()) return true;
        return false;
    }

    @Override
    public String toString() {
        if (dishes == null) return "";
        else
            return "Your order: " + dishes + " of " + tablet.toString() + ", cooking time " + getTotalCookingTime() + "min";
    }
}

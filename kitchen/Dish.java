package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    FISH,
    STEAK,
    SOUP,
    JUICE,
    WATER;

    public static String allDishesToString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Dish o : Dish.values()) {
            stringBuilder.append(o + " ");
        }
        return stringBuilder.toString();
    }
}

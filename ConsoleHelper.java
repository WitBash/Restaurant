package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        writeMessage("Сделайте заказ, для окончания введите exit");
        writeMessage(Dish.allDishesToString());
        String dish = "";
        List<Dish> dishesOrder = new ArrayList<>();
        Dish[] allDishesInMenu = Dish.values();
        while (!((dish = readString()).equals("exit"))) {
            int count = 0;
            for (int i = 0; i < allDishesInMenu.length; i++) {
                if (allDishesInMenu[i].toString().equals(dish)) count++;
            }
            if (count == 0) {
                writeMessage("Данное блюдо не представлено в меню ресторана");
                continue;
            } else {
                for (Dish o : Dish.values()) {
                    if (o.toString().equals(dish)) dishesOrder.add(o);
                }
            }
        }
        return dishesOrder;
    }
}

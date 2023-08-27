package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product(null, "ProductBrand", 200);
        double d = product2.getPrice();
        System.out.println(d);
        product2.setPrice(400);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("");
        System.out.println(product3.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("Вода", "ООО Источник", 250, 2);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("Молоко", "ООО Молоко", 250, 1, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Вода", "ООО Источник", 250, 1);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater3 = new BottleOfWater("Вода", "ООО Источник", 250, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater4 = new BottleOfWater("Вода", "ООО Источник", 250, 0.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Молоко", "ООО Молоко", 250, 1, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product aceCream1 = new AceCream("Гост", "ООО Холодок", 60, 70);
        System.out.println(aceCream1.displayInfo());

        Product aceCream2 = new AceCream("Alpen Gold", "Alpen Gold", 90, 100);
        System.out.println(aceCream2.displayInfo());

        Product aceCream3 = new AceCream("Чистая линия", "ООО Холодок", 80, 80);
        System.out.println(aceCream3.displayInfo());

        Product cocktail11 = new Cocktail("Shake", "Shake", 120, "Orange");
        System.out.println(cocktail11.displayInfo());

        Product cocktail12 = new Cocktail("Мохито", "OOO Вкус", 150, "Мята");
        System.out.println(cocktail12.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(aceCream1);
        products.add(aceCream2);
        products.add(aceCream3);
        products.add(cocktail11);
        products.add(cocktail12);
        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Вода", 1.5);
        if (bottleOfWater != null) {
            System.out.print("Вы купили: ");
            System.out.println(bottleOfWater.displayInfo());
        } else {
            System.out.println("Тако воды нет в автомате.");
        }
        VendingMachine vendingMachine1 = new VendingMachine(products);
        BottleOfMilk bottleOfMilk = vendingMachine1.getBottleOfMilk("Молоко", 1);
        if (bottleOfWater != null) {
            System.out.print("Вы купили: ");
            System.out.println(bottleOfMilk.displayInfo());
        } else {
            System.out.println("Такого Молока нет в автомате.");
        }
        VendingMachine vendingMachine3 = new VendingMachine(products);
        AceCream aceCream = vendingMachine3.getAceCream("Гост", "ООО Холодок");
        if (aceCream != null) {
            System.out.print("Вы купили: ");
            System.out.println(aceCream.displayInfo());
        } else {
            System.out.println("Такого Мороженного нет в автомате.");
        }
        VendingMachine vendingMachine4 = new VendingMachine(products);
        Cocktail cocktail = vendingMachine4.getCocktail("Мохито", "Мята");
        if (cocktail != null) {
            System.out.print("Вы купили: ");
            System.out.println(cocktail.displayInfo());
        } else {
            System.out.println("Такого Коктеля нет в автомате");
        }
    }
}




package ru.geekbrains.lesson1;

public class Cocktail extends Product {
    private String taste;// вкус

    public String getTaste() {
        return taste;
    }

    public Cocktail(String name, String brand, double price, String taste) {
        super(name, brand, price);
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("[Коктель] %s - %s - %.2f - t: %s", name, brand, price, taste);
    }
}

package ru.geekbrains.lesson1;

public class AceCream extends Product {
        private  double weight;//Вес

    public double getWeight() {
        return weight;
    }
    public AceCream(String name, String brand, double price, double weight){
        super(name, brand, price);
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Мороженное] %s - %s - %.2f - w: %.2f", name, brand, price, weight);
    }
}

package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
               this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;// преобразование продукта к бутылке с водой
                if (product.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;// если не нашли нужную бутылку с водой
    }
    public BottleOfMilk getBottleOfMilk(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (product.getName().equals(name) && bottleOfMilk.getVolume() == volume){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }
    public AceCream getAceCream(String name, String brand){
        for (Product product : products){
            if (product instanceof AceCream){
                AceCream aceCream = (AceCream)product;
                if (product.getName().equals(name) && aceCream.getBrand() == brand){
                    return aceCream;
                }
            }
        }
        return null;
    }
    public Cocktail getCocktail(String name, String taste){
        for (Product product : products){
            if (product instanceof Cocktail){
                Cocktail cocktail = (Cocktail)product;
                if (product.getName().equals(name) && cocktail.getTaste() == taste){
                    return cocktail;
                }
            }
        }
        return null;
    }
}

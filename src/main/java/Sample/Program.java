package Sample;

import ru.geekbrains.lesson1.Product;

public class Program {

    public static void main(String[] args) {
        Product product2 = new Product("ProductName2", "ProductBrand", 200);
        //product2.name = "A";
        //product2.price = -300;
        System.out.println(product2.displayInfo());
    }

}

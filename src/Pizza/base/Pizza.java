package Pizza.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private static List<Topping> toppings = new ArrayList<>();

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.

    public enum PizzaSize {
        SMALL, MEDIUM, LARGE
    }

    private PizzaSize size;

    public Pizza(String name, double price, PizzaSize size, Topping... toppings) {
        this.name = name;
        this.size = size;
        this.toppings.addAll(Arrays.asList(toppings));

        // Calcular el precio según el tamaño
        switch (size) {
            case MEDIUM:
                this.price = price * 1.2; // Aumento del 20% para tamaño mediano
                break;
            case LARGE:
                this.price = price * 1.35; // Aumento del 35% para tamaño grande
                break;
            default:
                this.price = price; // Tamaño pequeño (precio base)
                break;
        }

        // Sumar el precio de los toppings al precio base
        for (Topping topping : toppings) {
            this.price += topping.getPrecio();
        }
    }




    public void getCost(){
        double cost = this.price;

System.out.println("El costo de la pizza es: " + cost);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", price=" + price + ", toppings=" + toppings + '}';
    }


    public void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The Pizza is ready!");
    }
}

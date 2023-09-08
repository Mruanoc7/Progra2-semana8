import Pizza.base.*;
import Pizza.especialidades.*;
import Pizza.interfaces.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaMargarita();
        pizza1.prepare();
        pizza1.getCost();

        Pizza pizza2 = new PizzaPepperoni();
        pizza2.prepare();
        pizza2.getCost();

        Pizza pizza3 = new PizzaVegetariana();
        pizza3.prepare();
        pizza3.getCost();

        Pizza pizza4 = new PizzaHawaiana();
        pizza4.prepare();
        pizza4.getCost();



    }
}

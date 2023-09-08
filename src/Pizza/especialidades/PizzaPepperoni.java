package Pizza.especialidades;

import Pizza.base.Pizza;
import Pizza.base.Topping;

public class PizzaPepperoni extends Pizza {
    public PizzaPepperoni() {
        super("Pizza Pepperoni", 10.0, Pizza.PizzaSize.MEDIUM, new Topping("Queso", 1.0), new Topping("Pepperoni", 2.0));
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Agregando pepperoni...");
    }
}
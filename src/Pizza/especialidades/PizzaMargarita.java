package Pizza.especialidades;

import Pizza.base.Pizza;
import Pizza.base.Topping;

public class PizzaMargarita extends Pizza {
    public PizzaMargarita() {
        super("Pizza Margarita", 8.0, Pizza.PizzaSize.SMALL, new Topping("Queso", 1.0), new Topping("Albahaca", 0.5));
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Agregando albahaca...");
    }
}

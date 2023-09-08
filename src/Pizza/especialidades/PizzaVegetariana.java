package Pizza.especialidades;
import Pizza.base.Pizza;
import Pizza.base.Topping;
public class PizzaVegetariana extends Pizza{
    public PizzaVegetariana() {
        super("Pizza Vegetariana", 10.0, PizzaSize.SMALL, new Topping("Queso", 1.0), new Topping("Jalapeño", 2.0));
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Agregando Jalapeño...");
    }
}

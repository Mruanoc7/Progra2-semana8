package Pizza.especialidades;
import Pizza.base.Pizza;
import Pizza.base.Topping;
public class PizzaHawaiana extends Pizza{
    public PizzaHawaiana() {
        super("Pizza Hawaiana", 10.0, PizzaSize.MEDIUM, new Topping("Queso", 1.0), new Topping("Piña", 2.0));
    }
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Agregando albahaca...");
    }
}

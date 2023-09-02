package Pizza.especialidades;
import Pizza.base.*;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public PizzaItaliana(String name, double price, String salsa, Topping... toppings){
        super(name, price, toppings);
        this.salsa = salsa;
    }
}

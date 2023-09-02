    import Pizza.base.*;
    import Pizza.especialidades.PizzaItaliana;
    import Pizza.interfaces.*;

    public class Main {
        public static void main(String[] args) {
            Topping pepperoni = new Topping("Pepperoni", 2.0);
            Topping champiñones = new Topping("Champiñones", 1.5);

            Pizza pizza = new Pizza("Pizza de Pepperoni y Champiñones", 0, pepperoni, champiñones);

            pizza.prepare();

            // Obtener el costo de la pizza
            pizza.getCost();


        }
    }

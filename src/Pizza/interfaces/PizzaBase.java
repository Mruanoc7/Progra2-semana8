package Pizza.interfaces;

public class PizzaBase implements IPreparable{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PizzaBase(String n, double p){
        this.name = n;
        this.price = p;
    }
    @Override
    public void prepare() {
        System.out.println("Preparando pizza " + this.name);
    }
}

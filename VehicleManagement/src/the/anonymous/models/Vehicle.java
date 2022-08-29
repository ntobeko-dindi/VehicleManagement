package the.anonymous.models;
/**
 *
 * @author ntobeko dindi
 */
public class Vehicle {
    private String Make, model, color;
    private double price;

    public Vehicle(String Make, String model, String color, double price) {
        this.Make = Make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

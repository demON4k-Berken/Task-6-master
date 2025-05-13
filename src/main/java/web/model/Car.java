package web.model;

public class Car {
    private String model;
    private int yearProd;
    private String color;

    public Car() {
    }

    public Car(String model, int yearProd, String color) {
        this.model = model;
        this.yearProd = yearProd;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearProd() {
        return yearProd;
    }

    public void setYearProd(int yearProd) {
        this.yearProd = yearProd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return model + " " +
                yearProd + " " +
                color;
    }
}

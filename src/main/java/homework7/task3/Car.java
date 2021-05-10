package homework7.task3;

public class Car {
    public String model;
    protected int price;
    private boolean works;
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isWorks() {
        return works;
    }

    public void setWorks(boolean works) {
        this.works = works;
    }

    public Car(String model, int price, boolean works, String color) {
        this.model = model;
        this.price = price;
        this.works = works;
        this.color = color;
    }
}

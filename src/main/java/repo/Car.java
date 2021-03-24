package repo;

public abstract class Car {
    protected String color;
    public abstract void setColor();

    public void getColor() {
        System.out.println("car color:"+ color);
    }
}

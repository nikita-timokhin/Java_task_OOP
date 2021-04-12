package Java_task_OOP.Figures;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return color;
    }

    public Circle() {
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}


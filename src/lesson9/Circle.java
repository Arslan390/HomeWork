package lesson9;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {

        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Площадь круга равна %.2f см%s, " +
                "или %.2f м%s.\n", area, "\u00B2", area * 0.01, "\u00B2");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
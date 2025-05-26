package lesson9;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public void calculateArea() {
        double area = (base * height) / 2;
        System.out.printf("Площадь треугольника равна %.2f см%s, " +
                "или %.2f м%s.\n", area, "\u00B2", area * 0.01, "\u00B2");

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
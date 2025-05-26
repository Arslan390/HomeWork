package lesson9;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void calculateArea() {
        double area = width * length;
        System.out.printf("Площадь прямоугольника равна %.2f см%s, " +
                "или %.2f м%s.\n", area, "\u00B2", area * 0.01, "\u00B2");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
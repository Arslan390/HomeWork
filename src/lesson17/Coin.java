package lesson17;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private int nominal;
    private int year;
    private String metalName;
    private double diameter;

    public Coin(int nominal, int year, String metalName, double diameter) {
        this.nominal = nominal;
        this.year = year;
        this.metalName = metalName;
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diameter, coin.diameter) == 0 && Objects.equals(metalName, coin.metalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, metalName, diameter);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", metalName='" + metalName + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if (this.nominal != o.nominal){
            return o.nominal - this.nominal;
        }
        if (this.year != o.year) {
            return this.year - o.year;
        }
        if (!this.metalName.equals(o.metalName)) {
            return this.metalName.compareTo(o.metalName);
        }
        return Double.compare(this.diameter, o.diameter);
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMetalName() {
        return metalName;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

package lesson21.hw;

import java.util.Objects;

public class Tourist {
    private String name;
    private int age;
    private String city;
    private boolean payment;
    private Integer seatNumber;

    public Tourist(String name, int age, String city, boolean payment) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }
    public Integer getSeatNumber() {
        return seatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tourist that = (Tourist) o;
        return age == that.age && payment == that.payment && Objects.equals(name, that.name) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city, payment);
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", payment=" + payment +
                ", seatNumber=" + seatNumber +
                '}';
    }
}

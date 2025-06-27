package lesson21.hw.function;

import java.util.Objects;

public class ShortTourist {
    private String name;
    private boolean payment;

    public ShortTourist(String name, boolean payment) {
        this.name = name;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortTourist that = (ShortTourist) o;
        return payment == that.payment && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, payment);
    }

    @Override
    public String toString() {
        return "ShortTourist{" +
                "name='" + name + '\'' +
                ", payment=" + payment +
                '}';
    }
}

package lesson22;

import java.util.Objects;

public class Student {
    private int course;
    private String country;
    private String name;
    private int age;

    public Student(String name, int course, int age,  String country) {
        this.course = course;
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && age == student.age && Objects.equals(country, student.country) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, country, name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

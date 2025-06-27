package lesson19.recursion;

public class RecursionExample {
    public static void main(String[] args) {
        Matreshka smallest = new Matreshka("Маленькая", null);
        Matreshka medium = new Matreshka("Средняя", smallest);
        Matreshka largest = new Matreshka("Большая", medium);

        largest.unpack();
    }
}

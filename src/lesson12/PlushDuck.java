package lesson12;

public class PlushDuck extends Duck implements Swimmable, Quackable {
    public PlushDuck(String name, Enum<Color> color) {
        super(name, color);
    }

    @Override
    public void TellMeAboutYourself() {
        System.out.printf("Я %s утенок %s, и я плюшевая игрушка. \n", color.getRussianColor(), getName());
    }

    @Override
    public void quack() {
        System.out.println("Кря-кря (плюшевый звук).");
    }

    @Override
    public void swim() {
        System.out.printf("Я плюшевая утка %s, и я плаваю. \n", getName());
    }
}

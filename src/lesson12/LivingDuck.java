package lesson12;

public class LivingDuck extends Duck implements Flyable, Quackable, Replicable, Swimmable {

    public LivingDuck(String name, Enum<Color> color) {
        super(name, color);
    }

    @Override
    public void TellMeAboutYourself() {
        System.out.printf("Я %s утенок %s, и я живой. \n", color.getRussianColor(), getName());
    }

    @Override
    public void fly() {
        System.out.printf("Я живая утка %s и я умею летать. \n", getName());
    }

    @Override
    public void quack() {
        System.out.println("Кря-кря.");
    }

    @Override
    public void reproduce() {
        System.out.println("Я живая утка и я способна размножаться.");
    }

    @Override
    public void swim() {
        System.out.printf("Я живая утка %s, я очень хорошо плаваю \n", getName());
    }
}

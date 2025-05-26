package lesson12;

public class RubberDuck extends Duck implements Swimmable {
    public RubberDuck(String name, Enum<Color> color) {
        super(name, color);
    }

    @Override
    public void TellMeAboutYourself() {
        System.out.printf("Я %s утенок %s, и я резиновая игрушка. \n", color.getRussianColor(), getName());
    }

    @Override
    public void swim() {
        System.out.printf("Я резиновый утенок %s, я очень хорошо плаваю. \n", getName());
    }
}

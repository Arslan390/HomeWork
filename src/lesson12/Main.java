package lesson12;

public class Main {
    public static void main(String[] args) {
        Duck livingDuck = new LivingDuck("Утяша", Color.WHITE);
        Duck plushDuck = new PlushDuck("Сэнди", Color.PURPLE);
        Duck rubberDuck = new RubberDuck("Чуча", Color.YELLOW);

        Duck[] ducks = {livingDuck, plushDuck, rubberDuck};

        for (Duck duck : ducks) {
            duck.TellMeAboutYourself();

            if (duck instanceof Quackable quackableDuck) {
                quackableDuck.quack();
            }
            if (duck instanceof Flyable flyableDuck) {
                flyableDuck.fly();
            }

            if (duck instanceof Swimmable swimmableDuck) {
                swimmableDuck.swim();
            }
            if (duck instanceof Replicable replicableDuck) {
                replicableDuck.reproduce();
            }
            System.out.println();
        }
    }
}

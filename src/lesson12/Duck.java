package lesson12;

public abstract class Duck {
    private String name;
    protected Color color;

    public Duck(String name, Enum<Color> color) {
        this.name = name;
        this.color = (Color) color;
    }

    public abstract void TellMeAboutYourself();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum<Color> getColor() {
        return color;
    }
}

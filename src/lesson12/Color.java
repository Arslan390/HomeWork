package lesson12;

public enum Color {
    RED("Красный"),
    GREEN("Зелёный"),
    BLUE("Синий"),
    YELLOW("Жёлтый"),
    ORANGE("Оранжевый"),
    PURPLE("Фиолетовый"),
    BLACK("Чёрный"),
    WHITE("Белый");

    private final String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }
}

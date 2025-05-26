package lesson10;

//Дилер
public class Dealer extends Player {

    public Dealer() {
        super("Дилер");
    }

    @Override
    public boolean doYouNeedMoreCards() {
        return super.countNominalInHand() < 17;
    }
}

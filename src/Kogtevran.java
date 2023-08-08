public class Kogtevran extends Hogwarts {
    private int wise;
    private int witty;
    private int creative;

    public Kogtevran(String name, String surname, int power, int transgressiya, int wise, int witty, int creative) {
        super(name, surname, power, transgressiya);
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    @Override
    public String toString() {
        return super.toString() + "ученик Kogtevranа" +
                " | ум " + wise +
                " | мудрость " + witty +
                " | творчество" + creative +
                " ";
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }
}

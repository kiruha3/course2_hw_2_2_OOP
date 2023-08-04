public class Kogtevran extends hogwarts {
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
        return "Kogtevran{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                "} " + super.toString();
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

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}

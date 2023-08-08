public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int power, int transgressiya, int nobility, int honor, int bravery) {
        super(name, surname, power, transgressiya);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString()+ "ученик Griffindorа " +
                " Блогородство " + getNobility() +
                " | Честь " + getHonor() +
                " | Храбрость " + getBravery() +
                " " ;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}

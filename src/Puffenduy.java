public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String name, String surname, int power, int transgressiya, int hardworking, int loyal, int honest) {
        super(name, surname, power, transgressiya);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() + "ученик Puffenduyя " +
                " | Трудолюбие " + hardworking +
                " | Верность " + loyal +
                " | Честность" + honest +
                " ";
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

}
public class Puffenduy extends Hogwarts {
    private int hardworking;
    private  int loyal;
    private int honest;
    public Puffenduy(String name, String surname, int power, int transgressiya, int hardworking, int loyal, int honest){
        super(name,surname,power,transgressiya);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString()+ "ученик Puffenduyя " +
                " | Трудолюбие " + hardworking +
                " | Верность " + loyal +
                " | Честность" + honest +
                " " ;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
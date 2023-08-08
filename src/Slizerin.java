
public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slizerin(String name, String surname, int power, int transgressiya, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(name, surname, power, transgressiya);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;//находичивость
        this.authority = authority;//жажда власти
    }

    @Override
    public String toString() {
        return super.toString() + "ученик Slizeriinа " +
                " | Хитрость " + cunning +
                " | Решительность " + determination +
                " | Амбициозность " + ambition +
                " | Находчивость " + resourcefulness +
                " | Жажда власти " + authority +
                " ";
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

}
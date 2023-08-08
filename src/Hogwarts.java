

public abstract class Hogwarts {
    private String name;
    private String surname;
    private int power;
    private int transgressiya;

    public Hogwarts(String name, String surname, int power, int transgressiya) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.transgressiya = transgressiya;
    }
    abstract public int sumFeatures();

    @Override
    public String toString() {
        return "Ученик hogwartsа " +
                "Имя " + getName() +
                " Фамилия " + getSurname() +
                " | Сила " + getPower() +
                " | Дальность трансгрессии " + getTransgressiya() + "  ";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public int getPower() {
        return power;
    }


    public int getTransgressiya() {
        return transgressiya;
    }

}

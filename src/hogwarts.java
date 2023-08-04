

public class hogwarts {
    private String name;
    private String surname;
    private int power;
    private int transgressiya;

    public hogwarts(String name, String surname, int power, int transgressiya) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.transgressiya = transgressiya;
    }

    @Override
    public String toString() {
        return "hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", power=" + power +
                ", transgressiya=" + transgressiya +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgressiya() {
        return transgressiya;
    }

    public void setTransgressiya(int transgressiya) {
        this.transgressiya = transgressiya;
    }
}

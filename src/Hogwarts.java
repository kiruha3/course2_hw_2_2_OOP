

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

    private void compareOtherFacultetStudent(Hogwarts student) {
        int sumThis = sumFeatures();
        int summStudent = student.sumFeatures();
        if (sumThis > summStudent) {
            System.out.println("Больше очков у студента " + this.getName() + " " + this.getSurname() + " " + sumThis + " ");
        } else {
            if (sumThis == summStudent) {
                System.out.println("Равны по силе суммы доп статов " + this.getName() + " " + this.getSurname() + " " + sumThis + " и "
                        + student.getName() + " " + student.getSurname() + " " + summStudent + " ");
            } else {
                System.out.println("Больше очков у студента " + student.getName() + " " + student.getSurname() + " " + summStudent + " ");
            }
        }
    }

    private void compareGeneralStudent(Hogwarts student) {
        int sumThis = this.power + this.transgressiya;
        int summStudent = student.power + student.transgressiya;
        if (sumThis > summStudent) {
            System.out.println("Больше очков у студента " + this.getName() + " " + this.getSurname() + " " + sumThis + " ");
        } else {
            if (sumThis == summStudent) {
                System.out.println("Равны по силе суммы основных статов" + this.getName() + " " + this.getSurname() + " " + sumThis + " и "
                        + student.getName() + " " + student.getSurname() + " " + summStudent + " ");
            } else {
                System.out.println("Больше очков у студента " + student.getName() + " " + student.getSurname() + " " + summStudent + " ");
            }
        }
    }
    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareOtherFacultetStudent(hogwarts);
        } else {
            compareGeneralStudent(hogwarts);
        }
    }

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

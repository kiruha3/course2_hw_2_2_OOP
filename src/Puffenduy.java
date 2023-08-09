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
    public int sumFeatures() {
        return hardworking+loyal+honest;
    }
    public void compareStudent(Puffenduy student) {
        int sumThis = sumFeatures();
        int summStudent = student.getHardworking() + student.getLoyal() + student.getHonest();
        if (sumThis > summStudent) {
            System.out.println("Больше очков у студента " + this.getName() + " " + this.getSurname() + " " + sumThis + " ");
        } else {
            if (sumThis == summStudent) {
                System.out.println("Равны по силе суммы доп статов Гриффиндора " + this.getName() + " " + this.getSurname() + " " + sumThis + " и "
                        + student.getName() + " " + student.getSurname() + " " + summStudent + " ");
            } else {
                System.out.println("Больше очков у студента " + student.getName() + " " + student.getSurname() + " " + summStudent + " ");
            }
        }
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
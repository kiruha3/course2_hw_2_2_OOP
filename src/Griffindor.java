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
    public int sumFeatures() {
        return nobility + honor + bravery;
    }
    public void compareStudent(Griffindor student) {
        int sumThis = sumFeatures();
        int summStudent = student.getNobility() + student.getHonor() + student.getBravery();
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
        return super.toString() + "ученик Griffindorа " +
                " Блогородство " + getNobility() +
                " | Честь " + getHonor() +
                " | Храбрость " + getBravery() +
                " ";
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

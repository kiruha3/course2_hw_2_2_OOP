public class Kogtevran extends Hogwarts {
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
    public int sumFeatures() {
        return wise + witty + creative;
    }
    public void compareStudent(Kogtevran student) {
        int sumThis = sumFeatures();
        int summStudent = student.getWise() + student.getWitty() + student.getCreative();
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
        return super.toString() + "ученик Kogtevranа" +
                " | ум " + wise +
                " | мудрость " + witty +
                " | творчество" + creative +
                " ";
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }
}

import java.util.Arrays;

public class PrintService {

    public void print(Griffindor[] griffindors, int i) {
        Griffindor griffindor = griffindors[i];
        System.out.println(griffindor.toString());
    }

    public int sumBall(Griffindor[] griffindors, int i) {
        Griffindor griffindor = griffindors[i];
        return griffindor.getBravery() + griffindor.getHonor() + griffindor.getNobility();
    }

    public void moreFeaturesBall(Griffindor[] griffindors, int i, int j) {
        Griffindor griffindori = griffindors[i];
        Griffindor griffindorj = griffindors[j];
        if (sumBall(griffindors, i) > sumBall(griffindors, j)) {
            System.out.println("Больше очков у студента " + griffindori.getName() + " " + griffindori.getSurname() + " " + sumBall(griffindors, i) + " ");
        } else {
            if (sumBall(griffindors, i) == sumBall(griffindors, j)) {
                System.out.println("Равны по силе суммы доп статов Гриффиндора " + griffindori.getName() + " " + griffindori.getSurname() + " " + sumBall(griffindors, i) + " и "
                        + griffindorj.getName() + " " + griffindorj.getSurname() + " " + sumBall(griffindors, j) + " ");
            } else {
                System.out.println("Больше очков у студента " + griffindorj.getName() + " " + griffindorj.getSurname() + " " + sumBall(griffindors, j));
            }
        }
    }

    public void print(Kogtevran[] kogtevrans, int i) {
        Kogtevran kogtevran = kogtevrans[i];
        System.out.println(kogtevran.toString());
    }

    public int sumBall(Kogtevran[] kogtevrans, int i) {
        Kogtevran kogtevran = kogtevrans[i];
        return kogtevran.getCreative() + kogtevran.getWise() + kogtevran.getWitty();
    }

    public void moreFeaturesBall(Kogtevran[] kogtevrans, int i, int j) {
        Kogtevran kogtevrani = kogtevrans[i];
        Kogtevran kogtevranj = kogtevrans[j];
        if (sumBall(kogtevrans, i) > sumBall(kogtevrans, j)) {
            System.out.println("Больше очков у студента " + kogtevrani.getName() + " " + kogtevrani.getSurname() + " " + sumBall(kogtevrans, i) + " ");
        } else {
            if (sumBall(kogtevrans, i) == sumBall(kogtevrans, j)) {
                System.out.println("Равны по силе суммы доп статов Когтеварана " + kogtevrani.getName() + " " + kogtevrani.getSurname() + " " + sumBall(kogtevrans, i) + " и "
                        + kogtevranj.getName() + " " + kogtevranj.getSurname() + " " + sumBall(kogtevrans, j) + " ");
            } else {
                System.out.println("Больше очков у студента " + kogtevranj.getName() + " " + kogtevranj.getSurname() + " " + sumBall(kogtevrans, j));
            }
        }
    }

    public void print(Puffenduy[] puffenduys, int i) {
        Puffenduy puffenduy = puffenduys[i];
        System.out.println(puffenduy.toString());
    }

    public int sumBall(Puffenduy[] puffenduys, int i) {
        Puffenduy puffenduy = puffenduys[i];
        return puffenduy.getHardworking() + puffenduy.getHonest() + puffenduy.getLoyal();
    }

    public void moreFeaturesBall(Puffenduy[] puffenduys, int i, int j) {
        Puffenduy puffenduyi = puffenduys[i];
        Puffenduy puffenduyj = puffenduys[j];
        if (sumBall(puffenduys, i) > sumBall(puffenduys, j)) {
            System.out.println("Больше очков у студента " + puffenduyi.getName() + " " + puffenduyi.getSurname() + " " + sumBall(puffenduys, i));
        } else {
            if (sumBall(puffenduys, i) == sumBall(puffenduys, j)) {
                System.out.println("Равны по силе суммы доп статов Пуффендуя " + puffenduyi.getName() + " " + puffenduyi.getSurname() + " " + sumBall(puffenduys, i) + " и "
                        + puffenduyj.getName() + " " + puffenduyj.getSurname() + " " + sumBall(puffenduys, j) + " ");
            } else {
                System.out.println("Больше очков у студента " + puffenduyj.getName() + " " + puffenduyj.getSurname() + " " + sumBall(puffenduys, j));
            }
        }
    }

    public void print(Slizerin[] slizerins, int i) {
        Slizerin slizerin = slizerins[i];
        System.out.println(slizerin.toString());
    }

    public int sumBall(Slizerin[] slizerins, int i) {
        Slizerin slizerin = slizerins[i];
        return slizerin.getAmbition() + slizerin.getCunning() + slizerin.getAuthority() + slizerin.getDetermination() + slizerin.getResourcefulness();
    }

    public void moreFeaturesBall(Slizerin[] slizerins, int i, int j) {
        Slizerin slizerini = slizerins[i];
        Slizerin slizerinj = slizerins[j];
        if (sumBall(slizerins, i) > sumBall(slizerins, j)) {
            System.out.println("Больше очков у студента " + slizerini.getName() + " " + slizerini.getSurname() + " " + sumBall(slizerins, i));
        } else {
            if (sumBall(slizerins, i) == sumBall(slizerins, j)) {
                System.out.println("Равны по силе суммы доп статов Пуффендуя " + slizerini.getName() + " " + slizerini.getSurname() + " " + sumBall(slizerins, i) + " и "
                        + slizerinj.getName() + " " + slizerinj.getSurname() + " " + sumBall(slizerins, j) + " ");
            } else {
                System.out.println("Больше очков у студента " + slizerinj.getName() + " " + slizerinj.getSurname() + " " + sumBall(slizerins, j));
            }
        }
    }

    public int sumBall(Hogwarts[] hogwarts, int i) {
        Hogwarts hogwart = hogwarts[i];
        return hogwart.getPower() + hogwart.getTransgressiya();
    }


}

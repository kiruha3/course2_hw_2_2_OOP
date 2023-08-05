import java.util.Arrays;

public class PrintService {
    public Hogwarts[] createHogwarts(Hogwarts[] hogwarts, Griffindor[] griffindors, Kogtevran[] kogtevrans, Puffenduy[] puffenduys, Slizerin[] slizerins) {
            int j = 0; int i = 0;
            while (i < griffindors.length) {
                Hogwarts hogwart = new Hogwarts(griffindors[j].getName(), griffindors[j].getSurname(), griffindors[j].getPower(), griffindors[j].getTransgressiya());
                hogwarts[i]=hogwart;
                j++; i++;
            }
            j = 0;
            while (j < kogtevrans.length) {
                Hogwarts hogwart = new Hogwarts(kogtevrans[j].getName(), kogtevrans[j].getSurname(), kogtevrans[j].getPower(), kogtevrans[j].getTransgressiya());
                hogwarts[i]=hogwart;
                j++; i++;
            }
            j = 0;
            while (j < puffenduys.length) {
                Hogwarts hogwart = new Hogwarts(puffenduys[j].getName(), puffenduys[j].getSurname(), puffenduys[j].getPower(), puffenduys[j].getTransgressiya());
                hogwarts[i]=hogwart;
                j++;                i++;
            }
            j = 0;
            while (j < slizerins.length) {
                Hogwarts hogwart = new Hogwarts(slizerins[j].getName(), slizerins[j].getSurname(), slizerins[j].getPower(), slizerins[j].getTransgressiya());
                hogwarts[i]=hogwart;
                j++;i++;
            }
            //System.out.println("i = " + i);
        return hogwarts;
    }



    public void print(Hogwarts[] hogwarts, int i) {
        Hogwarts hogwart = hogwarts[i];
        System.out.println(hogwart.toString());
    }
    public int sumBallHogwarts(Hogwarts[] hogwarts, int i) {
        Hogwarts hogwart = hogwarts[i];
        return hogwart.getPower() + hogwart.getTransgressiya();
    }
    public void moreFeaturesBallHogwarts(Hogwarts[] hogwarts, int i, int j) {
        Hogwarts hogwartsi = hogwarts[i];
        Hogwarts hogwartsj = hogwarts[j];
        if (sumBallHogwarts(hogwarts, i) > sumBallHogwarts(hogwarts, j)) {
            System.out.println("Больше очков у студента " + hogwartsi.getName() + " " + hogwartsi.getSurname() + " - " + sumBall(hogwarts, i) + " ");
        } else {
            if (sumBall(hogwarts, i) == sumBall(hogwarts, j)) {
                System.out.println("Равны по очкам силы и трансгрессии Гриффиндора " + hogwartsi.getName() + " " + hogwartsi.getSurname() + " " + sumBall(hogwarts, i) + " и "
                        + hogwartsj.getName() + " " + hogwartsj.getSurname() + " - " + sumBall(hogwarts, j) + " ");
            } else {
                System.out.println("Больше очков у студента " + hogwartsj.getName() + " " + hogwartsj.getSurname() + " -" + sumBall(hogwarts, j));
            }
        }
    }

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

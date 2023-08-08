import java.util.Arrays;

public class PrintService {

    public void print(Griffindor[] griffindors, int i) {
        Griffindor griffindor = griffindors[i];
        System.out.println(griffindor.toString());
    }
    public void print(Kogtevran[] kogtevrans, int i) {
        Kogtevran kogtevran = kogtevrans[i];
        System.out.println(kogtevran.toString());
    }
    public void print(Puffenduy[] puffenduys, int i) {
        Puffenduy puffenduy = puffenduys[i];
        System.out.println(puffenduy.toString());
    }
    public void print(Slizerin[] slizerins, int i) {
        Slizerin slizerin = slizerins[i];
        System.out.println(slizerin.toString());
    }

}

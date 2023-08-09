import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Griffindor[] griffindors = {
                new Griffindor("Гарри", "Поттер", 1, 22, 33, 41, 52),
                new Griffindor("Гермиона", "Грейнджер", 1, 2, 31, 4, 54),
                new Griffindor("Рон", "Уизли", 1, 2, 30, 4, 54),
        };

        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу", "Чанг", 1, 2, 3, 4, 5),
                new Kogtevran("Падма", "Патил", 1, 2, 3, 4, 55),
                new Kogtevran("Маркус", "Белби", 1, 2, 3, 4, 5),
        };
        Puffenduy[] puffenduys = {
                new Puffenduy("Захария", "Смит", 1, 2, 3, 4, 5),
                new Puffenduy("Седрик", "Диггори", 1, 2, 3, 54, 5),
                new Puffenduy("Джастин", "Финч-Флетчи", 1, 2, 3, 4, 5),
        };
        Slizerin[] slizerins = {
                new Slizerin("Драко", "Малфой", 13, 2, 3, 4, 5, 2, 2),
                new Slizerin("Грэхэм", "Монтегю", 21, 2, 3, 4, 58, 2, 2),
                new Slizerin("Грегори", "Гойл", 11, 2, 3, 45, 5, 2, 2),
        };
        PrintService printService = new PrintService();
        printService.print(griffindors[2]);
        printService.print(puffenduys[2]);
        printService.print(kogtevrans[2]);
        printService.print(slizerins[2]);
        System.out.println("\"\"  " + "");

        griffindors[0].compareStudent(griffindors[2]);
        puffenduys[2].compareStudent(puffenduys[1]);
        kogtevrans[1].compareStudent(kogtevrans[2]);
        slizerins[2].compareStudent(slizerins[1]);
        System.out.println("" + "сравнение 2 любых");
        slizerins[2].compare(slizerins[0]);
        slizerins[2].compare(griffindors[0]);
        //slizerins[2].compareOtherFacultetStudent(griffindors[0]);

    }
}
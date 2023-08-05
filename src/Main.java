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
                new Slizerin("Драко", "Малфой", 1, 2, 3, 4, 5, 2, 2),
                new Slizerin("Грэхэм", "Монтегю", 1, 2, 3, 4, 5, 2, 2),
                new Slizerin("Грегори", "Гойл", 1, 2, 3, 4, 5, 2, 2),
        };
        Hogwarts[] hogwarts = new Hogwarts[griffindors.length + kogtevrans.length + puffenduys.length + slizerins.length];
        PrintService printService = new PrintService();
        printService.createHogwarts(hogwarts, griffindors, kogtevrans, puffenduys, slizerins);
        for (int i = 0; i < griffindors.length + kogtevrans.length + puffenduys.length + slizerins.length; i++) {
            printService.print(hogwarts, i);
        }

        printService.print(griffindors, 2);
        printService.print(puffenduys, 2);
        printService.print(kogtevrans, 2);
        printService.print(slizerins, 2);
        System.out.println("\"\"  " + "");
        printService.moreFeaturesBall(griffindors, 2, 0);
        printService.moreFeaturesBall(puffenduys, 2, 1);
        printService.moreFeaturesBall(kogtevrans, 0, 1);
        printService.moreFeaturesBall(slizerins, 2, 1);
        System.out.println("\"сравнение 2 любых\" = " + "сравнение 2 любых");
        printService.moreFeaturesBallHogwarts(hogwarts,0,8 );
        //System.out.println("griffindors[1].getName() = " + griffindors[1].getName());

    }
}
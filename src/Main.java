public class Main {
    public static void main(String[] args) {
//        Hogwarts[] hogwarts = { gr}
//
//                new Griffindor("Гарри", "Поттер", 1, 2, 3, 4, 5),
//                new Griffindor("Гермиона", "Грейнджер", 1, 2, 3, 4, 5),
//                new Griffindor("Рон", "Уизли", 1, 2, 3, 4, 5)},
//                new Slizerin("Драко", "Малфой", 1, 2, 3, 4, 5, 2, 2),
//                new Slizerin("Грэхэм", "Монтегю", 1, 2, 3, 4, 5, 2, 2),
//                new Slizerin("Грегори", "Гойл", 1, 2, 3, 4, 5, 2, 2),
//                new Puffenduy("Захария", "Смит", 1, 2, 3, 4, 5),
//                new Puffenduy("Седрик", "Диггори", 1, 2, 3, 4, 5),
//                new Puffenduy("Джастин", "Финч-Флетчи", 1, 2, 3, 4, 5),
//                new Kogtevran("Чжоу", "Чанг", 1, 2, 3, 4, 5),
//                new Kogtevran("Падма", "Патил", 1, 2, 3, 4, 5),
//                new Kogtevran("Маркус", "Белби", 1, 2, 3, 4, 5),};
        Griffindor[] griffindors = {
                new Griffindor("Гарри", "Поттер", 1, 2, 3, 4, 5),
                new Griffindor("Гермиона", "Грейнджер", 1, 2, 3, 4, 5),
                new Griffindor("Рон", "Уизли", 1, 2, 3, 4, 5),
        };
        Slizerin[] slizerins = {
                new Slizerin("Драко", "Малфой", 1, 2, 3, 4, 5, 2, 2),
                new Slizerin("Грэхэм", "Монтегю", 1, 2, 3, 4, 5, 2, 2),
                new Slizerin("Грегори", "Гойл", 1, 2, 3, 4, 5, 2, 2),
        };
        Puffenduy[] puffenduys = {
                new Puffenduy("Захария", "Смит", 1, 2, 3, 4, 5),
                new Puffenduy("Седрик", "Диггори", 1, 2, 3, 4, 5),
                new Puffenduy("Джастин", "Финч-Флетчи", 1, 2, 3, 4, 5),
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу", "Чанг", 1, 2, 3, 4, 5),
                new Kogtevran("Падма", "Патил", 1, 2, 3, 4, 5),
                new Kogtevran("Маркус", "Белби", 1, 2, 3, 4, 5),
        };

        PrintService printService = new PrintService();
//        printService.print(griffindors, 2);
//        printService.print(puffenduys, 2);
//        printService.print(kogtevrans, 2);
//        printService.print(slizerins, 2);
        System.out.println("griffindors[1].getName() = " + griffindors[1].getName());

    }
}
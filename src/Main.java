public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри", "Поттер", 82, 64),
                new Hogwarts("Гермиона", "Грейнджер", 88, 74),
                new Hogwarts("Рон", "Уизли", 47, 54),
                new Hogwarts("Драко", "Малфой", 96, 93),
                new Hogwarts("Грэхэм", "Монтегю", 69, 54),
                new Hogwarts("Грегори", "Гойл", 47, 65),
                new Hogwarts("Захария", "Смит", 58, 81),
                new Hogwarts("Седрик", "Диггори", 54, 78),
                new Hogwarts("Джастин", "Финч-Флетчли", 74, 66),
                new Hogwarts("Чжоу", "Чанг", 71, 51),
                new Hogwarts("Падма", "Патил", 64, 73),
                new Hogwarts("Маркус", "Белби", 79, 67),
        };
        PrintServer.printStudents(hogwarts);
        printSeparator();
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 82, 64, 86, 88, 82),
                new Gryffindor("Гермиона", "Грейнджер", 88, 74, 73, 79, 75),
                new Gryffindor("Рон", "Уизли", 47, 54,  64, 67, 63),
        };
        PrintServer.printStudents(gryffindors);
        printSeparator();
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 58, 81, 91, 73, 87),
                new Hufflepuff("Седрик", "Диггори", 54, 78, 70, 82, 99),
                new Hufflepuff("Джастин", "Финч-Флетчли", 74, 66, 90, 74, 84),
        };
        PrintServer.printStudents(hufflepuffs);
        printSeparator();
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 71, 51, 75, 72, 82, 78),
                new Ravenclaw("Падма", "Патил", 64, 73, 89, 80, 77, 70),
                new Ravenclaw("Маркус", "Белби", 79, 67, 83, 82, 87, 78),
        };
        PrintServer.printStudents(ravenclaws);
        printSeparator();
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 96, 93, 96, 91, 97, 100, 90),
                new Slytherin("Грэхэм", "Монтегю", 69, 54, 79, 78, 84, 77, 89),
                new Slytherin("Грегори", "Гойл", 47, 65, 76, 83, 86, 83, 87),
        };
        PrintServer.printStudents(slytherins);
        printSeparator();
        System.out.println("Сравнение учеников в факультетах.");
        СharacteristicsFaculties.comparingStudentsSlytherin(slytherins[0], slytherins[2]);
        СharacteristicsFaculties.comparingStudentsGryffindor(gryffindors[1], gryffindors[0]);
        СharacteristicsFaculties.comparingStudentsRavenclaw(ravenclaws[1],ravenclaws[2]);
        СharacteristicsFaculties.comparingStudentsHufflepuff(hufflepuffs[0], hufflepuffs[1]);
        printSeparator();
        System.out.println("Лучший ученик Хогвартса.");
        СharacteristicsFaculties.comparingStudentsHogwarts(hogwarts[0], hogwarts[3]);
    }

    public static void printSeparator() {
        System.out.println("=================================================================================");
        System.out.println("=================================================================================");
    }
}
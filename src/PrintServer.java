public class PrintServer {

    public static void printStudents(Hogwarts[] hogwarts) {
        System.out.println("Ученики Хогвартса:");
        for (int i = 0; i < hogwarts.length; i++) {
            System.out.print(hogwarts[i]);
            System.out.println();
            System.out.println("=================================================================================");
        }
    }

    public static void printStudents(Gryffindor[] gryffindors) {
        System.out.println("Ученики Гриффиндор:");
        for (int i = 0; i < gryffindors.length; i++) {
            System.out.print(gryffindors[i]);
            System.out.println();
            System.out.println("=================================================================================");
        }
    }

    public static void printStudents(Hufflepuff[] hufflepuffs) {
        System.out.println("Ученики Пуффендуй:");
        for (int i = 0; i < hufflepuffs.length; i++) {
            System.out.print(hufflepuffs[i]);
            System.out.println();
            System.out.println("=================================================================================");
        }
    }

    public static void printStudents(Ravenclaw[] ravenclaws) {
        System.out.println("Ученики Когтевран:");
        for (int i = 0; i < ravenclaws.length; i++) {
            System.out.print(ravenclaws[i]);
            System.out.println();
            System.out.println("=================================================================================");
        }
    }

    public static void printStudents(Slytherin[] slytherins) {
        System.out.println("Ученики Слизерин:");
        for (int i = 0; i < slytherins.length; i++) {
            System.out.print(slytherins[i]);
            System.out.println();
            System.out.println("=================================================================================");
        }
    }
}

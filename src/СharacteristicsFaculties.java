public class СharacteristicsFaculties {

    public static int sumСharacteristicsSlytherin(Slytherin slytherins) {
       int sumСharacteristicsSlytherin = slytherins.getTrick() + slytherins.getDetermination() + slytherins.getAmbition() + slytherins.getResourcefulness() + slytherins.getThirstForPower();
       return sumСharacteristicsSlytherin;
    }

    public static int sumСharacteristicsHufflepuff(Hufflepuff hufflepuff) {
        int sumСharacteristicsHufflepuff = hufflepuff.getHardworking() + hufflepuff.getLoyal() + hufflepuff.getHonest();
        return sumСharacteristicsHufflepuff;
    }

    public static int sumСharacteristicsRavenclaw(Ravenclaw ravenclaw) {
        int sumСharacteristicsRavenclaw = ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity();
        return sumСharacteristicsRavenclaw;
    }

    public static int sumСharacteristicsGryffindor(Gryffindor gryffindor) {
        int sumСharacteristicsGryffindor = gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
        return sumСharacteristicsGryffindor;
    }

    public static int sumMagicAndTransgression(Hogwarts hogwarts) {
        int sumMagicAndTransgression = hogwarts.getPowerMagic() + hogwarts.getDistanceTransgression();
        return sumMagicAndTransgression;
    }

    public static void comparingStudentsSlytherin(Slytherin slytherin1, Slytherin slytherin2) {
        if (sumСharacteristicsSlytherin(slytherin1) > sumСharacteristicsSlytherin(slytherin2)) {
            System.out.println(slytherin1.getFirstName() + " " + slytherin1.getLastName() + " лучший Слизеринец, чем " + slytherin2.getFirstName() + " " + slytherin2.getLastName());
        } else if(sumСharacteristicsSlytherin(slytherin1) < sumСharacteristicsSlytherin(slytherin2)){
            System.out.println(slytherin2.getFirstName() + " " + slytherin2.getLastName() + " лучший Слизеринец, чем " + slytherin1.getFirstName() + " " + slytherin1.getLastName());
        } else if (sumСharacteristicsSlytherin(slytherin1) == sumСharacteristicsSlytherin(slytherin2)) {
            System.out.println(slytherin1.getFirstName() + " " + slytherin1.getLastName() + " такой же как и " + slytherin2.getFirstName() + " " + slytherin2.getLastName());
        }
    }

    public static void comparingStudentsGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (sumСharacteristicsGryffindor(gryffindor1) > sumСharacteristicsGryffindor(gryffindor2)) {
            System.out.println(gryffindor1.getFirstName() + " " + gryffindor1.getLastName() + " лучший Гриффиндорец, чем " + gryffindor2.getFirstName() + " " + gryffindor2.getLastName());
        } else if(sumСharacteristicsGryffindor(gryffindor1) < sumСharacteristicsGryffindor(gryffindor2)){
            System.out.println(gryffindor2.getFirstName() + " " + gryffindor2.getLastName() + " лучший Гриффиндорец, чем " + gryffindor1.getFirstName() + " " + gryffindor1.getLastName());
        } else if (sumСharacteristicsGryffindor(gryffindor1) == sumСharacteristicsGryffindor(gryffindor2)) {
            System.out.println(gryffindor1.getFirstName() + " " + gryffindor1.getLastName() + " такой же как и " + gryffindor2.getFirstName() + " " + gryffindor2.getLastName());
        }
    }

    public static void comparingStudentsRavenclaw(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        if (sumСharacteristicsRavenclaw(ravenclaw1) > sumСharacteristicsRavenclaw(ravenclaw2)) {
            System.out.println(ravenclaw1.getFirstName() + " " + ravenclaw1.getLastName() + " лучший Когтевранец, чем " + ravenclaw2.getFirstName() + " " + ravenclaw2.getLastName());
        } else if(sumСharacteristicsRavenclaw(ravenclaw1) < sumСharacteristicsRavenclaw(ravenclaw2)){
            System.out.println(ravenclaw2.getFirstName() + " " + ravenclaw2.getLastName() + " лучший Когтевранец, чем " + ravenclaw1.getFirstName() + " " + ravenclaw1.getLastName());
        } else if (sumСharacteristicsRavenclaw(ravenclaw1) == sumСharacteristicsRavenclaw(ravenclaw2)) {
            System.out.println(ravenclaw1.getFirstName() + " " + ravenclaw1.getLastName() + " такой же как и " + ravenclaw2.getFirstName() + " " + ravenclaw2.getLastName());
        }
    }

    public static void comparingStudentsHufflepuff(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        if (sumСharacteristicsHufflepuff(hufflepuff1) > sumСharacteristicsHufflepuff(hufflepuff2)) {
            System.out.println(hufflepuff1.getFirstName() + " " + hufflepuff1.getLastName() + " лучший Пуффендунец, чем " + hufflepuff2.getFirstName() + " " + hufflepuff2.getLastName());
        } else if (sumСharacteristicsHufflepuff(hufflepuff1) < sumСharacteristicsHufflepuff(hufflepuff2)){
            System.out.println(hufflepuff2.getFirstName() + " " + hufflepuff2.getLastName() + " лучший Пуффендунец, чем " + hufflepuff1.getFirstName() + " " + hufflepuff1.getLastName());
        } else if (sumСharacteristicsHufflepuff(hufflepuff1) == sumСharacteristicsHufflepuff(hufflepuff2)) {
            System.out.println(hufflepuff1.getFirstName() + " " + hufflepuff1.getLastName() + " такой же как и " + hufflepuff2.getFirstName() + " " + hufflepuff2.getLastName());
        }
    }

    public static void comparingStudentsHogwarts(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (sumMagicAndTransgression(hogwarts1) > sumMagicAndTransgression(hogwarts2)) {
            System.out.println(hogwarts1.getFirstName() + " " + hogwarts1.getLastName() + " обладает большей мощностью магии, чем " + hogwarts2.getFirstName() + " " + hogwarts2.getLastName());
        } else if (sumMagicAndTransgression(hogwarts1) < sumMagicAndTransgression(hogwarts2)){
            System.out.println(hogwarts2.getFirstName() + " " + hogwarts2.getLastName() + " обладает большей мощностью магии, чем " + hogwarts1.getFirstName() + " " + hogwarts1.getLastName());
        } else if (sumMagicAndTransgression(hogwarts1) == sumMagicAndTransgression(hogwarts2)) {
            System.out.println(hogwarts1.getFirstName() + " " + hogwarts1.getLastName() + " такой же как и " + hogwarts2.getFirstName() + " " + hogwarts2.getLastName());
        }
    }
}
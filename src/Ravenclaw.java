public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstName, String lastName, int powerMagic, int distanceTransgression, int intelligence, int wisdom, int wit, int creativity) {
        super(firstName, lastName, powerMagic, distanceTransgression);
        if (intelligence >= 0 && intelligence <= 100) {
            this.intelligence = intelligence;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (wisdom >= 0 && wisdom <= 100) {
            this.wisdom = wisdom;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (wit >= 0 && wit <= 100) {
            this.wit = wit;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (creativity >= 0 && creativity <= 100) {
            this.creativity = creativity;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (intelligence >= 0 && intelligence <= 100) {
            this.intelligence = intelligence;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (wisdom >= 0 && wisdom <= 100) {
            this.wisdom = wisdom;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (wit >= 0 && wit <= 100) {
            this.wit = wit;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity >= 0 && creativity <= 100) {
            this.creativity = creativity;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public String toString() {
        return "Имя: " + this.getFirstName()
                + "\nФамилия: " + this.getLastName()
                + "\nСила магии: " + this.getPowerMagic()
                + "\nРасстояние трансгрессии: " + this.getDistanceTransgression()
                + "\nУм: " + this.intelligence
                + "\nМудрость: " + this.wisdom
                + "\nОстроумие: " + this.wit
                + "\nТворчество: " + this.creativity;
    }
}
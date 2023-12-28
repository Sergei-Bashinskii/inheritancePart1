public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor (String firstName, String lastName, int powerMagic, int distanceTransgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerMagic, distanceTransgression);
        if (nobility >= 0 && nobility <= 100) {
            this.nobility = nobility;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (honor >= 0 && honor <= 100) {
            this.honor = honor;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (bravery >= 0 && bravery <= 100) {
            this.bravery = bravery;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility >= 0 && nobility <= 100) {
            this.nobility = nobility;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor >= 0 && honor <= 100) {
            this.honor = honor;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery >= 0 && bravery <= 100) {
            this.bravery = bravery;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public String toString() {
        return "Имя: " + this.getFirstName()
                + "\nФамилия: " + this.getLastName()
                + "\nСила магии: " + this.getPowerMagic()
                + "\nРасстояние трансгрессии: " + this.getDistanceTransgression()
                + "\nБлагородство: " + this.nobility
                + "\nЧесть: " + this.honor
                + "\nХрабрость: " + this.bravery;
    }
}
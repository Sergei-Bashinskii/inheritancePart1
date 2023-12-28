public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String firstName, String lastName, int powerMagic, int distanceTransgression, int hardworking, int loyal, int honest) {
        super(firstName, lastName, powerMagic, distanceTransgression);
        if (hardworking >= 0 && hardworking <= 100) {
            this.hardworking = hardworking;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (loyal >= 0 && loyal <= 100) {
            this.loyal = loyal;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (honest >= 0 && honest <= 100) {
            this.honest = honest;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        if (hardworking >= 0 && hardworking <= 100) {
            this.hardworking = hardworking;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        if (loyal >= 0 && loyal <= 100) {
            this.loyal = loyal;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        if (honest >= 0 && honest <= 100) {
            this.honest = honest;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public String toString() {
        return "Имя: " + this.getFirstName()
                + "\nФамилия: " + this.getLastName()
                + "\nСила магии: " + this.getPowerMagic()
                + "\nРасстояние трансгрессии: " + this.getDistanceTransgression()
                + "\nТрудолюбие: " + this.hardworking
                + "\nВерность: " + this.loyal
                + "\nЧестность: " + this.honest;
    }
}
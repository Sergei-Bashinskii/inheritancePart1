public class Hogwarts {
    private String firstName;
    private String lastName;
    private int powerMagic;
    private int distanceTransgression;

    public Hogwarts(String firstName, String lastName, int powerMagic, int distanceTransgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (powerMagic >= 0 && powerMagic <= 100) {
            this.powerMagic = powerMagic;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (distanceTransgression >= 0 && distanceTransgression <= 100) {
            this.distanceTransgression = distanceTransgression;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPowerMagic() {
        return this.powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        if (powerMagic >= 0 && powerMagic <= 100) {
            this.powerMagic = powerMagic;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        if (distanceTransgression >= 0 && distanceTransgression <= 100) {
            this.distanceTransgression = distanceTransgression;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    @Override
    public String toString() {
        return "Имя: " + this.firstName
                + "\nФамилия: " + this.lastName
                + "\nСила магии: " + this.powerMagic
                + "\nРасстояние трансгрессии: " + this.distanceTransgression;
    }
}

public class Slytherin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String firstName, String lastName, int powerMagic, int distanceTransgression, int trick, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(firstName, lastName, powerMagic, distanceTransgression);
        if (trick >= 0 && trick <= 100) {
            this.trick = trick;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (determination >= 0 && determination <= 100) {
            this.determination = determination;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (ambition >= 0 && ambition <= 100) {
            this.ambition = ambition;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (resourcefulness >= 0 && resourcefulness <= 100) {
            this.resourcefulness = resourcefulness;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
        if (thirstForPower >= 0 && thirstForPower <= 100) {
            this.thirstForPower = thirstForPower;
        } else {
            throw new IllegalArgumentException("Неверное значение");
        }
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        if (trick >= 0 && trick <= 100) {
            this.trick = trick;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination >= 0 && determination <= 100) {
            this.determination = determination;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition >= 0 && ambition <= 100) {
            this.ambition = ambition;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness >= 0 && resourcefulness <= 100) {
            this.resourcefulness = resourcefulness;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        if (thirstForPower >= 0 && thirstForPower <= 100) {
            this.thirstForPower = thirstForPower;
        } else {
            throw new IllegalArgumentException("Не верное значение");
        }
    }

    public String toString() {
        return "Имя: " + this.getFirstName()
                + "\nФамилия: " + this.getLastName()
                + "\nСила магии: " + this.getPowerMagic()
                + "\nРасстояние трансгрессии: " + this.getDistanceTransgression()
                + "\nХитрость: " + this.trick
                + "\nРешительность: " + this.determination
                + "\nАмбициозность: " + this.ambition
                + "\nНаходчивость: " + this.resourcefulness
                + "\nЖажда власти: " + this.thirstForPower;
    }
}
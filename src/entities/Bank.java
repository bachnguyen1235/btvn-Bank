package entities;

public class Bank {
    private static int idAuto = 100;
    private int id;
    private String name;
    private double interestRrate;

    public void setId(int id) {
        this.id = idAuto++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInterestRrate() {
        return interestRrate;
    }

    public void setInterestRrate(double interestRrate) {
        this.interestRrate = interestRrate;
    }
}

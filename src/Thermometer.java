import java.util.Objects;

public class Thermometer extends Meter{

    double maxTemp, minTemp;

    public Thermometer(){
        super("k100", "R100H2", true);
        maxTemp = 69.0;
        minTemp = -50;
    }

    public Thermometer(String regNum, String plassNum, boolean working, double maxTemp, double minTemp) {
        super(regNum, plassNum, working);
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    @Override
    public String toString() {
        return "Object: " + this.getClass().getName() + "\n" +
                "RegNum " + getRegNum() + "\n" +
                "PlassNum " + getPlassNum() + "\n" +
                "Working " + isWorking() + "\n" +
                "MaxTemp " + + getMaxTemp() + "\n" +
                "MinTemp " + getMinTemp();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thermometer that = (Thermometer) o;
        return Double.compare(that.getMaxTemp(), getMaxTemp()) == 0 &&
                Double.compare(that.getMinTemp(), getMinTemp()) == 0;
    }
}

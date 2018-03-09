import java.util.Objects;

public class Clock extends Meter {

    double minTime;

    public Clock() {
        super("k200", "R200H3", false);
        minTime = 0.0;
    }

    public Clock(String regNum, String plassNum, boolean working, double minTime) {
        super(regNum, plassNum, working);
        this.minTime = minTime;
    }

    public double getMinTime() {
        return minTime;
    }

    public void setMinTime(double minTime) {
        this.minTime = minTime;
    }

    @Override
    public String toString(){
        return "Object: " + this.getClass().getName() + "\n" +
                "RegNum " + getRegNum() + "\n" +
                "PlassNum " + getPlassNum() + "\n" +
                "Working " + isWorking() + "\n" +
                "MinTime " + getMinTime()
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return Double.compare(clock.getMinTime(), getMinTime()) == 0;
    }
}

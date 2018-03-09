import java.util.Objects;

public class Weight extends Meter{

    double minWeight, maxWeight;

    public Weight(){
        super("K300", "R300H4", true);
        minWeight = 0.0;
        maxWeight = 10000.0;
    }

    public Weight(String regNum, String plassNum, boolean working, double minWeight, double maxWeight) {
        super(regNum, plassNum, working);
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString(){
        return "Object: " + this.getClass().getName() + "\n" +
                "RegNum " + getRegNum() + "\n" +
                "PlassNum " + getPlassNum() + "\n" +
                "Working " + isWorking() + "\n" +
                "MinWeight " + getMinWeight() + "\n" +
                "MakWeight " + getMaxWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.getMinWeight(), getMinWeight()) == 0 &&
                Double.compare(weight.getMaxWeight(), getMaxWeight()) == 0;
    }
}

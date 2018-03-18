public abstract class Meter {

    protected String regNum, plassNum;
    protected boolean working;

    public Meter(){
        regNum = "k213";
        plassNum = "R24H3";
        working = true;
    }

    public Meter(String regNum, String plassNum, boolean working) {
        this.regNum = regNum;
        this.plassNum = plassNum;
        this.working = working;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getPlassNum() {
        return plassNum;
    }

    public void setPlassNum(String plassNum) {
        this.plassNum = plassNum;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public boolean equals(Object other){
        if (other == null || !(other instanceof Meter)) return false;
        return ((Meter) other).getRegNum().equals(getRegNum());
    }
}

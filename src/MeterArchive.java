import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MeterArchive {

    List<Meter> meters;

    public MeterArchive(){
        meters = new ArrayList<>();
        Weight w = new Weight();
        Thermometer t = new Thermometer();
        Clock c = new Clock();
        meters.add(w);
        meters.add(t);
        meters.add(c);
    }

    public void addInstrument(Meter m){
        meters.add(m);
    }

    public void printAllInstruments(){
        for(Meter m : meters){
            System.out.println(m);
            System.out.println("----");
        }
        System.out.println();
    }

    public Meter getInstrument(String regNum){
        for(int i = 0; i < meters.size(); i++) {
            if(meters.get(i).getRegNum().equals(regNum)){
                return meters.get(i);
            }
        }
        return null;
    }

    public boolean deleteInstrument(String regNum){
        for(Iterator<Meter> it = meters.iterator(); it.hasNext();){
            if(it.next().getRegNum().equals(regNum)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void setInstrumentNotWorking(String regNum){
        for(int i = 0; i < meters.size(); i++) {
            if(meters.get(i).getRegNum().equals(regNum)){
                meters.get(i).setWorking(false);
            }
        }
    }

    public void setInstrumentNewPosition(String regNum, String plassKode){
        for (int i = 0; i < meters.size(); i++) {
            if(meters.get(i).getRegNum().equals(regNum)){
                meters.get(i).setPlassNum(plassKode);
            }
        }
    }
}

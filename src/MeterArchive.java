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

    /**
     *Add an instrument to the list of other instrument
     * @param m The instrument you want to add.
     */
    public void addInstrument(Meter m){
        meters.add(m);
    }

    /**
     * Prins all instruments
     */
    public List printAllInstruments(){
        return meters;
    }

    /**
     * Get the defined instrument from the list.
     * @param regNum The registration number representing the instrument.
     * @return The instrument in question.
     */
    public Meter getInstrument(String regNum){
        for(Meter m : meters){
            if(m.getRegNum().equals(regNum)){
                return m;
            }
        }
        return null;
    }

    /**
     * Delete an instrument form the list.
     * @param regNum The registration number representing the instrument.
     * @return The instrument in question.
     */
    public boolean deleteInstrument(String regNum){
        for(Iterator<Meter> it = meters.iterator(); it.hasNext();){
            if(it.next().getRegNum().equals(regNum)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Set an instruments status to not working.
     * @param regNum the instrument in question.
     */
    public void setInstrumentNotWorking(String regNum){
        for(Meter m : meters){
            if(m.getRegNum().equals(regNum)){
                m.setWorking(false);
            }
        }
    }

    /**
     * Set a new position where an instrument is stored.
     * @param regNum The instrument in question.
     * @param plassKode The new code where we wanna store the instrument.
     */
    public void setInstrumentNewPosition(String regNum, String plassKode){
        for(Meter m : meters){
            if(m.getRegNum().equals(regNum)){
                m.setPlassNum(plassKode);
            }
        }
    }
}

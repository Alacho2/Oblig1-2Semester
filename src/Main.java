public class Main {

    public static void main(String[] args) {
        MeterArchive m = new MeterArchive();

        m.printAllInstruments(); //Print the instrument
        m.deleteInstrument("k300"); //Delete instrument with regNumber k300
        m.getInstrument("k100"); //Get the instrument with regNumber k100
        m.addInstrument(new Thermometer("k560", "H300R1", true, 100.5, -30)); //Add a new instrument
        m.setInstrumentNewPosition("k560", "H300R2"); //Set new position for Instrument
        m.setInstrumentNotWorking("k560"); //Set the instrument not working
        m.printAllInstruments();
    }
}

/**
 * Computer
 */
public class Computer {

    private int coumputerID;
    private String brand;
    private int RAM;
    private int storage;
    private Processor processor;
    private boolean isOn;

    

    public Computer(){
        processor= new Processor();
    }

    

    public int getCoumputerID() {
        return coumputerID;
    }



    public void setCoumputerID(int coumputerID) {
        this.coumputerID = coumputerID;
    }



    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }



    public int getRAM() {
        return RAM;
    }



    public void setRAM(int rAM) {
        RAM = rAM;
    }



    public int getStorage() {
        return storage;
    }



    public void setStorage(int storage) {
        this.storage = storage;
    }



    public Processor getProcessor() {
        return processor;
    }



    public void setProcessor(Processor processor) {
        this.processor = processor;
    }



    public boolean isOn() {
        return isOn;
    }



    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }



    public void start(){
        isOn=true;
    };

    public void shutDown(){
        isOn=false;
    };
}
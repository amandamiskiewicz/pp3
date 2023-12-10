public class Processor {
    private String model;
    private double speedInGhz;
    private String socket;
    private String brand;

    

    public Processor(String model, double speedInGhz, String socket, String brand) {
        this.model = model;
        this.speedInGhz = speedInGhz;
        this.socket = socket;
        this.brand = brand;
    }



    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }



    public double getSpeedInGhz() {
        return speedInGhz;
    }



    public void setSpeedInGhz(double speedInGhz) {
        this.speedInGhz = speedInGhz;
    }



    public String getSocket() {
        return socket;
    }



    public void setSocket(String socket) {
        this.socket = socket;
    }



    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }



    public int calculate(int x,int y){
        return x+y;
    };
    
}

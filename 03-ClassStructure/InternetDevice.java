/*15.There are many devices that can use the Internet: a personal computer, laptop, tablet, smartphone, 
internet radio or TV. Define an InternetDevice class to describe such devices. 
The class should contain attributes: name (device name), connected (whether a device is connected to the Internet), 
and connectedDevices (the number of connected devices - static field). 
Add a constructor InternetDevice(name) and methods for device manipulation: connect(), disconnect(), 
isConnected(), displayStatus(), displayConnections() (static method). 
Then write a program that creates five different internet devices, 
three of which are connected to the Internet. Display the status of each device and information about 
the number of devices connected to the Internet. */

public class InternetDevice {
    public String name;
    public boolean connected;
    static int connectedDevices;

    public InternetDevice(String name){
        this.name=name;
    }

    public void connect() {
        connected=true;
        connectedDevices++;
    }

    public void disconnect() {
        connected=false;
        connectedDevices--;
    }

    public boolean isConnected() {
        return connected;
    }

    public void displayStatus(){
        System.out.println("Divice "+name+ " connected: " + isConnected());
    }

    static int displayConnections(){
        return connectedDevices;
    }

    public static void main(String[] args) {
        InternetDevice device1 = new InternetDevice("personal computer");
        InternetDevice device2 = new InternetDevice("laptop");
        InternetDevice device3 = new InternetDevice("tablet");
        InternetDevice device4 = new InternetDevice("smartphone");
        InternetDevice device5 = new InternetDevice("TV");
        device1.connect();
        device2.connect();
        device3.connect();
        device1.displayStatus();
        device2.displayStatus();
        device3.displayStatus();
        device4.displayStatus();
        device4.connect();
        device4.displayStatus();
        System.out.println(InternetDevice.displayConnections());
        device3.disconnect();
        System.out.println(InternetDevice.displayConnections());
    }


}

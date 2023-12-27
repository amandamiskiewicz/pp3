/*7.	A TV class describes TV sets. Each TV can be turned on or off. 
Define the class with the appropriate attribute. Add a method that displays TV status. */

/*10.	In the TV class, add an attribute that describes the channel number. 
Then implement the CanChangeChannel interface. Define methods in the class for changing the channel. 
Take into account that:
a.	The allowed channel number is 1 through 99.
b.	The channel can only be changed when the TV is on.
c.	The default channel number after turning on the TV is 1.
d.	TV status displays channel number only when the TV is on.
 */

 /*12.	In the TV class, add an attribute that describes the volume level. 
 Then implement the CanChangeVolume interface. Define in the class the methods for adjusting the TV volume level. 
 Take into account that:
a.	The valid range for the volume level is 1 to 10.
b.	The default volume level after turning on the TV is 1.
c.	The volume level can only be adjusted when the TV is on.
 */

public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    boolean on;
    int channelNo;
    int volumeLvl;

    @Override
    public void on() {
        on=true;
        channelNo = 1;
        volumeLvl = 1;
    }

    @Override
    public void off() {
        on=false;
    }

    @Override
    public void channelUp() {
        if (channelNo>=1 && channelNo<99 && on==true){
            channelNo++;
        };
    }

    @Override
    public void channelDown() {
        if (channelNo>1 && channelNo<=99 && on==true){
            channelNo--;
        };
    }

    @Override
    public void setChannel(int n) {
        if (n>=1 && n<=99 && on==true){
            channelNo = n;
        };
    }


    @Override
    public void volumeUp() {
        if (volumeLvl>=1 && volumeLvl<10 && on==true){
            volumeLvl++;
        };
    }

    @Override
    public void volumeDown() {
        if (volumeLvl>1 && volumeLvl<=10 && on==true){
            volumeLvl--;
        };
    }

    public String status(){
        if (on==true){
            return "tv is on, channel: " + channelNo + ", volume level: " + volumeLvl;
        } else{ 
            return "tv is off";
        }
        
    }
}

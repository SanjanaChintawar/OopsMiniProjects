

// A smart home has different smart devices.
//an abstract class:
abstract class SmartDevice{
    String deviceName;
    String location;

    public SmartDevice(String deviceName, String loation) {
        this.deviceName = deviceName;
        this.location = loation;
    }

    void turnOn(){
        System.out.println("Turning on " + deviceName);
    }

    abstract void operate();

    
}

// Child Class 1
class SmartLight extends SmartDevice{
    int brightness;

    SmartLight(int brightness){
        super("Smart Light", "Pune");
        this.brightness = brightness;
    }
    @Override
    void operate(){
        System.out.println("Adjusting brightness to "+brightness+"%");
    }
}

// Child Class 2
class SmartFan extends SmartDevice{
    int speed;

    SmartFan(int speed){
        super("Smart Fan", "Mumbai");
        this.speed = speed;
    }

    @Override
    void operate(){
        System.out.println("Running fan at speed "+ speed);
    }
}

// Child Class 3
class AirConditioner extends SmartDevice{
    int temperature;
    AirConditioner(int temperature){
        super("Air Conditioner", "Mumbai");
        this.temperature = temperature;
    }

    @Override
    void operate(){
        System.out.println("Cooling room to "+ temperature);
    }
}


// main class

public class home {
    public static void main(String[] args){

        SmartDevice[] devices = {new SmartLight(102), new SmartFan(4), new AirConditioner(26)};

        for(SmartDevice device: devices){
            device.turnOn();
            device.operate();
        }
    }
}

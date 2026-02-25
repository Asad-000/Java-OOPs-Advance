class Home {
    int houseID;
    String ownerName;
    Room room;

    public Home(int houseID, String ownerName) {
        this.houseID = houseID;
        this.ownerName = ownerName;
        this.room = new Room(1,new Device(101,70,6));
    }
    public double electricityConsumption() {
        return room.calculateEnergy();
    }
}
class Room {
    int room;
    Device device;

    public Room(int room, Device device) {
        this.room = room;
        this.device = device;
    }
    public double calculateEnergy() {
        return device.calculateDailyEnergy() / 1000;
    }
}
class Device {
    int deviceID;
    int power;
    int noOfHours;

    public Device(int deviceID, int power, int noOfHours) {
        this.deviceID = deviceID;
        this.power = power;
        this.noOfHours = noOfHours;
    }
    public double calculateDailyEnergy() {
        return power * noOfHours;
    }
}

public class Task4 {
    public static void main (String[] args) {

        Home home = new Home(123,"Asad");

        System.out.println(home.electricityConsumption() + " watts");
    }
}

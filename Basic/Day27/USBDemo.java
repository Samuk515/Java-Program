package Day27;

interface USBDevice {
    void connect();
    void disconnect();
    String getDeviceName();
}

interface DataTransfer {
    void transferData(String data);
    long getTransferSpeed();
}
interface Chargeable {
    void charge();
    int getBatteryLevel();
}
class USBFlashDrive implements USBDevice, DataTransfer {
    String name; long speed;
    USBFlashDrive(String name, long speed) { this.name = name; this.speed = speed; }
    @Override public void connect()    { System.out.println(name + " connected"); }
    @Override public void disconnect() { System.out.println(name + " disconnected"); }
    @Override public String getDeviceName() { return name; }
    @Override public void transferData(String data) {
        System.out.println(name + " transferring: " + data);
    }
    @Override public long getTransferSpeed() { return speed; }
}
class USBMouse implements USBDevice {
    String name;
    USBMouse(String name) { this.name = name; }
    @Override public void connect()    { System.out.println(name + " connected"); }
    @Override public void disconnect() { System.out.println(name + " disconnected"); }
    @Override public String getDeviceName() { return name; }
}
class USBPhone implements USBDevice, DataTransfer, Chargeable {
    String name; int battery;
    USBPhone(String name, int battery) { this.name = name; this.battery = battery; }
    @Override public void connect()    { System.out.println(name + " connected"); }
    @Override public void disconnect() { System.out.println(name + " disconnected"); }
    @Override public String getDeviceName() { return name; }
    @Override public void transferData(String data) {
        System.out.println(name + " syncing: " + data);
    }
    @Override public long getTransferSpeed() { return 480; }
    @Override public void charge()  { System.out.println(name + " charging..."); battery += 10; }
    @Override public int getBatteryLevel() { return battery; }
}
class USBHub {
    USBDevice[] ports;
    int count = 0;

    USBHub(int ports) { this.ports = new USBDevice[ports]; }

    void plugIn(USBDevice device) {
        if (count < ports.length) {
            ports[count++] = device;
            device.connect();
        }
    }
    void processAll() {
        System.out.println("\n--- Processing all USB devices ---");
        for (int i = 0; i < count; i++) {
            USBDevice d = ports[i];
            System.out.println("Device: " + d.getDeviceName());
            if (d instanceof DataTransfer) {
                DataTransfer dt = (DataTransfer) d;
                dt.transferData("file_" + d.getDeviceName() + ".dat");
                System.out.println("  Speed: " + dt.getTransferSpeed() + " MB/s");
            }
            if (d instanceof Chargeable) {
                Chargeable c = (Chargeable) d;
                System.out.println("  Battery: " + c.getBatteryLevel() + "%");
                c.charge();
            }
        }
    }
}


public class USBDemo {
    public static void main(String[] args) {
        USBHub hub = new USBHub(4);
        hub.plugIn(new USBFlashDrive("SanDisk 64GB", 150));
        hub.plugIn(new USBMouse("Logitech M185"));
        hub.plugIn(new USBPhone("Samsung S23", 45));
        hub.processAll();
    }
}

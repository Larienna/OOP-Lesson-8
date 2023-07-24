package Task3;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung",120,"AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120f, "AB1234567CD", 1280, 1024);
        EthernetAdapter adapter = new EthernetAdapter("Asus", 50f, "XY9876543AB", 1000, "12:34:56:78:90:AB");

        System.out.println(device.toString());
        System.out.println(monitor.toString());
        System.out.println(adapter.toString());
    }
}

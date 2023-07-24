package Task4;

import java.util.Objects;

public class Device {  // основной класс-родитель
    private String manufacturer;
    private float price;
    private String serialNumber;

    // добавляем конструктор:
    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    // и добавляем методы доступа:
    // Геттеры и сеттеры
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Device)) return false;
        Device device = (Device) obj;
        return Float.compare(device.price, price) == 0 &&
                Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}

//наследуют родителя и добавляют собственные свойства и методы
class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber); //вызывает конструктор класса Task2.Device и передаем ему аргументы: manufacturer, price, serialNumber
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Monitor)) return false;
        if (!super.equals(obj)) return false; // проверяем равенство базовых классов Device с super.equals(obj)
        Monitor monitor = (Monitor) obj;
        return resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }
}

class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EthernetAdapter)) return false;
        if (!super.equals(obj)) return false;
        EthernetAdapter that = (EthernetAdapter) obj;
        return speed == that.speed &&
                Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем объекты классов и продемонстрируем переопределенные методы equals и hashCode

        Device device1 = new Device("Samsung", 120f, "AB1234567CD");
        Device device2 = new Device("Samsung", 120f, "AB1234567CD");

        System.out.println("Device1 equals Device2: " + device1.equals(device2));
        System.out.println("Device1 hashCode: " + device1.hashCode());
        System.out.println("Device2 hashCode: " + device2.hashCode());

        Monitor monitor1 = new Monitor("Samsung", 120f, "AB1234567CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120f, "AB1234567CD", 1280, 1024);

        System.out.println("Monitor1 equals Monitor2: " + monitor1.equals(monitor2));
        System.out.println("Monitor1 hashCode: " + monitor1.hashCode());
        System.out.println("Monitor2 hashCode: " + monitor2.hashCode());

        EthernetAdapter adapter1 = new EthernetAdapter("Asus", 50f, "XY9876543AB", 1000, "12:34:56:78:90:AB");
        EthernetAdapter adapter2 = new EthernetAdapter("Asus", 50f, "XY9876543AB", 1000, "12:34:56:78:90:AB");

        System.out.println("Adapter1 equals Adapter2: " + adapter1.equals(adapter2));
        System.out.println("Adapter1 hashCode: " + adapter1.hashCode());
        System.out.println("Adapter2 hashCode: " + adapter2.hashCode());
    }
}
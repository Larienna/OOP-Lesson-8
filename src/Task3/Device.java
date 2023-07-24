package Task3;

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

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Device: manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber;
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
    // Переопределение метода toString
    @Override
    public String toString() {
        return "Monitor: manufacturer = " + getManufacturer() +
                ", price = " + getPrice() +
                ", serialNumber = " + getSerialNumber() +
                ", X = " + resolutionX +
                ", Y = " + resolutionY;
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
    // Методы доступа (геттеры и сеттеры) для скорости и MAC-адреса
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

    // Переопределение метода toString
    @Override
    public String toString() {
        return "EthernetAdapter: manufacturer = " + getManufacturer() +
                ", price = " + getPrice() +
                ", serialNumber = " + getSerialNumber() +
                ", speed = " + speed +
                ", mac = " + mac;
    }
}

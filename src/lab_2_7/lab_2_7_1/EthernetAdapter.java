package lab_2_7.lab_2_7_1;

/**
 * Created by olegpoberezhets on 16.02.17.
 */
public class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return  super.toString() + ", price=" + price + ", mac='" + mac + '\'' + ", serialNumber='" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        if (!mac.equals(that.mac)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
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
}

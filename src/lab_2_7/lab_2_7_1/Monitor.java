package lab_2_7.lab_2_7_1;

/**
 * Created by olegpoberezhets on 16.02.17.
 */
public class Monitor extends Device {
    int resolutionX;
    int getResolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int getResolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.getResolutionY = getResolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return getResolutionY == monitor.getResolutionY;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", resolutionX=" + resolutionX +
                ", price=" + price +
                ", getResolutionY=" + getResolutionY +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getGetResolutionY() {
        return getResolutionY;
    }

    public void setGetResolutionY(int getResolutionY) {
        this.getResolutionY = getResolutionY;
    }
}

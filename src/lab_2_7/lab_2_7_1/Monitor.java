package lab_2_7.lab_2_7_1;

/**
 * Created by olegpoberezhets on 16.02.17.
 */
public class Monitor extends Device {
    int resolutionX;
    int ResolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int ResolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.ResolutionY = ResolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return ResolutionY == monitor.ResolutionY;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return  super.toString() +
//                "manufacturer='" + manufacturer + '\'' +
//                ", resolutionX=" + resolutionX +
//                ", price=" + price +
                ", getResolutionY=" + ResolutionY +
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
        return ResolutionY;
    }

    public void setGetResolutionY(int getResolutionY) {
        this.ResolutionY = getResolutionY;
    }
}

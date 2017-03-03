package lab_2_1;

/**
 *
 *
 * Write Computer class, the attributes of this class is manufacturer (of String type),
 * serialNumber (of int type), price (of float type), quantityCPU (of int type)
 * and frequencyCPU (of int type).
 *
 * Created by olegpoberezhets on 28.01.17.
 */
public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public Computer(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }
    public void viewCompute() {
        System.out.println("Manufacture: " + this.getManufacturer() + ";" + " Serial number: " + this.serialNumber + ";" + " Price: "
                + this.getPrice() + ";" + " CPU amount " + this.getQuantityCPU() + ";" + " Frequency: " + this.getFrequencyCPU());
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }
}



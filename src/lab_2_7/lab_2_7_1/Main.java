package lab_2_7.lab_2_7_1;

import java.util.Arrays;

/**
 * Created by olegpoberezhets on 25.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[0];

        devices = addDeviceToDevices(devices, new Monitor("Philips", 234.00F ,  "323" , 1980, 1020));
        devices = addDeviceToDevices(devices, new EthernetAdapter("Intel", 120.00F, "212",1000, "00:00:01:E4:2F:23"));
        for (Device device : devices) {
            System.out.println(device.toString());

        }
    }

        public static Device[] addDeviceToDevices(Device[] devices, Device newDevice) {
            Device[] newDevicesArray = Arrays.copyOf(devices, devices.length + 1);
            newDevicesArray[newDevicesArray.length - 1] = newDevice;
            return newDevicesArray;
        }
    }


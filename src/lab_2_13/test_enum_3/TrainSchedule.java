package lab_2_13.test_enum_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by olegpoberezhets on 3/25/17.
 */
public class TrainSchedule {

    private final int nTrains;
    /*
        2) Add to class TrainSchedule private field trains as array of Train
         and constructor with one parameter to allocate memory to the schedule.
         */
     private  ArrayList<Train> trains = new ArrayList<Train>();


    public TrainSchedule(int nTrains){
        this.nTrains = nTrains;
        //add nTrains raw in shedule array

    };

    /*
    3)Add to class TrainSchedule public method addTrain() without parameters, which read
    from console (using System.in and Scanner) all information on train, then to create
    new Train object and pass it to next available array element.

    4)Add to class TrainSchedule public method printTrains() which iterates over trains
    array in loop and print all information of each train to console.
    */

    public void addTrain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Train number NNN: ");
        int number = scanner.nextInt();
        Train  train = new Train(number);
        System.out.println("Station Dispatch: ");
        train.setStationDispatch(scanner.next());
        System.out.println("Station Arrival: ");
        train.setStationArrival(scanner.next());
        System.out.println("Time Dispatch HH:MM : ");
        train.setTimeDispatch(scanner.next());
        System.out.println("Time Arrival HH:MM : ");
        train.setTimeArrival(scanner.next());
        System.out.println("Date of week" +
//                "(number of day of week, ex.: if Monday: 1, if Tuesday: 2,... )" +
                ":  ");
        train.setDays(DayOfWeek.valueOf(scanner.next()));



    }

    private class Train {
        int number;
        String stationDispatch;
        String stationArrival;
        String timeDispatch;
        String timeArrival;
        DayOfWeek[] days;

        Train(int trainNumber) {
            this.number = trainNumber;

        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDays() {
            return days;
        }

        public void setDays(DayOfWeek days) {
//            this.days = days;

        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + Arrays.toString(days) +
                    '}';
        }
    }

    public static void main(String[] args) {
        TrainSchedule trainSchedule = new TrainSchedule(2);
        System.out.println(trainSchedule.toString());
    }
}

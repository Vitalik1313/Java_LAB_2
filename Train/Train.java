package Train;

import java.time.*;
import java.util.Scanner;

public class Train {
    private String destination;
    private int trainNumb;
    private String time;
    private int placesGeneral;
    private int compartment, firstClass, deluxe;

    public Train(){
        System.out.println("\nEnter info about train:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter destination:");
        destination = scanner.nextLine();

        System.out.print("Enter a number:");
        trainNumb = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a time(example: 12:44):");
        time = scanner.nextLine();

        System.out.print("Enter a number of general places:");
        placesGeneral = scanner.nextInt();

        System.out.print("Enter a number of compartment places:");
        compartment = scanner.nextInt();
        System.out.print("Enter a number of firstClass places:");
        firstClass = scanner.nextInt();
        System.out.print("Enter a number of deluxe places:");
        deluxe = scanner.nextInt();

    }

    public Train(String destination,int trainNumb,String time,int placesGeneral,int compartment, int firstClass, int deluxe ){
        this.destination = destination;
        this.trainNumb = trainNumb;
        this.time = time;
        this.placesGeneral = placesGeneral;
        this.compartment = compartment;
        this.firstClass = firstClass;
        this.deluxe = deluxe;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumb() {
        return trainNumb;
    }

    public String getTime() {
        return time;
    }

    public int getPlacesGeneral() {
        return placesGeneral;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrainNumb(int trainNumb) {
        this.trainNumb = trainNumb;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPlacesGeneral(int placesGeneral) {
        this.placesGeneral = placesGeneral;
    }

    public void setCompartment(int compartment) {
        this.compartment = compartment;
    }

    public void setFirstClass(int firstClass) {
        this.firstClass = firstClass;
    }

    public void setDeluxe(int deluxe) {
        this.deluxe = deluxe;
    }

    public int getCompartment() {
        return compartment;
    }

    public int getFirstClass() {
        return firstClass;
    }

    public int getDeluxe() {
        return deluxe;
    }

    public String toString() {
        return "Train {" +
                "destination = '" + destination + '\'' +
                ", trainNumb = " + trainNumb +
                ", time = '" + time + '\'' +
                ", placesGeneral = " + placesGeneral +
                '}';
    }

    static public void trainsToDest(Train [] trains,String dest){
        System.out.println("\nTrains with destination " + dest + ":");
        for(int i = 0; i < trains.length;i++){
            if((trains[i].destination).equals(dest) == true){
                System.out.println(trains[i]);
            }
        }
    }

    static public void trainsToDestInTime(Train [] trains,String dest,String timeMain){
        int hourMain, hour, minMain, min;
        LocalTime time1, time2;
        String strHourMain, strHour, strMinMain, strMin;
        System.out.println("\nTrains with destination " + dest + " after " + timeMain + ": ");

        strHourMain = timeMain.substring(0,2);
        strMinMain = timeMain.substring(3,5);
        hourMain = Integer.parseInt(strHourMain);
        minMain = Integer.parseInt(strMinMain);

        time1 = LocalTime.of(hourMain,minMain);

        for(int i = 0; i < trains.length;i++){
            strHour = trains[i].time.substring(0,2);
            strMin = trains[i].time.substring(3,5);
            hour = Integer.parseInt(strHour);
            min = Integer.parseInt(strMin);

            time2 = LocalTime.of(hour,min);

            if(((trains[i].destination).equals(dest) == true) && (time2.compareTo(time1) > 0)){
                System.out.println(trains[i]);
            }
        }
    }

    static public void trainsToDestWithPlaces(Train [] trains,String dest){
        System.out.println("\nTrains to " + dest + " with free general places:");
        for(int i = 0; i < trains.length;i++){
            if(((trains[i].destination).equals(dest) == true) && (trains[i].placesGeneral > 0)){
                System.out.println(trains[i]);
            }
        }
    }
}

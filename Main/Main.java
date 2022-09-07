package Main;

import Train.Train;

public class Main {
    public static void main(String[] args) {
        Train [] trains = new Train[3];

        for(int i =0;i<trains.length;i++){
            trains[i] = new Train();
        }

        Train.trainsToDest(trains,"Lviv");
        Train.trainsToDest(trains,"Kyiv");
        Train.trainsToDestInTime(trains,"Lviv","12.00");
        Train.trainsToDestInTime(trains,"Kyiv","15.00");
        Train.trainsToDestWithPlaces(trains,"Lviv");
    }
}


package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Car> CarList = new ArrayList<>();
        List<Truck> TruckList = new ArrayList<>();
        String input = scanner.nextLine();
        double carAvg =0;
        double truckAvg =0;
        double powerSumCars =0;
        double powerSumTrucks =0;
        while (!input.equals("End")) {
            //input -> danni za daden vehicle
            //input = "type car/truck[0]  model[1] color[2] power[3]"
            String type=input.split("\\s+")[0];
            String model =input.split("\\s+")[1];
            String color =input.split("\\s+")[2];
            int horsePower =Integer.parseInt(input.split("\\s+")[3]);
//podavame tezi danni v nashiq obekt
            if (type.equals("car")) {
                Car Car = new Car(type, model, color, horsePower);
                //dobavqme go kum spisuk
                CarList.add(Car);

            } else if (type.equals("truck")) {
                Truck Truck = new Truck(type, model, color, horsePower);
                //dobavqme go kum spisuk
                TruckList.add(Truck);

            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
while (!input.equals("Close the Catalogue")){
    //we are receiving models of vehicles
String model =input;
    for (Car car:CarList) {
        if (car.getModel().equals(model)) {
            System.out.println(car.toString());
        }
    }
    for (Truck truck : TruckList) {
        if (truck.getModel().equals(model)) {
            System.out.println(truck.toString());
        }
    }
    input= scanner.nextLine();
}
if (!CarList.isEmpty()){
    //sumirame moshtnostta na vsichki koli, koito sa v nashiq car list chrez for each cicle
    for (Car car:CarList) {
        powerSumCars+=car.getHorsePower();
    }
    //namirame avg. power, deleiki sumata power na brow koli/ duljinata na spisuka
    carAvg =powerSumCars / CarList.size();
}
//printirame
        System.out.printf("Cars have average horsepower of: %.2f.%n",carAvg);
        if (!TruckList.isEmpty()){
            //sumirame moshtnostta na vsichki koli, koito sa v nashiq car list chrez for each cicle
            for (Truck truck:TruckList) {
                powerSumTrucks+=truck.getHorsePower();
            }
            //namirame avg. power, deleiki sumata power na brow trucks/ duljinata na spisuka
            truckAvg =powerSumTrucks / TruckList.size();
        }
//printirame
        System.out.printf("Trucks have average horsepower of: %.2f.%n",truckAvg);
}
    }






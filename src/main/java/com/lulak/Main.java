package com.lulak;

import com.lulak.builder.CarBuilder;
import com.lulak.factory.CarPartsFactory;
import com.lulak.factory.OffRoadFactory;
import com.lulak.factory.SportCarFactory;
import com.lulak.model.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vítejte v konfigurátoru vozidel");
        System.out.println("Vyberte si řadu vozu");
        System.out.println("1 - Sportovní řada");
        System.out.println("2 - Off-road řada");

        int choice = scanner.nextInt();
        scanner.nextLine();

        CarPartsFactory factory;
        String modelName;

        if(choice == 1){
            factory = new SportCarFactory();
            modelName = "Sport Edition";
        }else{
            factory = new OffRoadFactory();
            modelName = "Adventure 4x4";
        }

        var engine = factory.createEngine();
        var suspension = factory.createSuspension();

        System.out.println("Zadejte barvu vozu: ");
        String color = scanner.nextLine();

        System.out.println("Přejete si GPS navigaci? (ano/ne): ");
        boolean gps = scanner.nextLine().equalsIgnoreCase("ano");

        Car car = new CarBuilder()
                .setModelName(modelName)
                .setEngine(engine)
                .setSuspension(suspension)
                .setColor(color)
                .setGpsNavigator(gps)
                .build();

        System.out.println("\nVýsledek vaší konfigurace: ");
        System.out.println(car);
    }
}

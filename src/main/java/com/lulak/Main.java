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
        System.out.println("Vitejte v konfiguratoru vozidel");
        System.out.println("Vyberte si radu vozu");
        System.out.println("1 - Sportovni rada");
        System.out.println("2 - Off-road rada");

        int choice = scanner.nextInt();
        scanner.nextLine();

        CarPartsFactory factory;
        String modulName;

        if(choice == 1){
            factory = new SportCarFactory();
            modulName = "Sport Edition";
        }else{
            factory = new OffRoadFactory();
            modulName = "Adventure 4x4";
        }

        var engine = factory.createEngine();
        var suspension = factory.createSuspension();

        System.out.println("Zadejte barvu vozu: ");
        String color = scanner.nextLine();

        System.out.println("Prejete si GPS navigaci? (ano/ne): ");
        boolean gps = scanner.nextLine().equalsIgnoreCase("ano");

        Car car = new CarBuilder()
                .setModelName(modulName)
                .setEngine(engine)
                .setSuspension(suspension)
                .setColor(color)
                .setGpsNavigator(gps)
                .build();

        System.out.println("\nVysledek vasi konfigurace: ");
        System.out.println(car);
    }
}

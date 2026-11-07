package com.lulak;

import com.lulak.adapter.RegistryAdapter;
import com.lulak.adapter.RegistryTarget;
import com.lulak.builder.CarBuilder;
import com.lulak.decorator.PremiumAudioDecorator;
import com.lulak.decorator.SportSpoilerDecorator;
import com.lulak.external.OldRegistrySystem;
import com.lulak.factory.CarPartsFactory;
import com.lulak.factory.OffRoadFactory;
import com.lulak.factory.SportCarFactory;
import com.lulak.model.Car;
import com.lulak.model.CarComponent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Vítejte v konfigurátoru vozidel ===");
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

        // 1. Sestaveni auta pomoci builderu
        Car car = new CarBuilder()
                .setModelName(modelName)
                .setEngine(engine)
                .setSuspension(suspension)
                .setColor(color)
                .setGpsNavigator(gps)
                .build();

        System.out.println("\nVýsledek vaší konfigurace: ");
        System.out.println(car);

        //2. Vyuziti decoratoru - priplatkova vybava
        CarComponent finalVehicle = car;
        System.out.println("Přejete si přikoupit Prémiové Surround Audio (+25 000 Kč)? (ano/ne):");
        if(scanner.nextLine().equalsIgnoreCase("ano")){
            finalVehicle = new PremiumAudioDecorator(finalVehicle);
            System.out.println("-> Audio úspěšně přidáno.");
        }
        System.out.println("Přejete si přikoupit Sportovní spoiler (+15 000 Kč)? (ano/ne):");
        if(scanner.nextLine().equalsIgnoreCase("ano")){
            finalVehicle = new SportSpoilerDecorator(finalVehicle);
            System.out.println("-> Sportovní spoiler úspěšně přidán.");
        }

        System.out.println("\nFinální specifikace a cena:");
        System.out.println("Popis: " + finalVehicle.getDescription());
        System.out.println("Celková cena: " + finalVehicle.getPrice() + " Kč");

        //3. Vyuziti adapteru - registrace vozidla pres stary system
        System.out.println("\nPřejete si vůz zaregistrovat na úřadě? (ano/ne)");
        if(scanner.nextLine().equalsIgnoreCase("ano")){
            System.out.println("Zadejte jméno majitele:");
            String owner = scanner.nextLine();

            //Vytvorime instanci stareho systemu a obalime ji adapterem
            OldRegistrySystem oldRegistrySystem = new OldRegistrySystem();
            RegistryTarget registry = new RegistryAdapter(oldRegistrySystem);

            //Registrace probehne pres jednotne rozrani
            registry.registerCar(owner, car);
        }

        scanner.close();
    }
}

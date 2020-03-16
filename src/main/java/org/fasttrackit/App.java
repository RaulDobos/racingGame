package org.fasttrackit;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //Game game = new Game();
        //game.start();

        Vehicle vehicle1 = new Vehicle();
        //vehicle1.totalVehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        //vehicle2.totalVehicleCount = 2;

        //Vehicle.totalVehicleCount = 50;

        //System.out.println("Total count from vehicle1: " + vehicle1.totalVehicleCount);
        //System.out.println("Total count from vehicle2: " + vehicle2.totalVehicleCount);
        //System.out.println("Total count from Vehicle Class: " + Vehicle.totalVehicleCount);

//        System.out.println("Please enter vehicle name: ");
//        Scanner scanner = new Scanner(System.in);
//        String vehicleName = scanner.nextLine();
//
//        Scanner scanner2 = new Scanner(System.in);
//        int enteredNumber = scanner2.nextInt();
//
//        System.out.println("Entered name: " + vehicleName);
//
//        System.out.println( "Welcome to the racing game!" );
//
        Engine engine1 = new Engine();

        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        Car carReference = new Car(engine1);

        carReference.setName("Audi");
        carReference.setColor("red");
        carReference.setMaxSpeed("260");
        carReference.setMileage(6.2);
        carReference.setFuelLevel(100);
        carReference.setDamaged(true);

        System.out.println("Name: " + carReference.getName());
//
////        carReference.engine = new Engine();
////        carReference.engine.manufacturer = "VW";
////        carReference.engine.capacity = 2000;
//
//
//        double currentDistance = carReference.accelerate(60, 1);
//
//        System.out.println("Current distance: " + currentDistance);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//
//        System.out.println("Is car damaged? " + carReference.damaged);
//
//        // One object with 2 references
//        System.out.println("Engine details: ");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine. capacity);
//
//        //concatenation
//        System.out.println("Properties of " + carReference.name + ":");
//        System.out.println("color: " + carReference.color);
//        System.out.println("Maximum Speed: " + carReference.maxSpeed);
//        System.out.println("Mileage: " + carReference.mileage);
//        System.out.println("Fuel level: " + carReference.fuelLevel);
//        System.out.println("Racing number: " + carReference.racingNumber);
//        System.out.println("Damaged: " + carReference.damaged);
//
//        Car car2 = new Car(new Engine());
//
//        car2.name = "Lamborghini";
//        car2.damaged = true;
//
//        System.out.println("Properties of " + car2.name);
//        System.out.println("Color: " + car2.color);
//        System.out.println("Damage: " + car2.damaged);

        //LocalDate newDate1 = LocalDate.now().minusMonths(2);
        //LocalDate newDate2 = LocalDate.of(2010, 3, 10);

    }
}


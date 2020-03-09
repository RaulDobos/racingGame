package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the racing game!" );

        Car carReference = new Car();

        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;

//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;

        Engine engine1 = new Engine();

        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        carReference.engine = engine1;

        // One object with 2 references
        System.out.println("Engine details: ");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine. capacity);

        engine1.capacity = 2100;

        System.out.println("Engine details: ");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine. capacity);

        //concatenation
        System.out.println("Properties of " + carReference.name + ":");
        System.out.println("color: " + carReference.color);
        System.out.println("Maximum Speed: " + carReference.maxSpeed);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing number: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);

        Car car2 = new Car();

        car2.name = "Lamborghini";
        car2.damaged = true;

        System.out.println("Properties of " + car2.name);
        System.out.println("Color: " + car2.color);
        System.out.println("Damage: " + car2.damaged);

        //LocalDate newDate1 = LocalDate.now().minusMonths(2);
        //LocalDate newDate2 = LocalDate.of(2010, 3, 10);
    }
}


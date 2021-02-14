package se.lexicon;

import se.lexicon.magic.JsonIO;
import se.lexicon.model.Car5;
import se.lexicon.model.Car6;
import se.lexicon.methods.TextWorker;
import se.lexicon.model.Owner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {

        //Make "home" mapp and an empty "sverige.txt" inside
        TextWorker.makePlace();

        //Add text to file (lyrics to the song)
        TextWorker.addLyricsToSong();

        //Read from file EXERCISE # 1
        System.out.println("EXERCISE 1");
        System.out.println("----------------------------------");
        File file = new File("home/sverige.txt");
        TextWorker.readText(file);
        System.out.println("----------------------------------");
        //EXERCISE # 2 Buffered Reader
        File destination = new File("home/names.txt");
        System.out.println("EXERCISE 2");
        System.out.println("----------------------------------");
        TextWorker.writeNamesToFile(destination, "Allan\nKalle\nPelle\nNisse");
        //EXERCISE # 2 Buffered Writer
        File url = new File("home/names.txt");
        for (String string: TextWorker.readIntoCollection(url)) {
            System.out.println(string);
        }
        System.out.println("----------------------------------");
        System.out.println("EXERCISE 3");
        System.out.println("----------------------------------");
        //EXERCISE # 3
        List<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Brown");
        System.out.println("----------------------------------");
        File newFile = new File("home/colors.txt");
        TextWorker.fromCollectionToFile(newFile, colors);
        System.out.println("EXERCISE 4");
        System.out.println("----------------------------------");
        //EXERCISE # 4
        File logga = new File("C:\\Users\\Ola\\Desktop\\Java_g34\\afs_logga.jpg");
        File home = new File("home/afs_logga_copy.jpg");
        TextWorker.copy(logga,home);
        System.out.println("----------------------------------");
        //EXERCISE # 5
        List<Car5> oldCars = new ArrayList<>();

        Car5 amazon = new Car5(1, "OOP555", "Volvo","Amazon");
        Car5 p1800 = new Car5(2, "VOV180", "Volvo","P 1800");
        Car5 v4 = new Car5(3, "VVV444", "Saab","V 4");
        Car5 manta = new Car5(4, "OPE313", "Opel","Manta");
        Car5 ascona = new Car5(5, "ASC918", "Opel","Ascona");

        oldCars.add(amazon);
        oldCars.add(p1800);
        oldCars.add(v4);
        oldCars.add(manta);
        oldCars.add(ascona);



        // 5b
        System.out.println("EXERCISE 5b");
        System.out.println("----------------------------------");
        TextWorker.saveToList(oldCars, "cars.ser");
        System.out.println("----------------------------------");


        // 5c
        System.out.println("EXERCISE 5c");
        System.out.println("----------------------------------");
        String filePath = "cars.ser";
        List<Car5> cars = TextWorker.readFromTarget(filePath);
        for (Car5 car : oldCars)
            System.out.println(car.toString());
        System.out.println("----------------------------------");


        // 6
        List<Owner> owners = new ArrayList<>();

        Owner nisse = new Owner("Nisse", "1900-01-01");
        Owner kalle = new Owner("Kalle", "1920-06-07");
        Owner ola = new Owner("Ola", "1970-06-04");
        Owner peenut = new Owner("Peenut", "1980-06-16");
        Owner agneta = new Owner("Agneta", "1968-04-19");

        owners.add(nisse);
        owners.add(kalle);
        owners.add(ola);
        owners.add(peenut);
        owners.add(agneta);

        List<Car6> newCars = new ArrayList<>();

        Car6 volvo = new Car6("KUL 555", "Volvo", "V70", "2005-05-07", nisse);
        Car6 fiat = new Car6("UNO 111", "Fiat", "Uno", "2008-05-12", kalle);
        Car6 porsche = new Car6("CAR 924", "Porsche", "Carrera", "1988-06-28", ola);
        Car6 ford = new Car6("MUS 777", "Ford", "Mustang", "1980-06-16", peenut);
        Car6 seat = new Car6("ESP 123", "Seat", "Leon", "2010-03-21", agneta);

        newCars.add(volvo);
        newCars.add(fiat);
        newCars.add(porsche);
        newCars.add(ford);
        newCars.add(seat);


        System.out.println("EXERCISE 6e");
        System.out.println("----------------------------------");
        JsonIO serialize = new JsonIO();
        File resultCars = new File("newCars.json");
        serialize.serializeCarsListToJson(newCars, resultCars);
        System.out.println("----------------------------------");

        System.out.println("EXERCISE 6f");
        System.out.println("----------------------------------");
        List<Car6> deserialized = serialize.deserializeJsonListToCars(resultCars);
        System.out.println(deserialized.toString());
        System.out.println("----------------------------------");


    }
}

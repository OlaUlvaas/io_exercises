package se.lexicon;


import se.lexicon.model.Car;
import se.lexicon.model.TextWorker;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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
        List<Car> cars = new ArrayList<>();
        Car volvo = new Car(1, "KUL 555", "Volvo", "V70");
        Car fiat = new Car(2, "UNO 111", "Fiat", "Uno");
        Car porsche = new Car(3, "CAR 924", "Porsche", "Carrera");
        Car ford = new Car(4, "MUS 777", "Ford", "Mustang");
        Car seat = new Car(5, "ESP 123", "Seat", "Leon");
        cars.add(volvo);
        cars.add(fiat);
        cars.add(porsche);
        cars.add(ford);
        cars.add(seat);

        // 5b
        System.out.println("EXERCISE 5b");
        System.out.println("----------------------------------");
        TextWorker.saveToList(cars, "cars.ser");
        System.out.println("----------------------------------");


        // 5c
        System.out.println("EXERCISE 5c");
        System.out.println("----------------------------------");
        String filePath = "cars.ser";
        List<Car> myCars = TextWorker.readFromTarget(filePath);
        for (Car car : myCars)
            System.out.println(car.toString());
        System.out.println("----------------------------------");
    }





}

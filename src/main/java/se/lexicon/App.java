package se.lexicon;


import se.lexicon.model.TextWorker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        File file = new File("home/sverige.txt");
        TextWorker.readText(file);

        //EXERCISE # 2 Buffered Reader
        File destination = new File("home/names.txt");
        System.out.println("----------------------------------");
        TextWorker.writeNamesToFile(destination, "Allan\nKalle\nPelle\nNisse");
        //EXERCISE # 2 Buffered Writer
        File url = new File("home/names.txt");
        for (String string: TextWorker.readIntoCollection(url)) {
            System.out.println(string);
        }
        System.out.println("----------------------------------");
        //EXERCISE # 3
        List<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Brown");

        File newFile = new File("home/colors.txt");
        TextWorker.fromCollectionToFile(newFile, colors);
        System.out.println("----------------------------------");

    }

}

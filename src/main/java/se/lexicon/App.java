package se.lexicon;


import se.lexicon.model.TextWorker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App
{
    public static void main( String[] args ) {

        //Make "home" mapp and an empty "sverige.txt" inside
        TextWorker.makePlace();

        //Add text to file (lyrics to the song)
        TextWorker.addLyricsToSong();

        ////Read from file EXERCISE # 1
        File file = new File("home/sverige.txt");
        TextWorker.readText(file);
    }

}

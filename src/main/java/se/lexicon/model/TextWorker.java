package se.lexicon.model;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class TextWorker {


    //Make "home" mapp and an empty "sverige.txt" inside
    public static void makePlace(){
        try {
            Path testPath = Paths.get("home");

            if (!Files.exists(testPath)){
                Files.createDirectory(testPath);
                Files.createFile(testPath.resolve("sverige.txt"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Add text to file (lyrics to the song)
    public static void addLyricsToSong(){
        FileSystem fileSystem= FileSystems.getDefault();
        Path path= fileSystem.getPath("home/sverige.txt");
        String content = "Sverige, Sverige\n" +
                "Sverige, fosterland\n" +
                "Vår längtans bygd,\n" +
                "Vårt hem på jorden.\n" +
                "Nu spela källorna,\n" +
                "Där härar lysts av brand,\n" +
                "Och dåd blev saga,\n" +
                "Men med hand vid hand\n" +
                "Svär än ditt folk som förr\n" +
                "De gamla trohetsorden.\n" +
                "\n" +
                "Fall, julesnö,\n" +
                "Och susa, djupa mo\n" +
                "Brinn, österstjärna\n" +
                "Genom junikvällen\n" +
                "Sverige, moder\n" +
                "Bliv vår strid, vår ro,\n" +
                "Du land,\n" +
                "Där våra barn än gång få bo\n" +
                "Och våra fäder sova\n" +
                "Under kyrkohällen.";


        try {
            Files.write(path,content.getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Read from file EXERCISE # 1
    public static String readText(File source) {
        StringBuilder sb = new StringBuilder();
        try (
                FileReader reader = new FileReader(source)
        ) {
            int i;
            while ((i = reader.read()) != -1) {
                // append to string
                char letter = (char) i;
                sb.append(letter);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


}

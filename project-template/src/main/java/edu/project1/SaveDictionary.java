package edu.project1;

import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import static edu.project1.HangmanGame.FILE_NAME;
import static edu.project1.HangmanGame.dictionary;


public class SaveDictionary {

    private SaveDictionary() {

    }

    @SuppressWarnings("RegexpSinglelineJava")
    public static void save() {
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME));
            String json = Jsoner.serialize(dictionary);
            json = Jsoner.prettyPrint(json);
            writer.write(json);
            writer.close();
            System.out.println("Dictionary saved successfully");
        } catch (SecurityException e) {
            System.out.printf("Do not have sufficient rights to write file %s\n", FILE_NAME);
        } catch (Exception ex) {
            System.out.printf("Error while saving file! %s\n", ex.getMessage());
        }
    }
}

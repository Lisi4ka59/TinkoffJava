package edu.project1;

import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import static edu.project1.HangmanGame.dictionary;
import static edu.project1.HangmanGame.fileName;

public class SaveDictionary {
    public static void save() {
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName));
            String json = Jsoner.serialize(dictionary);
            json = Jsoner.prettyPrint(json);
            writer.write(json);
            writer.close();
            System.out.println("Dictionary saved successfully");
        } catch (SecurityException e) {
            System.out.printf("Do not have sufficient rights to write file %s\n", fileName);
        } catch (Exception ex) {
            System.out.printf("Error while saving file! %s\n", ex.getMessage());
        }
    }
}

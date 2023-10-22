package edu.project1;


import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import static edu.project1.HangmanGame.FILE_NAME;
import static edu.project1.HangmanGame.dictionary;


public class LoadDictionary {

    private LoadDictionary() {

    }

    @SuppressWarnings("RegexpSinglelineJava")
    public static void load() {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(FILE_NAME));
            JsonObject jsonObject = (JsonObject) Jsoner.deserialize(reader);
            dictionary.dictionarySet(jsonObject);
            System.out.println("Словарь загружен");

        } catch (JsonException | IllegalArgumentException | NullPointerException e) {
            System.out.printf("Can not upload dictionary, data in the file incorrect! %s\n", e.getMessage());
        } catch (SecurityException e) {
            System.out.printf("Do not have sufficient rights to read file %s\n", FILE_NAME);
        } catch (IOException e) {
            System.out.printf("Can not upload dictionary, the file %s does not exist!\n", FILE_NAME);
        }
    }
}

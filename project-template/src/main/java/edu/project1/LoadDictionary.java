package edu.project1;


import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import static edu.project1.HangmanGame.dictionary;
import static edu.project1.HangmanGame.fileName;

public class LoadDictionary {
    public static void load(){
        try {
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            JsonObject jsonObject = (JsonObject) Jsoner.deserialize(reader);
            dictionary.dictionarySet(jsonObject);
            System.out.println("Collection uploaded");




        } catch (JsonException | IllegalArgumentException | NullPointerException e) {
            e.printStackTrace();
            System.out.printf("Can not upload collection, data in the file incorrect! %s\n", e.getMessage());
        } catch (SecurityException e) {
            System.out.printf("Do not have sufficient rights to read file %s\n", fileName);
        } catch (IOException e) {
            System.out.printf("Can not upload collection, the file %s does not exist!\n", fileName);
        }
    }
}

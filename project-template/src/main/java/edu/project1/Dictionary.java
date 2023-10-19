package edu.project1;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Dictionary implements Jsonable {
    public ConcurrentMap<String, Integer> wordDictionary = new ConcurrentHashMap<>();
    public void dictionarySet (JsonObject jsonObject) {
        ConcurrentMap<String, Integer> hashMap = new ConcurrentHashMap<>();
        int i = 0;
        for (String key : jsonObject.keySet()) {
            String[] difficult = jsonObject.get(key).toString().replace("}", "").replace("{", "").trim().split("=");
            Integer integerValue = Integer.parseInt(difficult[1]);
            hashMap.put(key, integerValue);
        }
        this.wordDictionary = hashMap;
    }
    @Override
    public String toJson() {
        final StringWriter writable = new StringWriter();
        try {
            this.toJson(writable);
        } catch (final IOException ignored) {}
        return writable.toString();
    }

    @Override
    public void toJson(Writer writer) throws IOException {
        final JsonObject json = new JsonObject();
        json.put("words", this.wordDictionary);
        json.toJson(writer);
    }
}

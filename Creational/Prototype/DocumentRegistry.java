package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private Map<String, Document> prototypes = new HashMap<>();

    public void register(String key, Document document){
        prototypes.put(key, document);
    }

    public Document create(String key){
        Document prototype = prototypes.get(key);
        if(prototype == null){
            throw new IllegalArgumentException("Prototype not found "+ key);
        }
        return prototype.clone();
    }


}

package se.lexicon.magic;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import se.lexicon.model.Car6;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonIO {
    private ObjectMapper objectMapper;

    public JsonIO(){
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.registerModule(new JavaTimeModule());
    }

    public void serializeCarsListToJson(List<Car6> cars, File file){
        try {
            if (!file.exists())
                file.createNewFile();
            objectMapper.writeValue(file,cars);
            System.out.println("Operation is Done.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Car6> deserializeJsonListToCars(File file){
        List<Car6> newCars = new ArrayList<>();
        try{
            newCars = objectMapper.readValue(file, new TypeReference<List<Car6>>() {});
        } catch (JsonParseException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newCars;
    }
}

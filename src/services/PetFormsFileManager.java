package services;

import enums.PetProp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PetFormsFileReader {
    private final Scanner scanner = new Scanner(System.in);
    private final static Map<String, PetProp> questionKeywordMap = Map.of(
            "tipo", PetProp.TYPE,
            "nome", PetProp.FULLNAME,
            "idade", PetProp.AGE,
            "peso", PetProp.WEIGHT,
            "raça", PetProp.BREED,
            "sexo", PetProp.SEX,
            "endereço", PetProp.FOUND_LOCATION
    );

    public

    private PetProp resolveProp(String question) {
        for(Map.Entry<String, PetProp> entry : questionKeywordMap.entrySet()){
            if(question.toLowerCase().contains(entry.getKey())){
                return entry.getValue();
            }

            return null;
        }
    }
}

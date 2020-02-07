package com.ceri.tp1;

import java.util.HashMap;

public class AnimalList {

    private static HashMap<String, Animal> hashMap = init();

    private static HashMap<String, Animal> init() {
        HashMap<String, Animal> res = new HashMap<>();
        res.put("Ours brun", new Animal(40, "bear", 210, 0.5f, 278, "préoccupation mineure"));
        res.put("Chameau", new Animal(36, "camel", 395, 36f, 475, "préoccupation mineure"));
        res.put("Montbéliarde", new Animal(8, "cow", 288, 190f, 900, "préoccupation mineure"));
        res.put("Renard roux", new Animal(21, "fox", 52, 0.1f, 4, "préoccupation mineure"));
        res.put("Koala", new Animal(22, "koala", 35, 0.4f, 9, "vulnérable"));
        res.put("Lion", new Animal(27, "lion", 108, 1.3f, 180, "vulnérable"));
        res.put("Panda géant", new Animal(37, "panda", 130, 0.1f, 118, "vulnérable"));
        return res;
    }

    public static String[] getNameArray() {
        return hashMap.keySet().toArray(new String[hashMap.size()]);
    }

    public static Animal getAnimal(String name) {
        return hashMap.get(name);
    }


}



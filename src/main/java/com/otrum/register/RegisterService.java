package com.otrum.register;

import java.util.ArrayList;
import java.util.List;

public class RegisterService {
    private static List<Person> registeredPersonsList = new ArrayList<>();

    public static List<Person> getRegister() {
        return registeredPersonsList;
    }
    
    public static void updateRegister(final List<Person> persons) {
        registeredPersonsList = persons;
    }
}
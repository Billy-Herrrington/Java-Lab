package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int id;
    private String name;

    public Animal() {
        super();
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void animals() {
        System.out.println("Наїлись та спить");
    }

    public String toString() {
        //У Java valueOf() повертає строкове представлення переданного аргументу.
        String s1 = String.valueOf(id);
        String s2 = String.valueOf(name);
        return (s1+s2);
    }
    
}


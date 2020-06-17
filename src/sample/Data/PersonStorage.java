package sample.Data;

import javafx.collections.ObservableList;

import java.util.ArrayList;

public class PersonStorage {
    private  static ArrayList<Person> personArrayList = new ArrayList<>();

    public static void add(Person person){
        personArrayList.add(person);
    }
    public static void remove(Person person){
        personArrayList.remove(index(person));
    }
    public static int index(Person person){
       return personArrayList.indexOf(person);
    }


}

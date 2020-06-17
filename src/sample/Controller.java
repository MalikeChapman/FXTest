package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import sample.Data.Person;
import sample.Data.PersonStorage;

import java.io.*;

public class Controller {
    @FXML private Button submit;
    @FXML private TextField name;
    @FXML private TextField age;
    @FXML private TextField email;
    @FXML private TextField phoneNumber;
    private String filename = "StorageData.txt";

   public String getName(){
       if (name.getText().trim().isEmpty())
       {
           System.out.println("Error there is no name entered");
           System.exit(0);
       }
           return name.getText();

   }
   public int getAge(){
       return Integer.parseInt(age.getText());
   }
   public String getEmail(){
       return email.getText();
   }
   public String getPhoneNumber(){
       return phoneNumber.getText();
   }
   public Person createPerson(){
       Person newPerson = new Person(getName(), getAge(), getEmail(), getPhoneNumber());
       return newPerson;
   }
   public void addPersonToList(Person newPerson){
       PersonStorage.add(newPerson);
   }

   public void writeToFile(Person person) throws FileNotFoundException {
       PrintWriter printWriter = new PrintWriter(new FileOutputStream(filename, true));
       printWriter.println(person.toString());
       printWriter.close();
   }
    public  void readFromFile() throws IOException {
       String test;
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        test = fileReader.readLine();
        while (test != null){
            System.out.println(test);
            test = fileReader.readLine();
        }


    }


    public void handleSubmit(ActionEvent actionEvent) throws IOException {
       Person person = createPerson();
       addPersonToList(person);
       writeToFile(person);
       readFromFile();
       


    }
}

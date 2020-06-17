package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class LoginController {
    @FXML private Button login;
    @FXML private Button signUp;
    @FXML public GridPane rootPane;


    @FXML public void signUpScreen(ActionEvent event) throws IOException{
        GridPane gridPane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        rootPane.getChildren().setAll(gridPane);
    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button wyjdz;
    @FXML
    private Button zaloguj;
    @FXML
        private TextField login;
    @FXML
    private PasswordField haslo;
    Stage dialogStage = new Stage();
    Scene scene;


    @FXML
    void initialize() {

    }
     @FXML
    private void zalogujUser(ActionEvent event) throws IOException {
       Logowanie logowanie = new Logowanie();
       logowanie.setLogin(login);
       logowanie.setHaslo(haslo);
       if(logowanie.loginAction() == true){
           if(logowanie.getType().equals("1") ) {

               Node node = (Node) event.getSource();
               dialogStage = (Stage) node.getScene().getWindow();
               dialogStage.close();
               scene = new Scene(FXMLLoader.load(getClass().getResource("Administrator.fxml")));
               dialogStage.setScene(scene);
               dialogStage.show();
               dialogStage.setTitle("Administrator");
           }
           else if(logowanie.getType().equals("2")) {
               Node node = (Node) event.getSource();
               dialogStage = (Stage) node.getScene().getWindow();
               dialogStage.close();
               scene = new Scene(FXMLLoader.load(getClass().getResource("Kierownik.fxml")));
               dialogStage.setScene(scene);
               dialogStage.show();
               dialogStage.setTitle("Kierownik");
           }
           else if(logowanie.getType().equals("3")) {
               Node node = (Node) event.getSource();
               dialogStage = (Stage) node.getScene().getWindow();
               dialogStage.close();
               scene = new Scene(FXMLLoader.load(getClass().getResource("Wykladowca.fxml")));
               dialogStage.setScene(scene);
               dialogStage.show();
               dialogStage.setTitle("Wykładowca");
               }
           else if(logowanie.getType().equals("4")) {
               Node node = (Node) event.getSource();
               dialogStage = (Stage) node.getScene().getWindow();
               dialogStage.close();
               scene = new Scene(FXMLLoader.load(getClass().getResource("Student.fxml")));
               dialogStage.setScene(scene);
               dialogStage.show();
               dialogStage.setTitle("Student");
               }
           else{
             infoBox("Nie zostaleś jeszcze zaakceptowany przez Administratora",null,null);
           }
       }
       else{
       }
    }
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();

    }
}

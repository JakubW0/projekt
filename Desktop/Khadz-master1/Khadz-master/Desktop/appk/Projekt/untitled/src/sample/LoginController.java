package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
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
        System.out.println("XD");
    }
     @FXML
    private void zalogujUser(ActionEvent event) throws IOException {
       Logowanie logowanie = new Logowanie();
       logowanie.setLogin(login);
       logowanie.setHaslo(haslo);
       if(logowanie.loginAction() == true){

           Node node = (Node)event.getSource();
           dialogStage = (Stage) node.getScene().getWindow();
           dialogStage.close();
           scene = new Scene(FXMLLoader.load(getClass().getResource("Db.fxml")));
           dialogStage.setScene(scene);
           dialogStage.show();
       }
       else{
       }
    }

}

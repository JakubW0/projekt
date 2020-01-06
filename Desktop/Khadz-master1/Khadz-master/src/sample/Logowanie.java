package sample;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import sample.ConnectionUtil;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.scene.control.TextField;

public class Logowanie implements Initializable {
    private TextField login;
    private TextField haslo;

    Stage dialogStage = new Stage();
    Scene scene;

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    private String typKonta ;
    public Logowanie (){

    }

    public void setHaslo(TextField haslo) {
        this.haslo = haslo;
    }

    public void setLogin(TextField login) {
        this.login = login;
    }
    public String getType(){
        return typKonta;
    }

    public boolean loginAction(){
        String loginL = login.getText().toString();
        String hasloL = haslo.getText().toString();


        try{
            connection = ConnectionUtil.connectdb();
            resultSet = connection.createStatement().executeQuery("SELECT * FROM `uzytkownik` WHERE login = '"+loginL+"' AND haslo = '"+hasloL+"' ");
            if(!resultSet.next()){
                infoBox("Proszę podać poprawny login i hasło", null, "Błąd");
                login.clear();
                haslo.clear();
                return false;
            }
            else{
                typKonta=resultSet.getString("typ");
                infoBox("Logowanie pomyślne!",null,"Sukces" );
                return true;
                }

        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }


    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }

}

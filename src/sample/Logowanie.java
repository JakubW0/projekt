package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import sample.ConnectionUtil;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Logowanie implements Initializable {
    private TextField login;
    private TextField haslo;

    Stage dialogStage = new Stage();
    Scene scene;

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    public Logowanie (){ connection = ConnectionUtil.connectdb();

    }

    public void setHaslo(TextField haslo) {
        this.haslo = haslo;
        System.out.println(haslo.getText());
    }

    public void setLogin(TextField login) {
        this.login = login;
        System.out.println("teraz login: "+login.getText());

    }

    public boolean loginAction(){
        String loginL = login.getText().toString();
        String hasloL = haslo.getText().toString();


        String sql = "SELECT * FROM employee WHERE email = ? and password = ?";

        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, loginL);
            preparedStatement.setString(2, hasloL);
            resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                infoBox("Please enter correct Email and Password", null, "Failed");
                return false;
            }else{
                infoBox("Login Successfull",null,"Success" );
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

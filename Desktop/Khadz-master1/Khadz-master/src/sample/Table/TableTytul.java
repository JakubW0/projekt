package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelTypy;
import sample.Modele.ModelTytul;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableTytul {
    ObservableList<ModelTytul> oblistTytul = FXCollections.observableArrayList();
    public void setTytul(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `tytul_naukowy`");
            while (rs.next()){
                oblistTytul.add(new ModelTytul(rs.getString("id_tytul"),
                        rs.getString("nazwa_tytulu")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void setDodaj( int idprzedS, String idtypS){

        oblistTytul.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `tytul_naukowy` (`id_tytul`, `nazwa_tytulu`) VALUES ('"+idprzedS+"','"+idtypS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `tytul_naukowy`");
            while (rs.next()){
                oblistTytul.add(new ModelTytul(rs.getString("id_tytul"),
                        rs.getString("nazwa_tytulu")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void setUsun(String idprzedS){
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("DELETE FROM `tytul_naukowy` WHERE `tytul_naukowy`.`id_tytul` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `tytul_naukowy`");
            while (rs.next()){
                oblistTytul.add(new ModelTytul(rs.getString("id_tytul"),
                        rs.getString("nazwa_tytulu")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }}

    public ObservableList<ModelTytul> getOblist(){
        return oblistTytul;
    }
    public void setClearOblist(){oblistTytul.clear();}

    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

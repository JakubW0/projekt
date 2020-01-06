package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelWydzial;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableWydzial {
    ObservableList<ModelWydzial> oblistWydzial = FXCollections.observableArrayList();
    public void setWydzial(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `wydzial`");
            while (rs.next()){
                oblistWydzial.add(new ModelWydzial(rs.getString("id_wydzial"),
                        rs.getString("nazwa_wydzialu")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void setDodaj( int idprzedS, String idtypS){

        oblistWydzial.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `wydzial` (`id_wydzial`, `nazwa_wydzialu`) VALUES ('"+idprzedS+"','"+idtypS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `wydzial`");
            while (rs.next()){
                oblistWydzial.add(new ModelWydzial(rs.getString("id_wydzial"),
                        rs.getString("nazwa_wydzialu")));


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
            conn.createStatement().executeUpdate("DELETE FROM `wydzial` WHERE `wydzial`.`id_wydzial` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `wydzial`");
            while (rs.next()){
                oblistWydzial.add(new ModelWydzial(rs.getString("id_wydzial"),
                        rs.getString("nazwa_wydzialu")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }}

    public ObservableList<ModelWydzial> getOblist(){
        return oblistWydzial;
    }
    public void setClearOblist(){oblistWydzial.clear();}
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

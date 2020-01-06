package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelTypy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableTypy {
    public TableTypy(){}
    ObservableList<ModelTypy> oblistTypy = FXCollections.observableArrayList();
    public void setTypy(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `typy_zajec`");
            while (rs.next()){
                oblistTypy.add(new ModelTypy(rs.getString("id_typ_zajec"),
                        rs.getString("nazwa_typ_zajec")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void setDodaj( int idprzedS, String idtypS ){

        oblistTypy.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `typy_zajec` (`id_typ_zajec`, `nazwa_typ_zajec`) VALUES ('"+idprzedS+"','"+idtypS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `typy_zajec`");
            while (rs.next()){
                oblistTypy.add(new ModelTypy(rs.getString("id_typ_zajec"),
                        rs.getString("nazwa_typ_zajec")));


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
            conn.createStatement().executeUpdate("DELETE FROM `typy_zajec` WHERE `typy_zajec`.`id_typ_zajec` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `typy_zajec`");
            while (rs.next()){
                oblistTypy.add(new ModelTypy(rs.getString("id_typ_zajec"),
                        rs.getString("nazwa_typ_zajec")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }}

    public ObservableList<ModelTypy> getOblist(){
        return oblistTypy;
    }
    public void setClearOblist(){oblistTypy.clear();}

    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

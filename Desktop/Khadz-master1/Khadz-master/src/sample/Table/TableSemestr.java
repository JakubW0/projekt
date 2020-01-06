package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelSemestr;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableSemestr {

    public TableSemestr(){}
    ObservableList<ModelSemestr> oblistSemestr = FXCollections.observableArrayList();
    public void setSemestr(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `semestr`");
            while (rs.next()){
                oblistSemestr.add(new ModelSemestr(rs.getString("id_semestr"),
                        rs.getString("numer_sem")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void setDodaj( int idprzedS, String idtypS ){

        oblistSemestr.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `semestr` (`id_semestr`, `numer_sem`) VALUES ('"+idprzedS+"','"+idtypS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `semestr`");
            while (rs.next()){
                oblistSemestr.add(new ModelSemestr(rs.getString("id_semestr"),
                        rs.getString("numer_sem")));


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
            conn.createStatement().executeUpdate("DELETE FROM `semestr` WHERE `semestr`.`id_semestr` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `semestr`");
            while (rs.next()){
                oblistSemestr.add(new ModelSemestr(rs.getString("id_semestr"),
                        rs.getString("numer_sem")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<ModelSemestr> getOblist(){
        return oblistSemestr;
    }
    public void setClearOblist(){
        oblistSemestr.clear();
    }

    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

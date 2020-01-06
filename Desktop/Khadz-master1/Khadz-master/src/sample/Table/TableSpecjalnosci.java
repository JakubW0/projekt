package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelSemestr;
import sample.Modele.ModelSpecjalnosci;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableSpecjalnosci {
    public TableSpecjalnosci(){}

    ObservableList<ModelSpecjalnosci> oblistSpecjalnosci = FXCollections.observableArrayList();
    public void setSpecjalnosci(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `specjalnosc`");
            while (rs.next()){
                oblistSpecjalnosci.add(new ModelSpecjalnosci(rs.getString("id_specjalnosc"),
                        rs.getString("nazwa_specjalnosc")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void setDodaj( int idprzedS, String idtypS){

        oblistSpecjalnosci.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `specjalnosc` (`id_specjalnosc`, `nazwa_specjalnosc`) VALUES ('"+idprzedS+"','"+idtypS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `specjalnosc`");
            while (rs.next()){
                oblistSpecjalnosci.add(new ModelSpecjalnosci(rs.getString("id_specjalnosc"),
                        rs.getString("nazwa_specjalnosc")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void setUsun(String idprzedS){
        oblistSpecjalnosci.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("DELETE FROM `specjalnosc` WHERE `specjalnosc`.`id_specjalnosc` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `specjalnosc`");
            while (rs.next()){
                oblistSpecjalnosci.add(new ModelSpecjalnosci(rs.getString("id_specjalnosc"),
                        rs.getString("nazwa_specjalnosc")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }}

    public ObservableList<ModelSpecjalnosci> getOblist(){
        return oblistSpecjalnosci;
    }
    public void setClearOblist(){oblistSpecjalnosci.clear();}
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

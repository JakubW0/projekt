package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelTryb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableTryb {
    public TableTryb(){}
    ObservableList<ModelTryb> oblistTryb = FXCollections.observableArrayList();
    public void setTryb(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `tryb_studiow`");
            while (rs.next()){
                oblistTryb.add(new ModelTryb(rs.getString("id_tryb"),
                        rs.getString("tryb_studiow")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void setDodaj( int idprzedS, String idtypS){

        oblistTryb.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `tryb_studiow` (`id_tryb`, `tryb_studiow`) VALUES ('"+idprzedS+"','"+idtypS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `tryb_studiow`");
            while (rs.next()){
                oblistTryb.add(new ModelTryb(rs.getString("id_tryb"),
                        rs.getString("tryb_studiow")));


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
            conn.createStatement().executeUpdate("DELETE FROM `tryb_studiow` WHERE `tryb_studiow`.`id_tryb` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `tryb_studiow`");
            while (rs.next()){
                oblistTryb.add(new ModelTryb(rs.getString("id_tryb"),
                        rs.getString("tryb_studiow")));


            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }}

    public ObservableList<ModelTryb> getOblist(){
        return oblistTryb;
    }

    public void setClearOblist(){oblistTryb.clear();}

    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}

}

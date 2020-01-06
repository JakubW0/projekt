package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelKatedra;
import sample.Modele.ModelPlan;
import sample.Modele.ModelProwadzacy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableKatedra {
    public TableKatedra() {
    }
    ObservableList<ModelKatedra> oblistKatedra = FXCollections.observableArrayList();
    ObservableList<ModelKatedra> oblistNazwa = FXCollections.observableArrayList();
    public void setKatedra(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `katedra`");
            while (rs.next()){
                oblistKatedra.add(new ModelKatedra(rs.getString("id_katedry"),
                        rs.getString("id_wydzial"),
                        rs.getString("nazwa_katedry")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void setKatedraNazwy(){
        oblistKatedra.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT katedra.id_katedry,wydzial.nazwa_wydzialu,katedra.nazwa_katedry FROM `katedra` INNER JOIN wydzial ON katedra.id_wydzial=wydzial.id_wydzial");
            while (rs.next()){
                oblistKatedra.add(new ModelKatedra(rs.getString("katedra.id_katedry"),
                        rs.getString("wydzial.nazwa_wydzialu"),
                        rs.getString("katedra.nazwa_katedry")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void setDodaj( int idprzedS, String idtypS, String nazwaS ){

        oblistKatedra.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `katedra` (`id_katedry`, `id_wydzial`, `nazwa_katedry` ) VALUES ('"+idprzedS+"','"+idtypS+"', '"+nazwaS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `katedra`");
            while (rs.next()){
                oblistKatedra.add(new ModelKatedra(rs.getString("id_katedry"),
                        rs.getString("id_wydzial"),
                        rs.getString("nazwa_katedry")));

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
            conn.createStatement().executeUpdate("DELETE FROM `katedra` WHERE `katedra`.`id_katedry` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `katedra`");
            while (rs.next()){
                oblistKatedra.add(new ModelKatedra(rs.getString("id_katedry"),
                        rs.getString("id_wydzial"),
                        rs.getString("nazwa_katedry")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }}

    public ObservableList<ModelKatedra> getOblist(){

        return oblistKatedra;
    }
    public void setClearOblist(){
        oblistKatedra.clear();
    }
    public void setOblistClear(){
        oblistKatedra.clear();
    }

    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}



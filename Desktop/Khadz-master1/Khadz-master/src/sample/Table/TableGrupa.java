package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelGrupa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableGrupa {

    ObservableList<ModelGrupa> oblistGrupa = FXCollections.observableArrayList();
    public TableGrupa(){}



    public void setGrupy(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `gr_dziekan`");
            while (rs.next()){
                oblistGrupa.add(new ModelGrupa(rs.getString("id_grupy"),
                        rs.getString("numer_grupy")));
            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void setDodaj( int idprzedS,String nazwaS ){

        oblistGrupa.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `gr_dziekan` (`id_grupy`, `numer_grupy`) VALUES ('"+idprzedS+"', '"+nazwaS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `gr_dziekan`");
            while (rs.next()){
                oblistGrupa.add(new ModelGrupa(rs.getString("id_grupy"),
                        rs.getString("numer_grupy")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            infoBox("zle wypelniona baza danych",null, "Błąd");
        }

    }

    public void setUsun(String idprzedS){
        oblistGrupa.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("DELETE FROM `gr_dziekan` WHERE `gr_dziekan`.`id_grupy` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `gr_dziekan`");
            while (rs.next()){
                oblistGrupa.add(new ModelGrupa(rs.getString("id_grupy"),
                        rs.getString("numer_grupy")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            infoBox("zle wypelniona baza danych",null, "Błąd");
        }
    }

    public ObservableList<ModelGrupa> getOblist(){
        return  oblistGrupa;
    }
    public void setClearOblist(){
        oblistGrupa.clear();
    }
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

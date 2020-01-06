package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelKierunek;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableKierunek {
    public TableKierunek(){}
    ObservableList<ModelKierunek> oblistKierunek = FXCollections.observableArrayList();
    public void setKierunek(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `kierunek`");
            while (rs.next()){
                oblistKierunek.add(new ModelKierunek(rs.getString("id_kierunek"),
                        rs.getString("id_wydzial"),
                        rs.getString("nazwa_kierunku")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void setKierunekNazwa(){
        oblistKierunek.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT kierunek.id_kierunek,wydzial.nazwa_wydzialu,kierunek.nazwa_kierunku FROM `kierunek` INNER JOIN wydzial ON kierunek.id_wydzial=wydzial.id_wydzial");
            while (rs.next()){
                oblistKierunek.add(new ModelKierunek(rs.getString("id_kierunek"),
                        rs.getString("wydzial.nazwa_wydzialu"),
                        rs.getString("nazwa_kierunku")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void setDodaj( int idprzedS, String idtypS, String nazwaS){

        oblistKierunek.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `kierunek` (`id_kierunek`, `id_wydzial`, `nazwa_kierunku`) VALUES ('"+idprzedS+"','"+idtypS+"', '"+nazwaS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `kierunek`");
            while (rs.next()){
                oblistKierunek.add(new ModelKierunek(rs.getString("id_kierunek"),
                        rs.getString("id_wydzial"),
                        rs.getString("nazwa_kierunku")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void setUsun(String idprzedS){
        oblistKierunek.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("DELETE FROM `kierunek` WHERE `kierunek`.`id_kierunek` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `kierunek`");
            while (rs.next()){
                oblistKierunek.add(new ModelKierunek(rs.getString("id_kierunek"),
                        rs.getString("id_wydzial"),
                        rs.getString("nazwa_kierunku")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<ModelKierunek> getOblist(){
        return oblistKierunek;
    }
    public void setOblistClear(){
        oblistKierunek.clear();
    }
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

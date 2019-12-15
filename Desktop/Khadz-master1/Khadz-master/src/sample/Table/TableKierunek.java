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
   /* public void setDodaj( String idprzedS, String idtypS, String nazwaS, String ectsS ,String godzinyS ){

        oblist.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `przedmioty` (`Id_przedmiot`, `id_typ_zajec`, `nazwa_przedmiotu`, `ects`, `godziny`) VALUES ('"+idprzedS+"','"+idtypS+"', '"+nazwaS+"','"+ectsS+"','"+godzinyS+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `przedmioty`");
            while (rs.next()){
                oblist.add(new ModelPrzedmioty(rs.getString("Id_przedmiot"),
                        rs.getString("id_typ_zajec"),
                        rs.getString("nazwa_przedmiotu"),
                        rs.getString("ects"),
                        rs.getString("godziny")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            infoBox("zle wypelniona baza danych",null, "Błąd");
        }

    }

    public void setUsun(String idprzedS){
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("DELETE FROM `przedmioty` WHERE `przedmioty`.`Id_przedmiot` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `przedmioty`");
            while (rs.next()){
                oblist.add(new ModelPrzedmioty(rs.getString("Id_przedmiot"),
                        rs.getString("id_typ_zajec"),
                        rs.getString("nazwa_przedmiotu"),
                        rs.getString("ects"),
                        rs.getString("godziny")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            infoBox("Błąd",null, "zle wypelniona baza danych");
        }}*/

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

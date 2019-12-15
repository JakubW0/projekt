package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import sample.ConnectTable;
import sample.Modele.ModelPrzedmioty;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TablePrzedmioty {

    private String zapytajS,idprzedS,idtypS,nazwaS,ectsS,godzinyS;


    ObservableList<ModelPrzedmioty> oblist = FXCollections.observableArrayList();



    public void setPrzedmioty() {
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `przedmioty`");
            while (rs.next()) {
                oblist.add(new ModelPrzedmioty(rs.getString("Id_przedmiot"),
                        rs.getString("id_typ_zajec"),
                        rs.getString("nazwa_przedmiotu"),
                        rs.getString("ects"),
                        rs.getString("godziny")));

            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public void setPrzedmiotyNazwy(){
            oblist.clear();
            try {
                Connection conn = ConnectTable.connectdb();
                ResultSet rs = conn.createStatement().executeQuery("SELECT przedmioty.Id_przedmiot, typy_zajec.nazwa_typ_zajec, przedmioty.nazwa_przedmiotu, przedmioty.ects,przedmioty.godziny FROM `przedmioty` INNER JOIN `typy_zajec` ON przedmioty.id_typ_zajec=typy_zajec.id_typ_zajec");
                while (rs.next()){
                    oblist.add(new ModelPrzedmioty(rs.getString("Id_przedmiot"),
                            rs.getString("nazwa_typ_zajec"),
                            rs.getString("nazwa_przedmiotu"),
                            rs.getString("ects"),
                            rs.getString("godziny")));

                }
                conn.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }


        }

        public void setDodaj( String idprzedS, String idtypS, String nazwaS, String ectsS ,String godzinyS ){

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
            }
        }
     public ObservableList<ModelPrzedmioty> getOblist(){
        return  oblist;
     }
    public void setClearOblist(){
        oblist.clear();
    }
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

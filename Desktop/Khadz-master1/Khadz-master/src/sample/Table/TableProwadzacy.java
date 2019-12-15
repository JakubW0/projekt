package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelProwadzacy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableProwadzacy {

    ObservableList<ModelProwadzacy> oblistProwadzacy = FXCollections.observableArrayList();
    public TableProwadzacy(){}
    public void setProwadzacy() {
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `prowadzacy`");
            while (rs.next()) {
                oblistProwadzacy.add(new ModelProwadzacy(rs.getString("id_prowadzacy"),
                        rs.getString("id_tytul"),
                        rs.getString("id_katedry"),
                        rs.getString("imie_prowadzacy"),
                        rs.getString("nazwisko_prowadzacy"),
                        rs.getString("data_urodzenia_prowadzacy"),
                        rs.getString("pensja"),
                        rs.getString("ilosc_dzieci")
                ));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public void setProwadzacyNazwy(){
        oblistProwadzacy.clear();
            try {
                Connection conn = ConnectTable.connectdb();
                ResultSet rs = conn.createStatement().executeQuery("        SELECT prowadzacy.id_prowadzacy,tytul_naukowy.nazwa_tytulu,katedra.nazwa_katedry,prowadzacy.imie_prowadzacy,prowadzacy.nazwisko_prowadzacy,prowadzacy.data_urodzenia_prowadzacy," +
                        "prowadzacy.pensja,prowadzacy.ilosc_dzieci FROM " +
                        "`prowadzacy` INNER JOIN tytul_naukowy ON prowadzacy.Id_tytul= tytul_naukowy.Id_tytul INNER JOIN katedra ON prowadzacy.id_katedry=katedra.id_katedry\n");
                while (rs.next()){
                    oblistProwadzacy.add(new ModelProwadzacy(rs.getString("id_prowadzacy"),
                            rs.getString("tytul_naukowy.nazwa_tytulu"),
                            rs.getString("katedra.nazwa_katedry"),
                            rs.getString("imie_prowadzacy"),
                            rs.getString("nazwisko_prowadzacy"),
                            rs.getString("data_urodzenia_prowadzacy"),
                            rs.getString("pensja"),
                            rs.getString("ilosc_dzieci")
                    ));
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

    public ObservableList<ModelProwadzacy> getOblist(){
        return oblistProwadzacy;
    }
    public void setClearOblist(){
        oblistProwadzacy.clear();
    }
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

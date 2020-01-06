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
    ObservableList<ModelProwadzacy> oblistNazwy = FXCollections.observableArrayList();
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
    public void setDodaj( int idprzedS, String idTytul, String idKatedry, String imie ,String nazwisko, String data, String pensja, String dzieci){

        oblistProwadzacy.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `prowadzacy` (`id_prowadzacy`, `id_tytul`, `id_katedry`, `imie_prowadzacy`, `nazwisko_prowadzacy`, `data_urodzenia_prowadzacy`, `pensja`, `ilosc_dzieci` ) VALUES ('"+idprzedS+"','"+idTytul+"', '"+idKatedry+"','"+imie+"','"+nazwisko+"','"+data+"','"+pensja+"','"+dzieci+"')");
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

    public void setUsun(String idprzedS){
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("DELETE FROM `prowadzacy` WHERE `przedmioty`.`id_prowadzacy` = "+idprzedS);
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


    public void querka(String id) {
        oblistProwadzacy.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT prowadzacy.id_prowadzacy, tytul_naukowy.nazwa_tytulu,katedra.nazwa_katedry,prowadzacy.imie_prowadzacy,prowadzacy.nazwisko_prowadzacy,prowadzacy.data_urodzenia_prowadzacy, prowadzacy.pensja,prowadzacy.ilosc_dzieci \n" +
                    "FROM prowadzacy \n" +
                    "INNER JOIN tytul_naukowy\n" +
                    "ON prowadzacy.Id_tytul=tytul_naukowy.Id_tytul\n" +
                    "INNER JOIN katedra \n" +
                    "ON prowadzacy.id_katedry=katedra.id_katedry\n"+
                    "WHERE katedra.nazwa_katedry = '"+id+"'"
            );
            while (rs.next()) {
                oblistProwadzacy.add(new ModelProwadzacy(rs.getString("prowadzacy.id_prowadzacy"),
                        rs.getString("tytul_naukowy.nazwa_tytulu"),
                        rs.getString("katedra.nazwa_katedry"),
                        rs.getString("prowadzacy.imie_prowadzacy"),
                        rs.getString("prowadzacy.nazwisko_prowadzacy"),
                        rs.getString("prowadzacy.data_urodzenia_prowadzacy"),
                        rs.getString("prowadzacy.pensja"),
                        rs.getString("prowadzacy.ilosc_dzieci")

                ));

            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


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

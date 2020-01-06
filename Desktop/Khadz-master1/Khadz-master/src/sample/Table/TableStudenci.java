package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelStudenci;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableStudenci {

    ObservableList<ModelStudenci> oblistStudenci = FXCollections.observableArrayList();
    public TableStudenci(){}
    public void setStudenci(){
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `studenci`");
            while (rs.next()){
                oblistStudenci.add(new ModelStudenci(rs.getString("id_student"),
                        rs.getString("id_specjalnosc"),
                        rs.getString("id_tryb"),
                        rs.getString("id_kierunek"),
                        rs.getString("id_semestr"),
                        rs.getString("id_grupy"),
                        rs.getString("nr_albumu"),
                        rs.getString("imie_studenta"),
                        rs.getString("nazwisko_studenta"),
                        rs.getString("data_urodzenia_student"),
                        rs.getString("pesel_student"),
                        rs.getString("stypendium")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void setStudenciNazwa(){
        oblistStudenci.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT studenci.Id_student,specjalnosc.nazwa_specjalnosc,tryb_studiow.tryb_studiow,kierunek.nazwa_kierunku,semestr.numer_sem,gr_dziekan.numer_grupy,studenci.nr_albumu,studenci.imie_studenta,studenci.nazwisko_studenta,studenci.data_urodzenia_student,studenci.pesel_student,studenci.stypendium " +
                    "FROM `studenci`" +
                    " INNER JOIN specjalnosc ON studenci.id_specjalnosc=specjalnosc.nazwa_specjalnosc" +
                    " INNER JOIN tryb_studiow ON studenci.Id_tryb=tryb_studiow.Id_tryb " +
                    "INNER JOIN kierunek ON studenci.id_kierunek=kierunek.id_kierunek " +
                    "INNER JOIN semestr ON studenci.id_semestr=semestr.id_semestr " +
                    "INNER JOIN gr_dziekan ON studenci.id_grupy=gr_dziekan.id_grupy");
            while (rs.next()){
                oblistStudenci.add(new ModelStudenci(rs.getString("id_student"),
                        rs.getString("specjalnosc.nazwa_specjalnosc"),
                        rs.getString("tryb_studiow.tryb_studiow"),
                        rs.getString("kierunek.nazwa_kierunku"),
                        rs.getString("semestr.numer_sem"),
                        rs.getString("gr_dziekan.numer_grupy"),
                        rs.getString("nr_albumu"),
                        rs.getString("imie_studenta"),
                        rs.getString("nazwisko_studenta"),
                        rs.getString("data_urodzenia_student"),
                        rs.getString("pesel_student"),
                        rs.getString("stypendium")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void setDodaj( int idprzedS, String spec,String tryb, String kierunek, String semestr ,String grupa, String album, String imie, String nazwisko ,String data, String pesel, String stypendium ){

        oblistStudenci.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `studenci` (`Id_student`, `id_specjalnosc`,`id_tryb`, `id_kierunek`, `id_semestr`, `id_grupy`, `nr_albumu`, `imie_studenta`, `nazwisko_studenta`, `data_urodzenia_student`, `pesel_student`, `stypendium`) VALUES ('"+idprzedS+"','"+spec+"','"+tryb+"', '"+kierunek+"','"+semestr+"','"+grupa+"','"+album+"', '"+imie+"','"+nazwisko+"','"+data+"','"+pesel+"','"+stypendium+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `studenci`");
            while (rs.next()){
                oblistStudenci.add(new ModelStudenci(rs.getString("id_student"),
                        rs.getString("id_specjalnosc"),
                        rs.getString("id_tryb"),
                        rs.getString("id_kierunek"),
                        rs.getString("id_semestr"),
                        rs.getString("id_grupy"),
                        rs.getString("nr_albumu"),
                        rs.getString("imie_studenta"),
                        rs.getString("nazwisko_studenta"),
                        rs.getString("data_urodzenia_student"),
                        rs.getString("pesel_student"),
                        rs.getString("stypendium")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void setUsun(String idprzedS) {
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("DELETE FROM `studenci` WHERE `studenci`.`Id_student` = " + idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `studenci`");
            while (rs.next()) {
                oblistStudenci.add(new ModelStudenci(rs.getString("id_student"),
                        rs.getString("id_specjalnosc"),
                        rs.getString("id_tryb"),
                        rs.getString("id_kierunek"),
                        rs.getString("id_semestr"),
                        rs.getString("id_grupy"),
                        rs.getString("nr_albumu"),
                        rs.getString("imie_studenta"),
                        rs.getString("nazwisko_studenta"),
                        rs.getString("data_urodzenia_student"),
                        rs.getString("pesel_student"),
                        rs.getString("stypendium")));

            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void querka(String kierunek, String grupa) {
        oblistStudenci.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * \n" +
                    "FROM `studenci` WHERE studenci.id_kierunek = " + kierunek + " AND studenci.id_grupy = " + grupa + "");
            while (rs.next()) {
                oblistStudenci.add(new ModelStudenci(rs.getString("id_student"),
                        rs.getString("id_specjalnosc"),
                        rs.getString("id_tryb"),
                        rs.getString("id_kierunek"),
                        rs.getString("id_semestr"),
                        rs.getString("id_grupy"),
                        rs.getString("nr_albumu"),
                        rs.getString("imie_studenta"),
                        rs.getString("nazwisko_studenta"),
                        rs.getString("data_urodzenia_student"),
                        rs.getString("pesel_student"),
                        rs.getString("stypendium")));

            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<ModelStudenci> getOblist(){
        return oblistStudenci;
    }
    public void setClearOblist(){oblistStudenci.clear();}


    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

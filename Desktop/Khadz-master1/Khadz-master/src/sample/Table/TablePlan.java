package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelPlan;
import sample.Modele.ModelPrzedmioty;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TablePlan {
    ObservableList<ModelPlan> oblistPlan = FXCollections.observableArrayList();
    ObservableList<ModelPlan> oblistPlanNazwy = FXCollections.observableArrayList();
    public TablePlan(){}
    public void setPlan(){
        try {

            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `plan` ORDER BY `plan`.`id_plan` ASC");
            while (rs.next()){
                oblistPlan.add(new ModelPlan( rs.getString("Id_plan"),
                        rs.getString("Id_przedmiot"),
                        rs.getString("id_prowadzacy"),
                        rs.getString("id_specjalnosc"),
                        rs.getString("id_grupy"),
                        rs.getString("id_semestr"),
                        rs.getString("id_tryb"),
                        rs.getString("id_kierunek")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void setPlanNazwy(){
        oblistPlan.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT plan.id_plan,przedmioty.nazwa_przedmiotu,tytul_naukowy.nazwa_tytulu,prowadzacy.imie_prowadzacy,prowadzacy.nazwisko_prowadzacy,specjalnosc.nazwa_specjalnosc," +
                    "gr_dziekan.numer_grupy,semestr.numer_sem,tryb_studiow.tryb_studiow,kierunek.nazwa_kierunku \n" +
                    "FROM `plan` \n" +

                    "INNER JOIN przedmioty ON plan.Id_przedmiot=przedmioty.Id_przedmiot\n" +
                    "INNER JOIN prowadzacy ON plan.id_prowadzacy=prowadzacy.id_prowadzacy\n" +
                    "INNER JOIN tytul_naukowy ON prowadzacy.id_tytul=tytul_naukowy.Id_tytul\n" +
                    "INNER JOIN specjalnosc ON plan.id_specjalnosc=specjalnosc.id_specjalnosc\n" +
                    "INNER JOIN gr_dziekan ON plan.id_grupy=gr_dziekan.id_grupy\n" +
                    "INNER JOIN semestr ON plan.id_semestr=semestr.id_semestr\n" +
                    "INNER JOIN tryb_studiow ON plan.Id_tryb=tryb_studiow.Id_tryb\n" +
                    "INNER JOIN kierunek ON plan.id_kierunek=kierunek.id_kierunek \n"+
                    "ORDER BY `plan`.`id_plan` ASC "
                   );
            while (rs.next()){
                oblistPlanNazwy.add(new ModelPlan(rs.getString("plan.Id_plan"),
                        rs.getString("przedmioty.nazwa_przedmiotu"),
                        rs.getString("tytul_naukowy.nazwa_tytulu"),
                        rs.getString("prowadzacy.imie_prowadzacy"),
                        rs.getString("prowadzacy.nazwisko_prowadzacy"),
                        rs.getString("specjalnosc.nazwa_specjalnosc"),
                        rs.getString("gr_dziekan.numer_grupy"),
                        rs.getString("semestr.numer_sem"),
                        rs.getString("tryb_studiow.tryb_studiow"),
                        rs.getString("kierunek.nazwa_kierunku")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void setDodaj(int idprzedS, String przedmiot, String prowa, String sepc, String grupa , String semestr, String tryb, String kierunek  ){

        oblistPlan.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("INSERT INTO `plan` (`Id_plan`, `Id_przedmiot`, `id_prowadzacy`, `id_specjalnosc`, `id_grupy`, `id_semestr`, `id_tryb`, `id_kierunek`) VALUES ('"+idprzedS+"', '"+przedmiot+"', '"+prowa+"', '"+sepc+"','"+grupa+"','"+semestr+"','"+tryb+"','"+kierunek+"')");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `plan` ORDER BY `plan`.`id_plan` ASC");
            while (rs.next()){
                oblistPlan.add(new ModelPlan( rs.getString("Id_plan"),
                        rs.getString("Id_przedmiot"),
                        rs.getString("id_prowadzacy"),
                        rs.getString("id_specjalnosc"),
                        rs.getString("id_grupy"),
                        rs.getString("id_semestr"),
                        rs.getString("id_tryb"),
                        rs.getString("id_kierunek")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void setAktualizuj( String idprzedS, String przedmiot, String prowa, String sepc, String grupa , String semestr, String tryb, String kierunek  ){

        oblistPlan.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("UPDATE `plan` SET  `Id_przedmiot` = '"+przedmiot+"', `id_prowadzacy` = '"+prowa+"', `id_specjalnosc` = '"+sepc+"' , `id_grupy` = '"+grupa+"', `id_semestr` = '"+semestr+"', `id_tryb` = '"+tryb+"', `id_kierunek` = '"+kierunek+"' WHERE `Id_plan`='"+idprzedS+"'");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `plan` ORDER BY `plan`.`id_plan` ASC");
            while (rs.next()){
                oblistPlan.add(new ModelPlan( rs.getString("Id_plan"),
                        rs.getString("Id_przedmiot"),
                        rs.getString("id_prowadzacy"),
                        rs.getString("id_specjalnosc"),
                        rs.getString("id_grupy"),
                        rs.getString("id_semestr"),
                        rs.getString("id_tryb"),
                        rs.getString("id_kierunek")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void setUsun(String idprzedS){
        oblistPlan.clear();
        try {
            Connection conn = ConnectTable.connectdb();
            conn.createStatement().executeUpdate("DELETE FROM `plan` WHERE `plan`.`Id_plan` = "+idprzedS);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM `plan` ORDER BY `plan`.`id_plan` ASC");
            while (rs.next()){
                oblistPlan.add(new ModelPlan( rs.getString("Id_plan"),
                        rs.getString("Id_przedmiot"),
                        rs.getString("id_prowadzacy"),
                        rs.getString("id_specjalnosc"),
                        rs.getString("id_grupy"),
                        rs.getString("id_semestr"),
                        rs.getString("id_tryb"),
                        rs.getString("id_kierunek")));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }}

    public ObservableList<ModelPlan> getOblist(){
        return oblistPlan;
    }
    public ObservableList<ModelPlan> getOblistNazwy(){
        return oblistPlanNazwy;
    }
    public void OblistClear(){oblistPlan.clear();}
    public void OblistClearNazwy(){oblistPlanNazwy.clear();}
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

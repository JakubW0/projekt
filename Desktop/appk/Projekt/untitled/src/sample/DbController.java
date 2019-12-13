package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Modele.*;
import sample.Table.*;

import java.net.URL;
import java.util.ResourceBundle;

public class DbController implements Initializable {

    @FXML
    private TableView<ModelPrzedmioty> table;
    @FXML
    private TableColumn<ModelPrzedmioty, String> col_id;
    @FXML
    private TableColumn<ModelPrzedmioty, String> typ_id;
    @FXML
    private TableColumn<ModelPrzedmioty, String> nazwaString;
    @FXML
    private TableColumn<ModelPrzedmioty, String> ects;
    @FXML
    private TableColumn<ModelPrzedmioty, String> godz;
    @FXML
    private TableView<ModelGrupa> tableGrupa;
    @FXML
    private TableColumn<ModelGrupa, String> id_grupy;
    @FXML
    private TableColumn<ModelGrupa, String> numer_grupy;
    @FXML
    private TableView<ModelProwadzacy> tableProwadzacy;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_prowadzacy;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_tytul;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_katedry;
    @FXML
    private TableColumn<ModelProwadzacy, String> imie_prowadzacy;
    @FXML
    private TableColumn<ModelProwadzacy, String> nazwisko_prowadzacy;
    @FXML
    private TableColumn<ModelProwadzacy, String> data_ur_prowa;
    @FXML
    private TableColumn<ModelProwadzacy, String> pensja;
    @FXML
    private TableColumn<ModelProwadzacy, String> dzieci;
    @FXML
    private TableView<ModelStudenci> tableStudenci;
    @FXML
    private TableColumn<ModelStudenci, String> id_student;
    @FXML
    private TableColumn<ModelStudenci, String> id_specjalnosc;
    @FXML
    private TableColumn<ModelStudenci, String> id_tryb;
    @FXML
    private TableColumn<ModelStudenci, String> id_kierunki;
    @FXML
    private TableColumn<ModelStudenci, String> id_semestr;
    @FXML
    private TableColumn<ModelStudenci, String> id_grupyStudent;
    @FXML
    private TableColumn<ModelStudenci, String> nr_albumu;
    @FXML
    private TableColumn<ModelStudenci, String> imie_studenta;
    @FXML
    private TableColumn<ModelStudenci, String> nazwisko_studenta;
    @FXML
    private TableColumn<ModelStudenci, String> data_urodzenia_student;
    @FXML
    private TableColumn<ModelStudenci, String> pesel_student;
    @FXML
    private TableColumn<ModelStudenci, String> stypendium;
    @FXML
    private TableView<ModelPlan> tablePlan;
    @FXML
    private TableColumn<ModelPlan, String> idPrzedmiot;
    @FXML
    private TableColumn<ModelPlan, String> idProwadzacy;
    @FXML
    private TableColumn<ModelPlan, String> idSpecjalnosc;
    @FXML
    private TableColumn<ModelPlan, String> idGrupy;
    @FXML
    private TableColumn<ModelPlan, String> idSemestr;
    @FXML
    private TableColumn<ModelPlan, String> idTryb;
    @FXML
    private TableColumn<ModelPlan, String> idKierunek;
    @FXML
    private TableView<ModelKatedra> tableKatedra;
    @FXML
    private TableColumn<ModelKatedra, String> idKatedry;
    @FXML
    private TableColumn<ModelKatedra, String> idWydzial;
    @FXML
    private TableColumn<ModelKatedra, String> NazwaWydzialu;
    @FXML
            private Button dodaj;
    @FXML
            private TextField idprzed;
    @FXML
            private TextField idTyp;
    @FXML
            private TextField nazwa;
    @FXML
            private TextField eCts;
    @FXML
            private TextField godziny;
    private String zapytajS,idprzedS,idtypS,nazwaS,ectsS,godzinyS;

    TablePrzedmioty tPrzedmioty = new TablePrzedmioty();
    TableGrupa tGrupa = new TableGrupa();
    TableProwadzacy tProwadzacy = new TableProwadzacy();
    TableStudenci tStudenci = new TableStudenci();
    TablePlan tPLan = new TablePlan();
    TableKatedra tKatedra = new TableKatedra();


    ObservableList<ModelPrzedmioty> oblist = FXCollections.observableArrayList();


    public DbController(){}


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       tPrzedmioty.setPrzedmioty();
       tGrupa.setGrupy();
       tProwadzacy.setProwadzacy();
       tStudenci.setStudenci();
       tPLan.setPlan();
       tKatedra.setKatedra();


        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        typ_id.setCellValueFactory(new PropertyValueFactory<>("typId"));
        nazwaString.setCellValueFactory(new PropertyValueFactory<>("nazwa"));
        ects.setCellValueFactory(new PropertyValueFactory<>("ects"));
        godz.setCellValueFactory(new PropertyValueFactory<>("godz"));

        id_grupy.setCellValueFactory(new PropertyValueFactory<>("idgrupy"));
        numer_grupy.setCellValueFactory(new PropertyValueFactory<>("numergrupy"));

        id_prowadzacy.setCellValueFactory(new PropertyValueFactory<>("id_prowadzacy"));
        id_tytul.setCellValueFactory(new PropertyValueFactory<>("Id_tytul"));
        id_katedry.setCellValueFactory(new PropertyValueFactory<>("id_katedry"));
        imie_prowadzacy.setCellValueFactory(new PropertyValueFactory<>("imie_prowadzacy"));
        nazwisko_prowadzacy.setCellValueFactory(new PropertyValueFactory<>("nazwisko_prowadzacy"));
        data_ur_prowa.setCellValueFactory(new PropertyValueFactory<>("data_urodzenia_prowadzacy"));
        pensja.setCellValueFactory(new PropertyValueFactory<>("pensja"));
        dzieci.setCellValueFactory(new PropertyValueFactory<>("ilosc_dzieci"));

        id_student.setCellValueFactory(new PropertyValueFactory<>("idStudent"));
        id_specjalnosc.setCellValueFactory(new PropertyValueFactory<>("id_specjalnosc"));
        id_tryb.setCellValueFactory(new PropertyValueFactory<>("id_tryb"));
        id_kierunki.setCellValueFactory(new PropertyValueFactory<>("id_kierunek"));
        id_semestr.setCellValueFactory(new PropertyValueFactory<>("id_semestr"));
        id_grupyStudent.setCellValueFactory(new PropertyValueFactory<>("id_grupy"));
        nr_albumu.setCellValueFactory(new PropertyValueFactory<>("nr_albumu"));
        imie_studenta.setCellValueFactory(new PropertyValueFactory<>("imie_studenta"));
        nazwisko_studenta.setCellValueFactory(new PropertyValueFactory<>("nazwisko_studenta"));
        data_urodzenia_student.setCellValueFactory(new PropertyValueFactory<>("data_urodzenia_student"));
        pesel_student.setCellValueFactory(new PropertyValueFactory<>("pesel_student"));
        stypendium.setCellValueFactory(new PropertyValueFactory<>("stypendium"));

        idPrzedmiot.setCellValueFactory(new PropertyValueFactory<>("idPrzedmiot"));
        idProwadzacy.setCellValueFactory(new PropertyValueFactory<>("idProwadzacy"));
        idSpecjalnosc.setCellValueFactory(new PropertyValueFactory<>("idSpecjalnosc"));
        idGrupy.setCellValueFactory(new PropertyValueFactory<>("idGrupy"));
        idSemestr.setCellValueFactory(new PropertyValueFactory<>("idSemestr"));
        idTryb.setCellValueFactory(new PropertyValueFactory<>("idTryb"));
        idKierunek.setCellValueFactory(new PropertyValueFactory<>("idKierunek"));

        idKatedry.setCellValueFactory(new PropertyValueFactory<>("idKatedry"));
        idWydzial.setCellValueFactory(new PropertyValueFactory<>("idWydzial"));
        NazwaWydzialu.setCellValueFactory(new PropertyValueFactory<>("nazwaKatedry"));


        tableGrupa.setItems(tGrupa.getOblist());
        table.setItems(tPrzedmioty.getOblist());
        tableProwadzacy.setItems(tProwadzacy.getOblist());
        tableStudenci.setItems(tStudenci.getOblist());
        tablePlan.setItems(tPLan.getOblist());
        tableKatedra.setItems(tKatedra.getOblist());


    }
  @FXML
    private void onDodaj()  {

    tPrzedmioty.setDodaj(idprzed.getText(), idTyp.getText(),nazwa.getText(), eCts.getText(), godziny.getText());
    table.setItems(tPrzedmioty.getOblist());

  }
  @FXML
    private void onUsun() {
        idprzedS = idprzed.getText();
   tPrzedmioty.setUsun(idprzedS);

      table.setItems(tPrzedmioty.getOblist());
    }




    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}


}

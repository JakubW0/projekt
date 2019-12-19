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
    private TableColumn<ModelPlan, String> tytul;
    @FXML
    private TableColumn<ModelPlan, String> nazwisko;
    @FXML
    private TableView<ModelKatedra> tableKatedra;
    @FXML
    private TableColumn<ModelKatedra, String> idKatedry;
    @FXML
    private TableColumn<ModelKatedra, String> idWydzial;
    @FXML
    private TableColumn<ModelKatedra, String> NazwaWydzialu;
    @FXML
    private TableView<ModelKierunek> tableKierunek;
    @FXML
    private TableColumn<ModelKierunek, String> idKierunekK;
    @FXML
    private TableColumn<ModelKierunek, String> idWydzialK;
    @FXML
    private TableColumn<ModelKierunek, String> NazwaKierunek;
    @FXML
    private TableView<ModelSemestr> tableSemestr;
    @FXML
    private TableColumn<ModelSemestr, String> idSemestrS;
    @FXML
    private TableColumn<ModelSemestr, String> nazwaSem;
    @FXML
    private TableView<ModelSpecjalnosci> tableSpecjalnsci;
    @FXML
    private TableColumn<ModelSpecjalnosci, String> idSpecjalnosci;
    @FXML
    private TableColumn<ModelSpecjalnosci, String> nazwaSpec;
    @FXML
    private TableView<ModelTryb> tableTryb;
    @FXML
    private TableColumn<ModelTryb, String> idTrybT;
    @FXML
    private TableColumn<ModelTryb, String> tryb;
    @FXML
    private TableView<ModelTypy> tableTyp;
    @FXML
    private TableColumn<ModelTypy, String> idTypT;
    @FXML
    private TableColumn<ModelTypy, String> nazwaTypy;
    @FXML
    private TableView<ModelTytul> tableTytul;
    @FXML
    private TableColumn<ModelTytul, String> idTytul;
    @FXML
    private TableColumn<ModelTytul, String> nazwaTytul;
    @FXML
    private TableView<ModelWydzial> tableWydzial;
    @FXML
    private TableColumn<ModelWydzial, String> idWydzialW;
    @FXML
    private TableColumn<ModelWydzial, String> nazwaWydzialu;
    @FXML
    private TabPane TabsP;
    @FXML
            private Button dodaj;
    @FXML
    private TextField jed;
    @FXML
    private TextField dwa;
    @FXML
    private TextField trzy;
    @FXML
    private TextField czt;
    @FXML
    private TextField pie;
    @FXML
    private CheckBox pokaz;
    @FXML
    private TextField sze;
    @FXML
    private TextField sie;
    @FXML
    private TextField osi;
    @FXML
    private TextField dzie;
    @FXML
    private TextField dzies;
    @FXML
    private TextField jede;
    @FXML
    private Label jed1;
    @FXML
    private Label dwa2;
    @FXML
    private Label trzy3;
    @FXML
    private Label czt4;
    @FXML
    private Label pie5;
    @FXML
    private Label sze6;
    @FXML
    private Label sie7;
    @FXML
    private Label osi8;
    @FXML
    private Label dzie9;
    @FXML
    private Label dzies10;
    @FXML
    private Label jede11;
    @FXML
    private Label dwan12;
    @FXML
    private Button aktualizuj;
    @FXML
    private ComboBox<String> combo;

    private String zapytajS,idprzedS,idtypS,nazwaS,ectsS,godzinyS;

    TablePrzedmioty tPrzedmioty = new TablePrzedmioty();
    TableGrupa tGrupa = new TableGrupa();
    TableProwadzacy tProwadzacy = new TableProwadzacy();
    TableStudenci tStudenci = new TableStudenci();
    TablePlan tPLan = new TablePlan();
    TableKatedra tKatedra = new TableKatedra();
    TableKierunek tKierunek = new TableKierunek();
    TableSemestr tSemestr = new TableSemestr();
    TableSpecjalnosci tSpecjalnosci = new TableSpecjalnosci();
    TableTryb tTryb = new TableTryb();
    TableTypy tTypy = new TableTypy();
    TableTytul tTytul = new TableTytul();
    TableWydzial tWydzial = new TableWydzial();

   /* String[] Tabs = {}*/
    ObservableList<String> oblist = FXCollections.observableArrayList();
    ListView<ModelPrzedmioty> list = new ListView<ModelPrzedmioty>();


    public DbController(){}


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tytul.setVisible(false);
        nazwisko.setVisible(false);
       tPrzedmioty.setPrzedmioty();
       tGrupa.setGrupy();
       tProwadzacy.setProwadzacy();
       tStudenci.setStudenci();
       tPLan.setPlan();
       tKatedra.setKatedra();
        tKierunek.setKierunek();
        tSemestr.setSemestr();
        tSpecjalnosci.setSpecjalnosci();
        tTryb.setTryb();
        tTypy.setTypy();
        tTytul.setTytul();
        tWydzial.setWydzial();


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
        tytul.setCellValueFactory(new PropertyValueFactory<>("tytul"));
        nazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        idSpecjalnosc.setCellValueFactory(new PropertyValueFactory<>("idSpecjalnosc"));
        idGrupy.setCellValueFactory(new PropertyValueFactory<>("idGrupy"));
        idSemestr.setCellValueFactory(new PropertyValueFactory<>("idSemestr"));
        idTryb.setCellValueFactory(new PropertyValueFactory<>("idTryb"));
        idKierunek.setCellValueFactory(new PropertyValueFactory<>("idKierunek"));

        idKatedry.setCellValueFactory(new PropertyValueFactory<>("idKatedry"));
        idWydzial.setCellValueFactory(new PropertyValueFactory<>("idWydzial"));
        NazwaWydzialu.setCellValueFactory(new PropertyValueFactory<>("nazwaKatedry"));

        idKierunekK.setCellValueFactory(new PropertyValueFactory<>("idKierunek"));
        idWydzialK.setCellValueFactory(new PropertyValueFactory<>("idWydzial"));
        NazwaKierunek.setCellValueFactory(new PropertyValueFactory<>("nazwaKierunek"));

        idSemestrS.setCellValueFactory(new PropertyValueFactory<>("idSemestr"));
        nazwaSem.setCellValueFactory(new PropertyValueFactory<>("numer_sem"));

        idSpecjalnosci.setCellValueFactory(new PropertyValueFactory<>("idSpecjalnosc"));
        nazwaSpec.setCellValueFactory(new PropertyValueFactory<>("nazwaSpecjalnosci"));

        idTrybT.setCellValueFactory(new PropertyValueFactory<>("idTryb"));
        tryb.setCellValueFactory(new PropertyValueFactory<>("nazwaTrybu"));

        idTypT.setCellValueFactory(new PropertyValueFactory<>("idTyp"));
        nazwaTypy.setCellValueFactory(new PropertyValueFactory<>("NazwaTyp"));

        idTytul.setCellValueFactory(new PropertyValueFactory<>("idTytul"));
        nazwaTytul.setCellValueFactory(new PropertyValueFactory<>("nazwaTytul"));

        idWydzialW.setCellValueFactory(new PropertyValueFactory<>("idWydzial"));
        nazwaWydzialu.setCellValueFactory(new PropertyValueFactory<>("nazwaWydzialu"));


        combo.setItems(comboWriter());


        tableGrupa.setItems(tGrupa.getOblist());
        table.setItems(tPrzedmioty.getOblist());
        tableProwadzacy.setItems(tProwadzacy.getOblist());
        tableStudenci.setItems(tStudenci.getOblist());
        tablePlan.setItems(tPLan.getOblist());
        tableKatedra.setItems(tKatedra.getOblist());
        tableKierunek.setItems(tKierunek.getOblist());
        tableSemestr.setItems(tSemestr.getOblist());
        tableSpecjalnsci.setItems(tSpecjalnosci.getOblist());
        tableTryb.setItems(tTryb.getOblist());
        tableTyp.setItems(tTypy.getOblist());
        tableTytul.setItems(tTytul.getOblist());
        tableWydzial.setItems(tWydzial.getOblist());

    }
  @FXML
    private void onDodaj()  {
    tPrzedmioty.setDodaj(tPrzedmioty.getOblist().size()+1, dwa.getText(), trzy.getText(), czt.getText(), pie.getText());
    table.setItems(tPrzedmioty.getOblist());
      combo.setItems(comboWriter());


  }
  @FXML
    private void onUsun() {
   tPrzedmioty.setUsun(combo.getValue());
      table.setItems(tPrzedmioty.getOblist());
      combo.setItems(comboWriterU());
    }
    @FXML
    private void onCombo(){
        if(getIndex()==0) {
            jed.setText(tPrzedmioty.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getTypId());
            dwa.setText(tPrzedmioty.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getEcts());
            trzy.setText(tPrzedmioty.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getGodz());
            czt.setText(tPrzedmioty.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getNazwa());
        }
        if(getIndex()==1){
            dwa.setText(tGrupa.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getNumergrupy());
        }
        if(getIndex()==2){
            jed.setText(tProwadzacy.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getId_tytul());
            dwa.setText(tProwadzacy.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getId_katedry());
            trzy.setText(tProwadzacy.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getImie_prowadzacy());
            czt.setText(tProwadzacy.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getNazwisko_prowadzacy());
            pie.setText(tProwadzacy.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getData_urodzenia_prowadzacy());
            sze.setText(tProwadzacy.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getPensja());
            sie.setText(tProwadzacy.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIlosc_dzieci());
        }
        if(getIndex()==3){
            jed.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getId_specjalnosc());
            dwa.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getId_tryb());
            trzy.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getId_kierunek());
            czt.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getId_semestr());
            pie.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getId_grupy());
            sze.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getNr_albumu());
            sie.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getImie_studenta());
            osi.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getNazwisko_studenta());
            dzie.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getData_urodzenia_student());
            dzies.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getPesel_student());
            jede.setText(tStudenci.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getStypendium());
        }
        if(getIndex()==4){
            jed.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdPrzedmiot());
            dwa.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdProwadzacy());
            trzy.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdSpecjalnosc());
            czt.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdGrupy());
            pie.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdSemestr());
            sze.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdTryb());
            sie.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdKierunek());
        }

    }
    @FXML
    private void onAktualizuj(){
        System.out.println(combo.getValue());
        tPrzedmioty.setAktualizuj(combo.getValue(), dwa.getText(), trzy.getText(), czt.getText(), pie.getText());

    }
    @FXML
    private void onTab(){
        if(getIndex() == 0){
           setVisible(true,true,true,true,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,true,true,true,false,false,false,false,false,false);
        }
        if(getIndex() == 1 ){
            setVisible(true,true,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,true,false,false,false,false,false,false,false,false);
        }
        if(getIndex() == 2){
            setVisible(true,true,true,true,true,true,true,false,false,false,false);
            setVisibleLabel(true,true,true,true,true,true,true,true,false,false,false);
        }
        if(getIndex() == 3){
            setVisible(true,true,true,true,true,true,true,true,true,true,true);
            setVisibleLabel(true,true,true,true,true,true,true,true,true,true,true);

        }
        if(getIndex() == 4){
            setVisible(true,true,true,true,true,true,false,false,false,false,false);
            setVisibleLabel(true,true,true,true,true,true,true,false,false,false,false);

            combo.setVisible(false);
        }
        if(getIndex() == 5 ){
            setVisible(true,true,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,true,false,false,false,false,false,false,false,false);
        }
        if(getIndex() == 6 ){
            setVisible(true,false,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,false,false,false,false,false,false,false,false,false);}
        if(getIndex() == 7 ){
            setVisible(true,false,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,false,false,false,false,false,false,false,false,false);
        }
        if(getIndex() == 8 ){
            setVisible(true,false,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,false,false,false,false,false,false,false,false,false);
        }
        if(getIndex() == 9 ){
            setVisible(true,false,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,false,false,false,false,false,false,false,false,false);
        }
        if(getIndex() == 10 ){
            setVisible(true,false,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,false,false,false,false,false,false,false,false,false);
        }
        if(getIndex() == 11 ){
            setVisible(true,false,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,false,false,false,false,false,false,false,false,false);
        }
        if(getIndex() == 12 ){
            setVisible(true,false,false,false,false,false,false,false,false,false,false);
            setVisibleLabel(true,true,false,false,false,false,false,false,false,false,false);
        }


    }
    @FXML
    private void onCheck(){

        if(pokaz.isSelected() == true){
             tProwadzacy.setProwadzacyNazwy();
             tPrzedmioty.setPrzedmiotyNazwy();
             tStudenci.setStudenciNazwa();
             tytul.setVisible(true);
             nazwisko.setVisible(true);
             tPLan.setPlanNazwy();
            tablePlan.setItems(tPLan.getOblistNazwy());

            tKatedra.setKatedraNazwy();

            tKierunek.setKierunekNazwa();

        }


        if(pokaz.isSelected() == false){
            tProwadzacy.setClearOblist();
            tProwadzacy.setProwadzacy();

            tPrzedmioty.setClearOblist();
            tPrzedmioty.setPrzedmioty();

            tStudenci.setClearOblist();
            tStudenci.setStudenci();

            tytul.setVisible(false);
            nazwisko.setVisible(false);
            tPLan.OblistClearNazwy();
            tPLan.setPlan();
            tablePlan.setItems(tPLan.getOblist());


            tKatedra.setOblistClear();
            tKatedra.setKatedra();

            tKierunek.setOblistClear();
            tKierunek.setKierunek();
        }

    }

    public  ObservableList<String>  comboWriter(){
        combo.getItems().clear();
        for(int i =0;i< tPrzedmioty.getOblist().size() ;i++){
            oblist.add(tPrzedmioty.getOblist().get(i).getId());
        }
        return oblist;
    }

  public  ObservableList<String>  comboWriterU(){
      combo.getItems().clear();
      tPrzedmioty.setClearOblist();
      tPrzedmioty.setPrzedmioty();
      for(int i =0;i< tPrzedmioty.getOblist().size() ;i++){
          oblist.add(tPrzedmioty.getOblist().get(i).getId());
      }
      return oblist;
  }
  public Integer getIndex(){
        return TabsP.getSelectionModel().getSelectedIndex();
  }
public void setVisible(Boolean s1,Boolean s2,Boolean s3,Boolean s4,Boolean s5,Boolean s6,Boolean s7,Boolean s8,Boolean s9,Boolean s10,Boolean s11){
        combo.setVisible(true);
    jed.setVisible(s1);
    dwa.setVisible(s2);
    trzy.setVisible(s3);
    czt.setVisible(s4);
    pie.setVisible(s5);
    sze.setVisible(s6);
    sie.setVisible(s7);
    osi.setVisible(s8);
    dzie.setVisible(s9);
    dzies.setVisible(s10);
    jede.setVisible(s11);
}
    public void setVisibleLabel(Boolean s1,Boolean s2,Boolean s3,Boolean s4,Boolean s5,Boolean s6,Boolean s7,Boolean s8,Boolean s9,Boolean s10,Boolean s11){
        jed1.setVisible(s1);
        dwa2.setVisible(s2);
        trzy3.setVisible(s3);
        czt4.setVisible(s4);
        pie5.setVisible(s5);
        sze6.setVisible(s6);
        sie7.setVisible(s7);
        osi8.setVisible(s8);
        dzie9.setVisible(s9);
        dzies10.setVisible(s10);
        jede11.setVisible(s11);
        dwan12.setVisible(s11);
    }

    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}


}

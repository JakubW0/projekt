package sample.Modele;

public class ModelPlan {


    String idPrzedmiot;
    String tytul;
    String idProwadzacy;
    String nazwisko;
    String idSpecjalnosc;
    String idGrupy;
    String idSemestr;
    String idTryb;
    String idKierunek;
    String idPlan;


    public ModelPlan(String idPlan,String idPrzedmiot, String tytul, String idProwadzacy, String nazwisko, String idSpecjalnosc, String idGrupy, String idSemestr, String idTryb, String idKierunek) {
        this.idPlan = idPlan;
        this.idPrzedmiot = idPrzedmiot;
        this.tytul = tytul;
        this.idProwadzacy = idProwadzacy;
        this.nazwisko = nazwisko;
        this.idSpecjalnosc = idSpecjalnosc;
        this.idGrupy = idGrupy;
        this.idSemestr = idSemestr;
        this.idTryb = idTryb;
        this.idKierunek = idKierunek;
    }

    public ModelPlan(String idPlan,String idPrzedmiot, String idProwadzacy, String idSpecjalnosc, String idGrupy, String idSemestr, String idTryb, String idKierunek) {
        this.idPlan = idPlan;
        this.idPrzedmiot = idPrzedmiot;
        this.idProwadzacy = idProwadzacy;
        this.idSpecjalnosc = idSpecjalnosc;
        this.idGrupy = idGrupy;
        this.idSemestr = idSemestr;
        this.idTryb = idTryb;
        this.idKierunek = idKierunek;
    }
    public String getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(String idPlan) {
        this.idPlan = idPlan;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getIdPrzedmiot() {
        return idPrzedmiot;
    }

    public void setIdPrzedmiot(String idPrzedmiot) {
        this.idPrzedmiot = idPrzedmiot;
    }

    public String getIdProwadzacy() {
        return idProwadzacy;
    }

    public void setIdProwadzacy(String idProwadzacy) {
        this.idProwadzacy = idProwadzacy;
    }

    public String getIdSpecjalnosc() {
        return idSpecjalnosc;
    }

    public void setIdSpecjalnosc(String idSpecjalnosc) {
        this.idSpecjalnosc = idSpecjalnosc;
    }

    public String getIdGrupy() {
        return idGrupy;
    }

    public void setIdGrupy(String idGrupy) {
        this.idGrupy = idGrupy;
    }

    public String getIdSemestr() {
        return idSemestr;
    }

    public void setIdSemestr(String idSemestr) {
        this.idSemestr = idSemestr;
    }

    public String getIdTryb() {
        return idTryb;
    }

    public void setIdTryb(String idTryb) {
        this.idTryb = idTryb;
    }

    public String getIdKierunek() {
        return idKierunek;
    }

    public void setIdKierunek(String idKierunek) {
        this.idKierunek = idKierunek;
    }


}

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

    public ModelPlan(String idPrzedmiot, String tytul, String idProwadzacy, String nazwisko, String idSpecjalnosc, String idGrupy, String idSemestr, String idTryb, String idKierunek) {
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

    public ModelPlan(String idPrzedmiot, String idProwadzacy, String idSpecjalnosc, String idGrupy, String idSemestr, String idTryb, String idKierunek) {
        this.idPrzedmiot = idPrzedmiot;
        this.idProwadzacy = idProwadzacy;
        this.idSpecjalnosc = idSpecjalnosc;
        this.idGrupy = idGrupy;
        this.idSemestr = idSemestr;
        this.idTryb = idTryb;
        this.idKierunek = idKierunek;
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

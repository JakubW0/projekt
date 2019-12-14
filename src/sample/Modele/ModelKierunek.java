package sample.Modele;

public class ModelKierunek {
    String idKierunek;
    String idWydzial;
    String nazwaKierunek;

    public ModelKierunek(String idKierunek, String idWydzial, String nazwaKierunek) {
        this.idKierunek = idKierunek;
        this.idWydzial = idWydzial;
        this.nazwaKierunek = nazwaKierunek;
    }

    public String getIdKierunek() {
        return idKierunek;
    }

    public void setIdKierunek(String idKierunek) {
        this.idKierunek = idKierunek;
    }

    public String getIdWydzial() {
        return idWydzial;
    }

    public void setIdWydzial(String idWydzial) {
        this.idWydzial = idWydzial;
    }

    public String getNazwaKierunek() {
        return nazwaKierunek;
    }

    public void setNazwaKierunek(String nazwaKierunek) {
        this.nazwaKierunek = nazwaKierunek;
    }


}

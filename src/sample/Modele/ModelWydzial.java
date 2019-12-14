package sample.Modele;

public class ModelWydzial {
    String idWydzial;
    String nazwaWydzialu;

    public ModelWydzial(String idWydzial, String nazwaWydzialu) {
        this.idWydzial = idWydzial;
        this.nazwaWydzialu = nazwaWydzialu;
    }

    public String getIdWydzial() {
        return idWydzial;
    }

    public void setIdWydzial(String idWydzial) {
        this.idWydzial = idWydzial;
    }

    public String getNazwaWydzialu() {
        return nazwaWydzialu;
    }

    public void setNazwaWydzialu(String nazwaWydzialu) {
        this.nazwaWydzialu = nazwaWydzialu;
    }
}

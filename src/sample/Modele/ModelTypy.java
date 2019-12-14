package sample.Modele;

public class ModelTypy {
    String idTyp;
    String NazwaTyp;

    public ModelTypy(String idTyp, String nazwaTyp) {
        this.idTyp = idTyp;
        NazwaTyp = nazwaTyp;
    }

    public String getIdTyp() {
        return idTyp;
    }

    public void setIdTyp(String idTyp) {
        this.idTyp = idTyp;
    }

    public String getNazwaTyp() {
        return NazwaTyp;
    }

    public void setNazwaTyp(String nazwaTyp) {
        NazwaTyp = nazwaTyp;
    }
}

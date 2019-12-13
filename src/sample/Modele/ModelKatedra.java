package sample.Modele;

public class ModelKatedra {
    String idKatedry;
    String idWydzial;
    String nazwaKatedry;

    public ModelKatedra(String idKatedry, String idWydzial, String nazwaKatedry) {
        this.idKatedry = idKatedry;
        this.idWydzial = idWydzial;
        this.nazwaKatedry = nazwaKatedry;
    }


    public String getIdKatedry() {
        return idKatedry;
    }

    public void setIdKatedry(String idKatedry) {
        this.idKatedry = idKatedry;
    }

    public String getIdWydzial() {
        return idWydzial;
    }

    public void setIdWydzial(String idWydzial) {
        this.idWydzial = idWydzial;
    }

    public String getNazwaKatedry() {
        return nazwaKatedry;
    }

    public void setNazwaKatedry(String nazwaKatedry) {
        this.nazwaKatedry = nazwaKatedry;
    }


}

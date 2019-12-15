package sample.Modele;

public class ModelSpecjalnosci {
    String idSpecjalnosc;
    String nazwaSpecjalnosci;

    public ModelSpecjalnosci(String idSpecjalnosc, String nazwaSpecjalnosci) {
        this.idSpecjalnosc = idSpecjalnosc;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }

    public String getIdSpecjalnosc() {
        return idSpecjalnosc;
    }

    public void setIdSpecjalnosc(String idSpecjalnosc) {
        this.idSpecjalnosc = idSpecjalnosc;
    }

    public String getNazwaSpecjalnosci() {
        return nazwaSpecjalnosci;
    }

    public void setNazwaSpecjalnosci(String nazwaSpecjalnosci) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }
}

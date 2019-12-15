package sample.Modele;

public class ModelPrzedmioty {
    String id,typId,nazwa,ects,godz;


    public ModelPrzedmioty(String id, String typId, String nazwa, String ects, String godz) {
        this.id = id;
        this.typId = typId;
        this.nazwa = nazwa;
        this.ects = ects;
        this.godz = godz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypId() {
        return typId;
    }

    public void setTypId(String typId) {
        this.typId = typId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getEcts() {
        return ects;
    }

    public void setEcts(String ects) {
        this.ects = ects;
    }

    public String getGodz() {
        return godz;
    }

    public void setGodz(String godz) {
        this.godz = godz;
    }
}

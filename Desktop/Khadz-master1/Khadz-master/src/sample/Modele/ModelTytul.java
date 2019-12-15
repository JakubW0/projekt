package sample.Modele;

public class ModelTytul {
    String idTytul;
    String nazwaTytul;

    public ModelTytul(String idTytul, String nazwaTytul) {
        this.idTytul = idTytul;
        this.nazwaTytul = nazwaTytul;
    }

    public String getIdTytul() {
        return idTytul;
    }

    public void setIdTytul(String idTytul) {
        this.idTytul = idTytul;
    }

    public String getNazwaTytul() {
        return nazwaTytul;
    }

    public void setNazwaTytul(String nazwaTytul) {
        this.nazwaTytul = nazwaTytul;
    }
}

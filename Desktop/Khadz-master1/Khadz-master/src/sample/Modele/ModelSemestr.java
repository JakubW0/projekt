package sample.Modele;

public class ModelSemestr {

    String idSemestr;
    String numer_sem;

    public ModelSemestr(String idSemestr, String numer_sem) {
        this.idSemestr = idSemestr;
        this.numer_sem = numer_sem;
    }
    public String getIdSemestr() {
        return idSemestr;
    }
    public void setIdSemestr(String idSemestr) {
        this.idSemestr = idSemestr;
    }
    public String getNumer_sem() {
        return numer_sem;
    }
    public void setNumer_sem(String numer_sem) {
        this.numer_sem = numer_sem;
    }
}

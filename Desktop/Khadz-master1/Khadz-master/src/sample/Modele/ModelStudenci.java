package sample.Modele;

public class ModelStudenci {
    String idStudent;
    String id_specjalnosc;
    String id_tryb;
    String id_kierunek;
    String id_semestr;
    String id_grupy;
    String nr_albumu;
    String imie_studenta;
    String nazwisko_studenta;
    String data_urodzenia_student;
    String pesel_student;
    String stypendium;

    public ModelStudenci(String idStudent, String id_specjalnosc, String id_tryb, String id_kierunek, String id_semestr, String id_grupy, String nr_albumu, String imie_studenta, String nazwisko_studenta, String data_urodzenia_student, String pesel_student, String stypendium) {
        this.idStudent = idStudent;
        this.id_specjalnosc = id_specjalnosc;
        this.id_tryb = id_tryb;
        this.id_kierunek = id_kierunek;
        this.id_semestr = id_semestr;
        this.id_grupy = id_grupy;
        this.nr_albumu = nr_albumu;
        this.imie_studenta = imie_studenta;
        this.nazwisko_studenta = nazwisko_studenta;
        this.data_urodzenia_student = data_urodzenia_student;
        this.pesel_student = pesel_student;
        this.stypendium = stypendium;
    }



    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getId_specjalnosc() {
        return id_specjalnosc;
    }

    public void setId_specjalnosc(String id_specjalnosc) {
        this.id_specjalnosc = id_specjalnosc;
    }

    public String getId_tryb() {
        return id_tryb;
    }

    public void setId_tryb(String id_tryb) {
        this.id_tryb = id_tryb;
    }

    public String getId_kierunek() {
        return id_kierunek;
    }

    public void setId_kierunek(String id_kierunek) {
        this.id_kierunek = id_kierunek;
    }

    public String getId_semestr() {
        return id_semestr;
    }

    public void setId_semestr(String id_semestr) {
        this.id_semestr = id_semestr;
    }

    public String getId_grupy() {
        return id_grupy;
    }

    public void setId_grupy(String id_grupy) {
        this.id_grupy = id_grupy;
    }

    public String getNr_albumu() {
        return nr_albumu;
    }

    public void setNr_albumu(String nr_albumu) {
        this.nr_albumu = nr_albumu;
    }

    public String getImie_studenta() {
        return imie_studenta;
    }

    public void setImie_studenta(String imie_studenta) {
        this.imie_studenta = imie_studenta;
    }

    public String getNazwisko_studenta() {
        return nazwisko_studenta;
    }

    public void setNazwisko_studenta(String nazwisko_studenta) {
        this.nazwisko_studenta = nazwisko_studenta;
    }

    public String getData_urodzenia_student() {
        return data_urodzenia_student;
    }

    public void setData_urodzenia_student(String data_urodzenia_student) {
        this.data_urodzenia_student = data_urodzenia_student;
    }

    public String getPesel_student() {
        return pesel_student;
    }

    public void setPesel_student(String pesel_student) {
        this.pesel_student = pesel_student;
    }

    public String getStypendium() {
        return stypendium;
    }

    public void setStypendium(String stypendium) {
        this.stypendium = stypendium;
    }

}

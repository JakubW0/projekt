package sample.Modele;

public class ModelProwadzacy {
    String id_prowadzacy;
    String Id_tytul;
    String id_katedry;
    String imie_prowadzacy;
    String nazwisko_prowadzacy;
    String data_urodzenia_prowadzacy;
    String pensja;
    String ilosc_dzieci;

    public ModelProwadzacy(String id_prowadzacy, String id_tytul, String id_katedry, String imie_prowadzacy, String nazwisko_prowadzacy, String data_urodzenia_prowadzacy, String pensja, String ilosc_dzieci) {
        this.id_prowadzacy = id_prowadzacy;
        Id_tytul = id_tytul;
        this.id_katedry = id_katedry;
        this.imie_prowadzacy = imie_prowadzacy;
        this.nazwisko_prowadzacy = nazwisko_prowadzacy;
        this.data_urodzenia_prowadzacy = data_urodzenia_prowadzacy;
        this.pensja = pensja;
        this.ilosc_dzieci = ilosc_dzieci;
    }


    public String getId_prowadzacy() {
        return id_prowadzacy;
    }

    public void setId_prowadzacy(String id_prowadzacy) {
        this.id_prowadzacy = id_prowadzacy;
    }

    public String getId_tytul() {
        return Id_tytul;
    }

    public void setId_tytul(String id_tytul) {
        Id_tytul = id_tytul;
    }

    public String getId_katedry() {
        return id_katedry;
    }

    public void setId_katedry(String id_katedry) {
        this.id_katedry = id_katedry;
    }

    public String getImie_prowadzacy() {
        return imie_prowadzacy;
    }

    public void setImie_prowadzacy(String imie_prowadzacy) {
        this.imie_prowadzacy = imie_prowadzacy;
    }

    public String getNazwisko_prowadzacy() {
        return nazwisko_prowadzacy;
    }

    public void setNazwisko_prowadzacy(String nazwisko_prowadzacy) {
        this.nazwisko_prowadzacy = nazwisko_prowadzacy;
    }

    public String getData_urodzenia_prowadzacy() {
        return data_urodzenia_prowadzacy;
    }

    public void setData_urodzenia_prowadzacy(String data_urodzenia_prowadzacy) {
        this.data_urodzenia_prowadzacy = data_urodzenia_prowadzacy;
    }

    public String getPensja() {
        return pensja;
    }

    public void setPensja(String pensja) {
        this.pensja = pensja;
    }

    public String getIlosc_dzieci() {
        return ilosc_dzieci;
    }

    public void setIlosc_dzieci(String ilosc_dzieci) {
        this.ilosc_dzieci = ilosc_dzieci;
    }







}

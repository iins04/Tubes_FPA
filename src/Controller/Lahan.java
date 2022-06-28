package Controller;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Kelompok 2
 */
public class Lahan {
    private SimpleStringProperty kecamatan;
    private SimpleStringProperty kriteria;
    
    public Lahan(){
        this("","");
    }
    public Lahan(String kecamatan,String kriteria) {
        this.kecamatan =new SimpleStringProperty (kecamatan);
        this.kriteria = new SimpleStringProperty (kriteria);
    }
    public String getKecamatan() {
        return kecamatan.get();
    }

    public void setKecamatan(String kec) {
        this.kecamatan.set(kec);
    }
    public String getKriteria() {
        return kriteria.get();
    }

    public void setKriteria(String kri) {
        this.kriteria.set(kri);
    }
    @Override
    public String toString() {
        return "Lahan pada kecamatan " + kecamatan + "\nkriteria = " + kriteria;
    }
}

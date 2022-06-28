package Controller;

/**
 *
 * @author Kelompok 2
 */
import javafx.beans.property.SimpleStringProperty;

public class InputLahan {
    private SimpleStringProperty nmPemilik;
    private SimpleStringProperty lokasi;
    private SimpleStringProperty jenis;
    private SimpleStringProperty modelSewa;
    
     public InputLahan(){
        this("","","","");
    }

    public InputLahan(String nmPemilik,String lokasi, String jenis, String modelSewa) {
        this.nmPemilik = new SimpleStringProperty(nmPemilik);
        this.lokasi = new SimpleStringProperty(lokasi);
        this.jenis = new SimpleStringProperty(jenis);
        this.modelSewa = new SimpleStringProperty(modelSewa);
    }
    
    public String getNmPemilik() {
        return nmPemilik.get();
    }
    public void setNmPemilik(String nmPemilik) {
        this.nmPemilik.set(nmPemilik);
    }
    public String getLokasi() {
        return lokasi.get();
    }
    public void setLokasi(String lokasi) {
        this.lokasi.set(lokasi);
    }
    public String getJenis() {
        return jenis.get();
    }
    public void setJenis(String jenis) {
        this.jenis.set(jenis);
    }
    public String getModelSewa() {
        return modelSewa.get();
    }
    public void setModelSewa(String modelSewa) {
        this.modelSewa.set(modelSewa);
    }
}
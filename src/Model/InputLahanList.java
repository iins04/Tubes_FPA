package Model;

/**
 *
 * @author Kelompok 2
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InputLahanList {
     private ObservableList<InputLahan> listdata;
    
    public InputLahanList() {
        listdata = FXCollections.observableArrayList();
    }
    
    public ObservableList<InputLahan> getData(){
        return this.listdata;
    }
    
    public void setData(String nmPemilik, String lokasi, String jenis, String modelSewa){
        listdata.add(new InputLahan(nmPemilik, lokasi, jenis, modelSewa));
    }
}


package Controller;

import Controller.Lahan;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Kelompok 2
 */
public class LahanList {
    ObservableList<Lahan> listData;
    
    public LahanList(){
        listData = FXCollections.observableArrayList();
    }
    public ObservableList<Lahan> getData() {
        return this.listData;
    }
    public void setData(String kecamatan, String kriteria) {
        listData.add(new Lahan(kecamatan, kriteria));
    }
    
}

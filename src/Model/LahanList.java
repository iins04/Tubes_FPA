package Model;

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
    public void setDummy(){
        listData.add(new Lahan("Ngaglik", "sawah"));
        listData.add(new Lahan("Ngemplak","sawah"));
        listData.add(new Lahan("Godean","kebun"));
        listData.add(new Lahan("Godean","sawah"));
     }
}

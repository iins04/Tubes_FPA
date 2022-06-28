package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kelompok 2
 */
public class StatistikController implements Initializable {
    LahanList Ll;
    int ng=0,nm=0,im=0,jt=0,gd=0,wt=0,kg=0,sw=0,kb=0;
    String kecamatan, kriteria;
    
    //barchart untuk kecamatan
    XYChart.Series data1 = new XYChart.Series<>();
    //barchart untuk kriteria
    XYChart.Series data2 = new XYChart.Series<>();
    
    @FXML
    private BarChart bcKriteria;
    @FXML
    private BarChart bcKecamatan;
    @FXML
    private ChoiceBox chbKecamatan;
    @FXML
    private RadioButton rbSawah;
    @FXML
    private RadioButton rbKebun;
    @FXML
    private ToggleGroup kriteria1;
    @FXML
    private Label label;
    @FXML
    private TableView<Lahan> tvHasil;
    @FXML
    private TableColumn<Lahan, String> tcKecamatan;
    @FXML
    private TableColumn<Lahan, String> tcKriteria;
    
    // button kembali ke home
    @FXML
    void hbKembaliAction (ActionEvent event) throws IOException {
        Parent Home  = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene (Home);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Statistik");
        stage.show();
        System.out.println("Statistik ke Home");
    }
    //button masukkan ke tabel riwayat
    @FXML
    void hbMasukkanAction (ActionEvent event) throws IOException {
        String hasil =" ";
        if (chbKecamatan.getValue().equals("Ngaglik")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                Ll.setData("Ngaglik", kriteria);
                tvHasil.setItems(Ll.getData());
            }else{
                String kriteria = rbSawah.getText();
                Ll.setData("Ngaglik", kriteria);
                tvHasil.setItems(Ll.getData());
            }
        }
        if (chbKecamatan.getValue().equals("Ngemplak")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                Ll.setData("Ngemplak", kriteria);
                tvHasil.setItems(Ll.getData());
            }else{
                String kriteria = rbSawah.getText();
                Ll.setData("Ngemplak", kriteria);
                tvHasil.setItems(Ll.getData());
            }
        }
        if (chbKecamatan.getValue().equals("Imogiri")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                Ll.setData("Imogiri", kriteria);
                tvHasil.setItems(Ll.getData());
            }else{
                String kriteria = rbSawah.getText();
                Ll.setData("Imogiri", kriteria);
                tvHasil.setItems(Ll.getData());
            }
        } 
        if (chbKecamatan.getValue().equals("Jetis")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Jetis; Kriteria= Kebun";
                Ll.setData("Jetis", kriteria);
                tvHasil.setItems(Ll.getData());
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Jetis; Kriteria= Sawah";
                Ll.setData("Jetis", kriteria);
                tvHasil.setItems(Ll.getData());
            }
        }
        if (chbKecamatan.getValue().equals("Godean")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                Ll.setData("Godean", kriteria);
                tvHasil.setItems(Ll.getData());
            }else{
                String kriteria = rbSawah.getText();
                Ll.setData("Godean", kriteria);
                tvHasil.setItems(Ll.getData());
            }
        }
        if (chbKecamatan.getValue().equals("Wates")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                Ll.setData("Wates", kriteria);
                tvHasil.setItems(Ll.getData());
            }else{
                String kriteria = rbSawah.getText();
                Ll.setData("Wates", kriteria);
                tvHasil.setItems(Ll.getData());
            }
        }
        if (chbKecamatan.getValue().equals("Kota Gede")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                Ll.setData("Kota Gede", kriteria);
                tvHasil.setItems(Ll.getData());
            }else{
                String kriteria = rbSawah.getText();
                Ll.setData("Kota Gede", kriteria);
                tvHasil.setItems(Ll.getData());
            }
        }
        label.setText("Data Telah Di Masukkan!!");
    }
    
    //button resume chart
    @FXML
    void hbResumeAction (ActionEvent event) throws IOException {
        //barchart kecamatan
        for (int i = 0; i < Ll.getData().size(); i++) {
            switch(Ll.getData().get(i).getKecamatan()){
                case"Ngaglik":
                    ng++;
                    data1.getData().add(new XYChart.Data("Ngaglik", ng));
                    break;
                case"Ngemplak":
                    nm++;
                    data1.getData().add(new XYChart.Data("Ngemplak", nm));
                    break;
                case"Imogiri":
                    im++;
                    data1.getData().add(new XYChart.Data("Imogiri", im));
                    break;
                case"Godean":
                    gd++;
                    data1.getData().add(new XYChart.Data("Godean",gd));
                    break;
                case"Jetis":
                    jt++;
                    data1.getData().add(new XYChart.Data("Jetis", jt));
                    break;
                case"Kota Gede":
                    kg++;
                    data1.getData().add(new XYChart.Data("Kota Gede", kg));
                    break;
                 case"Wates":
                    wt++;
                    data1.getData().add(new XYChart.Data("Wates", wt));
                    break;
                default:
                    break;
            }
        }
        //barchart kriteria
        for (int i = 0; i < Ll.getData().size(); i++) {
            switch(Ll.getData().get(i).getKriteria()){
                case"Sawah":
                    sw++;
                    data2.getData().add(new XYChart.Data("Sawah", sw));
                    break;
                case"Kebun":
                    kb++;
                    data2.getData().add(new XYChart.Data("Kebun", kb));
                    break;  
                default:
                    break;
            }
        }
        Ll.setData(kecamatan, kriteria);
        bcKecamatan.getData().addAll(data1);
        bcKriteria.getData().addAll(data2);
        
    }
    //button hapus
    @FXML
    void hbHapusAction (ActionEvent event) throws IOException {
        int selectedIndex = tvHasil.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            tvHasil.getItems().remove(selectedIndex);
        }

        label.setText("Data Telah Dihapus!!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Lahan lahan = new Lahan();
        
        chbKecamatan.getItems().addAll("Imogiri","Jetis","Ngaglik","Ngemplak"
                 ,"Godean","Wates","Kota Gede");
        chbKecamatan.setValue("Ngaglik");
        
        Ll = new LahanList();
        
        tcKecamatan.setCellValueFactory(new PropertyValueFactory<>("kecamatan"));
        tcKriteria.setCellValueFactory(new PropertyValueFactory<>("kriteria"));
        
        tvHasil.setItems(Ll.getData());
    }    
    
}

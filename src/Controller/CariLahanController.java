package Controller;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kelompok 2
 */
public class CariLahanController implements Initializable {
    LahanList Ll;
    
    @FXML
    private Label label;
    @FXML
    private ChoiceBox chbKecamatan;
    @FXML
    private RadioButton rbSawah;
    @FXML
    private RadioButton rbKebun;
    @FXML
    private ToggleGroup kriteria;
    @FXML
    private TextArea taHasil;
    @FXML
    private TableView<Lahan> tvHasil;
    @FXML
    private TableColumn<Lahan, String> tcKecamatan;
    @FXML
    private TableColumn<Lahan, String> tcKriteria;
    //button Tambah untuk riwayat
    /*
    @FXML
    void hbTambahAction (ActionEvent event) throws IOException {
        String hasil =" ";
        if (chbKecamatan.getValue().equals("Ngaglik")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Ngaglik; Kriteria= Kebun";
                Ll.setData("Ngaglik", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Ngaglik; Kriteria= Sawah";
                Ll.setData("Ngaglik", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Ngemplak")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Ngemplak; Kriteria= Kebun";
                Ll.setData("Ngemplak", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Ngemplak; Kriteria= Sawah";
                Ll.setData("Ngemplak", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Imogiri")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Imogiri; Kriteria= Kebun";
                Ll.setData("Imogiri", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Imogiri; Kriteria= Sawah";
                Ll.setData("Imogiri", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        } 
        if (chbKecamatan.getValue().equals("Jetis")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Jetis; Kriteria= Kebun";
                Ll.setData("Jetis", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Jetis; Kriteria= Sawah";
                Ll.setData("Jetis", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Godean")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Godean; Kriteria= Kebun";
                Ll.setData("Godean", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Godean; Kriteria= Sawah";
                Ll.setData("Godean", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Wates")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Wates; Kriteria= Kebun";
                Ll.setData("Wates", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Wates; Kriteria= Sawah";
                Ll.setData("Wates", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("KotaGede")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= KotaGede; Kriteria= Kebun";
                Ll.setData("KotaGede", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= KotaGede; Kriteria= Sawah";
                Ll.setData("KotaGede", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        label.setText("Data Telah Ditambahkan!!");
    }
    */
    //button cari 
    @FXML
    void hbCariAction (ActionEvent event) throws IOException {
        //Hasil pencarian
        String hasil =" ";
        if (chbKecamatan.getValue().equals("Ngaglik")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Ngaglik; Kriteria= Kebun";
                Ll.setData("Ngaglik", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Ngaglik; Kriteria= Sawah";
                Ll.setData("Ngaglik", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Ngemplak")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Ngemplak; Kriteria= Kebun";
                Ll.setData("Ngemplak", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Ngemplak; Kriteria= Sawah";
                Ll.setData("Ngemplak", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Imogiri")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Imogiri; Kriteria= Kebun";
                Ll.setData("Imogiri", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Imogiri; Kriteria= Sawah";
                Ll.setData("Imogiri", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        } 
        if (chbKecamatan.getValue().equals("Jetis")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Jetis; Kriteria= Kebun";
                Ll.setData("Jetis", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Jetis; Kriteria= Sawah";
                Ll.setData("Jetis", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Godean")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Godean; Kriteria= Kebun";
                Ll.setData("Godean", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Godean; Kriteria= Sawah";
                Ll.setData("Godean", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Wates")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Wates; Kriteria= Kebun";
                Ll.setData("Wates", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Wates; Kriteria= Sawah";
                Ll.setData("Wates", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("KotaGede")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= KotaGede; Kriteria= Kebun";
                Ll.setData("KotaGede", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= KotaGede; Kriteria= Sawah";
                Ll.setData("KotaGede", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        
        //pindah scene
        Parent Home  = FXMLLoader.load(getClass().getResource("StatusLahan.fxml"));
        Scene scene = new Scene (Home);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Cari Lahan");
        stage.show();
        System.out.println("Cari Lahan ke Home"); 
    }
    
     @FXML
    void hbTambahAction (ActionEvent event) throws IOException {
        String hasil =" ";
        if (chbKecamatan.getValue().equals("Ngaglik")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Ngaglik; Kriteria= Kebun";
                Ll.setData("Ngaglik", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Ngaglik; Kriteria= Sawah";
                Ll.setData("Ngaglik", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Ngemplak")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Ngemplak; Kriteria= Kebun";
                Ll.setData("Ngemplak", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Ngemplak; Kriteria= Sawah";
                Ll.setData("Ngemplak", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Imogiri")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Imogiri; Kriteria= Kebun";
                Ll.setData("Imogiri", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Imogiri; Kriteria= Sawah";
                Ll.setData("Imogiri", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        } 
        if (chbKecamatan.getValue().equals("Jetis")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Jetis; Kriteria= Kebun";
                Ll.setData("Jetis", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Jetis; Kriteria= Sawah";
                Ll.setData("Jetis", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Godean")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Godean; Kriteria= Kebun";
                Ll.setData("Godean", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Godean; Kriteria= Sawah";
                Ll.setData("Godean", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("Wates")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= Wates; Kriteria= Kebun";
                Ll.setData("Wates", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= Wates; Kriteria= Sawah";
                Ll.setData("Wates", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        if (chbKecamatan.getValue().equals("KotaGede")) {
            if(rbKebun.isSelected()){
                String kriteria = rbKebun.getText();
                hasil = "Kecamatan= KotaGede; Kriteria= Kebun";
                Ll.setData("KotaGede", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }else{
                String kriteria = rbSawah.getText();
                hasil = "Kecamatan= KotaGede; Kriteria= Sawah";
                Ll.setData("KotaGede", kriteria);
                tvHasil.setItems(Ll.getData());
                taHasil.setText(hasil);
            }
        }
        label.setText("Data Telah Ditambahkan!!");
    }
    //button simpan
    @FXML
    void hbSimpanAction (ActionEvent event) throws IOException {
        XStream xstream = new XStream(new StaxDriver());
        String xml = xstream.toXML(Ll);
        FileOutputStream berkasKeluar;
        
        try {
            byte[] data = xml.getBytes("UTF-8");
            berkasKeluar = new FileOutputStream("Lahan.xml");
            berkasKeluar.write(data);
            berkasKeluar.close();
        } catch (Exception e) {
            System.out.println("Perhatian : " + e.getMessage());
        }
        label.setText("Data Telah Disimpan!!");
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
    
    //button Kembali
    @FXML
    void hbKembaliAction (ActionEvent event) throws IOException {
        Parent Home  = FXMLLoader.load(getClass().getResource("/Controller/Home.fxml"));
        Scene scene = new Scene (Home);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Cari Lahan");
        stage.show();
        System.out.println("Cari Lahan ke Home");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Lahan lahan = new Lahan();
        
        chbKecamatan.getItems().addAll("Imogiri","Jetis","Ngaglik","Ngemplak"
                 ,"Godean","Wates","KotaGede");
        chbKecamatan.setValue("Ngaglik");
        
        tcKecamatan.setCellValueFactory(new PropertyValueFactory<>("kecamatan"));
        tcKriteria.setCellValueFactory(new PropertyValueFactory<>("kriteria"));
        
        Ll = new LahanList();
        tvHasil.setItems(Ll.getData());
    }    
    
}

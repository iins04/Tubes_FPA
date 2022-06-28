package Controller;

import Model.InputLahan;
import Model.InputLahanList;
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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kelompok 2
 */
public class InputLahanController implements Initializable {

    //button kembali ke home
    @FXML
    void hbKembaliAction (ActionEvent event) throws IOException {
        Parent Home  = FXMLLoader.load(getClass().getResource("/View/Home.fxml"));
        Scene scene = new Scene (Home);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Input Lahan");
        stage.show();
        System.out.println("Input Lahan ke Home");
    }
    InputLahanList data;
    String noReg = "",nmPemilik="",kecamatan,kabupaten,deskripsi="",jenis,modelSewa = "";
    
    @FXML
        private Label lbNmPemilik;
        @FXML
        private Label lbLokasi;
        @FXML
        private Label lbJenis;
        @FXML
        private Label lbModelSewa;
        @FXML
        private Label lbInputLahan;
        @FXML
        private Label lbDataBase;
        @FXML
        private TextField tfNmPemilik;
        @FXML
        private ChoiceBox chbLokasi;
        @FXML
        private RadioButton rbKebun;
        @FXML
        private RadioButton rbSawah;
        @FXML
        private CheckBox cbPanen;
        @FXML
        private CheckBox cbTahun;
        @FXML
        private CheckBox cbBasil;
        @FXML
        private Button btInput;
        @FXML
        private Button btEdit;
        @FXML
        private Button btHapus;
        @FXML
        private Button btSimpan;
        @FXML 
        private TableView<InputLahan> tvDataBase;
        @FXML
        private TableColumn<InputLahan, String> tcNmPemilik;  
        @FXML
        private TableColumn<InputLahan, String> tcLokasi;
        @FXML
        private TableColumn<InputLahan, String> tcJenis;  
        @FXML
        private TableColumn<InputLahan, String> tcModelSewa;  
        
        @FXML
        private void SaveButtonAction(ActionEvent event) throws IOException{
        XStream xstream = new XStream(new StaxDriver());
        String xml = xstream.toXML(data);
        FileOutputStream berkaskeluar;
        
        try {
            byte[] dataxml = xml.getBytes("UTF-8");
            berkaskeluar = new FileOutputStream("Input Lahan.xml");
            berkaskeluar.write(dataxml);
            berkaskeluar.close();
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan: "+ e.getMessage());
        }
        System.out.println("Data Berhasil Disimpan");
    }
    
    @FXML
    private void inputButtonAction(ActionEvent event){
        nmPemilik = tfNmPemilik.getText();
        kabupaten = (String) chbLokasi.getValue();
        
        if(rbKebun.isSelected()){
             jenis = rbKebun.getText();
        }else if (rbSawah.isSelected()){
             jenis = rbSawah.getText();
        }
        
        if(cbTahun.isSelected() && cbPanen.isSelected() && cbBasil.isSelected()){
            modelSewa = "1. Panenan \n2. Tahunan \n3. Bagi Hasil ";
        }else if(cbTahun.isSelected() && cbPanen.isSelected ()){
            modelSewa = "1. panenan \n2. Tahunan";
        }else if(cbTahun.isSelected() && cbBasil.isSelected()){
            modelSewa = "1. Tahunan \n2. Bagi Hasil";
        }else if (cbPanen.isSelected() && cbBasil.isSelected()) {
            modelSewa = "1. Panenan \n2. Bagi Hasil";
        }else if (cbTahun.isSelected()){
            modelSewa = "1. Tahunan";
        }else if (cbPanen.isSelected()){
            modelSewa = "1. Panenan";
        }else if(cbBasil.isSelected()){
            modelSewa = "1. Bagi Hasil";
        }else{
            modelSewa = "Kesepakatan Bersama";
        }      
             
        data.setData(nmPemilik, noReg, jenis, modelSewa);
        tvDataBase.setItems(data.getData());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        chbLokasi.getItems().addAll("Sleman","Yogyakarta Kota","Bantul","Kulon Progo","Gunung Kidul");
        chbLokasi.setValue("Sleman");
        
        tcNmPemilik.setCellValueFactory(new PropertyValueFactory<>("nmPemilik"));
        tcLokasi.setCellValueFactory(new PropertyValueFactory<>("lokasi"));
        tcJenis.setCellValueFactory(new PropertyValueFactory<>("jenis"));
        tcModelSewa.setCellValueFactory(new PropertyValueFactory<>("modelSewa"));
        
        data = new InputLahanList();
    }    
    
}

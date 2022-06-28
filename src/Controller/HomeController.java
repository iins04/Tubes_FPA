package Controller;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kelompok 2
 */
public class HomeController implements Initializable {
    //untuk button input lahan
    @FXML
    void hbInputLahanAction (ActionEvent event) throws IOException {
        Parent InputLahan  = FXMLLoader.load(getClass().getResource("InputLahan01.fxml"));
        Scene scene = new Scene (InputLahan);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Input Lahan");
        stage.show();
        System.out.println("Home ke Input Lahan");
    }
    //untuk button CariLahan
    @FXML
    void hbCariLahanAction (ActionEvent event) throws IOException {
        Parent CariLahan  = FXMLLoader.load(getClass().getResource("CariLahan.fxml"));
        Scene scene = new Scene (CariLahan);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Cari Lahan");
        stage.show();
        System.out.println("Home ke Cari Lahan");
    }
    //untuk button Data
    @FXML
    void hbDataLahanAction (ActionEvent event) throws IOException {
        Parent DataLahan  = FXMLLoader.load(getClass().getResource("DataLahan.fxml"));
        Scene scene = new Scene (DataLahan);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Data Lahan");
        stage.show();
        System.out.println("Home ke Data Lahan");
    }
    //untuk button Statistik lahan
    @FXML
    void hbStatistikAction (ActionEvent event) throws IOException {
        Parent Statistik  = FXMLLoader.load(getClass().getResource("Statistik.fxml"));
        Scene scene = new Scene (Statistik);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Statistika");
        stage.show();
        System.out.println("Home ke Statistik");
    }
    //untuk button hasilAkhir
    @FXML
    void hbHasilAkhirAction (ActionEvent event) throws IOException {
        Parent HasilAkhir = FXMLLoader.load(getClass().getResource("HasilLahan.fxml"));
        Scene scene = new Scene (HasilAkhir);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Data Lahan");
        stage.show();
        System.out.println("Home ke Data Lahan");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

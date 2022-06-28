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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kelompok 2
 */
public class StatusLahanController implements Initializable {

    //button kembali ke CariLahan
    @FXML
    void hbKembaliAction (ActionEvent event) throws IOException {
        Parent cariLahan  = FXMLLoader.load(getClass().getResource("CariLahan.fxml"));
        Scene scene = new Scene (cariLahan);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Status Lahan");
        stage.show();
        System.out.println("Status Lahan ke Cari Lahan");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

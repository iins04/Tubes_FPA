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
public class HasilLahanController implements Initializable {

    //button kembali ke home
    @FXML
    void hbKembaliAction (ActionEvent event) throws IOException {
        Parent Home  = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene (Home);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Hasil Lahan");
        stage.show();
        System.out.println("Hasil Lahan ke Home");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

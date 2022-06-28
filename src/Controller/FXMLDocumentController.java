package Controller;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author kelompok 2
 */
public class FXMLDocumentController implements Initializable {
//Berisi code Login
    @FXML
    private TextField tfNama;
    @FXML
    private TextField tfPass;
    @FXML
    private Label label;
    
    @FXML
    void hbLoginAction (ActionEvent event) throws IOException {
        Parent Home  = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene (Home);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow() ;
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
        System.out.println("Login ke Home");
        label.setText("Halo " + tfNama +"!!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

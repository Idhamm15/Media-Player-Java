/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package phbmediaplayer;

import java.net.URL;
import java.io.File;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.util.Pair;
import javax.xml.transform.Source;



/**
 * FXML Controller class
 *
 * @author idham
 */
public class FXMLDocumentController implements Initializable {
    private MediaPlayer MediaPlayer;
    
    @FXML
    private MediaView MediaView;
    
    @FXML
    private StackPane sPane;
    
    @FXML
    private Button playPause;
    
    @FXML
    private Slider volume;
    
    @FXML Slider Seek;
    
    @FXML
    BorderPane bPane;
    
    List<String> playList = new ArrayList<>();
    List<String> sourceName = new ArrayList<>();
    static int INDEX,PLAY=0;
    
    
    @FXML
    private void openFiles(ActionEvent event) {
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter(""
        + "Media FIle ", "*.mp3", ".mp4");
        fc.getExtensionFilters().add(filter);
        List<File> f = fc.showOpenMultipleDialog(null);
        if (!f.isEmpty()) {
            if (!playList.isEmpty()) {
                playList.clear();
                sourceName.clear();
            }
            for (int i = 0; i < f.size(); i++) {
                playList.add(f.get(i).toURI().toString());
                sourceName.add(f.get(i).getName());
            } 
        }
    }

    /**
     * Initializes the controller class.
     */
    
    @Override;
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

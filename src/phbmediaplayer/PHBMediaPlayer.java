/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phbmediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author idham
 */
public class PHBMediaPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        @Ovveride
        public void start (Stage stage) throws Exception {
        Parent root = FHMLLoader.load(getClass().getREsource("FXMLDocument.fxml"));
        Scene scene = new Scene (root);
        stage.setScene (scene);
        stage.setTitle("PHB Media Player");
        Scene.setOnMouseClicked((MouseEvent event) -> {
            if (event.getClickCount() == 2) {
                stage.setFullScreen(true);
            }
        });
        stage.show();
    }
        public static void main (String [] args) {
            launch(argh);
        }
    }
    
    
}

//
package org.athenatechnologies.clinicadentalpenia.gui;

//

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/org/athenatechnologies/clinicadentalpenia/gui/fxml/Start.fxml"));
        
        Scene scene = new Scene(root);
        
        scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
        
        primaryStage.setTitle("Sistema de control Clinica Dental Peña");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}

    
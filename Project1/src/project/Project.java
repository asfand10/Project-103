
package project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Muhammad Talha
 */
public class Project extends Application {
    
   Stage primaryStage3;
    @Override
    public void start(Stage primaryStage) {
      

       try{  
       Parent root = FXMLLoader.load(getClass().getResource("/project/latest_login.fxml"));
       Scene scene = new Scene(root);
       scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
       
        primaryStage.initStyle(StageStyle.UNDECORATED);
       primaryStage.setScene(scene);
       primaryStage.show();
       
       
       
    }
       catch(Exception e){
           e.printStackTrace();
       }
    }
    
    public void close(){
            
        }
    public static void main(String[] args) {
        launch(args);
        
    }
    
}

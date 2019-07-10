/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
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
public class latest_login extends Application  {
   
    @Override
    public void start(Stage primaryStage) {
         try{
         Parent root = FXMLLoader.load(getClass().getResource("/project/latest_login.fxml"));
       primaryStage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Gear-Up");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    catch(IOException e){
    e.printStackTrace();
    
}}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

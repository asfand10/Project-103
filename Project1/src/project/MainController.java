
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.*;

public class MainController {
    @FXML
    private Label LabelID;
    
   // @FXML
     
    @FXML
    private TextField Username;
    @FXML
    private TextField Password;
    @FXML
    private TextField genre;
  
   public void Login(ActionEvent event)throws Exception{
         
       if(Username.getText().equals("user") && Password.getText().equals("Pass")){
        LabelID.setText("Login Success");
        
        Stage primaryStage2 = new Stage();
        
       Parent root = FXMLLoader.load(getClass().getResource("firstpage.fxml"));
       Scene scene = new Scene(root);
       scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
       
       primaryStage2.setTitle("OOP project");
       primaryStage2.setScene(scene);
      
       primaryStage2.show();
         
        
       }
       else{
           LabelID.setText("Incorrect user name or Password");
       }
   }
   
   public void search(ActionEvent event)throws Exception{
       String genre1 = genre.getText();
       
      
       if(genre1.equals("Action")){
           System.out.printf("You have searched for %s movies", genre1);
           
       };
   

}
   public void fileSearch()throws FileNotFoundException, IOException{
       
       
       String excelFilePath = "//movies//List Of American Films 2010.xls";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        //File file = new File("//movies//List Of American Films 2010.xls");
         Workbook workbook = new XSSFWorkbook(inputStream);
          Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
             
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                 
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                }
                System.out.print(" - ");
            }
            System.out.println();
        }
         
        workbook.close();
        inputStream.close();
    }
   }



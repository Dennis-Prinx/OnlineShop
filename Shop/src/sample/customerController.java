package sample;

import connectivity.database;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class customerController implements Initializable{

    @FXML
    private TextField columnFirstName;
    @FXML
    private TextField columnSeccondName;
    @FXML
    private TextField columnPhoneNumber;
    @FXML
    private TextField columnAddress;
    @FXML
    private TextField columnDebt;
    @FXML
    private Button create;



    //Initialize observable list to hold out database data

    private database dc;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        dc = new database();

    }
    @FXML
    private void addDataToDatabase(javafx.event.ActionEvent event) throws Exception{
        try {
            Connection conn = dc.getConnecton();
            String sql = "INSERT INTO CUSTOMER VALUES ('"+columnFirstName.getText()+"','"+columnSeccondName.getText()+"','"+columnPhoneNumber.getText()+"','"+columnAddress.getText()+"','"+columnDebt.getText()+"')";

            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("stock.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();

        } catch (SQLException ex){
            System.err.println("Error occured"+ex);
        }

   

    }
  



}

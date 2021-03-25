package sample;

import java.net.URL;
import java.util.ResourceBundle;

import connectivity.database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReceiptController implements Initializable {
	sellitemsController ss = new sellitemsController();
	
	private database dc;
	 @FXML
	    private TableView<?> tableStock;

	    @FXML
	    private TableColumn<?, ?> columnItem;

	    @FXML
	    private TableColumn<?, ?> columnQuantity;

	    @FXML
	    private TableColumn<?, ?> columnPrice;

	    @FXML
	    private TableColumn<?, ?> columnSum;

	    @FXML
	    private TextField textTotal;

	    @FXML
	    private TextField textAmount;
	    
	   private ObservableList<stock> data;
	    
	    private Double ans;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		   dc = new database();
	     

	

	
}
}
package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Producto;

public class controlVentana implements Initializable {
	
private	Producto producto;
	
	
	    @FXML
	    private Label resultado;

	    @FXML
	    private TextField n1;

	    @FXML
	    private TextField n2;

	    @FXML
	    void calcular(ActionEvent event) {
	    	
	    	int num1 = Integer.parseInt(n1.getText());
	    	int num2 = Integer.parseInt(n2.getText());
	    	
	    	
	    	int result = producto.calcularProducto(num1, num2);
	    	
	    	resultado.setText(""+ result);

	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			producto = new Producto();
			
			
		}

	    
	    
	}


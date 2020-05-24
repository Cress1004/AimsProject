package hust.soict.hedspi.gui;

import java.util.ArrayList;

import hust.soict.hedspi.aims.order.Order;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu extends Application{
	@Override
	   public void start(Stage primaryStage) throws Exception {
		ArrayList <Order> orders = new ArrayList <Order>();
		GridPane root = new GridPane();
	 
	       root.setPadding(new Insets(20));
	       root.setHgap(25);
	       root.setVgap(15);
	 
	       Label labelTitle = new Label("Menu"); 
	       GridPane.setHalignment(labelTitle, HPos.CENTER);
	       // Put on cell (7,1), span 2 column, 1 row.
	       root.add(labelTitle, 7, 1, 2, 1);	 	 
	       Button createOrderButton = new Button("Create new order");
	      
	       createOrderButton.setOnAction(new EventHandler<ActionEvent>() {   
	    	    @Override
	    	    public void handle(ActionEvent event) {
	    	    	Order order = new Order();
	    	    	if(orders.size()<=5) {
	    	    		Alert alert = new Alert(AlertType.INFORMATION);
		    	        alert.setTitle("Notice");
		    	        alert.setHeaderText(null);
	    	    		orders.add(order);
	    	    		alert.setContentText("Order is created");
	    	    		alert.showAndWait();
	    	    	}
	    			else {
	    				Alert alert = new Alert(AlertType.ERROR);
	    		        alert.setTitle("Error");
	    		        alert.setHeaderText(null);
	    		        alert.setContentText("Can not add more order");
	    		        alert.showAndWait();				
	    			}	
	    	    }
	    	});
			
	       Button addItemsButton = new Button("Add items to the order");
	       addItemsButton.setOnAction(new EventHandler<ActionEvent>() {   
	    	    @Override
	    	    public void handle(ActionEvent event) {
	    	    	if(orders.size() == 0) {
	    	    		Alert alert = new Alert(AlertType.ERROR);
	    		        alert.setTitle("Error");
	    		        alert.setHeaderText(null);
	    		        alert.setContentText("List order is empty");
	    		        alert.showAndWait();				
	   				}
	    	    	else{
	    	    		GridPane root = new GridPane();
		    	    	root.setPadding(new Insets(20));
		    		    root.setHgap(25);
		    		    root.setVgap(15);
		    		    Label labelTitle = new Label("Select Type"); 
		    		    GridPane.setHalignment(labelTitle, HPos.CENTER);
		    		    // Put on cell (7,1), span 2 column, 1 row.
		    		    root.add(labelTitle, 7, 1, 2, 1);	 	 
		    		    Button addBookButton = new Button("Add Book"); 
		    		    GridPane.setHalignment(addBookButton, HPos.LEFT);
		    		    root.add(addBookButton, 7, 2, 2, 1);
		    		    Button addCDButton = new Button("Add Compact Disc");
		    		    GridPane.setHalignment(addCDButton, HPos.LEFT);
		    		    root.add(addCDButton, 7, 3, 2, 1);
		    		    Button addDVDButton = new Button("Add Digital Video Disc");
		    		    GridPane.setHalignment(addDVDButton, HPos.LEFT);
		    		    root.add(addDVDButton, 7, 4, 2, 1);
		    		    Button exitButton = new Button("Exit");
		    		    GridPane.setHalignment(exitButton, HPos.LEFT);
		    		    root.add(exitButton, 3, 5, 2, 1);
		    		    Button closeButton = new Button("Close");
		    		    GridPane.setHalignment(closeButton, HPos.RIGHT);
		    		    root.add(closeButton, 9, 5, 2, 1);
		    		    Scene scene = new Scene(root, 500, 500);
		    		       primaryStage.setTitle("Aims Project");
		    		       primaryStage.setScene(scene);
		    		       primaryStage.show(); 
	    	    	}
	    	    }
	    	});
	       Button deleteItemsButton = new Button("Delete items by id");
	       Button printAllItemsButton = new Button("Display all items of order");
	       Button closeButton = new Button("Close");

	       GridPane.setHalignment(createOrderButton, HPos.LEFT);
	       root.add(createOrderButton, 7, 3, 2, 1);
	       GridPane.setHalignment(addItemsButton, HPos.LEFT);
	       root.add(addItemsButton, 7, 4, 2, 1);
	       GridPane.setHalignment(deleteItemsButton, HPos.LEFT);
	       root.add(deleteItemsButton, 7, 5, 2, 1);
	       GridPane.setHalignment(printAllItemsButton, HPos.LEFT);
	       root.add(printAllItemsButton, 7, 6, 2, 1);
	       GridPane.setHalignment(printAllItemsButton, HPos.RIGHT);
	       root.add(closeButton,10, 7, 2, 1);

	       Scene scene = new Scene(root, 500, 500);
	       primaryStage.setTitle("Aims Project");
	       primaryStage.setScene(scene);
	       primaryStage.show();
	       
	   }
	   public static void main(String[] args) {
	       launch(args);
	   }
}

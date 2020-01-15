/** This is a graphical purchasing calculator using JavaFX 
that allows users enter a unit price and quantity of an item 
and then calculates the breakdown of the purchase price.
@author Jackie Omekara
 */ 
 
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.text.NumberFormat;



public class PurchasingCalculator extends Application{
	
	Text text1;
	Text text2;
	Text text3;
	Text text4;
	Text text5;
	Text text6;
	TextField unitPriceTxt;
	TextField quantityTxt;
	NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage primaryStage){
		
		text1 = new Text("Unit Price:");
		text2 = new Text("Quantity:");
		text3 = new Text("Enter the purchase information.");
		text4 = new Text("Purchase Subtotal:");
		text5 = new Text("New Brunswick Sales Tax:");
		text6 = new Text("Purchase Total:");
		
		Button button1 = new Button("Calculate");
		button1.setOnAction(this::calcButton);
		
		Button button2 = new Button("Clear");
		button2.setOnAction(this::clearButton);
		
		unitPriceTxt = new TextField();
		quantityTxt = new TextField();

		FlowPane flowpane = new FlowPane(text1,unitPriceTxt,text2,quantityTxt,button1,button2,text3,text4,text5,text6);
		flowpane.setAlignment(Pos.CENTER);
		flowpane.setHgap(10);
		flowpane.setVgap(15);
		Scene scene = new Scene(flowpane, 216, 350);
		
		primaryStage.setTitle("Purchasing Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
			
	
	}
		public void calcButton(ActionEvent event){
			double unitpriceVal  = Double.parseDouble( unitPriceTxt.getText());
			
			int quantityVal = Integer.parseInt(quantityTxt.getText());
			
		    text3.setText("Purchase Cost Breakdown:");
			
			double purchaseSubtotal = unitpriceVal*  quantityVal;
			
			text4.setText("Purchase Subtotal: " + fmt1.format(purchaseSubtotal));
			
		    double nbSalesTax = 0.15 * purchaseSubtotal;
			
			text5.setText("New Brunswick Sales Tax: " + fmt1.format(nbSalesTax));
			
			double purchaseTotal = nbSalesTax + purchaseSubtotal;
			
			text6.setText("Purchase Total: " + fmt1.format(purchaseTotal));
		}
			
			
		public void clearButton(ActionEvent event){
			unitPriceTxt.setText("");
			quantityTxt.setText("");
			text3.setText("Enter the purchase information.");
			text4.setText("Purchase Subtotal:");
			text5.setText("New Brunswick Sales Tax:");
			text6.setText("Purchase Total:");
		}
			
			
}
/** This is a graphical booking calculator using JavaFX that
allows users enter their name , number of guests staying ,
number of beds and number of nights to be spent at the Hotel
and then calculates the total booking cost based on the type of room 
it is i.e. Suite or Standard room.
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

public class BookingCalculator extends Application{
	Text text1;
	Text text2;
	Text text3;
	Text text4;
	Text text5;
	Text text6;
	Text text7;
	TextField custName;
	TextField guests;
	TextField beds;
	TextField nights;
	NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage primaryStage){
		
		text1 = new Text("Name:");
		text2 = new Text("Number of Guests:");
		text3 = new Text("Number of Beds:");
		text4 = new Text("Number of Nights:");
		text5 = new Text("Welcome to Hotels R Us!");
		text6 = new Text("Take note of your check-out time.");
		text7 = new Text("Enter your information.");
		
		
		Button button1 = new Button("Suite");
		button1.setOnAction(this::suiteCalc);
		
		Button button2 = new Button("Standard");
		button2.setOnAction(this::standardCalc);
		
		Button button3 = new Button("Reset");
		button3.setOnAction(this::resetCalc);
		
		custName = new TextField();
		guests = new TextField();
		beds = new TextField();
		nights = new TextField();

		FlowPane flowpane = new FlowPane(text1,custName,text2,guests,text3,beds,text4,nights,button1,button2,button3,text5,text6,text7);
		flowpane.setAlignment(Pos.CENTER);
		flowpane.setHgap(35);
		flowpane.setVgap(15);
		Scene scene = new Scene(flowpane, 290, 350);
		
		primaryStage.setTitle("Booking Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
			
	
	}
		public void suiteCalc(ActionEvent event){
			int guestSuite = Integer.parseInt(guests.getText());
			int bedSuite = Integer.parseInt(beds.getText());
			int nightSuite = Integer.parseInt(nights.getText());
			Suite suite1 = new Suite(custName.getText(),nightSuite,guestSuite,bedSuite);
			text5.setText("Your room perk is: " + suite1.getPerk());
			text6.setText("Please checkout by: " + suite1.getCheckoutTimeSuite());
			text7.setText("Total Cost: " + fmt1.format(suite1.roomCost()));
		}
		
		
		public void standardCalc(ActionEvent event){
			int guestStandard = Integer.parseInt(guests.getText());
			int bedStandard = Integer.parseInt(beds.getText());
			int nightStandard = Integer.parseInt(nights.getText());
			Standard standard1 = new Standard(custName.getText(),nightStandard,guestStandard,bedStandard);
			text5.setText("Breakfast included in room cost.");
			text6.setText("Please checkout by: " + standard1.getCheckoutTimeStandard());
			text7.setText("Total Cost: " + fmt1.format(standard1.roomCost()));
			
		}
			
		public void resetCalc(ActionEvent event){
			custName.setText("");
			guests.setText("");
			beds.setText("");
			nights.setText("");
			text1.setText("Name:");
			text2.setText("Number of Guests:");
			text3.setText("Number of Beds:");
			text4.setText("Number of Nights:");
			text5.setText("Welcome to Hotels R Us!");
			text6.setText("Take note of your checkout time.");
			text7.setText("Enter your information.");
		}
			
			
}
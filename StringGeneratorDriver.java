/**
This class uses a GUI to generate acronyms and passwords
@author Jackie Omekara
*/
import java.text.NumberFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.event.*;

public class StringGeneratorDriver extends Application
{
  Label top, create;
  TextField topField;
  Button acronym, password, reset;
  FlowPane pane;
  public void start (Stage primaryStage)
  {
    top = new Label("Enter a title or phrase: ");
    topField = new TextField();
    create = new Label("Let's create an acronym or password!");
    topField.setPrefWidth(453);
    acronym = new Button("Generate Acronym");
    acronym.setOnAction(this::acronymButton);
    password = new Button("Generate Password");
    password.setOnAction(this::passwordButton);
    reset = new Button("Reset");
    reset.setOnAction(this::resetButton);
    pane = new FlowPane(top, topField, acronym, password, reset, create);
    pane .setAlignment(Pos.CENTER);
    pane.setVgap(35);
    pane.setHgap(47);
    pane.setStyle("-fx-background-color: white");
    Scene scene = new Scene(pane, 500, 360);
    primaryStage.setTitle("String Generator");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  public void acronymButton(ActionEvent event)
  {
    create.setText(StringGenerator.generateAcronym(topField.getText()));

  }
  public void passwordButton(ActionEvent event)
  {
    create.setText(StringGenerator.generatePassword(topField.getText()));
  }
  public void resetButton(ActionEvent event)
  {
    top.setText("Enter a title or phrase: ");
    topField.clear();
    create.setText("Let's create an acronym or password!");
  }

  public static void main(String[] args)
  {
    launch(args);
  }
}

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LetterGuessingGUI extends Application
{
    private TextField textField;
    private Button button;
    private Label label;
    private char letterToGuess;
    
    public void start(Stage primaryStage)
    {
        textField = new TextField();
        textField.setPrefWidth(50);
        textField.setAlignment(Pos.CENTER);

        // TODO Set the event handler for when the enter key is
        // pressed in the text field to be the processGuess method
        textField.setOnAction(this::processGuess);

        button = new Button("Guess!");

        // TODO Set the event handler for when the button is pressed
        // to be the processGuess method
        button.setOnAction(this::processGuess);

        label = new Label("Guess girl");

        FlowPane pane;

        // TODO Instantiate a new FlowPane that includes textField,
        // button, and label as children
        pane = new FlowPane(textField, button, label);

        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setVgap(20);
        
        Scene scene = new Scene(pane, 200, 150);
        
   
        primaryStage.setTitle("Letter Guessing Game");
        primaryStage.setScene(scene);
        primaryStage.show();
     	initializeLetterToGuess();

    }

    /**
       Initializes letterToGuess to a randomly-selected lowercase letter
    */
    private void initializeLetterToGuess()
    {
        // TODO Complete this method

        int charVal = (int) (Math.random() * 26 + 'a');
        letterToGuess = (char) charVal;
        System.out.println("The answer is " + letterToGuess + " Shhhh...");
    }

    /**
       Updates the label to show the letter that was guessed, and
       whether it is too high, too low, or correct. If the guess is
       correct, also disable the text field and button. If the guess
       is not a character, update the label to tell the user to enter
       a character. In each case, set the text in the text field to be
       empty.
    */
    public void processGuess(ActionEvent event) 
    {
        // TODO Complete this method

        String text = textField.getText();
        textField.setText("");
        char guess = text.charAt(0);

        if (text.length() != 1) {
            label.setText("Guess a letter!");
        }
        else {
            if (guess < letterToGuess) {
                label.setText("Last guess: " + guess + " Guess higher");
            }
            else if (guess > letterToGuess) {
                label.setText("Last guess: " + guess + " Guess lower");
            }
            else {
                label.setText("Last guess: " + guess + " You win!");
                button.setDisable(true);
                textField.setDisable(true);
            }
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

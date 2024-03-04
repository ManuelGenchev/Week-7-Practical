import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label with the specified text
        Label label = new Label("Welcome to JavaFX!");

        // Create a StackPane layout and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a Scene with the layout
        Scene scene = new Scene(root, 300, 200);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Set the title of the window
        primaryStage.setTitle("HelloJavaFX");

        // Create a Button for form submission
        Button submitButton = new Button("Submit Form");

        // Add event handling for the submit button
        submitButton.setOnAction(e -> {
            // Show the "Form Submitted" popup
            showPopup("Form Submitted!");
        });

        // Create a VBox layout and add the label and submit button
        VBox vBox = new VBox(10); // 10 is the spacing between elements
        vBox.getChildren().addAll(label, submitButton);

        // Set the layout of the root StackPane to the VBox
        root.getChildren().add(vBox);

        // Show the stage (window)
        primaryStage.show();
    }

    private void showPopup(String message) {
        // Create a Popup with a Label displaying the message
        Popup popup = new Popup();
        Label popupLabel = new Label(message);
        popupLabel.setStyle("-fx-background-color: lightblue; -fx-padding: 10px;");
        popup.getContent().add(popupLabel);

        // Set the position of the popup relative to the primary stage
        popup.show(primaryStage, primaryStage.getX() + primaryStage.getWidth() / 2 - 75,
                primaryStage.getY() + primaryStage.getHeight() / 2 - 30);

        // Close the popup after 2 seconds (you can adjust the duration)
        javafx.animation.PauseTransition pause = new javafx.animation.PauseTransition(javafx.util.Duration.seconds(2));
        pause.setOnFinished(event -> popup.hide());
        pause.play();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}

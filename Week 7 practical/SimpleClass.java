import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create Labels for each field
        Label nameLabel = new Label("Name:");
        Label emailLabel = new Label("Email:");
        Label phoneLabel = new Label("Phone Number:");

        // Create TextFields for user input
        TextField nameTextField = new TextField();
        TextField emailTextField = new TextField();
        TextField phoneTextField = new TextField();

        // Create a Button for submission
        Button submitButton = new Button("Submit");

        // Add event handling for the submit button (you can customize this part)
        submitButton.setOnAction(e -> {
            // Retrieve user input from TextFields
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String phoneNumber = phoneTextField.getText();

            // You can add further processing logic or validation here

            // For now, let's just print the input values
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
        });

        // Create a VBox layout and add the elements
        VBox root = new VBox(10); // 10 is the spacing between elements
        root.getChildren().addAll(nameLabel, nameTextField, emailLabel, emailTextField, phoneLabel, phoneTextField, submitButton);

        // Create a Scene with the layout
        Scene scene = new Scene(root, 300, 200);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Set the title of the window
        primaryStage.setTitle("SimpleForm");

        // Show the stage (window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}

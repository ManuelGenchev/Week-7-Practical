import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
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

        // Show the stage (window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}

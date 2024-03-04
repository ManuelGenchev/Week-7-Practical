import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageDisplayApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Load the image from the project's resources
        Image image = new Image(getClass().getResourceAsStream("/path/to/your/image.jpg"));

        // Create an ImageView to display the image
        ImageView imageView = new ImageView(image);

        // Create a StackPane layout and add the ImageView to it
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        // Create a Scene with the layout
        Scene scene = new Scene(root, 400, 300);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Set the title of the window
        primaryStage.setTitle("Image Display");

        // Show the stage (window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}

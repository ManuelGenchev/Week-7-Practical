import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UniqueInterfaceApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create header label
        Label headerLabel = new Label("JavaFX Dashboard");

        // Create buttons for different sections
        Button section1Button = new Button("Section 1");
        Button section2Button = new Button("Section 2");
        Button section3Button = new Button("Section 3");

        // Create a VBox for the buttons
        VBox buttonsVBox = new VBox(10);
        buttonsVBox.setAlignment(Pos.CENTER);
        buttonsVBox.getChildren().addAll(section1Button, section2Button, section3Button);

        // Create a StackPane for the main content
        StackPane mainContentStackPane = new StackPane();
        mainContentStackPane.getChildren().add(new Label("Welcome to the Dashboard!"));

        // Create an HBox for the entire layout
        HBox root = new HBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(buttonsVBox, mainContentStackPane);

        // Set up button actions
        section1Button.setOnAction(e -> showSection("Section 1"));
        section2Button.setOnAction(e -> showSection("Section 2"));
        section3Button.setOnAction(e -> showSection("Section 3"));

        // Create a Scene with the layout
        Scene scene = new Scene(root, 600, 400);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Set the title of the window
        primaryStage.setTitle("Unique Interface");

        // Show the stage (window)
        primaryStage.show();
    }

    private void showSection(String sectionName) {
        // Update the main content based on the selected section
        StackPane mainContentStackPane = new StackPane();
        mainContentStackPane.getChildren().add(new Label("Welcome to " + sectionName + "!"));

        // Replace the existing content with the new content
        ((HBox)mainContentStackPane.getParent()).getChildren().set(1, mainContentStackPane);
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}

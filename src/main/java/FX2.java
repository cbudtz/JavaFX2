import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class FX2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello FX13 - Commit Nr 2 fra Johnny og Brian");
        Label label2 = new Label("Ny spændende label Label");
        Label label3 = new Label("Master Label - Hemmelig Label!");
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(label);
        flowPane.getChildren().add(label3);
        flowPane.getChildren().add(label2);
        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

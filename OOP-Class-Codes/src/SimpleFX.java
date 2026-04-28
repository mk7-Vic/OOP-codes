import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label lblName = new Label("Name:");
        TextField txtName = new TextField();
        Button btnOk = new Button("OK");
        Label lblMsg = new Label();

        btnOk.setOnAction(e -> lblMsg.setText("Hello, " + txtName.getText()));

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(lblName, 0, 0);
        grid.add(txtName, 1, 0);
        grid.add(btnOk, 1, 1);
        grid.add(lblMsg, 0, 2, 2, 1);

        Scene scene = new Scene(grid, 320, 180);
        primaryStage.setTitle("SimpleFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

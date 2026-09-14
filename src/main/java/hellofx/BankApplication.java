package hellofx;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Launcher added to make the archived coursework runnable with Maven. */
public class BankApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL loginView = Objects.requireNonNull(
                BankApplication.class.getResource("/hellofx/hellofx.fxml"),
                "Missing login view: /hellofx/hellofx.fxml");
        Parent root = FXMLLoader.load(loginView);
        stage.setTitle("Bank Application — Coursework Demo");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package lk.ijse.gdse66;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.gdse66.configaration.SessionFactoryConfig;

public class AppInitalizer extends Application {
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/view/loginPageForm.fxml")));
        stage.setScene(scene);
        stage.setTitle("Car Rental System");
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
}
package lk.ijse.gdse66;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.gdse66.configaration.SessionFactoryConfig;

public class AppInitalizer extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        SessionFactoryConfig.getInstance().getSession();

        Parent parent =  FXMLLoader.load(getClass().getResource("/lk/ijse/gdse/orm/hibernate/view/loginPageForm.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle("Hostel Management System");
        stage.centerOnScreen();
        stage.setResizable(false);

        stage.show();
    }
}
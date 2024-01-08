package lk.ijse.gdse66;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.gdse66.configaration.SessionFactoryConfig;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        SessionFactoryConfig.getInstance().getSession();
        Parent rootNode =  FXMLLoader.load(this.getClass().getResource("/view/loginPageForm.fxml"));

        Scene scene = new Scene(rootNode);

        stage.setTitle("Item Form");
        stage.centerOnScreen();
        stage.setScene(scene);

        stage.show();
    }
}
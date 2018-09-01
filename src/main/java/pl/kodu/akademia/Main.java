package pl.kodu.akademia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("C:/Users/matiz/Desktop/test/loginSystem/src/main/resources/loginFlowPane.fxml"));
        //System.out.println("/resources/loginFlowPane.fxml");
        //fxmlLoader.setLocation(getClass().getResource("/main/resources/loginFlowPane.fxml"));
        FlowPane loginFlowPane = fxmlLoader.load();

        Scene scene = new Scene(loginFlowPane, 300, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.setTitle("Login");
    }
}

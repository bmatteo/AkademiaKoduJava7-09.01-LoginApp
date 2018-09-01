package pl.kodu.akademia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import pl.kodu.akademia.repository.UserRepository;

import java.net.URL;
import java.nio.file.Paths;

public class Main extends Application {

    public static Stage primaryStage;

    public static void main(String[] args) {
        UserRepository.generateData();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Main.primaryStage = primaryStage;
        String path = "C:/Users/matiz/Desktop/test/loginSystem/src/main/resources/loginFlowPane.fxml";
        URL fxmlURL = Paths.get(path).toUri().toURL();
        FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
        AnchorPane anchorPane = fxmlLoader.load();

        Scene scene = new Scene(anchorPane, 300, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.setTitle("Login");
    }
}

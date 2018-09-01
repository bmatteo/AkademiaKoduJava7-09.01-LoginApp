package pl.kodu.akademia.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.apache.commons.codec.digest.DigestUtils;
import pl.kodu.akademia.Main;
import pl.kodu.akademia.repository.UserRepository;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

public class LoginFlowPane {
    @FXML
    Label userLabel;
    @FXML
    Label passLabel;
    @FXML
    TextField user;
    @FXML
    PasswordField password;
    @FXML
    Button login;

    @FXML
    public void authenticate() throws IOException {
        String user = this.user.getText();
        String password = this.password.getText();

        String passwordFromRepository = UserRepository.userData.get(user);

        if(passwordFromRepository == null) {
            System.out.println("Nie działa!!");
            return;
        }

        String hashedPassword = DigestUtils.md5Hex(password).toUpperCase();

        if(passwordFromRepository.equals(hashedPassword)) {
            String path = "C:/Users/matiz/Desktop/test/loginSystem/src/main/resources/greetingsPane.fxml";
            URL fxmlURL = Paths.get(path).toUri().toURL();
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
            AnchorPane anchorPane = fxmlLoader.load();
            Main.primaryStage.setScene(new Scene(anchorPane, 300, 300));
        } else {
            System.out.println("Nie działa!!");
        }


    }
}

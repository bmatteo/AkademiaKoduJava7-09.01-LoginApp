package pl.kodu.akademia.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GreetingsPane {

    @FXML
    Button exit;

    @FXML
    Label greetings;

    @FXML
    public void exit() {
        System.exit(0);
    }
}

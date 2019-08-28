package pl.qw8415.mp3player.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController {

    @FXML
    private TableView<?> contentTable;

    public void initialize() {
        System.out.println("Created ContentController");
    }
}


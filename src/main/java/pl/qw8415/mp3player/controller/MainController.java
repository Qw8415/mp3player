package pl.qw8415.mp3player.controller;

import javafx.fxml.FXML;

public class MainController {

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    @FXML
    private MenuPaneController menuPaneController;

    public void initialize() {
        System.out.println("Created MainController");
        System.out.println(contentPaneController);
        System.out.println(controlPaneController);
        System.out.println(menuPaneController);
    }

}

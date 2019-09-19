package pl.qw8415.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class ControlPaneController {

    @FXML
    private Button previousButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider progressSlider;

    public void initialize() {
        configureButtons();
        configureSliders();
    }

    public Button getPreviousButton() {
        return previousButton;
    }

    public ToggleButton getPlayButton() {
        return playButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public Slider getVolumeSlider() {
        return volumeSlider;
    }

    public Slider getProgressSlider() {
        return progressSlider;
    }

    private void configureSliders() {
        volumeSlider.valueProperty().addListener((observableValue, oldValue, newValue) ->
                System.out.println("Zmiana głośności " + newValue.intValue())
        );
        progressSlider.valueProperty().addListener(x ->
                System.out.println("Przesunięcie piosnki")
        );
    }

    private void configureButtons() {
        previousButton.setOnAction(event -> System.out.println("Previous track"));
        nextButton.setOnAction(event -> System.out.println("Next track"));
        playButton.setOnAction(event -> {
            if (playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }
        });
    }

}

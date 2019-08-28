module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.qw8415.mp3player.main to javafx.graphics;

    opens pl.qw8415.mp3player.controller to javafx.fxml;
}
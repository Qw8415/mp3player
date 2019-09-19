module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires jid3lib;

    exports pl.qw8415.mp3player.main to javafx.graphics;

    opens pl.qw8415.mp3player.controller to javafx.fxml;
    opens pl.qw8415.mp3player.mp3 to javafx.base;
}
module com.example.pianodemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.pianodemo to javafx.fxml;
    exports com.example.pianodemo;
}
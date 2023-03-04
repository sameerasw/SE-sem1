module com.example.pushnotification {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.pushnotification to javafx.fxml;
    exports com.example.pushnotification;
}
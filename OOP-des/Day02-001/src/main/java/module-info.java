module com.example.day02001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.day02001 to javafx.fxml;
    exports com.example.day02001;
    exports;
    opens to
}
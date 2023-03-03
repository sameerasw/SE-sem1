module com.example.radiobuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.radiobuttons to javafx.fxml;
    exports com.example.radiobuttons;
}
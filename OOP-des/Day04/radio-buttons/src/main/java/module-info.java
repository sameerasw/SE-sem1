module com.example.radiobuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multipleviews to javafx.fxml;
    exports com.example.multipleviews;
}
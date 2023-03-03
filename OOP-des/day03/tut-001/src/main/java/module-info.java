module com.example.tut001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tut001 to javafx.fxml;
    exports com.example.tut001;
}
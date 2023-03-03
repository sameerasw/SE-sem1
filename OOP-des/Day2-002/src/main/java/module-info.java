module com.example.day2002 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.day2002 to javafx.fxml;
    exports com.example.day2002;
}
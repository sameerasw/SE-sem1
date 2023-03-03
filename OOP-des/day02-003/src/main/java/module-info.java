module com.example.day02003 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.day02003 to javafx.fxml;
    exports com.example.day02003;
}
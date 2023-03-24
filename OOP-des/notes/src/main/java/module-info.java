module com.notes.notes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.notes.notes to javafx.fxml;
    exports com.notes.notes;
}
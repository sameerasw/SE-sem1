package com.example.tut001;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField inputText;

    @FXML
    private Button okButton;

    @FXML
    private TextArea oututText;

    @FXML
    void okButtonClick(ActionEvent event) {

        oututText.setText("Hi" + inputText.getText());

    }

    public void onHelloButtonClick(ActionEvent actionEvent) {
    }
}

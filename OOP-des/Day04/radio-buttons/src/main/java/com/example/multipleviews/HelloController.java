package com.example.multipleviews;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button addStudent;

    @FXML
    private Button quit;

    @FXML
    private Button viewStudents;

    @FXML
    void addStudentClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) addStudent.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("addStudent.fxml"));
        primaryStage.setTitle("Add Student Details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void quitClick(ActionEvent event) {

        Stage stage = (Stage) quit.getScene().getWindow();
        stage.close();

    }

    @FXML
    void viewStudentsClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) viewStudents.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("viewStudents.fxml"));
        primaryStage.setTitle("View Student Details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}

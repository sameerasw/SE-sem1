package com.example.multipleviews;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloController {

    @FXML
    private Button addStudent;

    @FXML
    private Button quit;

    @FXML
    private Button viewStudents;

    @FXML
    private Button addStudentAdd;

    @FXML
    private Button addStudentBack;

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

    @FXML
    void addStudentAddClick(ActionEvent event) throws IOException {
        Alert newalert = new Alert(Alert.AlertType.CONFIRMATION);
        newalert.setContentText("Details were added successfully!");
        //Optional type variable will hold any type of data type. (Because we are using button type)
        Optional<ButtonType> result = newalert.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);
        if ( button == ButtonType.OK){

            Stage stage = (Stage) addStudentAdd.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            primaryStage.setTitle("SIMS");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        }
        else if (button == ButtonType.CANCEL) {
            System.out.println("It will be cancelled.");
        }
    }

    @FXML
    void addStudentBackClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) addStudentBack.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("SIMS");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }




}

package com.notes.notes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button iit;

    @FXML
    private Button uow;

    @FXML
    void iitClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) uow.getScene().getWindow();
        stage.close();
        Stage uow = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("iit.fxml"));
        uow.setTitle("UoW Modules");
        uow.setScene(new Scene(root, 1280, 720));
        uow.show();


    }

    @FXML
    void uowClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) uow.getScene().getWindow();
        stage.close();
        Stage uow = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("uow.fxml"));
        uow.setTitle("UoW Modules");
        uow.setScene(new Scene(root, 1280, 720));
        uow.show();

    }

    @FXML
    private Button backUow;

    @FXML
    private Button exitUow;

    @FXML
    private Button mic;

    @FXML
    private Button sd1d;

    @FXML
    private Button sd1p;

    @FXML
    void backUowClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) backUow.getScene().getWindow();
        stage.close();
        Stage uow = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        uow.setTitle("Study Materials Portal");
        uow.setScene(new Scene(root, 1280, 720));
        uow.show();

    }

    @FXML
    void exitUowClick(ActionEvent event) {

    }

    @FXML
    void micClick(ActionEvent event) {

    }

    @FXML
    void sd1dClick(ActionEvent event) {

    }

    @FXML
    void sd1pClick(ActionEvent event) {

    }

    @FXML
    private Button backIit;

    @FXML
    private Button oopd;

    @FXML
    private Button oopp;

    @FXML
    private Button wd;

    @FXML
    void backIitClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) backIit.getScene().getWindow();
        stage.close();
        Stage uow = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        uow.setTitle("Study Materials Portal");
        uow.setScene(new Scene(root, 1280, 720));
        uow.show();

    }

    @FXML
    void oopdClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) backIit.getScene().getWindow();
        stage.close();
        Stage uow = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("web-view.fxml"));
        uow.setTitle("Study Materials Portal");
        uow.setScene(new Scene(root, 1280, 720));
        uow.show();
        URL url = new URL("https://www.google.com/");
        initialize(url, null);

    }

    @FXML
    void ooppClick(ActionEvent event) {

    }

    @FXML
    void wdClick(ActionEvent event) {

    }

    @FXML
    private Button backWeb;

    @FXML
    private Button exitWeb;

    @FXML
    private WebView webview;

    @FXML
    void backWebClick(ActionEvent event) {

    }

    @FXML
    void exitWebClick(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WebEngine webEngine = webview.getEngine();
        webEngine.load("https://www.google.com/");
    }
}

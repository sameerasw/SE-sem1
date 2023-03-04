package com.example.pushnotification;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Notifications notify = Notifications.create()
                .title("Hello!")
                .text("Hello, " + welcomeText.getText() + "!")
                .graphic(null)
                .hideAfter(Duration.seconds(5))
                .position(Pos.TOP_RIGHT);
                /* .onAction(new EventHandler<ActionEvent>() {
                      @Override
                      public void handle(ActionEvent actionEvent) {
                          System.out.println("Clicked");
                      }
                  }); */

        notify.showConfirm();

    }
}
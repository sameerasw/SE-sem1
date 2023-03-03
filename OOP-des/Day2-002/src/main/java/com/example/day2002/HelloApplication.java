package com.example.day2002;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        /* int a=5;
        int b=10;

        if (a>b) {
            System.out.println("aaaaaaaaaa");
        }
        else
            System.out.println("bbbbbbbbb");

        switch (a){
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 10:
                System.out.println("a is 10");
                break;
            default:
                System.out.println("IDK what is a");
        }  */

        String vara ="aaaaa";
        int minLen = 10;

        while (vara.length()<minLen){
            vara=vara+"a";
        }

        System.out.println(vara);
        //launch();
    }
}
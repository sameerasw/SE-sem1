package com.example.day02001;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// import static com.sun.tools.classfile.Module_attribute.ProvidesEntry.length;

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

       /* final boolean variableB = true;
       System.out.println(variableB); */
       double varA = 99.8744;
               System.out.println(varA);
       int a=1, b=2, c=3, count=2;
       // casting
       double x = (double)a;
       double y = (double)b;
       double z = (double)c;

       double avg =(x+y+z)/count;

       System.out.println(avg);
       // launch();

        int studentCount[] = {34,56,23,23};
        System.out.println(studentCount.length);

        for (int i = 0; i<studentCount.length;i ++)
            System.out.println(studentCount[i]);
    }
}
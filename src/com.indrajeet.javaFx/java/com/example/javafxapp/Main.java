package com.example.javafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        System.out.println("main"); // main is not part of java fx Lifecycle
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("init"); // Initialize Our Application
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("start"); // Starts an application

        FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
        Pane rootNode = loader.load();

        Scene scene = new Scene(rootNode , 300 , 275);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop"); // Called when application is shutdown is stopped and is about to shutdown
        super.stop();
    }
}

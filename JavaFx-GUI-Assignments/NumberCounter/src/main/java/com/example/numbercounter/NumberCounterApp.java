package com.example.numbercounter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NumberCounterApp extends Application {

    @Override
    public  void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(NumberCounterApp.class.getResource("number_counter.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 200);
        stage.setTitle("Number Counter");
        stage.setScene(scene);
        stage.show();
    }
}

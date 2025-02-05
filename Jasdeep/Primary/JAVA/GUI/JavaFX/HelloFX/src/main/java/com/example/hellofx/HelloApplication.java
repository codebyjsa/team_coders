package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Stage stage = new Stage();

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("C:\\Users\\iamjs\\OneDrive\\Desktop\\team_coders\\Jasdeep\\Primary\\JAVA\\GUI\\JavaFX\\HelloFX\\src\\icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Stage demo program!");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't exit unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    }
}
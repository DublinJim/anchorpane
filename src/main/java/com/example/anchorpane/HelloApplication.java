package com.example.anchorpane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {


        Label label = new Label("Label 1");
        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        TextArea text1 = new TextArea("text area (text1)");


        AnchorPane.setTopAnchor(label, 50.0);
        AnchorPane.setRightAnchor(label, 10.0);

        AnchorPane.setTopAnchor(btn1, 10.0);
        AnchorPane.setRightAnchor(btn1, 10.0);

        btn2.setTextFill(Color.BLUE);
        AnchorPane.setRightAnchor(btn2, 10.0);
        AnchorPane.setBottomAnchor(btn2, 10.0);
        AnchorPane.setLeftAnchor(btn2, 10.0);

        AnchorPane.setTopAnchor(text1, 10.0);
        AnchorPane.setBottomAnchor(text1, 40.0);

        AnchorPane.setRightAnchor(text1, 100.0);
        AnchorPane root = new AnchorPane(label, btn1, btn2, text1);

        //  root.getChildren().addAll(label, btn1, btn2, text1);
        primaryStage.setTitle("Anchor panes");
        Scene scene = new Scene(root, 450, 250, Color.LIMEGREEN);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
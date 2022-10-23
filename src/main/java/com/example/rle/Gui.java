package com.example.rle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Gui extends Application {


    Button buttonc= new Button("Compress File"),buttond=new Button("Decompress File");


    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Gui.class.getResource("Gui.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        AnchorPane layout=new AnchorPane();
        buttonc.setLayoutX(100);
        buttonc.setLayoutY(200);
        buttond.setLayoutX(400);
        buttond.setLayoutY(200);
        layout.getChildren().addAll(buttonc,buttond);
        Scene scene = new Scene(layout, 600, 400);
        stage.setTitle("File Compressor");
        stage.setScene(scene);
        stage.show();
        buttonc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FileChooser filechooser=new FileChooser();
                File file=filechooser.showOpenDialog(stage);
                try {
                    RLE.compress(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Label label=new Label("Your chosen file has been compressed");
                VBox box=new VBox(00);
                box.getChildren().add(label);
                Scene scene1=new Scene(box,600,400);
                stage.setScene(scene1);
            }
        });

        buttond.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FileChooser filechooser=new FileChooser();
                File file=filechooser.showOpenDialog(stage);
                try {
                    RLE.decompress(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Label label=new Label("Your chosen file has been decompressed");
                VBox box=new VBox(00);
                box.getChildren().add(label);
                Scene scene1=new Scene(box,600,400);
                stage.setScene(scene1);
            }
        });

    }

    public static void main(String[] args) {
        launch();
    }


}

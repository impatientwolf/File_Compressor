//package com.example.rle;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Scene;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
//import javafx.stage.FileChooser;
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//import javafx.stage.Stage;
//import javafx.stage.Window;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//import java.util.List;
//import java.util.ResourceBundle;
//
//public class Controller implements Initializable {
//
//    public static Scene scene;
////    private Stage Stage;
//    @FXML AnchorPane ap;
//    private Stage stage;
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
////        Pane root = null;
////        try {
////            root = FXMLLoader.load(getClass().getResource("Controller.fxml"));
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        scene = new Scene(root);
//
//    }
//    public void compressButton(ActionEvent actionEvent) throws IOException {
//        FileChooser filechooser=new FileChooser();
//        File file=filechooser.showOpenDialog(this.stage);
//        RLE.compress(file);
//        Label label=new Label("Your chosen file has been compressed");
//        VBox box=new VBox(20);
//        box.getChildren().add(label);
//        Scene scene1=new Scene(box,200,200);
//
//    }
//
//
//    public void decompressButton(ActionEvent actionEvent) throws IOException {
//        FileChooser filechooser=new FileChooser();
//        File file=filechooser.showOpenDialog(this.stage);
//        RLE.decompress(file);
//    }
//
//
//}

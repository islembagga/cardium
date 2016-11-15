
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        primaryStage.setTitle("Take Care - Cardium");
        primaryStage.setScene(new Scene(root, 1280, 720, Color.YELLOW));
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}

//ISLEM
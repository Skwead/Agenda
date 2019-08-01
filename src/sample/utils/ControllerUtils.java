package sample.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControllerUtils {

    private Map<String, Object> controllerPathMap = new HashMap<>();

    public Object getController(String path){
        return controllerPathMap.get(path);
    }

    public void openWindow(Stage primaryStage, String resourceName, String title) throws Exception{
        FXMLLoader loader = new FXMLLoader(Controller.class.getResource("resources/"+resourceName));
        Pane root = loader.load();
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        controllerPathMap.put(resourceName, loader.<Object>getController());
    }

    public void openWindow(Stage primaryStage, String resourceName, String title, boolean resizable) throws Exception{
        FXMLLoader loader = new FXMLLoader(Controller.class.getResource("resources/"+resourceName));
        Pane root = loader.load();
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(resizable);
        primaryStage.show();
        controllerPathMap.put(resourceName, loader.<Object>getController());
    }

    public void closeStage(Stage stage){
        stage.close();
        controllerPathMap.remove(stage);
    }
}

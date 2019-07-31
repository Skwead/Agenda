package sample.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Controller;

import java.util.ArrayList;
import java.util.List;

public class ControllerUtils {

    private List<Stage> openStages = new ArrayList<>();

    public void openWindow(Stage primaryStage, String resourceName, String title) throws Exception{
        FXMLLoader loader = new FXMLLoader(Controller.class.getResource("resources/"+resourceName));
        Pane root = loader.load();
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        openStages.add(primaryStage);
    }

    public void openWindow(Stage primaryStage, String resourceName, String title, boolean resizable) throws Exception{
        FXMLLoader loader = new FXMLLoader(Controller.class.getResource("resources/"+resourceName));
        Pane root = loader.load();
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(resizable);
        primaryStage.show();
        openStages.add(primaryStage);
    }

    public void closeStage(Stage stage){
        stage.close();
        openStages.remove(stage);
    }

    public List<Stage> getOpenStages() {
        return openStages;
    }
}

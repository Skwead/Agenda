package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.calendar.CalendarHandler;
import sample.calendar.CallendarController;
import sample.utils.ControllerUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private BorderPane mainPane;
    @FXML private Button btnNewEvt;
    private CalendarHandler calendarHandler = new CalendarHandler();
    private ControllerUtils controllerUtils = new ControllerUtils();

    @FXML
    void click(ActionEvent event) {
        try {
            FXMLLoader loader = controllerUtils.openWindowGetLoader(new Stage(), "addEvtDialog.fxml", "Novo evento", false);
//            loader.<CallendarController>getController(). Quero daqui adicionar um event handler para o fecho da janela para assim tirar os dados do CallendarController
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        refreshNodes();
    }

    public CalendarHandler getCalendarHandler() {
        return calendarHandler;
    }

    public ControllerUtils getControllerUtils() {
        return controllerUtils;
    }

    //    private void refreshNodes()
//    {
//        mainPane.getChildren().clear();
//
//        Node [] nodes = new  Node[15];
//
//        for(int i = 0; i<10; i++)
//        {
//            try {
//                nodes[i] = (Node) FXMLLoader.load(getClass().getResource("Item.fxml"));
//                mainPane.getChildren().add(nodes[i]);
//
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//
//        }
//    }
}

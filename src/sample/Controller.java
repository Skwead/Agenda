package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.calendar.CalendarHandler;
import sample.calendar.SkEvent;
import sample.utils.ControllerUtils;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.*;

public class Controller implements Initializable{

    private static Controller c = new Controller();
    @FXML private BorderPane mainBorderPane;
    @FXML private TableView<SkEvent> todayTable;
//    @FXML private TableView<SkEvent> calendarTable;
    @FXML private Button btnNewEvt;
    private static CalendarHandler calendarHandler = new CalendarHandler();
    private static ControllerUtils controllerUtils = new ControllerUtils();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void click(ActionEvent event) {
        try {
            controllerUtils.openWindow(new Stage(), "addEvtDialog.fxml", "Novo evento", false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setupEvts(){
        ObservableList<SkEvent> obsEvts = FXCollections.observableArrayList(calendarHandler.getToday());

        TableColumn<SkEvent, LocalDateTime> horaTodoCol = new TableColumn<>("Data e hora");
        horaTodoCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        TableColumn<SkEvent, String> tarefaTodoCol = new TableColumn<>("Evento");
        tarefaTodoCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        todayTable.getColumns().setAll(horaTodoCol, tarefaTodoCol);

        todayTable.setItems(obsEvts);
    }

    public static CalendarHandler getCalendarHandler() {
        return calendarHandler;
    }

    public static Controller getC() {
        return c;
    }

}

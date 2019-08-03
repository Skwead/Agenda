package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.calendar.CalendarHandler;
import sample.calendar.CallendarController;
import sample.calendar.SkEvent;
import sample.utils.ControllerUtils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable{

    private static Controller c = new Controller();
    @FXML private BorderPane mainBorderPane;
    @FXML private TableView<SkEvent> todayTable = new TableView<>();
    @FXML private TableColumn<SkEvent, Date> horaTodoCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> estadoTodoCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> tarefaTodoCol = new TableColumn<>();
    @FXML private TableView<SkEvent> calendarTable = new TableView<>();
    @FXML private TableColumn<SkEvent, Date> horaCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> segCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> terCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> quaCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> quiCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> sexCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> sabCol = new TableColumn<>();
    @FXML private TableColumn<SkEvent, String> domCol = new TableColumn<>();
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

    public void setupEvts(){ //TODO: Para resolver o problema tenho de criar as tabelas no init() e colocar atributos não @FXML nesta classe.

        ObservableList<SkEvent> obsEvts = FXCollections.observableArrayList(calendarHandler.getToday());

        horaTodoCol.setCellValueFactory(new PropertyValueFactory<SkEvent, Date>("date"));
        tarefaTodoCol.setCellValueFactory(new PropertyValueFactory<SkEvent, String>("name"));

        todayTable.setItems(obsEvts);

        todayTable.getColumns().addAll(horaTodoCol, estadoTodoCol ,tarefaTodoCol);
        todayTable.getColumns().set(0, horaTodoCol);
        todayTable.getColumns().set(2, tarefaTodoCol);
    }

    public static CalendarHandler getCalendarHandler() {
        return calendarHandler;
    }

    public static Controller getC() {
        return c;
    }

}

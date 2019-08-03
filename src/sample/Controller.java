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
    @FXML private TableView<SkEvent> todayTable;
    @FXML private TableColumn<SkEvent, Date> horaTodoCol;
    @FXML private TableColumn<SkEvent, String> estadoTodoCol;
    @FXML private TableColumn<SkEvent, String> tarefaTodoCol;
    @FXML private TableView<SkEvent> calendarTable;
    @FXML private TableColumn<SkEvent, Date> horaCol;
    @FXML private TableColumn<SkEvent, String> segCol;
    @FXML private TableColumn<SkEvent, String> terCol;
    @FXML private TableColumn<SkEvent, String> quaCol;
    @FXML private TableColumn<SkEvent, String> quiCol;
    @FXML private TableColumn<SkEvent, String> sexCol;
    @FXML private TableColumn<SkEvent, String> sabCol;
    @FXML private TableColumn<SkEvent, String> domCol;
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
    }

    public static CalendarHandler getCalendarHandler() {
        return calendarHandler;
    }

    public static ControllerUtils getControllerUtils() {
        return controllerUtils;
    }

    public static Controller getC() {
        return c;
    }

}

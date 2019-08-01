package sample.calendar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import sample.Controller;
import sample.Main;
import sample.utils.ControllerUtils;
import sample.utils.DateUtils;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CallendarController implements Initializable {

    private Main instance;
    @FXML private TextArea evtDescription;
    @FXML private TextField evtHour;
    @FXML private TextField evtMinute;
    @FXML private TextField evtName;
    @FXML private DatePicker evtDateTimePicker;
    @FXML private Button btnCreateEvt;
    
    @FXML
    void click(ActionEvent event) { //Pode ser q este evt dispare por td e por nd, verificar c sout no caso d dar asneira
        if(event.getSource().equals(btnCreateEvt)){
            validateInput();
        }
    }

    public void validateInput(){ //TODO: Devolver informação específica de cada erro
        try{
            LocalDate date = evtDateTimePicker.getValue();
            int hour = Integer.valueOf(evtHour.getText());
            int minute = Integer.valueOf(evtMinute.getText());
            String name = evtName.getText();
            String description = evtDescription.getText();

//TODO: https://stackoverflow.com/questions/14187963/passing-parameters-javafx-fxml resolve o problema
//            Caused by: java.lang.NullPointerException
//            at Agenda/sample.calendar.CallendarController.validateInput(CallendarController.java:64)
//            at Agenda/sample.calendar.CallendarController.click(CallendarController.java:49)

//            new CallendarController().getSortedEvts().add(new SkEvent(DateUtils.localDateToDate(date, hour, minute), name, description));

            new ControllerUtils().closeStage((Stage) evtHour.getScene().getWindow());
        } catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro de input");
            alert.setHeaderText("Um dos campos numéricos não tem um valor numérico");
            alert.setContentText(e.getMessage());
            alert.setResizable(false);
            alert.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

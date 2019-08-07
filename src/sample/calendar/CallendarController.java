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
import java.time.LocalDateTime;
import java.time.LocalTime;
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
    void click(ActionEvent event) {
        if(event.getSource().equals(btnCreateEvt)){
            validateInput();
        }
    }

    public void validateInput(){ //TODO: Devolver informação específica de cada erro
        String alertTxt = "Um dos campos numéricos não tem um valor numérico";
        try{
            LocalDate date = evtDateTimePicker.getValue();
            int hour = Integer.valueOf(evtHour.getText());
            int minute = Integer.valueOf(evtMinute.getText());
            String name = evtName.getText().trim();
            String description = evtDescription.getText();

            if((hour>24) || (minute>60) || (name.toCharArray().length<1)){
                alertTxt = "Um dos campos não tem um valor válido";
                throw new NumberFormatException();
            }

            //https://stackoverflow.com/questions/14187963/passing-parameters-javafx-fxml resolveu o problema
            Controller.getCalendarHandler().getSortedEvts().add(new SkEvent(LocalDateTime.of(evtDateTimePicker.getValue(), LocalTime.of(hour, minute))
                    , name, description));
            Controller.getC().setupEvts();

            new ControllerUtils().closeStage((Stage) evtHour.getScene().getWindow());
        } catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro de input");
            alert.setHeaderText(alertTxt);
            alert.setContentText(e.getMessage());
            alert.setResizable(false);
            alert.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

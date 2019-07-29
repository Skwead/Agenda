package sample.calendar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CallendarController {

    @FXML
    private TextArea evtDescription;

    @FXML
    private TextField evtHour;

    @FXML
    private TextField evtName;

    @FXML
    private DatePicker evtDateTimePicker;

    @FXML
    private TextField evtMinute;

    @FXML
    private Button btnCreateEvt;

    @FXML
    void click(ActionEvent event) { //Pode ser q este evt dispare por td e por nd, verificar c sout no caso d dar asneira

    }
}

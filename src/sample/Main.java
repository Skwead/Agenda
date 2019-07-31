package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.calendar.CalendarHandler;
import sample.calendar.CallendarController;

//TODO: Validação dos dados de entrada (CalendarHandler) (falta apenas verificar se horas e minutos estão entre 0 e 60)
//TODO: Comunicação dos dados ao Controller (Dagger 2 com Gluon Ignite)
//TODO: Calendário semanal/horário

public class Main extends Application {

    private Main instance = this;
    private CalendarHandler calendarHandler = new CalendarHandler();
    private CallendarController callendarController = new CallendarController(instance);

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("resources/sample.fxml"));
        primaryStage.setTitle("Agenda");
        primaryStage.setScene(new Scene(root, 841.0, 538.0));
//        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public CalendarHandler getCalendarHandler() {
        return calendarHandler;
    }
}

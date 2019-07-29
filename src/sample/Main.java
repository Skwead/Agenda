package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.calendar.CalendarHandler;

//TODO: Validação dos dados de entrada (CalendarHandler)
//TODO: Comunicação dos dados ao Controller
//TODO: Calendário semanal/horário

public class Main extends Application {

    private CalendarHandler calendarHandler = new CalendarHandler();

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

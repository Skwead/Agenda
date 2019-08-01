package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.calendar.CalendarHandler;
import sample.calendar.CallendarController;

//TODO: Validação dos dados de entrada (CalendarHandler) (falta apenas verificar se horas e minutos estão entre 0 e 60)
//TODO: Comunicação dos dados ao Controller (Dagger 2 com Gluon Ignite)
//      Tuturiais: Spring: https://www.youtube.com/watch?v=hjeSOxi3uPg&list=PLKiN3faYVq89vy3D7ARL-XAzsxoTqFSge&index=2 ;
//                 intro ao Spring: https://www.youtube.com/watch?v=FXJPA3IqANg
//TODO: Calendário semanal/horário

public class Main extends Application {

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
}

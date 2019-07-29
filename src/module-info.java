module Agenda {
    requires javafx.fxml;
    requires javafx.controls;

    requires kotlin.stdlib;

    opens sample to javafx.graphics, javafx.fxml;
    opens sample.calendar to javafx.graphics, javafx.fxml;
}
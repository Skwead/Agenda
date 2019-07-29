package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private AnchorPane mainPane;

    @FXML
    private TabPane calendars;

    @FXML
    private MenuBar menuBar;

    @FXML
    private TableView<?> todo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        refreshNodes();
    }

    private void refreshNodes()
    {
        mainPane.getChildren().clear();

        Node [] nodes = new  Node[15];

        for(int i = 0; i<10; i++)
        {
            try {
                nodes[i] = (Node) FXMLLoader.load(getClass().getResource("Item.fxml"));
                mainPane.getChildren().add(nodes[i]);

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    public TabPane getCalendars() {
        return calendars;
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }

    public TableView<?> getTodo() {
        return todo;
    }

}

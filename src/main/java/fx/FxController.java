package fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FxController {

    @FXML private TextField logFileName;
    @FXML private TabPane fileTabs;
    @FXML private CheckBox tail;
    
    private int counter=0;
    
    @FXML public void openLogFile(ActionEvent event) {
        
        Tab newTab = new Tab("Tab + " + counter++);
        newTab.setContent(new TextArea());
        fileTabs.getTabs().add(newTab);
    }
}

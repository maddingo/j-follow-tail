package fx;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.prefs.Preferences;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.highlightings.Highlighting;
import view.highlightings.HighlightingPersistor;

public class FxApp extends Application {

    private static final String APP_TITLE = "JFollowTail";

    public static void main(String[] args) {
        launch(args);
    }

    private Preferences preferences;
    private List<Highlighting> highlightings;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        preferences = Preferences.userRoot().node(this.getClass().getName());
        highlightings = new HighlightingPersistor().loadHighlightings();
        
        createUI(primaryStage);

        primaryStage.show();
    }

    private void createUI(Stage stage) throws IOException {
        URL resource = getClass().getResource("FxApp.fxml");
        Parent root = FXMLLoader.load(resource);

        stage.setTitle(APP_TITLE);
        
        stage.setScene(new Scene(root, 800, 600));
        
    }
}

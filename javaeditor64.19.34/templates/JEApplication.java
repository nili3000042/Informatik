import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
  *
  * description
  *
  * @version 1.0 from %DATE%
  * @author %AUTHOR%
  */

public class %NAME% extends Application {
  %ATTRIBUTES%
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 300, 300);
    %COMPONENTS%
    primaryStage.setTitle("%NAME%");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of start
  
  %METHODS%
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
} // end of class %NAME%

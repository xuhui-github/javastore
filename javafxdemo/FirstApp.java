import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FirstApp extends Application{
  public static void main(String[] args){
    Application.launch(args);
  }

  @Override
  public void start(Stage stage){
    Text msg=new Text("Hello FirstApp");
    VBox root=new VBox();
    Button extBtn=new Button("exit");
    root.getChildren().add(msg);
    root.getChildren().add(extBtn);
    extBtn.setOnAction(new EventHandler<ActionEvent>(){
	@Override
	public void handle(ActionEvent e){
	    Platform.exit();
	    }
	    });


    Scene scene=new Scene(root,300,50);
    stage.setScene(scene);
    stage.setTitle("FirstApp");
    stage.show();
  }
}


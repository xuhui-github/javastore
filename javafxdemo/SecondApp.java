import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SecondApp extends Application{
  public static void main(String[] args){
    Application.launch(args);
  }

  @Override
  public void start(Stage stage){
    Label nameLbl=new Label("输入你的姓名:");
    TextField nameFld=new TextField();

    Label msg=new Label();
    msg.setStyle("-fx-text-fill: blue;");

    Button sayHelloBtn=new Button("说你好");
    Button extBtn=new Button("退出");

    sayHelloBtn.setOnAction( e -> {
	String name=nameFld.getText();
	if(name.trim().length()>0){
	  msg.setText("你好 "+name);
	  }else{
	  msg.setText("你好");
	  }
	  }
	);
    
    extBtn.setOnAction( e -> Platform.exit());

    VBox root=new VBox();
    root.setSpacing(5);
    root.getChildren().addAll(nameLbl,nameFld,msg,sayHelloBtn,extBtn);

    Scene scene=new Scene(root,350,150);
    stage.setScene(scene);
    stage.setTitle("你好");
    stage.show();
  }
}

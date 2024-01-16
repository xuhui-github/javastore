import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class SceneSwitcher extends Application {
  public static void main(String args){
	Application.launch(args);
  }

  int iClickCount=0;
  Label lblClicks;
  Button btnClickMe;
  Button btnSwitchToScreen2;
  Scene scene1;

  int iCounter=0;
  Label lblCounter;
  Button btnAdd;
  Button btnSubtract;
  Button btnSwitchToScreen1;
  Scene scene2;

  Stage stage;


  public void start(Stage primaryStage){
	stage=primaryStage;

	lblClicks=new Label();
	lblClicks.setText("You have not clicked the button");
	btnClickMe=new Button();
	btnClickMe.setText("Click me please!");
	btnClickMe.setOnAction(
		e -> btnClickMe_Click());

	btnSwitchToScreen2=new Button();
	btnSwitchToScreen2.setText("Switch");
	btnSwitchToScreen2.setOnAction(
		e -> btnSwitchToScreen2_Click());

	VBox pane1 =new VBox(10);
	pane1.getChildren().addAll(lblClicks,btnClickMe,
		btnSwitchToScreen2);

	scene1=new Scene(pane1,250,150);


	lblCounter=new Label();
	lblCounter.setText(Integer.toString(iCounter));

	btnAdd=new Button();
	btnAdd.setText("Add");
	btnAdd.setOnAction(
		e -> btnAdd_Click());

	btnSubtract=new Button();
	btnSubtract.setText("Subtract");
	btnSubtract.setOnAction(
		e -> btnSubtract_Click());

	btnSwitchToScreen2=new Button();
	btnSwitchToScreen2.setText("Switch!");
	btnSwitchToScreen2.setOnAction(
		e -> btnSwitchToScreen1_Click());

	HBox pane2=new HBox(10);
	pane2.getChildren().addAll(lblCounter,btnAdd,btnSubtract,
		btnSwitchToScreen2);

	scene2=new Scene(pane2,300,75);

	primaryStage.setScene(scene1);
	primaryStage.setTitle("Scene Switcher");
	primaryStage.show();
  }

  public void btnClickMe_Click(){
	iClickCount++;
	if(iClickCount == 1){
	  lblClicks.setText("You have click me once");
	}else{
	  lblClicks.setText("You have clicked " + iClickCount + " times");
	}
  }

  public void btnSwitchToScreen2_Click(){
	stage.setScene(scene2);
  }

  public void btnAdd_Click(){
	iCounter++;
	lblCounter.setText(Integer.toString(iCounter));
  }

  public void btnSubtract_Click(){
	iCounter--;
	lblCounter.setText(Integer.toString(iCounter));
  }

  public void btnSwitchToScreen1_Click(){
	stage.setScene(scene1);
  }
}






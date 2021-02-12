package MainForm;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainForm {

   public MainForm(Stage primaryStage){
       primaryStage.setFullScreen(true);
       primaryStage.setTitle("Wallet");
       GridPane gridpane = new GridPane();
       gridpane.setAlignment(Pos.CENTER);
       gridpane.setHgap(10);
       gridpane.setVgap(10);
       gridpane.setPadding(new Insets(25,25,25,25));
       Scene scene = new Scene(gridpane);
       primaryStage.setScene(scene);

       Text sceneTitle = new Text("Welcome");
       sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
       gridpane.add(sceneTitle, 0, 0, 2,1);

       Label userName = new Label("User name: ");
       gridpane.add(userName, 0,1);

       TextField userTextField = new TextField();
       gridpane.add(userTextField, 1,1);

       Label password = new Label("Password: ");
       gridpane.add(password, 0,2);

       TextField passwordTextField = new TextField();
       gridpane.add(passwordTextField, 1, 2);

       Button button = new Button("Sign in");
       gridpane.add(button, 3, 3);

       final Text actionTarget = new Text();
       gridpane.add(actionTarget, 1, 4);

       button.setOnAction(actionEvent -> {
           actionTarget.setFill(Color.RED);
           actionTarget.setText("Sign in button clicked");
       });

       primaryStage.show();
   }
}

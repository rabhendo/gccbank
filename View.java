

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class View extends Application {
	
	
	Scene scene1, scene2;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Glasgow Clyde Bank");
		
		Image image = new Image("bank.jpg");
		ImageView iv = new ImageView(image); //pick up program with adding Logo for Glasgow Clyde Bank
		
		//perhaps create new scene with sign up page 
		// controller class to handle data from scenes
		// model to store and return data structures e.g. observable lists
		
		Label uname = new Label("Username: ");
		Label pword = new Label("Password: ");
		uname.setTextFill(Paint.valueOf("WHITE"));
		pword.setTextFill(Paint.valueOf("WHITE"));
		
		
		TextField username = new TextField();
		TextField password = new TextField ();
		username.setPromptText("Enter Username");
		password.setPromptText("Enter Password");
		
		
		
		//username.setPrefColumnCount(10);
		//password.setPrefColumnCount(10);
		username.setMaxWidth(200);
		password.setMaxWidth(200);
		
		Button login = new Button("Log In");
		Button signUp = new Button ("Sign Up?");
		
		signUp.setOnAction(e -> this.signUpForm());
		
		
		
		VBox form = new VBox(8);
		form.setAlignment(Pos.CENTER);
		form.getChildren().add(uname);
		form.getChildren().add(username);
		form.getChildren().add(pword);
		form.getChildren().add(password);
		
		HBox buttons = new HBox(8);
		buttons.setAlignment(Pos.CENTER);
		buttons.getChildren().add(login);
		buttons.getChildren().add(signUp);
		//username.set
		form.getChildren().add(buttons);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(iv);
		layout.getChildren().add(form);
		
		//layout.getChildren().add(username);
		
		
		
		
		Scene scene = new Scene(layout,1200,800);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private void signUpForm() {
		
	//	System.out.println("check sign up button");
		
		Image image = new Image("bank.jpg");
		ImageView iv = new ImageView(image); 
		
		Stage newStage = new Stage();
		newStage.setTitle("Registration Form");
		
		Label fname = new Label("First Name: ");
		Label lname = new Label("Last Name: ");
		Label choosePassword = new Label("Choose Password: ");
		Label confirmPassword = new Label("Confirm Password: ");
		Label accType = new Label("Account Type ");
		
		fname.setTextFill(Paint.valueOf("WHITE"));
		lname.setTextFill(Paint.valueOf("WHITE"));
		choosePassword.setTextFill(Paint.valueOf("WHITE"));
		confirmPassword.setTextFill(Paint.valueOf("WHITE"));
		accType.setTextFill(Paint.valueOf("WHITE"));
		
		TextField firstname = new TextField();
		TextField lastname = new TextField ();
		TextField chosenWord = new TextField ();
		TextField confirmWord = new TextField ();
		firstname.setPromptText("Enter Username");
		lastname.setPromptText("Enter Password");
		chosenWord.setPromptText("Choose Password");
		confirmWord.setPromptText("Confirm Password");
		
		firstname.setMaxWidth(200);
		lastname.setMaxWidth(200);
		chosenWord.setMaxWidth(200);
		confirmWord.setMaxWidth(200);
		
		ChoiceBox<String> accountType = new ChoiceBox<>();
		accountType.getItems().add("Basic");
		accountType.getItems().add("Premium");
		
		Button registerButton = new Button("Register");
		
		registerButton.setOnAction(e -> this.register(firstname.getText(), lastname.getText(), chosenWord.getText(), confirmWord.getText(), accountType.getValue()));
		
		VBox registerform = new VBox(8);
		registerform.setAlignment(Pos.CENTER);
		registerform.getChildren().add(fname);
		registerform.getChildren().add(firstname);
		registerform.getChildren().add(lname);
		registerform.getChildren().add(lastname);
		registerform.getChildren().add(choosePassword);
		registerform.getChildren().add(chosenWord);
		registerform.getChildren().add(confirmPassword);
		registerform.getChildren().add(confirmWord);
		registerform.getChildren().add(accType);
		registerform.getChildren().add(accountType);
		registerform.getChildren().add(registerButton);
		
		StackPane registerLayout = new StackPane();
		registerLayout.getChildren().add(iv);
		registerLayout.getChildren().add(registerform);
		
		Scene signUpScene = new Scene(registerLayout, 1200, 600);
		
		
		newStage.setScene(signUpScene);
		newStage.show();
		
		
		
	}

	private void register(String fname, String lname, String pword, String chkpword, String accType) {
		
		System.out.println(fname + lname + pword + chkpword + accType);	
		
		// figure out data structure, possibly a person class added to observable list
		
		
		
		
		
	}


		
		
		
		
	


	
	
	
}


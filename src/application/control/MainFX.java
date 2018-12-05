package application.control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainFX extends Application {
	Stage stage;

	@FXML
	Label logoLabel;

	@Override
	public void start(Stage myStage) throws Exception {
		stage = myStage;
		MainWindow();

	}

	private void MainWindow() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/Profile.fxml"));
			AnchorPane pane = loader.load();

			Scene scene = new Scene(pane);

			scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Lobster");

			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeStage() {
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

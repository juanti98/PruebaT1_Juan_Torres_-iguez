package application.control;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class ControllerFX {
	@FXML
	ImageView imagenPerfil;

	@FXML
	AnchorPane mainPane;

	@FXML
	public void fadein() {
		FadeTransition ft = new FadeTransition(Duration.millis(3000), imagenPerfil);
		ft.setFromValue(0.3);
		ft.setToValue(1.0);

		ft.play();
	}

	@FXML
	public void showNext() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("GetMe.fxml"));
			AnchorPane page;
			page = (AnchorPane) loader.load();
			Stage homeStage = new Stage();
			homeStage.setTitle("Get Me");
			Scene scene = new Scene(page);
			homeStage.setScene(scene);
			homeStage.initStyle(StageStyle.UNDECORATED);
			homeStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void handleClose() {
		System.exit(0);
	}
}

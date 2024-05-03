package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class RegistrationFormController {
	@FXML
	private TextField nameField;
	@FXML
	private TextField emailField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button submitButton;

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		Window owner = submitButton.getScene().getWindow();
		if (nameField.getText().isEmpty()) {
			showAlert(AlertType.ERROR, "Form Error!", "Please enter your name", owner);
			return;
		}
		if (emailField.getText().isEmpty()) {
			showAlert(AlertType.ERROR, "Form Error!", "Please enter your email", owner);
			return;
		}

		if (passwordField.getText().isEmpty()) {
			showAlert(AlertType.ERROR, "Form Error!", "Please enter your password", owner);
			return;
		}

		showAlert(AlertType.INFORMATION, "Welcome!", "Welcome " + nameField.getText(), owner);
	}

	private void showAlert(AlertType alertType, String title, String content, Window owner) {
		Alert alert = new Alert(alertType);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(content);
		alert.initOwner(owner);
		alert.show();
	}
}

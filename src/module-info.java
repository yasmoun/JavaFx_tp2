module javafx_tp2 {
	requires javafx.controls;
	requires javafx.fxml;
	

	
	opens application to javafx.graphics, javafx.fxml;
	opens example to  javafx.graphics, javafx.fxml;
}

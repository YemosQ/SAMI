package controllers.Login;

import com.sam.main.Principal;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.Optional;

public class Logout {

    public String logout(Object event) {
        String mensaje = null;
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Cerrar Sesión");
            alert.setHeaderText(null);
            alert.setContentText("Cerrar Sesión?");
            Optional<ButtonType> opcion = alert.showAndWait();
            if (opcion.get().equals(ButtonType.OK)) {
                mensaje = "Sesión Cerrada";
                FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("inicio/Login.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                scene.setFill(Color.TRANSPARENT);
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.show();
            }
        } catch (Exception ex) {ex.printStackTrace();}
        return mensaje;
    }
}

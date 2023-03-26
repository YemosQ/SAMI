package util;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

public class MoverPanel {


    public interface DraggedScene {

        default void onDraggedScene(AnchorPane panelPadre) {
            AtomicReference<Double> xOffset = new AtomicReference<>((double) 0);
            AtomicReference<Double> yOffset = new AtomicReference<>((double) 0);
            panelPadre.setOnMousePressed(e -> {
                Stage stage = (Stage) panelPadre.getScene().getWindow();
                stage.setOpacity(0.5);
                xOffset.set(stage.getX() - e.getScreenX());
                yOffset.set(stage.getY() - e.getScreenY());

            });
            panelPadre.setOnMouseDragged(e -> {
                Stage stage = (Stage) panelPadre.getScene().getWindow();
                stage.setX(e.getScreenX() + xOffset.get());
                stage.setY(e.getScreenY() + yOffset.get());
                panelPadre.setStyle("-fx-cursor: CLOSED_HAND;");
            });
            panelPadre.setOnMouseReleased(e -> {
                Stage stage = (Stage) panelPadre.getScene().getWindow();
                stage.setX(e.getScreenX() + xOffset.get());
                stage.setY(e.getScreenY() + yOffset.get());
                stage.setOpacity(1);
                panelPadre.setStyle("-fx-cursor: DEFAULT;");
            });


            //panelPadre.setOnMouseReleased(e-> panelPadre.setStyle("-fx-cursor: DEFAULT;"));
        }

        default void onBorde(AnchorPane panelPadre){
            AtomicReference<Double> xOffset = new AtomicReference<>((double) 0);
            AtomicReference<Double> yOffset = new AtomicReference<>((double) 0);

            panelPadre.setOnMousePressed(e -> {
                Stage stage = (Stage) panelPadre.getScene().getWindow();
                stage.setOpacity(0.3);
                xOffset.set(stage.getX() - e.getScreenX());
                yOffset.set(stage.getY() - e.getScreenY());

            });
            panelPadre.setOnMouseDragged(e -> {
                Stage stage = (Stage) panelPadre.getScene().getWindow();
                stage.setX(e.getScreenX() + xOffset.get());
                stage.setY(e.getScreenY() + yOffset.get());

                panelPadre.setStyle("-fx-cursor: CLOSED_HAND");
            });

            panelPadre.setOnMouseReleased(e-> panelPadre.setStyle("-fx-cursor: DEFAULT;"));

        }

    }
}

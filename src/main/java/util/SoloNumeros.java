package util;

import javafx.scene.control.TextField;

public class SoloNumeros extends TextField {
    public SoloNumeros() {
        this.setOnKeyTyped(event -> {
            String caracter = event.getCharacter();
            if (!caracter.matches("[0-9]")) {
                event.consume();
            }
        });
    }
}

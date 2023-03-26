package util;

import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.LocalTimeStringConverter;
import java.time.format.DateTimeFormatter;
import java.util.function.UnaryOperator;

public class FormatoHora extends TextField {

    public FormatoHora() {
        // Creamos un TextFormatter que sólo permite ingresar datos en formato hora (hh:mm:ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        TextFormatter<UnaryOperator<TextFormatter.Change>> horaFormatter = new TextFormatter<UnaryOperator<TextFormatter.Change>>((UnaryOperator<TextFormatter.Change>) new LocalTimeStringConverter(formatter, null));
        horaFormatter.setValue(null); // Esto establece el valor inicial del TextField en nulo
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String text = change.getControlNewText();
            if (text.matches("(\\d{0,2}:\\d{0,2}:\\d{0,2})?")) {
                return change;
            } else {
                return null;
            }
        };
        horaFormatter.setValue(filter);
        this.setTextFormatter(horaFormatter);
        this.setOnAction(event -> {
            String text = this.getText();
            if (!text.matches("(\\d{2}:\\d{2}:\\d{2})")) {
                this.setText("");
            }
        });
    }

}

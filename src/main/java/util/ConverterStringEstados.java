package util;

import javafx.util.StringConverter;
import modelo.Nomina.UbicacionesDAO;

public class ConverterStringEstados extends StringConverter<UbicacionesDAO> {

    @Override
    public String toString(UbicacionesDAO estados) {
        return estados == null ? null : estados.getDescripcionEstado();
    }
    @Override
    public UbicacionesDAO fromString(String s) {
        return null;
    }
}

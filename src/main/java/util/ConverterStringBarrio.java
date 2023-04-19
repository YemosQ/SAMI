package util;

import javafx.util.StringConverter;
import modelo.Nomina.UbicacionesDAO;

public class ConverterStringBarrio extends StringConverter<UbicacionesDAO> {
    @Override
    public String toString(UbicacionesDAO barrio) {
        return barrio == null ? null : barrio.getNombrebarrio();
    }
    @Override
        public UbicacionesDAO fromString(String s) {
            return null;
        }
}

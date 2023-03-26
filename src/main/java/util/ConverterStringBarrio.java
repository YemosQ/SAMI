package util;

import javafx.util.StringConverter;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import modelo.Nomina.PaisesDAO;

public class ConverterStringBarrio extends StringConverter<EmergenteEstadosPaisesDAO> {
    @Override
    public String toString(EmergenteEstadosPaisesDAO barrio) {
        return barrio == null ? null : barrio.getNombrebarrio();
    }
    @Override
        public EmergenteEstadosPaisesDAO fromString(String s) {
            return null;
        }
}

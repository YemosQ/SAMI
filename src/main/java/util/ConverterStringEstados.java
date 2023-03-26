package util;

import javafx.util.StringConverter;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import modelo.Nomina.EstadosDAO;

public class ConverterStringEstados extends StringConverter<EmergenteEstadosPaisesDAO> {

    @Override
    public String toString(EmergenteEstadosPaisesDAO estados) {
        return estados == null ? null : estados.getDescripcionEstado();
    }
    @Override
    public EmergenteEstadosPaisesDAO fromString(String s) {
        return null;
    }
}

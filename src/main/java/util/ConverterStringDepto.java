package util;

import javafx.util.StringConverter;
import modelo.Nomina.UbicacionesDAO;

public class ConverterStringDepto extends StringConverter<UbicacionesDAO> {
    @Override
    public String toString(UbicacionesDAO deptos) {return deptos == null ? null : deptos.getNombredepto();}
    @Override
    public UbicacionesDAO fromString(String s) {
        return null;
    }

}

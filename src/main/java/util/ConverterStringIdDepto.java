package util;

import javafx.util.StringConverter;
import modelo.Nomina.UbicacionesDAO;

public class ConverterStringIdDepto extends StringConverter<UbicacionesDAO> {

    @Override
    public String toString(UbicacionesDAO paises) {return paises == null ? null : paises.getIddepto();}
    @Override
    public UbicacionesDAO fromString(String s) {
        return null;
    }
}


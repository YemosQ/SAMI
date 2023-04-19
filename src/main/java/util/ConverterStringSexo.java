package util;

import javafx.util.StringConverter;
import modelo.Nomina.UbicacionesDAO;

public class ConverterStringSexo extends StringConverter<UbicacionesDAO> {

    @Override
    public String toString(UbicacionesDAO sexo) {

        return sexo == null ? null : sexo.getDescripcionSexo();
    }

    @Override
    public UbicacionesDAO fromString(String s) {
        return null;
    }
}

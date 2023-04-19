package util;

import javafx.util.StringConverter;
import modelo.Nomina.UbicacionesDAO;

public class ConverterStringMunic extends StringConverter<UbicacionesDAO> {
    @Override
    public String toString(UbicacionesDAO munic) {return munic == null ? null : munic.getNombremunicipio();}
    @Override
    public UbicacionesDAO fromString(String s) {
        return null;
    }

}

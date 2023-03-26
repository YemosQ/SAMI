package util;

import javafx.util.StringConverter;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import modelo.Nomina.PaisesDAO;

public class ConverterStringMunic extends StringConverter<EmergenteEstadosPaisesDAO> {
    @Override
    public String toString(EmergenteEstadosPaisesDAO munic) {return munic == null ? null : munic.getNombremunicipio();}
    @Override
    public EmergenteEstadosPaisesDAO fromString(String s) {
        return null;
    }

}

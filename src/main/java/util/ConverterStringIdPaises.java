package util;

import javafx.util.StringConverter;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import modelo.Nomina.PaisesDAO;

public class ConverterStringIdPaises extends StringConverter<EmergenteEstadosPaisesDAO> {

    @Override
    public String toString(EmergenteEstadosPaisesDAO paises) {return paises == null ? null : paises.getIdpais();}
    @Override
    public EmergenteEstadosPaisesDAO fromString(String s) {
        return null;
    }
}


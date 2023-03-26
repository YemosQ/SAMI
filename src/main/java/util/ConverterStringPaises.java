package util;

import javafx.util.StringConverter;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import modelo.Nomina.PaisesDAO;

public class ConverterStringPaises extends StringConverter<EmergenteEstadosPaisesDAO> {

    @Override
    public String toString(EmergenteEstadosPaisesDAO paises) {return paises == null ? null : paises.getNombrepais();}
    @Override
    public EmergenteEstadosPaisesDAO fromString(String s) {
        return null;
    }
}


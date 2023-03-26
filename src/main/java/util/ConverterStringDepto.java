package util;

import javafx.util.StringConverter;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import modelo.Nomina.PaisesDAO;

public class ConverterStringDepto extends StringConverter<EmergenteEstadosPaisesDAO> {
    @Override
    public String toString(EmergenteEstadosPaisesDAO deptos) {return deptos == null ? null : deptos.getNombredepto();}
    @Override
    public EmergenteEstadosPaisesDAO fromString(String s) {
        return null;
    }

}

package util.convertidores;

import javafx.util.StringConverter;
import modelo.Nomina.CodigosDAO;

public class ConverterStringCodEmp2 extends StringConverter<CodigosDAO> {
    @Override
    public String toString(CodigosDAO codigo) {
        return codigo != null ? codigo.getCodigoempresa(): null;
    }

    @Override
    public CodigosDAO fromString(String s) {
        return null;
    }

}

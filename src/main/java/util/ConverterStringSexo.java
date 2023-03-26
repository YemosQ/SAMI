package util;

import javafx.util.StringConverter;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import modelo.Nomina.EstadosDAO;

import javax.swing.*;

public class ConverterStringSexo extends StringConverter<EmergenteEstadosPaisesDAO> {

    @Override
    public String toString(EmergenteEstadosPaisesDAO sexo) {

        return sexo == null ? null : sexo.getDescripcionSexo();
    }

    @Override
    public EmergenteEstadosPaisesDAO fromString(String s) {
        return null;
    }
}

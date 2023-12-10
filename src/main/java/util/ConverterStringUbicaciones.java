package util;

import javafx.util.StringConverter;
import modelo.Nomina.DatosTablasDAO;
import modelo.Nomina.UbicacionesDAO;

public class ConverterStringUbicaciones<T> extends StringConverter<T> {

//    @Override
//    public String toString(EmergenteEstadosPaisesDAO paises) {return paises == null ? null : paises.getNombrepais();}
//    @Override
//    public EmergenteEstadosPaisesDAO fromString(String s) {
//        return null;
//    }


    @Override
    public String toString(T objeto) {
        if (objeto == null) {
            return null;
        }
        if (objeto instanceof UbicacionesDAO) {
            return ((UbicacionesDAO) objeto).getNombrepais();
        } else if (objeto instanceof DatosTablasDAO) {
            return ((DatosTablasDAO) objeto).getNomPais();
        } else {
            throw new IllegalArgumentException("Tipo de objeto no válido");
        }
    }

    @Override
    public T fromString(String s) {
        return null;
    }
}

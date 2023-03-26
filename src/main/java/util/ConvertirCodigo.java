package util;

import javafx.util.StringConverter;

public class ConvertirCodigo extends StringConverter<CodigosId> {


    @Override
    public String toString(CodigosId codigosId) {
        return codigosId == null ? null : codigosId.Codigos();
    }

    @Override
        public CodigosId fromString(String s) {
            return null;
        }


}

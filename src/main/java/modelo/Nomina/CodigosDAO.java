package modelo.Nomina;

/**
 * Crear aqui todas las variables necesarias para identificar todos los codigos a cargar para enlistarlos en combobox u
 * otros elementos visuales
 */

public class CodigosDAO {
    private String codigoempresa;
    private String codigosede;
    private String codigoempleado;

    public CodigosDAO() {
    }

    public CodigosDAO(String codigoempresa) {
        this.codigoempresa = codigoempresa;
        this.codigosede=codigoempresa;
        this.codigoempleado=codigoempresa;
    }

    public CodigosDAO(String codigoempresa, String codigosede, String codigoempleado) {
        this.codigoempresa = codigoempresa;
        this.codigosede = codigosede;
        this.codigoempleado = codigoempleado;
    }

    public String getCodigoempresa() {
        return codigoempresa;
    }

    public void setCodigoempresa(String codigoempresa) {
        this.codigoempresa = codigoempresa;
    }

    public String getCodigosede() {
        return codigosede;
    }

    public void setCodigosede(String codigosede) {
        this.codigosede = codigosede;
    }

    public String getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(String codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    @Override
    public String toString() {
        return codigoempresa;
    }
}

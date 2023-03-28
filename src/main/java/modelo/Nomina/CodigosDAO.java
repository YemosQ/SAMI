package modelo.Nomina;

/**
 * Crear aqui todas las variables necesarias para identificar todos los codigos a cargar para enlistarlos en combobox u
 * otros elementos visuales
 * La funcion to.string tiene un solo elemento el cual es el que se necesita mostrar
 */

public class CodigosDAO {
    private String codigoempresa;
    private String codigosede;
    private String codigoempleado;
    private String nombreempresa;
    private String nitempresa;
    private String dvempresa;


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

    public CodigosDAO(String codigoempresa, String nombreempresa, String nitempresa, String dvempresa) {
        this.codigoempresa = codigoempresa;
        this.nombreempresa = nombreempresa;
        this.nitempresa = nitempresa;
        this.dvempresa = dvempresa;
    }

    public CodigosDAO(String codigoempresa, String codigosede, String codigoempleado, String nombreempresa, String nitempresa, String dvempresa) {
        this.codigoempresa = codigoempresa;
        this.codigosede = codigosede;
        this.codigoempleado = codigoempleado;
        this.nombreempresa = nombreempresa;
        this.nitempresa = nitempresa;
        this.dvempresa = dvempresa;
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

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getNitempresa() {
        return nitempresa;
    }

    public void setNitempresa(String nitempresa) {
        this.nitempresa = nitempresa;
    }

    public String getDvempresa() {
        return dvempresa;
    }

    public void setDvempresa(String dvempresa) {
        this.dvempresa = dvempresa;
    }

    public void setCodigoempleado(String codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    @Override
    public String toString() {
        return "CodigosDAO{" +
                "codigoempresa='" + codigoempresa + '\'' +
                ", codigosede='" + codigosede + '\'' +
                ", codigoempleado='" + codigoempleado + '\'' +
                ", nombreempresa='" + nombreempresa + '\'' +
                ", nitempresa='" + nitempresa + '\'' +
                ", dvempresa='" + dvempresa + '\'' +
                '}';
    }
}

package modelo.Nomina;


import java.sql.Connection;


public class EstadosDAO {

    private Connection con;
    private int codigoEstado;
    private String descripcionEstado;
    private int codigoSexo;
    private String descripcionSexo;
    private int codigoPobla;
    private String descripcionPobla;
    private String sql;

    public EstadosDAO() {
    }

    public EstadosDAO(String descripcion) {
        this.descripcionEstado=descripcion;
        this.descripcionSexo=descripcion;
        this.descripcionPobla=descripcion;
    }

    public EstadosDAO(int codigo) {
        this.codigoEstado=codigo;
        this.codigoSexo=codigo;
        this.codigoPobla=codigo;
    }

    public EstadosDAO(int codigo, String descripcion) {
        this.codigoEstado=codigo;
        this.descripcionEstado=descripcion;
        this.codigoSexo=codigo;
        this.descripcionSexo=descripcion;
        this.codigoPobla=codigo;
        this.descripcionPobla=descripcion;

    }

    public EstadosDAO(int codigoEstado, String descripcionEstado, int codigoSexo, String descripcionSexo, int codigoPobla, String descripcionPobla) {
        this.codigoEstado = codigoEstado;
        this.descripcionEstado = descripcionEstado;
        this.codigoSexo = codigoSexo;
        this.descripcionSexo = descripcionSexo;
        this.codigoPobla = codigoPobla;
        this.descripcionPobla = descripcionPobla;
    }

    public EstadosDAO(int cod, String desc, int est) {
        this.codigoSexo=cod;
        this.descripcionSexo=desc;
        this.codigoPobla=cod;
        this.descripcionPobla=desc;
        this.codigoEstado=est;
    }

    public EstadosDAO(int cod, String desc, String est) {
        this.codigoSexo=cod;
        this.descripcionSexo=desc;
        this.codigoPobla=cod;
        this.descripcionPobla=desc;
        this.descripcionEstado=est;
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    @Override
    public String toString() {
        return "EstadosDAO{" +
                "codigoEstado=" + codigoEstado +
                ", descripcionEstado='" + descripcionEstado + '\'' +
                ", codigoSexo=" + codigoSexo +
                ", descripcionSexo='" + descripcionSexo + '\'' +
                ", codigoPobla=" + codigoPobla +
                ", descripcionPobla='" + descripcionPobla + '\'' +
                '}';
    }


    public int getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(int codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    public String getDescripcionSexo() {
        return descripcionSexo;
    }

    public void setDescripcionSexo(String descripcionSexo) {
        this.descripcionSexo = descripcionSexo;
    }

    public int getCodigoPobla() {
        return codigoPobla;
    }

    public void setCodigoPobla(int codigoPobla) {
        this.codigoPobla = codigoPobla;
    }

    public String getDescripcionPobla() {
        return descripcionPobla;
    }

    public void setDescripcionPobla(String descripcionPobla) {
        this.descripcionPobla = descripcionPobla;
    }
}

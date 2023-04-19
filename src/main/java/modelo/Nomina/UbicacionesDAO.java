package modelo.Nomina;

public class UbicacionesDAO {
    private int codigoEstado;
    private String descripcionEstado;
    private String codigoSexo;
    private String descripcionSexo;
    private String codigoPobla;
    private String descripcionPobla;
    private String idpais;
    private String idpaisas;
    private String nombrepais;
    private String latitud;
    private String longitud;
    private int estadopais;
    private String idmunicipio;
    private String idmunicipioas;
    private String nombremunicipio;
    private String iddepto;
    private String iddeptoas;
    private int estadomunicipio;
    private String idbarrio;
    private String nombrebarrio;

    private String nombredepto;
    private String estado;

    private String consolidadoA;

    public UbicacionesDAO() {
    }

    public UbicacionesDAO(int codigo, String descripcion) {
        this.codigoEstado=codigo;
        this.descripcionEstado=descripcion;
        this.descripcionPobla=descripcion;
        this.descripcionSexo=descripcion;
    }

    public UbicacionesDAO(String codigo, String descripcion, String estado) {
        this.codigoSexo=codigo;
        this.codigoPobla=codigo;
        this.descripcionEstado=descripcion;
        this.descripcionSexo=descripcion;
        this.descripcionPobla=descripcion;
        this.estado=estado;
    }


    public UbicacionesDAO(String descripcion) {
        this.nombrebarrio=descripcion;
        this.nombredepto=descripcion;
        this.nombremunicipio=descripcion;
        this.nombrepais=descripcion;
        this.iddepto=descripcion;
        this.idmunicipio=descripcion;
    }

    public UbicacionesDAO(String codigo, String descripcion, String codDepto, String estado) {
        this.idmunicipio=codigo;
        this.iddepto=codigo;
        this.iddeptoas=codDepto;
        this.idpaisas=codDepto;
        this.idpais=codDepto;
        this.nombrebarrio=descripcion;
        this.nombredepto=descripcion;
        this.nombremunicipio=descripcion;
        this.nombrepais=descripcion;
        this.estado=estado;
    }

    public UbicacionesDAO(String codigo, String descripcion, String codDepto, String codMun, String estado) {
        this.idpais=codigo;
        this.nombrebarrio=descripcion;
        this.iddeptoas=codDepto;
        this.idmunicipioas=codMun;
        this.estado=estado;
        this.nombredepto=descripcion;
        this.nombremunicipio=descripcion;
        this.nombrepais=descripcion;
        this.idbarrio=codigo;
    }

    public UbicacionesDAO(String codigo, String descripcion, int codigoestado, String estado) {
        this.idpais=codigo;
        this.nombrepais=descripcion;
        this.codigoEstado=codigoestado;
        this.estado=estado;
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

    public String getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(String codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    public String getDescripcionSexo() {
        return descripcionSexo;
    }

    public void setDescripcionSexo(String descripcionSexo) {
        this.descripcionSexo = descripcionSexo;
    }

    public String getCodigoPobla() {
        return codigoPobla;
    }

    public void setCodigoPobla(String codigoPobla) {
        this.codigoPobla = codigoPobla;
    }

    public String getDescripcionPobla() {
        return descripcionPobla;
    }

    public void setDescripcionPobla(String descripcionPobla) {
        this.descripcionPobla = descripcionPobla;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }

    public String getIdpaisas() {
        return idpaisas;
    }

    public void setIdpaisas(String idpaisas) {
        this.idpaisas = idpaisas;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public int getEstadopais() {
        return estadopais;
    }

    public void setEstadopais(int estadopais) {
        this.estadopais = estadopais;
    }

    public String getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(String idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public String getIdmunicipioas() {
        return idmunicipioas;
    }

    public void setIdmunicipioas(String idmunicipioas) {
        this.idmunicipioas = idmunicipioas;
    }

    public String getNombremunicipio() {
        return nombremunicipio;
    }

    public void setNombremunicipio(String nombremunicipio) {
        this.nombremunicipio = nombremunicipio;
    }

    public String getIddepto() {
        return iddepto;
    }

    public void setIddepto(String iddepto) {
        this.iddepto = iddepto;
    }

    public String getIddeptoas() {
        return iddeptoas;
    }

    public void setIddeptoas(String iddeptoas) {
        this.iddeptoas = iddeptoas;
    }

    public int getEstadomunicipio() {
        return estadomunicipio;
    }

    public void setEstadomunicipio(int estadomunicipio) {
        this.estadomunicipio = estadomunicipio;
    }

    public String getIdbarrio() {
        return idbarrio;
    }

    public void setIdbarrio(String idbarrio) {
        this.idbarrio = idbarrio;
    }

    public String getNombrebarrio() {
        return nombrebarrio;
    }

    public void setNombrebarrio(String nombrebarrio) {
        this.nombrebarrio = nombrebarrio;
    }

    public String getNombredepto() {
        return nombredepto;
    }

    public void setNombredepto(String nombredepto) {
        this.nombredepto = nombredepto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getConsolidadoA() {
        return consolidadoA;
    }

    public void setConsolidadoA(String consolidadoA) {
        this.consolidadoA = consolidadoA;
    }

    @Override
    public String toString() {
        return "EmergenteEstadosPaisesDAO{" +
                "codigoEstado=" + codigoEstado +
                ", descripcionEstado='" + descripcionEstado + '\'' +
                ", codigoSexo=" + codigoSexo +
                ", descripcionSexo='" + descripcionSexo + '\'' +
                ", codigoPobla=" + codigoPobla +
                ", descripcionPobla='" + descripcionPobla + '\'' +
                ", idpais='" + idpais + '\'' +
                ", idpaisas='" + idpaisas + '\'' +
                ", nombrepais='" + nombrepais + '\'' +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                ", estadopais=" + estadopais +
                ", idmunicipio='" + idmunicipio + '\'' +
                ", idmunicipioas='" + idmunicipioas + '\'' +
                ", nombremunicipio='" + nombremunicipio + '\'' +
                ", iddepto='" + iddepto + '\'' +
                ", iddeptoas='" + iddeptoas + '\'' +
                ", estadomunicipio=" + estadomunicipio +
                ", idbarrio='" + idbarrio + '\'' +
                ", nombrebarrio='" + nombrebarrio + '\'' +
                ", nombredepto='" + nombredepto + '\'' +
                ", estado='" + estado + '\'' +
                ", consolidadoA='" + consolidadoA + '\'' +
                '}';
    }
}

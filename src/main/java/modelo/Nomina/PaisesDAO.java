package modelo.Nomina;

public class PaisesDAO {
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

    public PaisesDAO() {
    }

    public PaisesDAO(String idpais, String nombrepais, int estadopais) {
        this.idpais = idpais;
        this.nombrepais = nombrepais;
        this.estadopais = estadopais;
    }

    public PaisesDAO(String idpais, String nombrepais, String latitud, String longitud, int estadopais) {
        this.idpais = idpais;
        this.nombrepais = nombrepais;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estadopais = estadopais;
    }

    public PaisesDAO(String codMun, String nomMun, String estado) {
        this.idmunicipio=codMun;
        this.idbarrio=codMun;
        this.iddepto=codMun;
        this.nombremunicipio=nomMun;
        this.nombrepais=nomMun;
        this.nombredepto=nomMun;
        this.nombrebarrio=nomMun;
        this.estado=estado;
    }
    public PaisesDAO(String codMun, String nomMun, String codDepto, int estCodGen) {
        this.idmunicipio=codMun;
        this.nombremunicipio=nomMun;
        this.iddepto=codDepto;
        this.estadomunicipio=estCodGen;
    }

    public PaisesDAO(String idpaises, String nomPais,int estcodigo, String descestado) {
        this.idpais=idpaises;
        this.nombrepais=nomPais;
        this.estadopais=estcodigo;
        this.estado=descestado;
        this.idpaisas=idpaises;
    }

    public PaisesDAO(String nomPais, String nomDepto, String nomMun, String descEstGen) {
        this.nombrepais=nomPais;
        this.idmunicipio=nomPais;
        this.nombremunicipio=nomDepto;
        this.estado=descEstGen;
        this.iddepto=nomPais;
        this.nombredepto=nomDepto;
        this.idpais=nomMun;
        this.iddeptoas=nomMun;

    }

    public PaisesDAO(String nombrelugar) {
        this.nombrepais=nombrelugar;
        this.nombredepto=nombrelugar;
        this.nombremunicipio=nombrelugar;
        this.nombrebarrio=nombrelugar;
    }

    public PaisesDAO(String nomPais, String nomDepto, String nomMun, String nomBarrio, String descEstGen) {
        this.nombrepais=nomPais;
        this.nombredepto=nomDepto;
        this.nombremunicipio=nomMun;
        this.estado=descEstGen;
        this.idbarrio=nomPais;
        this.nombrebarrio=nomDepto;
        this.iddeptoas=nomMun;
        this.idmunicipioas=nomBarrio;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
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

    public int getEstadomunicipio() {
        return estadomunicipio;
    }

    public void setEstadomunicipio(int estadomunicipio) {
        this.estadomunicipio = estadomunicipio;
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

    public String getIdpaisas() {
        return idpaisas;
    }

    public void setIdpaisas(String idpaisas) {
        this.idpaisas = idpaisas;
    }

    public String getIdmunicipioas() {
        return idmunicipioas;
    }

    public void setIdmunicipioas(String idmunicipioas) {
        this.idmunicipioas = idmunicipioas;
    }

    public String getIddeptoas() {
        return iddeptoas;
    }

    public void setIddeptoas(String iddeptoas) {
        this.iddeptoas = iddeptoas;
    }

    @Override
    public String toString() {
        return "PaisesDAO{" +
                "idpais='" + idpais + '\'' +
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

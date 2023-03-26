package modelo.Nomina;

public class DatosTercerosDAO {
    private String codigoDocumento;
    private String descripcionDocumento;
    private String homologacionDocumento;
    private boolean estadoDocumento;

    public DatosTercerosDAO(String codigoDocumento, String descripcionDocumento, String homologacionDocumento,
                            boolean estadoDocumento) {
        this.codigoDocumento = codigoDocumento;
        this.descripcionDocumento = descripcionDocumento;
        this.homologacionDocumento = homologacionDocumento;
        this.estadoDocumento = estadoDocumento;
    }

    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(String codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    public void setDescripcionDocumento(String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }

    public String getHomologacionDocumento() {
        return homologacionDocumento;
    }

    public void setHomologacionDocumento(String homologacionDocumento) {
        this.homologacionDocumento = homologacionDocumento;
    }

    public boolean isEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(boolean estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }
}

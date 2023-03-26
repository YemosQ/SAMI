package modelo.Nomina;

public class DatosTablasDAO {

    private String nitempresa;
    private String empresasede;
    private String nombreempresa;
    private String estadoempresa;
    private String nombresede;
    private String estadosede;


    public DatosTablasDAO() {
    }

    public DatosTablasDAO(String nitempresa, String nombreempresa, String estadoempresa) {
        this.nitempresa = nitempresa;
        this.nombreempresa = nombreempresa;
        this.estadoempresa = estadoempresa;
        this.empresasede=nitempresa;
        this.nombresede=nombreempresa;
        this.estadosede=estadoempresa;
    }

    public String getNitempresa() {
        return nitempresa;
    }

    public void setNitempresa(String nitempresa) {
        this.nitempresa = nitempresa;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getEstadoempresa() {
        return estadoempresa;
    }

    public void setEstadoempresa(String estadoempresa) {
        this.estadoempresa = estadoempresa;
    }

    public String getEmpresasede() {
        return empresasede;
    }

    public void setEmpresasede(String empresasede) {
        this.empresasede = empresasede;
    }

    public String getNombresede() {
        return nombresede;
    }

    public void setNombresede(String nombresede) {
        this.nombresede = nombresede;
    }

    public String getEstadosede() {
        return estadosede;
    }

    public void setEstadosede(String estadosede) {
        this.estadosede = estadosede;
    }

    @Override
    public String toString() {
        return "DatosTablasDAO{" +
                "nitempresa='" + nitempresa + '\'' +
                ", empresasede='" + empresasede + '\'' +
                ", nombreempresa='" + nombreempresa + '\'' +
                ", estadoempresa='" + estadoempresa + '\'' +
                ", nombresede='" + nombresede + '\'' +
                ", estadosede='" + estadosede + '\'' +
                '}';
    }
}

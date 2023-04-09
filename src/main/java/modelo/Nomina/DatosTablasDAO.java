package modelo.Nomina;

import conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

public class DatosTablasDAO {

    private String codigoempresa;
    private String nitempresa;
    private String empresasede;
    private String nombreempresa;
    private String estadoempresa;
    private String nombresede;
    private String estadosede;
    private String codigosede;
    private String codpais;
    private String CodDepto;
    private String CodMun;
    private String Direc;
    private String Telef;
    private String CelCont;
    private String CelWApp;
    private int Lunes;
    private int Martes;
    private int Miercoles;
    private int Jueves;
    private int Viernes;
    private int Sabado;
    private int Domingo;
    private int HrsLab;
    private Time HrIng;
    private Time HrEgr;
    private Time HrIniDs;
    private Time HrFinDs;
    private Integer HrsLabEnfe;
    private Integer HrsSemEnf;
    private Integer HrsMesEnf;
    private String EstCodGen;
    private String estado;
    private String dvsede;
    private String dvempresa;
    private String nitsede;


    public DatosTablasDAO(String codSede) {
    }

    public DatosTablasDAO(String codigosede, String nomSede, String empresasede, String descEstGen) {
        this.codigosede=codigosede;
        this.nombresede=nomSede;
        this.nombreempresa=empresasede;
        this.estadosede=descEstGen;
    }

    public DatosTablasDAO(String codEmp, String codSede, String nomSede, String idpaises, String codDepto,
                          String codMun, String direc, String telef, String celCont, String celWApp,
                          int lunes, int martes, int miercoles, int jueves,
                          int viernes, int sabado, int domingo, int hrsLab, Time hrIng,
                          Time hrEgr, Time hrIniDs, Time hrFinDs, int hrsLabEnfe, int hrsSemEnf,
                          int hrsMesEnf, String descEstGen) {
        this.codigoempresa=codEmp;
        this.codigosede=codSede;
        this.nombresede=nomSede;
        this.codpais=idpaises;
        this.CodDepto=codDepto;
        this.CodMun=codMun;
        this.Direc=direc;
        this.Telef=telef;
        this.CelCont=celCont;
        this.CelWApp=celWApp;
        this.Lunes=lunes;
        this.Martes=martes;
        this.Miercoles=miercoles;
        this.Jueves=jueves;
        this.Viernes=viernes;
        this.Sabado=sabado;
        this.Domingo=domingo;
        this.HrsLab=hrsLab;
        this.HrIng=hrIng;
        this.HrEgr=hrEgr;
        this.HrIniDs=hrIniDs;
        this.HrFinDs=hrFinDs;
        this.HrsLabEnfe=hrsLabEnfe;
        this.HrsSemEnf=hrsSemEnf;
        this.HrsMesEnf=hrsMesEnf;
        this.estado=descEstGen;
    }

    public DatosTablasDAO(String nitempresa, String nombreempresa, String estadoempresa) {
        this.nitempresa = nitempresa;
        this.nombreempresa = nombreempresa;
        this.estadoempresa = estadoempresa;
        this.empresasede=nitempresa;
        this.nombresede=nombreempresa;
        this.estadosede=estadoempresa;
    }


    public DatosTablasDAO(String nitempresa, String empresasede, String nombreempresa, String estadoempresa,
                          String nombresede, String estadosede, String codigoSede, String codpais,
                          String codDepto, String codMun, String direc, String telef, String celCont,
                          String celWApp, int lunes, int martes, int miercoles, int jueves,
                          int viernes, int sabado, int domingo, int hrsLab, Time hrIng,
                          Time hrEgr, Time hrIniDs, Time hrFinDs, Integer hrsLabEnfe, Integer hrsSemEnf,
                          Integer hrsMesEnf, String estCodGen) {
        this.nitempresa = nitempresa;
        this.empresasede = empresasede;
        this.nombreempresa = nombreempresa;
        this.estadoempresa = estadoempresa;
        this.nombresede = nombresede;
        this.estadosede = estadosede;
        this.codigosede = codigoSede;
        this.codpais = codpais;
        this.CodDepto = codDepto;
        this.CodMun = codMun;
        this.Direc = direc;
        this.Telef = telef;
        this.CelCont = celCont;
        this.CelWApp = celWApp;
        this.Lunes = lunes;
        this.Martes = martes;
        this.Miercoles = miercoles;
        this.Jueves = jueves;
        this.Viernes = viernes;
        this.Sabado = sabado;
        this.Domingo = domingo;
        this.HrsLab = hrsLab;
        this.HrIng = hrIng;
        this.HrEgr = hrEgr;
        this.HrIniDs = hrIniDs;
        this.HrFinDs = hrFinDs;
        this.HrsLabEnfe = hrsLabEnfe;
        this.HrsSemEnf = hrsSemEnf;
        this.HrsMesEnf = hrsMesEnf;
        this.EstCodGen = estCodGen;
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
                ", codigosede='" + codigosede + '\'' +
                ", codpais='" + codpais + '\'' +
                ", CodDepto='" + CodDepto + '\'' +
                ", CodMun='" + CodMun + '\'' +
                ", Direc='" + Direc + '\'' +
                ", Telef='" + Telef + '\'' +
                ", CelCont='" + CelCont + '\'' +
                ", CelWApp='" + CelWApp + '\'' +
                ", Lunes=" + Lunes +
                ", Martes=" + Martes +
                ", Miercoles=" + Miercoles +
                ", Jueves=" + Jueves +
                ", Viernes=" + Viernes +
                ", Sabado=" + Sabado +
                ", Domingo=" + Domingo +
                ", HrsLab=" + HrsLab +
                ", HrIng=" + HrIng +
                ", HrEgr=" + HrEgr +
                ", HrIniDs=" + HrIniDs +
                ", HrFinDs=" + HrFinDs +
                ", HrsLabEnfe=" + HrsLabEnfe +
                ", HrsSemEnf=" + HrsSemEnf +
                ", HrsMesEnf=" + HrsMesEnf +
                ", EstCodGen='" + EstCodGen + '\'' +
                '}';
    }

    public String getCodigosede() {
        return codigosede;
    }

    public void setCodigosede(String codigosede) {
        this.codigosede = codigosede;
    }

    public String getCodpais() {
        return codpais;
    }

    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    public String getCodigoempresa() {
        return codigoempresa;
    }

    public void setCodigoempresa(String codigoempresa) {
        this.codigoempresa = codigoempresa;
    }

    public int getLunes() {
        return Lunes;
    }

    public int getMartes() {
        return Martes;
    }

    public int getMiercoles() {
        return Miercoles;
    }

    public int getJueves() {
        return Jueves;
    }

    public int getViernes() {
        return Viernes;
    }

    public int getSabado() {
        return Sabado;
    }

    public int getDomingo() {
        return Domingo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodDepto() {
        return CodDepto;
    }

    public void setCodDepto(String codDepto) {
        CodDepto = codDepto;
    }

    public String getCodMun() {
        return CodMun;
    }

    public void setCodMun(String codMun) {
        CodMun = codMun;
    }

    public String getDirec() {
        return Direc;
    }

    public void setDirec(String direc) {
        Direc = direc;
    }

    public String getTelef() {
        return Telef;
    }

    public void setTelef(String telef) {
        Telef = telef;
    }

    public String getCelCont() {
        return CelCont;
    }

    public void setCelCont(String celCont) {
        CelCont = celCont;
    }

    public String getCelWApp() {
        return CelWApp;
    }

    public void setCelWApp(String celWApp) {
        CelWApp = celWApp;
    }

    public int isLunes() {
        return Lunes;
    }

    public void setLunes(int lunes) {
        Lunes = lunes;
    }

    public int isMartes() {
        return Martes;
    }

    public void setMartes(int martes) {
        Martes = martes;
    }

    public int isMiercoles() {
        return Miercoles;
    }

    public void setMiercoles(int miercoles) {
        Miercoles = miercoles;
    }

    public int isJueves() {
        return Jueves;
    }

    public void setJueves(int jueves) {
        Jueves = jueves;
    }

    public int isViernes() {
        return Viernes;
    }

    public void setViernes(int viernes) {
        Viernes = viernes;
    }

    public int isSabado() {
        return Sabado;
    }

    public void setSabado(int sabado) {
        Sabado = sabado;
    }

    public int isDomingo() {
        return Domingo;
    }

    public void setDomingo(int domingo) {
        Domingo = domingo;
    }

    public int getHrsLab() {
        return HrsLab;
    }

    public void setHrsLab(int hrsLab) {
        HrsLab = hrsLab;
    }

    public Time getHrIng() {
        return HrIng;
    }

    public void setHrIng(Time hrIng) {
        HrIng = hrIng;
    }

    public Time getHrEgr() {
        return HrEgr;
    }

    public void setHrEgr(Time hrEgr) {
        HrEgr = hrEgr;
    }

    public Time getHrIniDs() {
        return HrIniDs;
    }

    public void setHrIniDs(Time hrIniDs) {
        HrIniDs = hrIniDs;
    }

    public Time getHrFinDs() {
        return HrFinDs;
    }

    public void setHrFinDs(Time hrFinDs) {
        HrFinDs = hrFinDs;
    }

    public Integer getHrsLabEnfe() {
        return HrsLabEnfe;
    }

    public void setHrsLabEnfe(Integer hrsLabEnfe) {
        HrsLabEnfe = hrsLabEnfe;
    }

    public Integer getHrsSemEnf() {
        return HrsSemEnf;
    }

    public void setHrsSemEnf(Integer hrsSemEnf) {
        HrsSemEnf = hrsSemEnf;
    }

    public Integer getHrsMesEnf() {
        return HrsMesEnf;
    }

    public void setHrsMesEnf(Integer hrsMesEnf) {
        HrsMesEnf = hrsMesEnf;
    }

    public String getEstCodGen() {
        return EstCodGen;
    }

    public void setEstCodGen(String estCodGen) {
        EstCodGen = estCodGen;
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

    public String getCodigoSede() {
        return codigosede;
    }

    public String getDvsede() {
        return dvsede;
    }

    public void setDvsede(String dvsede) {
        this.dvsede = dvsede;
    }

    public String getDvempresa() {
        return dvempresa;
    }

    public void setDvempresa(String dvempresa) {
        this.dvempresa = dvempresa;
    }

    public String getNitsede() {
        return nitsede;
    }

    public void setNitsede(String nitsede) {
        this.nitsede = nitsede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigosede = codigoSede;
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

    public void eliminarSede(String codigoSede) throws SQLException {
        Conexion conexion = new Conexion();
        Connection con = null;
        con = conexion.conectar();
        try {
            String sql = "DELETE FROM sami.tb_sede WHERE id = ?";
            PreparedStatement declaracion = con.prepareStatement(sql);
            declaracion.setString(1, codigoSede);
            int filasEliminadas = declaracion.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("El registro ha sido eliminado correctamente.");
            } else {
                System.out.println("No se ha eliminado ningún registro.");
            }
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error al intentar eliminar el registro: " + ex.getMessage());
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

}

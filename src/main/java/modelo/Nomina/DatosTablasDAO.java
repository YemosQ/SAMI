package modelo.Nomina;

import java.sql.Time;

public class DatosTablasDAO {


    private String codEmpresa;
    private String nitEmpresa;
    private String nombreEmpresa;
    private String codSede;
    private String nombreSede;
    private String nitSede;
    private String dvSede;
    private String codPais;
    private String nomPais;
    private String codDepto;
    private String nomDepto;
    private String codMun;
    private String nomMuni;
    private String codBarrio;
    private String nomBarrio;
    private String ubSede;
    private String direc;
    private String telef;
    private String celCont;
    private String celWApp;
    private String email;
    private String codMon;
    private String codPuc;
    private String cantDec;
    private boolean consSede;
    private String docRpLeg;
    private String nomRpLeg;
    private String estadoEmpresa;
    private int lunes;
    private int martes;
    private int miercoles;
    private int jueves;
    private int viernes;
    private int sabado;
    private int domingo;
    private int hrsLab;
    private Time hrIng;
    private Time hrEgr;
    private Time hrIniDs;
    private Time hrFinDs;
    private Integer hrsLabEnfe;
    private Integer hrsSemEnf;
    private Integer hrsMesEnf;
    private String codEstado;
    private String estadoSede;
    private String dvEmpresa;
    private String urlFirmaRpLeg;
    private String urlLogoSede;
    private String urlMaeSede;

    /*
    * Aqui termina el registro de todos los campos de la tabla sede
    * */

    public DatosTablasDAO(String codSede, String nomSede, String empresaSede, String descEstGen, String sede, String string, String sedeNit, String sedeDv, String idpaises, String nomPais, String codDepto, String nomDepto, String codMun, String nomMun, String direc, String telef, String celCont, String celWApp, int lunes, int martes, int miercoles, int jueves, int viernes, int sabado, int domingo, int hrsLab, Time hrIng, Time hrEgr, Time hrIniDs, Time hrFinDs, int hrsLabEnfe, int hrsSemEnf, int hrsMesEnf, String estCodGen, String estGen) {
        this.codSede = codSede;
        this.nombreSede = nomSede;
        this.nombreEmpresa = empresaSede;
        this.estadoSede = descEstGen;
    }

    public DatosTablasDAO(String codEmp, String nitempresa, String dvempresa, String codSede,
                          String nomSede, String nitSede, String dvSede, String idpaises, String nompais, String codDepto,
                          String nomdepto, String codMun, String nommuni, String direc, String telef, String celCont,
                          String celWApp, int lunes, int martes, int miercoles, int jueves, int viernes, int sabado,
                          int domingo, int hrsLab, Time hrIng, Time hrEgr, Time hrIniDs, Time hrFinDs,
                          int hrsLabEnfe, int hrsSemEnf, int hrsMesEnf, String EstCodGen, String descEstGen) {
        this.codEmpresa = codEmp;
        this.nitEmpresa = nitempresa;
        this.dvEmpresa = dvempresa;
        this.codSede = codSede;
        this.nombreSede = nomSede;
        this.nitSede = nitSede;
        this.dvSede = dvSede;
        this.codPais = idpaises;
        this.nomPais = nompais;
        this.codDepto = codDepto;
        this.nomDepto = nomdepto;
        this.codMun = codMun;
        this.nomMuni = nommuni;
        this.direc = direc;
        this.telef = telef;
        this.celCont = celCont;
        this.celWApp = celWApp;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
        this.hrsLab = hrsLab;
        this.hrIng = hrIng;
        this.hrEgr = hrEgr;
        this.hrIniDs = hrIniDs;
        this.hrFinDs = hrFinDs;
        this.hrsLabEnfe = hrsLabEnfe;
        this.hrsSemEnf = hrsSemEnf;
        this.hrsMesEnf = hrsMesEnf;
        this.codEstado = EstCodGen;
        this.estadoSede = descEstGen;
    }

    public DatosTablasDAO(String nitEmpresa, String nombreEmpresa, String estadoEmpresa) {
        this.nitEmpresa = nitEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.estadoEmpresa = estadoEmpresa;
        this.nombreSede = nombreEmpresa;
        this.estadoSede = estadoEmpresa;
    }


    public DatosTablasDAO(String nitempresa, String nombreempresa, String estadoempresa,
                          String nombresede, String estadosede, String codigoSede, String codpais,
                          String codDepto, String codMun, String direc, String telef, String celCont,
                          String celWApp, int lunes, int martes, int miercoles, int jueves,
                          int viernes, int sabado, int domingo, int hrsLab, Time hrIng,
                          Time hrEgr, Time hrIniDs, Time hrFinDs, Integer hrsLabEnfe, Integer hrsSemEnf,
                          Integer hrsMesEnf, String estCodGen) {
        this.nitEmpresa = nitempresa;
        this.nombreEmpresa = nombreempresa;
        this.estadoEmpresa = estadoempresa;
        this.nombreSede = nombresede;
        this.estadoSede = estadosede;
        this.codSede = codigoSede;
        this.codPais = codpais;
        this.codDepto = codDepto;
        this.codMun = codMun;
        this.direc = direc;
        this.telef = telef;
        this.celCont = celCont;
        this.celWApp = celWApp;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
        this.hrsLab = hrsLab;
        this.hrIng = hrIng;
        this.hrEgr = hrEgr;
        this.hrIniDs = hrIniDs;
        this.hrFinDs = hrFinDs;
        this.hrsLabEnfe = hrsLabEnfe;
        this.hrsSemEnf = hrsSemEnf;
        this.hrsMesEnf = hrsMesEnf;
        this.codEstado = estCodGen;
    }

    public DatosTablasDAO(String codSede) {
        this.codSede = codSede;
    }

    @Override
    public String toString() {
        return "DatosTablasDAO{" +
                "codEmpresa='" + codEmpresa + '\'' +
                ", nitEmpresa='" + nitEmpresa + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", estadoEmpresa='" + estadoEmpresa + '\'' +
                ", nombreSede='" + nombreSede + '\'' +
                ", estadoSede='" + estadoSede + '\'' +
                ", codSede='" + codSede + '\'' +
                ", codPais='" + codPais + '\'' +
                ", codDepto='" + codDepto + '\'' +
                ", codMun='" + codMun + '\'' +
                ", direc='" + direc + '\'' +
                ", telef='" + telef + '\'' +
                ", celCont='" + celCont + '\'' +
                ", celWApp='" + celWApp + '\'' +
                ", lunes=" + lunes +
                ", martes=" + martes +
                ", miercoles=" + miercoles +
                ", jueves=" + jueves +
                ", viernes=" + viernes +
                ", sabado=" + sabado +
                ", domingo=" + domingo +
                ", hrsLab=" + hrsLab +
                ", hrIng=" + hrIng +
                ", hrEgr=" + hrEgr +
                ", hrIniDs=" + hrIniDs +
                ", hrFinDs=" + hrFinDs +
                ", hrsLabEnfe=" + hrsLabEnfe +
                ", hrsSemEnf=" + hrsSemEnf +
                ", hrsMesEnf=" + hrsMesEnf +
                ", codEstado=" + codEstado +
                ", codEstado='" + codEstado + '\'' +
                ", dvSede='" + dvSede + '\'' +
                ", dvEmpresa='" + dvEmpresa + '\'' +
                ", nitSede='" + nitSede + '\'' +
                ", nomPais='" + nomPais + '\'' +
                ", nomDepto='" + nomDepto + '\'' +
                ", nomMuni='" + nomMuni + '\'' +
                '}';
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getNitSede() {
        return nitSede;
    }

    public void setNitSede(String nitSede) {
        this.nitSede = nitSede;
    }

    public String getDvSede() {
        return dvSede;
    }

    public void setDvSede(String dvSede) {
        this.dvSede = dvSede;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    public String getCodDepto() {
        return codDepto;
    }

    public void setCodDepto(String codDepto) {
        this.codDepto = codDepto;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    public String getNomMuni() {
        return nomMuni;
    }

    public void setNomMuni(String nomMuni) {
        this.nomMuni = nomMuni;
    }

    public String getCodBarrio() {
        return codBarrio;
    }

    public void setCodBarrio(String codBarrio) {
        this.codBarrio = codBarrio;
    }

    public String getNomBarrio() {
        return nomBarrio;
    }

    public void setNomBarrio(String nomBarrio) {
        this.nomBarrio = nomBarrio;
    }

    public String getUbSede() {
        return ubSede;
    }

    public void setUbSede(String ubSede) {
        this.ubSede = ubSede;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getCelCont() {
        return celCont;
    }

    public void setCelCont(String celCont) {
        this.celCont = celCont;
    }

    public String getCelWApp() {
        return celWApp;
    }

    public void setCelWApp(String celWApp) {
        this.celWApp = celWApp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodMon() {
        return codMon;
    }

    public void setCodMon(String codMon) {
        this.codMon = codMon;
    }

    public String getCodPuc() {
        return codPuc;
    }

    public void setCodPuc(String codPuc) {
        this.codPuc = codPuc;
    }

    public String getCantDec() {
        return cantDec;
    }

    public void setCantDec(String cantDec) {
        this.cantDec = cantDec;
    }

    public boolean isConsSede() {
        return consSede;
    }

    public void setConsSede(boolean consSede) {
        this.consSede = consSede;
    }

    public String getDocRpLeg() {
        return docRpLeg;
    }

    public void setDocRpLeg(String docRpLeg) {
        this.docRpLeg = docRpLeg;
    }

    public String getNomRpLeg() {
        return nomRpLeg;
    }

    public void setNomRpLeg(String nomRpLeg) {
        this.nomRpLeg = nomRpLeg;
    }

    public String getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public int getLunes() {
        return lunes;
    }

    public void setLunes(int lunes) {
        this.lunes = lunes;
    }

    public int getMartes() {
        return martes;
    }

    public void setMartes(int martes) {
        this.martes = martes;
    }

    public int getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(int miercoles) {
        this.miercoles = miercoles;
    }

    public int getJueves() {
        return jueves;
    }

    public void setJueves(int jueves) {
        this.jueves = jueves;
    }

    public int getViernes() {
        return viernes;
    }

    public void setViernes(int viernes) {
        this.viernes = viernes;
    }

    public int getSabado() {
        return sabado;
    }

    public void setSabado(int sabado) {
        this.sabado = sabado;
    }

    public int getDomingo() {
        return domingo;
    }

    public void setDomingo(int domingo) {
        this.domingo = domingo;
    }

    public int getHrsLab() {
        return hrsLab;
    }

    public void setHrsLab(int hrsLab) {
        this.hrsLab = hrsLab;
    }

    public Time getHrIng() {
        return hrIng;
    }

    public void setHrIng(Time hrIng) {
        this.hrIng = hrIng;
    }

    public Time getHrEgr() {
        return hrEgr;
    }

    public void setHrEgr(Time hrEgr) {
        this.hrEgr = hrEgr;
    }

    public Time getHrIniDs() {
        return hrIniDs;
    }

    public void setHrIniDs(Time hrIniDs) {
        this.hrIniDs = hrIniDs;
    }

    public Time getHrFinDs() {
        return hrFinDs;
    }

    public void setHrFinDs(Time hrFinDs) {
        this.hrFinDs = hrFinDs;
    }

    public Integer getHrsLabEnfe() {
        return hrsLabEnfe;
    }

    public void setHrsLabEnfe(Integer hrsLabEnfe) {
        this.hrsLabEnfe = hrsLabEnfe;
    }

    public Integer getHrsSemEnf() {
        return hrsSemEnf;
    }

    public void setHrsSemEnf(Integer hrsSemEnf) {
        this.hrsSemEnf = hrsSemEnf;
    }

    public Integer getHrsMesEnf() {
        return hrsMesEnf;
    }

    public void setHrsMesEnf(Integer hrsMesEnf) {
        this.hrsMesEnf = hrsMesEnf;
    }

    public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    public String getEstadoSede() {
        return estadoSede;
    }

    public void setEstadoSede(String estadoSede) {
        this.estadoSede = estadoSede;
    }

    public String getDvEmpresa() {
        return dvEmpresa;
    }

    public void setDvEmpresa(String dvEmpresa) {
        this.dvEmpresa = dvEmpresa;
    }

    public String getUrlFirmaRpLeg() {
        return urlFirmaRpLeg;
    }

    public void setUrlFirmaRpLeg(String urlFirmaRpLeg) {
        this.urlFirmaRpLeg = urlFirmaRpLeg;
    }

    public String getUrlLogoSede() {
        return urlLogoSede;
    }

    public void setUrlLogoSede(String urlLogoSede) {
        this.urlLogoSede = urlLogoSede;
    }

    public String getUrlMaeSede() {
        return urlMaeSede;
    }

    public void setUrlMaeSede(String urlMaeSede) {
        this.urlMaeSede = urlMaeSede;
    }
}

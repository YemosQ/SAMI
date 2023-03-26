package modelo.Nomina;


import conexion.Conexion;
import javafx.beans.property.ObjectProperty;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.chrono.Chronology;

public class EmpleadosDAO {
    private Connection con;
    private static String codigo;
    private static int anio;
    private static String documento;
    private static String nombreUno;
    private static String nombreDos;
    private static String apellidoUno;
    private static String apellidoDos;
    private static String nombreComp;
    private static Integer diaNaci;
    private static String mesNaci;
    private static int anioNaci;
    private static int edad;
    private static String paisNaci;
    private static String departamentoNaci;
    private static String municipioNaci;
    private static int codigoSexo;
    private static int codigoPoblacion;
    private static String paisResidencia;
    private static String departamentoResi;
    private static String municipioResi;
    private static String barrioResi;
    private static String direccionResi;
    private static String telefono;
    private static String celular;
    private static int whatsApp;
    private static String email;
    private static Date fechaIngreso;
    private static int tipoSalario;
    private static int tipoValor;
    private static double sueldo;
    private static int tipoContrato;
    private static int tipoVinculacion;
    private static int tiempoMeses;
    private static int tipoCargo;
    private static int tipoTurno;
    private static boolean horarioGeneral;
    private static int codigoArea;
    private static int tipoCosto;
    private static String codigoSede;
    private static String codigoPension;
    private static String codigoEPS;
    private static String codigoCesantias;
    private static String codigoARL;
    private static String codigoRiesgo;
    private static String codigoCCF;
    private static String codigoBanco;
    private static String tipoCuenta;
    private static String numeroCuenta;

    public EmpleadosDAO() {

    }


    public static String getCodigo() {
        return codigo;
    }

    public static void setCodigo(String codigo) {
        EmpleadosDAO.codigo = codigo;
    }

    public static int getAnio() {
        return anio;
    }

    public static void setAnio(int anio) {
        EmpleadosDAO.anio = anio;
    }

    public static String getDocumento() {
        return documento;
    }

    public static void setDocumento(String documento) {
        EmpleadosDAO.documento = documento;
    }

    public static String getNombreUno() {
        return nombreUno;
    }

    public static void setNombreUno(String nombreUno) {
        EmpleadosDAO.nombreUno = nombreUno;
    }

    public static String getNombreDos() {
        return nombreDos;
    }

    public static void setNombreDos(String nombreDos) {
        EmpleadosDAO.nombreDos = nombreDos;
    }

    public static String getApellidoUno() {
        return apellidoUno;
    }

    public static void setApellidoUno(String apellidoUno) {
        EmpleadosDAO.apellidoUno = apellidoUno;
    }

    public static String getApellidoDos() {
        return apellidoDos;
    }

    public static void setApellidoDos(String apellidoDos) {
        EmpleadosDAO.apellidoDos = apellidoDos;
    }

    public static String getNombreComp() {
        return nombreComp;
    }

    public static void setNombreComp(String nombreComp) {
        EmpleadosDAO.nombreComp = nombreComp;
    }

    public static Integer getDiaNaci() {
        return diaNaci;
    }

    public static void setDiaNaci(Integer diaNaci) {
        EmpleadosDAO.diaNaci = diaNaci;
    }

    public static String getMesNaci() {
        return mesNaci;
    }

    public static void setMesNaci(String mesNaci) {
        EmpleadosDAO.mesNaci = mesNaci;
    }

    public static int getAnioNaci() {
        return anioNaci;
    }

    public static void setAnioNaci(int anioNaci) {
        EmpleadosDAO.anioNaci = anioNaci;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        EmpleadosDAO.edad = edad;
    }

    public static String getPaisNaci() {
        return paisNaci;
    }

    public static void setPaisNaci(String paisNaci) {
        EmpleadosDAO.paisNaci = paisNaci;
    }

    public static String getDepartamentoNaci() {
        return departamentoNaci;
    }

    public static void setDepartamentoNaci(String departamentoNaci) {
        EmpleadosDAO.departamentoNaci = departamentoNaci;
    }

    public static String getMunicipioNaci() {
        return municipioNaci;
    }

    public static void setMunicipioNaci(String municipioNaci) {
        EmpleadosDAO.municipioNaci = municipioNaci;
    }

    public static int getCodigoSexo() {
        return codigoSexo;
    }

    public static void setCodigoSexo(int codigoSexo) {
        EmpleadosDAO.codigoSexo = codigoSexo;
    }

    public static int getCodigoPoblacion() {
        return codigoPoblacion;
    }

    public static void setCodigoPoblacion(int codigoPoblacion) {
        EmpleadosDAO.codigoPoblacion = codigoPoblacion;
    }

    public static String getPaisResidencia() {
        return paisResidencia;
    }

    public static void setPaisResidencia(String paisResidencia) {
        EmpleadosDAO.paisResidencia = paisResidencia;
    }

    public static String getDepartamentoResi() {
        return departamentoResi;
    }

    public static void setDepartamentoResi(String departamentooResi) {
        departamentoResi = departamentooResi;
    }

    public static String getMunicipioResi() {
        return municipioResi;
    }

    public static void setMunicipioResi(String municipioResi) {
        EmpleadosDAO.municipioResi = municipioResi;
    }

    public static String getBarrioResi() {
        return barrioResi;
    }

    public static void setBarrioResi(String barrioResi) {
        EmpleadosDAO.barrioResi = barrioResi;
    }

    public static String getDireccionResi() {
        return direccionResi;
    }

    public static void setDireccionResi(String direccionResi) {
        EmpleadosDAO.direccionResi = direccionResi;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        EmpleadosDAO.telefono = telefono;
    }

    public static String getCelular() {
        return celular;
    }

    public static void setCelular(String celular) {
        EmpleadosDAO.celular = celular;
    }

    public static int getWhatsApp() {
        return whatsApp;
    }

    public static void setWhatsApp(int whatsApp) {
        EmpleadosDAO.whatsApp = whatsApp;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        EmpleadosDAO.email = email;
    }

    public static Date getFechaIngreso() {
        return fechaIngreso;
    }

    public static void setFechaIngreso(Date fechaIngreso) {
        EmpleadosDAO.fechaIngreso = fechaIngreso;
    }

    public static int getTipoSalario() {
        return tipoSalario;
    }

    public static void setTipoSalario(int tipoSalario) {
        EmpleadosDAO.tipoSalario = tipoSalario;
    }

    public static int getTipoValor() {
        return tipoValor;
    }

    public static void setTipoValor(int tipoValor) {
        EmpleadosDAO.tipoValor = tipoValor;
    }

    public static double getSueldo() {
        return sueldo;
    }

    public static void setSueldo(double sueldo) {
        EmpleadosDAO.sueldo = sueldo;
    }

    public static int getTipoContrato() {
        return tipoContrato;
    }

    public static void setTipoContrato(int tipoContrato) {
        EmpleadosDAO.tipoContrato = tipoContrato;
    }

    public static int getTipoVinculacion() {
        return tipoVinculacion;
    }

    public static void setTipoVinculacion(int tipoVinculacion) {
        EmpleadosDAO.tipoVinculacion = tipoVinculacion;
    }

    public static int getTiempoMeses() {
        return tiempoMeses;
    }

    public static void setTiempoMeses(int tiempoMeses) {
        EmpleadosDAO.tiempoMeses = tiempoMeses;
    }

    public static int getTipoCargo() {
        return tipoCargo;
    }

    public static void setTipoCargo(int tipoCargo) {
        EmpleadosDAO.tipoCargo = tipoCargo;
    }

    public static int getTipoTurno() {
        return tipoTurno;
    }

    public static void setTipoTurno(int tipoTurno) {
        EmpleadosDAO.tipoTurno = tipoTurno;
    }

    public static boolean isHorarioGeneral() {
        return horarioGeneral;
    }

    public static void setHorarioGeneral(boolean horarioGeneral) {
        EmpleadosDAO.horarioGeneral = horarioGeneral;
    }

    public static int getCodigoArea() {
        return codigoArea;
    }

    public static void setCodigoArea(int codigoArea) {
        EmpleadosDAO.codigoArea = codigoArea;
    }

    public static int getTipoCosto() {
        return tipoCosto;
    }

    public static void setTipoCosto(int tipoCosto) {
        EmpleadosDAO.tipoCosto = tipoCosto;
    }

    public static String getCodigoSede() {
        return codigoSede;
    }

    public static void setCodigoSede(String codigoSede) {
        EmpleadosDAO.codigoSede = codigoSede;
    }

    public static String getCodigoPension() {
        return codigoPension;
    }

    public static void setCodigoPension(String codigoPension) {
        EmpleadosDAO.codigoPension = codigoPension;
    }

    public static String getCodigoEPS() {
        return codigoEPS;
    }

    public static void setCodigoEPS(String codigoEPS) {
        EmpleadosDAO.codigoEPS = codigoEPS;
    }

    public static String getCodigoCesantias() {
        return codigoCesantias;
    }

    public static void setCodigoCesantias(String codigoCesantias) {
        EmpleadosDAO.codigoCesantias = codigoCesantias;
    }

    public static String getCodigoARL() {
        return codigoARL;
    }

    public static void setCodigoARL(String codigoARL) {
        EmpleadosDAO.codigoARL = codigoARL;
    }

    public static String getCodigoRiesgo() {
        return codigoRiesgo;
    }

    public static void setCodigoRiesgo(String codigoRiesgo) {
        EmpleadosDAO.codigoRiesgo = codigoRiesgo;
    }

    public static String getCodigoCCF() {
        return codigoCCF;
    }

    public static void setCodigoCCF(String codigoCCF) {
        EmpleadosDAO.codigoCCF = codigoCCF;
    }

    public static String getCodigoBanco() {
        return codigoBanco;
    }

    public static void setCodigoBanco(String codigoBanco) {
        EmpleadosDAO.codigoBanco = codigoBanco;
    }

    public static String getTipoCuenta() {
        return tipoCuenta;
    }

    public static void setTipoCuenta(String tipoCuenta) {
        EmpleadosDAO.tipoCuenta = tipoCuenta;
    }

    public static String getNumeroCuenta() {
        return numeroCuenta;
    }

    public static void setNumeroCuenta(String numeroCuenta) {
        EmpleadosDAO.numeroCuenta = numeroCuenta;
    }


    public EmpleadosDAO(String codigo, int anio, String documento, String nombreUno,
                        String nombreDos, String apellidoUno, String apellidoDos,
                        String nombreComp, Integer diaNaci, String mesNaci,
                        int anioNaci, int edad, String paisNaci, String departamentoNaci,
                        String municipioNaci, int codigoSexo, int codigoPoblacion,
                        String paisResidencia, String departamentoResi, String municipioResi,
                        String barrioResi, String direccionResi, String telefono, String celular,
                        int whatsApp, String email, Date fechaIngreso, int tipoSalario,
                        int tipoValor, double sueldo, int tipoContrato, int tipoVinculacion,
                        int tiempoMeses, int tipoCargo, int tipoTurno, boolean horarioGeneral,
                        int codigoArea, int tipoCosto, String codigoSede, String codigoPension,
                        String codigoEPS, String codigoCesantias, String codigoARL, String codigoRiesgo,
                        String codigoCCF, String codigoBanco, String tipoCuenta, String numeroCuenta) {
        this.codigo = codigo;
        this.anio = anio;
        this.documento = documento;
        this.nombreUno = nombreUno;
        this.nombreDos = nombreDos;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.nombreComp = nombreComp;
        this.diaNaci = diaNaci;
        this.mesNaci = mesNaci;
        this.anioNaci = anioNaci;
        this.edad = edad;
        this.paisNaci = paisNaci;
        this.departamentoNaci = departamentoNaci;
        this.municipioNaci = municipioNaci;
        this.codigoSexo = codigoSexo;
        this.codigoPoblacion = codigoPoblacion;
        this.paisResidencia = paisResidencia;
        this.departamentoResi = departamentoResi;
        this.municipioResi = municipioResi;
        this.barrioResi = barrioResi;
        this.direccionResi = direccionResi;
        this.telefono = telefono;
        this.celular = celular;
        this.whatsApp = whatsApp;
        this.email = email;
        this.fechaIngreso = fechaIngreso;
        this.tipoSalario = tipoSalario;
        this.tipoValor = tipoValor;
        this.sueldo = sueldo;
        this.tipoContrato = tipoContrato;
        this.tipoVinculacion = tipoVinculacion;
        this.tiempoMeses = tiempoMeses;
        this.tipoCargo = tipoCargo;
        this.tipoTurno = tipoTurno;
        this.horarioGeneral = horarioGeneral;
        this.codigoArea = codigoArea;
        this.tipoCosto = tipoCosto;
        this.codigoSede = codigoSede;
        this.codigoPension = codigoPension;
        this.codigoEPS = codigoEPS;
        this.codigoCesantias = codigoCesantias;
        this.codigoARL = codigoARL;
        this.codigoRiesgo = codigoRiesgo;
        this.codigoCCF = codigoCCF;
        this.codigoBanco = codigoBanco;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    public void insertar(String codigo, int anio, String documento, String nombreUno, String nombreDos,
                         String apellidoUno, String apellidoDos, String nombreComp, Integer diaNaci, String mesNaci,
                         int anioNaci, int edad, String paisNaci, String departamentoNaci, String municipioNaci,
                         int codigoSexo, int codigoPoblacion, String paisResidencia, String departamentoResi,
                         String municipioResi, String barrioResi, String direccionResi, String telefono, String celular,
                         int whatsApp, String email, ObjectProperty<Chronology> fechaIngreso, int tipoSalario,
                         int tipoValor, double sueldo, double tipoContrato, int tipoVinculacion, int tiempoMeses,
                         int tipoCargo, int tipoTurno, boolean horarioGeneral, int codigoArea, int tipoCosto,
                         String codigoSede, String codigoPension, String codigoEPS, String codigoCesantias,
                         String codigoARL, String codigoRiesgo, String codigoCCF, String codigoBanco,
                         String tipoCuenta, String numeroCuenta) {
        PreparedStatement ps;
        String sql;
        EmpleadosDAO.setCodigo(codigo);
        EmpleadosDAO.setAnio(anio);
        EmpleadosDAO.setDocumento(documento);
        EmpleadosDAO.setNombreUno(nombreUno);
        EmpleadosDAO.setNombreDos(nombreDos);
        EmpleadosDAO.setApellidoUno(apellidoUno);
        EmpleadosDAO.setApellidoDos(apellidoDos);
        EmpleadosDAO.setNombreComp(nombreComp);
        EmpleadosDAO.setDiaNaci(diaNaci);
        EmpleadosDAO.setMesNaci(mesNaci);
        EmpleadosDAO.setAnioNaci(anioNaci);
        EmpleadosDAO.setEdad(edad);
        EmpleadosDAO.setPaisNaci(paisNaci);
        EmpleadosDAO.setDepartamentoNaci(departamentoNaci);
        EmpleadosDAO.setMunicipioNaci(municipioNaci);
        EmpleadosDAO.setCodigoSexo(Integer.parseInt(String.valueOf(codigoSexo)));
        EmpleadosDAO.setCodigoPoblacion(codigoPoblacion);
        EmpleadosDAO.setPaisResidencia(String.valueOf(paisResidencia));
        EmpleadosDAO.setDepartamentoResi(departamentoResi);
        EmpleadosDAO.setMunicipioResi(municipioResi);
        EmpleadosDAO.setBarrioResi(barrioResi);
        EmpleadosDAO.setDireccionResi(direccionResi);
        EmpleadosDAO.setTelefono(telefono);
        EmpleadosDAO.setCelular(celular);
        EmpleadosDAO.setWhatsApp(Integer.parseInt(String.valueOf(whatsApp)));
        EmpleadosDAO.setEmail(String.valueOf(email));
        EmpleadosDAO.setFechaIngreso(Date.valueOf(String.valueOf(fechaIngreso)));
        EmpleadosDAO.setTipoSalario(tipoSalario);
        EmpleadosDAO.setTipoValor(tipoValor);
        EmpleadosDAO.setSueldo(sueldo);
        EmpleadosDAO.setTipoContrato((int) tipoContrato);
        EmpleadosDAO.setTipoVinculacion(tipoVinculacion);
        EmpleadosDAO.setTiempoMeses(tiempoMeses);
        EmpleadosDAO.setTipoCargo(tipoCargo);
        EmpleadosDAO.setTipoTurno(tipoTurno);
        EmpleadosDAO.setHorarioGeneral(horarioGeneral);
        EmpleadosDAO.setCodigoArea(codigoArea);
        EmpleadosDAO.setTipoCosto(tipoCosto);
        EmpleadosDAO.setCodigoSede(String.valueOf(codigoSede));
        EmpleadosDAO.setCodigoPension(codigoPension);
        EmpleadosDAO.setCodigoEPS(codigoEPS);
        EmpleadosDAO.setCodigoCesantias(codigoCesantias);
        EmpleadosDAO.setCodigoARL(codigoARL);
        EmpleadosDAO.setCodigoRiesgo(codigoRiesgo);
        EmpleadosDAO.setCodigoCCF(codigoCCF);
        EmpleadosDAO.setCodigoBanco(codigoBanco);
        EmpleadosDAO.setTipoCuenta(tipoCuenta);
        EmpleadosDAO.setNumeroCuenta(numeroCuenta);

        try {
            con = Conexion.conectar();
            //con = Conexion.getInstance().conectar();
            sql = "insert into tb_empleados (CodE, AnioD, DocE, NomUno, NomDos, " +
                    "ApeUno, ApeDos, NomCom, DiaNa, MesNa, AnioNa, Edad, idpaises, " +
                    "CodDepNa, CodCiuNa, CodTpSexNa, CodTpPobNa, CodPaiDr, CodDeptoDr, " +
                    "CodMunDr, CodBarDir, Direc, Telef, Celu, WhatsApp, Email, FchIng, " +
                    "CodTpSal, CodTpVlr, Sueldo, CodTpCto, CodTpVin, TMes, " +
                    "CodTpCarg, CodTpTurn, HrioGen, CodArea, CodTpCCost, CodSede, CodPen, " +
                    "CodEPS, CodCesan, CodARL, CodRiesgo, CodCCF, CodBanc, CodCta, NumCta) " +
                    "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
                    "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, EmpleadosDAO.getCodigo());
            ps.setInt(2, EmpleadosDAO.getAnio());
            ps.setString(3, EmpleadosDAO.getDocumento());
            ps.setString(4, EmpleadosDAO.getNombreUno());
            ps.setString(5, EmpleadosDAO.getNombreDos());
            ps.setString(6, EmpleadosDAO.getApellidoUno());
            ps.setString(7, EmpleadosDAO.getApellidoDos());
            ps.setString(8, EmpleadosDAO.getNombreComp());
            ps.setInt(9, EmpleadosDAO.getDiaNaci());
            ps.setString(10, EmpleadosDAO.getMesNaci());
            ps.setInt(11, EmpleadosDAO.getAnioNaci());
            ps.setInt(12, EmpleadosDAO.getEdad());
            ps.setString(13, EmpleadosDAO.getPaisNaci());
            ps.setString(14, EmpleadosDAO.getDepartamentoNaci());
            ps.setString(15, EmpleadosDAO.getMunicipioNaci());
            ps.setInt(16, EmpleadosDAO.getCodigoSexo());
            ps.setInt(17, EmpleadosDAO.getCodigoPoblacion());
            ps.setString(18, EmpleadosDAO.getPaisResidencia());
            ps.setString(19, EmpleadosDAO.getDepartamentoResi());
            ps.setString(20, EmpleadosDAO.getMunicipioResi());
            ps.setString(21, EmpleadosDAO.getBarrioResi());
            ps.setString(22, EmpleadosDAO.getDireccionResi());
            ps.setString(23, EmpleadosDAO.getTelefono());
            ps.setString(24, EmpleadosDAO.getCelular());
            ps.setInt(25, EmpleadosDAO.getWhatsApp());
            ps.setString(26, EmpleadosDAO.getEmail());
            ps.setDate(27, EmpleadosDAO.getFechaIngreso());
            ps.setDouble(28, EmpleadosDAO.getTipoSalario());
            ps.setInt(29, EmpleadosDAO.getTipoValor());
            ps.setDouble(30, EmpleadosDAO.getSueldo());
            ps.setInt(31, EmpleadosDAO.getTipoContrato());
            ps.setInt(32, EmpleadosDAO.getTipoVinculacion());
            ps.setInt(33, EmpleadosDAO.getTiempoMeses());
            ps.setInt(34, EmpleadosDAO.getTipoCargo());
            ps.setInt(35, EmpleadosDAO.getTipoTurno());
            ps.setBoolean(36, EmpleadosDAO.isHorarioGeneral());
            ps.setInt(37, EmpleadosDAO.getCodigoArea());
            ps.setInt(38, EmpleadosDAO.getTipoCosto());
            ps.setString(39, EmpleadosDAO.getCodigoSede());
            ps.setString(40, EmpleadosDAO.getCodigoPension());
            ps.setString(41, EmpleadosDAO.getCodigoEPS());
            ps.setString(42, EmpleadosDAO.getCodigoCesantias());
            ps.setString(43, EmpleadosDAO.getCodigoARL());
            ps.setString(44, EmpleadosDAO.getCodigoRiesgo());
            ps.setString(45, EmpleadosDAO.getCodigoCCF());
            ps.setString(46, EmpleadosDAO.getCodigoBanco());
            ps.setString(47, EmpleadosDAO.getTipoCuenta());
            ps.setString(48, EmpleadosDAO.getNumeroCuenta());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }


}

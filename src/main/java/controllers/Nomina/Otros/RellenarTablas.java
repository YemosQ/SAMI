package controllers.Nomina.Otros;

import conexion.Conexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.Nomina.DatosTablasDAO;
import java.sql.*;

public class RellenarTablas {
    Connection con=null;
    private PreparedStatement stm;
    private ResultSet rs;




    public ObservableList<DatosTablasDAO> empresa = FXCollections.observableArrayList();
    public ObservableList<DatosTablasDAO> sedes = FXCollections.observableArrayList();
    public ObservableList<DatosTablasDAO> datossedes = FXCollections.observableArrayList();
    public ObservableList<DatosTablasDAO> listaempresas() {
        try {
            empresa.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT Nit,DescEmp,DescEstGen FROM " +
                    "sami.tb_emp join sami.tb_estgen on sami.tb_emp.EstCodGen=sami.tb_estgen.CodGen");
            while (rs.next()) {
                empresa.add(new DatosTablasDAO(
                        rs.getString("Nit"),
                        rs.getString("DescEmp"),
                        rs.getString("DescEstGen")));
            }
        } catch (Exception ex) {
            System.out.println("Error al buscar las empresas" + ex);
        } finally {
            try {
                if (con != null) {
                    Conexion.conectar().close();
                };
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        //System.out.println(empresa);
        return empresa;
    }
    public ObservableList<DatosTablasDAO> listasedes() {
        try {
            sedes.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT sami.tb_sede.CodSede, sami.tb_emp.DescEmp, sami.tb_sede.NomSede, sami.tb_estgen.DescEstGen " +
                    "FROM sami.tb_sede " +
                    "join sami.tb_estgen on sami.tb_estgen.CodGen = sami.tb_sede.EstCodGen " +
                    "join sami.tb_emp on sami.tb_emp.CodEmp = sami.tb_sede.CodEmp");
            while (rs.next()) {
                sedes.add(new DatosTablasDAO(
                        rs.getString("CodSede"),
                        rs.getString("NomSede"),
                        rs.getString("DescEmp"),
                        rs.getString("DescEstGen")));
            }
        } catch (Exception ex) {
            System.out.println("Error al buscar las empresas" + ex);
        } finally {
            try {
                if (con != null) {
                    Conexion.conectar().close();
                };
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        //System.out.println(sedes);
        return sedes;
    }

    public ObservableList<DatosTablasDAO> datosedes(String codigosede) {
        try {
            datossedes.clear();
            System.out.println("Este es el codigo a buscar: "+codigosede);
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT sami.tb_sede.CodEmp, sami.tb_emp.DescEmp,sami.tb_emp.Nit as empNit," +
                    "sami.tb_emp.Dv as empDv, sami.tb_sede.CodSede, sami.tb_sede.NomSede, sami.tb_sede.Nit as sedeNit, sami.tb_sede.Dv as sedeDv, " +
                    "sami.tb_sede.idpaises, sami.tb_pais.NomPais, sami.tb_sede.CodDepto, sami.tb_depto.NomDepto, " +
                    "sami.tb_sede.CodMun, sami.tb_munic.NomMun, sami.tb_sede.Direc, sami.tb_sede.Telef,\n" +
                    "sami.tb_sede.CelCont, sami.tb_sede.CelWApp, sami.tb_sede.Lunes, sami.tb_sede.Martes, " +
                    "sami.tb_sede.Miercoles, sami.tb_sede.Jueves, sami.tb_sede.Viernes, sami.tb_sede.Sabado, " +
                    "sami.tb_sede.Domingo, sami.tb_sede.HrsLab, sami.tb_sede.HrIng, sami.tb_sede.HrEgr, " +
                    "sami.tb_sede.HrIniDs, sami.tb_sede.HrFinDs, sami.tb_sede.HrsLabEnfe, sami.tb_sede.HrsSemEnf," +
                    "sami.tb_sede.HrsMesEnf, sami.tb_sede.EstCodGen, sami.tb_estgen.DescEstGen " +
                    "FROM sami.tb_sede \n" +
                    "JOIN sami.tb_emp ON sami.tb_sede.CodEmp = sami.tb_emp.CodEmp\n" +
                    "JOIN sami.tb_pais ON sami.tb_sede.idpaises = sami.tb_pais.idpaises\n" +
                    "JOIN sami.tb_depto ON sami.tb_sede.CodDepto = sami.tb_depto.CodDepto\n" +
                    "JOIN sami.tb_munic ON concat(sami.tb_sede.CodDepto, sami.tb_sede.CodMun) = sami.tb_munic.CodMunDpto\n" +
                    "JOIN sami.tb_estgen ON sami.tb_sede.EstCodGen = sami.tb_estgen.CodGen\n" +
                    "WHERE sami.tb_sede.CodSede = '"+codigosede+"'");

            while (rs.next()) {
                //System.out.println("Entra al While");
                datossedes.add(new DatosTablasDAO(
                        rs.getString("CodEmp"),
                        rs.getString("DescEmp"),
                        rs.getString("empNit"),
                        rs.getString("empDv"),
                        rs.getString("CodSede"),
                        rs.getString("NomSede"),
                        rs.getString("sedeNit"),
                        rs.getString("sedeDv"),
                        rs.getString("idpaises"),
                        rs.getString("NomPais"),
                        rs.getString("CodDepto"),
                        rs.getString("NomDepto"),
                        rs.getString("CodMun"),
                        rs.getString("NomMun"),
                        rs.getString("Direc"),
                        rs.getString("Telef"),
                        rs.getString("CelCont"),
                        rs.getString("CelWApp"),
                        rs.getInt("Lunes"),
                        rs.getInt("Martes"),
                        rs.getInt("Miercoles"),
                        rs.getInt("Jueves"),
                        rs.getInt("Viernes"),
                        rs.getInt("Sabado"),
                        rs.getInt("Domingo"),
                        rs.getInt("HrsLab"),
                        rs.getTime("HrIng"),
                        rs.getTime("HrEgr"),
                        rs.getTime("HrIniDs"),
                        rs.getTime("HrFinDs"),
                        rs.getInt("HrsLabEnfe"),
                        rs.getInt("HrsSemEnf"),
                        rs.getInt("HrsMesEnf"),
                        rs.getString("EstCodGen"),
                        rs.getString("DescEstGen")));
            }
        } catch (Exception ex) {
            System.out.println("Error al buscar las empresas: " + ex);
        } finally {
            try {
                if (con != null) {
                    Conexion.conectar().close();
                };
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(datossedes);
        return datossedes;
    }


}

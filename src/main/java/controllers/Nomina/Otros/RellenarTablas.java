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
            ResultSet rs = stm.executeQuery("SELECT sami.tb_sede.CodEmp, sami.tb_sede.NomSede, sami.tb_sede.Nit FROM sami.tb_sede where CodSede = '"+codigosede+"'");

            while (rs.next()) {
                //System.out.println("Entra al While");
                datossedes.add(new DatosTablasDAO(
                        rs.getString("CodEmp"),
                        rs.getString("NomSede"),
                        rs.getString("Nit")));
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

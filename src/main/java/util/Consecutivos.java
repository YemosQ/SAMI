package util;

import conexion.Conexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consecutivos {
    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public int ConsecutivoEst() {
        int dato = 0;
        try {
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT MAX(CodGen) FROM tb_estgen");
            if (rs.next()) {
                dato = (rs.getInt(1)) + 1;
            }
        } catch (Exception ex) {throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        return dato;
    }

    public int ConsecutivoSex() {
        int dato = 0;
        try {
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT MAX(CodSex) FROM tb_sexo");
            if (rs.next()) {
                dato = (rs.getInt(1)) + 1;}
        } catch (Exception ex) {throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        return dato;
    }
    public int ConsecutivoPob() {
        int dato = 0;
        try {
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT MAX(CodPob) FROM tb_pobla");
            if (rs.next()) {dato = (rs.getInt(1)) + 1;}
        } catch (Exception ex) {throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        return dato;
    }
}

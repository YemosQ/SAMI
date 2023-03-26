package util;

import conexion.Conexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*Clase para traer el numero o codigo de los estados, sexo o población que sea seleccionado
Esto permite que se elija el nombre del combobox pero que se envíe a la tabla el codigo
* */
public class IndexEstado {
    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public int indexEst(String itemseleccionado) {
        int dato = 0;
        try {
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT CodGen FROM tb_estgen where DescEstGen= '"+itemseleccionado+"'");
            if (rs.next()) {dato = rs.getInt(1);}
        } catch (Exception ex) {throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        //JOptionPane.showMessageDialog(null,"Retornando:"+ dato);
        return dato;
    }

    public String textoEstado(int index){
        //JOptionPane.showMessageDialog(null,"Entrando a Index.textoEstado recibiendo el valor: " + index);
        String dato = null;
        try {
            //JOptionPane.showMessageDialog(null,"Entrando al Try de Index");
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT DescEstGen FROM tb_estgen where CodGen= "+index);
            //JOptionPane.showMessageDialog(null,"Conexion creada");
            if (rs.next()) {
                dato = (
                        rs.getString(1));}
            //JOptionPane.showMessageDialog(null, "El valor de dato es: "+dato);
        } catch (Exception ex) {
            throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        //JOptionPane.showMessageDialog(null, "Retornando el valor de dato: "+dato);
        return dato;
    }

    public String idPais(String nompais) {
        String dato = null;
        try {
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT idpaises FROM tb_pais where NomPais= '"+nompais+"'");
            if (rs.next()) {dato = rs.getString(1);}
        } catch (Exception ex) {throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        //JOptionPane.showMessageDialog(null,"Retornando:"+ dato);
        return dato;
    }

    public String iddepto(String nomdepto){
        String dato = null;
        try {
            //JOptionPane.showMessageDialog(null,"Entrando al Try de Index");
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT CodDepto FROM tb_depto where NomDepto= '"+nomdepto+"'");
            //JOptionPane.showMessageDialog(null,"Conexion creada");
            if (rs.next()) {
                dato = (
                        rs.getString(1));}
            //JOptionPane.showMessageDialog(null, "El valor de dato es: "+dato);
        } catch (Exception ex) {
            throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        return dato;
    }

    public String idmunic(String nommunic) {
        String dato = null;
        try {
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT CodMun FROM tb_munic where NomMun= '"+nommunic+"'");
            if (rs.next()) {dato = rs.getString(1);}
        } catch (Exception ex) {throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        //JOptionPane.showMessageDialog(null,"Retornando:"+ dato);
        return dato;
    }
    public String nombarrio(String iddepto, String idmunic){
        String dato = null;
        try {
            //JOptionPane.showMessageDialog(null,"Entrando al Try de Index");
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT NomBarrio FROM tb_barrio where CodDepto= '"+iddepto+"' and CodMun = '"+
                    idmunic+"' ORDER BY NomBarrio");
            //JOptionPane.showMessageDialog(null,"Conexion creada");
            if (rs.next()) {
                dato = (
                        rs.getString(1));}
            //JOptionPane.showMessageDialog(null, "El valor de dato es: "+dato);
        } catch (Exception ex) {
            throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
        return dato;
    }

}

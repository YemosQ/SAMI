package util;

import conexion.Conexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class CodigosId {
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    private int counter = 1;
    private String prefix;
    private String letras;
    private int longitud;
    private int numeroActual;

        public CodigosId(String string) {
            this.prefix = prefix;
        }
    public CodigosId() {
        this.prefix = prefix;
    }



    public String Codigos() {
        String dato = null;
        try {
            //JOptionPane.showMessageDialog(null,"Entrando al Try de Index");
            Conexion conexion = new Conexion();
            con = conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT MAX(CodEmp) FROM sami.tb_emp");
            //JOptionPane.showMessageDialog(null,"Conexion creada");
            if (rs.next()) {
                dato = (
                        rs.getString(1));}
            if (dato == null || dato.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sin datos en la tabla" +
                        ": "+dato);
            }
        } catch (Exception ex) {
            throw new RuntimeException();
        } finally {
            try {if (con != null) {Conexion.conectar().close();}
            } catch (SQLException e) {throw new RuntimeException();}
        }
            return dato;
    }
    public CodigosId(String letras, int longitud, int numeroInicial) {
        this.letras = letras;
        this.longitud = longitud;
        this.numeroActual = numeroInicial;
    }
    public String generarCodigo() {
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();
        int letrasLength = letras.length();
        codigo.append(letras);
        codigo.append(String.format("%02d", numeroActual));
        numeroActual++;
        return codigo.toString();
    }


}

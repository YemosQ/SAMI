package util;

import conexion.Conexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CodigosId {
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    private int counter = 1;
    private String prefix;

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
}

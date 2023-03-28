package controllers.Nomina.Otros;

import conexion.Conexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.Nomina.CodigosDAO;
import java.sql.*;

public class CargarCodigos {

    Connection con=null;
    private PreparedStatement stm;
    private ResultSet rs;



    public ObservableList<CodigosDAO> codigoempresas = FXCollections.observableArrayList();
    public ObservableList<CodigosDAO> codigosedes = FXCollections.observableArrayList();

    public ObservableList<CodigosDAO> codigosempresas() {
        try {
            codigoempresas.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT CodEmp, DescEmp, Nit, Dv FROM sami.tb_emp");
            while (rs.next()) {
                codigoempresas.add(new CodigosDAO(
                        rs.getString("CodEmp"),
                        rs.getString("DescEmp"),
                        rs.getString("Nit"),
                        rs.getString("Dv")));
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
        System.out.println("Informacion empresas: "+ codigoempresas);
        return codigoempresas;
    }


}

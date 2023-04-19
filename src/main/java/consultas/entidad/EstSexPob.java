package consultas.entidad;

import conexion.Conexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.Nomina.UbicacionesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EstSexPob {

    public ObservableList<UbicacionesDAO> sexo= FXCollections.observableArrayList();
    public ObservableList<UbicacionesDAO> poblacion= FXCollections.observableArrayList();
    public ObservableList<UbicacionesDAO> estados= FXCollections.observableArrayList();
    Connection con=null;

    public ObservableList<UbicacionesDAO> listaSexo() {
        //System.out.println("Sex3");
        try {
            sexo.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT CodSex,DescSex,EstCodGen FROM sami.tb_sexo;");
            //System.out.println("Sex33");
            while (rs.next()){
                //System.out.println("Sex4");
                sexo.add(new UbicacionesDAO(
                        rs.getString("CodSex"),
                        rs.getString("DescSex"),
                        rs.getString("EstCodGen")));
            }
            //System.out.println("Lista Sexo: "+sexo);
        }catch (Exception ex){
        }finally{
            try {
                if(con!=null){
                    Conexion.conectar().close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        //System.out.println(sexo);
        return sexo;
    }

    public ObservableList<UbicacionesDAO> listaPobla() {
        try {
            poblacion.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM sami.tb_pobla");
            while (rs.next()){
                poblacion.add(new UbicacionesDAO(
                        rs.getString("CodPob"),
                        rs.getString("DescPob"),
                        rs.getString("EstCodGen")));
            }
        }catch (Exception ex){
        }finally{
            try {
                if(con!=null){
                    Conexion.conectar().close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return poblacion;
    }

    public ObservableList<UbicacionesDAO> listaEstados() {
        try {
            estados.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM sami.tb_estgen");
            while (rs.next()){
                estados.add(new UbicacionesDAO(
                        rs.getInt("CodGen"),
                        rs.getString("DescEstGen")));
            }
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }finally{
            try {
                if(con!=null){
                    Conexion.conectar().close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return estados;
    }

}

package conexion;



import javax.swing.*;
import java.sql.*;


public class QueryConsulta {


    public ResultSet realizarConsulta(String query){
        //Se llama la conexion
        Conexion conexion = new Conexion();
        Connection conn = conexion.conectar();
        //Se guarda el query llamado
        ResultSet rs = null;
        Statement stQuery;
        try {
            stQuery = conn.createStatement();
            rs = stQuery.executeQuery(query);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,""+ex);
        }
        return rs;
    }

    public boolean ejecutarQuery(String query, String mensaje){
        //Se llama la conexion
        Conexion conexion = new Conexion();
        Connection conn = conexion.conectar();
        boolean exito =false;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            int registros=ps.executeUpdate();
            if (registros!=0)
                exito=true;
            else exito=false;
            JOptionPane.showMessageDialog(null,"Se realiza proceso de "+mensaje+
                    " con ÉXITO en "+registros+" registro");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,""+ex);
        }
        return exito;
    }




}

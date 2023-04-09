package consultas.CRUD;

import conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultasSedes {
    Conexion conexion = new Conexion();
    Connection con = null;

        public void eliminarSede(int idSede) throws SQLException {


            try {
                con = conexion.conectar();

                String sql = "DELETE FROM sami.tb_sede WHERE id = ?";
                PreparedStatement declaracion = con.prepareStatement(sql);
                declaracion.setInt(1, idSede);

                int filasEliminadas = declaracion.executeUpdate();

                if (filasEliminadas > 0) {
                    System.out.println("El registro ha sido eliminado correctamente.");
                } else {
                    System.out.println("No se ha eliminado ningún registro.");
                }

            } catch (SQLException ex) {
                System.out.println("Ha ocurrido un error al intentar eliminar el registro: " + ex.getMessage());
            } finally {
                if (con != null) {
                    con.close();
                }
            }
        }

}

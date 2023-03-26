package conexion;

import javafx.scene.control.Alert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private static final String user="yemosq";
    private static final String pass="YemosQ03051992";
    private static final String servidor="localhost";
    private static final String puerto="3306";
    private static final String nombreBD="sami";
    private static final String url="jdbc:mysql://"+servidor+":"+puerto+"/"+nombreBD+"?serverTimezone=UTC";
    private static final String driver="com.mysql.cj.jdbc.Driver";


    static {
        try {
            Class.forName(driver);
        }catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Error al cargar el controlador "+ex);
            alert.showAndWait();
        }
    }
    public static Connection conectar() {
        try {
            Connection conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión correcta");
            return conexion;
        } catch (SQLException ex) {
            System.out.println("Error de conexión");
        }
        return null;
    }

    public void close() throws SQLException {
        Connection con = (Connection) new Conexion();
        con.close();
    }

}

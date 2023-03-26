package controllers.Login;

import com.sam.main.Principal;
import conexion.Conexion;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.MoverPanel;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;


public class LoginC implements Initializable, MoverPanel.DraggedScene {
    @FXML private TextField user;
    @FXML private TextField pass;
    @FXML private Button btn_Cerrar;
    @FXML private Button btn_Login;
    @FXML private AnchorPane panelLogin;
    @FXML private Label label_conexion;
    //public String usuario = null;

    private Connection conexion;
    private PreparedStatement stm;
    private ResultSet rs;
    private static String  usuario;


    @FXML
    public void login(){
        String sql="SELECT * FROM tb_user WHERE user=? and pass=?";
        conexion= Conexion.conectar();
        try {
            stm=conexion.prepareStatement(sql);
            stm.setString(1,user.getText());//user es el nombre del txt que tendrá el usuario en la ventana login
            stm.setString(2,pass.getText());//pass es el nombre del txt que tendrá la contraseña en la ventana login
            rs=stm.executeQuery();
            //Alert alert;
            if (user.getText().isEmpty() || pass.getText().isEmpty()){
                label_conexion.setStyle("" +
                        "-fx-text-fill:red; " +
                        "-fx-background-color:linear-gradient(to top right, #008b8b, #007e99, #006fa7 0%, " +
                        "#0086e9, #00b1fb, #00d9ff, #00ffff);" +
                        "-fx-border-color:blue;");
                label_conexion.setText("Diligenciar usuario y Contraseña\n por favor!!!");
                user.setText("");
                pass.setText("");
            } else {
                if (rs.next()) {
                    //Si usuario y contraseña son correctos aquí va el código
                    //Se abre la ventana que se decida
                    try {
                        label_conexion.setDisable(true);
                        label_conexion.setText("");
                        label_conexion.setDisable(false);
                        label_conexion.setStyle("" +
                                "-fx-text-fill:#fff; " +
                                "-fx-background-color:linear-gradient(to top right,#82a196,#d9ebe4,#28e194,#eb5e54);" +
                                "-fx-border-color:#05a45f;");
                        label_conexion.setText("Validación Correcta\n Bienvenid@!!!");
                        //DatoUser.nombreusuario=user.getText();
                        usuario=user.getText();
                        //JOptionPane.showMessageDialog(null,"Valor de usuario: "+usuario);
                        FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Nomina/IniNomina.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        Stage stage = new Stage();
                        scene.setFill(Color.TRANSPARENT);
                        stage.setScene(scene);
                        stage.initStyle(StageStyle.TRANSPARENT);
                        stage.show();
                        user.setText("");
                        pass.setText("");
                        btn_Login.getScene().getWindow().hide(); //Para cerrar la ventana anterior
                    } catch (Exception ex) {
                        System.out.println("Error: "+ex);
                        label_conexion.setDisable(true);
                        label_conexion.setText("");
                        label_conexion.setDisable(false);
                        label_conexion.setStyle("" +
                                "-fx-text-fill:#fff; " +
                                "-fx-background-color:linear-gradient(to top right,#82a196,#d9ebe4,#28e194,#eb5e54);" +
                                "-fx-border-color:#05a45f;");
                        label_conexion.setText("Datos errados.\n valide por favor!!!");
                        user.setText("");
                        pass.setText("");
                        System.out.println("El error es: "+ex);
                    }
                }else {
                    //Si usuario y contraseña son incorrectos aquí va el código
                    label_conexion.setText("");
                    label_conexion.setDisable(false);
                    label_conexion.setStyle("" +
                            "-fx-text-fill:#fff; " +
                            "-fx-background-color:linear-gradient(to top right,#82a196,#d9ebe4,#28e194,#eb5e54);" +
                            "-fx-border-color:#05a45f;");
                    label_conexion.setText("Datos errados en Usuario o Contraseña.\n Por favor valide!!!");
                    user.setText("");
                    pass.setText("");
                }
            }
        }catch (Exception ex){ex.printStackTrace();}
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       this.onDraggedScene(this.panelLogin);
       label_conexion.setDisable(true);
       user.requestFocus();

    }
    public String getUsuario(){
        String nombreusuario = usuario;
        //JOptionPane.showMessageDialog(null,"Retornando el valor de usuario: "+nombreusuario);
        return nombreusuario;
    }



    public void close(){
        System.exit(0);
    }
}

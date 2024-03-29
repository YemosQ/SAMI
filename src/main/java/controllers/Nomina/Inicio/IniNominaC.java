package controllers.Nomina.Inicio;

/**
 * En esta se crea todo el manejo de la ventana de Inicio de Nomina. Es la parte princi&aacute;l desde donde se manejar&aacute; todo
 * el procedimiento de controlar la nomina.
 */

import com.sam.main.Principal;
import consultas.entidad.EstSexPob;
import consultas.entidad.PaisDeptoMuni;
import controllers.Login.LoginC;
import controllers.Login.Logout;
import controllers.Nomina.Otros.CargarCodigos;
import controllers.Nomina.Otros.RellenarTablas;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.StringConverter;
import modelo.Nomina.CodigosDAO;
import modelo.Nomina.DatosTablasDAO;
import modelo.Nomina.UbicacionesDAO;
import util.*;
import util.convertidores.ConverterStringCodEmp;
import util.convertidores.ConverterStringCodEmp2;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;


public class IniNominaC implements Initializable, MoverPanel.DraggedScene {


    public static String path;
    public static String elementodeevento;
    private static Object eleccion;
/**
 * En las siguientes lineas se establecen todas las variables
*/

    //TEXTFIELD
    @FXML private TextField ApeDos;
    @FXML private TextField ApeUno;
    @FXML private TextField CelDr;
    @FXML private TextField CoCenC;
    @FXML private TextField CodE;
    @FXML private TextField DTpVlr;
    @FXML private TextField DirDr;
    @FXML private TextField DocE;
    @FXML private TextField Email;
    @FXML private TextField NomARL;
    @FXML private TextField NomAre;
    @FXML private TextField NomBan;
    @FXML private TextField NomCCF;
    @FXML private TextField NomCCost;
    @FXML private TextField NomCar;
    @FXML private TextField NomCom;
    @FXML private TextField NomDos;
    @FXML private TextField NomFCes;
    @FXML private TextField NomFEPS;
    @FXML private TextField NomFPen;
    @FXML private TextField NomRArl;
    @FXML private TextField NomSed;
    @FXML private TextField NomTur;
    @FXML private TextField NomUno;
    @FXML private TextField NumCta;
    @FXML private TextField Sueldo;
    @FXML private TextField TDurC;
    @FXML private TextField TelDr;
    @FXML private TextField txt_Nit;
    @FXML private TextField txt_Cod_Emp;
    @FXML private TextField txt_CodCcosto;
    @FXML private TextField txt_CodClase;
    @FXML private TextField txt_CodSClase;
    @FXML private TextField txt_DescDoc;
    @FXML private TextField txt_DescEnt;
    @FXML private TextField txt_DescRegFis;
    @FXML private TextField txt_DescRespFis;
    @FXML private TextField txt_DescTpContri;
    @FXML private TextField txt_DescTpPerso;
    @FXML private TextField txt_Doc;
    @FXML private TextField txt_Dv;
    @FXML private TextField txt_EdadNa;
    @FXML private TextField txt_HDoc;
    @FXML private TextField txt_HTpContri;
    @FXML private TextField txt_HTpPerso;
    @FXML private TextField txt_HoEnt;
    @FXML private TextField txt_HoRegFis;
    @FXML private TextField txt_HoRespFis;
    @FXML private TextField txt_NomCCosto;
    @FXML private TextField txt_NomClase;
    @FXML private TextField txt_NomSClase;
    @FXML private TextField txt_NomTpCosto;
    @FXML private TextField txt_TpContri;
    @FXML private TextField txt_TpCosto;
    @FXML private TextField txt_TpEnt;
    @FXML private TextField txt_TpPerso;
    @FXML private TextField txt_TpRegFis;
    @FXML private TextField txt_NombreEmpresa;
    @FXML private TextField txt_UrlLogoSede;
    @FXML private TextField txt_UrlMAguaSede;
    @FXML private TextField txt_UrlFirmaRLSede;
    @FXML private TextField txt_BusqSede;
    @FXML private TextField txt_CantSede;
    @FXML private TextField txt_CelDr;
    @FXML private TextField txt_CelSede;
    @FXML private TextField txt_CoCenC;
    @FXML private TextField txt_CodConstSede;
    @FXML private TextField txt_CodSede;
    @FXML private TextField txt_DTpVlr;
    @FXML private TextField txt_DescSegSede;
    @FXML private TextField txt_DirDr;
    @FXML private TextField txt_DirSede;
    @FXML private TextField txt_Discapacidad;
    @FXML private TextField txt_DvEmpresa;
    @FXML private TextField txt_DvSede;
    @FXML private TextField txt_Email;
    @FXML private TextField txt_EmailSede;
    @FXML private TextField txt_FinDescaSede;
    @FXML private TextField txt_HoraEgrSede;
    @FXML private TextField txt_HoraIngSede;
    @FXML private TextField txt_HrsLabDEnfSede;
    @FXML private TextField txt_HrsLabMEnfSede;
    @FXML private TextField txt_HrsLabSede;
    @FXML private TextField txt_IniDescaSede;
    @FXML private TextField txt_NitEmpresa;
    @FXML private TextField txt_NitSede;
    @FXML private TextField txt_NomAre;
    @FXML private TextField txt_NomBan;
    @FXML private TextField txt_NomCCost;
    @FXML private TextField txt_NomCargo;
    @FXML private TextField txt_NomTur;
    @FXML private TextField txt_NombreRLSede;
    @FXML private TextField txt_NombreSede;
    @FXML private TextField txt_NumCta;
    @FXML private TextField txt_Sueldo;
    @FXML private TextField txt_TDurC;
    @FXML private TextField txt_TelDr;
    @FXML private TextField txt_TelSede;
    @FXML private TextField txt_TpSocSede;
    @FXML private TextField txt_TurnSegSede;
    @FXML private TextField txt_UbSede;
    @FXML private TextField txt_WpSede;
    @FXML private TextField txt_TpRespFis;
    //TEXTFIELD

    @FXML private CheckBox Hg;
    @FXML private CheckBox Wp;
    //CHECKBOX

    @FXML private Button btn_FirmaRLSede;
    @FXML private Button btn_ActualizarCc;
    @FXML private Button btn_ActualizarClase;
    @FXML private Button btn_ActualizarSClase;
    @FXML private Button btn_ActualizarTpCosto;
    @FXML private Button btn_AgregarCc;
    @FXML private Button btn_AgregarClase;
    @FXML private Button btn_AgregarSClase;
    @FXML private Button btn_AgregarTpCosto;
    @FXML private Button btn_Cerrar;
    @FXML private Button btn_minimizar;
    @FXML private Button btn_UrlLg;
    @FXML private Button btn_UrlMA;
    @FXML private Button btn_EliminarCc;
    @FXML private Button btn_EliminarClase;
    @FXML private Button btn_EliminarSClase; //BOTONES
    @FXML private Button btn_EliminarTpCosto;
    @FXML private Button btn_Logout;
    @FXML private Button btn_paises;//BOTONES
    @FXML private MenuItem btn_Documentacion_Actas;
    @FXML private MenuItem btn_Documentacion_CartaLaboral;
    @FXML private MenuItem btn_Documentacion_Contrato;
    @FXML private MenuItem btn_Empleados_Creacion;
    @FXML private MenuItem btn_Empleados_Sancion;
    @FXML private MenuItem btn_Enlace_NominaElectronica;
    @FXML private MenuItem btn_Enlaces_BD;
    @FXML private MenuItem btn_Enviar_Comunicado;
    @FXML private MenuItem btn_Enviar_Desprendible;
    @FXML private MenuItem btn_Enviar_Retefuente;
    @FXML private MenuItem btn_Externo;
    @FXML private MenuItem btn_Inicio_PanelConsulta;
    @FXML private MenuItem btn_Inicio_PanelCosto;
    @FXML private MenuItem btn_Inicio_PanelPrenomina;
    @FXML private MenuItem btn_Parametros_Conceptos;
    @FXML private MenuItem btn_Parametros_Costo;
    @FXML private MenuItem btn_Parametros_Empresa;
    @FXML private MenuItem btn_Parametros_Sede;
    @FXML private MenuItem btn_Parametros_Tercero;
    @FXML private MenuItem btn_Procesos_Calcular;
    @FXML private MenuItem btn_Reportes_Desprendible;

     //MENU ITEM
    @FXML private MenuItem btn_Reportes_Nomina;
    @FXML private MenuItem btn_Reportes_SegSocial;
    @FXML private Menu btn_inicioUno;
    @FXML private ComboBox<UbicacionesDAO> cbox_CBarDr;
    @FXML private ComboBox<UbicacionesDAO> cbox_BarEmpr;
    @FXML private ComboBox<UbicacionesDAO> cbox_CCiuDr;
    @FXML private ComboBox<UbicacionesDAO> cbox_CCiuNa;
    @FXML private ComboBox<UbicacionesDAO> cbox_CDepDr;
    @FXML private ComboBox<UbicacionesDAO> cbox_CDepNa;
    @FXML private ComboBox<UbicacionesDAO> cbox_CPaiNa;
    @FXML private ComboBox<UbicacionesDAO> cbox_CPobNa;
    @FXML private ComboBox<UbicacionesDAO> cbox_EstEmpr;
    @FXML private ComboBox<UbicacionesDAO> cbox_PaisEmpr;
    @FXML private ComboBox<UbicacionesDAO> cbox_DptoEmpr;
    @FXML private ComboBox<UbicacionesDAO> cbox_MunEmpr;
    @FXML private ComboBox<UbicacionesDAO> cbox_PaisDr;
    @FXML private ComboBox<UbicacionesDAO> cbox_SexNa;
    @FXML private ComboBox<?> cbox_CoArea;
    @FXML private ComboBox<?> cbox_CoCarg;
    @FXML private ComboBox<?> cbox_CoCencost;
    @FXML private ComboBox<?> cbox_CoFCes;
    @FXML private ComboBox<?> cbox_CoFPen;
    @FXML private ComboBox<?> cbox_CoTurn;
    @FXML private ComboBox<?> cbox_CodARL;
    @FXML private ComboBox<?> cbox_CodBan;
    @FXML private ComboBox<?> cbox_CodCCF;
    @FXML private ComboBox<?> cbox_CodClase;
    @FXML private ComboBox<?> cbox_CodFEPS;
    @FXML private ComboBox<?> cbox_CodRArl;
    @FXML private ComboBox<?> cbox_CodSClaseAs;
    @FXML private ComboBox<?> cbox_EstCCosto;
    @FXML private ComboBox<?> cbox_EstClase;
    @FXML private ComboBox<?> cbox_EstDoc;
    @FXML private ComboBox<?> cbox_EstEnt;
    @FXML private ComboBox<?> cbox_EstRegFis;
    @FXML private ComboBox<?> cbox_EstRespFis;
    @FXML private ComboBox<?> cbox_EstSClase;
    @FXML private ComboBox<?> cbox_EstTpContri;
    @FXML private ComboBox<?> cbox_EstTpCosto;
    @FXML private ComboBox<?> cbox_EstTpPerso;
    @FXML private ComboBox<CodigosDAO> cbox_CodEmp;
    @FXML private ComboBox<UbicacionesDAO> cbox_PaisSede;
    @FXML private ComboBox<UbicacionesDAO> cbox_DeptoSede;
    @FXML private ComboBox<UbicacionesDAO> cbox_MuniSede;
    @FXML private ComboBox<UbicacionesDAO> cbox_BarSede;
    @FXML private ComboBox<UbicacionesDAO> cbox_EstadoSede;
    @FXML private ComboBox<Puc> cbox_PucSede;

    @FXML private ComboBox<?> cbox_Sede;
    @FXML private ComboBox<?> cbox_TpCont;
    @FXML private ComboBox<?> cbox_TpCost;
    @FXML private ComboBox<?> cbox_TpCta;
    @FXML private ComboBox<?> cbox_TpSal;
    @FXML private ComboBox<?> cbox_TpVinc;
    @FXML private ComboBox<Moneda> cbox_MonSede;
    @FXML private ComboBox<DocumentoIdentidad> cbox_DocRLSede;
     //COMBO BOX
    @FXML private ComboBox<?> cbox_TpVlr;
    @FXML private ComboBox<?> cbox_anioCc;
    @FXML private TableColumn<?, ?> colCsc;
    @FXML private TableColumn<?, ?> colDoc;
    @FXML private TableColumn<?, ?> col_CodCc;
    @FXML private TableColumn<?, ?> col_CodClase;
    @FXML private TableColumn<?, ?> col_CodClaseAs;
    @FXML private TableColumn<?, ?> col_CodSClase;
    @FXML private TableColumn<?, ?> col_CodTpCosto;
    @FXML private TableColumn<?, ?> col_EstCc;
    @FXML private TableColumn<?, ?> col_EstClase;
    @FXML private TableColumn<?, ?> col_EstSClase;
    @FXML private TableColumn<?, ?> col_EstTpCosto;
    @FXML private TableColumn<?, ?> col_NomCc;
    @FXML private TableColumn<?, ?> col_NomClase;
    @FXML private TableColumn<?, ?> col_NomSClase;
     //COLUMNAS TABLEVIEW


//Imagenes
    @FXML private ImageView img_FirmaSede;
    @FXML private ImageView img_LogoSede;
    @FXML private ImageView img_MarcaASede;

    //Imgagenes
    @FXML private TableColumn<?, ?> col_NomTpCosto;
    @FXML private TableColumn<?, ?> col_SClaseAs;
    @FXML private TableColumn<?, ?> col_anioCc;
    @FXML private DatePicker date_FchIng;
    @FXML private DatePicker date_FchNac; //DATEPICKER
    @FXML private AnchorPane panel_Parametro_Tercero;
    @FXML private AnchorPane panel_Turnos;
    @FXML private AnchorPane panel_Empleados_Creacion;
    @FXML private AnchorPane panel_Parametro_Empresa;
    @FXML private AnchorPane panel_Parametro_Sede;
    @FXML private AnchorPane panel_Inicio_PanelCosto;
    @FXML private AnchorPane panel_Parametro_Costo;
    @FXML private AnchorPane panel_Parametro_Regimen;
    @FXML private AnchorPane panelcontenedor; //ANCHORPANE
    @FXML private TableView<?> tblEmpleados;
    @FXML private TableView<?> tbl_CCosto;
    @FXML private TableView<?> tbl_Clase;
    @FXML private TableView<?> tbl_Doc;
    @FXML private TableView<?> tbl_RespFis;
    @FXML private TableView<?> tbl_SubClase;
    @FXML private TableView<?> tbl_TpContri;
    @FXML private TableView<?> tbl_TpCosto;
    @FXML private TableView<?> tbl_TpEnt;
    @FXML private TableView<?> tbl_TpPerso;
    @FXML private TableView<DatosTablasDAO> tbl_Sedes;
    @FXML private TableView<DatosTablasDAO> tbl_Empresa;
    @FXML private TableColumn<DatosTablasDAO, String> col_EstEmpresa;
    @FXML private TableColumn<DatosTablasDAO, String> col_NitEmpresa;
    @FXML private TableColumn<DatosTablasDAO, String> col_NombreEmpresa;
    @FXML private TableColumn<DatosTablasDAO, String> col_NomEmpSede;
    @FXML private TableColumn<DatosTablasDAO, String> col_CodSede;
    @FXML private TableColumn<DatosTablasDAO, String> col_NomSede;
    @FXML private TableColumn<DatosTablasDAO, String> col_EstSede;
    @FXML private TableView<?> tbl_TpRegFis; //TABLEVIEW
    @FXML private Label label_user;
    private Image imagen;
    @FXML private ImageView img_Empleado;
    private String idevento;


    @Override public void initialize(URL url, ResourceBundle resourceBundle) {
        this.onDraggedScene(this.panelcontenedor);
        datouser();
        iniciopanel();
        listaSex();
        listaPob();
        CodigoT();
    }

    public void iniciopanel(){
        panel_Inicio_PanelCosto.setVisible(true);
        panel_Turnos.setVisible(false);
        panel_Empleados_Creacion.setVisible(false);
        panel_Parametro_Tercero.setVisible(false);
        panel_Parametro_Sede.setVisible(false);
        panel_Parametro_Empresa.setVisible(false);
    }

    @FXML public void logout(ActionEvent event){
        //Sirve para cerrar sesión y abrir nuevamente la ventana de iniciar sesión
        String cerrarsesion =new Logout().logout(event.getSource());
        panelcontenedor.getScene().getWindow().hide();
        JOptionPane.showMessageDialog(null,cerrarsesion);
    }
    @FXML public void cerrar_Clic(ActionEvent event){
        Stage myStage = (Stage) this.panelcontenedor.getScene().getWindow();
        myStage.close();
    }
    @FXML public void minimizar_Clic(ActionEvent event){
        Stage myStage = (Stage) this.panelcontenedor.getScene().getWindow();
        myStage.setIconified(true);
    }

    public void datouser(){
        //Sirve para obtener el valor del nombre del usuario
        String user=new LoginC().getUsuario();
        //JOptionPane.showMessageDialog(null,"Recibiendo usuario: "+user);
        label_user.setText(user);
    }
    public String getElementodeevento(){
        String idevento = elementodeevento;
        //JOptionPane.showMessageDialog(null,"Retornando el valor de usuario: "+nombreusuario);
        return idevento;
    }
    public void cargarimagen(ActionEvent event){
        //Image imagen=new ImportarImagen().importimagen();
        FileChooser open = new FileChooser();
        open.setTitle("Abrir Imagen");
        open.getExtensionFilters().add(new FileChooser.ExtensionFilter("Archivo de imagen", "*png","*jpg"));
        File archivo = open.showOpenDialog(panelcontenedor.getScene().getWindow());
        if (archivo !=null){
            IniNominaC.path=archivo.getAbsolutePath();
            imagen=new Image(archivo.toURI().toString(),148,148,false,true);
            img_Empleado.setImage(imagen);
        }
    }
    public void llamarPaises(KeyEvent event) throws IOException {

        ComboBox elementoevento= (ComboBox) event.getSource();
        elementodeevento=elementoevento.getId();
        //JOptionPane.showMessageDialog(null,"El valor de idevento presioado es: "+idevento);
        if (event.getCode()== KeyCode.F4 &&
                (event.getSource()==cbox_CPaiNa || event.getSource()==cbox_PaisDr ||
                        event.getSource()==cbox_CDepNa || event.getSource()==cbox_CDepDr ||
                        event.getSource()==cbox_CCiuNa || event.getSource()==cbox_CCiuDr ||
                        event.getSource()==cbox_CBarDr)){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        } else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_CDepNa) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_CCiuNa) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_SexNa) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_CPobNa) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_CBarDr) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_TpSal) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_TpVlr) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_TpCont) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }else if (event.getCode()== KeyCode.F4 && event.getSource()==cbox_TpVinc) {
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/EmergentesEstadosPaises.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }

    }
    public void llamarSede(KeyEvent event) {}
    public void llamarTerceros(KeyEvent event) {}
    public void llamarRiesgosARL(KeyEvent event) {}
    public Object getEleccion(){
        Object dato = eleccion;
        //JOptionPane.showMessageDialog(null,"Retornando el valor de usuario: "+dato);
        return dato;
    }
    public void llamarTpTurno(KeyEvent event) {}
    public void agregar(ActionEvent event) {}
    public void cambioventana(ActionEvent event){
        if (event.getSource()==btn_Inicio_PanelCosto){
            panel_Inicio_PanelCosto.setVisible(true);
            panel_Empleados_Creacion.setVisible(false);
            panel_Parametro_Tercero.setVisible(false);
            panel_Parametro_Sede.setVisible(false);
            panel_Parametro_Empresa.setVisible(false);
            panel_Turnos.setVisible(false);
        } else if (event.getSource()==btn_Empleados_Creacion) {
            panel_Inicio_PanelCosto.setVisible(false);
            panel_Empleados_Creacion.setVisible(true);
            panel_Parametro_Tercero.setVisible(false);
            panel_Parametro_Sede.setVisible(false);
            panel_Parametro_Empresa.setVisible(false);
            panel_Turnos.setVisible(false);
        }else if (event.getSource()==btn_Parametros_Empresa) {
            panel_Inicio_PanelCosto.setVisible(false);
            panel_Empleados_Creacion.setVisible(false);
            panel_Parametro_Tercero.setVisible(false);
            panel_Parametro_Sede.setVisible(false);
            panel_Parametro_Empresa.setVisible(true);
            cargarEmpresas();
            panel_Turnos.setVisible(false);
        }else if (event.getSource()==btn_Parametros_Sede) {
            panel_Inicio_PanelCosto.setVisible(false);
            panel_Empleados_Creacion.setVisible(false);
            panel_Parametro_Tercero.setVisible(false);
            panel_Parametro_Sede.setVisible(true);
            panel_Parametro_Empresa.setVisible(false);
            panel_Turnos.setVisible(false);
            cargarSedes();
        }else if (event.getSource()==btn_Parametros_Tercero) {
            panel_Inicio_PanelCosto.setVisible(false);
            panel_Empleados_Creacion.setVisible(false);
            panel_Parametro_Tercero.setVisible(true);
            panel_Parametro_Sede.setVisible(false);
            panel_Parametro_Empresa.setVisible(false);
            panel_Turnos.setVisible(false);
        }else if (event.getSource()==btn_Parametros_Costo) {
            panel_Inicio_PanelCosto.setVisible(false);
            panel_Empleados_Creacion.setVisible(false);
            panel_Parametro_Tercero.setVisible(false);
            panel_Parametro_Sede.setVisible(false);
            panel_Parametro_Empresa.setVisible(false);panel_Turnos.setVisible(false);
        }else if (event.getSource()==btn_Parametros_Conceptos) {
            panel_Inicio_PanelCosto.setVisible(false);
            panel_Empleados_Creacion.setVisible(false);
            panel_Parametro_Tercero.setVisible(false);
            panel_Parametro_Sede.setVisible(false);
            panel_Parametro_Empresa.setVisible(false);
            panel_Turnos.setVisible(false);
        }

    }
    public void listaSex() {
        //Crea una instancia para buscar la lista de los estados y mostrarlas en los ComboBox
        cbox_SexNa.getItems().clear();
        EstSexPob listaSex =  new  EstSexPob();
        //System.out.println("Sex1");
        Object list = listaSex.listaSexo();
        //System.out.println("Sex2: "+list);
        cbox_SexNa.getItems().addAll((Collection<? extends UbicacionesDAO>) list);
        cbox_SexNa.setConverter(new ConverterStringSexo());
    }
    public void listaPob() {
        //Crea una instancia para buscar la lista de los estados y mostrarlas en los ComboBox
        cbox_CPobNa.getItems().clear();
        EstSexPob listaPob =  new  EstSexPob();
        Object list = listaPob.listaPobla();
        cbox_CPobNa.getItems().addAll((Collection<? extends UbicacionesDAO>) list);
        cbox_CPobNa.setConverter(new ConverterStringEstados());
    }
    public void listaPais(MouseEvent event) {
        Object obj = event.getSource();
        if (obj instanceof ComboBox cboxPais) {
            System.out.println("Entro al primer if ");
            if (cboxPais.getId().equals("cbox_CPaiNa")){
                System.out.println("Entro al de Nacimiento");
                cbox_CCiuNa.getItems().clear();
                cbox_CDepNa.getItems().clear();
                PaisDeptoMuni listaPais =  new PaisDeptoMuni();
                List<UbicacionesDAO> paises = listaPais.listaPaises();
                cbox_CPaiNa.getItems().addAll(paises);
                cbox_CPaiNa.setConverter(new ConverterStringUbicaciones());
            }else if(cboxPais.getId().equals("cbox_PaisDr")) {
                System.out.println("Entro al de Direccion");
                cbox_CCiuDr.getItems().clear();
                cbox_CDepDr.getItems().clear();
                PaisDeptoMuni listaPais = new PaisDeptoMuni();
                List<UbicacionesDAO> paises = listaPais.listaPaises();
                cbox_PaisDr.getItems().addAll(paises);
                cbox_PaisDr.setConverter(new ConverterStringUbicaciones());
            }else if (cboxPais.getId().equals("cbox_PaisEmpr")){
                System.out.println("Entro al de Empresa");
                cbox_CCiuDr.getItems().clear();
                cbox_CDepDr.getItems().clear();
                PaisDeptoMuni listaPais = new PaisDeptoMuni();
                List<UbicacionesDAO> paises = listaPais.listaPaises();
                cbox_PaisEmpr.getItems().addAll(paises);
                cbox_PaisEmpr.setConverter(new ConverterStringUbicaciones());
            }else if (cboxPais.getId().equals("cbox_PaisSede")){
                System.out.println("Entro al de Sede");
                cbox_DeptoSede.getItems().clear();
                cbox_MuniSede.getItems().clear();
                PaisDeptoMuni listaPais = new PaisDeptoMuni();
                List<UbicacionesDAO> paises = listaPais.listaPaises();
                cbox_PaisSede.getItems().addAll(paises);
                cbox_PaisSede.setConverter(new ConverterStringUbicaciones());
            }

        }
    }
    @FXML void CargarDepto(MouseEvent event) {
        Object obj = event.getSource();
        if (obj instanceof ComboBox cboxDepto) {
            System.out.println("Entro al primer if ");
            if (cboxDepto.getId().equals("cbox_CDepNa")) {
                System.out.println("Entro al de Nacimiento");
                if (cbox_CPaiNa.getValue() != null) {
                    String idpais = cbox_CPaiNa.getValue().getIdpais();
                    cbox_CDepNa.getItems().clear();
                    cbox_CCiuNa.getItems().clear();
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    List<UbicacionesDAO> DeptoDep = nombre.listaDeptosDep(idpais);
                    System.out.println("Volviendo");
                    cbox_CDepNa.getItems().addAll(DeptoDep);
                    cbox_CDepNa.setConverter(new ConverterStringUbicaciones());
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El pais esta vacio");
                    alert.showAndWait();
                }
            } else if (cboxDepto.getId().equals("cbox_CDepDr")) {
                System.out.println("Entro al de la Direccion");
                if (cbox_PaisDr.getValue() != null) {
                    String idpais = cbox_PaisDr.getValue().getIdpais();
                    cbox_CCiuDr.getItems().clear();
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    List<UbicacionesDAO> DeptoDep = nombre.listaDeptosDep(idpais);
                    cbox_CDepDr.getItems().addAll(DeptoDep);
                    cbox_CDepDr.setConverter(new ConverterStringDepto());
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El pais esta vacio");
                    alert.showAndWait();
                }
            } else if (cboxDepto.getId().equals("cbox_DptoEmpr")) {
                System.out.println("Entro al de la Empresa");
                if (cbox_PaisEmpr.getValue() != null) {
                    String idpais = cbox_PaisEmpr.getValue().getIdpais();
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    List<UbicacionesDAO> DeptoDep = nombre.listaDeptosDep(idpais);
                    cbox_DptoEmpr.getItems().addAll(DeptoDep);
                    cbox_DptoEmpr.setConverter(new ConverterStringUbicaciones());
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El pais esta vacio");
                    alert.showAndWait();
                }
            } else if (cboxDepto.getId().equals("cbox_DeptoSede")) {
                System.out.println("Entro al de la Sede");
                if (cbox_PaisSede.getValue() != null) {
                    String idpais = cbox_PaisSede.getValue().getIdpais();
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    List<UbicacionesDAO> DeptoDep = nombre.listaDeptosDep(idpais);
                    cbox_DeptoSede.getItems().addAll(DeptoDep);
                    cbox_DeptoSede.setConverter(new ConverterStringUbicaciones());
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El pais esta vacio");
                    alert.showAndWait();
                }
            }
        }
    }
    @FXML void CargarCiudad(MouseEvent event) throws IOException {
        Object obj = event.getSource();
        if (obj instanceof ComboBox cboxCiudad) {
            System.out.println("Entro al primer if ");
            System.out.println(cboxCiudad.getId());
            if (cboxCiudad.getId().equals("cbox_CCiuNa")) {
                System.out.println("Entro al de Nacimiento");
                if (cbox_CDepNa.getValue() != null) {
                    cbox_CCiuNa.getItems().clear();
                    String depto = cbox_CDepNa.getValue().getNombredepto();
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> Dato = nombre.nomDepto(depto);
                    String idDepto = Dato.stream().map(UbicacionesDAO::getIddepto).findFirst().orElse(null);
                    System.out.println(idDepto);
                    PaisDeptoMuni listamunicipio = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> listamunic = listamunicipio.listaMuniDep(idDepto);
                    cbox_CCiuNa.getItems().addAll(listamunic);
                    cbox_CCiuNa.setConverter(new ConverterStringUbicaciones());
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El pais esta vacio");
                    alert.showAndWait();
                }

            } else if (cboxCiudad.getId().equals("cbox_CCiuDr")) {
                if (cbox_CDepDr.getValue() != null) {
                    cbox_CBarDr.getItems().clear();
                    cbox_CCiuDr.getItems().clear();
                    String depto = cbox_CDepDr.getValue().getNombredepto();
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> Dato = nombre.nomDepto(depto);
                    String idDepto = Dato.stream().map(UbicacionesDAO::getIddepto).findFirst().orElse(null);
                    System.out.println(idDepto);
                    PaisDeptoMuni listamunicipio = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> listamunic = listamunicipio.listaMuniDep(idDepto);
                    cbox_CCiuDr.getItems().addAll(listamunic);
                    cbox_CCiuDr.setConverter(new ConverterStringUbicaciones());
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El pais esta vacio");
                    alert.showAndWait();
                }

            } else if (cboxCiudad.getId().equals("cbox_MunEmpr")){
                if (cbox_DptoEmpr.getValue() != null){
                    cbox_MunEmpr.getItems().clear();
                    cbox_BarEmpr.getItems().clear();
                    String depto = cbox_DptoEmpr.getValue().getNombredepto();
                    System.out.println("Valor depto "+depto);
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    System.out.println("Valor nombre "+nombre);
                    ObservableList<UbicacionesDAO> Dato = nombre.nomDepto(depto);
                    String idDepto = Dato.stream().map(UbicacionesDAO::getIddepto).findFirst().orElse(null);
                    System.out.println("Valor iddepto: "+ idDepto);
                    PaisDeptoMuni listamunicipio = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> listamunic = listamunicipio.listaMuniDep(idDepto);
                    System.out.println("Vuelve con datos");
                    cbox_MunEmpr.getItems().addAll(listamunic);
                    cbox_MunEmpr.setConverter(new ConverterStringUbicaciones());
                }else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El pais esta vacio");
                    alert.showAndWait();
                }
            }else if (cboxCiudad.getId().equals("cbox_MuniSede")) {
                if (cbox_DeptoSede.getValue() != null) {
                    cbox_MuniSede.getItems().clear();
                    cbox_BarSede.getItems().clear();
                    String depto = cbox_DeptoSede.getValue().getNombredepto();
                    System.out.println("Valor depto " + depto);
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    System.out.println("Valor nombre " + nombre);
                    ObservableList<UbicacionesDAO> Dato = nombre.nomDepto(depto);
                    String idDepto = Dato.stream().map(UbicacionesDAO::getIddepto).findFirst().orElse(null);
                    System.out.println("Valor iddepto: " + idDepto);
                    PaisDeptoMuni listamunicipio = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> listamunic = listamunicipio.listaMuniDep(idDepto);
                    System.out.println("Vuelve con datos");
                    cbox_MuniSede.getItems().addAll(listamunic);
                    cbox_MuniSede.setConverter(new ConverterStringUbicaciones());
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El pais esta vacio");
                    alert.showAndWait();
                }
            }
        }
    }
    @FXML void CargarBarrio(MouseEvent event) {
        Object obj = event.getSource();
        if (obj instanceof ComboBox cboxBarrio) {
            System.out.println("Entro al primer if ");
            System.out.println(cboxBarrio.getId());
            if (cboxBarrio.getId().equals("cbox_CBarDr")) {
                System.out.println("Entro al de Nacimiento");
                if (cbox_CCiuDr.getValue() != null) {
                    cbox_CBarDr.getItems().clear();
                    String iddepto = String.valueOf(cbox_CDepDr.getSelectionModel().getSelectedItem().getNombredepto());
                    String idmunic = String.valueOf(cbox_CCiuDr.getSelectionModel().getSelectedItem().getNombremunicipio());
                    System.out.println("A buscar munic: " + iddepto);
                    System.out.println("A buscar munic: " + idmunic);
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> Dato0 = nombre.nomDepto(iddepto);
                    // Verificar si Dato0 no está vacía
                    String idDepto = null;
                    if (!Dato0.isEmpty()) {
                        Optional<UbicacionesDAO> firstDepto = Dato0.stream().findFirst();
                        // Verificar si el objeto retornado no es nulo
                        if (firstDepto.isPresent()) {
                            idDepto = firstDepto.get().getIddepto();
                            System.out.println("Convertido depto: " + idDepto);
                        } else {
                            System.out.println("No se encontró el id del departamento");
                        }
                    } else {
                        System.out.println("La lista Dato0 está vacía");
                    }
                    ObservableList<UbicacionesDAO> Dato1 = nombre.nomMuni(idmunic);
                    // Verificar si Dato1 no está vacía
                    String idMunic = null;
                    if (!Dato1.isEmpty()) {
                        Optional<UbicacionesDAO> firstMunic = Dato1.stream().findFirst();
                        // Verificar si el objeto retornado no es nulo
                        if (firstMunic.isPresent()) {
                            idMunic = firstMunic.get().getIdmunicipio();
                            System.out.println("Convertido munic: " + idMunic);
                        } else {
                            System.out.println("No se encontró el id del municipio");
                        }
                    } else {
                        System.out.println("La lista Dato1 está vacía");
                    }
                    ObservableList<UbicacionesDAO> Dato2 = nombre.listaBarriosDep(idDepto, idMunic);
                    cbox_CBarDr.getItems().addAll(Dato2);
                    cbox_CBarDr.setConverter(new ConverterStringBarrio());
                }else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Municipio");
                    alert.setContentText("El Municipio esta vacio");
                    alert.showAndWait();
                }
            } else if (cboxBarrio.getId().equals("cbox_BarEmpr")) {
                if (cbox_MunEmpr.getValue() != null) {
                    cbox_BarEmpr.getItems().clear();
                    String iddepto = String.valueOf(cbox_DptoEmpr.getSelectionModel().getSelectedItem().getNombredepto());
                    String idmunic = String.valueOf(cbox_MunEmpr.getSelectionModel().getSelectedItem().getNombremunicipio());
                    System.out.println("Clic en Cbox_BarEmpr");
                    System.out.println("A buscar munic: " + iddepto);
                    System.out.println("A buscar munic: " + idmunic);
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> Dato0 = nombre.nomDepto(iddepto);
                    // Verificar si Dato0 no está vacía
                    String idDepto = null;
                    if (!Dato0.isEmpty()) {
                        Optional<UbicacionesDAO> firstDepto = Dato0.stream().findFirst();
                        // Verificar si el objeto retornado no es nulo
                        if (firstDepto.isPresent()) {
                            idDepto = firstDepto.get().getIddepto();
                            System.out.println("Convertido depto: " + idDepto);
                        } else {
                            System.out.println("No se encontró el id del departamento");
                        }
                    } else {
                        System.out.println("La lista Dato0 está vacía");
                    }
                    ObservableList<UbicacionesDAO> Dato1 = nombre.nomMuni(idmunic);
                    // Verificar si Dato1 no está vacía
                    String idMunic = null;
                    if (!Dato1.isEmpty()) {
                        Optional<UbicacionesDAO> firstMunic = Dato1.stream().findFirst();
                        // Verificar si el objeto retornado no es nulo
                        if (firstMunic.isPresent()) {
                            idMunic = firstMunic.get().getIdmunicipio();
                            System.out.println("Convertido munic: " + idMunic);
                        } else {
                            System.out.println("No se encontró el id del municipio");
                        }
                    } else {
                        System.out.println("La lista Dato1 está vacía");
                    }
                    ObservableList<UbicacionesDAO> Dato2 = nombre.listaBarriosDep(idDepto, idMunic);
                    System.out.println("Llego hasta aqui 1");
                    cbox_BarEmpr.getItems().addAll(Dato2);
                    cbox_BarEmpr.setConverter(new ConverterStringBarrio());
                }else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El Municipio para la esta vacio");
                    alert.showAndWait();
                }
            }else if (cboxBarrio.getId().equals("cbox_BarSede")) {
                if (cbox_MuniSede.getValue() != null) {
                    cbox_BarSede.getItems().clear();
                    String iddepto = String.valueOf(cbox_DeptoSede.getSelectionModel().getSelectedItem().getNombredepto());
                    String idmunic = String.valueOf(cbox_MuniSede.getSelectionModel().getSelectedItem().getNombremunicipio());
                    System.out.println("Clic en Cbox_BarEmpr");
                    System.out.println("A buscar munic: " + iddepto);
                    System.out.println("A buscar munic: " + idmunic);
                    PaisDeptoMuni nombre = new PaisDeptoMuni();
                    ObservableList<UbicacionesDAO> Dato0 = nombre.nomDepto(iddepto);
                    // Verificar si Dato0 no está vacía
                    String idDepto = null;
                    if (!Dato0.isEmpty()) {
                        Optional<UbicacionesDAO> firstDepto = Dato0.stream().findFirst();
                        // Verificar si el objeto retornado no es nulo
                        if (firstDepto.isPresent()) {
                            idDepto = firstDepto.get().getIddepto();
                            System.out.println("Convertido depto: " + idDepto);
                        } else {
                            System.out.println("No se encontró el id del departamento");
                        }
                    } else {
                        System.out.println("La lista Dato0 está vacía");
                    }
                    ObservableList<UbicacionesDAO> Dato1 = nombre.nomMuni(idmunic);
                    // Verificar si Dato1 no está vacía
                    String idMunic = null;
                    if (!Dato1.isEmpty()) {
                        Optional<UbicacionesDAO> firstMunic = Dato1.stream().findFirst();
                        // Verificar si el objeto retornado no es nulo
                        if (firstMunic.isPresent()) {
                            idMunic = firstMunic.get().getIdmunicipio();
                            System.out.println("Convertido munic: " + idMunic);
                        } else {
                            System.out.println("No se encontró el id del municipio");
                        }
                    } else {
                        System.out.println("La lista Dato1 está vacía");
                    }
                    ObservableList<UbicacionesDAO> Dato2 = nombre.listaBarriosDep(idDepto, idMunic);
                    System.out.println("Llego hasta aqui 1");
                    cbox_BarSede.getItems().addAll(Dato2);
                    cbox_BarSede.setConverter(new ConverterStringBarrio());
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Seleccione el Pais");
                    alert.setHeaderText("Alerta Pais");
                    alert.setContentText("El Municipio para la esta vacio");
                    alert.showAndWait();
                }
            }
        }

    }
    public void abrirSGSSS(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/VinculacionesSGSSS.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initModality(Modality.APPLICATION_MODAL);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }
    public void abrirTurnoH(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Nomina/TurnosHorarios.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initModality(Modality.APPLICATION_MODAL);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }
    public void Dv(KeyEvent event){
        //digitov();
        String doc= txt_Nit.getText();
        String TpDoc="NI";
        //JOptionPane.showMessageDialog(null,"Entre1");
        DigitoVerificacion txtDv = new DigitoVerificacion();
        int dgv=txtDv.setNumeroIdentificacion(TpDoc,doc);
        txt_Dv.setText(String.valueOf(dgv));
    }
    public void CodigoT() {
        CodigosId codigosId = new CodigosId();
        String cod = codigosId.Codigos();
        txt_Cod_Emp.setText(cod);
    }
    @FXML void cargarEstados() {
        cbox_EstEmpr.getItems().clear();
        cbox_EstadoSede.getItems().clear();
        EstSexPob estados =  new  EstSexPob();
        Object list = estados.listaEstados();
        cbox_EstEmpr.getItems().addAll((Collection<? extends UbicacionesDAO>) list);
        cbox_EstEmpr.setConverter(new ConverterStringEstados());
        cbox_EstadoSede.getItems().addAll((Collection<? extends UbicacionesDAO>) list);
        cbox_EstadoSede.setConverter(new ConverterStringEstados());
    }

    public void cargarEmpresas() {
        configurarColumnasTablas();
        RellenarTablas emp = new RellenarTablas();
        Object listaemp=emp.listaempresas();
        tbl_Empresa.setItems((ObservableList<DatosTablasDAO>) listaemp);
    }

    public void cargarCodigos() {
        cbox_CodEmp.setConverter(new ConverterStringCodEmp());
        CargarCodigos cod = new CargarCodigos();
        Object listacod=cod.codigosempresas();
        cbox_CodEmp.setItems((ObservableList<CodigosDAO>) listacod);
        cbox_CodEmp.setConverter(new ConverterStringCodEmp());
        /**
        * Con el siguiente codigo se logra seleccionar un elemento del combobox y como varios elementos fueron llamados
        * de la base de datos, entonces pueden ser asignados a otros elementos
         * Con esta estructura logro que en la visual de la lista se vea el codigo y el nombre de la empresa
         * Pero al momento de realizar la selección se verá solo el codigo
        * */
        cbox_CodEmp.setOnAction(event -> { //Se le asocia evento para cada vez que haya movimiento, ejecute una accion
            // que en este caso seria rellenar los campos que estan dentro del if
            CodigosDAO codigoSeleccionado = cbox_CodEmp.getSelectionModel().getSelectedItem();
            if (codigoSeleccionado != null) {
                cbox_CodEmp.setConverter(new ConverterStringCodEmp2());
                txt_NombreEmpresa.setText(codigoSeleccionado.getNombreempresa());
                txt_NitEmpresa.setText(codigoSeleccionado.getNitempresa());
                txt_DvEmpresa.setText(codigoSeleccionado.getDvempresa());
            }
        });
    }

    public void cargarSedes() {
        configurarColumnasTablas();
        RellenarTablas sede = new RellenarTablas();
        Object listasedes=sede.listasedes();
        tbl_Sedes.setItems((ObservableList<DatosTablasDAO>) listasedes);
    }

    /**
     * El @configurarColumnasTablas establece las columnas de las tablas y a que campo corresponden de
     * los distintos DAO.
     * Deben estar enlazadas a un procedimiento que permita llamar los datos de la base de datos
     */
    public void configurarColumnasTablas(){

        /**
         * El valor dentro de PropertyValueFactory es el correspondiente a la variable del constructor DatosTablasDAO
         * configuracion de la tabla de las empresas
         * Los Datos en verde como nitEmpresa, deben ser exactamente a los que corresponde en la hoja DatosTablasDAO.java
         * Deben ser exactamente igual para que al realizar la busqueda en la tabla de datos, estos se guarden en esos valores
         */
        col_NitEmpresa.setCellValueFactory(new PropertyValueFactory<>("nitEmpresa"));
        col_NombreEmpresa.setCellValueFactory(new PropertyValueFactory<>("nombreEmpresa"));
        col_EstEmpresa.setCellValueFactory(new PropertyValueFactory<>("estadoEmpresa"));
        /**
         *Configuración de las columnas de las Sedes
         */
        col_CodSede.setCellValueFactory(new PropertyValueFactory<>("codSede"));
        col_NomEmpSede.setCellValueFactory(new PropertyValueFactory<>("nombreEmpresa"));
        col_NomSede.setCellValueFactory(new PropertyValueFactory<>("nombreSede"));
        col_EstSede.setCellValueFactory(new PropertyValueFactory<>("estadoSede"));
    }

    public void agregarSedes(ActionEvent event) {

    }

    @FXML void itemseleccionado(MouseEvent event){
/**
 * sirve para rellenar los campos segun el item que se seleccione de la tabla de la SEDE
 */
        String codigosede = tbl_Sedes.getSelectionModel().getSelectedItem().getCodSede();
        //System.out.println(codigosede);
        RellenarTablas datossede = new RellenarTablas();
        List<DatosTablasDAO> datos = datossede.datosedes(codigosede);
        DatosTablasDAO datosSede = datos.get(0);
        cbox_CodEmp.setValue(null);
        cbox_CodEmp.setPromptText(null);
        cbox_CodEmp.setPromptText(datosSede.getCodEmpresa());

        cbox_MonSede.setValue(null);
        cbox_MonSede.setPromptText(null);
        cbox_MonSede.setPromptText(datosSede.getCodEmpresa());

        txt_NombreEmpresa.setText(datosSede.getNombreEmpresa());
        txt_NitEmpresa.setText(datosSede.getNitEmpresa());
        txt_DvEmpresa.setText(datosSede.getDvEmpresa());
        txt_CodSede.setText(datosSede.getCodSede());
        txt_NombreSede.setText(datosSede.getNombreSede());
        txt_NitSede.setText(datosSede.getNitSede());
        txt_DvSede.setText(datosSede.getDvSede());

        cbox_PaisSede.setValue(null);
        cbox_PaisSede.setPromptText(null);
        cbox_PaisSede.setPromptText(datosSede.getNomPais());
        cbox_DeptoSede.setValue(null);
        cbox_DeptoSede.setPromptText(null);
        cbox_DeptoSede.setPromptText(datosSede.getNomDepto());
        cbox_MuniSede.setValue(null);
        cbox_MuniSede.setPromptText(null);
        cbox_MuniSede.setPromptText(datosSede.getNomMuni());
        txt_DirSede.setText(datosSede.getDirec());
        txt_UbSede.setText(datosSede.getUbSede());
        txt_TelSede.setText(datosSede.getTelef());
        txt_CelSede.setText(datosSede.getCelCont());
        txt_CelSede.setText(datosSede.getCelWApp());
        txt_CelSede.setText(datosSede.getEmail());
        txt_CelSede.setText(datosSede.getCodMon());
        txt_CelSede.setText(datosSede.getCantDec());






//Seguir agregando los demas campos



    }


    public void eliminarSedes(ActionEvent actionEvent) {
    }

    @FXML void moneda(MouseEvent event) {
        cbox_MonSede.getItems().clear();
        Moneda moneda = new Moneda();
        Object mon = moneda.moneda();
        System.out.println(mon);
        cbox_MonSede.getItems().addAll((Collection<? extends Moneda>) mon);
        System.out.println("Llegó hasta aquí");
        cbox_MonSede.setConverter(new StringConverter<Moneda>() {
            @Override
            public String toString(Moneda moneda) {
                return moneda == null ? null : moneda.getCodigomoneda();
            }
            @Override
            public Moneda fromString(String s) {
                return null;
            }
        });
    }
    @FXML void puc(MouseEvent event) {
        cbox_PucSede.getItems().clear();
        Puc cuentas = new Puc();
        Object puc1 = cuentas.puc();
        System.out.println(puc1);
        cbox_PucSede.getItems().addAll((Collection<? extends Puc>) puc1);
        System.out.println("Llegó hasta aquí PUC");
        cbox_PucSede.setConverter(new StringConverter<Puc>() {
            @Override
            public String toString(Puc puc) {
                return puc == null ? null : puc.getCodigopuc();
            }
            @Override
            public Puc fromString(String s) {
                return null;
            }
        });
    }

    @FXML void tipoDoc(MouseEvent event) {
        cbox_DocRLSede.getItems().clear();
        DocumentoIdentidad tipodoc = new DocumentoIdentidad();
        Object doc = tipodoc.tipodocum();
        System.out.println(doc);
        cbox_DocRLSede.getItems().addAll((Collection<? extends DocumentoIdentidad>) doc);
        System.out.println("Llegó hasta aquí TIPODOC");
        cbox_DocRLSede.setConverter(new StringConverter<DocumentoIdentidad>() {
            @Override public String toString(DocumentoIdentidad documentoIdentidad) {
                return documentoIdentidad == null ? null : documentoIdentidad.getCodigoDoc();
            }
            @Override public DocumentoIdentidad fromString(String s) {return null;}
        });
    }

    @FXML void logos(){
        btn_UrlLg.setOnAction(e -> {
            String urlImagen = null;
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Seleccionar imagen del logo");
            File selectedFile = fileChooser.showOpenDialog(btn_UrlLg.getScene().getWindow());
            if (selectedFile != null) {
                Image image = new Image(selectedFile.toURI().toString());
                img_LogoSede.setImage(image);
                urlImagen = selectedFile.toURI().toString();
                txt_UrlLogoSede.setText(urlImagen);
            }
        });
    }

}

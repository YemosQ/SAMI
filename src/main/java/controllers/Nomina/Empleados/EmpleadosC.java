package controllers.Nomina.Empleados;

import com.sam.main.Principal;
import consultas.entidad.EstSexPob;
import consultas.entidad.PaisDeptoMuni;
import javafx.beans.property.ObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import modelo.Nomina.EmpleadosDAO;
import modelo.Nomina.PaisesDAO;
import util.*;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.Chronology;
import java.util.Collection;
import java.util.ResourceBundle;


public class EmpleadosC implements Initializable, MoverPanel.DraggedScene {
    @FXML private TextField ApeDos;
    @FXML private TextField ApeUno;
    @FXML private TextField CelDr;
    @FXML private TextField CiuNa;
    @FXML private TextField CodE;
    @FXML private TextField DTpCont;
    @FXML private TextField DTpCta;
    @FXML private TextField DTpSal;
    @FXML private TextField DTpVinc;
    @FXML private TextField DTpVlr;
    @FXML private TextField DepNa;
    @FXML private TextField DirDr;
    @FXML private TextField DocE;
    @FXML private TextField txt_EdadNa;
    @FXML private TextField Email;
    @FXML private DatePicker date_FchIng;
    @FXML private DatePicker date_FchNac;
    @FXML private CheckBox Hg;
    @FXML private TextField NBarDr;
    @FXML private TextField NCiuDr;
    @FXML private TextField NDepDr;
    @FXML private TextField NPaiDr;
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
    @FXML private TextField PaiNa;
    @FXML private TextField PobNa;
    @FXML private TextField SexDNa;
    @FXML private TextField Sueldo;
    @FXML private TextField TDurC;
    @FXML private TextField TelDr;
    @FXML private TextField CoCenCo;
    @FXML private CheckBox Wp;
    @FXML private Button btn_Cerrar;
    @FXML private ComboBox<?> cbox_AnioNa;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_CBarDr;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_CCiuDr;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_CCiuNa;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_CDepDr;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_CDepNa;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_CPaiNa;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_CPobNa;
    @FXML private ComboBox<?> cbox_CoArea;
    @FXML private ComboBox<?> cbox_CoCarg;
    @FXML private ComboBox<?> cbox_TpCost;
    @FXML private ComboBox<?> cbox_CoCencost;
    @FXML private ComboBox<?> cbox_CoFPen;
    @FXML private ComboBox<?> cbox_CoTurn;
    @FXML private ComboBox<?> cbox_CodARL;
    @FXML private ComboBox<?> cbox_CodBan;
    @FXML private ComboBox<?> cbox_CodCCF;
    @FXML private ComboBox<?> cbox_CodFEPS;
    @FXML private ComboBox<?> cbox_CodRArl;
    @FXML private ComboBox<?> cbox_DiaNa;
    @FXML private ComboBox<?> cbox_MesNa;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_PaisDr;
    @FXML private ComboBox<?> cbox_Sede;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_SexNa;
    @FXML private ComboBox<?> cbox_TpCont;
    @FXML private ComboBox<?> cbox_TpCta;
    @FXML private ComboBox<?> cbox_TpSal;
    @FXML private ComboBox<?> cbox_TpVinc;
    @FXML private ComboBox<?> cbox_TpVlr;
    @FXML private ComboBox<?> cbox_CoFCes;
    @FXML private TableColumn<?, ?> colCsc;
    @FXML private TableColumn<?, ?> colDoc;
    @FXML private TableView<?> tblEmpleados;
    @FXML private AnchorPane panelEmpleados;

    ObservableList<EmpleadosDAO> empleados=FXCollections.observableArrayList();

    private final PaisesDAO paisesdp = new PaisesDAO();
    private final PaisesDAO deptosdp = new PaisesDAO();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        JOptionPane.showMessageDialog(null,"Iniciando");
        this.onDraggedScene(this.panelEmpleados);
        JOptionPane.showMessageDialog(null,"Llamando lista de sexo");
        listaSexo();
        JOptionPane.showMessageDialog(null,"Despues de lista de sexo");
        listaPobla();
        listaPais();
    }

    //Evento de teclado. Activar ventana con F4
    @FXML void llamarTerceros(KeyEvent event) throws IOException {
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Contabilidad/Terceros.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML void cerrar_Clic(){
        Stage myStage = (Stage) this.btn_Cerrar.getScene().getWindow();
        myStage.close();
    }

    public void llamarPaises(KeyEvent event) throws IOException{
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Generales/PaisesCiudades.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpSalario(KeyEvent event) throws IOException{
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoSalario.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpValor(KeyEvent event) throws IOException{
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoValor.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpContrato(KeyEvent event) throws IOException{
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoContratos.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpVinvulacion(KeyEvent event)throws IOException {
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoVinculacion.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpCargo(KeyEvent event) throws IOException{
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoCargos.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpTurno(KeyEvent event) throws IOException{
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoTurnos.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpArea(KeyEvent event)throws IOException {
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoArea.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpCosto(KeyEvent event)throws IOException {
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoCosto.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpCCosto(KeyEvent event) throws IOException {
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoCCosto.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarSede(KeyEvent event) throws IOException {
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Sede.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarRiesgosARL(KeyEvent event) throws IOException {
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoRiesgoARL.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void llamarTpCta(KeyEvent event)throws IOException {
        if (event.getCode()==KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/TipoCuenta.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        }
    }

    //Acción o evento de agregar o guardar los datos
    @FXML void agregar(ActionEvent event) {
        Boolean guardar = true;
        String mensaje = "No se pudo realizar la inserción";
        String codigo = CodE.getText();
        int anio = 2022;
        String documento = DocE.getText();
        String nombreUno = NomUno.getText();
        String nombreDos = NomDos.getText();
        String apellidoUno = ApeUno.getText();
        String apellidoDos = ApeDos.getText();
        String nombreComp = NomUno.getText() + NomDos.getText()+ApeUno.getText()+ApeDos.getText();
        int diaNaci = cbox_DiaNa.getVisibleRowCount();
        String mesNaci = cbox_MesNa.getAccessibleHelp();
        int anioNaci = cbox_AnioNa.getVisibleRowCount();
        int edad = 30; //averiguar como hacer la operación para sacar la edad en años
        String paisNaci = cbox_CPaiNa.getAccessibleHelp();
        String desPaisNaci = PaiNa.getText();
        String departamentoNaci = cbox_CDepNa.getAccessibleHelp();
        String descDeptoNaci = DepNa.getText();
        String municipioNaci = cbox_CCiuNa.getAccessibleHelp();
        String descmunicipioNaci=CiuNa.getText();
        int codigoSexo = cbox_SexNa.getVisibleRowCount();
        String descSexo = SexDNa.getText();
        int codigoPoblacion = cbox_CPobNa.getVisibleRowCount();
        String descPoblacion = PobNa.getText();
        String paisResidencia = cbox_PaisDr.getAccessibleHelp();
        String descpaisRes = PaiNa.getText();
        String departamentoResi = cbox_CDepDr.getAccessibleHelp();
        String descdeptoResi = NDepDr.getText();
        String municipioResi = cbox_CCiuDr.getAccessibleHelp();
        String descmunicipioResi = NCiuDr.getText();
        String barrioResi = cbox_CBarDr.getAccessibleHelp();
        String descbarrioResi = NBarDr.getText();
        String direccionResi = DirDr.getText();
        String telefono = TelDr.getText();
        String celular = CelDr.getText();
        int whatsApp = Integer.parseInt(Wp.getText());
        String email = Email.getText();
        ObjectProperty<Chronology> fechaIngreso = date_FchIng.chronologyProperty();
        int tipoSalario =cbox_TpSal.getVisibleRowCount();
        int tipoValor =cbox_TpVlr.getVisibleRowCount();
        double sueldo =cbox_TpSal.getVisibleRowCount();
        int tipoContrato =cbox_TpCont.getVisibleRowCount();
        int tipoVinculacion =cbox_TpVinc.getVisibleRowCount();
        int tiempoMeses = Integer.parseInt(TDurC.getText());
        int tipoCargo =cbox_CoCarg.getVisibleRowCount();
        int tipoTurno = cbox_CoTurn.getVisibleRowCount();
        boolean horarioGeneral = Hg.isAllowIndeterminate();
        int codigoArea = cbox_CoArea.getVisibleRowCount();
        int tipoCosto = cbox_TpCost.getVisibleRowCount();
        String codigoSede = cbox_Sede.getAccessibleHelp();
        String codigoPension=cbox_CoFPen.getAccessibleHelp();
        String codigoEPS=cbox_CodFEPS.getAccessibleHelp();
        String codigoCesantias= cbox_CoFCes.getAccessibleHelp();
        String codigoARL=cbox_CodARL.getAccessibleHelp();
        String codigoRiesgo= cbox_CodRArl.getAccessibleHelp();
        String codigoCCF=cbox_CodCCF.getAccessibleHelp();
        String codigoBanco=cbox_CodBan.getAccessibleHelp();
        String tipoCuenta=cbox_TpCta.getAccessibleHelp();
        String numeroCuenta=NumCta.getText();

         //Espacio para agregar validaciones de los campos

        if(guardar){
            EmpleadosDAO control = new EmpleadosDAO();
            control.insertar(codigo, anio, documento, nombreUno, nombreDos, apellidoUno, apellidoDos, nombreComp,
                diaNaci, mesNaci, anioNaci, edad, paisNaci, departamentoNaci, municipioNaci, codigoSexo,
                codigoPoblacion, paisResidencia,departamentoResi, municipioResi, barrioResi, direccionResi,
                telefono, celular, whatsApp, email,fechaIngreso, tipoSalario, tipoValor, sueldo, tipoContrato,
                tipoVinculacion, tiempoMeses, tipoCargo, tipoTurno, horarioGeneral, codigoArea, tipoCosto,
                codigoSede, codigoPension, codigoEPS, codigoCesantias, codigoARL, codigoRiesgo, codigoCCF,
                codigoBanco, tipoCuenta, numeroCuenta);
        }
        else JOptionPane.showMessageDialog(null, mensaje);
    }
    public void llamarEstSexPob(KeyEvent event) throws IOException {
        if (event.getCode()== KeyCode.F4){
            FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("Parametros/Generales/Estados.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.setFill(Color.TRANSPARENT);
            Stage stage=new Stage();
            stage.setOpacity(1);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
            }

        }
    public void listaSexo() {
        JOptionPane.showMessageDialog(null,"Entrando a lista de sexo");
        //cbox_SexNa.getItems().removeAll(cbox_SexNa.getItems());
        EstSexPob sexolista =  new  EstSexPob();
        Object list = sexolista.listaSexo();
        cbox_SexNa.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) list);
        cbox_SexNa.setConverter(new ConverterStringSexo());
    }
    public void listaPobla() {
        cbox_CPobNa.getItems().removeAll(cbox_CPobNa.getItems());
        EstSexPob poblalista =  new  EstSexPob();
        Object list = poblalista.listaPobla();
        cbox_CPobNa.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) list);
        cbox_CPobNa.setConverter(new ConverterStringSexo());
    }
    public void listaPais(){
        cbox_CPaiNa.getItems().removeAll(cbox_CPaiNa.getItems());
        PaisDeptoMuni paises = new PaisDeptoMuni();
        Object list = paises.listaPaises();
        cbox_CPaiNa.getItems().addAll((EmergenteEstadosPaisesDAO) list);
        cbox_CPaiNa.setConverter(new ConverterStringPaises());
        cbox_PaisDr.getItems().addAll((EmergenteEstadosPaisesDAO) list);
        cbox_PaisDr.setConverter(new ConverterStringPaises());
    }
    public void listaDeptosNac(){
        cbox_CDepNa.getItems().removeAll(cbox_CDepNa.getItems());
        //JOptionPane.showMessageDialog(null,"Entrando en el If de listDeptos");
        IndexEstado indexS= new IndexEstado();
        String nompais=cbox_CPaiNa.getSelectionModel().getSelectedItem().getNombrepais();
        //JOptionPane.showMessageDialog(null,"El valor de nompais del ComboBox es: "+nompais);
        String idpais=indexS.idPais(nompais);
        //JOptionPane.showMessageDialog(null,"El valor de idpais traido es: "+idpais);
        PaisDeptoMuni deptosDp = new PaisDeptoMuni();
        Object list = deptosDp.listaDeptosDep(idpais);
        //JOptionPane.showMessageDialog(null,"El valor de list es: "+list);
        cbox_CDepNa.getItems().addAll((EmergenteEstadosPaisesDAO) list);
        cbox_CDepNa.setConverter(new ConverterStringDepto());
        //JOptionPane.showMessageDialog(null,"No entró al If de listDeptos");
    }
    public void listaDeptosDep(){
        cbox_CDepDr.getItems().removeAll(cbox_CDepDr.getItems());
        //JOptionPane.showMessageDialog(null,"Entrando en el If de listDeptos");
        IndexEstado indexS= new IndexEstado();
        String nompais=cbox_PaisDr.getSelectionModel().getSelectedItem().getNombrepais();
        //JOptionPane.showMessageDialog(null,"El valor de nompais del ComboBox es: "+nompais);
        String idpais=indexS.idPais(nompais);
        //JOptionPane.showMessageDialog(null,"El valor de idpais traido es: "+idpais);
        PaisDeptoMuni deptosDp = new PaisDeptoMuni();
        Object list = deptosDp.listaDeptosDep(idpais);
        //JOptionPane.showMessageDialog(null,"El valor de list es: "+list);
        cbox_CDepDr.getItems().addAll((EmergenteEstadosPaisesDAO) list);
        cbox_CDepDr.setConverter(new ConverterStringDepto());
        //JOptionPane.showMessageDialog(null,"No entró al If de listDeptos");
    }
    public void listaMunicNac(){
        cbox_CCiuNa.getItems().removeAll(cbox_CCiuNa.getItems());
        IndexEstado indexS= new IndexEstado();
        String nomdepto=cbox_CDepNa.getSelectionModel().getSelectedItem().getNombredepto();
        //JOptionPane.showMessageDialog(null,"El valor de nomdepto del ComboBox es: "+nomdepto);
        String iddepto=indexS.iddepto(nomdepto);
        //JOptionPane.showMessageDialog(null,"El valor de iddepto traido es: "+iddepto);
        PaisDeptoMuni deptosDp = new PaisDeptoMuni();
        Object list = deptosDp.listaMuniDep(iddepto);
        //JOptionPane.showMessageDialog(null,"El valor de list es: "+list);
        cbox_CCiuNa.getItems().addAll((EmergenteEstadosPaisesDAO) list);
        cbox_CCiuNa.setConverter(new ConverterStringMunic());
    }
    public void listaMunicDep(){
        cbox_CCiuDr.getItems().removeAll(cbox_CCiuDr.getItems());
        IndexEstado indexS= new IndexEstado();
        String nomdepto=cbox_CDepDr.getSelectionModel().getSelectedItem().getNombredepto();
        //JOptionPane.showMessageDialog(null,"El valor de nomdepto del ComboBox es: "+nomdepto);
        String iddepto=indexS.iddepto(nomdepto);
        //JOptionPane.showMessageDialog(null,"El valor de iddepto traido es: "+iddepto);
        PaisDeptoMuni deptosDp = new PaisDeptoMuni();
        Object list = deptosDp.listaMuniDep(iddepto);
        //JOptionPane.showMessageDialog(null,"El valor de list es: "+list);
        cbox_CCiuDr.getItems().addAll((EmergenteEstadosPaisesDAO) list);
        cbox_CCiuDr.setConverter(new ConverterStringMunic());
    }
    public void listaBarrio(){
        //Llena el ComboBox de la ventana de empleados con la lista de los barrios
        //dependiendo los valores que tengan seleccionados en Departamento y Municipio
        cbox_CBarDr.getItems().removeAll(cbox_CBarDr.getItems());
        IndexEstado indexS= new IndexEstado();
        String nomdepto=cbox_CDepDr.getSelectionModel().getSelectedItem().getNombredepto();
        String nommunic=cbox_CCiuDr.getSelectionModel().getSelectedItem().getNombredepto();
        //JOptionPane.showMessageDialog(null,"El valor de nomdepto y nombremunic del ComboBox es: "+nomdepto+" / "+nommunic);
        String iddepto=indexS.iddepto(nomdepto);
        String idmunic=indexS.idmunic(nommunic);
        //JOptionPane.showMessageDialog(null,"El valor de iddepto e idmunic traido es: "+iddepto+" / "+idmunic);
        PaisDeptoMuni deptosDp = new PaisDeptoMuni();
        Object list = deptosDp.listaBarriosDep(iddepto,idmunic);
        //JOptionPane.showMessageDialog(null,"El valor de list es: "+list);
        cbox_CBarDr.getItems().addAll((EmergenteEstadosPaisesDAO) list);
        cbox_CBarDr.setConverter(new ConverterStringBarrio());
    }

    //Listar departamentos, municipios de R Residencia y N Nacimiento
    @FXML private void deptosdepN(MouseEvent event){
        cbox_CCiuNa.getItems().removeAll(cbox_CCiuNa.getItems());
        int pais=cbox_CPaiNa.getSelectionModel().getSelectedIndex();
        if (pais>-1){
            //JOptionPane.showMessageDialog(null,"Valor de Pais "+pais);
            listaDeptosNac();
        }else {
        JOptionPane.showMessageDialog(null,"Seleccione el Pais de Nacimiento");
        }
    }
    @FXML private void deptosdepR(MouseEvent event){
        cbox_CDepDr.getItems().removeAll(cbox_CDepDr.getItems());
        int pais=cbox_PaisDr.getSelectionModel().getSelectedIndex();
        if (pais>-1){
            //JOptionPane.showMessageDialog(null,"Valor de Pais "+pais);
            listaDeptosDep();
        }else {
            JOptionPane.showMessageDialog(null,"Seleccione el Pais de Residencia");
        }
    }
    @FXML private void municdepN(MouseEvent event){
        int depto=cbox_CDepNa.getSelectionModel().getSelectedIndex();
        if (depto>-1){
            //JOptionPane.showMessageDialog(null,"Valor del departamento "+depto);
            listaMunicNac();
        }else{
        JOptionPane.showMessageDialog(null,"Seleccione el departamento del pais de Nacimiento");
        }
    }
    @FXML private void municdepR(MouseEvent event){
        int depto=cbox_CDepDr.getSelectionModel().getSelectedIndex();
        if (depto>-1){
            //JOptionPane.showMessageDialog(null,"Valor del departamento "+depto);
            listaMunicDep();
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione el departamento del pais de Nacimiento");
        }
    }
    @FXML private void barriodepR(MouseEvent event){
        //Metodo que llama a listar barrios si el departamento y la ciudad ya se han elegido
        int depto=cbox_CDepDr.getSelectionModel().getSelectedIndex();
        int munic=cbox_CCiuDr.getSelectionModel().getSelectedIndex();
        if (depto>-1 && munic>-1){
            //JOptionPane.showMessageDialog(null,"Valor del departamento "+depto);
            listaBarrio();
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione el departamento y municipio de Residencia");
        }
    }
    @FXML void calculoedad(MouseEvent event) {
        LocalDate fechaNac=date_FchNac.getValue();
        LocalDate fechaHoy=LocalDate.now();
        if (fechaNac!=null){
            //String fechaN = Fecha.LocalDateAString(fechaNac);
            //String fechaH = Fecha.LocalDateAString(fechaHoy);
            //JOptionPane.showMessageDialog(null,"La fechaA es:"+ fechaN);
            //JOptionPane.showMessageDialog(null,"La fecha Actual es:"+ fechaH);
            Period edad = Period.between(fechaNac,fechaHoy);
            txt_EdadNa.setText(String.valueOf(edad.getYears()));
        }else {
            //JOptionPane.showMessageDialog(null,"Edad después de seleccionar la fecha:");
        }

    }





}

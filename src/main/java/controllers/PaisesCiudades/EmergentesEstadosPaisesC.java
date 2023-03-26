package controllers.PaisesCiudades;

import com.sam.main.Principal;
import conexion.Conexion;
import conexion.QueryConsulta;
import consultas.nominanuevo.EstSexPob;
import consultas.nominanuevo.PaisDeptoMuni;
import controllers.Nomina.Inicio.IniNominaC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Nomina.EmergenteEstadosPaisesDAO;
import javafx.scene.control.TextField;
import util.*;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.ResourceBundle;

public class EmergentesEstadosPaisesC implements Initializable, MoverPanel.DraggedScene {

//Declaración de atributos para la ventana de Paises, Departamentos y Ciudades

    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_PaisAs;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_DeptoAs;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_DeptoAsBr;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_MunicAsBr;//Variables de ComboBox Ventana X
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_EstDepto;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_EstMcpio;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_EstBarrio;

    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_Est;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_EstPob;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_EstPais;
    @FXML private ComboBox<EmergenteEstadosPaisesDAO> cbox_EstSex;
     //COMBOBOX Estados Ventana Paises, Departamentos y Municipios

    @FXML private Button btn_Cerrar;
    @FXML private Button btn_eliDepto;
    @FXML private Button btn_eliMcpio;
    @FXML private Button btn_eliPais;
    @FXML private Button btn_actArea;
    @FXML private Button btn_actBarrio;
    @FXML private Button btn_actCargo;
    @FXML private Button btn_actCc;
    @FXML private Button btn_actClase;
    @FXML private Button btn_actCtrato;
    @FXML private Button btn_actDepto;
    @FXML private Button btn_actEst;
    @FXML private Button btn_actMcpio;
    @FXML private Button btn_actPais;
    @FXML private Button btn_actPobla;
    @FXML private Button btn_actSClase;
    @FXML private Button btn_actSala;
    @FXML private Button btn_actSex;
    @FXML private Button btn_actTpCosto;
    @FXML private Button btn_actTpCtrato;
    @FXML private Button btn_actTpVinc;
    @FXML private Button btn_actTpVlr;
    @FXML private Button btn_agrArea;
    @FXML private Button btn_agrBarrio;
    @FXML private Button btn_agrCargo;
    @FXML private Button btn_agrCc;
    @FXML private Button btn_agrClase;
    @FXML private Button btn_agrCtrato;
    @FXML private Button btn_agrDepto;
    @FXML private Button btn_agrEst;
    @FXML private Button btn_agrMcpio;
    @FXML private Button btn_agrPais;
    @FXML private Button btn_agrPob;
    @FXML private Button btn_agrSClase;
    @FXML private Button btn_agrSala;
    @FXML private Button btn_agrSex;
    @FXML private Button btn_agrTpCosto;
    @FXML private Button btn_agrTpCtrato;
    @FXML private Button btn_agrTpVinc;
    @FXML private Button btn_agrTpVlr;
    @FXML private Button btn_eliArea;
    @FXML private Button btn_eliBarrio;
    @FXML private Button btn_eliCargo;
    @FXML private Button btn_eliCc;
    @FXML private Button btn_eliClase;
    @FXML private Button btn_eliCtrato;
    @FXML private Button btn_eliPobla;
    @FXML private Button btn_eliSClase;
    @FXML private Button btn_eliSala;
    @FXML private Button btn_eliSex;
    @FXML private Button btn_eliTpCosto;
    @FXML private Button btn_eliTpCtrato;
    @FXML private Button btn_eliTpVinc;
    @FXML private Button btn_eliTpVlr;
    @FXML private Button btn_estados;
    @FXML private Button btn_minimizar;
    @FXML private Button btn_paises;
    @FXML private Button btn_tpcontractuales;
    @FXML private Button btn_tpcosto;
    @FXML private Button btn_tpSala;
    @FXML private Button btn_ActEst;
    @FXML private Button btn_AgregarSex;
    @FXML private Button btn_ActPobla;
    @FXML private Button btn_ActSex;
    @FXML private Button btn_AgregarPob;
    @FXML private Button btn_AgregarEst;
    @FXML private Button btn_tpRegimen;
     //BOTONES Ventana Paises, Departamentos y Municipios

    @FXML private TableColumn<?, ?> col_DeptoAs;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_ConsolBarrio;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_idDepto;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_idMcpio;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_idPais;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_ConsolDepto;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_ConsolMcpio;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_ConsolPais;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_EstConsol;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_EstDepto;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_EstMcpio;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_EstPais;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_NomDepto;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_NomMcpio;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_NomPais;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_idBarrio;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_NomBarrio;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_EstBarrio;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_DeptoCPais;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_DeptoAsBr;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_MunicAsBr;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, Integer> col_CodEst;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_DescEst;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, Integer> col_CodSex;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_DescSex;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, Integer> col_CodPobla;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_DescPobla;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_EstPobla;
    @FXML private TableColumn<EmergenteEstadosPaisesDAO, String> col_EstSex;
    //Atributos de COLUMN TABLEVIEW

    @FXML private AnchorPane panelEmergente;
    @FXML private AnchorPane panel_Parametro_Costo;
    @FXML private AnchorPane panel_Parametro_CtratiyAreas;
    @FXML private AnchorPane panel_Parametro_Regimen;
    @FXML private AnchorPane panel_TpSalarios;
    @FXML private AnchorPane panel_estados;
    @FXML private AnchorPane panelEstados;
    @FXML private AnchorPane panel_paises;
     //ANCHORPANE

    @FXML private TableView<EmergenteEstadosPaisesDAO> tbl_Depto;
    @FXML private TableView<EmergenteEstadosPaisesDAO> tbl_Mcpio;
    @FXML private TableView<EmergenteEstadosPaisesDAO> tbl_Pais;
    @FXML private TableView<EmergenteEstadosPaisesDAO> tbl_Estados;
    @FXML private TableView<EmergenteEstadosPaisesDAO> tbl_Sexo;
    @FXML private TableView<EmergenteEstadosPaisesDAO> tbl_Pobla;
    @FXML private TableView<EmergenteEstadosPaisesDAO> tbl_Barrios;
     //Atributos de TABLEVIEW

    @FXML private TextField txt_idDepto;
    @FXML private TextField txt_idMcpio;
    @FXML private TextField txt_idPais;
    @FXML private TextField txt_idBarrio;
    @FXML private TextField txt_nombreDepto;
    @FXML private TextField txt_nombreMcipio;
    @FXML private TextField txt_nombrePais;
    @FXML private TextField txt_nombreBarrio;
    @FXML private TextField txt_CodEst;
    @FXML private TextField txt_DescEst;
    @FXML private TextField txt_CodSex;
    @FXML private TextField txt_DescSex;
    @FXML private TextField txt_CodPobla;
    @FXML private TextField txt_DescPobla;
    @FXML private TextField txt_MunicCoord;
    @FXML private TextField txt_BarrioCoord;
    @FXML private TextField txt_BusquedaPais;
     //Atributos de TEXTFIELD


    @FXML private Label label_Mod_Nombre_Emergente;
     //LABEL

    public ObservableList<EmergenteEstadosPaisesDAO> estados = FXCollections.observableArrayList();
    public ObservableList<EmergenteEstadosPaisesDAO> sexo = FXCollections.observableArrayList();
    public ObservableList<EmergenteEstadosPaisesDAO> poblacion = FXCollections.observableArrayList();
    //OBSERVABLE LIST

    private Connection con;
    private Statement stm;
    private ResultSet rs;
    //Atributos de CONEXIÓN




    @Override public void initialize(URL url, ResourceBundle resourceBundle) {
        this.onDraggedScene(this.panelEmergente);
        rellenarTbls();
        listaEst();
        String eventopresionado=new IniNominaC().getElementodeevento();
        iniciotablas();
        valorlabelmodulo();
    }


    @FXML public void minimizar_Clic(ActionEvent event){
        Stage myStage = (Stage) this.panelEmergente.getScene().getWindow();
        myStage.setIconified(true);
    }
    @FXML void cerrar_Clic(){
        Stage myStage = (Stage) this.btn_Cerrar.getScene().getWindow();
        myStage.close();
    }

    public void valorlabelmodulo(){
        label_Mod_Nombre_Emergente.setStyle("-fx-font-family:Tahoma;-fx-font-size:24px;" +
                "    -fx-text-fill:linear-gradient(to right top, #ffffff 50%, #bbbbbb);" +
                "    -fx-font-weight: bold;-fx-alignment: center;");
        label_Mod_Nombre_Emergente.setText("Paises - Departamentos - Municipios - Barrios");
    }

    public void iniciotablas(){
        panel_paises.setVisible(true);
        panel_estados.setVisible(false);
        panel_TpSalarios.setVisible(false);
        panel_Parametro_CtratiyAreas.setVisible(false);
        panel_Parametro_Costo.setVisible(false);
        panel_Parametro_Regimen.setVisible(false);
    }

    public void listaEst() {
        //Crea una instancia para buscar la lista de los estados y mostrarlas en los ComboBox
        EstSexPob Estlista =  new  EstSexPob();
        Object list = Estlista.listaEstados();
        PaisDeptoMuni Paislista = new PaisDeptoMuni();
        Object listP = Paislista.listaPaises();
        Object listD = Paislista.listaDeptos();
        Object listM = Paislista.listaMuni();
        Object listB = Paislista.listaBarrios();
        cbox_EstPais.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) list);
        cbox_EstPais.setConverter(new ConverterStringEstados());
        cbox_PaisAs.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) listP);
        cbox_PaisAs.setConverter(new ConverterStringIdPaises());
        cbox_EstDepto.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) list);
        cbox_EstDepto.setConverter(new ConverterStringEstados());
        cbox_DeptoAs.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) listD);
        cbox_DeptoAs.setConverter(new ConverterStringIdDepto());
        cbox_DeptoAsBr.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) listD);
        cbox_DeptoAsBr.setConverter(new ConverterStringIdDepto());
        cbox_EstMcpio.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) list);
        cbox_EstMcpio.setConverter(new ConverterStringEstados());
        cbox_MunicAsBr.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) listM);
        cbox_MunicAsBr.setConverter(new ConverterStringIdMunic());
        cbox_EstBarrio.getItems().addAll((Collection<? extends EmergenteEstadosPaisesDAO>) list);
        cbox_EstBarrio.setConverter(new ConverterStringEstados());
    }



    public void rellenarTbls() {
        configTbls();
        cargarDatosPaises();
        cargarDatosDepto();
        cargarDatosMuni();
        cargarDatosBarrio();
        cargarDatosEst();
        cargarDatosSex();
        cargarDatosPobla();
    }


    private void configTbls() {
        col_idPais.setCellValueFactory(new PropertyValueFactory<>("idpais"));
        col_NomPais.setCellValueFactory(new PropertyValueFactory<>("nombrepais"));
        col_EstPais.setCellValueFactory(new PropertyValueFactory<>("estado"));
        col_idDepto.setCellValueFactory(new PropertyValueFactory<>("iddepto"));
        col_NomDepto.setCellValueFactory(new PropertyValueFactory<>("nombredepto"));
        col_DeptoCPais.setCellValueFactory(new PropertyValueFactory<>("idpais"));
        col_EstDepto.setCellValueFactory(new PropertyValueFactory<>("estado"));
        col_idMcpio.setCellValueFactory(new PropertyValueFactory<>("idmunicipio"));
        col_NomMcpio.setCellValueFactory(new PropertyValueFactory<>("nombremunicipio"));
        col_DeptoAs.setCellValueFactory(new PropertyValueFactory<>("iddeptoas"));
        col_EstMcpio.setCellValueFactory(new PropertyValueFactory<>("estado"));
        col_idBarrio.setCellValueFactory(new PropertyValueFactory<>("idbarrio"));
        col_NomBarrio.setCellValueFactory(new PropertyValueFactory<>("nombrebarrio"));
        col_DeptoAsBr.setCellValueFactory(new PropertyValueFactory<>("iddeptoas"));
        col_MunicAsBr.setCellValueFactory(new PropertyValueFactory<>("idmunicipioas"));
        col_EstBarrio.setCellValueFactory(new PropertyValueFactory<>("estado"));
        col_CodEst.setCellValueFactory(new PropertyValueFactory<>("codigoEstado"));
        col_DescEst.setCellValueFactory(new PropertyValueFactory<>("descripcionEstado"));
        col_CodSex.setCellValueFactory(new PropertyValueFactory<>("codigoSexo"));
        col_DescSex.setCellValueFactory(new PropertyValueFactory<>("descripcionSexo"));
        col_EstSex.setCellValueFactory(new PropertyValueFactory<>("descripcionEstado"));
        col_CodPobla.setCellValueFactory(new PropertyValueFactory<>("codigoPobla"));
        col_DescPobla.setCellValueFactory(new PropertyValueFactory<>("descripcionPobla"));
        col_EstPobla.setCellValueFactory(new PropertyValueFactory<>("descripcionEstado"));
    }


    public void cargarDatosPaises(){
        //JOptionPane.showMessageDialog(null,"Dentro de CargarDatosPaises");
        PaisDeptoMuni paises = new PaisDeptoMuni();
        Object listPaises=paises.listaPaises();
        //JOptionPane.showMessageDialog(null,"Volviendo de Paises con valor: "+listPaises);
        tbl_Pais.setItems((ObservableList<EmergenteEstadosPaisesDAO>) listPaises);
    }
    public void cargarDatosDepto(){
        //JOptionPane.showMessageDialog(null,"Dentro de CargarDatosDepto");
        PaisDeptoMuni depto = new PaisDeptoMuni();
        Object listDepto=depto.listaDeptos();
        //JOptionPane.showMessageDialog(null,"Volviendo de Paises con valor: "+listDepto);
        tbl_Depto.setItems((ObservableList<EmergenteEstadosPaisesDAO>) listDepto);
    }
    public void cargarDatosMuni(){
        //JOptionPane.showMessageDialog(null,"Dentro de CargarDatosMunic");
        PaisDeptoMuni munic = new PaisDeptoMuni();
        Object listMunic=munic.listaMuni();
        //JOptionPane.showMessageDialog(null,"Volviendo de municipio con valor: "+listMunic);
        tbl_Mcpio.setItems((ObservableList<EmergenteEstadosPaisesDAO>) listMunic);
    }
    public void cargarDatosBarrio(){
        PaisDeptoMuni barrios = new PaisDeptoMuni();
        Object listBarrio=barrios.listaBarrios();
        tbl_Barrios.setItems((ObservableList<EmergenteEstadosPaisesDAO>) listBarrio);
    }
    public void cargarDatosEst() {
        EstSexPob estados= new EstSexPob();
        Object listaestados=estados.listaEstados();
        tbl_Estados.setItems((ObservableList<EmergenteEstadosPaisesDAO>) listaestados);
    }
    public void cargarDatosSex() {
        EstSexPob sexo= new EstSexPob();
        Object listasexo=sexo.listaSexo();
        tbl_Sexo.setItems((ObservableList<EmergenteEstadosPaisesDAO>) listasexo);
    }
    public void cargarDatosPobla() {
        EstSexPob pobla= new EstSexPob();
        Object listapobla=pobla.listaPobla();
        tbl_Pobla.setItems((ObservableList<EmergenteEstadosPaisesDAO>) listapobla);
    }


//    public void buscarpais(){
//        PaisDeptoMuni dato =new PaisDeptoMuni();
//        ObservableList listaC = dato.listaConsol();
//        FilteredList<PaisesDAO> filtroPais = new FilteredList<>(listaC, b ->true);
//        txt_BusquedaPais.textProperty().addListener((observable, oldValue, newValue) -> {
//            filtroPais.setPredicate(PaisesDAO ->{
//                if (newValue.isEmpty() || newValue.isBlank() || newValue==null){return true;}
//                String busqueda=newValue.toLowerCase();
//                //if (PaisesDAO.getNombrepais().toLowerCase().indexOf(busqueda)>-1){return true;
//                if (PaisesDAO.getNombrepais().toLowerCase().contains(busqueda)){return true;
//                } else if (PaisesDAO.getNombredepto().toLowerCase().contains(busqueda)) {return true;
//                } else if (PaisesDAO.getNombremunicipio().toLowerCase().contains(busqueda)) {return true;
//                } else if (PaisesDAO.getNombrebarrio().toLowerCase().contains(busqueda)) {return true;
//                }else{return false;}});});
//        SortedList<PaisesDAO> sortedData=new SortedList<>(filtroPais);
//        sortedData.comparatorProperty().bind(tbl_ConsolPaises.comparatorProperty());
//        tbl_ConsolPaises.setItems(sortedData);
//    }

    @FXML void agregarPais_Clic(ActionEvent event) {
        String mensaje = "AGREGAR";
        String codigo="'"+ txt_idPais.getText()+"'";
        String descripcion = "'" + txt_nombrePais.getText() + "'";
        IndexEstado indexS = new IndexEstado();
        int estado = indexS.indexEst(cbox_EstPais.getSelectionModel().getSelectedItem().getDescripcionEstado());
        String query = "insert into tb_pais(idpaises, NomPais, EstCodGen) VALUES("+codigo+"," +
                descripcion +","+estado+ ")";
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTbls();
    }
    @FXML void agregarDepto_Clic(ActionEvent event) {
        String mensaje = "AGREGAR";
        String codigo="'"+ txt_idDepto.getText()+"'";
        String descripcion = "'" + txt_nombreDepto.getText() + "'";
        String codigopais = "'" + cbox_PaisAs.getSelectionModel().getSelectedItem().getIdpaisas() + "'";
        IndexEstado indexS = new IndexEstado();
        int estado = indexS.indexEst(cbox_EstDepto.getSelectionModel().getSelectedItem().getDescripcionEstado());
        String query = "insert into tb_depto(CodDepto, NomDepto, CodPais, EstCodGen) VALUES("+codigo+"," +
                descripcion +","+codigopais+","+ estado+ ")";
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTbls();
    }
    @FXML void agregarMunic_Clic(ActionEvent event) {
        String mensaje = "AGREGAR";
        String codigo = "'" + txt_idDepto.getText() + "'";
        String descripcion = "'" + txt_nombreDepto.getText() + "'";
        String coordenada = txt_MunicCoord.getText();
        String codigodepto = "'" + cbox_DeptoAs.getSelectionModel().getSelectedItem().getIdpaisas() + "'";
        IndexEstado indexS = new IndexEstado();
        int estado = indexS.indexEst(cbox_EstMcpio.getSelectionModel().getSelectedItem().getDescripcionEstado());
        String query;
        if (txt_MunicCoord.equals("")) {
            query = "insert into tb_depto(CodMun, NomMun, CodDepto, EstCodGen) VALUES(" + codigo + "," +
                    descripcion + "," + codigodepto + "," + estado + ")";
        } else {
            query = "insert into tb_munic(CodMun, NomMun,Coordenada, CodDepto, EstCodGen) VALUES(" + codigo + "," +
                    descripcion + ","+coordenada + codigodepto + "," + estado + ")";
        }

        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTbls();
    }
    @FXML void agregarEstado_Clic(ActionEvent event) {
        estados.clear();
        String mensaje = "AGREGAR";
        int codigo= Integer.parseInt(txt_CodEst.getText());
        String descripcion = "'" + txt_DescEst.getText() + "'";
        String query = "insert into tb_estgen(CodGen,DescEstGen) VALUES("+codigo+"," + descripcion + ")";
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTblEstados();
        txt_CodEst.setText(String.valueOf(new Consecutivos().ConsecutivoEst()));
    }
    @FXML void agregarSex_Clic(ActionEvent event) {
        String mensaje = "AGREGAR";
        int codigo = Integer.parseInt(txt_CodSex.getText());
        String descripcion = "'" + txt_DescSex.getText() + "'";
        IndexEstado indexS = new IndexEstado();
        int estado = indexS.indexEst(cbox_EstSex.getSelectionModel().getSelectedItem().getDescripcionEstado());
        String query = "insert into tb_sexo(CodSex,DescSex, EstCodGen) " +
                "VALUES("+codigo+", " + descripcion +", "+ estado+
                ")";
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        rellenarTblSex();
        txt_CodSex.setText(String.valueOf(new Consecutivos().ConsecutivoSex()));
    }
    @FXML void agregarPobla_Clic(ActionEvent event) {
        String mensaje = "AGREGAR TIPO DE POBLACIÓN";
        int codigo = Integer.parseInt(txt_CodPobla.getText());
        String descripcion = "'" + txt_DescPobla.getText() + "'";
        IndexEstado indexS = new IndexEstado();
        int estado = indexS.indexEst(cbox_EstPob.getSelectionModel().getSelectedItem().getDescripcionEstado());
        String query = "insert into tb_pobla(CodPob, DescPob, EstCodGen) VALUES("+ codigo+"," + descripcion +","+  estado+")";
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        rellenarTblPobla();
        txt_CodPobla.setText(String.valueOf(new Consecutivos().ConsecutivoPob()));
    }

    @FXML void actualizarPais_Clic(ActionEvent event) {
        String mensaje = "ACTUALIZACIÓN";
        String codigo ="'"+ txt_idPais.getText()+"'";
        String descripcion = "'" + txt_nombrePais.getText() + "'";
        IndexEstado indexS = new IndexEstado();
        int estado = indexS.indexEst(cbox_EstPais.getSelectionModel().getSelectedItem().getDescripcionEstado());
        String query = "UPDATE tb_pais SET NomPais=" + descripcion +","+" EstCodGen="+estado+ " WHERE idpaises=" + codigo;
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        rellenarTbls();
    }
    @FXML void actualizarEstado_Clic(ActionEvent event) {
        String mensaje = "ACTUALIZACIÓN";
        int codigo = Integer.parseInt(txt_CodEst.getText());
        String descripcion = "'" + txt_DescEst.getText() + "'";
        String query = "UPDATE tb_esteen SET DescEstGen=" + descripcion + " WHERE CodGen=" + codigo;
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTblEstados();
        txt_CodEst.setText(String.valueOf(new Consecutivos().ConsecutivoEst()));
    }
    @FXML void actualizarSex_Clic(ActionEvent event) {
        String mensaje = "ACTUALIZACIÓN";
        int codigo = Integer.parseInt(txt_CodSex.getText());
        String descripcion = "'" + txt_DescSex.getText() + "'";
        IndexEstado indexS = new IndexEstado();
        int estado = indexS.indexEst(cbox_EstSex.getSelectionModel().getSelectedItem().getDescripcionEstado());
        String query = "UPDATE tb_sexo SET DescSex=" + descripcion +","+" EstCodGen="+estado+ " WHERE CodSex=" + codigo;
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        rellenarTblSex();
        txt_CodSex.setText(String.valueOf(new Consecutivos().ConsecutivoSex()));
    }
    @FXML void actualizarPobla_Clic(ActionEvent event) {
        String mensaje = "ACTUALIZACIÓN";
        int codigo = Integer.parseInt(txt_CodPobla.getText());
        String descripcion = "'" + txt_DescPobla.getText() + "'";
        //String estado = String.valueOf(cbox_EstPob.getSelectionModel());
        IndexEstado indexS = new IndexEstado();
        int estado = indexS.indexEst(cbox_EstSex.getSelectionModel().getSelectedItem().getDescripcionEstado());
        String query = "UPDATE tb_pobla SET DescPob=" + descripcion + ","+ "EstCodGen="+estado+" WHERE CodPob=" + codigo;
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        rellenarTblPobla();
        txt_CodPobla.setText(String.valueOf(new Consecutivos().ConsecutivoPob()));
    }
    @FXML void eliminarPais_Clic(ActionEvent event) {
        String mensaje = "ELIMINACIÓN";
        String codigo ="'"+ txt_idPais.getText()+"'";
        String query = "DELETE FROM sami.tb_pais WHERE idpaises= " + codigo;
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTbls();
    }
    @FXML void eliminarEstado_Clic(ActionEvent event) {
        String mensaje = "ELIMINACIÓN";
        int codigo = Integer.parseInt(txt_CodEst.getText());
        String query = "DELETE FROM sami.tb_estgen WHERE CodGen= " + codigo;
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTblEstados();
        txt_CodEst.setText(String.valueOf(new Consecutivos().ConsecutivoEst()));
    }
    @FXML void eliminarSex_Clic(ActionEvent event) {
        String mensaje = "ELIMINACIÓN";
        int codigo = Integer.parseInt(txt_CodSex.getText());
        String query = "DELETE FROM sami.tb_sexo WHERE CodSex= " + codigo;
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTblSex();
        txt_CodSex.setText(String.valueOf(new Consecutivos().ConsecutivoSex()));
    }
    @FXML void eliminarPobla_Clic(ActionEvent event) {
        String mensaje = "ELIMINACIÓN";
        int codigo = Integer.parseInt(txt_CodPobla.getText());
        String query = "DELETE FROM sami.tb_pobla WHERE CodPob= " + codigo;
        QueryConsulta queryConsulta = new QueryConsulta();
        queryConsulta.ejecutarQuery(query, mensaje);
        listaEst();
        rellenarTblPobla();
        txt_CodPobla.setText(String.valueOf(new Consecutivos().ConsecutivoPob()));
    }


//Sirven para llamarse de manera separada despues de eventos de CRUD
    public void rellenarTblEstados() {
        estados.clear();
        cargarDatosEst();
        tbl_Estados.setItems(estados);
    }
    public void rellenarTblSex() {
        sexo.clear();
        tbl_Sexo.setItems(sexo);
        cargarDatosSex();
    }
    public void rellenarTblPobla() {
        poblacion.clear();
        tbl_Pobla.setItems(poblacion);
        cargarDatosPobla();
    }
    @FXML private void seleccionarItemTblPais_clic(MouseEvent event) {
        cbox_EstPais.getItems().removeAll(cbox_EstPais.getItems());
        int index=tbl_Pais.getSelectionModel().getSelectedIndex();
        txt_idPais.setText(col_idPais.getCellData(index));
        txt_nombrePais.setText(col_NomPais.getCellData(index));
        listaEst();
    }
    @FXML private void seleccionarItemTblDepto_clic(MouseEvent event) {
        cbox_EstDepto.getItems().removeAll(cbox_EstDepto.getItems());
        int index=tbl_Depto.getSelectionModel().getSelectedIndex();
        String indexS=tbl_Depto.getSelectionModel().getSelectedItem().getIdpais();
        txt_idDepto.setText(col_idDepto.getCellData(index));
        cbox_PaisAs.setPromptText(indexS);
        txt_nombreDepto.setText(col_NomDepto.getCellData(index));
        listaEst();
    }
    @FXML private void seleccionarItemTblMunic_clic(MouseEvent event) {
        cbox_EstMcpio.getItems().removeAll(cbox_EstMcpio.getItems());
        int index=tbl_Mcpio.getSelectionModel().getSelectedIndex();
        String indexS=tbl_Mcpio.getSelectionModel().getSelectedItem().getIddepto();
        txt_idMcpio.setText(col_idMcpio.getCellData(index));
        cbox_DeptoAs.setPromptText(indexS);
        txt_nombreMcipio.setText(col_NomMcpio.getCellData(index));
        listaEst();
    }
    @FXML private void seleccionarItemTblBarrio_clic(MouseEvent event) {
        cbox_EstBarrio.getItems().removeAll(cbox_EstBarrio.getItems());
        int index=tbl_Barrios.getSelectionModel().getSelectedIndex();
        String indexS=tbl_Barrios.getSelectionModel().getSelectedItem().getIddepto();
        String indexM=tbl_Barrios.getSelectionModel().getSelectedItem().getIdmunicipio();
        txt_idBarrio.setText(col_idBarrio.getCellData(index));
        cbox_DeptoAsBr.setPromptText(indexS);
        cbox_MunicAsBr.setPromptText(indexM);
        txt_nombreBarrio.setText(col_NomBarrio.getCellData(index));
        listaEst();
    }
    @FXML private void seleccionarItemTblEst_clic(MouseEvent event) {
        int index = tbl_Estados.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        } else {
            txt_CodEst.setText(col_CodEst.getCellData(index).toString());
            txt_DescEst.setText(col_DescEst.getCellData(index));
        }
    }
    @FXML private void seleccionarItemTblSex_clic(MouseEvent event) {
        cbox_EstSex.getItems().removeAll(cbox_EstSex.getItems());
        int index = tbl_Sexo.getSelectionModel().getSelectedIndex();
        //Con esta instrucción se obtiene el contenido de la celda
        int index2 = Integer.parseInt(tbl_Sexo.getSelectionModel().getSelectedItem().getDescripcionEstado());
        if (index <= -1) {
            return;
        } else {
            txt_CodSex.setText(col_CodSex.getCellData(index).toString());
            txt_DescSex.setText(col_DescSex.getCellData(index));
            //JOptionPane.showMessageDialog(null,"Ir a buscar el texto del estado");
            listaEst();
            cbox_EstSex.setPromptText(new IndexEstado().textoEstado(index2));
            //txt_CodSex.setEditable(true);
        }
    }
    @FXML private void seleccionarItemTblPobla_clic(MouseEvent event) {

        int index = tbl_Pobla.getSelectionModel().getSelectedIndex();
        int index2 = Integer.parseInt(tbl_Sexo.getSelectionModel().getSelectedItem().getDescripcionEstado());
        if (index <= -1) {
            return;
        } else {
            txt_CodPobla.setText(col_CodPobla.getCellData(index).toString());
            txt_DescPobla.setText(col_DescPobla.getCellData(index));
            cbox_EstPob.setPromptText(new IndexEstado().textoEstado(index2));
        }
    }


    public void cambioventana(ActionEvent event) {
        Node evento = (Node) event.getSource();
        String nombremodulo= evento.getId();
        if (event.getSource() == btn_paises) {
            panel_paises.setVisible(true);
            panel_estados.setVisible(false);
            panel_TpSalarios.setVisible(false);
            panel_Parametro_Costo.setVisible(false);
            panel_Parametro_Regimen.setVisible(false);
            panel_Parametro_CtratiyAreas.setVisible(false);

        } else if (event.getSource() == btn_estados) {
            panel_paises.setVisible(false);
            panel_estados.setVisible(true);
            panel_TpSalarios.setVisible(false);
            panel_Parametro_Costo.setVisible(false);
            panel_Parametro_Regimen.setVisible(false);
            panel_Parametro_CtratiyAreas.setVisible(false);
            valorlabelmodulo();
        }else if (event.getSource() == btn_tpSala) {
            panel_paises.setVisible(false);
            panel_estados.setVisible(false);
            panel_TpSalarios.setVisible(true);
            panel_Parametro_Costo.setVisible(false);
            panel_Parametro_Regimen.setVisible(false);
            panel_Parametro_CtratiyAreas.setVisible(false);
            valorlabelmodulo();
        }else if (event.getSource() == btn_tpcontractuales) {
            panel_paises.setVisible(false);
            panel_estados.setVisible(false);
            panel_TpSalarios.setVisible(false);
            panel_Parametro_CtratiyAreas.setVisible(true);
            panel_Parametro_Costo.setVisible(false);
            panel_Parametro_Regimen.setVisible(false);
            valorlabelmodulo();
        }else if (event.getSource() == btn_tpcosto) {
            panel_paises.setVisible(false);
            panel_estados.setVisible(false);
            panel_TpSalarios.setVisible(false);
            panel_Parametro_CtratiyAreas.setVisible(false);
            panel_Parametro_Costo.setVisible(true);
            panel_Parametro_Regimen.setVisible(false);
            valorlabelmodulo();

        }else if (event.getSource() == btn_tpRegimen) {
            panel_paises.setVisible(false);
            panel_estados.setVisible(false);
            panel_TpSalarios.setVisible(false);
            panel_Parametro_Costo.setVisible(false);
            panel_Parametro_CtratiyAreas.setVisible(false);
            panel_Parametro_Regimen.setVisible(true);
            valorlabelmodulo();
        }


    }

}

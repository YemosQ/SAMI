package controllers.Contabilidad;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CentrosdeCostosC {
    @FXML private Button btn_ActualizarCc;
    @FXML private Button btn_ActualizarClase;
    @FXML private Button btn_ActualizarSClase;
    @FXML private Button btn_ActualizarTpCosto;
    @FXML private Button btn_AgregarCc;
    @FXML private Button btn_AgregarClase;
    @FXML private Button btn_AgregarSClase;
    @FXML private Button btn_AgregarTpCosto;
    @FXML private Button btn_EliminarCc;
    @FXML private Button btn_EliminarClase;
    @FXML private Button btn_EliminarSClase;
    @FXML private Button btn_EliminarTpCosto;
    @FXML private ComboBox<?> cbox_CodClase;
    @FXML private ComboBox<?> cbox_CodSClaseAs;
    @FXML private ComboBox<?> cbox_EstCCosto;
    @FXML private ComboBox<?> cbox_EstClase;
    @FXML private ComboBox<?> cbox_EstSClase;
    @FXML private ComboBox<?> cbox_EstTpCosto;
    @FXML private ComboBox<?> cbox_anioCc;
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
    @FXML private TableColumn<?, ?> col_NomTpCosto;
    @FXML private TableColumn<?, ?> col_SClaseAs;
    @FXML private TableColumn<?, ?> col_anioCc;
    @FXML private TableView<?> tbl_CCosto;
    @FXML private TableView<?> tbl_Clase;
    @FXML private TableView<?> tbl_SubClase;
    @FXML private TableView<?> tbl_TpCosto;
    @FXML private TextField txt_CodCcosto;
    @FXML private TextField txt_CodClase;
    @FXML private TextField txt_CodSClase;
    @FXML private TextField txt_NomCCosto;
    @FXML private TextField txt_NomClase;
    @FXML private TextField txt_NomSClase;
    @FXML private TextField txt_NomTpCosto;
    @FXML private TextField txt_TpCosto;




}

package controllers.Nomina.Otros;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class TurnosYHorariosC {




    @FXML
    private Button btn_;

    @FXML private Button btn_Cerrar;

    @FXML private Button btn_EliHrio;

    @FXML private Button btn_EliTurno;

    @FXML private Button btn_actHrio;

    @FXML private Button btn_actTurno;

    @FXML private Button btn_agrHrio;

    @FXML private Button btn_agrTurno;

    @FXML private Button btn_minimizar;

    @FXML private Button btn_paises;

    @FXML private ComboBox<?> cbox_EstHrio;

    @FXML private ComboBox<?> cbox_EstTurno;

    @FXML private ComboBox<?> cbox_TpHrio;

    @FXML private ComboBox<?> cbox_TpTurno;



    @FXML
    private TableView<?> tbl_TpHorarios;

    @FXML
    private TableView<?> tbl_TpTurno;

    @FXML
    private TableColumn<?, ?> col_CodHrio;

    @FXML
    private TableColumn<?, ?> col_CodTurno;

    @FXML
    private TableColumn<?, ?> col_DescHrio;

    @FXML
    private TableColumn<?, ?> col_DescTurno;

    @FXML
    private TableColumn<?, ?> col_EstHrio;

    @FXML
    private TableColumn<?, ?> col_EstTurno;

    @FXML
    private TableColumn<?, ?> col_HraFinDesc;

    @FXML
    private TableColumn<?, ?> col_HraIng;

    @FXML
    private TableColumn<?, ?> col_HraIniDes;

    @FXML
    private TableColumn<?, ?> col_HraSal;

    @FXML
    private TableColumn<?, ?> col_TotalHoras;



    @FXML
    private AnchorPane panel_Horarios;






    @FXML
    private TextField txt_DscTpHrio;

    @FXML
    private TextField txt_DscTpTurno;





    @FXML
    void llamarPaises(KeyEvent event) {

    }
    @FXML public void cerrar_Clic(javafx.event.ActionEvent event){
        Stage myStage = (Stage) this.panel_Horarios.getScene().getWindow();
        myStage.close();
    }
    @FXML public void minimizar_Clic(javafx.event.ActionEvent event){
        Stage myStage = (Stage) this.panel_Horarios.getScene().getWindow();
        myStage.setIconified(true);
    }

    @FXML
    void seleccionarItemTblSex_clic(MouseEvent event) {

    }

}

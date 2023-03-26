package controllers.Nomina.Otros;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.MoverPanel;

import java.net.URL;
import java.util.ResourceBundle;

public class VinculacionesC implements Initializable, MoverPanel.DraggedScene {
        @FXML
        private Button btn_Cerrar;

        @FXML
        private Button btn_ConceptosSGSSS;

        @FXML
        private Button btn_RiesgoARL;

        @FXML
        private Button btn_Vinculaciones;

        @FXML
        private Button btn_actGrpT;

        @FXML
        private Button btn_actRiesgo;

        @FXML
        private Button btn_agrGrpT;

        @FXML
        private Button btn_agrRiesgo;

        @FXML
        private Button btn_eliGrpT;

        @FXML
        private Button btn_eliRiesgo;

        @FXML
        private Button btn_minimizar;

        @FXML
        private ComboBox<?> cbox_EstGrpT;

        @FXML
        private ComboBox<?> cbox_EstRiesgo;

        @FXML
        private TableColumn<?, ?> col_EstGrpT;

        @FXML
        private TableColumn<?, ?> col_Nivel_Riesgo;

        @FXML
        private TableColumn<?, ?> col_NomGrpT;

        @FXML
        private TableColumn<?, ?> col_idGrpT;

        @FXML
        private TableView<?> tbl_GrupoT;

        @FXML
        private AnchorPane panel_Vinculados;

        @FXML
        private TextField txt_AFP;

        @FXML
        private TextField txt_ARL;

        @FXML
        private TextField txt_CCF;

        @FXML
        private TextField txt_EPS;

        @FXML
        private TextField txt_FondoCes;

        @FXML
        private TextField txt_ICBF;

        @FXML
        private TextField txt_IntCes;

        @FXML
        private TextField txt_Prima;

        @FXML
        private TextField txt_SENA;

        @FXML
        private TextField txt_Vacaciones;

        @FXML
        private TextField txt_VlrRiesgo;

        @FXML
        private TextField txt_idGrpT;

        @FXML
        private TextField txt_idRiesgo;

        @FXML
        private TextField txt_nombreGrpT;


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                this.onDraggedScene(this.panel_Vinculados); //Permite mover el panel
        }

        @FXML
        public void minimizar_Clic(ActionEvent event) {
                Stage myStage = (Stage) this.panel_Vinculados.getScene().getWindow();
                myStage.setIconified(true);
        }

        @FXML
        void cerrar_Clic() {
                Stage myStage = (Stage) this.btn_Cerrar.getScene().getWindow();
                myStage.close();
        }

        @FXML
        void llamarEstado(KeyEvent event) {


        }

}
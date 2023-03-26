package util;


import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.File;

public class ImportarImagen {

    private Image imagen;
    private AnchorPane panelcontenedor;

    public Image importimagen(){
        FileChooser open = new FileChooser();
        panelcontenedor=new AnchorPane();
        Stage scene=new Stage();
        open.setTitle("Abrir Imagen");
        open.getExtensionFilters().add(new FileChooser.ExtensionFilter("Archivo de imagen", "*png","*jpg"));


        return imagen;
    }
}

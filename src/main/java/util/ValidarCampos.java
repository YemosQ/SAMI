package util;

import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCampos {
    private String txt_obligatorio;

    public static boolean verificar_email(String correo){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(correo);
        return matcher.find();
    }

    public ValidarCampos(TextField txt_obligatorio) {
        this.txt_obligatorio = String.valueOf(txt_obligatorio);
    }

    public String getTxt_obligatorio() {
        return txt_obligatorio;
    }

    public void setTxt_obligatorio(String txt_obligatorio) {
        this.txt_obligatorio = txt_obligatorio;
    }

    public ValidarCampos campoObligatorio(TextField txt_Nombre){
        ValidarCampos validarCampos = new ValidarCampos(txt_Nombre);
        System.out.println("Conexión correcta");
        return validarCampos;
    }
}

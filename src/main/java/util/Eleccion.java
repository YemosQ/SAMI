package util;


import controllers.PaisesCiudades.EmergentesEstadosPaisesC;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;

public class Eleccion {
    AnchorPane p1; //formulario 1
    AnchorPane p2; //formulario 2

    public String idevento(String evento){
        EmergentesEstadosPaisesC panel = new EmergentesEstadosPaisesC();
        if (evento.equals("cbox_CPaiNa")){
            JOptionPane.showMessageDialog(null,"Llama al evento y el valor recibido es: "+evento);
        }
        return evento;
    }



}

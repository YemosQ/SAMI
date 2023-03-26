package util;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

public final class Fecha {
    //LocalDate a long
    public static long getFechaLong(LocalDate fecha){
        String dia = String.valueOf(fecha.getDayOfMonth());
        String mes = String.valueOf(fecha.getMonthValue());
        String anio = String.valueOf(fecha.getYear());
        String fechaString = dia+"/"+mes+"/"+anio+" 00:00:00";
        //Convertir la fecha en formato DATE
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date;
        long millis;
        try {
            date=sdf.parse(fechaString);
            millis=date.getTime();
        }catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error al convertir de LocalDate a long "+ ex);
            Optional<ButtonType> action = alert.showAndWait();
            millis=0;
            throw new RuntimeException(ex);
        }
        return millis;
    }
    //long a LocalDate
    public static LocalDate getFechaLocalDate(long millis){
        return new java.sql.Date(millis).toLocalDate();
    }

    //long a String
    public static String getFechaString(long millis){
        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    //Convertir de LocalDate a String
    public static String LocalDateAString(LocalDate fecha) {
        String dia = String.valueOf(fecha.getDayOfMonth());
        String mes = String.valueOf(fecha.getMonthValue());
        String anio = String.valueOf(fecha.getYear());
        String fechaString = dia + "/" + mes + "/" + anio + " 00:00:00";
        //Convertir la fecha en formato DATE
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date;
        long millis;
        try {
            date = sdf.parse(fechaString);
            millis = date.getTime();
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error al convertir de LocalDate a long " + ex);
            Optional<ButtonType> action = alert.showAndWait();
            millis = 0;
            throw new RuntimeException(ex);
        }
        date = new Date(millis);
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
}

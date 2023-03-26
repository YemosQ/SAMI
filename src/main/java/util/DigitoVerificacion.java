package util;

import javafx.scene.control.TextField;

public class DigitoVerificacion extends TextField {
    public DigitoVerificacion(){
        super();
        this.setPromptText("Nit o Cc");
    }
    public int setNumeroIdentificacion(String TpDoc,String Doc) {
        int dv = Integer.parseInt(calcularDigitoVerificacion(TpDoc,Doc));
        //JOptionPane.showMessageDialog(null,"Entre2");
        //this.setText(numeroIdentificacion + "-" + dv);
        return dv;
    }

    public static String calcularDigitoVerificacion(String TpDoc, String Doc) {
        int suma = 0;
        int DvI = 0;
        int DvP = 0;
        int DvR = 0;
        int Dv = 0;
        if (TpDoc.equals("NIT")) {
            for (int i = 0; i < Doc.length(); i += 2) {
                int digito = Character.getNumericValue(Doc.charAt(i));
                suma += digito;
                DvI = suma * 3;
            }
            suma = 0;
            for (int i = 1; i < Doc.length(); i += 2) {
                int digito = Character.getNumericValue(Doc.charAt(i));
                suma += digito;
                DvP = suma;
            }
            DvR = DvI + DvP;
            int DR = (int) Math.ceil(DvR / 10.0) * 10;
            Dv = DR - DvR;
            return String.valueOf(Dv);
        } ;
        if(TpDoc.equals("NI")){
            int[] serie = {41, 37, 29, 23, 19, 17, 13, 7, 3};
            suma = 0;
            int result;
            for (int i = 0; i < Doc.length(); i++) {
                char c = Doc.charAt(i);
                int valor = Character.getNumericValue(c);
                int multiplicador = serie[i];
                suma += valor * multiplicador;
                //System.out.println(valor + "x" + multiplicador + "=" + (valor * multiplicador));
                //System.out.println("Valor de la suma es: " + suma);
            }
            double cociente = (double) suma / 11;
            //System.out.println("Este es el cociente: " + cociente);
            double parteEntera = Math.floor(cociente);
            //System.out.println("Esta es la parte entera: " + parteEntera);
            double parteDecimal = cociente - parteEntera;
            //System.out.println("Esta es la parte decimal: " + parteDecimal);
            double resultado = parteDecimal * 11;
            //System.out.println("Este es el resultado: " + resultado);
            int entero = (int) Math.round(resultado);
            //System.out.println("Valor de entero: " + entero);
            if (entero == 1 || entero == 0) {
                result = entero;
            } else {
                result = 11 - entero;
            }
            return String.valueOf(result);
        } else {
            //Retorna correctamente valores de cedulas
            int[] serie = {71, 67, 59, 53, 47, 43, 41, 37, 29, 23, 19, 17, 13, 7, 3};
            suma = 0;
            int result;
            for (int i = 0; i < Doc.length(); i++) {
                char c = Doc.charAt(i);
                int valor = Character.getNumericValue(c);
                int multiplicador = serie[i];
                suma += valor * multiplicador;
                //System.out.println(valor + "x" + multiplicador + "=" + (valor * multiplicador));
                //System.out.println("Valor de la suma es: " + suma);
            }
            double cociente = (double) suma / 11;
            //System.out.println("Este es el cociente: " + cociente);
            double parteEntera = Math.floor(cociente);
            //System.out.println("Esta es la parte entera: " + parteEntera);
            double parteDecimal = cociente - parteEntera;
            //System.out.println("Esta es la parte decimal: " + parteDecimal);
            double resultado = parteDecimal * 11;
            //System.out.println("Este es el resultado: " + resultado);
            int entero = (int) Math.round(resultado);
           // System.out.println("Valor de entero: " + entero);
            if (entero == 1 || entero == 0) {
                result = entero;
            } else {
                result = 11 - entero;
            }
            return String.valueOf(result);
        }
    }

}

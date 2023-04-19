package util;

import conexion.Conexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Puc {

    Connection con=null;
    private String codigopuc;
    private String nombrepuc;
    private String estadopuc;

    public ObservableList<Puc> puc= FXCollections.observableArrayList();

    public Puc() {

    }

    public Puc(String CodPuc, String DescPuc, String CodGen) {
        this.codigopuc=CodPuc;
        this.nombrepuc=DescPuc;
        this.estadopuc=CodGen;
    }

    public String getCodigopuc() {
        return codigopuc;
    }

    public void setCodigopuc(String codigopuc) {
        this.codigopuc = codigopuc;
    }

    public String getNombrepuc() {
        return nombrepuc;
    }

    public void setNombrepuc(String nombrepuc) {
        this.nombrepuc = nombrepuc;
    }

    public String getEstadopuc() {
        return estadopuc;
    }

    public void setEstadopuc(String estadopuc) {
        this.estadopuc = estadopuc;
    }

    @Override
    public String toString() {
        return "Puc{" +
                "codigopuc='" + codigopuc + '\'' +
                ", nombrepuc='" + nombrepuc + '\'' +
                ", estadopuc='" + estadopuc + '\'' +
                '}';
    }

    public ObservableList<Puc> puc() {
        //System.out.println("Sex3");
        try {
            puc.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT CodPuc, DescPuc, CodGen FROM sami.tb_puc WHERE CodGen='1'");
            //System.out.println("Sex33");
            while (rs.next()){
                //System.out.println("Sex4");
                puc.add(new Puc(
                        rs.getString("CodPuc"),
                        rs.getString("DescPuc"),
                        rs.getString("CodGen")));
            }
            //System.out.println("Lista Sexo: "+sexo);
        }catch (Exception ex){
        }finally{
            try {
                if(con!=null){
                    Conexion.conectar().close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        //System.out.println(sexo);
        return puc;
    }



}

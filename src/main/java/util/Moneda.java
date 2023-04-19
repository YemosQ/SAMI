package util;


import conexion.Conexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.Nomina.UbicacionesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Moneda {
    Connection con=null;
    private String codigomoneda;
    private String nombremoneda;
    private String estadomoneda;

    public ObservableList<Moneda> moneda= FXCollections.observableArrayList();

    public Moneda() {

    }

    public Moneda(String codMon, String descmon, String estCodGen) {
        this.codigomoneda=codMon;
        this.nombremoneda=descmon;
        this.estadomoneda=estCodGen;
    }


    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getCodigomoneda() {
        return codigomoneda;
    }

    public void setCodigomoneda(String codigomoneda) {
        this.codigomoneda = codigomoneda;
    }

    public String getNombremoneda() {
        return nombremoneda;
    }

    public void setNombremoneda(String nombremoneda) {
        this.nombremoneda = nombremoneda;
    }

    public String getEstadomoneda() {
        return estadomoneda;
    }

    public void setEstadomoneda(String estadomoneda) {
        this.estadomoneda = estadomoneda;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "codigomoneda='" + codigomoneda + '\'' +
                ", nombremoneda='" + nombremoneda + '\'' +
                ", estadomoneda='" + estadomoneda + '\'' +
                '}';
    }

    public ObservableList<Moneda> moneda() {
        //System.out.println("Sex3");
        try {
            moneda.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT Mon, DescripcionMon, CodGen FROM sami.tb_moneda WHERE CodGen='1'");
            //System.out.println("Sex33");
            while (rs.next()){
                //System.out.println("Sex4");
                moneda.add(new Moneda(
                        rs.getString("Mon"),
                        rs.getString("DescripcionMon"),
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
        return moneda;
    }


}

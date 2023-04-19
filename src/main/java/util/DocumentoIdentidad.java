package util;

import conexion.Conexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DocumentoIdentidad {


    Connection con=null;
    private String codigoDoc;
    private String nombreDoc;
    private String estadoDoc;
    private String NDocDian;

    public ObservableList<DocumentoIdentidad> tipodoc= FXCollections.observableArrayList();

    public DocumentoIdentidad(String doc, String nDoc, String descDoc, String codGen) {
        this.codigoDoc=doc;
        this.NDocDian=nDoc;
        this.nombreDoc=descDoc;
        this.estadoDoc=codGen;
    }

    public DocumentoIdentidad() {
    }

    public String getCodigoDoc() {
        return codigoDoc;
    }

    public void setCodigoDoc(String codigoDoc) {
        this.codigoDoc = codigoDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getEstadoDoc() {
        return estadoDoc;
    }

    public void setEstadoDoc(String estadoDoc) {
        this.estadoDoc = estadoDoc;
    }

    public String getNDocDian() {
        return NDocDian;
    }

    public void setNDocDian(String NDocDian) {
        this.NDocDian = NDocDian;
    }

    @Override
    public String toString() {
        return "DocumentoIdentidad{" +
                "codigoDoc='" + codigoDoc + '\'' +
                ", nombreDoc='" + nombreDoc + '\'' +
                ", estadoDoc='" + estadoDoc + '\'' +
                ", NDocDian='" + NDocDian + '\'' +
                '}';
    }

    public ObservableList<DocumentoIdentidad> tipodocum() {
        try {
            tipodoc.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT sami.tb_doc.Doc, sami.tb_doc.NDoc, sami.tb_doc.DescDoc, sami.tb_doc.CodGen FROM sami.tb_doc WHERE CodGen='1'");
            //System.out.println("Sex33");
            while (rs.next()){
                //System.out.println("Sex4");
                tipodoc.add(new DocumentoIdentidad(
                        rs.getString("Doc"),
                        rs.getString("NDoc"),
                        rs.getString("DescDoc"),
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
        return tipodoc;
    }



}

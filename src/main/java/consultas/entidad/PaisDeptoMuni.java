package consultas.entidad;

import conexion.Conexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.Nomina.EmergenteEstadosPaisesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaisDeptoMuni {

    public ObservableList<EmergenteEstadosPaisesDAO> paises= FXCollections.observableArrayList();
    public ObservableList<EmergenteEstadosPaisesDAO> departamentos= FXCollections.observableArrayList();
    public ObservableList<EmergenteEstadosPaisesDAO> departamentosDep= FXCollections.observableArrayList();
    public ObservableList<EmergenteEstadosPaisesDAO> municipios= FXCollections.observableArrayList();
    public ObservableList<EmergenteEstadosPaisesDAO> municipiosDep= FXCollections.observableArrayList();
    public ObservableList<EmergenteEstadosPaisesDAO> barrios= FXCollections.observableArrayList();
    public ObservableList<EmergenteEstadosPaisesDAO> barrioDep= FXCollections.observableArrayList();

    Connection con=null;
    public ObservableList<EmergenteEstadosPaisesDAO> listaPaises() {
        try {
            //JOptionPane.showMessageDialog(null,"Dentro del Try de Paises");
            paises.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT idpaises, NomPais, EstCodGen, DescEstGen FROM " +
                    "sami.tb_pais INNER JOIN sami.tb_estgen ON sami.tb_pais.EstCodGen=sami.tb_estgen.CodGen ORDER BY NomPais");
            while (rs.next()){
                paises.add(new EmergenteEstadosPaisesDAO(
                        rs.getString("idpaises"),
                        rs.getString("NomPais"),
                        rs.getInt("EstCodGen"),
                        rs.getString("DescEstGen")));
            }
            //JOptionPane.showMessageDialog(null,"Valor de Paises "+paises);
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
        //JOptionPane.showMessageDialog(null,"Retornando paises: "+paises);
        return paises;
    }
    public ObservableList<EmergenteEstadosPaisesDAO> listaDeptos() {
        try {
            departamentos.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT CodDepto, NomDepto, CodPais, DescEstGen FROM " +
                    "tb_depto INNER JOIN tb_estgen ON tb_depto.EstCodGen=tb_estgen.CodGen ORDER BY NomDepto");
            while (rs.next()){
                departamentos.add(new EmergenteEstadosPaisesDAO(
                        rs.getString("CodDepto"),
                        rs.getString("NomDepto"),
                        rs.getString("CodPais"),
                        rs.getString("DescEstGen")));
            }
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
        return departamentos;
    }
    public ObservableList<EmergenteEstadosPaisesDAO> nomDepto(String nombredepto) {
        try {
            departamentosDep.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT CodDepto FROM sami.tb_depto WHERE NomDepto= '"+nombredepto+"'");
            while (rs.next()){
                departamentosDep.add(new EmergenteEstadosPaisesDAO(
                        rs.getString("CodDepto")));
            }
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
        return departamentosDep;
    }
    public ObservableList<EmergenteEstadosPaisesDAO> nomMuni(String nombremunic) {
        System.out.println("Valor a buscar con el nombre del municipio: "+nombremunic);
        try {
            municipios.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT CodMun FROM sami.tb_munic WHERE NomMun= '"+nombremunic+"'");
            while (rs.next()){
                municipios.add(new EmergenteEstadosPaisesDAO(
                        rs.getString("CodMun")));
            }
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
        System.out.println("Valor de municipios: "+municipios);
        return municipios;
    }
    public ObservableList<EmergenteEstadosPaisesDAO> listaDeptosDep(String idpaises) {
        //JOptionPane.showMessageDialog(null,"Valor idpaises recibido: "+idpaises);
        //JOptionPane.showMessageDialog(null,"Entrando a buscar el nombre del depto");
        try {
            //JOptionPane.showMessageDialog(null,"Entrando al Try");
            departamentosDep.clear();
            Conexion conexion =new Conexion();
            //JOptionPane.showMessageDialog(null,"Conexión realizada");
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            //JOptionPane.showMessageDialog(null,"Despues de la Conexión");
            ResultSet rs = stm.executeQuery("SELECT NomDepto FROM sami.tb_depto WHERE CodPais= " + idpaises + " ORDER BY NomDepto");
            System.out.println(rs);
            //JOptionPane.showMessageDialog(null,"Valor Query: "+rs);
            while (rs.next()){
                departamentosDep.add(new EmergenteEstadosPaisesDAO(
                        rs.getString("NomDepto")));
            }
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
        System.out.println(departamentosDep);
        System.out.println("Datos Obtenidos");
        return departamentosDep;
    }
    public ObservableList<EmergenteEstadosPaisesDAO> listaMuni() {
        try {
            municipios.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT CodMunDpto, CodMun, NomMun,CodDepto, DescEstGen FROM " +
                    "tb_munic INNER JOIN tb_estgen ON sami.tb_munic.EstCodGen=tb_estgen.CodGen ORDER BY NomMun");
            while (rs.next()){
                municipios.add(new EmergenteEstadosPaisesDAO(
                        rs.getString("CodMunDpto"),
                        rs.getString("CodMun"),
                        rs.getString("NomMun"),
                        rs.getString("CodDepto"),
                        rs.getString("DescEstGen")));
            }
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }finally{
            try {
                if(con!=null){
                    Conexion.conectar().close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return municipios;
    }
    public ObservableList<EmergenteEstadosPaisesDAO> listaMuniDep(String coddepto) {
        try {
            municipiosDep.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT NomMun FROM sami.tb_munic WHERE CodDepto ='"+coddepto+"' ORDER BY NomMun");
            //JOptionPane.showMessageDialog(null,"Entrando al while munidep ");
            while (rs.next()){
                municipiosDep.add(new EmergenteEstadosPaisesDAO(rs.getString("NomMun")));}
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }finally{
            try {
                if(con!=null){
                    Conexion.conectar().close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        //JOptionPane.showMessageDialog(null,"Valores encontrados: "+municipiosDep);
        return municipiosDep;
    }

    //    public ObservableList<PaisesDAO> listaConsol() {
//        try {
//            consolidado.clear();
//            Conexion conexion =new Conexion();
//            Connection con= conexion.conectar();
//            Statement stm=con.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT NomPais, NomDepto, NomMun, NomBarrio, DescEstGen FROM " +
//                    "tb_pais " +
//                    "INNER JOIN tb_depto ON tb_pais.idpaises=tb_depto.CodPais " +
//                    "INNER JOIN tb_munic ON tb_depto.CodDepto=tb_munic.CodDepto " +
//                    "INNER JOIN tb_barrio ON tb_munic.CodMun=tb_barrio.CodMun AND tb_depto.CodDepto=tb_barrio.CodDepto "+
//                    "INNER JOIN tb_estgen ON tb_barrio.EstCodGen=tb_estgen.CodGen");
//            while (rs.next()){
//                consolidado.add(new PaisesDAO(
//                        rs.getString("NomPais"),
//                        rs.getString("NomDepto"),
//                        rs.getString("NomMun"),
//                        rs.getString("NomBarrio"),
//                        rs.getString("DescEstGen")));
//            }
//            //JOptionPane.showMessageDialog(null, "Este es el dato de Consolidado "+consolidado);
//        }catch (Exception ex){
//            throw new RuntimeException(ex);
//        }finally{
//            try {
//                if(con!=null){
//                    Conexion.conectar().close();
//                }
//            } catch (SQLException e) {
//                System.err.println(e.getMessage());
//            }
//        }
//        return consolidado;
//    }
    public ObservableList<EmergenteEstadosPaisesDAO> listaBarrios() {
        try {
            barrios.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT idBarrio, NomBarrio, CodDepto, CodMun, DescEstGen FROM tb_barrio " +
                    "INNER JOIN tb_estgen ON tb_barrio.EstCodGen=tb_estgen.CodGen ORDER BY NomBarrio");
            while (rs.next()){
                barrios.add(new EmergenteEstadosPaisesDAO(
                        rs.getString("idBarrio"),
                        rs.getString("NomBarrio"),
                        rs.getString("CodDepto"),
                        rs.getString("CodMun"),
                        rs.getString("DescEstGen")));
            }
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }finally{
            try {
                if(con!=null){
                    Conexion.conectar().close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return barrios;
    }
    public ObservableList<EmergenteEstadosPaisesDAO> listaBarriosDep(String coddepto, String codmunic) {
        try {
            barrioDep.clear();
            Conexion conexion =new Conexion();
            Connection con= conexion.conectar();
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT NomBarrio FROM sami.tb_barrio WHERE " +
                    "CodDepto ='"+coddepto+"' AND CodMun = '"+codmunic+"' ORDER BY NomBarrio");
            while (rs.next()){
                barrioDep.add(new EmergenteEstadosPaisesDAO(
                        rs.getString("NomBarrio")));}
        }catch (Exception ex){throw new RuntimeException(ex);
        }finally{try {if(con!=null){Conexion.conectar().close();}
            } catch (SQLException e) {System.err.println(e.getMessage());}}
        return barrioDep;}



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author kid_d_000
 */
public class Conexion {

    static Connection cx;
    String bd = "bdinah";
    String url = "jdbc:mysql://localhost:3306/" + bd;
    String user = "root";
    String pass = "";
    static String insert = "INSERT INTO regtramite (IDMunicipio,ClaveTramite,Municipio,Localidad,FechadeRecepcion,Estado,"
            + "Guion,DibujoEscala,FotografiaColorInmueble,DocumentacionPropiedad,IdeOficial,JustificacionIdioma,"
            + "DocumentacionRLegal,PlanosMonumento,PlanosDetalles,MemoriaDescriptiva,RegistroResponsable,Alineamiento,"
            + "ConstanciaSuelo,PlanoTopografico,CuadroConst,InfGrafica,DocumentacionExtranjero,CartadePoder,PlanoPlanta,"
            + "FotosPredio,ProyectoFirmado,CedulaRestaurador,FichasCurriculares,Observaciones) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    static Statement sentencia;
    static ResultSet resultado;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx = (Connection) DriverManager.getConnection(url, user, pass);
            sentencia = cx.createStatement();
            System.out.println("Se conectó");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conectó");
        }
        return cx;
    }

    public void desconectar() {
        try {
            cx.close();
            System.out.println("Se desconectó");
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrar la conexión");
        }
    }

    public static ArrayList<String> llenar_combo() {
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT * FROM municipio";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while (resultado.next()) {
                lista.add(resultado.getString("NombreMun"));
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public static void insertar(int idMun, String clave, String mun, String local, java.sql.Date fecha, boolean est,
            ArrayList<JCheckBox> lista, String obs) {
        try {
            PreparedStatement pps = cx.prepareStatement(insert);
            pps.setInt(1, idMun);
            pps.setString(2, clave);
            pps.setString(3, mun);
            pps.setString(4, local);
            pps.setDate(5, fecha);
            pps.setBoolean(6, est);
            pps.setBoolean(7, lista.get(0).isSelected());
            pps.setBoolean(8, lista.get(1).isSelected());
            pps.setBoolean(9, lista.get(2).isSelected());
            pps.setBoolean(10, lista.get(3).isSelected());
            pps.setBoolean(11, lista.get(4).isSelected());
            pps.setBoolean(12, lista.get(5).isSelected());
            pps.setBoolean(13, lista.get(6).isSelected());
            pps.setBoolean(14, lista.get(7).isSelected());
            pps.setBoolean(15, lista.get(8).isSelected());
            pps.setBoolean(16, lista.get(9).isSelected());
            pps.setBoolean(17, lista.get(10).isSelected());
            pps.setBoolean(18, lista.get(11).isSelected());
            pps.setBoolean(19, lista.get(12).isSelected());
            pps.setBoolean(20, lista.get(13).isSelected());
            pps.setBoolean(21, lista.get(14).isSelected());
            pps.setBoolean(22, lista.get(15).isSelected());
            pps.setBoolean(23, lista.get(16).isSelected());
            pps.setBoolean(24, lista.get(17).isSelected());
            pps.setBoolean(25, lista.get(18).isSelected());
            pps.setBoolean(26, lista.get(19).isSelected());
            pps.setBoolean(27, lista.get(20).isSelected());
            pps.setBoolean(28, lista.get(21).isSelected());
            pps.setBoolean(29, lista.get(22).isSelected());
            pps.setString(30, obs);

            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author @BrunoDev, BrunoBeltreGuzman
 */
public class UI {
    private static String Url = "jdbc:ucanaccess://C:\\BDUI.accdb";
    private static boolean booUI = true;
    
    public void getUI() {
        
        try {
           
            Connection conexion = DriverManager.getConnection(Url);
            Statement st = (Statement) conexion.createStatement();
            String sql = "SELECT * FROM tablaUI WHERE id LIKE '%" + 1 + "%'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                String UI = rs.getString("UI");
                
                if(UI.equalsIgnoreCase("Dark")){
                    booUI = true;
                }else{
                   booUI = false; 
                }

            } else {
                JOptionPane.showMessageDialog(null, "UI no registrado *", "Error", WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de Base de Datos al buscar *, ", "ERROR Buscar", ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Error: " + e, "ERROR Buscar", ERROR_MESSAGE);
        }
        }

   

    public static boolean getBooUI() {
        return booUI;
    }
    
    
 }

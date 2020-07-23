/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import UI.UI;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author @BrunoDev, BrunoBeltreGuzman
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    UI ui = new UI();

    Color ColorLight = new Color(196 - 50, 196 - 50, 196 - 50);
    Color ColorDark = new Color(51, 51, 51);

    Color ColorfondoLight = new Color(60, 63, 65);
    Color ColorfondoDark = new Color(255, 255, 255);

    public Ventana() {
        initComponents();
        setTitle("@BrunoDev - DarkUI vs LightUI");
        this.setLocationRelativeTo(null);

        sep1.setVisible(false);

        ui.getUI();

        if (ui.getBooUI() == true) {
            DarkUI();
        } else {
            LightUI();
        }
    }

    public void DarkUI() {

        Color Colorfondo = new Color(60, 63, 65);
        Color Colorfondo2 = new Color(60 - 10, 63 - 10, 65 - 10);
        Color ColorLetraMenu = new Color(255, 255, 255);
        Color ColorLetra = new Color(196 - 10, 196 - 10, 196 - 10);
        Color ColorLetra3 = new Color(196 - 50, 196 - 50, 196 - 50);
        Color ColorLetra2 = new Color(215, 52, 57);

        Color ColorRojo = new Color(215, 52, 57);

        jpHome.setBackground(Colorfondo2);
        jpMenu.setBackground(Colorfondo);

        Logo.setForeground(ColorRojo);

        sep.setBackground(ColorRojo);
        sep1.setBackground(ColorRojo);

        etq1.setForeground(ColorLetraMenu);
        etq2.setForeground(ColorLetraMenu);
        etq3.setForeground(ColorLetraMenu);
        etq4.setForeground(ColorLetraMenu);
        etq5.setForeground(ColorLetraMenu);
        etq6.setForeground(ColorLetraMenu);

        tex1.setForeground(ColorLetra);
        tex2.setForeground(ColorLetra);
        tex3.setForeground(ColorLetra);
        tex4.setForeground(ColorLetra);
        tex5.setForeground(ColorLetra);
        tex6.setForeground(ColorLetra);
        tex7.setForeground(ColorLetra);
        tex8.setForeground(ColorLetra);
        tex9.setForeground(ColorLetra);
        tex10.setForeground(ColorLetra);
        tex11.setForeground(ColorLetra);
        tex12.setForeground(ColorLetra);

        texB1.setForeground(ColorLetraMenu);
        texB2.setForeground(ColorLetraMenu);
        texB3.setForeground(ColorLetraMenu);
        texB4.setForeground(ColorLetra2);
        texB5.setForeground(ColorLetraMenu);
        texB6.setForeground(ColorLetraMenu);
        texB7.setForeground(ColorLetraMenu);

        texB4.setBorder(new javax.swing.border.LineBorder(ColorLetra2, 1, true));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sunDark.png")));

        btnTrailer.setForeground(ColorLetra3);
        btnTrailer.setBorder(new javax.swing.border.LineBorder(ColorLetra3, 2, true));
        btnTrailer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/video2.png")));

        btnRe.setForeground(ColorLetra3);
        btnRe.setBorder(new javax.swing.border.LineBorder(ColorLetra3, 2, true));
        btnRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera2.png")));

    }

    public void LightUI() {

        Color Colorfondo = new Color(255, 255, 255);
        Color Colorfondo2 = new Color(255 - 10, 255 - 10, 255 - 10);
        Color ColorLetraMenu = new Color(0, 0, 0);
        Color ColorLetra = new Color(102, 102, 102);
        Color ColorLetra3 = new Color(196 - 50, 196 - 50, 196 - 50);
        Color ColorLetra2 = new Color(51, 51, 51);

        Color ColorRojo = new Color(215, 52, 57);

        jpHome.setBackground(Colorfondo);
        jpMenu.setBackground(Colorfondo2);

        Logo.setForeground(ColorRojo);

        sep.setBackground(ColorRojo);
        sep1.setBackground(ColorRojo);

        etq1.setForeground(ColorLetraMenu);
        etq2.setForeground(ColorLetraMenu);
        etq3.setForeground(ColorLetraMenu);
        etq4.setForeground(ColorLetraMenu);
        etq5.setForeground(ColorLetraMenu);
        etq6.setForeground(ColorLetraMenu);

        tex1.setForeground(ColorLetra);
        tex2.setForeground(ColorLetra);
        tex3.setForeground(ColorLetra);
        tex4.setForeground(ColorLetra);
        tex5.setForeground(ColorLetra);
        tex6.setForeground(ColorLetra);
        tex7.setForeground(ColorLetra);
        tex8.setForeground(ColorLetra);
        tex9.setForeground(ColorLetra);
        tex10.setForeground(ColorLetra);
        tex11.setForeground(ColorLetra);
        tex12.setForeground(ColorLetra);

        texB1.setForeground(ColorLetra2);
        texB2.setForeground(ColorLetra2);
        texB3.setForeground(ColorLetra2);
        texB4.setForeground(ColorRojo);
        texB5.setForeground(ColorLetra2);
        texB6.setForeground(ColorLetra2);
        texB7.setForeground(ColorLetra2);

        texB4.setBorder(new javax.swing.border.LineBorder(ColorRojo, 1, true));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sunLigth.png")));

        btnTrailer.setForeground(ColorLetra2);
        btnTrailer.setBorder(new javax.swing.border.LineBorder(ColorLetra2, 2, true));
        btnTrailer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/video1.png")));

        btnRe.setForeground(ColorLetra2);
        btnRe.setBorder(new javax.swing.border.LineBorder(ColorLetra2, 2, true));
        btnRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera1.png")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        texB7 = new javax.swing.JLabel();
        tex3 = new javax.swing.JLabel();
        tex4 = new javax.swing.JLabel();
        texB1 = new javax.swing.JLabel();
        texB3 = new javax.swing.JLabel();
        tex8 = new javax.swing.JLabel();
        texB4 = new javax.swing.JLabel();
        texB5 = new javax.swing.JLabel();
        btnRe = new javax.swing.JButton();
        btnTrailer = new javax.swing.JButton();
        tex1 = new javax.swing.JLabel();
        tex2 = new javax.swing.JLabel();
        texB6 = new javax.swing.JLabel();
        texB2 = new javax.swing.JLabel();
        tex10 = new javax.swing.JLabel();
        tex9 = new javax.swing.JLabel();
        tex12 = new javax.swing.JLabel();
        tex11 = new javax.swing.JLabel();
        tex5 = new javax.swing.JLabel();
        tex7 = new javax.swing.JLabel();
        tex6 = new javax.swing.JLabel();
        jpMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        etq6 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        etq1 = new javax.swing.JLabel();
        etq2 = new javax.swing.JLabel();
        etq3 = new javax.swing.JLabel();
        etq4 = new javax.swing.JLabel();
        etq5 = new javax.swing.JLabel();
        sep = new javax.swing.JLabel();
        sep1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setMinimumSize(new java.awt.Dimension(1200, 675));
        jpHome.setPreferredSize(new java.awt.Dimension(1200, 675));
        jpHome.setLayout(new java.awt.GridBagLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 675));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 675));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/the-call-of-the-wild-4k.jpg"))); // NOI18N
        l.setText(".");
        jPanel1.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 405, 600));

        texB7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texB7.setForeground(new java.awt.Color(51, 51, 51));
        texB7.setText("Kelly, Michael Horse, Karen Gillan, Colin Woodell, Micah Fitzgerald, Heather McPhaul");
        jPanel1.add(texB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        tex3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex3.setForeground(new java.awt.Color(102, 102, 102));
        tex3.setText("libre por la naturaleza.");
        jPanel1.add(tex3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        tex4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex4.setForeground(new java.awt.Color(102, 102, 102));
        tex4.setText("Titulo:  El llamado salvaje | La llamada de lo salvaje (castellano) | O chamado da floresta");
        jPanel1.add(tex4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        texB1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texB1.setForeground(new java.awt.Color(51, 51, 51));
        texB1.setText("The Call of the Wild");
        jPanel1.add(texB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 180, 140, -1));

        texB3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texB3.setForeground(new java.awt.Color(51, 51, 51));
        texB3.setText("Aventura | Drama | Familiar");
        jPanel1.add(texB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 250, 190, -1));

        tex8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex8.setForeground(new java.awt.Color(102, 102, 102));
        tex8.setText("Audio: Latino e Inglés subtitulada");
        jPanel1.add(tex8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        texB4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texB4.setForeground(new java.awt.Color(255, 51, 51));
        texB4.setText(" 4K Ultra HD HDR ");
        texB4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        jPanel1.add(texB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        texB5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texB5.setForeground(new java.awt.Color(51, 51, 51));
        texB5.setText(" Chris Sanders");
        jPanel1.add(texB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        btnRe.setBackground(new java.awt.Color(255, 0, 0));
        btnRe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRe.setForeground(new java.awt.Color(255, 0, 0));
        btnRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera-movie-regular-24.png"))); // NOI18N
        btnRe.setText("Reproducir ");
        btnRe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        btnRe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRe.setOpaque(false);
        btnRe.setVerifyInputWhenFocusTarget(false);
        btnRe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReMouseExited(evt);
            }
        });
        btnRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReActionPerformed(evt);
            }
        });
        jPanel1.add(btnRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 180, 35));

        btnTrailer.setBackground(new java.awt.Color(255, 0, 0));
        btnTrailer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnTrailer.setForeground(new java.awt.Color(255, 0, 0));
        btnTrailer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/video-regular-36.png"))); // NOI18N
        btnTrailer.setText("Ver trailer ");
        btnTrailer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        btnTrailer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrailer.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnTrailer.setOpaque(false);
        btnTrailer.setVerifyInputWhenFocusTarget(false);
        btnTrailer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrailerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrailerMouseExited(evt);
            }
        });
        btnTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrailerActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrailer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 180, 35));

        tex1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex1.setForeground(new java.awt.Color(102, 102, 102));
        tex1.setText("Buck, un perro secuestrado de su hogar en California y llevado a Yukon, donde un ");
        jPanel1.add(tex1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        tex2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex2.setForeground(new java.awt.Color(102, 102, 102));
        tex2.setText("buscador de oro lo descubre. Allí, Buck se convierte en un perro de trineo y corre");
        jPanel1.add(tex2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        texB6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texB6.setForeground(new java.awt.Color(51, 51, 51));
        texB6.setText(" Harrison Ford, Omar Sy, Cara Gee, Dan Stevens, Bradley Whitford, Jean Louisa");
        jPanel1.add(texB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 410, 560, -1));

        texB2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texB2.setForeground(new java.awt.Color(51, 51, 51));
        texB2.setText("6.8/10 de 18,903 votos");
        jPanel1.add(texB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 210, 160, -1));

        tex10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex10.setForeground(new java.awt.Color(51, 51, 51));
        tex10.setText("| Full HD Bluray");
        jPanel1.add(tex10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        tex9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex9.setForeground(new java.awt.Color(102, 102, 102));
        tex9.setText("Calidad:");
        jPanel1.add(tex9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        tex12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex12.setForeground(new java.awt.Color(102, 102, 102));
        tex12.setText("Elenco:");
        jPanel1.add(tex12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        tex11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex11.setForeground(new java.awt.Color(102, 102, 102));
        tex11.setText("Director:");
        jPanel1.add(tex11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        tex5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex5.setForeground(new java.awt.Color(102, 102, 102));
        tex5.setText("(português) | ");
        jPanel1.add(tex5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        tex7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex7.setForeground(new java.awt.Color(102, 102, 102));
        tex7.setText("Genero:");
        jPanel1.add(tex7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        tex6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tex6.setForeground(new java.awt.Color(102, 102, 102));
        tex6.setText("IMDb: ");
        jPanel1.add(tex6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jpHome.add(jPanel1, new java.awt.GridBagConstraints());

        getContentPane().add(jpHome, java.awt.BorderLayout.CENTER);

        jpMenu.setBackground(new java.awt.Color(251, 251, 251));
        jpMenu.setMinimumSize(new java.awt.Dimension(1200, 75));
        jpMenu.setPreferredSize(new java.awt.Dimension(1200, 75));
        jpMenu.setLayout(new java.awt.GridBagLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 75));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 75));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/gifLoading.gif"))); // NOI18N
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
        });
        jPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 15, 40, 40));

        etq6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq6.setText("Suspenso");
        etq6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(etq6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        Logo.setBackground(new java.awt.Color(255, 0, 0));
        Logo.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 0, 0));
        Logo.setText("MOVIES");
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 170, 40));

        etq1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq1.setText("Accion");
        etq1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etq1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq1MouseClicked(evt);
            }
        });
        jPanel2.add(etq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        etq2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq2.setText("Drama");
        etq2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etq2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etq2MouseClicked(evt);
            }
        });
        jPanel2.add(etq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        etq3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq3.setText("Ficcion");
        etq3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(etq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        etq4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq4.setText("Comedia");
        etq4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(etq4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        etq5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etq5.setText("Terror");
        etq5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(etq5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        sep.setOpaque(true);
        jPanel2.add(sep, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 53, 65, 2));

        sep1.setOpaque(true);
        jPanel2.add(sep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 53, 65, 2));

        jpMenu.add(jPanel2, new java.awt.GridBagConstraints());

        getContentPane().add(jpMenu, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        // TODO add your handling code here:

        String Url = "jdbc:ucanaccess://C:\\BDUI.accdb";

        try {

            Connection conexion = DriverManager.getConnection(Url);
            PreparedStatement pst = conexion.prepareStatement("update tablaUI set ui = ? where id = 1");

            if (ui.getBooUI() == true) {
                pst.setString(1, "Light");
            } else {
                pst.setString(1, "Dark");
            }

            pst.executeUpdate();

            //JOptionPane.showMessageDialog(this, "Los datos han sido actualizados correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Los datos NO han sido actualizados correctamente *  " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        ui.getUI();

        if (ui.getBooUI() == true) {
            DarkUI();
        } else {
            LightUI();
        }

    }//GEN-LAST:event_menuMouseClicked

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        // TODO add your handling code here:

        if (ui.getBooUI() == true) {
            menu.setToolTipText("Clic para activar tema Light");
        } else {
            menu.setToolTipText("Clic para activar tema Dark");
        }


    }//GEN-LAST:event_menuMouseEntered

    private void btnReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReActionPerformed
        // TODO add your handling code here:

        try {

            File objetofile = new File("C:\\Users\\diosl\\Videos\\Peliculas\\The.call.of.the.wild.2020.1080p-dual-lat-cinecalidad.is.mp4");
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {

            System.out.println(ex);

        }

    }//GEN-LAST:event_btnReActionPerformed

    public void goToURL(String URL) throws IOException {
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {

                }
            }
        }
    }

    private void btnTrailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrailerActionPerformed
        try {
            // TODO add your handling code here:
            goToURL("https://www.youtube.com/watch?v=5P8R2zAhEwg");
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnTrailerActionPerformed

    private void btnTrailerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrailerMouseEntered
        // TODO add your handling code here:

        if (ui.getBooUI() == true) {
            btnTrailer.setOpaque(true);
            btnTrailer.setBackground(ColorfondoDark);
            btnTrailer.setForeground(ColorDark);
            btnTrailer.setBorder(new javax.swing.border.LineBorder(ColorDark, 2, true));
            btnTrailer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/video1.png")));

        } else {
            btnTrailer.setOpaque(true);
            btnTrailer.setBackground(ColorfondoLight);
            btnTrailer.setForeground(ColorLight);
            btnTrailer.setBorder(new javax.swing.border.LineBorder(ColorLight, 2, true));
            btnTrailer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/video2.png")));
        }

        btnTrailer.setToolTipText("Dele click para ver trailer");
    }//GEN-LAST:event_btnTrailerMouseEntered

    private void btnTrailerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrailerMouseExited
        // TODO add your handling code here:

        if (ui.getBooUI() == true) {
            btnTrailer.setOpaque(false);
            btnTrailer.setForeground(ColorLight);
            btnTrailer.setBorder(new javax.swing.border.LineBorder(ColorLight, 2, true));
            btnTrailer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/video2.png")));

        } else {
            btnTrailer.setOpaque(false);
            btnTrailer.setForeground(ColorDark);
            btnTrailer.setBorder(new javax.swing.border.LineBorder(ColorDark, 2, true));
            btnTrailer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/video1.png")));
        }
    }//GEN-LAST:event_btnTrailerMouseExited

    private void btnReMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReMouseEntered
        // TODO add your handling code here:

        if (ui.getBooUI() == true) {
            btnRe.setOpaque(true);
            btnRe.setBackground(ColorfondoDark);
            btnRe.setForeground(ColorDark);
            btnRe.setBorder(new javax.swing.border.LineBorder(ColorDark, 2, true));
            btnRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera1.png")));

        } else {
            btnRe.setOpaque(true);
            btnRe.setBackground(ColorfondoLight);
            btnRe.setForeground(ColorLight);
            btnRe.setBorder(new javax.swing.border.LineBorder(ColorLight, 2, true));
            btnRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera2.png")));
        }

        btnRe.setToolTipText("Dele click para Reproducir");
    }//GEN-LAST:event_btnReMouseEntered

    private void btnReMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReMouseExited
        // TODO add your handling code here:

        if (ui.getBooUI() == true) {
            btnRe.setOpaque(false);
            btnRe.setForeground(ColorLight);
            btnRe.setBorder(new javax.swing.border.LineBorder(ColorLight, 2, true));
            btnRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera2.png")));

        } else {
            btnRe.setOpaque(false);
            btnRe.setForeground(ColorDark);
            btnRe.setBorder(new javax.swing.border.LineBorder(ColorDark, 2, true));
            btnRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera1.png")));
        }

    }//GEN-LAST:event_btnReMouseExited

    private void etq2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq2MouseClicked
        // TODO add your handling code here:
        sep.setVisible(false);
        sep1.setVisible(true);
        
         Color ColorDisableDark = new Color(196 - 10, 196 - 10, 196 - 10);
        Color ColorDisableLigth = new Color(102, 102, 102);
        
        Color ColorEnableDark  = new Color(255, 255, 255);
        Color ColorEnableLigth = new Color(0, 0, 0);
        
        if (ui.getBooUI() == true) {
            //Dark UI
            etq1.setForeground(ColorDisableDark);
            etq2.setForeground(ColorEnableDark);
            etq3.setForeground(ColorDisableDark);
            etq4.setForeground(ColorDisableDark);
            etq5.setForeground(ColorDisableDark);
            etq6.setForeground(ColorDisableDark);

        }else{
            //Ligth UI
            etq1.setForeground(ColorDisableLigth);
            etq2.setForeground(ColorEnableLigth);
            etq3.setForeground(ColorDisableLigth);
            etq4.setForeground(ColorDisableLigth);
            etq5.setForeground(ColorDisableLigth);
            etq6.setForeground(ColorDisableLigth);

        }
    }//GEN-LAST:event_etq2MouseClicked

    private void etq1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq1MouseClicked
        // TODO add your handling code here:
        sep1.setVisible(false);
        sep.setVisible(true);

        Color ColorDisableDark = new Color(196 - 10, 196 - 10, 196 - 10);
        Color ColorDisableLigth = new Color(102, 102, 102);
        
        Color ColorEnableDark  = new Color(255, 255, 255);
        Color ColorEnableLigth = new Color(0, 0, 0);
        
        if (ui.getBooUI() == true) {
            //Dark UI
            etq1.setForeground(ColorEnableDark);
            etq2.setForeground(ColorDisableDark);
            etq3.setForeground(ColorDisableDark);
            etq4.setForeground(ColorDisableDark);
            etq5.setForeground(ColorDisableDark);
            etq6.setForeground(ColorDisableDark);

        }else{
            //Ligth UI
            etq1.setForeground(ColorEnableLigth);
            etq2.setForeground(ColorDisableLigth);
            etq3.setForeground(ColorDisableLigth);
            etq4.setForeground(ColorDisableLigth);
            etq5.setForeground(ColorDisableLigth);
            etq6.setForeground(ColorDisableLigth);

        }
    }//GEN-LAST:event_etq1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnRe;
    private javax.swing.JButton btnTrailer;
    private javax.swing.JLabel etq1;
    private javax.swing.JLabel etq2;
    private javax.swing.JLabel etq3;
    private javax.swing.JLabel etq4;
    private javax.swing.JLabel etq5;
    private javax.swing.JLabel etq6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel l;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel sep;
    private javax.swing.JLabel sep1;
    private javax.swing.JLabel tex1;
    private javax.swing.JLabel tex10;
    private javax.swing.JLabel tex11;
    private javax.swing.JLabel tex12;
    private javax.swing.JLabel tex2;
    private javax.swing.JLabel tex3;
    private javax.swing.JLabel tex4;
    private javax.swing.JLabel tex5;
    private javax.swing.JLabel tex6;
    private javax.swing.JLabel tex7;
    private javax.swing.JLabel tex8;
    private javax.swing.JLabel tex9;
    private javax.swing.JLabel texB1;
    private javax.swing.JLabel texB2;
    private javax.swing.JLabel texB3;
    private javax.swing.JLabel texB4;
    private javax.swing.JLabel texB5;
    private javax.swing.JLabel texB6;
    private javax.swing.JLabel texB7;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Views;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author davidf
 */
public class PanelNavLogin extends javax.swing.JPanel {

    /**
     * Creates new form PanelNavLogin
     */
    public PanelNavLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        lblNavCaja = new javax.swing.JLabel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        lblNavInicio = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(87, 106, 202));
        setMaximumSize(new java.awt.Dimension(150, 690));
        setMinimumSize(new java.awt.Dimension(150, 690));
        setPreferredSize(new java.awt.Dimension(150, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_3.setBackground(new java.awt.Color(87, 106, 202));
        btn_3.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_3.setMinimumSize(new java.awt.Dimension(150, 43));

        ind_3.setBackground(new java.awt.Color(255, 136, 0));
        ind_3.setForeground(new java.awt.Color(255, 136, 0));
        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblNavCaja.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNavCaja.setForeground(new java.awt.Color(255, 255, 255));
        lblNavCaja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNavCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Water_25px.png"))); // NOI18N
        lblNavCaja.setText("Salir");
        lblNavCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNavCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNavCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 150, 43));

        btn_1.setBackground(new java.awt.Color(87, 106, 202));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_1.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_1.setMinimumSize(new java.awt.Dimension(150, 43));

        ind_1.setBackground(new java.awt.Color(255, 136, 0));
        ind_1.setForeground(new java.awt.Color(255, 136, 0));
        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblNavInicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNavInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblNavInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNavInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Contacts_25px.png"))); // NOI18N
        lblNavInicio.setText("Iniciar Sesión");
        lblNavInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNavInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNavInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 43));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon1.png"))); // NOI18N
        jLabel29.setOpaque(true);
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 100));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_3;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel lblNavCaja;
    private javax.swing.JLabel lblNavInicio;
    // End of variables declaration//GEN-END:variables
}

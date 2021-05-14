/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Admin
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public JPanel panelLogin;
    public JPanel panelNavLogin;
    public JPanel panelWelcome;
    public JPanel panelCaja;
    public JPanel panelInicio;
    
    public FrmCaja frmCaja = new FrmCaja();
    public FrmInicio frmInicio = new FrmInicio();
    
    public FrmPrincipal() {
         panelLogin = new PanelLogin();
        panelWelcome = new PanelWelcome();
           panelNavLogin = new PanelNavLogin();
           
        initComponents();
        
        
    //    setColor(btn_1, lblNavInicio);      
    //    ind_1.setOpaque(true);
    //    resetColor(new JPanel[]{btn_2, btn_3, btn_4}, new JPanel[]{ind_2, ind_3, ind_4}, new JLabel[]{lblNavProveedores, lblNavCaja, lblNavProductos});
       
         
        
        ///SETEANDO PANELES Y LISTENES DE LOS BOTONES
        panelInicio= frmInicio.getjPanel1();
         frmInicio.getBtnSignIn().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SignInPresed(evt);
           }

          });
         
        panelCaja= frmCaja.getjPanel1();
        frmCaja.getBtnBackToMenu().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_BackToMenuPresed(evt);
           }

          });
        
        
        

        /**
         * Estableciendo TAMAÑO PERSONALIZADO para CADA PANTALLA (para que el
         * programa se adapte sea cual sea su tamaño, le aplicará relleno)
         *
         * En primer lugar establecemos los tamaños para el JFRAME, para que
         * apenas pueda redimensionarse tambien se abrirá en pantalla completa
         * directamente
         */
        //Obtenemos el tamaño de la pantalla donde estamos ejecutando  
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();

        this.setMinimumSize(new Dimension(1080, 720)); //Le resto 35, para que "minimize algo"
        this.setMaximumSize(new Dimension(pantallaTamano.width, pantallaTamano.height));
        this.setSize(new Dimension(pantallaTamano.width, pantallaTamano.height));

        this.setExtendedState(this.MAXIMIZED_BOTH);//Con esto le indicamos que se ejecute en modo MAXIMIZADO

     
        jPanel1.add(panelNavLogin);
        jPanel1.add(panelNavLogin);
        panelNavLogin.setBounds(0, 0, 150, 690);
        side_pane.setPreferredSize(new Dimension(150, 650));
        side_pane.setVisible(true);
        side_pane.setVisible(true);
        panelNavLogin.setVisible(false);

        //Estableciendo "PANEL DE TRABAJO CENTRAL", este dependerá de la pestaña que esté pulsada
       

        PanelWorkArea.add(panelLogin, new AbsoluteConstraints(0, 0, 920, 690));
        PanelWorkArea.add(panelWelcome, new AbsoluteConstraints(0, 0, 920, 690));

        //PANELES DEl area de TRABAjo 
        jPanel6.setVisible(true);
        panelLogin.setVisible(false);
        panelWelcome.setVisible(false);

        //AgregANDO nuestro PanelPrincial, al panelRelleno, endicandole la posición que lo mantendrá centrado en la pantalla
         jPanel8.add(jPanel1);
        //Al ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto.
        jPanel1.setBounds((pantallaTamano.width / 2) - (jPanel1.getWidth() / 2), (pantallaTamano.height / 2) - 15 - (jPanel1.getHeight() / 2), 1070, 690);
//       jPanel1.setBounds(0,0 , 1070, 690);


        jPanel8.add(panelCaja);
        //Al ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto.
        panelCaja.setBounds((pantallaTamano.width / 2) - (jPanel1.getWidth() / 2), (pantallaTamano.height / 2) - 15 - (jPanel1.getHeight() / 2), 1070, 690);
        

        jPanel8.add(panelInicio);
        //Al ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto.
        panelInicio.setBounds((pantallaTamano.width / 2) - (jPanel1.getWidth() / 2), (pantallaTamano.height / 2) - 15 - (jPanel1.getHeight() / 2), 1070, 690);
        
        //Agregando panelRelleno que ya tiene el panelPrincipal añadido al Jframe indicandole su posicion y tamaño, QUE SERÁ TODO el ANCHO Y ALTO de nuestra PANTALLA
        getContentPane().add(jPanel8);
        jPanel8.setBounds(0, 0, pantallaTamano.width, pantallaTamano.height);
        
        resetNavPanel();   
        panelCaja.setVisible(false);
        jPanel1.setVisible(false);
        panelInicio.setVisible(true);
        
        
         
           
           
        pack();
        setLocationRelativeTo(null);
////////////////////////////////////////   Fin de establaciendo tamaños personalizados y centrando el Jpanel

    }//Fin del constructor

    public JPanel getjPanel1() {
        return jPanel1;
    }

    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        side_pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        lblNavInicio = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        lblNavProveedores = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        lblNavCaja = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        lblNavProductos = new javax.swing.JLabel();
        btn_5 = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btn_7 = new javax.swing.JPanel();
        ind_7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btn_8 = new javax.swing.JPanel();
        ind_8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btn_9 = new javax.swing.JPanel();
        ind_9 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btn_10 = new javax.swing.JPanel();
        ind_10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        btn_11 = new javax.swing.JPanel();
        ind_11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        btn_12 = new javax.swing.JPanel();
        ind_12 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        PanelWorkArea = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(23, 35, 51));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1070, 690));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setMinimumSize(new java.awt.Dimension(1070, 690));
        jPanel8.setName(""); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(1124, 740));
        jPanel8.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(23, 35, 51));

        side_pane.setBackground(new java.awt.Color(87, 106, 202));
        side_pane.setMaximumSize(new java.awt.Dimension(150, 690));
        side_pane.setMinimumSize(new java.awt.Dimension(150, 690));
        side_pane.setPreferredSize(new java.awt.Dimension(150, 690));
        side_pane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetNavPanel(evt);
            }
        });
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(87, 106, 202));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_1.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_1.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

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
        lblNavInicio.setText("User");
        lblNavInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNavInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNavProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNavProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNavInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        side_pane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 43));

        btn_2.setBackground(new java.awt.Color(87, 106, 202));
        btn_2.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_2.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_2.setPreferredSize(new java.awt.Dimension(150, 43));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_2MouseReleased(evt);
            }
        });

        ind_2.setBackground(new java.awt.Color(255, 136, 0));
        ind_2.setForeground(new java.awt.Color(255, 136, 0));
        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblNavProveedores.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNavProveedores.setForeground(new java.awt.Color(255, 255, 255));
        lblNavProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Calendar_25px.png"))); // NOI18N
        lblNavProveedores.setText("Proveedores");
        lblNavProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNavProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNavProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNavProductosMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNavProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNavProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 43));

        btn_3.setBackground(new java.awt.Color(87, 106, 202));
        btn_3.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_3.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

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
        lblNavCaja.setText("Caja");
        lblNavCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNavCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNavProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNavProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

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

        side_pane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 43));

        btn_4.setBackground(new java.awt.Color(87, 106, 202));
        btn_4.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_4.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });

        ind_4.setBackground(new java.awt.Color(255, 136, 0));
        ind_4.setForeground(new java.awt.Color(255, 136, 0));
        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblNavProductos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNavProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblNavProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Search_18px.png"))); // NOI18N
        lblNavProductos.setText("Productos");
        lblNavProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNavProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNavProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNavProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNavProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNavProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 150, 43));

        btn_5.setBackground(new java.awt.Color(87, 106, 202));
        btn_5.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_5.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_5MousePressed(evt);
            }
        });

        ind_5.setBackground(new java.awt.Color(255, 136, 0));
        ind_5.setForeground(new java.awt.Color(255, 136, 0));
        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Productos");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 150, 43));

        btn_6.setBackground(new java.awt.Color(87, 106, 202));
        btn_6.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_6.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
        });

        ind_6.setBackground(new java.awt.Color(255, 136, 0));
        ind_6.setForeground(new java.awt.Color(255, 136, 0));
        ind_6.setOpaque(false);
        ind_6.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Productos");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, 43));

        btn_7.setBackground(new java.awt.Color(87, 106, 202));
        btn_7.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_7.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_7MousePressed(evt);
            }
        });

        ind_7.setBackground(new java.awt.Color(255, 136, 0));
        ind_7.setForeground(new java.awt.Color(255, 136, 0));
        ind_7.setOpaque(false);
        ind_7.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_7Layout = new javax.swing.GroupLayout(ind_7);
        ind_7.setLayout(ind_7Layout);
        ind_7Layout.setHorizontalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_7Layout.setVerticalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Productos");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_7Layout = new javax.swing.GroupLayout(btn_7);
        btn_7.setLayout(btn_7Layout);
        btn_7Layout.setHorizontalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addComponent(ind_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        btn_7Layout.setVerticalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addComponent(ind_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 150, 43));

        btn_8.setBackground(new java.awt.Color(87, 106, 202));
        btn_8.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_8.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_8MousePressed(evt);
            }
        });

        ind_8.setBackground(new java.awt.Color(255, 136, 0));
        ind_8.setForeground(new java.awt.Color(255, 136, 0));
        ind_8.setOpaque(false);
        ind_8.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_8Layout = new javax.swing.GroupLayout(ind_8);
        ind_8.setLayout(ind_8Layout);
        ind_8Layout.setHorizontalGroup(
            ind_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_8Layout.setVerticalGroup(
            ind_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Productos");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_8Layout = new javax.swing.GroupLayout(btn_8);
        btn_8.setLayout(btn_8Layout);
        btn_8Layout.setHorizontalGroup(
            btn_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_8Layout.createSequentialGroup()
                .addComponent(ind_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        btn_8Layout.setVerticalGroup(
            btn_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_8Layout.createSequentialGroup()
                .addComponent(ind_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 150, 43));

        btn_9.setBackground(new java.awt.Color(87, 106, 202));
        btn_9.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_9.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_9MousePressed(evt);
            }
        });

        ind_9.setBackground(new java.awt.Color(255, 136, 0));
        ind_9.setForeground(new java.awt.Color(255, 136, 0));
        ind_9.setOpaque(false);
        ind_9.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_9Layout = new javax.swing.GroupLayout(ind_9);
        ind_9.setLayout(ind_9Layout);
        ind_9Layout.setHorizontalGroup(
            ind_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_9Layout.setVerticalGroup(
            ind_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Productos");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_9Layout = new javax.swing.GroupLayout(btn_9);
        btn_9.setLayout(btn_9Layout);
        btn_9Layout.setHorizontalGroup(
            btn_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_9Layout.createSequentialGroup()
                .addComponent(ind_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        btn_9Layout.setVerticalGroup(
            btn_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_9Layout.createSequentialGroup()
                .addComponent(ind_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 150, 43));

        btn_10.setBackground(new java.awt.Color(87, 106, 202));
        btn_10.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_10.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_10MousePressed(evt);
            }
        });

        ind_10.setBackground(new java.awt.Color(255, 136, 0));
        ind_10.setForeground(new java.awt.Color(255, 136, 0));
        ind_10.setOpaque(false);
        ind_10.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_10Layout = new javax.swing.GroupLayout(ind_10);
        ind_10.setLayout(ind_10Layout);
        ind_10Layout.setHorizontalGroup(
            ind_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_10Layout.setVerticalGroup(
            ind_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Productos");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_10Layout = new javax.swing.GroupLayout(btn_10);
        btn_10.setLayout(btn_10Layout);
        btn_10Layout.setHorizontalGroup(
            btn_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_10Layout.createSequentialGroup()
                .addComponent(ind_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        btn_10Layout.setVerticalGroup(
            btn_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_10Layout.createSequentialGroup()
                .addComponent(ind_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 150, 43));

        btn_11.setBackground(new java.awt.Color(87, 106, 202));
        btn_11.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_11.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_11MousePressed(evt);
            }
        });

        ind_11.setBackground(new java.awt.Color(255, 136, 0));
        ind_11.setForeground(new java.awt.Color(255, 136, 0));
        ind_11.setOpaque(false);
        ind_11.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_11Layout = new javax.swing.GroupLayout(ind_11);
        ind_11.setLayout(ind_11Layout);
        ind_11Layout.setHorizontalGroup(
            ind_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_11Layout.setVerticalGroup(
            ind_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Productos");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_11Layout = new javax.swing.GroupLayout(btn_11);
        btn_11.setLayout(btn_11Layout);
        btn_11Layout.setHorizontalGroup(
            btn_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_11Layout.createSequentialGroup()
                .addComponent(ind_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        btn_11Layout.setVerticalGroup(
            btn_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_11Layout.createSequentialGroup()
                .addComponent(ind_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 150, 43));

        btn_12.setBackground(new java.awt.Color(87, 106, 202));
        btn_12.setMaximumSize(new java.awt.Dimension(150, 43));
        btn_12.setMinimumSize(new java.awt.Dimension(150, 43));
        btn_12.setPreferredSize(new java.awt.Dimension(150, 43));
        btn_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_12MousePressed(evt);
            }
        });

        ind_12.setBackground(new java.awt.Color(255, 136, 0));
        ind_12.setForeground(new java.awt.Color(255, 136, 0));
        ind_12.setOpaque(false);
        ind_12.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_12Layout = new javax.swing.GroupLayout(ind_12);
        ind_12.setLayout(ind_12Layout);
        ind_12Layout.setHorizontalGroup(
            ind_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_12Layout.setVerticalGroup(
            ind_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Productos");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_12Layout = new javax.swing.GroupLayout(btn_12);
        btn_12.setLayout(btn_12Layout);
        btn_12Layout.setHorizontalGroup(
            btn_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_12Layout.createSequentialGroup()
                .addComponent(ind_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        btn_12Layout.setVerticalGroup(
            btn_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_12Layout.createSequentialGroup()
                .addComponent(ind_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 150, 43));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon1.png"))); // NOI18N
        jLabel29.setOpaque(true);
        side_pane.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 100));

        PanelWorkArea.setMaximumSize(new java.awt.Dimension(920, 690));
        PanelWorkArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(208, 231, 240));
        jPanel6.setMaximumSize(new java.awt.Dimension(920, 690));
        jPanel6.setMinimumSize(new java.awt.Dimension(920, 690));
        jPanel6.setPreferredSize(new java.awt.Dimension(920, 690));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3123432740_ebb8db0b6b_w.jpg"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 400, 300));

        jLabel2.setText("HORARIO DE TRABAJO");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jLabel3.setBackground(new java.awt.Color(70, 143, 175));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Lock_25px.png"))); // NOI18N
        jLabel3.setText("Cambiar Contraseña");
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ChangePassword_MousePressed(evt);
            }
        });
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 200, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Nº Emp:");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("000001");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 97, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Ext:");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 40, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("098");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("678878987");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Tlfn:");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Apellido_2");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Apellido_1");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Nombre");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ROL_DE_EMPLEADO");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 25));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Contacts_25px.png"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Calendar_25px.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Friday 23 Feb ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Liberation Sans", 0, 44)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("00:00:00");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 170, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("May 2018");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, 21));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Último inicio:");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("2021-05-08 07:30:45");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, -1));

        PanelWorkArea.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 690));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(side_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PanelWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.add(jPanel1);
        jPanel1.setBounds(30, 30, 1070, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        // TODO add your handling code here:
        setColor(btn_1, lblNavInicio);

        ind_1.setOpaque(true);

        jPanel6.setVisible(false);
        panelCaja.setVisible(false);
      
        panelInicio.setVisible(false);
        panelLogin.setVisible(true);

        resetColor(new JPanel[]{btn_2, btn_3, btn_4}, new JPanel[]{ind_2, ind_3, ind_4}, new JLabel[]{lblNavProveedores, lblNavCaja, lblNavProductos});

        //  jPanel1.add(panelLogin);   
        //       panelLogin.setBounds(120, 70, 950, 620);

    }//GEN-LAST:event_btn_1MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:
        setColor(btn_3, lblNavCaja);
        ind_3.setOpaque(true);

        resetColor(new JPanel[]{btn_2, btn_1, btn_4}, new JPanel[]{ind_2, ind_1, ind_4}, new JLabel[]{lblNavProveedores, lblNavInicio, lblNavProductos});
        
        jPanel1.setVisible(false);
        panelCaja.setVisible(true);
        
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        // TODO add your handling code here:
        setColor(btn_4, lblNavProductos);
        ind_4.setOpaque(true);

        resetColor(new JPanel[]{btn_2, btn_3, btn_1}, new JPanel[]{ind_2, ind_3, ind_1}, new JLabel[]{lblNavProveedores, lblNavCaja, lblNavInicio});
        setColor(btn_4, lblNavProductos);
        ind_4.setOpaque(true);

        jPanel6.setVisible(true);
        panelLogin.setVisible(false);

    }//GEN-LAST:event_btn_4MousePressed

    private void btn_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseReleased
        // TODO add your handling code here:
        setColor(btn_2, lblNavProveedores);
        ind_2.setOpaque(true);

        resetColor(new JPanel[]{btn_1, btn_3, btn_4}, new JPanel[]{ind_1, ind_3, ind_4}, new JLabel[]{lblNavInicio, lblNavCaja, lblNavProductos});


    }//GEN-LAST:event_btn_2MouseReleased

 //   int xx, xy;
    private void btn_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_5MousePressed

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_6MousePressed

    private void btn_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_7MousePressed

    private void btn_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_8MousePressed

    private void btn_9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_9MousePressed

    private void btn_10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_10MousePressed

    private void btn_11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_11MousePressed

    private void btn_12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_12MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_12MousePressed

    private void btn_ChangePassword_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ChangePassword_MousePressed
        // TODO add your handling code here:
        JDialog changepass = new dlgChangePassword(this, true);
        changepass.setVisible(true);
    }//GEN-LAST:event_btn_ChangePassword_MousePressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(new Color(0, 0, 102));
    }//GEN-LAST:event_jLabel3MouseExited

    private void lblNavProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNavProductosMouseEntered
        // TODO add your handling code here:
        JLabel lbl = (JLabel) evt.getSource();

        //Si el indice NO Se ESTA MOSTRANDO (no está seleccionada esta pestaña) y se corresponde a la etiqueta, se cambiará de color, en caso contrario no hará nada
        if (ind_1.isOpaque() == false && lbl.getText().equals("User")) {
            lbl.setForeground(Color.red);
        } else if (ind_2.isOpaque() == false && lbl.getText().equals("Proveedores")) {
            lbl.setForeground(Color.red);
        } else if (ind_3.isOpaque() == false && lbl.getText().equals("Caja")) {
            lbl.setForeground(Color.red);
        } else if (ind_4.isOpaque() == false && lbl.getText().equals("Productos")) {
            lbl.setForeground(Color.red);
        }


    }//GEN-LAST:event_lblNavProductosMouseEntered

    private void lblNavProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNavProductosMouseExited
        // TODO add your handling code here:
        JLabel lbl = (JLabel) evt.getSource();
        lbl.setForeground(Color.white);
    }//GEN-LAST:event_lblNavProductosMouseExited

    private void resetNavPanel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetNavPanel
        // TODO add your handling code here:
           resetNavPanel();
        
    }//GEN-LAST:event_resetNavPanel

    
    
        private void btn_BackToMenuPresed(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
            jPanel1.setVisible(true);
        panelCaja.setVisible(false);
        
        resetNavPanel();
    }   
    
    
     private void btn_SignInPresed(MouseEvent evt) {
    
         jPanel1.setVisible(true);
         panelInicio.setVisible(false);
    }
    
    
     
     
     
         //Metodo que RESETA las pestañas y establece la PANTALLA de WELCOME 
    private void resetNavPanel() {

        resetColor(new JPanel[]{btn_2, btn_3, btn_4,btn_1}, new JPanel[]{ind_2, ind_3, ind_4,ind_1}, new JLabel[]{lblNavProveedores, lblNavCaja, lblNavProductos,lblNavInicio});
        panelWelcome.setVisible(true);
       jPanel6.setVisible(false);
        panelCaja.setVisible(false);
        panelInicio.setVisible(false);
        panelLogin.setVisible(false);

    }
     
     
     
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    
    
    
    
    
    
    
    

    private void setColor(JPanel pane, JLabel lbl) {
        pane.setBackground(new Color(41, 57, 80));
        lbl.setForeground(new Color(255, 255, 255));
        lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        // TODO add your handling code here:
    }

    
    
    private void resetColor(JPanel[] pane, JPanel[] indicators, JLabel[] labels) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(87,106,202));

        }

        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

        for (int i = 0; i < labels.length; i++) {
            labels[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelWorkArea;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_10;
    private javax.swing.JPanel btn_11;
    private javax.swing.JPanel btn_12;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_5;
    private javax.swing.JPanel btn_6;
    private javax.swing.JPanel btn_7;
    private javax.swing.JPanel btn_8;
    private javax.swing.JPanel btn_9;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_10;
    private javax.swing.JPanel ind_11;
    private javax.swing.JPanel ind_12;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JPanel ind_6;
    private javax.swing.JPanel ind_7;
    private javax.swing.JPanel ind_8;
    private javax.swing.JPanel ind_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblNavCaja;
    private javax.swing.JLabel lblNavInicio;
    private javax.swing.JLabel lblNavProductos;
    private javax.swing.JLabel lblNavProveedores;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables
}

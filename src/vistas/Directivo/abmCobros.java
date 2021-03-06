package vistas.Directivo;

import Controlador.GestorBD;
import Model.TiposRecibos;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import vistas.Otro.principalOtro;

public class abmCobros extends javax.swing.JFrame {

    GestorBD g = new GestorBD();
    private static final String PASS = "123";
    private static final String USER = "sa";
    private static final String CADENA = "jdbc:sqlserver://DESKTOP-ANUONV0:1433;databaseName=KASprueba";
    DefaultComboBoxModel cboModelTipoRecibo = new DefaultComboBoxModel();
    ArrayList<TiposRecibos> listRecibo = g.getTiposRecibos();
    int idEstudiante = 0;
    principalDirectivo pdi;
    principalOtro pa;
    String ventana = "";

    public abmCobros() {
        initComponents();
        for (TiposRecibos tiposRecibos : listRecibo) {
            cboModelTipoRecibo.addElement(tiposRecibos.getDescripcion());
        }
        cboTipoRecibo.setModel(cboModelTipoRecibo);
        cboTipoRecibo.setSelectedIndex(-1);

    }

    public Image getIconImage() {
        Image logo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/DIAPOSITIVA1.jpg"));
        return logo;
    }

    public void interfazDirectivo(principalDirectivo pdir) {
        pdi = pdir;
        ventana = "directivo";
    }

    public void interfazAdmin(principalOtro pa) {
        pa = pa;
        ventana = "admin";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCobros = new org.edisoncor.gui.panel.Panel();
        pnlCobro = new org.edisoncor.gui.panel.Panel();
        lblCobros = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        txtDNI = new org.edisoncor.gui.textField.TextField();
        txtEstudiante = new org.edisoncor.gui.textField.TextField();
        cboTipoRecibo = new javax.swing.JComboBox<>();
        txtMonto = new org.edisoncor.gui.textField.TextField();
        txtAnio = new org.edisoncor.gui.textField.TextField();
        lblTipoRecibo = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblEstudiante = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        btnAgregarCobro = new org.edisoncor.gui.button.ButtonColoredAction();
        btnBuscarDNI = new org.edisoncor.gui.button.ButtonColoredAction();
        btnLimpiarCampos = new org.edisoncor.gui.button.ButtonColoredAction();
        cboMeses = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAS - COBROS");
        setIconImage(getIconImage());
        setName("frmCobros"); // NOI18N
        setUndecorated(true);

        pnlCobros.setBackground(new java.awt.Color(255, 255, 255));
        pnlCobros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        pnlCobros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otroFondo2.jpg"))); // NOI18N

        pnlCobro.setBackground(new java.awt.Color(0, 0, 0));
        pnlCobro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlCobro.setColorPrimario(new java.awt.Color(0, 0, 0));
        pnlCobro.setName(""); // NOI18N
        pnlCobro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlCobroMouseDragged(evt);
            }
        });
        pnlCobro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlCobroMousePressed(evt);
            }
        });

        lblCobros.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCobros.setForeground(new java.awt.Color(255, 255, 255));
        lblCobros.setText("REGISTRO DE COBROS");

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setFocusPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(0, 0, 0));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimo.png"))); // NOI18N
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCobroLayout = new javax.swing.GroupLayout(pnlCobro);
        pnlCobro.setLayout(pnlCobroLayout);
        pnlCobroLayout.setHorizontalGroup(
            pnlCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCobroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCobros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCobroLayout.setVerticalGroup(
            pnlCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCobroLayout.createSequentialGroup()
                .addGroup(pnlCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMinimizar)
                    .addGroup(pnlCobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblCobros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtDNI.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtEstudiante.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboTipoRecibo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboTipoRecibo.setMaximumRowCount(4);
        cboTipoRecibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboTipoRecibo.setName(""); // NOI18N
        cboTipoRecibo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoReciboItemStateChanged(evt);
            }
        });
        cboTipoRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoReciboActionPerformed(evt);
            }
        });

        txtMonto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtAnio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        lblTipoRecibo.setBackground(new java.awt.Color(0, 102, 0));
        lblTipoRecibo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoRecibo.setForeground(new java.awt.Color(153, 255, 153));
        lblTipoRecibo.setText("   Tipo de Recibo:");
        lblTipoRecibo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTipoRecibo.setOpaque(true);

        lblClave.setBackground(new java.awt.Color(0, 102, 0));
        lblClave.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblClave.setForeground(new java.awt.Color(153, 255, 153));
        lblClave.setText("           Monto:");
        lblClave.setOpaque(true);

        lblDNI.setBackground(new java.awt.Color(0, 102, 0));
        lblDNI.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(153, 255, 153));
        lblDNI.setText("DNI del Estudiante:");
        lblDNI.setOpaque(true);

        lblEstudiante.setBackground(new java.awt.Color(0, 102, 0));
        lblEstudiante.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblEstudiante.setForeground(new java.awt.Color(153, 255, 153));
        lblEstudiante.setText("La/El estudiante es: ");
        lblEstudiante.setOpaque(true);

        lblMes.setBackground(new java.awt.Color(0, 102, 0));
        lblMes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblMes.setForeground(new java.awt.Color(153, 255, 153));
        lblMes.setText("              Mes:");
        lblMes.setOpaque(true);

        lblAnio.setBackground(new java.awt.Color(0, 102, 0));
        lblAnio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblAnio.setForeground(new java.awt.Color(153, 255, 153));
        lblAnio.setText("             A??o:");
        lblAnio.setOpaque(true);

        btnAgregarCobro.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarCobro.setBorder(null);
        btnAgregarCobro.setText("AGREGAR");
        btnAgregarCobro.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnAgregarCobro.setDireccionDeSombra(0);
        btnAgregarCobro.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnAgregarCobro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarCobro.setProfundidad(new java.lang.Float(0.0F));
        btnAgregarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCobroActionPerformed(evt);
            }
        });

        btnBuscarDNI.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarDNI.setBorder(null);
        btnBuscarDNI.setText("BUSCAR");
        btnBuscarDNI.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnBuscarDNI.setDireccionDeSombra(0);
        btnBuscarDNI.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnBuscarDNI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarDNI.setProfundidad(new java.lang.Float(0.0F));
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNIActionPerformed(evt);
            }
        });

        btnLimpiarCampos.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiarCampos.setBorder(null);
        btnLimpiarCampos.setText("LIMPIAR CAMPOS");
        btnLimpiarCampos.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnLimpiarCampos.setDireccionDeSombra(0);
        btnLimpiarCampos.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnLimpiarCampos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiarCampos.setProfundidad(new java.lang.Float(0.0F));
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        cboMeses.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboMeses.setMaximumRowCount(12);
        cboMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cboMeses.setSelectedIndex(-1);
        cboMeses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboMeses.setName(""); // NOI18N
        cboMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMesesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCobrosLayout = new javax.swing.GroupLayout(pnlCobros);
        pnlCobros.setLayout(pnlCobrosLayout);
        pnlCobrosLayout.setHorizontalGroup(
            pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCobro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCobrosLayout.createSequentialGroup()
                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCobrosLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnAgregarCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCobrosLayout.createSequentialGroup()
                        .addContainerGap(85, Short.MAX_VALUE)
                        .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTipoRecibo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCobrosLayout.createSequentialGroup()
                                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboTipoRecibo, 0, 185, Short.MAX_VALUE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboMeses, 0, 185, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addComponent(btnBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        pnlCobrosLayout.setVerticalGroup(
            pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCobrosLayout.createSequentialGroup()
                .addComponent(pnlCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCobrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCobrosLayout.createSequentialGroup()
                        .addComponent(btnAgregarCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCobrosLayout.createSequentialGroup()
                        .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCobros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCobros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "??Desea cerrar la ventana?", "Selecione un Opci??n", YES_NO_OPTION, QUESTION_MESSAGE);
        if (respuesta == 0) {
            if ("directivo".equals(ventana)) {
                pdi.setVisible(true);
            } else {
                pa.setVisible(true);
            }
        this.dispose();
    }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnAgregarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCobroActionPerformed
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("exec procInsertRecibo ?,?,?,?,?,?");

            ps.setInt(1, Integer.parseInt(txtDNI.getText()));
            ps.setInt(2, Integer.parseInt(txtMonto.getText()));
            String mes = cboMeses.getSelectedItem().toString();
            if (cboTipoRecibo.getSelectedIndex() == 1) {
                cboMeses.setEnabled(false);
            }
            switch (mes) {
                case "Enero": {
                    ps.setInt(3, 1);
                    break;
                }
                case "Febrero": {
                    ps.setInt(3, 2);
                    break;
                }
                case "Marzo": {
                    ps.setInt(3, 3);
                    break;
                }
                case "Abrl": {
                    ps.setInt(3, 4);
                    break;
                }
                case "Mayo": {
                    ps.setInt(3, 5);
                    break;
                }
                case "Junio": {
                    ps.setInt(3, 6);
                    break;
                }
                case "Julio": {
                    ps.setInt(3, 7);
                    break;
                }
                case "Agosto": {
                    ps.setInt(3, 8);
                    break;
                }
                case "Septiembre": {
                    ps.setInt(3, 9);
                    break;
                }
                case "Octubre": {
                    ps.setInt(3, 10);
                    break;
                }
                case "Noviembre": {
                    ps.setInt(3, 11);
                    break;
                }
                case "Dicembre": {
                    ps.setInt(3, 12);
                    break;
                }
                case "Anual": {
                    ps.setString(3, "0");
                }
            }
            ps.setInt(4, Integer.parseInt(txtAnio.getText()));
            for (TiposRecibos tiposRecibos : listRecibo) {
                if (tiposRecibos.getDescripcion().equals(cboTipoRecibo.getSelectedItem())) {
                    ps.setInt(5, tiposRecibos.getIdTipoRecibo());
                }
            }
            ps.setInt(6, idEstudiante);

            int respuesta = JOptionPane.showConfirmDialog(null, "??Desea continuar?", "Selecione un Opci??n", YES_NO_OPTION, QUESTION_MESSAGE);
            if (respuesta == 0) {
                ps.execute();
                ps.close();
                conexion.close();
                JOptionPane.showMessageDialog(null, "Cargado con exito");
                limpiarCampos();
            }
        } catch (Exception e) {
            System.out.println("Error agregar Registro" + e);
        }

    }//GEN-LAST:event_btnAgregarCobroActionPerformed

    private void cboTipoReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoReciboActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("select p.apellido, p.nombre, e.idEstudiante from Estudiantes e join Personas p on e.idEstudiante = p.idPersona\n"
                    + "where p.documento = ?");
            if (txtDNI.getText().trim() == null || txtDNI.getText().trim().isEmpty() || txtDNI.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un DNI");
            } else {
                ps.setInt(1, Integer.parseInt(txtDNI.getText()));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String nombreCompleto = rs.getString(1) + " " + rs.getString(2);
                    idEstudiante = rs.getInt(3);
                    txtEstudiante.setText(nombreCompleto);
                    btnAgregarCobro.setEnabled(true);
                    txtDNI.setEditable(false);
                    btnBuscarDNI.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "El Documento no es valido o no coincide con ningun Estudiante actual");
                    txtEstudiante.setText("");
                    btnAgregarCobro.setEnabled(false);
                }
                rs.close();
            }
            ps.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en buscar DNI" + e);
        }
        //Aca tengo que poner que el dni escrito traiga el nombre del alumno y lo muestre
        //Tambien tengo que poner que el dni me traigo el idEstudiante para poder mandarlo en el agregar 
    }//GEN-LAST:event_btnBuscarDNIActionPerformed

    int xx, xy;
    private void pnlCobroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCobroMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnlCobroMouseDragged

    private void pnlCobroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCobroMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnlCobroMousePressed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void cboMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMesesActionPerformed

    private void cboTipoReciboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoReciboItemStateChanged
        try {
            if (cboTipoRecibo.getSelectedItem() != null && cboTipoRecibo.getItemCount() >= 3) {
            }
            if (cboTipoRecibo.getSelectedItem() != null && cboTipoRecibo.getItemCount() >= 3 && cboTipoRecibo.getSelectedItem().equals("Anual")) {
                cboMeses.setEnabled(false);
                cboMeses.addItem("Anual");
                cboMeses.setSelectedIndex(1);
            }
            if (cboTipoRecibo.getSelectedItem() != null && cboTipoRecibo.getItemCount() >= 3 && cboTipoRecibo.getSelectedItem().equals("Mensual") || cboTipoRecibo.getSelectedItem().equals("Retrasado")) {
                cboMeses.setEnabled(true);
                cboMeses.removeItem("Anual");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cboTipoReciboItemStateChanged

    public void limpiarCampos() {
        btnBuscarDNI.setEnabled(true);
        txtDNI.setEditable(true);
        txtDNI.setText("");
        txtEstudiante.setText("");
        cboTipoRecibo.setSelectedIndex(-1);
        txtMonto.setText("");
        cboMeses.setSelectedIndex(-1);
        txtAnio.setEnabled(false);
        txtAnio.setText("");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(abmCobros.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abmCobros.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abmCobros.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abmCobros.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abmCobros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonColoredAction btnAgregarCobro;
    private org.edisoncor.gui.button.ButtonColoredAction btnBuscarDNI;
    private javax.swing.JButton btnCerrar;
    private org.edisoncor.gui.button.ButtonColoredAction btnLimpiarCampos;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JComboBox<String> cboMeses;
    private javax.swing.JComboBox<String> cboTipoRecibo;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblCobros;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblTipoRecibo;
    private org.edisoncor.gui.panel.Panel pnlCobro;
    private org.edisoncor.gui.panel.Panel pnlCobros;
    private org.edisoncor.gui.textField.TextField txtAnio;
    private org.edisoncor.gui.textField.TextField txtDNI;
    private org.edisoncor.gui.textField.TextField txtEstudiante;
    private org.edisoncor.gui.textField.TextField txtMonto;
    // End of variables declaration//GEN-END:variables
}

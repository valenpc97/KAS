package vistas.Directivo;

import Controlador.GestorBD;
import Model.Barrios;
import Model.Docentes;
import Model.EstadosCiviles;
import Model.Localidades;
import Model.Nacionalidades;
import Model.TiposDocentes;
import Model.TiposDocumentos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class abmDocente extends javax.swing.JFrame {

    GestorBD g = new GestorBD();
    private static final String PASS = "123";
    private static final String USER = "sa";
    private static final String CADENA = "jdbc:sqlserver://MAURICIO\\SQLEXPRESS:1433;databaseName=KASprueba";
    principalDirectivo pdi;

    DefaultComboBoxModel cboModelTipoDocente = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelDoc = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelNac = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelLoc = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelBar = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelCivil = new DefaultComboBoxModel();
    ArrayList<TiposDocentes> listTipoDoce = g.getTiposDocentes();
    ArrayList<TiposDocumentos> listDoc = g.getDocumentos();
    ArrayList<Nacionalidades> listNac = g.getNacionalidades();
    ArrayList<Localidades> listLoc = g.getLocalidades();
    ArrayList<Barrios> listBar = g.getBarrios();
    ArrayList<EstadosCiviles> listCivil = g.getEstadosCiviles();
    int idDocenteModificar = 0;

    public abmDocente() {
        initComponents();
        actualizarTabla();
        Desactivar();
        for (TiposDocentes tiposDocentes : listTipoDoce) {
            cboModelTipoDocente.addElement(tiposDocentes.getDescripcion());
        }
        for (TiposDocumentos tiposDocumentos : listDoc) {
            cboModelDoc.addElement(tiposDocumentos.getDescripcion());
        }
        for (Nacionalidades nacionalidades : listNac) {
            cboModelNac.addElement(nacionalidades.getDescripcion());
        }
        for (Localidades localidades : listLoc) {
            cboModelLoc.addElement(localidades.getDescripcion());
        }
        for (Barrios barrios : listBar) {
            cboModelBar.addElement(barrios.getDescripcion());
        }
        for (EstadosCiviles estadosCiviles : listCivil) {
            cboModelCivil.addElement(estadosCiviles.getDescripcion());
        }
        cboTiposDocentes.setModel(cboModelTipoDocente);
        cboTiposDocumentosDoc.setModel(cboModelDoc);
        cboNacionDoc.setModel(cboModelNac);
        cboLocalidadesDoc.setModel(cboModelLoc);
        cboBarrioDoc.setModel(cboModelBar);
        cboEstadoCivilDoc.setModel(cboModelCivil);
        btnDeleteDoc.setEnabled(false);
    }

    public Image getIconImage() {
        Image logo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/DIAPOSITIVA1.jpg"));

        return logo;
    }

    public void actualizarTabla() {
        DefaultTableModel tmodel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ArrayList<Docentes> list = g.getDocentes();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tmodel.setColumnIdentifiers(new Object[]{"Asignatura ", "Nombre", "Apellido", "Email", "Celular"});
        for (Docentes docentes : list) {
            tmodel.addRow(new Object[]{docentes.getDescripcion(), docentes.getNombre(), docentes.getApellido(), docentes.getEmail(), docentes.getCelular()});
        }
        tblRegDoc.setModel(tmodel);
        tblRegDoc.getTableHeader().setReorderingAllowed(false);
        tblRegDoc.getTableHeader().setBackground(new Color(153, 255, 153));
        tblRegDoc.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
        tblRegDoc.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblRegDoc.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegDoc.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegDoc.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblRegDoc.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblRegDoc.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblRegDoc.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tblRegDoc.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDocentes = new org.edisoncor.gui.panel.Panel();
        pnl2Docente = new org.edisoncor.gui.panel.Panel();
        lblRegDocente = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnNuevoDoc = new org.edisoncor.gui.button.ButtonColoredAction();
        btnUpdateDoc = new org.edisoncor.gui.button.ButtonColoredAction();
        btnDeleteDoc = new org.edisoncor.gui.button.ButtonColoredAction();
        btnGuardarModDoc = new org.edisoncor.gui.button.ButtonColoredAction();
        btnInsertDoc = new org.edisoncor.gui.button.ButtonColoredAction();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegDoc = new javax.swing.JTable();
        lblNombreDoc = new javax.swing.JLabel();
        lblApelliDoc = new javax.swing.JLabel();
        lblTiposDocuDoc = new javax.swing.JLabel();
        lblNroDocuDoc = new javax.swing.JLabel();
        lblNacionDoc = new javax.swing.JLabel();
        lblGeneroDoc = new javax.swing.JLabel();
        lblBarrioDoc = new javax.swing.JLabel();
        lblDomicilioDoc = new javax.swing.JLabel();
        txtNombreDoc = new org.edisoncor.gui.textField.TextField();
        txtApellidoDoc = new org.edisoncor.gui.textField.TextField();
        cboTiposDocumentosDoc = new javax.swing.JComboBox<>();
        txtNroDocuDoc = new org.edisoncor.gui.textField.TextField();
        cboNacionDoc = new javax.swing.JComboBox<>();
        txtGeneroDoc = new org.edisoncor.gui.textField.TextField();
        cboBarrioDoc = new javax.swing.JComboBox<>();
        txtDomicilioDoc = new org.edisoncor.gui.textField.TextField();
        lblCivliDoc = new javax.swing.JLabel();
        lblEmailDoc = new javax.swing.JLabel();
        lblCeluDoc = new javax.swing.JLabel();
        lblTelDoc = new javax.swing.JLabel();
        cboEstadoCivilDoc = new javax.swing.JComboBox<>();
        txtEmailDoc = new org.edisoncor.gui.textField.TextField();
        txtCelularDoc = new org.edisoncor.gui.textField.TextField();
        txtTelDoc = new org.edisoncor.gui.textField.TextField();
        cboLocalidadesDoc = new javax.swing.JComboBox<>();
        lblLocalDoc = new javax.swing.JLabel();
        cboTiposDocentes = new javax.swing.JComboBox<>();
        lblTiposDocTutor1 = new javax.swing.JLabel();
        lblFecNacDoc = new javax.swing.JLabel();
        jdpFecNacDoc = new org.jdesktop.swingx.JXDatePicker();
        jdpFecAltaDoc = new org.jdesktop.swingx.JXDatePicker();
        lblFecAltaDoc = new javax.swing.JLabel();
        jdpFecBajaDoc = new org.jdesktop.swingx.JXDatePicker();
        lblFecBajaDoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAS - REGISTRO DE DOCENTES");
        setIconImage(getIconImage());
        setName("frmDocentes"); // NOI18N
        setUndecorated(true);

        pnlDocentes.setBackground(new java.awt.Color(255, 255, 255));
        pnlDocentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        pnlDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otroFondo2.jpg"))); // NOI18N

        pnl2Docente.setBackground(new java.awt.Color(0, 0, 0));
        pnl2Docente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl2Docente.setColorPrimario(new java.awt.Color(0, 0, 0));
        pnl2Docente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl2DocenteMouseDragged(evt);
            }
        });
        pnl2Docente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl2DocenteMousePressed(evt);
            }
        });

        lblRegDocente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblRegDocente.setForeground(new java.awt.Color(255, 255, 255));
        lblRegDocente.setText(" REGISTRO DE DOCENTES");

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

        javax.swing.GroupLayout pnl2DocenteLayout = new javax.swing.GroupLayout(pnl2Docente);
        pnl2Docente.setLayout(pnl2DocenteLayout);
        pnl2DocenteLayout.setHorizontalGroup(
            pnl2DocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2DocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegDocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        pnl2DocenteLayout.setVerticalGroup(
            pnl2DocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl2DocenteLayout.createSequentialGroup()
                .addGroup(pnl2DocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnNuevoDoc.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevoDoc.setBorder(null);
        btnNuevoDoc.setText("NUEVO");
        btnNuevoDoc.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnNuevoDoc.setDireccionDeSombra(0);
        btnNuevoDoc.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnNuevoDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoDoc.setProfundidad(new java.lang.Float(0.0F));
        btnNuevoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDocActionPerformed(evt);
            }
        });

        btnUpdateDoc.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdateDoc.setBorder(null);
        btnUpdateDoc.setText("MODIFICAR");
        btnUpdateDoc.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnUpdateDoc.setDireccionDeSombra(0);
        btnUpdateDoc.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnUpdateDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateDoc.setProfundidad(new java.lang.Float(0.0F));
        btnUpdateDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDocActionPerformed(evt);
            }
        });

        btnDeleteDoc.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteDoc.setBorder(null);
        btnDeleteDoc.setText("ELIMINAR");
        btnDeleteDoc.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnDeleteDoc.setDireccionDeSombra(0);
        btnDeleteDoc.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnDeleteDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteDoc.setProfundidad(new java.lang.Float(0.0F));
        btnDeleteDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDocActionPerformed(evt);
            }
        });

        btnGuardarModDoc.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarModDoc.setBorder(null);
        btnGuardarModDoc.setText("GUARDAR");
        btnGuardarModDoc.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnGuardarModDoc.setDireccionDeSombra(0);
        btnGuardarModDoc.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnGuardarModDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarModDoc.setProfundidad(new java.lang.Float(0.0F));
        btnGuardarModDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModDocActionPerformed(evt);
            }
        });

        btnInsertDoc.setBackground(new java.awt.Color(51, 51, 51));
        btnInsertDoc.setBorder(null);
        btnInsertDoc.setText("AGREGAR");
        btnInsertDoc.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnInsertDoc.setDireccionDeSombra(0);
        btnInsertDoc.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnInsertDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertDoc.setProfundidad(new java.lang.Float(0.0F));
        btnInsertDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDocActionPerformed(evt);
            }
        });

        tblRegDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tblRegDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRegDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegDocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegDoc);

        lblNombreDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblNombreDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNombreDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblNombreDoc.setText("Nombres: ");
        lblNombreDoc.setOpaque(true);

        lblApelliDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblApelliDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblApelliDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblApelliDoc.setText("Apellidos: ");
        lblApelliDoc.setOpaque(true);

        lblTiposDocuDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblTiposDocuDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTiposDocuDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblTiposDocuDoc.setText("Tipo de Documento: ");
        lblTiposDocuDoc.setOpaque(true);

        lblNroDocuDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblNroDocuDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNroDocuDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblNroDocuDoc.setText("Nro de Documento: ");
        lblNroDocuDoc.setOpaque(true);

        lblNacionDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblNacionDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNacionDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblNacionDoc.setText("Nacionalidad: ");
        lblNacionDoc.setOpaque(true);

        lblGeneroDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblGeneroDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblGeneroDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblGeneroDoc.setText("Genero: ");
        lblGeneroDoc.setOpaque(true);

        lblBarrioDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblBarrioDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblBarrioDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblBarrioDoc.setText("Barrio: ");
        lblBarrioDoc.setOpaque(true);

        lblDomicilioDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblDomicilioDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDomicilioDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblDomicilioDoc.setText("Domicilio: ");
        lblDomicilioDoc.setOpaque(true);

        txtNombreDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtApellidoDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboTiposDocumentosDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboTiposDocumentosDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNroDocuDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboNacionDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboNacionDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtGeneroDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboBarrioDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboBarrioDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDomicilioDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        lblCivliDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblCivliDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCivliDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblCivliDoc.setText("Estado Civil: ");
        lblCivliDoc.setOpaque(true);

        lblEmailDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblEmailDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblEmailDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblEmailDoc.setText("E-mail: ");
        lblEmailDoc.setOpaque(true);

        lblCeluDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblCeluDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCeluDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblCeluDoc.setText("Celular: ");
        lblCeluDoc.setOpaque(true);

        lblTelDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblTelDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTelDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblTelDoc.setText("Telefono: ");
        lblTelDoc.setOpaque(true);

        cboEstadoCivilDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboEstadoCivilDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtEmailDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtCelularDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtTelDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboLocalidadesDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboLocalidadesDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboLocalidadesDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalidadesDocActionPerformed(evt);
            }
        });

        lblLocalDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblLocalDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblLocalDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblLocalDoc.setText("Localidad:");
        lblLocalDoc.setOpaque(true);

        cboTiposDocentes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboTiposDocentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTiposDocTutor1.setBackground(new java.awt.Color(0, 102, 0));
        lblTiposDocTutor1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTiposDocTutor1.setForeground(new java.awt.Color(153, 255, 153));
        lblTiposDocTutor1.setText("Asignatura del Docente: ");
        lblTiposDocTutor1.setOpaque(true);

        lblFecNacDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblFecNacDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFecNacDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblFecNacDoc.setText("Fecha de Nacimiento: ");
        lblFecNacDoc.setOpaque(true);

        jdpFecNacDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdpFecNacDocActionPerformed(evt);
            }
        });

        jdpFecAltaDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdpFecAltaDocActionPerformed(evt);
            }
        });

        lblFecAltaDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblFecAltaDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFecAltaDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblFecAltaDoc.setText("Fecha Alta: ");
        lblFecAltaDoc.setOpaque(true);

        jdpFecBajaDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdpFecBajaDocActionPerformed(evt);
            }
        });

        lblFecBajaDoc.setBackground(new java.awt.Color(0, 102, 0));
        lblFecBajaDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFecBajaDoc.setForeground(new java.awt.Color(153, 255, 153));
        lblFecBajaDoc.setText("Fecha Baja: ");
        lblFecBajaDoc.setOpaque(true);

        javax.swing.GroupLayout pnlDocentesLayout = new javax.swing.GroupLayout(pnlDocentes);
        pnlDocentes.setLayout(pnlDocentesLayout);
        pnlDocentesLayout.setHorizontalGroup(
            pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl2Docente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDocentesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnNuevoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarModDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnInsertDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(pnlDocentesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiposDocuDoc)
                    .addComponent(lblApelliDoc)
                    .addComponent(lblNroDocuDoc)
                    .addComponent(lblNacionDoc)
                    .addComponent(lblGeneroDoc)
                    .addComponent(lblBarrioDoc)
                    .addComponent(lblDomicilioDoc)
                    .addComponent(lblNombreDoc)
                    .addComponent(lblCivliDoc)
                    .addComponent(lblEmailDoc)
                    .addComponent(lblTelDoc)
                    .addComponent(lblCeluDoc)
                    .addComponent(lblLocalDoc)
                    .addComponent(lblTiposDocTutor1)
                    .addComponent(lblFecNacDoc)
                    .addComponent(lblFecAltaDoc)
                    .addComponent(lblFecBajaDoc))
                .addGap(26, 26, 26)
                .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdpFecAltaDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jdpFecNacDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCelularDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidoDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGeneroDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboBarrioDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNacionDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNroDocuDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTiposDocumentosDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboEstadoCivilDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDomicilioDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmailDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLocalidadesDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTiposDocentes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdpFecBajaDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pnlDocentesLayout.setVerticalGroup(
            pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocentesLayout.createSequentialGroup()
                .addComponent(pnl2Docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDocentesLayout.createSequentialGroup()
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTiposDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTiposDocTutor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApelliDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTiposDocumentosDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTiposDocuDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroDocuDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNroDocuDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNacionDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacionDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecNacDoc)
                            .addComponent(jdpFecNacDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGeneroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGeneroDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLocalDoc)
                            .addComponent(cboLocalidadesDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBarrioDoc)
                            .addComponent(cboBarrioDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDomicilioDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDomicilioDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCivliDoc)
                            .addComponent(cboEstadoCivilDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailDoc)
                            .addComponent(txtEmailDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCeluDoc)
                            .addComponent(txtCelularDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelDoc)
                            .addComponent(txtTelDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecAltaDoc)
                            .addComponent(jdpFecAltaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecBajaDoc)
                            .addComponent(jdpFecBajaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(7, 7, 7)
                .addGroup(pnlDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarModDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int xx, xy;
    private void pnl2DocenteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2DocenteMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnl2DocenteMouseDragged

    private void pnl2DocenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2DocenteMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnl2DocenteMousePressed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la ventana?", "Selecione una Opción", YES_NO_OPTION, QUESTION_MESSAGE);
        if (respuesta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDocActionPerformed
        activarNuevo();
        limpiar();
        jdpFecNacDoc.setEnabled(true);
        jdpFecAltaDoc.setEnabled(true);
        jdpFecBajaDoc.setEnabled(true);
    }//GEN-LAST:event_btnNuevoDocActionPerformed

    private void btnUpdateDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDocActionPerformed
        idDocenteModificar = (int) tblRegDoc.getValueAt(tblRegDoc.getSelectedRow(), 0);
        ArrayList<Docentes> list = g.getDocentes();
        for (Docentes x : list) {
            if (x.getIdDocente() == idDocenteModificar) {
                for (TiposDocentes tiposDocentes : listTipoDoce) {
                    if (tiposDocentes.getIdTipoDocente() == x.getIdTipoDocente()) {
                        cboTiposDocentes.setSelectedItem(tiposDocentes.getDescripcion());
                    }
                }
                txtNombreDoc.setText(x.getNombre());
                txtApellidoDoc.setText(x.getApellido());
                for (TiposDocumentos tiposDocumentos : listDoc) {
                    if (tiposDocumentos.getIdTipoDocumento() == x.getIdTipoDocumento()) {
                        cboTiposDocumentosDoc.setSelectedItem(tiposDocumentos.getDescripcion());
                    }
                }
                txtNroDocuDoc.setText(x.getDocumento() + "");
                for (Nacionalidades nacionalidades : listNac) {
                    if (nacionalidades.getIdNacionalidad() == x.getIdNacionalidad()) {
                        cboNacionDoc.setSelectedItem(nacionalidades.getDescripcion());
                    }
                }
                jdpFecNacDoc.setDate(x.getFechaNac());
                txtGeneroDoc.setText(x.getGenero());
                for (Barrios barrios : listBar) {
                    if (barrios.getIdBarrio() == x.getIdBarrio()) {
                        cboBarrioDoc.setSelectedItem(barrios.getDescripcion());
                        for (Localidades localidades : listLoc) {
                            if (localidades.getIdLocalidad() == x.getIdBarrio()) {
                                cboLocalidadesDoc.setSelectedItem(localidades.getDescripcion());
                            }
                        }
                    }
                }
                txtDomicilioDoc.setText(x.getDomicilio());
                for (EstadosCiviles estadosCiviles : listCivil) {
                    if (estadosCiviles.getIdEstadoCivil() == x.getIdEstadoCivil()) {
                        cboEstadoCivilDoc.setSelectedItem(estadosCiviles.getDescripcion());
                    }
                }
                txtEmailDoc.setText(x.getEmail());
                txtCelularDoc.setText(x.getCelular());
                txtTelDoc.setText(x.getTelefono());
                jdpFecAltaDoc.setDate(x.getFechaNac());
                jdpFecBajaDoc.setDate(x.getFechaNac());
            }
        }
        cboTiposDocentes.setEnabled(true);
        txtNombreDoc.setEnabled(true);
        txtApellidoDoc.setEnabled(true);
        txtDomicilioDoc.setEnabled(true);
        txtGeneroDoc.setEnabled(true);
        txtNroDocuDoc.setEnabled(true);
        jdpFecNacDoc.setEnabled(true);
        cboBarrioDoc.setEnabled(true);
        cboLocalidadesDoc.setEnabled(true);
        cboNacionDoc.setEnabled(true);
        cboTiposDocumentosDoc.setEnabled(true);
        cboEstadoCivilDoc.setEnabled(true);
        txtEmailDoc.setEnabled(true);
        txtCelularDoc.setEnabled(true);
        txtTelDoc.setEnabled(true);
        jdpFecAltaDoc.setEnabled(true);
        jdpFecBajaDoc.setEnabled(true);
        btnGuardarModDoc.setEnabled(true);
        btnDeleteDoc.setEnabled(false);
    }//GEN-LAST:event_btnUpdateDocActionPerformed

    private void btnDeleteDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDocActionPerformed
        try {
            int idDocDelete = (int) tblRegDoc.getValueAt(tblRegDoc.getSelectedRow(), 0);
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al docente?", "Selecione una Opción", YES_NO_OPTION, QUESTION_MESSAGE);
            if (respuesta == 0) {
                g.EliminarDocente(idDocDelete);
            }
            actualizarTabla();
            JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
        } catch (Exception e) {
            System.out.println("Error metodo eliminar DOCENTE ");
        }
    }//GEN-LAST:event_btnDeleteDocActionPerformed

    private void btnGuardarModDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModDocActionPerformed
        int idTipoDocente = 0;
        for (TiposDocentes tiposDocentes : listTipoDoce) {
            if (tiposDocentes.getDescripcion() == cboTiposDocentes.getSelectedItem()) {
                idTipoDocente = (tiposDocentes.getIdTipoDocente());
            }
        }
        String nombre = txtNombreDoc.getText();
        String apellido = txtApellidoDoc.getText();
        int idTipoDocumento = 0;
        for (TiposDocumentos tiposDocumentos : listDoc) {
            if (tiposDocumentos.getDescripcion().equals(cboTiposDocumentosDoc.getSelectedItem())) {
                idTipoDocumento = (tiposDocumentos.getIdTipoDocumento());
            }
        }
        int documento = Integer.parseInt(txtNroDocuDoc.getText());
        int idNacionalidad = 0;
        for (Nacionalidades nacionalidades : listNac) {
            if (nacionalidades.getDescripcion().equals(cboNacionDoc.getSelectedItem())) {
                idNacionalidad = (nacionalidades.getIdNacionalidad());
            }
        }
        java.sql.Date fechaNac = new java.sql.Date(jdpFecNacDoc.getDate().getTime());
        String genero = txtGeneroDoc.getText();
        int idBarrio = 0;
        for (Barrios barrios : listBar) {
            if (barrios.getDescripcion().equals(cboBarrioDoc.getSelectedItem())) {
                idBarrio = barrios.getIdBarrio();
            }
        }
        String domicilio = txtDomicilioDoc.getText();
        int idEstadoCivil = 0;
        for (EstadosCiviles estadosCiviles : listCivil) {
            if (estadosCiviles.getDescripcion().equals(cboEstadoCivilDoc.getSelectedItem())) {
                idEstadoCivil = (estadosCiviles.getIdEstadoCivil());
            }
        }
        String email = txtEmailDoc.getText();
        String celular = txtCelularDoc.getText();
        String telefono = txtTelDoc.getText();
        java.sql.Date fechaAlta = new java.sql.Date(jdpFecAltaDoc.getDate().getTime());
        java.sql.Date fechaBaja = new java.sql.Date(jdpFecBajaDoc.getDate().getTime());

        Docentes d = new Docentes(fechaNac, email, telefono, celular, idTipoDocente, idEstadoCivil, fechaAlta, fechaBaja, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);

        g.ModificarDocente(d);
        actualizarTabla();
        limpiar();
        btnUpdateDoc.setEnabled(false);
        btnInsertDoc.setEnabled(false);
        btnDeleteDoc.setEnabled(true);
        btnNuevoDoc.setEnabled(true);
        btnGuardarModDoc.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Guardado con exito");
    }//GEN-LAST:event_btnGuardarModDocActionPerformed

    private void btnInsertDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertDocActionPerformed
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("exec procInsertDocentes ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");

            for (TiposDocentes tiposDocentes : listTipoDoce) {
                if (tiposDocentes.getDescripcion() == cboTiposDocentes.getSelectedItem()) {
                    ps.setInt(1, tiposDocentes.getIdTipoDocente());
                }
            }
            ps.setString(2, txtNombreDoc.getText());
            ps.setString(3, txtApellidoDoc.getText());
            for (TiposDocumentos tiposDocumentos : listDoc) {
                if (tiposDocumentos.getDescripcion().equals(cboTiposDocumentosDoc.getSelectedItem())) {
                    ps.setInt(4, tiposDocumentos.getIdTipoDocumento());
                }
            }
            ps.setInt(5, Integer.parseInt(txtNroDocuDoc.getText()));
            for (Nacionalidades nacionalidades : listNac) {
                if (nacionalidades.getDescripcion().equals(cboNacionDoc.getSelectedItem())) {
                    ps.setInt(6, nacionalidades.getIdNacionalidad());
                }
            }
            java.sql.Date fechaNac = new java.sql.Date(jdpFecNacDoc.getDate().getTime());
            ps.setDate(7, fechaNac);
            ps.setString(8, txtGeneroDoc.getText());
            for (Barrios barrios : listBar) {
                if (barrios.getDescripcion().equals(cboBarrioDoc.getSelectedItem())) {
                    ps.setInt(9, barrios.getIdBarrio());
                }
            }
            ps.setString(10, txtDomicilioDoc.getText());
            for (EstadosCiviles estadosCiviles : listCivil) {
                if (estadosCiviles.getDescripcion().equals(cboEstadoCivilDoc.getSelectedItem())) {
                    ps.setInt(11, estadosCiviles.getIdEstadoCivil());
                }
            }
            ps.setString(12, txtEmailDoc.getText());
            ps.setString(13, txtCelularDoc.getText());
            ps.setString(14, txtTelDoc.getText());
            java.sql.Date fechaAlta = new java.sql.Date(jdpFecAltaDoc.getDate().getTime());
            ps.setDate(15, fechaAlta);
            java.sql.Date fechaBaja = new java.sql.Date(jdpFecBajaDoc.getDate().getTime());
            ps.setDate(16, fechaBaja);

            ps.execute();

            ps.close();
            conexion.close();
            actualizarTabla();
            limpiar();
            Desactivar();
            JOptionPane.showMessageDialog(null, "Cargado con exito");
        } catch (SQLException ex) {
            System.out.println("Error metodo AGREGAR DOCENTE " + ex);
        }
    }//GEN-LAST:event_btnInsertDocActionPerformed

    private void tblRegDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegDocMouseClicked
        btnUpdateDoc.setEnabled(true);
        btnInsertDoc.setEnabled(false);
        btnDeleteDoc.setEnabled(true);
        btnNuevoDoc.setEnabled(false);
        btnGuardarModDoc.setEnabled(false);
    }//GEN-LAST:event_tblRegDocMouseClicked

    private void cboLocalidadesDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalidadesDocActionPerformed
        int idLocalidad = 0;
        cboBarrioDoc.removeAllItems();
        for (Localidades localidades : listLoc) {
            if (localidades.getDescripcion() == cboLocalidadesDoc.getSelectedItem()) {
                idLocalidad = localidades.getIdLocalidad();
            }
        }
        for (Barrios barrios : listBar) {
            if (barrios.getIdLocalidad() == idLocalidad) {
                cboBarrioDoc.addItem(barrios.getDescripcion());
            }
        }
    }//GEN-LAST:event_cboLocalidadesDocActionPerformed

    private void jdpFecNacDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdpFecNacDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdpFecNacDocActionPerformed

    private void jdpFecAltaDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdpFecAltaDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdpFecAltaDocActionPerformed

    private void jdpFecBajaDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdpFecBajaDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdpFecBajaDocActionPerformed

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
            java.util.logging.Logger.getLogger(abmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abmDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private org.edisoncor.gui.button.ButtonColoredAction btnDeleteDoc;
    private org.edisoncor.gui.button.ButtonColoredAction btnGuardarModDoc;
    private org.edisoncor.gui.button.ButtonColoredAction btnInsertDoc;
    private javax.swing.JButton btnMinimizar;
    private org.edisoncor.gui.button.ButtonColoredAction btnNuevoDoc;
    private org.edisoncor.gui.button.ButtonColoredAction btnUpdateDoc;
    private javax.swing.JComboBox<String> cboBarrioDoc;
    private javax.swing.JComboBox<String> cboEstadoCivilDoc;
    private javax.swing.JComboBox<String> cboLocalidadesDoc;
    private javax.swing.JComboBox<String> cboNacionDoc;
    private javax.swing.JComboBox<String> cboTiposDocentes;
    private javax.swing.JComboBox<String> cboTiposDocumentosDoc;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXDatePicker jdpFecAltaDoc;
    private org.jdesktop.swingx.JXDatePicker jdpFecBajaDoc;
    private org.jdesktop.swingx.JXDatePicker jdpFecNacDoc;
    private javax.swing.JLabel lblApelliDoc;
    private javax.swing.JLabel lblBarrioDoc;
    private javax.swing.JLabel lblCeluDoc;
    private javax.swing.JLabel lblCivliDoc;
    private javax.swing.JLabel lblDomicilioDoc;
    private javax.swing.JLabel lblEmailDoc;
    private javax.swing.JLabel lblFecAltaDoc;
    private javax.swing.JLabel lblFecBajaDoc;
    private javax.swing.JLabel lblFecNacDoc;
    private javax.swing.JLabel lblGeneroDoc;
    private javax.swing.JLabel lblLocalDoc;
    private javax.swing.JLabel lblNacionDoc;
    private javax.swing.JLabel lblNombreDoc;
    private javax.swing.JLabel lblNroDocuDoc;
    private javax.swing.JLabel lblRegDocente;
    private javax.swing.JLabel lblTelDoc;
    private javax.swing.JLabel lblTiposDocTutor1;
    private javax.swing.JLabel lblTiposDocuDoc;
    private org.edisoncor.gui.panel.Panel pnl2Docente;
    private org.edisoncor.gui.panel.Panel pnlDocentes;
    private javax.swing.JTable tblRegDoc;
    private org.edisoncor.gui.textField.TextField txtApellidoDoc;
    private org.edisoncor.gui.textField.TextField txtCelularDoc;
    private org.edisoncor.gui.textField.TextField txtDomicilioDoc;
    private org.edisoncor.gui.textField.TextField txtEmailDoc;
    private org.edisoncor.gui.textField.TextField txtGeneroDoc;
    private org.edisoncor.gui.textField.TextField txtNombreDoc;
    private org.edisoncor.gui.textField.TextField txtNroDocuDoc;
    private org.edisoncor.gui.textField.TextField txtTelDoc;
    // End of variables declaration//GEN-END:variables
    private void activarNuevo() {
        cboTiposDocentes.setEnabled(true);
        txtNombreDoc.setEnabled(true);
        txtApellidoDoc.setEnabled(true);
        cboTiposDocumentosDoc.setSelectedIndex(0);
        cboTiposDocumentosDoc.setEnabled(true);
        txtNroDocuDoc.setEnabled(true);
        cboNacionDoc.setSelectedIndex(0);
        cboNacionDoc.setEnabled(true);
        jdpFecNacDoc.setEnabled(true);
        txtGeneroDoc.setEnabled(true);
        cboLocalidadesDoc.setSelectedIndex(0);
        cboLocalidadesDoc.setEnabled(true);
        cboBarrioDoc.setSelectedIndex(0);
        cboBarrioDoc.setEnabled(true);
        txtDomicilioDoc.setEnabled(true);
        cboEstadoCivilDoc.setSelectedIndex(0);
        cboEstadoCivilDoc.setEnabled(true);
        txtEmailDoc.setEnabled(true);
        txtCelularDoc.setEnabled(true);
        txtTelDoc.setEnabled(true);
        jdpFecAltaDoc.setEnabled(true);
        jdpFecBajaDoc.setEnabled(true);
        btnInsertDoc.setEnabled(true);
        btnDeleteDoc.setEnabled(false);
        btnUpdateDoc.setEnabled(false);
        btnNuevoDoc.setEnabled(false);
        btnGuardarModDoc.setEnabled(false);
    }

    private void limpiar() {
        cboTiposDocentes.setSelectedIndex(-1);
        txtNombreDoc.setText("");
        txtApellidoDoc.setText("");
        txtDomicilioDoc.setText("");
        txtGeneroDoc.setText("");
        txtNroDocuDoc.setText("");
        jdpFecNacDoc.setEnabled(false);
        cboBarrioDoc.setSelectedIndex(-1);
        cboLocalidadesDoc.setSelectedIndex(-1);
        cboNacionDoc.setSelectedIndex(-1);
        cboTiposDocumentosDoc.setSelectedIndex(-1);
        cboEstadoCivilDoc.setSelectedIndex(-1);
        txtEmailDoc.setText("");
        txtCelularDoc.setText("");
        txtTelDoc.setText("");;
        jdpFecAltaDoc.setEnabled(false);
        jdpFecBajaDoc.setEnabled(false);

    }

    private void Desactivar() {
        cboTiposDocentes.setEnabled(false);
        txtNombreDoc.setEnabled(false);
        txtApellidoDoc.setEnabled(false);
        txtDomicilioDoc.setEnabled(false);
        txtGeneroDoc.setEnabled(false);
        txtNroDocuDoc.setEnabled(false);
        jdpFecNacDoc.setEnabled(false);
        cboBarrioDoc.setSelectedIndex(-1);
        cboBarrioDoc.setEnabled(false);
        cboLocalidadesDoc.setSelectedIndex(-1);
        cboLocalidadesDoc.setEnabled(false);
        cboNacionDoc.setSelectedIndex(-1);
        cboNacionDoc.setEnabled(false);
        cboTiposDocumentosDoc.setSelectedIndex(-1);
        cboTiposDocumentosDoc.setEnabled(false);
        cboEstadoCivilDoc.setSelectedIndex(-1);
        cboEstadoCivilDoc.setEnabled(false);
        txtEmailDoc.setEnabled(false);
        txtCelularDoc.setEnabled(false);
        txtTelDoc.setEnabled(false);
        jdpFecAltaDoc.setEnabled(false);
        jdpFecBajaDoc.setEnabled(false);
        btnInsertDoc.setEnabled(false);
        btnGuardarModDoc.setEnabled(false);
        btnUpdateDoc.setEnabled(false);
        btnDeleteDoc.setEnabled(true);
        btnNuevoDoc.setEnabled(true);

    }
}

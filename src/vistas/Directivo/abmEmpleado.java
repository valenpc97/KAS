package vistas.Directivo;

import Controlador.GestorBD;
import Model.Barrios;
import Model.Empleados;
import Model.EstadosCiviles;
import Model.Localidades;
import Model.Nacionalidades;
import Model.TiposDocumentos;
import Model.TiposEmpleados;
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

public class abmEmpleado extends javax.swing.JFrame {

    GestorBD g = new GestorBD();
    private static final String PASS = "123";
    private static final String USER = "sa";
    private static final String CADENA = "jdbc:sqlserver://DESKTOP-ANUONV0:1433;databaseName=KASprueba";
    principalDirectivo pdi;
    String ventana = "";

    DefaultComboBoxModel cboModelEmplea = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelDoc = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelNac = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelLoc = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelBar = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelCivil = new DefaultComboBoxModel();
    ArrayList<TiposEmpleados> listEmplea = g.getTiposEmpleados();
    ArrayList<TiposDocumentos> listDoc = g.getDocumentos();
    ArrayList<Nacionalidades> listNac = g.getNacionalidades();
    ArrayList<Localidades> listLoc = g.getLocalidades();
    ArrayList<Barrios> listBar = g.getBarrios();
    ArrayList<EstadosCiviles> listCivil = g.getEstadosCiviles();
    int idEmpleaModificar = 0;

    public abmEmpleado() {
        initComponents();
        actualizarTabla();
        Desactivar();
        for (TiposEmpleados tiposEmpleados : listEmplea) {
            cboModelEmplea.addElement(tiposEmpleados.getDescripcion());
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
        cboTiposEmplea.setModel(cboModelEmplea);
        cboTiposDocumentosEmplea.setModel(cboModelDoc);
        cboNacionEmplea.setModel(cboModelNac);
        cboLocalidadesEmplea.setModel(cboModelLoc);
        cboBarrioEmplea.setModel(cboModelBar);
        cboEstadoCivilEmplea.setModel(cboModelCivil);
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

        ArrayList<Empleados> list = g.getEmpleados();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tmodel.setColumnIdentifiers(new Object[]{"Cargo del Empleado", "Nombre", "Apellido", "Celular"});
        for (Empleados empleados : list) {
            tmodel.addRow(new Object[]{empleados.getDescripcion(), empleados.getNombre(), empleados.getApellido(), empleados.getCelular()});
        }
        tblRegEmpleado.setModel(tmodel);
        tblRegEmpleado.getTableHeader().setReorderingAllowed(false);
        tblRegEmpleado.getTableHeader().setBackground(new Color(153, 255, 153));
        tblRegEmpleado.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
        tblRegEmpleado.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblRegEmpleado.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegEmpleado.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegEmpleado.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblRegEmpleado.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblRegEmpleado.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblRegEmpleado.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        pnl2Estudiante = new org.edisoncor.gui.panel.Panel();
        lblRegDocente = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnNuevoEmplea = new org.edisoncor.gui.button.ButtonColoredAction();
        btnUpdateEmplea = new org.edisoncor.gui.button.ButtonColoredAction();
        btnDeleteEmplea = new org.edisoncor.gui.button.ButtonColoredAction();
        btnGuardarModEmplea = new org.edisoncor.gui.button.ButtonColoredAction();
        btnInsertEmplea = new org.edisoncor.gui.button.ButtonColoredAction();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegEmpleado = new javax.swing.JTable();
        txtNombreEmplea = new org.edisoncor.gui.textField.TextField();
        cboTiposDocumentosEmplea = new javax.swing.JComboBox<>();
        txtApellidoEmplea = new org.edisoncor.gui.textField.TextField();
        txtNroDocEmplea = new org.edisoncor.gui.textField.TextField();
        cboNacionEmplea = new javax.swing.JComboBox<>();
        jdpFecNacEmplea = new org.jdesktop.swingx.JXDatePicker();
        txtGeneroEmplea = new org.edisoncor.gui.textField.TextField();
        cboLocalidadesEmplea = new javax.swing.JComboBox<>();
        cboBarrioEmplea = new javax.swing.JComboBox<>();
        txtDomicilioEmplea = new org.edisoncor.gui.textField.TextField();
        lblDomicilioEmplea = new javax.swing.JLabel();
        lblBarrioEmplea = new javax.swing.JLabel();
        lblLocalEmplea = new javax.swing.JLabel();
        lblGeneroEmplea = new javax.swing.JLabel();
        lblFecNacEmplea = new javax.swing.JLabel();
        lblNacionEmplea = new javax.swing.JLabel();
        lblNroDocEmplea = new javax.swing.JLabel();
        lblTipoDocEmplea = new javax.swing.JLabel();
        lblApellidoEmplea = new javax.swing.JLabel();
        lblNombreEmplea = new javax.swing.JLabel();
        lblCargoEmplea = new javax.swing.JLabel();
        cboTiposEmplea = new javax.swing.JComboBox<>();
        jdpFecBajaEmplea = new org.jdesktop.swingx.JXDatePicker();
        jdpFecAltaEmplea = new org.jdesktop.swingx.JXDatePicker();
        lblFecBajaEmplea = new javax.swing.JLabel();
        lblFecAltaEmplea = new javax.swing.JLabel();
        lblTelEmplea = new javax.swing.JLabel();
        lblCeluEmplea = new javax.swing.JLabel();
        txtCelularEmplea = new org.edisoncor.gui.textField.TextField();
        txtTelEmplea = new org.edisoncor.gui.textField.TextField();
        cboEstadoCivilEmplea = new javax.swing.JComboBox<>();
        lblCivliEmplea = new javax.swing.JLabel();
        lblEmailEmplea = new javax.swing.JLabel();
        txtEmailEmplea = new org.edisoncor.gui.textField.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAS - REGISTRO DE EMPLEADOS");
        setIconImage(getIconImage());
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otroFondo2.jpg"))); // NOI18N

        pnl2Estudiante.setBackground(new java.awt.Color(0, 0, 0));
        pnl2Estudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl2Estudiante.setColorPrimario(new java.awt.Color(0, 0, 0));
        pnl2Estudiante.setName(""); // NOI18N

        lblRegDocente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblRegDocente.setForeground(new java.awt.Color(255, 255, 255));
        lblRegDocente.setText(" REGISTRO DE EMPLEADOS");

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

        javax.swing.GroupLayout pnl2EstudianteLayout = new javax.swing.GroupLayout(pnl2Estudiante);
        pnl2Estudiante.setLayout(pnl2EstudianteLayout);
        pnl2EstudianteLayout.setHorizontalGroup(
            pnl2EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2EstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl2EstudianteLayout.setVerticalGroup(
            pnl2EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2EstudianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegDocente)
                .addContainerGap())
            .addGroup(pnl2EstudianteLayout.createSequentialGroup()
                .addGroup(pnl2EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnNuevoEmplea.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevoEmplea.setBorder(null);
        btnNuevoEmplea.setText("NUEVO");
        btnNuevoEmplea.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnNuevoEmplea.setDireccionDeSombra(0);
        btnNuevoEmplea.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnNuevoEmplea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoEmplea.setProfundidad(new java.lang.Float(0.0F));
        btnNuevoEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleaActionPerformed(evt);
            }
        });

        btnUpdateEmplea.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdateEmplea.setBorder(null);
        btnUpdateEmplea.setText("MODIFICAR");
        btnUpdateEmplea.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnUpdateEmplea.setDireccionDeSombra(0);
        btnUpdateEmplea.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnUpdateEmplea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateEmplea.setProfundidad(new java.lang.Float(0.0F));
        btnUpdateEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmpleaActionPerformed(evt);
            }
        });

        btnDeleteEmplea.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteEmplea.setBorder(null);
        btnDeleteEmplea.setText("ELIMINAR");
        btnDeleteEmplea.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnDeleteEmplea.setDireccionDeSombra(0);
        btnDeleteEmplea.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnDeleteEmplea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteEmplea.setProfundidad(new java.lang.Float(0.0F));
        btnDeleteEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmpleaActionPerformed(evt);
            }
        });

        btnGuardarModEmplea.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarModEmplea.setBorder(null);
        btnGuardarModEmplea.setText("GUARDAR");
        btnGuardarModEmplea.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnGuardarModEmplea.setDireccionDeSombra(0);
        btnGuardarModEmplea.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnGuardarModEmplea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarModEmplea.setProfundidad(new java.lang.Float(0.0F));
        btnGuardarModEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModEmpleaActionPerformed(evt);
            }
        });

        btnInsertEmplea.setBackground(new java.awt.Color(51, 51, 51));
        btnInsertEmplea.setBorder(null);
        btnInsertEmplea.setText("AGREGAR");
        btnInsertEmplea.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnInsertEmplea.setDireccionDeSombra(0);
        btnInsertEmplea.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnInsertEmplea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertEmplea.setProfundidad(new java.lang.Float(0.0F));
        btnInsertEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertEmpleaActionPerformed(evt);
            }
        });

        tblRegEmpleado.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tblRegEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRegEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegEmpleado);

        txtNombreEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboTiposDocumentosEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboTiposDocumentosEmplea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtApellidoEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtNroDocEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboNacionEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboNacionEmplea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jdpFecNacEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdpFecNacEmpleaActionPerformed(evt);
            }
        });

        txtGeneroEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboLocalidadesEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboLocalidadesEmplea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboLocalidadesEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalidadesEmpleaActionPerformed(evt);
            }
        });

        cboBarrioEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboBarrioEmplea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDomicilioEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        lblDomicilioEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblDomicilioEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDomicilioEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblDomicilioEmplea.setText("Domicilio: ");
        lblDomicilioEmplea.setOpaque(true);

        lblBarrioEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblBarrioEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblBarrioEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblBarrioEmplea.setText("Barrio: ");
        lblBarrioEmplea.setOpaque(true);

        lblLocalEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblLocalEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblLocalEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblLocalEmplea.setText("Localidad:");
        lblLocalEmplea.setOpaque(true);

        lblGeneroEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblGeneroEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblGeneroEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblGeneroEmplea.setText("Genero: ");
        lblGeneroEmplea.setOpaque(true);

        lblFecNacEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblFecNacEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFecNacEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblFecNacEmplea.setText("Fecha de Nacimiento: ");
        lblFecNacEmplea.setOpaque(true);

        lblNacionEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblNacionEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNacionEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblNacionEmplea.setText("Nacionalidad: ");
        lblNacionEmplea.setOpaque(true);

        lblNroDocEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblNroDocEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNroDocEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblNroDocEmplea.setText("Nro de Documento: ");
        lblNroDocEmplea.setOpaque(true);

        lblTipoDocEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblTipoDocEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblTipoDocEmplea.setText("Tipo de Documento: ");
        lblTipoDocEmplea.setOpaque(true);

        lblApellidoEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblApellidoEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblApellidoEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblApellidoEmplea.setText("Apellidos: ");
        lblApellidoEmplea.setOpaque(true);

        lblNombreEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblNombreEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNombreEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblNombreEmplea.setText("Nombres: ");
        lblNombreEmplea.setOpaque(true);

        lblCargoEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblCargoEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCargoEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblCargoEmplea.setText("Cargo de Empleado: ");
        lblCargoEmplea.setOpaque(true);

        cboTiposEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboTiposEmplea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboTiposEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTiposEmpleaActionPerformed(evt);
            }
        });

        jdpFecBajaEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdpFecBajaEmpleaActionPerformed(evt);
            }
        });

        jdpFecAltaEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdpFecAltaEmpleaActionPerformed(evt);
            }
        });

        lblFecBajaEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblFecBajaEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFecBajaEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblFecBajaEmplea.setText("Fecha Baja: ");
        lblFecBajaEmplea.setOpaque(true);

        lblFecAltaEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblFecAltaEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFecAltaEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblFecAltaEmplea.setText("Fecha Alta: ");
        lblFecAltaEmplea.setOpaque(true);

        lblTelEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblTelEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTelEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblTelEmplea.setText("Telefono: ");
        lblTelEmplea.setOpaque(true);

        lblCeluEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblCeluEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCeluEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblCeluEmplea.setText("Celular: ");
        lblCeluEmplea.setOpaque(true);

        txtCelularEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtTelEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboEstadoCivilEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboEstadoCivilEmplea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCivliEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblCivliEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCivliEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblCivliEmplea.setText("Estado Civil: ");
        lblCivliEmplea.setOpaque(true);

        lblEmailEmplea.setBackground(new java.awt.Color(0, 102, 0));
        lblEmailEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblEmailEmplea.setForeground(new java.awt.Color(153, 255, 153));
        lblEmailEmplea.setText("E-mail: ");
        lblEmailEmplea.setOpaque(true);

        txtEmailEmplea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl2Estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCivliEmplea)
                            .addComponent(lblEmailEmplea)
                            .addComponent(lblCeluEmplea)
                            .addComponent(lblTelEmplea)
                            .addComponent(lblFecAltaEmplea)
                            .addComponent(lblFecBajaEmplea)
                            .addComponent(lblDomicilioEmplea)
                            .addComponent(lblBarrioEmplea)
                            .addComponent(lblLocalEmplea)
                            .addComponent(lblGeneroEmplea)
                            .addComponent(lblFecNacEmplea)
                            .addComponent(lblNacionEmplea)
                            .addComponent(lblNroDocEmplea)
                            .addComponent(lblTipoDocEmplea)
                            .addComponent(lblApellidoEmplea)
                            .addComponent(lblNombreEmplea)
                            .addComponent(lblCargoEmplea))
                        .addGap(40, 40, 40)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtApellidoEmplea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboNacionEmplea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNroDocEmplea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboTiposDocumentosEmplea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombreEmplea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGeneroEmplea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jdpFecNacEmplea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboTiposEmplea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cboLocalidadesEmplea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cboBarrioEmplea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDomicilioEmplea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jdpFecAltaEmplea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCelularEmplea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboEstadoCivilEmplea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmailEmplea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelEmplea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdpFecBajaEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnNuevoEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(btnGuardarModEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 76, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(pnl2Estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTiposEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCargoEmplea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreEmplea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidoEmplea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTiposDocumentosEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoDocEmplea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroDocEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNroDocEmplea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNacionEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacionEmplea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecNacEmplea)
                            .addComponent(jdpFecNacEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGeneroEmplea)
                            .addComponent(txtGeneroEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLocalEmplea)
                            .addComponent(cboLocalidadesEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBarrioEmplea)
                            .addComponent(cboBarrioEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDomicilioEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDomicilioEmplea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCivliEmplea)
                            .addComponent(cboEstadoCivilEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailEmplea)
                            .addComponent(txtEmailEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCeluEmplea)
                            .addComponent(txtCelularEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelEmplea)
                            .addComponent(txtTelEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecAltaEmplea)
                            .addComponent(jdpFecAltaEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFecBajaEmplea)
                            .addComponent(jdpFecBajaEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addGap(11, 11, 11)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarModEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoEmplea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleaActionPerformed
        activarNuevo();
        limpiar();
        jdpFecNacEmplea.setEnabled(true);
    }//GEN-LAST:event_btnNuevoEmpleaActionPerformed

    private void btnUpdateEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmpleaActionPerformed
        idEmpleaModificar = (int) tblRegEmpleado.getValueAt(tblRegEmpleado.getSelectedRow(), 0);
        ArrayList<Empleados> list = g.getEmpleados();
        for (Empleados x : list) {
            if (x.getIdEmpleado() == idEmpleaModificar) {
                for (TiposEmpleados tiposEmpleados : listEmplea) {
                    if (tiposEmpleados.getIdTipoEmpleado() == x.getIdTipoEmpleado()) {
                        cboTiposEmplea.setSelectedItem(tiposEmpleados.getDescripcion());
                    }
                }
                txtNombreEmplea.setText(x.getNombre());
                txtApellidoEmplea.setText(x.getApellido());
                for (TiposDocumentos tiposDocumentos : listDoc) {
                    if (tiposDocumentos.getIdTipoDocumento() == x.getIdTipoDocumento()) {
                        cboTiposDocumentosEmplea.setSelectedItem(tiposDocumentos.getDescripcion());
                    }
                }
                txtNroDocEmplea.setText(x.getDocumento() + "");
                for (Nacionalidades nacionalidades : listNac) {
                    if (nacionalidades.getIdNacionalidad() == x.getIdNacionalidad()) {
                        cboNacionEmplea.setSelectedItem(nacionalidades.getDescripcion());
                    }
                }
                jdpFecNacEmplea.setDate(x.getFechaNac());
                txtGeneroEmplea.setText(x.getGenero());
                for (Barrios barrios : listBar) {
                    if (barrios.getIdBarrio() == x.getIdBarrio()) {
                        cboBarrioEmplea.setSelectedItem(barrios.getDescripcion());
                        for (Localidades localidades : listLoc) {
                            if (localidades.getIdLocalidad() == x.getIdBarrio()) {
                                cboLocalidadesEmplea.setSelectedItem(localidades.getDescripcion());
                            }
                        }
                    }
                }
                txtDomicilioEmplea.setText(x.getDomicilio());
                txtEmailEmplea.setText(x.getEmail());
                txtCelularEmplea.setText(x.getCelular());
                txtTelEmplea.setText(x.getTelefono());
                jdpFecAltaEmplea.setDate(x.getFechaNac());
                jdpFecBajaEmplea.setDate(x.getFechaNac());
            }
        }
        cboTiposEmplea.setEnabled(true);
        txtNombreEmplea.setEnabled(true);
        txtApellidoEmplea.setEnabled(true);
        cboTiposDocumentosEmplea.setEnabled(true);
        txtNroDocEmplea.setEnabled(true);
        cboNacionEmplea.setEnabled(true);
        jdpFecNacEmplea.setEnabled(true);
        txtGeneroEmplea.setEnabled(true);
        cboLocalidadesEmplea.setEnabled(true);
        cboBarrioEmplea.setEnabled(true);
        txtDomicilioEmplea.setEnabled(true);
        cboEstadoCivilEmplea.setEnabled(true);
        txtEmailEmplea.setEnabled(true);
        txtCelularEmplea.setEnabled(true);
        txtTelEmplea.setEnabled(true);
        jdpFecAltaEmplea.setEnabled(true);
        jdpFecBajaEmplea.setEnabled(true);
        btnGuardarModEmplea.setEnabled(true);
        btnDeleteEmplea.setEnabled(false);
    }//GEN-LAST:event_btnUpdateEmpleaActionPerformed

    private void btnDeleteEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmpleaActionPerformed
        try {
            int idEmpleaDelete = (int) tblRegEmpleado.getValueAt(tblRegEmpleado.getSelectedRow(), 0);
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?", "Selecione una Opción", YES_NO_OPTION, QUESTION_MESSAGE);
            if (respuesta == 0) {
                g.EliminarEmpleado(idEmpleaDelete);
            }
            actualizarTabla();
            JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
        } catch (Exception e) {
            System.out.println("Error metodo eliminar EMPLEADO ");
        }
    }//GEN-LAST:event_btnDeleteEmpleaActionPerformed

    private void btnGuardarModEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModEmpleaActionPerformed
        int idTipoEmpleados = 0;
        for (TiposEmpleados tiposEmpleados : listEmplea) {
            if (tiposEmpleados.getDescripcion().equals(cboTiposEmplea.getSelectedItem())) {
                idTipoEmpleados = (tiposEmpleados.getIdTipoEmpleado());
            }
        }
        String nombre = txtNombreEmplea.getText();
        String apellido = txtApellidoEmplea.getText();
        int idTipoDocumento = 0;
        for (TiposDocumentos tiposDocumentos : listDoc) {
            if (tiposDocumentos.getDescripcion().equals(cboTiposDocumentosEmplea.getSelectedItem())) {
                idTipoDocumento = (tiposDocumentos.getIdTipoDocumento());
            }
        }
        int documento = Integer.parseInt(txtNroDocEmplea.getText());
        int idNacionalidad = 0;
        for (Nacionalidades nacionalidades : listNac) {
            if (nacionalidades.getDescripcion().equals(cboNacionEmplea.getSelectedItem())) {
                idNacionalidad = (nacionalidades.getIdNacionalidad());
            }
        }
        java.sql.Date fechaNac = new java.sql.Date(jdpFecNacEmplea.getDate().getTime());
        String genero = txtGeneroEmplea.getText();
        int idBarrio = 0;
        for (Barrios barrios : listBar) {
            if (barrios.getDescripcion().equals(cboBarrioEmplea.getSelectedItem())) {
                idBarrio = barrios.getIdBarrio();
            }
        }
        String domicilio = txtDomicilioEmplea.getText();
        int idEstadoCivil = 0;
        for (EstadosCiviles estadosCiviles : listCivil) {
            if (estadosCiviles.getDescripcion().equals(cboEstadoCivilEmplea.getSelectedItem())) {
                idEstadoCivil = (estadosCiviles.getIdEstadoCivil());
            }
        }
        String email = txtEmailEmplea.getText();
        String celular = txtCelularEmplea.getText();
        String telefono = txtTelEmplea.getText();
        java.sql.Date fechaAlta = new java.sql.Date(jdpFecAltaEmplea.getDate().getTime());
        java.sql.Date fechaBaja = new java.sql.Date(jdpFecBajaEmplea.getDate().getTime());

        Empleados emp = new Empleados(fechaNac, email, telefono, celular, idTipoEmpleados, idEstadoCivil, fechaAlta, fechaBaja, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio);
        g.ModificarEmpleado(emp);
        actualizarTabla();
        limpiar();
        btnUpdateEmplea.setEnabled(false);
        btnInsertEmplea.setEnabled(false);
        btnDeleteEmplea.setEnabled(true);
        btnNuevoEmplea.setEnabled(true);
        btnGuardarModEmplea.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Guardado con exito");
    }//GEN-LAST:event_btnGuardarModEmpleaActionPerformed

    private void btnInsertEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertEmpleaActionPerformed
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("exec procInsertEmpleados ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");

            for (TiposEmpleados tiposEmpleados : listEmplea) {
                if (tiposEmpleados.getDescripcion() == cboTiposEmplea.getSelectedItem()) {
                    ps.setInt(1, tiposEmpleados.getIdTipoEmpleado());
                }
            }
            ps.setString(2, txtNombreEmplea.getText());
            ps.setString(3, txtApellidoEmplea.getText());
            for (TiposDocumentos tiposDocumentos : listDoc) {
                if (tiposDocumentos.getDescripcion().equals(cboTiposDocumentosEmplea.getSelectedItem())) {
                    ps.setInt(4, tiposDocumentos.getIdTipoDocumento());
                }
            }
            ps.setInt(5, Integer.parseInt(txtNroDocEmplea.getText()));
            for (Nacionalidades nacionalidades : listNac) {
                if (nacionalidades.getDescripcion().equals(cboNacionEmplea.getSelectedItem())) {
                    ps.setInt(6, nacionalidades.getIdNacionalidad());
                }
            }
            java.sql.Date fechaNac = new java.sql.Date(jdpFecNacEmplea.getDate().getTime());
            ps.setDate(7, fechaNac);
            ps.setString(8, txtGeneroEmplea.getText());
            for (Barrios barrios : listBar) {
                if (barrios.getDescripcion().equals(cboBarrioEmplea.getSelectedItem())) {
                    ps.setInt(9, barrios.getIdBarrio());
                }
            }
            ps.setString(10, txtDomicilioEmplea.getText());
            for (EstadosCiviles estadosCiviles : listCivil) {
                if (estadosCiviles.getDescripcion().equals(cboEstadoCivilEmplea.getSelectedItem())) {
                    ps.setInt(11, estadosCiviles.getIdEstadoCivil());
                }
            }
            ps.setString(12, txtEmailEmplea.getText());
            ps.setString(13, txtCelularEmplea.getText());
            ps.setString(14, txtTelEmplea.getText());
            java.sql.Date fechaAlta = new java.sql.Date(jdpFecAltaEmplea.getDate().getTime());
            ps.setDate(15, fechaAlta);
            java.sql.Date fechaBaja = new java.sql.Date(jdpFecBajaEmplea.getDate().getTime());
            ps.setDate(16, fechaBaja);

            ps.execute();

            ps.close();
            conexion.close();
            actualizarTabla();
            limpiar();
            Desactivar();
            JOptionPane.showMessageDialog(null, "Cargado con exito");
        } catch (SQLException ex) {
            System.out.println("Error metodo AGREGAR EMPLEADO " + ex);
        }
    }//GEN-LAST:event_btnInsertEmpleaActionPerformed

    private void tblRegEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegEmpleadoMouseClicked
        btnUpdateEmplea.setEnabled(true);
        btnInsertEmplea.setEnabled(false);
        btnDeleteEmplea.setEnabled(true);
        btnNuevoEmplea.setEnabled(false);
        btnGuardarModEmplea.setEnabled(false);
    }//GEN-LAST:event_tblRegEmpleadoMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la ventana?", "Selecione un Opción", YES_NO_OPTION, QUESTION_MESSAGE);
        if (respuesta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void jdpFecNacEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdpFecNacEmpleaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdpFecNacEmpleaActionPerformed

    private void cboLocalidadesEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalidadesEmpleaActionPerformed
        int idLocalidad = 0;
        cboBarrioEmplea.removeAllItems();
        for (Localidades localidades : listLoc) {
            if (localidades.getDescripcion() == cboLocalidadesEmplea.getSelectedItem()) {
                idLocalidad = localidades.getIdLocalidad();
            }
        }
        for (Barrios barrios : listBar) {
            if (barrios.getIdLocalidad() == idLocalidad) {
                cboBarrioEmplea.addItem(barrios.getDescripcion());
            }
        }
    }//GEN-LAST:event_cboLocalidadesEmpleaActionPerformed

    int xx, xy;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jdpFecBajaEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdpFecBajaEmpleaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdpFecBajaEmpleaActionPerformed

    private void jdpFecAltaEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdpFecAltaEmpleaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdpFecAltaEmpleaActionPerformed

    private void cboTiposEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTiposEmpleaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTiposEmpleaActionPerformed

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
            java.util.logging.Logger.getLogger(abmEmpleado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abmEmpleado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abmEmpleado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abmEmpleado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private org.edisoncor.gui.button.ButtonColoredAction btnDeleteEmplea;
    private org.edisoncor.gui.button.ButtonColoredAction btnGuardarModEmplea;
    private org.edisoncor.gui.button.ButtonColoredAction btnInsertEmplea;
    private javax.swing.JButton btnMinimizar;
    private org.edisoncor.gui.button.ButtonColoredAction btnNuevoEmplea;
    private org.edisoncor.gui.button.ButtonColoredAction btnUpdateEmplea;
    private javax.swing.JComboBox<String> cboBarrioEmplea;
    private javax.swing.JComboBox<String> cboEstadoCivilEmplea;
    private javax.swing.JComboBox<String> cboLocalidadesEmplea;
    private javax.swing.JComboBox<String> cboNacionEmplea;
    private javax.swing.JComboBox<String> cboTiposDocumentosEmplea;
    private javax.swing.JComboBox<String> cboTiposEmplea;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXDatePicker jdpFecAltaEmplea;
    private org.jdesktop.swingx.JXDatePicker jdpFecBajaEmplea;
    private org.jdesktop.swingx.JXDatePicker jdpFecNacEmplea;
    private javax.swing.JLabel lblApellidoEmplea;
    private javax.swing.JLabel lblBarrioEmplea;
    private javax.swing.JLabel lblCargoEmplea;
    private javax.swing.JLabel lblCeluEmplea;
    private javax.swing.JLabel lblCivliEmplea;
    private javax.swing.JLabel lblDomicilioEmplea;
    private javax.swing.JLabel lblEmailEmplea;
    private javax.swing.JLabel lblFecAltaEmplea;
    private javax.swing.JLabel lblFecBajaEmplea;
    private javax.swing.JLabel lblFecNacEmplea;
    private javax.swing.JLabel lblGeneroEmplea;
    private javax.swing.JLabel lblLocalEmplea;
    private javax.swing.JLabel lblNacionEmplea;
    private javax.swing.JLabel lblNombreEmplea;
    private javax.swing.JLabel lblNroDocEmplea;
    private javax.swing.JLabel lblRegDocente;
    private javax.swing.JLabel lblTelEmplea;
    private javax.swing.JLabel lblTipoDocEmplea;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel pnl2Estudiante;
    private javax.swing.JTable tblRegEmpleado;
    private org.edisoncor.gui.textField.TextField txtApellidoEmplea;
    private org.edisoncor.gui.textField.TextField txtCelularEmplea;
    private org.edisoncor.gui.textField.TextField txtDomicilioEmplea;
    private org.edisoncor.gui.textField.TextField txtEmailEmplea;
    private org.edisoncor.gui.textField.TextField txtGeneroEmplea;
    private org.edisoncor.gui.textField.TextField txtNombreEmplea;
    private org.edisoncor.gui.textField.TextField txtNroDocEmplea;
    private org.edisoncor.gui.textField.TextField txtTelEmplea;
    // End of variables declaration//GEN-END:variables
    private void activarNuevo() {
        cboTiposEmplea.setEnabled(true);
        txtNombreEmplea.setEnabled(true);
        txtApellidoEmplea.setEnabled(true);
        cboTiposDocumentosEmplea.setSelectedIndex(0);
        cboTiposDocumentosEmplea.setEnabled(true);
        txtNroDocEmplea.setEnabled(true);
        jdpFecNacEmplea.setEnabled(true);
        txtGeneroEmplea.setEnabled(true);
        cboBarrioEmplea.setSelectedIndex(0);
        cboBarrioEmplea.setEnabled(true);
        cboLocalidadesEmplea.setSelectedIndex(0);
        cboLocalidadesEmplea.setEnabled(true);
        cboNacionEmplea.setSelectedIndex(0);
        cboNacionEmplea.setEnabled(true);
        txtDomicilioEmplea.setEnabled(true);
        cboEstadoCivilEmplea.setEnabled(true);
        txtEmailEmplea.setEnabled(true);
        txtCelularEmplea.setEnabled(true);
        txtTelEmplea.setEnabled(true);
        jdpFecAltaEmplea.setEnabled(true);
        jdpFecBajaEmplea.setEnabled(true);
        btnInsertEmplea.setEnabled(true);
        btnDeleteEmplea.setEnabled(false);
        btnUpdateEmplea.setEnabled(false);
        btnNuevoEmplea.setEnabled(false);
        btnGuardarModEmplea.setEnabled(false);
    }

    private void limpiar() {
        cboTiposEmplea.setSelectedIndex(-1);
        txtNombreEmplea.setText("");
        txtApellidoEmplea.setText("");
        txtDomicilioEmplea.setText("");
        txtGeneroEmplea.setText("");
        txtNroDocEmplea.setText("");
        jdpFecNacEmplea.setEnabled(false);
        cboBarrioEmplea.setSelectedIndex(-1);
        cboLocalidadesEmplea.setSelectedIndex(-1);
        cboNacionEmplea.setSelectedIndex(-1);
        cboTiposDocumentosEmplea.setSelectedIndex(-1);
        cboEstadoCivilEmplea.setSelectedIndex(-1);
        txtEmailEmplea.setText("");
        txtCelularEmplea.setText("");
        txtTelEmplea.setText("");
        jdpFecAltaEmplea.setEnabled(false);
        jdpFecBajaEmplea.setEnabled(false);
    }

    private void Desactivar() {
        cboTiposEmplea.setEnabled(false);
        txtNombreEmplea.setEnabled(false);
        txtApellidoEmplea.setEnabled(false);
        txtDomicilioEmplea.setEnabled(false);
        txtGeneroEmplea.setEnabled(false);
        txtNroDocEmplea.setEnabled(false);
        jdpFecNacEmplea.setEnabled(false);
        cboBarrioEmplea.setSelectedIndex(-1);
        cboBarrioEmplea.setEnabled(false);
        cboLocalidadesEmplea.setSelectedIndex(-1);
        cboLocalidadesEmplea.setEnabled(false);
        cboNacionEmplea.setSelectedIndex(-1);
        cboNacionEmplea.setEnabled(false);
        cboTiposDocumentosEmplea.setSelectedIndex(-1);
        cboTiposDocumentosEmplea.setEnabled(false);
        cboEstadoCivilEmplea.setEnabled(false);
        txtEmailEmplea.setEnabled(false);
        txtCelularEmplea.setEnabled(false);
        txtTelEmplea.setEnabled(false);
        jdpFecAltaEmplea.setEnabled(false);
        jdpFecBajaEmplea.setEnabled(false);
        btnInsertEmplea.setEnabled(false);
        btnGuardarModEmplea.setEnabled(false);
        btnUpdateEmplea.setEnabled(false);
        btnDeleteEmplea.setEnabled(true);
        btnNuevoEmplea.setEnabled(true);
    }

}

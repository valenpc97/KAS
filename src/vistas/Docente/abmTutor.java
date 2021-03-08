package vistas.Docente;

import Controlador.GestorBD;
import Model.Barrios;
import Model.EstadosCiviles;
import Model.Localidades;
import Model.Nacionalidades;
import Model.TiposDocumentos;
import Model.Tutores;
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
import vistas.Directivo.principalDirectivo;

public class abmTutor extends javax.swing.JFrame {

    GestorBD g = new GestorBD();
    private static final String PASS = "123";
    private static final String USER = "sa";
    private static final String CADENA = "jdbc:sqlserver://DESKTOP-ANUONV0:1433;databaseName=KASprueba";
    String ventana = "";

    DefaultComboBoxModel cboModelDoc = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelNac = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelLoc = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelBar = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelCivil = new DefaultComboBoxModel();
    ArrayList<TiposDocumentos> listDoc = g.getDocumentos();
    ArrayList<Nacionalidades> listNac = g.getNacionalidades();
    ArrayList<Localidades> listLoc = g.getLocalidades();
    ArrayList<Barrios> listBar = g.getBarrios();
    ArrayList<EstadosCiviles> listCivil = g.getEstadosCiviles();
    int idTutorModificar = 0;
    int idFamilia = 0;

    public abmTutor() {
        initComponents();
        actualizarTabla(idFamilia);
        Desactivar();
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
        cboTiposDocumentosTutor.setModel(cboModelDoc);
        cboNacionTutor.setModel(cboModelNac);
        cboLocalidadesTutor.setModel(cboModelLoc);
        cboBarrioTutor.setModel(cboModelBar);
        cboEstadoCivilTutor.setModel(cboModelCivil);
    }

    public void familia(int idFamilia) {
        this.idFamilia = idFamilia;
        actualizarTabla(idFamilia);
    }

    public Image getIconImage() {
        Image logo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/DIAPOSITIVA1.jpg"));

        return logo;
    }

    public void actualizarTabla(int idFlia) {
        DefaultTableModel tmodel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ArrayList<Tutores> list = g.getTutores();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tmodel.setColumnIdentifiers(new Object[]{"idTutor", "Parentesco", "Nombre", "Apellido", "Domicilio", "Celular"});
        for (Tutores tutores : list) {
            if (tutores.getIdFamilia() == idFlia) {
                tmodel.addRow(new Object[]{tutores.getIdTutor(), tutores.getParentesco(), tutores.getNombre(), tutores.getApellido(), tutores.getDomicilio(), tutores.getCelular()});

            }
        }
        tblRegTutor.setModel(tmodel);
        if (tblRegTutor.getRowCount() == 1 || tblRegTutor.getRowCount() == 0) {
            btnDeleteTutor.setEnabled(false);
        } else {
            btnDeleteTutor.setEnabled(true);
        }
        tblRegTutor.getTableHeader().setBackground(new Color(153, 255, 153));
        tblRegTutor.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
        tblRegTutor.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblRegTutor.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegTutor.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegTutor.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblRegTutor.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblRegTutor.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblRegTutor.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tblRegTutor.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tblRegTutor.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEstudiante = new org.edisoncor.gui.panel.Panel();
        lblNombreTutor = new javax.swing.JLabel();
        lblApelliTutor = new javax.swing.JLabel();
        lblTiposDocTutor = new javax.swing.JLabel();
        lblNroDocTutor = new javax.swing.JLabel();
        lblNacionTutor = new javax.swing.JLabel();
        lblGeneroTutor = new javax.swing.JLabel();
        lblBarrioTutor = new javax.swing.JLabel();
        lblDomicilioTutor = new javax.swing.JLabel();
        txtNombreTutor = new org.edisoncor.gui.textField.TextField();
        txtApellidoTutor = new org.edisoncor.gui.textField.TextField();
        cboTiposDocumentosTutor = new javax.swing.JComboBox<>();
        txtNroDocTutor = new org.edisoncor.gui.textField.TextField();
        cboNacionTutor = new javax.swing.JComboBox<>();
        txtGeneroTutor = new org.edisoncor.gui.textField.TextField();
        cboBarrioTutor = new javax.swing.JComboBox<>();
        txtDomicilioTutor = new org.edisoncor.gui.textField.TextField();
        lblParentesco = new javax.swing.JLabel();
        lblCivliTutor = new javax.swing.JLabel();
        txtParentesco = new org.edisoncor.gui.textField.TextField();
        lblEmailTutor = new javax.swing.JLabel();
        lblCeluTutor = new javax.swing.JLabel();
        lblTelTutor = new javax.swing.JLabel();
        cboEstadoCivilTutor = new javax.swing.JComboBox<>();
        txtEmailTutor = new org.edisoncor.gui.textField.TextField();
        txtCelularTutor = new org.edisoncor.gui.textField.TextField();
        txtTelTutor = new org.edisoncor.gui.textField.TextField();
        cboLocalidadesTutor = new javax.swing.JComboBox<>();
        lblLocalTutor = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegTutor = new javax.swing.JTable();
        pnl2Estudiante = new org.edisoncor.gui.panel.Panel();
        lblRegDocente = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnNuevoTutor = new org.edisoncor.gui.button.ButtonColoredAction();
        btnUpdateTutor = new org.edisoncor.gui.button.ButtonColoredAction();
        btnDeleteTutor = new org.edisoncor.gui.button.ButtonColoredAction();
        btnGuardarModTutor = new org.edisoncor.gui.button.ButtonColoredAction();
        btnInsertTutor = new org.edisoncor.gui.button.ButtonColoredAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAS - REGISTRO DE TUTORES");
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

        pnlEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        pnlEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otroFondo2.jpg"))); // NOI18N

        lblNombreTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblNombreTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNombreTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblNombreTutor.setText("Nombres: ");
        lblNombreTutor.setOpaque(true);

        lblApelliTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblApelliTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblApelliTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblApelliTutor.setText("Apellidos: ");
        lblApelliTutor.setOpaque(true);

        lblTiposDocTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblTiposDocTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTiposDocTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblTiposDocTutor.setText("Tipo de Documento: ");
        lblTiposDocTutor.setOpaque(true);

        lblNroDocTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblNroDocTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNroDocTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblNroDocTutor.setText("Nro de Documento: ");
        lblNroDocTutor.setOpaque(true);

        lblNacionTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblNacionTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNacionTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblNacionTutor.setText("Nacionalidad: ");
        lblNacionTutor.setOpaque(true);

        lblGeneroTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblGeneroTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblGeneroTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblGeneroTutor.setText("Genero: ");
        lblGeneroTutor.setOpaque(true);

        lblBarrioTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblBarrioTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblBarrioTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblBarrioTutor.setText("Barrio: ");
        lblBarrioTutor.setOpaque(true);

        lblDomicilioTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblDomicilioTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDomicilioTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblDomicilioTutor.setText("Domicilio: ");
        lblDomicilioTutor.setOpaque(true);

        txtNombreTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtApellidoTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboTiposDocumentosTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboTiposDocumentosTutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNroDocTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboNacionTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboNacionTutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtGeneroTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboBarrioTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboBarrioTutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDomicilioTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        lblParentesco.setBackground(new java.awt.Color(0, 102, 0));
        lblParentesco.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblParentesco.setForeground(new java.awt.Color(153, 255, 153));
        lblParentesco.setText("Parentesco: ");
        lblParentesco.setOpaque(true);

        lblCivliTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblCivliTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCivliTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblCivliTutor.setText("Estado Civil: ");
        lblCivliTutor.setOpaque(true);

        txtParentesco.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        lblEmailTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblEmailTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblEmailTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblEmailTutor.setText("E-mail: ");
        lblEmailTutor.setOpaque(true);

        lblCeluTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblCeluTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCeluTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblCeluTutor.setText("Celular: ");
        lblCeluTutor.setOpaque(true);

        lblTelTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblTelTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTelTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblTelTutor.setText("Telefono: ");
        lblTelTutor.setOpaque(true);

        cboEstadoCivilTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboEstadoCivilTutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtEmailTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtCelularTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        txtTelTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        cboLocalidadesTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboLocalidadesTutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboLocalidadesTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalidadesTutorActionPerformed(evt);
            }
        });

        lblLocalTutor.setBackground(new java.awt.Color(0, 102, 0));
        lblLocalTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblLocalTutor.setForeground(new java.awt.Color(153, 255, 153));
        lblLocalTutor.setText("Localidad:");
        lblLocalTutor.setOpaque(true);

        tblRegTutor.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tblRegTutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegTutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegTutorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegTutor);

        pnl2Estudiante.setBackground(new java.awt.Color(0, 0, 0));
        pnl2Estudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl2Estudiante.setColorPrimario(new java.awt.Color(0, 0, 0));
        pnl2Estudiante.setName(""); // NOI18N

        lblRegDocente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblRegDocente.setForeground(new java.awt.Color(255, 255, 255));
        lblRegDocente.setText(" REGISTRO DE TUTORES");

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
            .addGroup(pnl2EstudianteLayout.createSequentialGroup()
                .addGroup(pnl2EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRegDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnMinimizar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnNuevoTutor.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevoTutor.setBorder(null);
        btnNuevoTutor.setText("NUEVO");
        btnNuevoTutor.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnNuevoTutor.setDireccionDeSombra(0);
        btnNuevoTutor.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnNuevoTutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoTutor.setProfundidad(new java.lang.Float(0.0F));
        btnNuevoTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTutorActionPerformed(evt);
            }
        });

        btnUpdateTutor.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdateTutor.setBorder(null);
        btnUpdateTutor.setText("MODIFICAR");
        btnUpdateTutor.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnUpdateTutor.setDireccionDeSombra(0);
        btnUpdateTutor.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnUpdateTutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateTutor.setProfundidad(new java.lang.Float(0.0F));
        btnUpdateTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTutorActionPerformed(evt);
            }
        });

        btnDeleteTutor.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteTutor.setBorder(null);
        btnDeleteTutor.setText("ELIMINAR");
        btnDeleteTutor.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnDeleteTutor.setDireccionDeSombra(0);
        btnDeleteTutor.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnDeleteTutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteTutor.setProfundidad(new java.lang.Float(0.0F));
        btnDeleteTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTutorActionPerformed(evt);
            }
        });

        btnGuardarModTutor.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarModTutor.setBorder(null);
        btnGuardarModTutor.setText("GUARDAR");
        btnGuardarModTutor.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnGuardarModTutor.setDireccionDeSombra(0);
        btnGuardarModTutor.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnGuardarModTutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarModTutor.setProfundidad(new java.lang.Float(0.0F));
        btnGuardarModTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModTutorActionPerformed(evt);
            }
        });

        btnInsertTutor.setBackground(new java.awt.Color(51, 51, 51));
        btnInsertTutor.setBorder(null);
        btnInsertTutor.setText("AGREGAR");
        btnInsertTutor.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnInsertTutor.setDireccionDeSombra(0);
        btnInsertTutor.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnInsertTutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertTutor.setProfundidad(new java.lang.Float(0.0F));
        btnInsertTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEstudianteLayout = new javax.swing.GroupLayout(pnlEstudiante);
        pnlEstudiante.setLayout(pnlEstudianteLayout);
        pnlEstudianteLayout.setHorizontalGroup(
            pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addGap(74, 74, 74)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiposDocTutor)
                    .addComponent(lblApelliTutor)
                    .addComponent(lblNroDocTutor)
                    .addComponent(lblNacionTutor)
                    .addComponent(lblGeneroTutor)
                    .addComponent(lblBarrioTutor)
                    .addComponent(lblDomicilioTutor)
                    .addComponent(lblNombreTutor)
                    .addComponent(lblParentesco)
                    .addComponent(lblCivliTutor)
                    .addComponent(lblEmailTutor)
                    .addComponent(lblTelTutor)
                    .addComponent(lblCeluTutor)
                    .addComponent(lblLocalTutor))
                .addGap(48, 48, 48)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCelularTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidoTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGeneroTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboBarrioTutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNacionTutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNroDocTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTiposDocumentosTutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboEstadoCivilTutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDomicilioTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmailTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLocalidadesTutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addComponent(pnl2Estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnNuevoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(btnGuardarModTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnInsertTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEstudianteLayout.setVerticalGroup(
            pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                .addComponent(pnl2Estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEstudianteLayout.createSequentialGroup()
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblParentesco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreTutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApelliTutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTiposDocumentosTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTiposDocTutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroDocTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNroDocTutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNacionTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacionTutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGeneroTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGeneroTutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLocalTutor)
                            .addComponent(cboLocalidadesTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBarrioTutor)
                            .addComponent(cboBarrioTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDomicilioTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDomicilioTutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCivliTutor)
                            .addComponent(cboEstadoCivilTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailTutor)
                            .addComponent(txtEmailTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCeluTutor)
                            .addComponent(txtCelularTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelTutor)
                            .addComponent(txtTelTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarModTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la ventana?", "Selecione un Opción", YES_NO_OPTION, QUESTION_MESSAGE);
        if (respuesta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

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

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnNuevoTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTutorActionPerformed
        activarNuevo();
        limpiar();
    }//GEN-LAST:event_btnNuevoTutorActionPerformed

    private void btnUpdateTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTutorActionPerformed
        idTutorModificar = (int) tblRegTutor.getValueAt(tblRegTutor.getSelectedRow(), 0);
        ArrayList<Tutores> list = g.getTutores();
        for (Tutores x : list) {
            if (x.getIdTutor() == idTutorModificar) {
                txtParentesco.setText(x.getParentesco());
                txtNombreTutor.setText(x.getNombre());
                txtApellidoTutor.setText(x.getApellido());
                for (TiposDocumentos tiposDocumentos : listDoc) {
                    if (tiposDocumentos.getIdTipoDocumento() == x.getIdTipoDocumento()) {
                        cboTiposDocumentosTutor.setSelectedItem(tiposDocumentos.getDescripcion());
                    }
                }
                txtNroDocTutor.setText(x.getDocumento() + "");
                for (Nacionalidades nacionalidades : listNac) {
                    if (nacionalidades.getIdNacionalidad() == x.getIdNacionalidad()) {
                        cboNacionTutor.setSelectedItem(nacionalidades.getDescripcion());
                    }
                }
                txtGeneroTutor.setText(x.getGenero());
                for (Barrios barrios : listBar) {
                    if (barrios.getIdBarrio() == x.getIdBarrio()) {
                        cboBarrioTutor.setSelectedItem(barrios.getDescripcion());
                        for (Localidades localidades : listLoc) {
                            if (localidades.getIdLocalidad() == x.getIdBarrio()) {
                                cboLocalidadesTutor.setSelectedItem(localidades.getDescripcion());
                            }
                        }
                    }
                }
                txtDomicilioTutor.setText(x.getDomicilio());
                for (EstadosCiviles estadosCiviles : listCivil) {
                    if (estadosCiviles.getIdEstadoCivil() == x.getIdEstadoCivil()) {
                        cboEstadoCivilTutor.setSelectedItem(estadosCiviles.getDescripcion());
                    }
                }
                txtEmailTutor.setText(x.getEmail());
                txtCelularTutor.setText(x.getCelular());
                txtTelTutor.setText(x.getTelefono());
            }
        }
        txtParentesco.setEnabled(true);
        txtNombreTutor.setEnabled(true);
        txtApellidoTutor.setEnabled(true);
        cboTiposDocumentosTutor.setEnabled(true);
        txtNroDocTutor.setEnabled(true);
        cboNacionTutor.setEnabled(true);
        txtGeneroTutor.setEnabled(true);
        cboLocalidadesTutor.setEnabled(true);
        cboBarrioTutor.setEnabled(true);
        txtDomicilioTutor.setEnabled(true);
        cboEstadoCivilTutor.setEnabled(true);
        txtEmailTutor.setEnabled(true);
        txtCelularTutor.setEnabled(true);
        txtTelTutor.setEnabled(true);
        btnGuardarModTutor.setEnabled(true);
    }//GEN-LAST:event_btnUpdateTutorActionPerformed

    private void btnDeleteTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTutorActionPerformed
        try {
            int idTutorDelete = (int) tblRegTutor.getValueAt(tblRegTutor.getSelectedRow(), 0);
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el resgistro?", "Selecione una Opción", YES_NO_OPTION, QUESTION_MESSAGE);
            if (respuesta == 0) {
                g.EliminarTutor(idTutorDelete);
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            }
            actualizarTabla(idFamilia);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe selecionar un Tutor");
            System.out.println("Error metodo eliminar Tutor ");
        }
    }//GEN-LAST:event_btnDeleteTutorActionPerformed

    private void btnGuardarModTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModTutorActionPerformed
        String parentesco = txtParentesco.getText();
        String nombre = txtNombreTutor.getText();
        String apellido = txtApellidoTutor.getText();
        int idTipoDocumento = 0;
        for (TiposDocumentos tiposDocumentos : listDoc) {
            if (tiposDocumentos.getDescripcion().equals(cboTiposDocumentosTutor.getSelectedItem())) {
                idTipoDocumento = (tiposDocumentos.getIdTipoDocumento());
            }
        }
        int documento = Integer.parseInt(txtNroDocTutor.getText());
        int idNacionalidad = 0;
        for (Nacionalidades nacionalidades : listNac) {
            if (nacionalidades.getDescripcion().equals(cboNacionTutor.getSelectedItem())) {
                idNacionalidad = (nacionalidades.getIdNacionalidad());
            }
        }
        String genero = txtGeneroTutor.getText();
        int idBarrio = 0;
        for (Barrios barrios : listBar) {
            if (barrios.getDescripcion().equals(cboBarrioTutor.getSelectedItem())) {
                idBarrio = barrios.getIdBarrio();
            }
        }
        String domicilio = txtDomicilioTutor.getText();
        int idEstadoCivil = 0;
        for (EstadosCiviles estadosCiviles : listCivil) {
            if (estadosCiviles.getDescripcion().equals(cboEstadoCivilTutor.getSelectedItem())) {
                idEstadoCivil = (estadosCiviles.getIdEstadoCivil());
            }
        }
        String email = txtEmailTutor.getText();
        String celular = txtCelularTutor.getText();
        String telefono = txtTelTutor.getText();

        Tutores t = new Tutores(parentesco, idEstadoCivil, celular, telefono, email, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio, idTutorModificar);

        g.ModificarTutores(t);
        limpiar();
        Desactivar();
        btnUpdateTutor.setEnabled(false);
        btnInsertTutor.setEnabled(false);
        btnNuevoTutor.setEnabled(true);
        btnGuardarModTutor.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Guardado con exito");
    }//GEN-LAST:event_btnGuardarModTutorActionPerformed

    private void btnInsertTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertTutorActionPerformed
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("exec procInsertTutores ?,?,?,?,?,?,?,?,?,?,?,?,?,?");

            ps.setString(1, txtParentesco.getText());
            ps.setString(2, txtNombreTutor.getText());
            ps.setString(3, txtApellidoTutor.getText());
            for (TiposDocumentos tiposDocumentos : listDoc) {
                if (tiposDocumentos.getDescripcion().equals(cboTiposDocumentosTutor.getSelectedItem())) {
                    ps.setInt(4, tiposDocumentos.getIdTipoDocumento());
                }
            }
            ps.setInt(5, Integer.parseInt(txtNroDocTutor.getText()));
            for (Nacionalidades nacionalidades : listNac) {
                if (nacionalidades.getDescripcion().equals(cboNacionTutor.getSelectedItem())) {
                    ps.setInt(6, nacionalidades.getIdNacionalidad());
                }
            }
            ps.setString(7, txtGeneroTutor.getText());
            for (Barrios barrios : listBar) {
                if (barrios.getDescripcion().equals(cboBarrioTutor.getSelectedItem())) {
                    ps.setInt(8, barrios.getIdBarrio());
                }
            }
            ps.setString(9, txtDomicilioTutor.getText());
            for (EstadosCiviles estadosCiviles : listCivil) {
                if (estadosCiviles.getDescripcion().equals(cboEstadoCivilTutor.getSelectedItem())) {
                    ps.setInt(10, estadosCiviles.getIdEstadoCivil());
                }
            }
            ps.setString(11, txtEmailTutor.getText());
            ps.setString(12, txtCelularTutor.getText());
            ps.setString(13, txtTelTutor.getText());
            ps.setInt(14, idFamilia);

            ps.execute();

            ps.close();
            conexion.close();
            actualizarTabla(idFamilia);
            limpiar();
            Desactivar();
            JOptionPane.showMessageDialog(null, "Cargado con exito");
        } catch (SQLException ex) {
            System.out.println("Error metodo AGREGAR TUTOR " + ex);
        }
    }//GEN-LAST:event_btnInsertTutorActionPerformed

    private void cboLocalidadesTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalidadesTutorActionPerformed
        int idLocalidad = 0;
        cboBarrioTutor.removeAllItems();
        for (Localidades localidades : listLoc) {
            if (localidades.getDescripcion() == cboLocalidadesTutor.getSelectedItem()) {
                idLocalidad = localidades.getIdLocalidad();
            }
        }
        for (Barrios barrios : listBar) {
            if (barrios.getIdLocalidad() == idLocalidad) {
                cboBarrioTutor.addItem(barrios.getDescripcion());
            }
        }
    }//GEN-LAST:event_cboLocalidadesTutorActionPerformed

    private void tblRegTutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegTutorMouseClicked
        btnUpdateTutor.setEnabled(true);
        btnInsertTutor.setEnabled(false);
        btnNuevoTutor.setEnabled(false);
        btnGuardarModTutor.setEnabled(false);
    }//GEN-LAST:event_tblRegTutorMouseClicked

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
            java.util.logging.Logger.getLogger(abmTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abmTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abmTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abmTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abmTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private org.edisoncor.gui.button.ButtonColoredAction btnDeleteTutor;
    private org.edisoncor.gui.button.ButtonColoredAction btnGuardarModTutor;
    private org.edisoncor.gui.button.ButtonColoredAction btnInsertTutor;
    private javax.swing.JButton btnMinimizar;
    private org.edisoncor.gui.button.ButtonColoredAction btnNuevoTutor;
    private org.edisoncor.gui.button.ButtonColoredAction btnUpdateTutor;
    private javax.swing.JComboBox<String> cboBarrioTutor;
    private javax.swing.JComboBox<String> cboEstadoCivilTutor;
    private javax.swing.JComboBox<String> cboLocalidadesTutor;
    private javax.swing.JComboBox<String> cboNacionTutor;
    private javax.swing.JComboBox<String> cboTiposDocumentosTutor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApelliTutor;
    private javax.swing.JLabel lblBarrioTutor;
    private javax.swing.JLabel lblCeluTutor;
    private javax.swing.JLabel lblCivliTutor;
    private javax.swing.JLabel lblDomicilioTutor;
    private javax.swing.JLabel lblEmailTutor;
    private javax.swing.JLabel lblGeneroTutor;
    private javax.swing.JLabel lblLocalTutor;
    private javax.swing.JLabel lblNacionTutor;
    private javax.swing.JLabel lblNombreTutor;
    private javax.swing.JLabel lblNroDocTutor;
    private javax.swing.JLabel lblParentesco;
    private javax.swing.JLabel lblRegDocente;
    private javax.swing.JLabel lblTelTutor;
    private javax.swing.JLabel lblTiposDocTutor;
    private org.edisoncor.gui.panel.Panel pnl2Estudiante;
    private org.edisoncor.gui.panel.Panel pnlEstudiante;
    private javax.swing.JTable tblRegTutor;
    private org.edisoncor.gui.textField.TextField txtApellidoTutor;
    private org.edisoncor.gui.textField.TextField txtCelularTutor;
    private org.edisoncor.gui.textField.TextField txtDomicilioTutor;
    private org.edisoncor.gui.textField.TextField txtEmailTutor;
    private org.edisoncor.gui.textField.TextField txtGeneroTutor;
    private org.edisoncor.gui.textField.TextField txtNombreTutor;
    private org.edisoncor.gui.textField.TextField txtNroDocTutor;
    private org.edisoncor.gui.textField.TextField txtParentesco;
    private org.edisoncor.gui.textField.TextField txtTelTutor;
    // End of variables declaration//GEN-END:variables
    private void activarNuevo() {
        txtParentesco.setEnabled(true);
        txtNombreTutor.setEnabled(true);
        txtApellidoTutor.setEnabled(true);
        txtDomicilioTutor.setEnabled(true);
        txtGeneroTutor.setEnabled(true);
        txtNroDocTutor.setEnabled(true);
        cboEstadoCivilTutor.setSelectedIndex(0);
        cboEstadoCivilTutor.setEnabled(true);
        cboBarrioTutor.setSelectedIndex(0);
        cboBarrioTutor.setEnabled(true);
        cboLocalidadesTutor.setSelectedIndex(0);
        cboLocalidadesTutor.setEnabled(true);
        cboNacionTutor.setSelectedIndex(0);
        cboNacionTutor.setEnabled(true);
        cboTiposDocumentosTutor.setSelectedIndex(0);
        cboTiposDocumentosTutor.setEnabled(true);
        txtEmailTutor.setEnabled(true);
        txtCelularTutor.setEnabled(true);
        txtTelTutor.setEnabled(true);
        btnInsertTutor.setEnabled(true);
        btnUpdateTutor.setEnabled(false);
        btnNuevoTutor.setEnabled(false);
        btnGuardarModTutor.setEnabled(false);
    }

    private void limpiar() {
        txtParentesco.setText("");
        txtNombreTutor.setText("");
        txtApellidoTutor.setText("");
        txtDomicilioTutor.setText("");
        txtGeneroTutor.setText("");
        txtNroDocTutor.setText("");
        cboEstadoCivilTutor.setSelectedIndex(-1);
        cboBarrioTutor.setSelectedIndex(-1);
        cboLocalidadesTutor.setSelectedIndex(-1);
        cboNacionTutor.setSelectedIndex(-1);
        cboTiposDocumentosTutor.setSelectedIndex(-1);
        txtEmailTutor.setText("");
        txtCelularTutor.setText("");
        txtTelTutor.setText("");

    }

    private void Desactivar() {
        txtParentesco.setEnabled(false);
        txtNombreTutor.setEnabled(false);
        txtApellidoTutor.setEnabled(false);
        txtDomicilioTutor.setEnabled(false);
        txtGeneroTutor.setEnabled(false);
        txtNroDocTutor.setEnabled(false);
        cboEstadoCivilTutor.setSelectedIndex(-1);
        cboEstadoCivilTutor.setEnabled(false);
        cboBarrioTutor.setSelectedIndex(-1);
        cboBarrioTutor.setEnabled(false);
        cboLocalidadesTutor.setSelectedIndex(-1);
        cboLocalidadesTutor.setEnabled(false);
        cboNacionTutor.setSelectedIndex(-1);
        cboNacionTutor.setEnabled(false);
        cboTiposDocumentosTutor.setSelectedIndex(-1);
        cboTiposDocumentosTutor.setEnabled(false);
        txtEmailTutor.setEnabled(false);
        txtCelularTutor.setEnabled(false);
        txtTelTutor.setEnabled(false);
        btnInsertTutor.setEnabled(false);
        btnGuardarModTutor.setEnabled(false);
        btnUpdateTutor.setEnabled(false);
        btnNuevoTutor.setEnabled(true);
    }

}

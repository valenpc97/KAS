package vistas.Docente;

import Controlador.GestorBD;
import Model.Familias;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import vistas.Directivo.principalDirectivo;

public class abmFamilia extends javax.swing.JFrame {

    GestorBD g = new GestorBD();
    private static final String PASS = "123";
    private static final String USER = "sa";
    private static final String CADENA = "jdbc:sqlserver://DESKTOP-ANUONV0:1433;databaseName=KASprueba";
    principalDocente pd;
    principalDirectivo pdi;
    String ventana = "";
    int idLlamarFamilia = 0;
    int idFliaModificar = 0;
    

    public abmFamilia() {
        initComponents();
        actualizarTabla();
        jplApellidos.setEnabled(false);
        btnGuardarFlia.setEnabled(false);
        btnInsertFlia.setEnabled(false);
        btnDeleteFlia.setEnabled(false);
        btnUpdateFlia.setEnabled(false);
        txtPrimerApe.setEnabled(false);
        txtSegundoApe.setEnabled(false);
        lblPresioneOpcion.setVisible(false);
        btnFamiliaEstu.setVisible(false);
        btnFamiliaTutor.setVisible(false);
    }

    public void interfazDocente(principalDocente pdc) {
        pd = pdc;
        ventana = "docente";
    }

    public void interfazDirectivo(principalDirectivo pdir) {
        pdi = pdir;
        ventana = "directivo";
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

        ArrayList<Familias> list = g.getFamilias();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tmodel.setColumnIdentifiers(new Object[]{"idFamilia", "Primer Apellido", "Segundo Apellido"});
        for (Familias flia : list) {
            tmodel.addRow(new Object[]{flia.getIdFamilia(), flia.getApellidoFamilia(), flia.getApellidoFamiliaDos()});
        }
        tblRegFamilia.setModel(tmodel);
        tblRegFamilia.getTableHeader().setReorderingAllowed(false);
        tblRegFamilia.getTableHeader().setBackground(new Color(153, 255, 153));
        tblRegFamilia.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
        tblRegFamilia.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblRegFamilia.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegFamilia.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegFamilia.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblRegFamilia.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblRegFamilia.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

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
        pnl2Docente = new org.edisoncor.gui.panel.Panel();
        lblRegDocente = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegFamilia = new javax.swing.JTable();
        btnFamiliaEstu = new javax.swing.JButton();
        btnFamiliaTutor = new javax.swing.JButton();
        btnNuevaFlia = new org.edisoncor.gui.button.ButtonColoredAction();
        lblPresioneOpcion = new javax.swing.JLabel();
        jplApellidos = new javax.swing.JPanel();
        txtSegundoApe = new org.edisoncor.gui.textField.TextField();
        lblSegundoApe = new javax.swing.JLabel();
        lblPrimerApe = new javax.swing.JLabel();
        txtPrimerApe = new org.edisoncor.gui.textField.TextField();
        btnGuardarFlia = new org.edisoncor.gui.button.ButtonColoredAction();
        btnInsertFlia = new org.edisoncor.gui.button.ButtonColoredAction();
        btnUpdateFlia = new org.edisoncor.gui.button.ButtonColoredAction();
        btnDeleteFlia = new org.edisoncor.gui.button.ButtonColoredAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAS -  FAMILIA");
        setIconImage(getIconImage());
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otroFondo2.jpg"))); // NOI18N

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
        lblRegDocente.setText(" REGISTRO DE FAMILIA");

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

        tblRegFamilia.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRegFamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegFamiliaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegFamilia);

        btnFamiliaEstu.setBackground(new java.awt.Color(245, 245, 220));
        btnFamiliaEstu.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnFamiliaEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen5.png"))); // NOI18N
        btnFamiliaEstu.setText("Ni??as/os");
        btnFamiliaEstu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFamiliaEstu.setContentAreaFilled(false);
        btnFamiliaEstu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFamiliaEstu.setIconTextGap(22);
        btnFamiliaEstu.setMaximumSize(new java.awt.Dimension(135, 153));
        btnFamiliaEstu.setMinimumSize(new java.awt.Dimension(135, 153));
        btnFamiliaEstu.setOpaque(true);
        btnFamiliaEstu.setPreferredSize(new java.awt.Dimension(135, 153));
        btnFamiliaEstu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFamiliaEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamiliaEstuActionPerformed(evt);
            }
        });

        btnFamiliaTutor.setBackground(new java.awt.Color(245, 245, 220));
        btnFamiliaTutor.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnFamiliaTutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tutores.jpg"))); // NOI18N
        btnFamiliaTutor.setText("Tutores");
        btnFamiliaTutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFamiliaTutor.setContentAreaFilled(false);
        btnFamiliaTutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFamiliaTutor.setIconTextGap(0);
        btnFamiliaTutor.setOpaque(true);
        btnFamiliaTutor.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnFamiliaTutor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFamiliaTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamiliaTutorActionPerformed(evt);
            }
        });

        btnNuevaFlia.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevaFlia.setBorder(null);
        btnNuevaFlia.setText("NUEVO");
        btnNuevaFlia.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnNuevaFlia.setDireccionDeSombra(0);
        btnNuevaFlia.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnNuevaFlia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaFlia.setProfundidad(new java.lang.Float(0.0F));
        btnNuevaFlia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaFliaActionPerformed(evt);
            }
        });

        lblPresioneOpcion.setBackground(new java.awt.Color(204, 204, 204));
        lblPresioneOpcion.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblPresioneOpcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPresioneOpcion.setText("PRESIONE UNA OPCI??N: ");
        lblPresioneOpcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        lblPresioneOpcion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPresioneOpcion.setOpaque(true);

        jplApellidos.setOpaque(false);

        txtSegundoApe.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        lblSegundoApe.setBackground(new java.awt.Color(0, 102, 0));
        lblSegundoApe.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblSegundoApe.setForeground(new java.awt.Color(153, 255, 153));
        lblSegundoApe.setText("Ingresar Segundo Apellido: ");
        lblSegundoApe.setOpaque(true);

        lblPrimerApe.setBackground(new java.awt.Color(0, 102, 0));
        lblPrimerApe.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPrimerApe.setForeground(new java.awt.Color(153, 255, 153));
        lblPrimerApe.setText("Ingresar Primer Apellido: ");
        lblPrimerApe.setOpaque(true);

        txtPrimerApe.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        javax.swing.GroupLayout jplApellidosLayout = new javax.swing.GroupLayout(jplApellidos);
        jplApellidos.setLayout(jplApellidosLayout);
        jplApellidosLayout.setHorizontalGroup(
            jplApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplApellidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrimerApe)
                    .addComponent(lblSegundoApe))
                .addGap(31, 31, 31)
                .addGroup(jplApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSegundoApe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrimerApe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jplApellidosLayout.setVerticalGroup(
            jplApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplApellidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerApe)
                    .addComponent(txtPrimerApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSegundoApe)
                    .addComponent(txtSegundoApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardarFlia.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarFlia.setBorder(null);
        btnGuardarFlia.setText("GUARDAR");
        btnGuardarFlia.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnGuardarFlia.setDireccionDeSombra(0);
        btnGuardarFlia.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnGuardarFlia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarFlia.setProfundidad(new java.lang.Float(0.0F));
        btnGuardarFlia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFliaActionPerformed(evt);
            }
        });

        btnInsertFlia.setBackground(new java.awt.Color(51, 51, 51));
        btnInsertFlia.setBorder(null);
        btnInsertFlia.setText("AGREGAR");
        btnInsertFlia.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnInsertFlia.setDireccionDeSombra(0);
        btnInsertFlia.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnInsertFlia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertFlia.setProfundidad(new java.lang.Float(0.0F));
        btnInsertFlia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertFliaActionPerformed(evt);
            }
        });

        btnUpdateFlia.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdateFlia.setBorder(null);
        btnUpdateFlia.setText("MODIFICAR");
        btnUpdateFlia.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnUpdateFlia.setDireccionDeSombra(0);
        btnUpdateFlia.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnUpdateFlia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateFlia.setProfundidad(new java.lang.Float(0.0F));
        btnUpdateFlia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFliaActionPerformed(evt);
            }
        });

        btnDeleteFlia.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteFlia.setBorder(null);
        btnDeleteFlia.setText("ELIMINAR");
        btnDeleteFlia.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnDeleteFlia.setDireccionDeSombra(0);
        btnDeleteFlia.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnDeleteFlia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteFlia.setProfundidad(new java.lang.Float(0.0F));
        btnDeleteFlia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFliaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl2Docente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jplApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnUpdateFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btnFamiliaTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnFamiliaEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(lblPresioneOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnNuevaFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(pnl2Docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevaFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jplApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateFlia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblPresioneOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFamiliaEstu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFamiliaTutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "??Desea cerrar la ventana?", "Selecione un Opci??n", YES_NO_OPTION, QUESTION_MESSAGE);
        if (respuesta == 0) {
            if ("docente".equals(ventana)) {
                pd.setVisible(true);
            } else {
                pdi.setVisible(true);
            }
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

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

    private void btnFamiliaEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamiliaEstuActionPerformed
        idLlamarFamilia = (int) tblRegFamilia.getValueAt(tblRegFamilia.getSelectedRow(), 0);
        if (idLlamarFamilia != 0) {
            abmEstudiante abmE = new abmEstudiante();
            abmE.setVisible(true);
            abmE.familia(idLlamarFamilia);
        }
    }//GEN-LAST:event_btnFamiliaEstuActionPerformed

    private void btnFamiliaTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamiliaTutorActionPerformed
        idLlamarFamilia = (int) tblRegFamilia.getValueAt(tblRegFamilia.getSelectedRow(), 0);
        if (idLlamarFamilia != 0) {
            abmTutor abmT = new abmTutor();
            abmT.setVisible(true);
            abmT.familia(idLlamarFamilia);
        }
    }//GEN-LAST:event_btnFamiliaTutorActionPerformed

    private void btnNuevaFliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaFliaActionPerformed
        jplApellidos.setEnabled(true);
        btnInsertFlia.setEnabled(true);
        txtPrimerApe.setEnabled(true);
        txtSegundoApe.setEnabled(true);
        btnDeleteFlia.setEnabled(false);
        btnUpdateFlia.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_btnNuevaFliaActionPerformed

    private void tblRegFamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegFamiliaMouseClicked
        btnFamiliaEstu.setVisible(true);
        btnFamiliaTutor.setVisible(true);
        lblPresioneOpcion.setVisible(true);
        btnUpdateFlia.setEnabled(true);
        btnDeleteFlia.setEnabled(true);
    }//GEN-LAST:event_tblRegFamiliaMouseClicked

    private void btnGuardarFliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFliaActionPerformed
        String apellidoFamilia = txtPrimerApe.getText();
        String apellidoFamiliaDos = txtSegundoApe.getText();
        int idFamila = 0;

        Familias f = new Familias(idFamila, apellidoFamilia, apellidoFamiliaDos, idFliaModificar);

        g.ModificarFamilia(f);
        actualizarTabla();
        limpiar();
        btnUpdateFlia.setEnabled(false);
        btnInsertFlia.setEnabled(false);
        btnDeleteFlia.setEnabled(false);
        btnNuevaFlia.setEnabled(true);
        btnGuardarFlia.setEnabled(false);
        btnFamiliaEstu.setEnabled(false);
        btnFamiliaTutor.setEnabled(false);
        lblPresioneOpcion.setVisible(false);
        btnFamiliaEstu.setVisible(false);
        btnFamiliaTutor.setVisible(false);
        JOptionPane.showMessageDialog(null, "Guardada con exito");
    }//GEN-LAST:event_btnGuardarFliaActionPerformed

    private void btnInsertFliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertFliaActionPerformed
        try {
            if (!txtPrimerApe.getText().isEmpty()) {
                Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
                PreparedStatement ps = conexion.prepareStatement("insert into Familias values (?,?,?)");

                ps.setString(1, txtPrimerApe.getText());
                ps.setString(2, txtSegundoApe.getText());
                ps.setInt(3, 0);

                ps.execute();

                ps.close();
                conexion.close();
                limpiar();
                desactivar();
                JOptionPane.showMessageDialog(null, "Cargado con exito");
                actualizarTabla();
                btnDeleteFlia.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un apellido");
            }
        } catch (Exception ex) {
            System.out.println("Error metodo AGREGAR FAMILIA " + ex);
        }
    }//GEN-LAST:event_btnInsertFliaActionPerformed

    private void btnUpdateFliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFliaActionPerformed
        idFliaModificar = (int) tblRegFamilia.getValueAt(tblRegFamilia.getSelectedRow(), 0);
        ArrayList<Familias> list = g.getFamilias();
        for (Familias x : list) {
            if (x.getIdFamilia() == idFliaModificar) {
                txtPrimerApe.setText(x.getApellidoFamilia());
                txtSegundoApe.setText(x.getApellidoFamiliaDos());
            }
        }
        txtPrimerApe.setEnabled(true);
        txtSegundoApe.setEnabled(true);
        btnGuardarFlia.setEnabled(true);
        btnDeleteFlia.setEnabled(false);
        btnInsertFlia.setEnabled(false);
        actualizarTabla();
    }//GEN-LAST:event_btnUpdateFliaActionPerformed

    private void btnDeleteFliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFliaActionPerformed
        try {
            lblPresioneOpcion.setVisible(false);
            btnFamiliaEstu.setVisible(false);
            btnFamiliaTutor.setVisible(false);
            int idFliaDelete = (int) tblRegFamilia.getValueAt(tblRegFamilia.getSelectedRow(), 0);
            String fliaDelete = (String) tblRegFamilia.getValueAt(tblRegFamilia.getSelectedRow(), 1) + " " + (String) tblRegFamilia.getValueAt(tblRegFamilia.getSelectedRow(), 2);
            int respuesta1 = JOptionPane.showConfirmDialog(null, "??Desea eliminar la familia?", "Selecione una Opci??n", YES_NO_OPTION, QUESTION_MESSAGE);
            if (respuesta1 == 0) {
                int respuesta = JOptionPane.showConfirmDialog(null, "Usted va a eliminar a la familia: " + fliaDelete, "", YES_NO_OPTION, QUESTION_MESSAGE);
                if (respuesta == 0) {
                    g.EliminarFamilia(idFliaDelete);
                }
                actualizarTabla();
                JOptionPane.showMessageDialog(null, "Registro eliminado con ??xito");
            }
            btnGuardarFlia.setEnabled(false);
            btnDeleteFlia.setEnabled(false);
            btnUpdateFlia.setEnabled(false);
        } catch (Exception e) {
            System.out.println("Error metodo eliminar FAMILIA");
        }
    }//GEN-LAST:event_btnDeleteFliaActionPerformed

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
            java.util.logging.Logger.getLogger(abmFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abmFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abmFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abmFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abmFamilia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private org.edisoncor.gui.button.ButtonColoredAction btnDeleteFlia;
    private javax.swing.JButton btnFamiliaEstu;
    private javax.swing.JButton btnFamiliaTutor;
    private org.edisoncor.gui.button.ButtonColoredAction btnGuardarFlia;
    private org.edisoncor.gui.button.ButtonColoredAction btnInsertFlia;
    private javax.swing.JButton btnMinimizar;
    private org.edisoncor.gui.button.ButtonColoredAction btnNuevaFlia;
    private org.edisoncor.gui.button.ButtonColoredAction btnUpdateFlia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jplApellidos;
    private javax.swing.JLabel lblPresioneOpcion;
    private javax.swing.JLabel lblPrimerApe;
    private javax.swing.JLabel lblRegDocente;
    private javax.swing.JLabel lblSegundoApe;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel pnl2Docente;
    private javax.swing.JTable tblRegFamilia;
    private org.edisoncor.gui.textField.TextField txtPrimerApe;
    private org.edisoncor.gui.textField.TextField txtSegundoApe;
    // End of variables declaration//GEN-END:variables
    private void limpiar() {
        txtPrimerApe.setText("");
        txtSegundoApe.setText("");
    }

    private void desactivar() {
        txtPrimerApe.setEnabled(false);
        txtSegundoApe.setEnabled(false);
        btnInsertFlia.setEnabled(false);
        btnGuardarFlia.setEnabled(false);
        btnUpdateFlia.setEnabled(false);
        btnDeleteFlia.setEnabled(true);
        btnNuevaFlia.setEnabled(true);
    }
}

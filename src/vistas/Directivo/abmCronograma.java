package vistas.Directivo;

import Controlador.GestorBD;
import Model.DiasSemana;
import Model.Docentes;
import Model.Salas;
import Model.SalasHorarios;
import Model.Horarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class abmCronograma extends javax.swing.JFrame {

    GestorBD g = new GestorBD();
    private static final String PASS = "123";
    private static final String USER = "sa";
    private static final String CADENA = "jdbc:sqlserver://DESKTOP-ANUONV0:1433;databaseName=KASprueba";
    DefaultComboBoxModel cboModelSalas = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelHora = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelDias = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelDoc = new DefaultComboBoxModel();
    ArrayList<Salas> listSalas = g.getSalas();
    ArrayList<Horarios> listHorarios = g.getHorarios();
    ArrayList<DiasSemana> listDias = g.getDiasSemana();
    ArrayList<Docentes> listDoc = g.getDocentes();
    int idSalaHoraModificar = 0;

    public abmCronograma() {
        initComponents();
        actualizarTabla();
        Desactivar();
        for (Salas NombreSala : listSalas) {
            cboModelSalas.addElement(NombreSala.getDescripcion());
        }
        for (Horarios horas : listHorarios) {
            cboModelHora.addElement(horas.getHorarioComienzo() + " - " + horas.getHorarioFinaliza());
        }
        for (DiasSemana DiaSemana : listDias) {
            cboModelDias.addElement(DiaSemana.getDescripcionDia());
        }
        for (Docentes doc : listDoc) {
            cboModelDoc.addElement(doc.getNombre() + " " + doc.getApellido());
        }
        cboNombreSala.setModel(cboModelSalas);
        cboHorario.setModel(cboModelHora);
        cboDiaSemana.setModel(cboModelDias);
        cboDocente.setModel(cboModelDoc);

    }

    @Override
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

        ArrayList<SalasHorarios> list = g.getSalaHorario();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        tmodel.setColumnIdentifiers(new Object[]{"Sala Horario", "Nombre Sala", "Horario", "Dia de Semana", "Docente", "Asignatura"});
        for (SalasHorarios salaHora : list) {
            tmodel.addRow(new Object[]{salaHora.getIdSalaHorario(), salaHora.getNombreSala(), salaHora.getHorario(), salaHora.getDescripcionDia(), salaHora.getDocente(), salaHora.getMateriaDocente()});
        }
        tblRegCrono.setModel(tmodel);
        tblRegCrono.getTableHeader().setReorderingAllowed(false);
        tblRegCrono.getTableHeader().setBackground(new Color(153, 255, 153));
        tblRegCrono.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
        tblRegCrono.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblRegCrono.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegCrono.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegCrono.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblRegCrono.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblRegCrono.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblRegCrono.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tblRegCrono.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tblRegCrono.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
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
        pnl2Directivos2 = new org.edisoncor.gui.panel.Panel();
        btnCerrar2 = new javax.swing.JButton();
        lblDirectivos2 = new javax.swing.JLabel();
        btnMinimizar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegCrono = new javax.swing.JTable();
        btnNuevoCrono = new org.edisoncor.gui.button.ButtonColoredAction();
        btnUpdateCrono = new org.edisoncor.gui.button.ButtonColoredAction();
        btnDeleteCrono = new org.edisoncor.gui.button.ButtonColoredAction();
        btnGuardarModCrono = new org.edisoncor.gui.button.ButtonColoredAction();
        btnInsertCrono = new org.edisoncor.gui.button.ButtonColoredAction();
        cboDiaSemana = new javax.swing.JComboBox<>();
        lblDiaSemana = new javax.swing.JLabel();
        cboHorario = new javax.swing.JComboBox<>();
        lblHorario = new javax.swing.JLabel();
        cboNombreSala = new javax.swing.JComboBox<>();
        lblNombreSala = new javax.swing.JLabel();
        lblDocente = new javax.swing.JLabel();
        cboDocente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAS - REGISTRO DE CRONOGRAMA");
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

        pnl2Directivos2.setBackground(new java.awt.Color(0, 0, 0));
        pnl2Directivos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl2Directivos2.setColorPrimario(new java.awt.Color(0, 0, 0));

        btnCerrar2.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        btnCerrar2.setBorderPainted(false);
        btnCerrar2.setContentAreaFilled(false);
        btnCerrar2.setFocusPainted(false);
        btnCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar2ActionPerformed(evt);
            }
        });

        lblDirectivos2.setBackground(new java.awt.Color(0, 0, 0));
        lblDirectivos2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblDirectivos2.setForeground(new java.awt.Color(255, 255, 255));
        lblDirectivos2.setText("REGISTRO DE CRONOGRAMA");
        lblDirectivos2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnMinimizar2.setBackground(new java.awt.Color(0, 0, 0));
        btnMinimizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimo.png"))); // NOI18N
        btnMinimizar2.setBorderPainted(false);
        btnMinimizar2.setContentAreaFilled(false);
        btnMinimizar2.setFocusPainted(false);
        btnMinimizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2Directivos2Layout = new javax.swing.GroupLayout(pnl2Directivos2);
        pnl2Directivos2.setLayout(pnl2Directivos2Layout);
        pnl2Directivos2Layout.setHorizontalGroup(
            pnl2Directivos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Directivos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDirectivos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl2Directivos2Layout.setVerticalGroup(
            pnl2Directivos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDirectivos2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Directivos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnMinimizar2)
                .addComponent(btnCerrar2))
        );

        tblRegCrono.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tblRegCrono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
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
        tblRegCrono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegCronoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegCrono);

        btnNuevoCrono.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevoCrono.setBorder(null);
        btnNuevoCrono.setText("NUEVO");
        btnNuevoCrono.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnNuevoCrono.setDireccionDeSombra(0);
        btnNuevoCrono.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnNuevoCrono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoCrono.setProfundidad(new java.lang.Float(0.0F));
        btnNuevoCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCronoActionPerformed(evt);
            }
        });

        btnUpdateCrono.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdateCrono.setBorder(null);
        btnUpdateCrono.setText("MODIFICAR");
        btnUpdateCrono.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnUpdateCrono.setDireccionDeSombra(0);
        btnUpdateCrono.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnUpdateCrono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateCrono.setProfundidad(new java.lang.Float(0.0F));
        btnUpdateCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCronoActionPerformed(evt);
            }
        });

        btnDeleteCrono.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteCrono.setBorder(null);
        btnDeleteCrono.setText("ELIMINAR");
        btnDeleteCrono.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnDeleteCrono.setDireccionDeSombra(0);
        btnDeleteCrono.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnDeleteCrono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteCrono.setProfundidad(new java.lang.Float(0.0F));
        btnDeleteCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCronoActionPerformed(evt);
            }
        });

        btnGuardarModCrono.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarModCrono.setBorder(null);
        btnGuardarModCrono.setText("GUARDAR");
        btnGuardarModCrono.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnGuardarModCrono.setDireccionDeSombra(0);
        btnGuardarModCrono.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnGuardarModCrono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarModCrono.setProfundidad(new java.lang.Float(0.0F));
        btnGuardarModCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModCronoActionPerformed(evt);
            }
        });

        btnInsertCrono.setBackground(new java.awt.Color(51, 51, 51));
        btnInsertCrono.setBorder(null);
        btnInsertCrono.setText("AGREGAR");
        btnInsertCrono.setColorDeSombra(new java.awt.Color(51, 51, 51));
        btnInsertCrono.setDireccionDeSombra(0);
        btnInsertCrono.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        btnInsertCrono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertCrono.setProfundidad(new java.lang.Float(0.0F));
        btnInsertCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCronoActionPerformed(evt);
            }
        });

        cboDiaSemana.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboDiaSemana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboDiaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiaSemanaActionPerformed(evt);
            }
        });

        lblDiaSemana.setBackground(new java.awt.Color(0, 102, 0));
        lblDiaSemana.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDiaSemana.setForeground(new java.awt.Color(153, 255, 153));
        lblDiaSemana.setText("Dia de Semana:");
        lblDiaSemana.setOpaque(true);

        cboHorario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHorarioActionPerformed(evt);
            }
        });

        lblHorario.setBackground(new java.awt.Color(0, 102, 0));
        lblHorario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(153, 255, 153));
        lblHorario.setText("Horario:");
        lblHorario.setOpaque(true);

        cboNombreSala.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboNombreSala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboNombreSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNombreSalaActionPerformed(evt);
            }
        });

        lblNombreSala.setBackground(new java.awt.Color(0, 102, 0));
        lblNombreSala.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNombreSala.setForeground(new java.awt.Color(153, 255, 153));
        lblNombreSala.setText("Nombre Sala: ");
        lblNombreSala.setOpaque(true);

        lblDocente.setBackground(new java.awt.Color(0, 102, 0));
        lblDocente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocente.setForeground(new java.awt.Color(153, 255, 153));
        lblDocente.setText("Docente: ");
        lblDocente.setOpaque(true);

        cboDocente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cboDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnNuevoCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboDocente, 0, 252, Short.MAX_VALUE)
                    .addComponent(cboDiaSemana, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNombreSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDocente)
                    .addComponent(lblDiaSemana)
                    .addComponent(lblHorario)
                    .addComponent(lblNombreSala)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarModCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(pnl2Directivos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(pnl2Directivos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblNombreSala)
                        .addGap(13, 13, 13)
                        .addComponent(cboNombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDiaSemana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDocente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarModCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
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

    private void btnCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar2ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la ventana?", "Selecione una Opción", YES_NO_OPTION, QUESTION_MESSAGE);
        if (respuesta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrar2ActionPerformed

    private void btnMinimizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar2ActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizar2ActionPerformed

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

    private void tblRegCronoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegCronoMouseClicked
        btnUpdateCrono.setEnabled(true);
        btnInsertCrono.setEnabled(false);
        btnDeleteCrono.setEnabled(true);
        btnNuevoCrono.setEnabled(false);
        btnGuardarModCrono.setEnabled(false);
    }//GEN-LAST:event_tblRegCronoMouseClicked

    private void btnNuevoCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCronoActionPerformed
        activarNuevo();
        limpiar();
    }//GEN-LAST:event_btnNuevoCronoActionPerformed

    private void btnUpdateCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCronoActionPerformed
        idSalaHoraModificar = (int) tblRegCrono.getValueAt(tblRegCrono.getSelectedRow(), 0);
        ArrayList<SalasHorarios> lists = g.getSalaHorario();
        for (SalasHorarios x : lists) {
            if (x.getIdSalaHorario() == idSalaHoraModificar) {
                for (Salas sala : listSalas) {
                    if (sala.getIdSala() == x.getIdSala()) {
                        cboNombreSala.setSelectedItem(sala.getDescripcion());
                    }
                }
                for (Horarios horas : listHorarios) {
                    if (horas.getIdHorario() == x.getIdHorario()) {
                        cboHorario.setSelectedItem(horas.getHorarioComienzo() + " - " + horas.getHorarioFinaliza());
                    }
                }
                for (DiasSemana diaSemana : listDias) {
                    if (diaSemana.getIdDiaSemana() == x.getDiaSemana()) {
                        cboDiaSemana.setSelectedItem(diaSemana.getDescripcionDia());
                    }
                }
                for (Docentes docentes : listDoc) {
                    if (docentes.getIdDocente() == x.getIdDocente()) {
                        cboDocente.setSelectedItem(docentes.getNombre() + " " + docentes.getApellido());
                    }
                }
            }
        }
        cboNombreSala.setEnabled(true);
        cboHorario.setEnabled(true);
        cboDocente.setEnabled(true);
        cboDiaSemana.setEnabled(true);
        btnGuardarModCrono.setEnabled(true);
        btnDeleteCrono.setEnabled(false);
    }//GEN-LAST:event_btnUpdateCronoActionPerformed

    private void btnDeleteCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCronoActionPerformed
        try {
            int idCronoDelete = (int) tblRegCrono.getValueAt(tblRegCrono.getSelectedRow(), 0);
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?", "Selecione una Opción", YES_NO_OPTION, QUESTION_MESSAGE);
            if (respuesta == 0) {
                g.EliminarSalaHorario(idCronoDelete);
            }
            actualizarTabla();
            JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
        } catch (Exception e) {
            System.out.println("Error metodo eliminar SALA horarios" + e);
        }
    }//GEN-LAST:event_btnDeleteCronoActionPerformed

    private void btnGuardarModCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModCronoActionPerformed
        int idSalaHorario = idSalaHoraModificar;
        int idSala = 0;
        for (Salas nombre : listSalas) {
            if (nombre.getDescripcion().equals(cboNombreSala.getSelectedItem())) {
                idSala = (nombre.getIdSala());
            }
        }
        int idHorario = 0;
        for (Horarios hora : listHorarios) {
            if (cboHorario.getSelectedItem().equals(hora.getHorarioComienzo() + " - " + hora.getHorarioFinaliza())) {
                idHorario = (hora.getIdHorario());
            }
        }
        int DiaSemana = 0;
        for (DiasSemana dia : listDias) {
            if (dia.getDescripcionDia().equals(cboDiaSemana.getSelectedItem())) {
                DiaSemana = (dia.getIdDiaSemana());
            }
        }
        int idDocente = 0;
        for (Docentes docentes : listDoc) {
            if (cboDocente.getSelectedItem().equals(docentes.getNombre() + " " + docentes.getApellido())) {
                idDocente = (docentes.getIdDocente());
            }
        }

        SalasHorarios sh = new SalasHorarios(idSalaHorario, idSala, idHorario, idDocente, DiaSemana);        
        g.ModificarSalaHorario(sh);
        actualizarTabla();
        limpiar();
        btnUpdateCrono.setEnabled(false);
        btnInsertCrono.setEnabled(false);
        btnDeleteCrono.setEnabled(true);
        btnNuevoCrono.setEnabled(true);
        btnGuardarModCrono.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Guardado con exito");
    }//GEN-LAST:event_btnGuardarModCronoActionPerformed

    private void btnInsertCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCronoActionPerformed
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("insert into  SalasHorarios (idSala,idHorario,idDocente,diaSemana) values(?,?,?,?)");

            for (Salas nombre : listSalas) {
                if (nombre.getDescripcion().equals(cboNombreSala.getSelectedItem())) {
                    ps.setInt(1, nombre.getIdSala());                    
                }
            }
            for (Horarios hora : listHorarios) {
                if (cboHorario.getSelectedItem().equals(hora.getHorarioComienzo() + " - " + hora.getHorarioFinaliza())) {
                    ps.setInt(2, hora.getIdHorario());
                }
            }
            for (Docentes docentes : listDoc) {
                if (cboDocente.getSelectedItem().equals(docentes.getNombre() + " " + docentes.getApellido())) {
                    ps.setInt(3, docentes.getIdDocente());                    
                }
            }
            for (DiasSemana dia : listDias) {
                if (dia.getDescripcionDia().equals(cboDiaSemana.getSelectedItem())) {
                    ps.setInt(4, dia.getIdDiaSemana());                    
                }
            }

            ps.execute();

            ps.close();
            conexion.close();
            actualizarTabla();
            limpiar();
            Desactivar();
            JOptionPane.showMessageDialog(null, "Cargado con exito");
        } catch (Exception ex) {
            System.out.println("Error metodo AGREGAR SALA HORARIO" + ex);
        }
    }//GEN-LAST:event_btnInsertCronoActionPerformed

    private void cboDiaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiaSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDiaSemanaActionPerformed

    private void cboHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHorarioActionPerformed

    private void cboNombreSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNombreSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNombreSalaActionPerformed

    private void cboDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDocenteActionPerformed

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
            java.util.logging.Logger.getLogger(abmCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abmCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abmCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abmCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abmCronograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar2;
    private org.edisoncor.gui.button.ButtonColoredAction btnDeleteCrono;
    private org.edisoncor.gui.button.ButtonColoredAction btnGuardarModCrono;
    private org.edisoncor.gui.button.ButtonColoredAction btnInsertCrono;
    private javax.swing.JButton btnMinimizar2;
    private org.edisoncor.gui.button.ButtonColoredAction btnNuevoCrono;
    private org.edisoncor.gui.button.ButtonColoredAction btnUpdateCrono;
    private javax.swing.JComboBox<String> cboDiaSemana;
    private javax.swing.JComboBox<String> cboDocente;
    private javax.swing.JComboBox<String> cboHorario;
    private javax.swing.JComboBox<String> cboNombreSala;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiaSemana;
    private javax.swing.JLabel lblDirectivos2;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNombreSala;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel pnl2Directivos2;
    private javax.swing.JTable tblRegCrono;
    // End of variables declaration//GEN-END:variables
 private void activarNuevo() {
        cboNombreSala.setSelectedIndex(0);
        cboNombreSala.setEnabled(true);
        cboHorario.setSelectedIndex(0);
        cboHorario.setEnabled(true);
        cboDiaSemana.setSelectedIndex(0);
        cboDiaSemana.setEnabled(true);
        cboDocente.setSelectedIndex(0);
        cboDocente.setEnabled(true);
        btnInsertCrono.setEnabled(true);
        btnDeleteCrono.setEnabled(false);
        btnUpdateCrono.setEnabled(false);
        btnNuevoCrono.setEnabled(false);
        btnGuardarModCrono.setEnabled(false);
    }

    private void limpiar() {
        cboDiaSemana.setSelectedIndex(-1);
        cboDocente.setSelectedIndex(-1);
        cboHorario.setSelectedIndex(-1);
        cboNombreSala.setSelectedIndex(-1);
    }

    private void Desactivar() {
        cboNombreSala.setSelectedIndex(-1);
        cboNombreSala.setEnabled(false);
        cboHorario.setSelectedIndex(-1);
        cboHorario.setEnabled(false);
        cboDocente.setSelectedIndex(-1);
        cboDocente.setEnabled(false);
        cboDiaSemana.setSelectedIndex(-1);
        cboDiaSemana.setEnabled(false);
        btnInsertCrono.setEnabled(false);
        btnGuardarModCrono.setEnabled(false);
        btnUpdateCrono.setEnabled(false);
        btnDeleteCrono.setEnabled(true);
        btnNuevoCrono.setEnabled(true);
    }

}
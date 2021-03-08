package vistas.Directivo;

import Model.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Controlador.GestorBD;
import Model.Salas;
import Model.SalasHorarios;

public class ListaHorariosMañana extends javax.swing.JFrame {

    GestorBD g = new GestorBD();

    public ListaHorariosMañana() {
        initComponents();
    }

    public Image getIconImage() {
        Image logo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/DIAPOSITIVA1.jpg"));
        return logo;
    }

    public void Tabla() {
        DefaultTableModel tmodel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ArrayList<Usuarios> list = g.getUsuarios();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tmodel.setColumnIdentifiers(new Object[]{"Id Usuario", "Usuarios", "Tipo de Perfil",});
        for (Usuarios usuarios : list) {
            tmodel.addRow(new Object[]{usuarios.getIdLogin(), usuarios.getUsuario(), usuarios.getDescripcion()});
        }
//        tblHorarios.setModel(tmodel);
//        tblHorarios.getTableHeader().setBackground(new Color(153, 255, 153));
//        tblHorarios.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
//        tblHorarios.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
//        tblHorarios.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
//        tblHorarios.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
    }

    
       
    

    public void actualizarPanel(int idSalaH) {
        ArrayList<Salas> listaS = g.getSalas();
        for (Salas salas : listaS) {                
            if(salas.getIdSala() == idSalaH){
                lblNombreSala.setText(salas.getDescripcion());
            }
        }
        ArrayList<SalasHorarios> listadoHorarioSala = g.getSalasHorarios(idSalaH);
        for (SalasHorarios x : listadoHorarioSala) {
            //REGISTRO X       IdHorario=1   DiaSemana = "Miercoles";
            switch (x.getIdHorario()) {
                case 1: { //horario  9 - 9:40     ------- entra por acá
                    switch (x.getDescripcionDia()) {
                        case "Lunes": {
                            lblDocenteLunes1.setText(x.getDocente());
                            lblTipoDocenteLunes1.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Martes": {
                            //                         PnlMartes-1
                            lblDocenteMartes1.setText(x.getDocente());
                            lblTipoDocenteMartes1.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Miercoles": { // ------------ entra por acá
                            //                         PnlMiercoles-1
                            lblDocenteMiercoles1.setText(x.getDocente());
                            lblTipoDocenteMiercoles1.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Jueves": {
                            lblDocenteJueves1.setText(x.getDocente());
                            lblTipoDocenteJueves1.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Viernes": {
                            lblDocenteViernes1.setText(x.getDocente());
                            lblTipoDocenteViernes1.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Sabado": { // ------------ entra por acá
                            //                         PnlSabado-1
                            lblDocenteSabado1.setText(x.getDocente());
                            lblTipoDocenteSabado1.setText(x.getMateriaDocente());
                            break;
                        }

                    }

                    break;
                }
                case 2: { //horario  10 - 10:40
                    switch (x.getDescripcionDia()) {
                        case "Lunes": {
                            lblDocenteLunes2.setText(x.getDocente());
                            lblTipoDocenteLunes2.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Martes": {
                            //                         PnlMartes-2
                            lblDocenteMartes2.setText(x.getDocente());
                            lblTipoDocenteMartes2.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Miercoles": { // ------------ entra por acá
                            //                         PnlMiercoles-2
                            lblDocenteMiercoles2.setText(x.getDocente());
                            lblTipoDocenteMiercoles2.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Jueves": {
                            lblDocenteJueves2.setText(x.getDocente());
                            lblTipoDocenteJueves2.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Viernes": {
                            lblDocenteViernes2.setText(x.getDocente());
                            lblTipoDocenteViernes2.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Sabado": { // ------------ entra por acá
                            //                         PnlSabado-2
                            lblDocenteSabado2.setText(x.getDocente());
                            lblTipoDocenteSabado2.setText(x.getMateriaDocente());
                            break;
                        }

                    }
                    break;
                }
                case 3: { //horario  11 - 11:40
                    switch (x.getDescripcionDia()) {
                        case "Lunes": {
                            lblDocenteLunes3.setText(x.getDocente());
                            lblTipoDocenteLunes3.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Martes": {
                            lblDocenteMartes3.setText(x.getDocente());
                            lblTipoDocenteMartes3.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Miercoles": { // ------------ entra por acá
                            //                         PnlMiercoles-1
                            lblDocenteMiercoles3.setText(x.getDocente());
                            lblTipoDocenteMiercoles3.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Jueves": {
                            lblDocenteJueves3.setText(x.getDocente());
                            lblTipoDocenteJueves3.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Viernes": {
                            lblDocenteViernes3.setText(x.getDocente());
                            lblTipoDocenteViernes3.setText(x.getMateriaDocente());
                            break;
                        }
                        case "Sabado": { // ------------ entra por acá
                            //                         PnlMiercoles-1
                            lblDocenteSabado3.setText(x.getDocente());
                            lblTipoDocenteSabado3.setText(x.getMateriaDocente());
                            break;
                        }

                    }
                    break;
                }

            }

        }

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
        pnl2Directivos = new org.edisoncor.gui.panel.Panel();
        btnCerrar = new javax.swing.JButton();
        lblDirectivos = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        lblDocenteLunes1 = new javax.swing.JLabel();
        lblTipoDocenteLunes1 = new javax.swing.JLabel();
        lblDocenteMartes1 = new javax.swing.JLabel();
        lblTipoDocenteMartes1 = new javax.swing.JLabel();
        lblDocenteMiercoles1 = new javax.swing.JLabel();
        lblTipoDocenteMiercoles1 = new javax.swing.JLabel();
        lblDocenteJueves1 = new javax.swing.JLabel();
        lblTipoDocenteJueves1 = new javax.swing.JLabel();
        lblDocenteViernes1 = new javax.swing.JLabel();
        lblTipoDocenteViernes1 = new javax.swing.JLabel();
        lblDocenteSabado1 = new javax.swing.JLabel();
        lblTipoDocenteSabado1 = new javax.swing.JLabel();
        lblDocenteLunes2 = new javax.swing.JLabel();
        lblTipoDocenteLunes2 = new javax.swing.JLabel();
        lblDocenteMartes2 = new javax.swing.JLabel();
        lblTipoDocenteMartes2 = new javax.swing.JLabel();
        lblDocenteMiercoles2 = new javax.swing.JLabel();
        lblTipoDocenteMiercoles2 = new javax.swing.JLabel();
        lblDocenteJueves2 = new javax.swing.JLabel();
        lblTipoDocenteJueves2 = new javax.swing.JLabel();
        lblDocenteViernes2 = new javax.swing.JLabel();
        lblTipoDocenteViernes2 = new javax.swing.JLabel();
        lblDocenteSabado2 = new javax.swing.JLabel();
        lblTipoDocenteSabado2 = new javax.swing.JLabel();
        lblDocenteLunes3 = new javax.swing.JLabel();
        lblTipoDocenteLunes3 = new javax.swing.JLabel();
        lblDocenteMartes3 = new javax.swing.JLabel();
        lblTipoDocenteMartes3 = new javax.swing.JLabel();
        lblDocenteMiercoles3 = new javax.swing.JLabel();
        lblTipoDocenteMiercoles3 = new javax.swing.JLabel();
        lblDocenteJueves3 = new javax.swing.JLabel();
        lblTipoDocenteJueves3 = new javax.swing.JLabel();
        lblDocenteViernes3 = new javax.swing.JLabel();
        lblTipoDocenteViernes3 = new javax.swing.JLabel();
        lblDocenteSabado3 = new javax.swing.JLabel();
        lblTipoDocenteSabado3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreSala = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KAS - HORARIOS");
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
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl2Directivos.setBackground(new java.awt.Color(0, 0, 0));
        pnl2Directivos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnl2Directivos.setColorPrimario(new java.awt.Color(0, 0, 0));

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

        lblDirectivos.setBackground(new java.awt.Color(0, 0, 0));
        lblDirectivos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblDirectivos.setForeground(new java.awt.Color(255, 255, 255));
        lblDirectivos.setText("HORARIOS SALAS TURNO MAÑANA");
        lblDirectivos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        javax.swing.GroupLayout pnl2DirectivosLayout = new javax.swing.GroupLayout(pnl2Directivos);
        pnl2Directivos.setLayout(pnl2DirectivosLayout);
        pnl2DirectivosLayout.setHorizontalGroup(
            pnl2DirectivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2DirectivosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDirectivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl2DirectivosLayout.setVerticalGroup(
            pnl2DirectivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDirectivos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2DirectivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnMinimizar)
                .addComponent(btnCerrar))
        );

        panel1.add(pnl2Directivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        lblDocenteLunes1.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteLunes1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteLunes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteLunes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteLunes1.setOpaque(true);
        panel1.add(lblDocenteLunes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 50));

        lblTipoDocenteLunes1.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteLunes1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteLunes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteLunes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteLunes1.setOpaque(true);
        panel1.add(lblTipoDocenteLunes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, 50));

        lblDocenteMartes1.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteMartes1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteMartes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteMartes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteMartes1.setOpaque(true);
        panel1.add(lblDocenteMartes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, 50));

        lblTipoDocenteMartes1.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteMartes1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteMartes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteMartes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteMartes1.setOpaque(true);
        panel1.add(lblTipoDocenteMartes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 170, 50));

        lblDocenteMiercoles1.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteMiercoles1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteMiercoles1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteMiercoles1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteMiercoles1.setOpaque(true);
        panel1.add(lblDocenteMiercoles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 170, 50));

        lblTipoDocenteMiercoles1.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteMiercoles1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteMiercoles1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteMiercoles1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteMiercoles1.setOpaque(true);
        panel1.add(lblTipoDocenteMiercoles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 170, 50));

        lblDocenteJueves1.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteJueves1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteJueves1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteJueves1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteJueves1.setOpaque(true);
        panel1.add(lblDocenteJueves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 170, 50));

        lblTipoDocenteJueves1.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteJueves1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteJueves1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteJueves1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteJueves1.setOpaque(true);
        panel1.add(lblTipoDocenteJueves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 170, 50));

        lblDocenteViernes1.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteViernes1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteViernes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteViernes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteViernes1.setOpaque(true);
        panel1.add(lblDocenteViernes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, 170, 50));

        lblTipoDocenteViernes1.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteViernes1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteViernes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteViernes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteViernes1.setOpaque(true);
        panel1.add(lblTipoDocenteViernes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 170, 50));

        lblDocenteSabado1.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteSabado1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteSabado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteSabado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteSabado1.setOpaque(true);
        panel1.add(lblDocenteSabado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 180, 170, 50));

        lblTipoDocenteSabado1.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteSabado1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteSabado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteSabado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteSabado1.setOpaque(true);
        panel1.add(lblTipoDocenteSabado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 230, 170, 50));

        lblDocenteLunes2.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteLunes2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteLunes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteLunes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteLunes2.setOpaque(true);
        panel1.add(lblDocenteLunes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 170, 50));

        lblTipoDocenteLunes2.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteLunes2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteLunes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteLunes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteLunes2.setOpaque(true);
        panel1.add(lblTipoDocenteLunes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 170, 50));

        lblDocenteMartes2.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteMartes2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteMartes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteMartes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteMartes2.setOpaque(true);
        panel1.add(lblDocenteMartes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 170, 50));

        lblTipoDocenteMartes2.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteMartes2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteMartes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteMartes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteMartes2.setOpaque(true);
        panel1.add(lblTipoDocenteMartes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 170, 50));

        lblDocenteMiercoles2.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteMiercoles2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteMiercoles2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteMiercoles2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteMiercoles2.setOpaque(true);
        panel1.add(lblDocenteMiercoles2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 170, 50));

        lblTipoDocenteMiercoles2.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteMiercoles2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteMiercoles2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteMiercoles2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteMiercoles2.setOpaque(true);
        panel1.add(lblTipoDocenteMiercoles2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 170, 50));

        lblDocenteJueves2.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteJueves2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteJueves2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteJueves2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteJueves2.setOpaque(true);
        panel1.add(lblDocenteJueves2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 170, 50));

        lblTipoDocenteJueves2.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteJueves2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteJueves2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteJueves2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteJueves2.setOpaque(true);
        panel1.add(lblTipoDocenteJueves2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 170, 50));

        lblDocenteViernes2.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteViernes2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteViernes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteViernes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteViernes2.setOpaque(true);
        panel1.add(lblDocenteViernes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 170, 50));

        lblTipoDocenteViernes2.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteViernes2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteViernes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteViernes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteViernes2.setOpaque(true);
        panel1.add(lblTipoDocenteViernes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 170, 50));

        lblDocenteSabado2.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteSabado2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteSabado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteSabado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteSabado2.setOpaque(true);
        panel1.add(lblDocenteSabado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, 170, 50));

        lblTipoDocenteSabado2.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteSabado2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteSabado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteSabado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteSabado2.setOpaque(true);
        panel1.add(lblTipoDocenteSabado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 350, 170, 50));

        lblDocenteLunes3.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteLunes3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteLunes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteLunes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteLunes3.setOpaque(true);
        panel1.add(lblDocenteLunes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 170, 50));

        lblTipoDocenteLunes3.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteLunes3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteLunes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteLunes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteLunes3.setOpaque(true);
        panel1.add(lblTipoDocenteLunes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 170, 50));

        lblDocenteMartes3.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteMartes3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteMartes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteMartes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteMartes3.setOpaque(true);
        panel1.add(lblDocenteMartes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 170, 50));

        lblTipoDocenteMartes3.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteMartes3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteMartes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteMartes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteMartes3.setOpaque(true);
        panel1.add(lblTipoDocenteMartes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 170, 50));

        lblDocenteMiercoles3.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteMiercoles3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteMiercoles3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteMiercoles3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteMiercoles3.setOpaque(true);
        panel1.add(lblDocenteMiercoles3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 170, 50));

        lblTipoDocenteMiercoles3.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteMiercoles3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteMiercoles3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteMiercoles3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteMiercoles3.setOpaque(true);
        panel1.add(lblTipoDocenteMiercoles3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 170, 50));

        lblDocenteJueves3.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteJueves3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteJueves3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteJueves3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteJueves3.setOpaque(true);
        panel1.add(lblDocenteJueves3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 170, 50));

        lblTipoDocenteJueves3.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteJueves3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteJueves3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteJueves3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteJueves3.setOpaque(true);
        panel1.add(lblTipoDocenteJueves3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 170, 50));

        lblDocenteViernes3.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteViernes3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteViernes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteViernes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteViernes3.setOpaque(true);
        panel1.add(lblDocenteViernes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 170, 50));

        lblTipoDocenteViernes3.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteViernes3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteViernes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteViernes3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteViernes3.setOpaque(true);
        panel1.add(lblTipoDocenteViernes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 470, 170, 50));

        lblDocenteSabado3.setBackground(new java.awt.Color(204, 204, 204));
        lblDocenteSabado3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDocenteSabado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocenteSabado3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDocenteSabado3.setOpaque(true);
        panel1.add(lblDocenteSabado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 420, 170, 50));

        lblTipoDocenteSabado3.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoDocenteSabado3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTipoDocenteSabado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoDocenteSabado3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTipoDocenteSabado3.setOpaque(true);
        panel1.add(lblTipoDocenteSabado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 470, 170, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<HTML>\n<CENTER>\n<p>DIAS</p>\n<p>-------------</p>\n<p>HORAS</p>\n</CENTER>\n</HTML>\n");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setIconTextGap(1);
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 71));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("9:00 a 9:40 hs");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 120, 120));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("10:00 a 10:40 hs");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 120, 120));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("11:00 a 11:40 hs");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 120, 120));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 430));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HORARIOS SALA : ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 3));
        jLabel1.setOpaque(true);

        lblNombreSala.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNombreSala.setText("Nombre de Sala");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblNombreSala)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblNombreSala))
        );

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1260, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LUNES");
        jLabel6.setToolTipText("");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MARTES");
        jLabel7.setToolTipText("");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MIERCOLES");
        jLabel8.setToolTipText("");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("JUEVES");
        jLabel9.setToolTipText("");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("VIERNES");
        jLabel10.setToolTipText("");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SABADO");
        jLabel11.setToolTipText("");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 1120, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la ventana?", "Selecione una Opción", YES_NO_OPTION, QUESTION_MESSAGE);
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
            java.util.logging.Logger.getLogger(ListaHorariosMañana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaHorariosMañana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaHorariosMañana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaHorariosMañana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaHorariosMañana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDirectivos;
    private javax.swing.JLabel lblDocenteJueves1;
    private javax.swing.JLabel lblDocenteJueves2;
    private javax.swing.JLabel lblDocenteJueves3;
    private javax.swing.JLabel lblDocenteLunes1;
    private javax.swing.JLabel lblDocenteLunes2;
    private javax.swing.JLabel lblDocenteLunes3;
    private javax.swing.JLabel lblDocenteMartes1;
    private javax.swing.JLabel lblDocenteMartes2;
    private javax.swing.JLabel lblDocenteMartes3;
    private javax.swing.JLabel lblDocenteMiercoles1;
    private javax.swing.JLabel lblDocenteMiercoles2;
    private javax.swing.JLabel lblDocenteMiercoles3;
    private javax.swing.JLabel lblDocenteSabado1;
    private javax.swing.JLabel lblDocenteSabado2;
    private javax.swing.JLabel lblDocenteSabado3;
    private javax.swing.JLabel lblDocenteViernes1;
    private javax.swing.JLabel lblDocenteViernes2;
    private javax.swing.JLabel lblDocenteViernes3;
    private javax.swing.JLabel lblNombreSala;
    private javax.swing.JLabel lblTipoDocenteJueves1;
    private javax.swing.JLabel lblTipoDocenteJueves2;
    private javax.swing.JLabel lblTipoDocenteJueves3;
    private javax.swing.JLabel lblTipoDocenteLunes1;
    private javax.swing.JLabel lblTipoDocenteLunes2;
    private javax.swing.JLabel lblTipoDocenteLunes3;
    private javax.swing.JLabel lblTipoDocenteMartes1;
    private javax.swing.JLabel lblTipoDocenteMartes2;
    private javax.swing.JLabel lblTipoDocenteMartes3;
    private javax.swing.JLabel lblTipoDocenteMiercoles1;
    private javax.swing.JLabel lblTipoDocenteMiercoles2;
    private javax.swing.JLabel lblTipoDocenteMiercoles3;
    private javax.swing.JLabel lblTipoDocenteSabado1;
    private javax.swing.JLabel lblTipoDocenteSabado2;
    private javax.swing.JLabel lblTipoDocenteSabado3;
    private javax.swing.JLabel lblTipoDocenteViernes1;
    private javax.swing.JLabel lblTipoDocenteViernes2;
    private javax.swing.JLabel lblTipoDocenteViernes3;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel pnl2Directivos;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class micontactos extends javax.swing.JFrame {

    String imagePth=null;
    int pos=0;
    public static int usuarioactualid;
    
    public micontactos() {
       
        initComponents();
        
         datostabla();
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.RED);
        jTable1.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable1.getTableHeader();
        th.setForeground(Color.BLUE);
        th.setFont(new Font("Tahoma",Font.BOLD,14));
          System.out.println(usuarioactualid + "Desde Contactos");
   
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButtonbuscar3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelfotousuario = new javax.swing.JLabel();
        jLabelusename = new javax.swing.JLabel();
        Lcerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldnombre = new javax.swing.JTextField();
        jTextFieldapellido = new javax.swing.JTextField();
        jTextFieldtel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxgrupo = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreadirecc = new javax.swing.JTextArea();
        jButtonbuscar = new javax.swing.JButton();
        jLabelcontacfoto = new javax.swing.JLabel();
        jButtonAñadir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldid = new javax.swing.JTextField();
        jButtoneditar = new javax.swing.JButton();
        jButtoneliminar = new javax.swing.JButton();
        jButtonprimero = new javax.swing.JButton();
        jButtonsiguiente = new javax.swing.JButton();
        jButtonanterior = new javax.swing.JButton();
        jButtonultimo = new javax.swing.JButton();

        jButtonbuscar3.setBackground(new java.awt.Color(16, 172, 132));
        jButtonbuscar3.setText("<");
        jButtonbuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscar3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 152, 218));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mis Contactos");

        jLabelfotousuario.setBackground(new java.awt.Color(0, 0, 153));
        jLabelfotousuario.setOpaque(true);

        jLabelusename.setText("Nombre del Usuario");

        Lcerrar.setText("Cerrar Sesion");
        Lcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LcerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelfotousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelusename)
                .addGap(239, 239, 239)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(Lcerrar)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelusename)
                    .addComponent(Lcerrar))
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(jLabelfotousuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(15, 185, 177));
        jPanel2.setForeground(new java.awt.Color(238, 82, 83));

        jLabel4.setBackground(new java.awt.Color(209, 216, 224));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 82, 83));
        jLabel4.setText("Apellido");

        jLabel5.setBackground(new java.awt.Color(209, 216, 224));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 82, 83));
        jLabel5.setText("Nombre de pila");

        jTextFieldnombre.setBackground(new java.awt.Color(34, 47, 62));
        jTextFieldnombre.setForeground(new java.awt.Color(15, 188, 249));
        jTextFieldnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnombreActionPerformed(evt);
            }
        });

        jTextFieldapellido.setBackground(new java.awt.Color(34, 47, 62));
        jTextFieldapellido.setForeground(new java.awt.Color(15, 188, 249));
        jTextFieldapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldapellidoActionPerformed(evt);
            }
        });

        jTextFieldtel.setBackground(new java.awt.Color(34, 47, 62));
        jTextFieldtel.setForeground(new java.awt.Color(15, 188, 249));
        jTextFieldtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtelActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(209, 216, 224));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 82, 83));
        jLabel6.setText("Tel.");

        jTextFieldmail.setBackground(new java.awt.Color(34, 47, 62));
        jTextFieldmail.setForeground(new java.awt.Color(15, 188, 249));
        jTextFieldmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmailActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(209, 216, 224));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 82, 83));
        jLabel7.setText("Email");

        jLabel8.setBackground(new java.awt.Color(209, 216, 224));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 82, 83));
        jLabel8.setText("Grupo");

        jComboBoxgrupo.setBackground(new java.awt.Color(34, 47, 62));
        jComboBoxgrupo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxgrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Familia", "Amigos", "Trabajo", " " }));

        jSeparator2.setBackground(new java.awt.Color(204, 0, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setBackground(new java.awt.Color(209, 216, 224));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 82, 83));
        jLabel9.setText("Foto de Perfil");

        jLabel10.setBackground(new java.awt.Color(209, 216, 224));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 82, 83));
        jLabel10.setText("Direccion ");

        jTextAreadirecc.setBackground(new java.awt.Color(34, 47, 62));
        jTextAreadirecc.setColumns(20);
        jTextAreadirecc.setForeground(new java.awt.Color(15, 188, 249));
        jTextAreadirecc.setRows(5);
        jScrollPane1.setViewportView(jTextAreadirecc);

        jButtonbuscar.setBackground(new java.awt.Color(71, 71, 135));
        jButtonbuscar.setText("Buscar");
        jButtonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarActionPerformed(evt);
            }
        });

        jLabelcontacfoto.setBackground(new java.awt.Color(119, 140, 163));
        jLabelcontacfoto.setOpaque(true);

        jButtonAñadir.setBackground(new java.awt.Color(46, 134, 222));
        jButtonAñadir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel11.setBackground(new java.awt.Color(209, 216, 224));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 82, 83));
        jLabel11.setText("ID");

        jTextFieldid.setEditable(false);
        jTextFieldid.setBackground(new java.awt.Color(34, 47, 62));
        jTextFieldid.setForeground(new java.awt.Color(15, 188, 249));
        jTextFieldid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldidActionPerformed(evt);
            }
        });

        jButtoneditar.setBackground(new java.awt.Color(39, 174, 96));
        jButtoneditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtoneditar.setText("Editar");
        jButtoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditarActionPerformed(evt);
            }
        });

        jButtoneliminar.setBackground(new java.awt.Color(194, 54, 22));
        jButtoneliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtoneliminar.setText("Eliminar");
        jButtoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneliminarActionPerformed(evt);
            }
        });

        jButtonprimero.setBackground(new java.awt.Color(87, 88, 187));
        jButtonprimero.setText("<<");
        jButtonprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonprimeroActionPerformed(evt);
            }
        });

        jButtonsiguiente.setBackground(new java.awt.Color(87, 88, 187));
        jButtonsiguiente.setText("<");
        jButtonsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsiguienteActionPerformed(evt);
            }
        });

        jButtonanterior.setBackground(new java.awt.Color(87, 88, 187));
        jButtonanterior.setText(">");
        jButtonanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonanteriorActionPerformed(evt);
            }
        });

        jButtonultimo.setBackground(new java.awt.Color(87, 88, 187));
        jButtonultimo.setText(">>");
        jButtonultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel4))
                                    .addComponent(jButtonprimero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldmail)
                            .addComponent(jTextFieldtel)
                            .addComponent(jTextFieldapellido)
                            .addComponent(jTextFieldnombre)
                            .addComponent(jComboBoxgrupo, 0, 164, Short.MAX_VALUE)
                            .addComponent(jTextFieldid))
                        .addGap(68, 68, 68)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButtonsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButtoneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtoneditar)
                        .addGap(87, 87, 87)
                        .addComponent(jButtonAñadir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(32, 32, 32)
                                .addComponent(jLabelcontacfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonbuscar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabelcontacfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jButtonbuscar)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addGap(106, 106, 106)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtoneliminar)
                                    .addComponent(jButtoneditar)
                                    .addComponent(jButtonAñadir)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldtel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonultimo)
                            .addComponent(jButtonanterior)
                            .addComponent(jButtonsiguiente)
                            .addComponent(jButtonprimero))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //DATOS DE LA TABLA
    public void datostabla(){
        
      consulta_contactos cc = new consulta_contactos(); 
      ArrayList <contactos> cl = cc.lista_contactos(usuarioactualid);
      String[] coln = {"ID","Nombre","Apellido","Grupo","Telefono","Email","Direccion","Foto"};
      Object[][] fila = new Object[cl.size()][8];
      
      for(int i=0; i < cl.size(); i++){
          
          fila[i][0]=cl.get(i).getCid();
           fila[i][1]=cl.get(i).getNombre();
            fila[i][2]=cl.get(i).getApellido();
             fila[i][3]=cl.get(i).getGrupo();
              fila[i][4]=cl.get(i).getTel();
               fila[i][5]=cl.get(i).getEmail();
                fila[i][6]=cl.get(i).getDireccion();
                
                ImageIcon ft = new ImageIcon(new ImageIcon(cl.get(i).getFoto())
                        .getImage().getScaledInstance(70, 40, Image.SCALE_SMOOTH));
                
                fila[i][7]=ft;
      }
       mi_modelo md = new mi_modelo(fila,coln);
        jTable1.setModel(md);
        jTable1.setRowHeight(40);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(70);
        
      
      
    }
    
    
    private void jTextFieldnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnombreActionPerformed

    private void jTextFieldapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldapellidoActionPerformed

    private void jTextFieldtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtelActionPerformed

    private void jTextFieldmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldmailActionPerformed

    private void jButtonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarActionPerformed

       mifuncion mf= new mifuncion();
imagePth= mf.buscar_imagen(jLabelcontacfoto);
System.out.println(imagePth);

    }//GEN-LAST:event_jButtonbuscarActionPerformed
//BOTON AÑADIR
    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        String nombre = jTextFieldnombre.getText();
        String apellido = jTextFieldapellido.getText();
       String tel = jTextFieldtel.getText();
       String direccion = jTextAreadirecc.getText();
       String email = jTextFieldmail.getText();
       String grupo = jComboBoxgrupo.getSelectedItem().toString();
     
       byte[] img=null; 
       if(imagePth !=null){
           
        try {
           Path pth = Paths.get(imagePth);
           img= Files.readAllBytes(pth);
           
             contactos c = new contactos(null,nombre,apellido,grupo,tel,direccion,email,img,usuarioactualid);
        consulta_contactos cc=new consulta_contactos();
        cc.insertar_contactos(c);
        refrescartabla();
         borrartexto();
           
           
        } catch (IOException ex) {
         
        }
    }else{
           
           JOptionPane.showMessageDialog(null, "Debes Seleccionar una Imagen");
       }
      
        
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void mostrardatos(int index){
        
         jTextFieldid.setText(jTable1.getValueAt(index, 0).toString());
       jTextFieldnombre.setText(jTable1.getValueAt(index, 1).toString());
       jTextFieldapellido.setText(jTable1.getValueAt(index, 2).toString());
        jComboBoxgrupo.setSelectedItem(jTable1.getValueAt(index, 3)); 
        jTextFieldtel.setText(jTable1.getValueAt(index, 4).toString()); 
         jTextFieldmail.setText(jTable1.getValueAt(index, 5).toString()); 
       jTextAreadirecc.setText(jTable1.getValueAt(index, 6).toString());
       
       Image foto=((ImageIcon)jTable1.getValueAt(index, 7)).getImage().getScaledInstance(jLabelcontacfoto.getWidth(),jLabelcontacfoto.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon ft= new ImageIcon(foto);
      jLabelcontacfoto.setIcon(ft);
        
    }
    
    
    private void jTextFieldidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldidActionPerformed
//TABLA
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int index=jTable1.getSelectedRow();
        jTextFieldid.setText(jTable1.getValueAt(index, 0).toString());
       jTextFieldnombre.setText(jTable1.getValueAt(index, 1).toString());
       jTextFieldapellido.setText(jTable1.getValueAt(index, 2).toString());
        jComboBoxgrupo.setSelectedItem(jTable1.getValueAt(index, 3)); 
        jTextFieldtel.setText(jTable1.getValueAt(index, 4).toString()); 
         jTextFieldmail.setText(jTable1.getValueAt(index, 5).toString()); 
       jTextAreadirecc.setText(jTable1.getValueAt(index, 6).toString());
       
        Image foto=((ImageIcon)jTable1.getValueAt(index, 7)).getImage().getScaledInstance(jLabelcontacfoto.getWidth(),jLabelcontacfoto.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon ft= new ImageIcon(foto);
      jLabelcontacfoto.setIcon(ft);
       
       
    }//GEN-LAST:event_jTable1MouseClicked
//ACTUALIZAR TABLA
    public void refrescartabla(){
        
        jTable1.setModel(new DefaultTableModel());
        datostabla();
    }
    
    public void borrartexto(){
        jTextFieldid.setText("");
         jTextFieldnombre.setText("");
          jTextFieldapellido.setText("");
           jTextFieldtel.setText("");
            jTextFieldmail.setText("");
             jTextAreadirecc.setText("");
             jComboBoxgrupo.setSelectedIndex(0);
             jLabelcontacfoto.setIcon(null);
            imagePth=null;
         
        
    }
    
    
    //BOTON DE EDITAR
    private void jButtoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditarActionPerformed

        if(!jTextFieldid.getText().equals("") ){
            
        int id = Integer.valueOf(jTextFieldid.getText());
        String nombre = jTextFieldnombre.getText();
        String apellido = jTextFieldapellido.getText();
       String tel = jTextFieldtel.getText();
       String direccion = jTextAreadirecc.getText();
       String email = jTextFieldmail.getText();
       String grupo = jComboBoxgrupo.getSelectedItem().toString();
      
       if(imagePth != null){
           
           byte[] img=null;
          try {
           Path pth = Paths.get(imagePth);
           img= Files.readAllBytes(pth);
           
           
               contactos c = new contactos(id,nombre,apellido,grupo,tel,direccion,email,img,usuarioactualid);
        consulta_contactos cc=new consulta_contactos();
        cc.editar_contactos(c, true);
         refrescartabla(); 
       borrartexto();
        
          }catch (IOException ex) {
            Logger.getLogger(micontactos.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
       }else{
             contactos c = new contactos(id,nombre,apellido,grupo,tel,direccion,email,null,usuarioactualid);
        consulta_contactos cc=new consulta_contactos();
        cc.editar_contactos(c, false);
         refrescartabla();
        borrartexto();
        
       }
    
   }else{
            JOptionPane.showMessageDialog(null, "Seleccciona un Contacto de la Tabla");
            
        }
    }//GEN-LAST:event_jButtoneditarActionPerformed
//BOTON DE ELIMINAR
    private void jButtoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneliminarActionPerformed
      if (! jTextFieldid.getText().equals("")){
       
          int id = Integer.valueOf(jTextFieldid.getText());
       consulta_contactos cc=new consulta_contactos();
       cc.eliminar_contactos(id);
       refrescartabla();
        borrartexto();
          
      }else{
          
          JOptionPane.showMessageDialog(null, "Seleccciona un Contacto de la Tabla");
      }
          
        
    }//GEN-LAST:event_jButtoneliminarActionPerformed

    private void jButtonprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonprimeroActionPerformed
       pos=0;
        mostrardatos(pos); 
    }//GEN-LAST:event_jButtonprimeroActionPerformed

    private void jButtonsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsiguienteActionPerformed
       pos++;
       mostrardatos(pos); 
    }//GEN-LAST:event_jButtonsiguienteActionPerformed

    private void jButtonbuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonbuscar3ActionPerformed

    private void jButtonanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonanteriorActionPerformed
        pos--;
        mostrardatos(pos); 
    }//GEN-LAST:event_jButtonanteriorActionPerformed

    private void jButtonultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonultimoActionPerformed
      pos=jTable1.getRowCount()-1;
         mostrardatos(pos);
    }//GEN-LAST:event_jButtonultimoActionPerformed

    private void LcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LcerrarMouseClicked
       loginform lo=new loginform();
       lo.setVisible(true);
       lo.pack();
       lo.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_LcerrarMouseClicked

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
            java.util.logging.Logger.getLogger(micontactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(micontactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(micontactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(micontactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new micontactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lcerrar;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonanterior;
    private javax.swing.JButton jButtonbuscar;
    private javax.swing.JButton jButtonbuscar3;
    private javax.swing.JButton jButtoneditar;
    private javax.swing.JButton jButtoneliminar;
    private javax.swing.JButton jButtonprimero;
    private javax.swing.JButton jButtonsiguiente;
    private javax.swing.JButton jButtonultimo;
    private javax.swing.JComboBox jComboBoxgrupo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelcontacfoto;
    public javax.swing.JLabel jLabelfotousuario;
    public javax.swing.JLabel jLabelusename;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreadirecc;
    private javax.swing.JTextField jTextFieldapellido;
    private javax.swing.JTextField jTextFieldid;
    private javax.swing.JTextField jTextFieldmail;
    private javax.swing.JTextField jTextFieldnombre;
    private javax.swing.JTextField jTextFieldtel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.google.gson.Gson;
import com.mycompany.rogueapp.aspirantes;
import com.mycompany.rogueapp.users;
import java.awt.Color;
import java.util.List;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import org.apache.log4j.PropertyConfigurator;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.ViewQuery;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

/**
 *
 * @author oscar
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {

        try {
            Properties log4jProp = new Properties();
            log4jProp.setProperty("log4j.rootLogger", "WARN");
            PropertyConfigurator.configure(log4jProp);
//--------------- Creating Connection--------------------------//
            HttpClient httpClient = new StdHttpClient.Builder()
                    .url("http://127.0.0.1:5984")
                    .username("administrator2")
                    .password("123456789")
                    .build();
            dbInstance = new StdCouchDbInstance(httpClient);
        } catch (MalformedURLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
//--------------- Creating database----------------------------//
CouchDbConnector db = new StdCouchDbConnector("aspirantes", dbInstance);
db.createDatabaseIfNotExists();
//--------------- Creating Document----------------------------//
String date = new Date().toString();
aspirantes Aspi = new aspirantes("gisselle", "1517199500614", "gisselle", "dilcia", "lagos", "doblado", date, "Ricardo");
//   DesignDocument dd = new DesignDocument("light");
// db.create(Aspi);

        
//--------------- Reatriving Documents ---------------------------//
List<String> docIds = db.getAllDocIds();
Gson gson = new Gson();
ViewQuery q = new ViewQuery().allDocs().includeDocs(true).keys(docIds);
ArrayList<aspirantes> listAspirantes = new ArrayList();
for (int i = 0; i < db.queryView(q).getRows().size(); i++) {
System.out.println(db.queryView(q).getRows().get(i).getDoc());
listAspirantes.add(gson.fromJson(db.queryView(q).getRows().get(i).getDoc(), aspirantes.class));
}
for (int i = 0; i < listAspirantes.size(); i++) {
System.out.println(listAspirantes.get(i));
}
//------------------------------ delete data -------------------//
System.out.println(listAspirantes.get(0).getId() + " " + listAspirantes.get(0).getRevision());
//    db.delete(listAspirantes.get(0).getId(),listAspirantes.get(0).getRevision());

//----------------------------- update data--------------------//

aspirantes Aspi2 = new aspirantes(listAspirantes.get(0).getId(),listAspirantes.get(0).getRevision(),"Madrina", "1517199500614", "gisselle", "dilcia", "lagos", "doblado", date, "Ricardo");
Aspi=Aspi2;

db.update(Aspi);
Aspi.getRevision();

         */

        initComponents();

//C:\Users\oscar\Documents\NetBeansProjects\Rogue\src\main\java\imgs\Black-Wallpaper-1080-12.jpg
//C:\Users\oscar\Documents\NetBeansProjects\Rogue\src\main\java\views\login.java
        label_Employee.setIcon(new ImageIcon("src/main/java/imgs/buttonEmployee.png"));
        label_agency.setIcon(new ImageIcon("src/main/java/imgs/buttonAgency.png"));
        label_logout.setIcon(new ImageIcon("src/main/java/imgs/logOut.png"));
        label_fondo.setIcon(new ImageIcon("src/main/java/imgs/rogueLogo.png"));
        jLabel18.setIcon(new ImageIcon("src/main/java/imgs/volver.png"));
        jLabel9.setIcon(new ImageIcon("src/main/java/imgs/logOut.png"));
        back5.setIcon(new ImageIcon("src/main/java/imgs/back.png"));
        jLabel11.setIcon(new ImageIcon("src/main/java/imgs/wallpaper.png"));
        back6.setIcon(new ImageIcon("src/main/java/imgs/back.png"));
        jLabel14.setIcon(new ImageIcon("src/main/java/imgs/logOut.png"));
        jLabel16.setIcon(new ImageIcon("src/main/java/imgs/wallpaper.png"));
        jLabel17.setIcon(new ImageIcon("src/main/java/imgs/volver.png"));
        jLabel1.setIcon(new ImageIcon("src/main/java/imgs/rogueLogo.png"));
        errorLogin.setVisible(false);
        tf_pwd.setBackground(new Color(0, 0, 0, 0));
        tf_user.setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);

        tf_name.setBackground(new Color(0, 0, 0, 0));
        tf_desc.setBackground(new Color(0, 0, 0, 0));
        tf_rtn.setBackground(new Color(0, 0, 0, 0));
        tf_address.setBackground(new Color(0, 0, 0, 0));
        tf_tel.setBackground(new Color(0, 0, 0, 0));
        tf_director.setBackground(new Color(0, 0, 0, 0));
        tf_pass.setBackground(new Color(0, 0, 0, 0));
        tf_email.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        label_Employee = new javax.swing.JLabel();
        label_logout = new javax.swing.JLabel();
        label_agency = new javax.swing.JLabel();
        label_fondo = new javax.swing.JLabel();
        agencies = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        scrollPane_agencies = new javax.swing.JScrollPane();
        table_agencies = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        newAgency = new javax.swing.JDialog();
        panel_Rep = new javax.swing.JPanel();
        AddRep = new javax.swing.JLabel();
        tf_address = new javax.swing.JTextField();
        tf_director = new javax.swing.JFormattedTextField();
        label_descRep = new javax.swing.JLabel();
        label_proveedor = new javax.swing.JLabel();
        label_numParte = new javax.swing.JLabel();
        tf_rtn = new javax.swing.JTextField();
        label_marca = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_tel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        back5 = new javax.swing.JLabel();
        label_marca2 = new javax.swing.JLabel();
        tf_desc = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        label_Rep2 = new javax.swing.JLabel();
        label_name3 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JTextField();
        label_proveedor2 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        newAgency1 = new javax.swing.JDialog();
        panel_Rep1 = new javax.swing.JPanel();
        AddRep1 = new javax.swing.JLabel();
        tf_director1 = new javax.swing.JFormattedTextField();
        label_descRep1 = new javax.swing.JLabel();
        label_proveedor1 = new javax.swing.JLabel();
        label_numParte1 = new javax.swing.JLabel();
        label_marca1 = new javax.swing.JLabel();
        tf_lastname2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        back6 = new javax.swing.JLabel();
        label_marca3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        label_Rep3 = new javax.swing.JLabel();
        label_name4 = new javax.swing.JLabel();
        tf_pass1 = new javax.swing.JTextField();
        label_proveedor3 = new javax.swing.JLabel();
        tf_email1 = new javax.swing.JTextField();
        tf_name1 = new javax.swing.JTextField();
        tf_lastname1 = new javax.swing.JTextField();
        tf_name2 = new javax.swing.JTextField();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        agencies1 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        scrollPane_agencies1 = new javax.swing.JScrollPane();
        table_agencies1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_pwd = new javax.swing.JTextField();
        tf_user = new javax.swing.JTextField();
        errorLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame2.setUndecorated(true);

        jPanel3.setLayout(null);

        label_Employee.setBackground(new java.awt.Color(255, 51, 51));
        label_Employee.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label_Employee.setForeground(new java.awt.Color(255, 255, 255));
        label_Employee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_EmployeeMouseClicked(evt);
            }
        });
        jPanel3.add(label_Employee);
        label_Employee.setBounds(710, 270, 240, 250);

        label_logout.setBackground(new java.awt.Color(255, 51, 51));
        label_logout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label_logout.setForeground(new java.awt.Color(255, 255, 255));
        label_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_logoutMouseClicked(evt);
            }
        });
        jPanel3.add(label_logout);
        label_logout.setBounds(1120, 20, 110, 70);

        label_agency.setBackground(new java.awt.Color(255, 51, 51));
        label_agency.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label_agency.setForeground(new java.awt.Color(255, 255, 255));
        label_agency.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_agency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_agencyMouseClicked(evt);
            }
        });
        jPanel3.add(label_agency);
        label_agency.setBounds(320, 270, 240, 250);
        jPanel3.add(label_fondo);
        label_fondo.setBounds(0, 0, 1260, 680);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        agencies.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        agencies.setUndecorated(true);

        jPanel4.setLayout(null);

        table_agencies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RTN", "Nombre", "Email", "Teléfono", "Detalles", "Eliminar"
            }
        ));
        scrollPane_agencies.setViewportView(table_agencies);

        jPanel4.add(scrollPane_agencies);
        scrollPane_agencies.setBounds(100, 200, 1010, 402);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(100, 170, 1010, 10);

        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18);
        jLabel18.setBounds(30, 30, 0, 0);

        jLabel8.setBackground(new java.awt.Color(255, 51, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  + Nueva Agencia");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8);
        jLabel8.setBounds(970, 110, 140, 30);

        jLabel9.setBackground(new java.awt.Color(255, 51, 51));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9);
        jLabel9.setBounds(1120, 20, 110, 70);

        jLabel10.setBackground(new java.awt.Color(255, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Agencias");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel10);
        jLabel10.setBounds(100, 100, 180, 50);
        jPanel4.add(jLabel11);
        jLabel11.setBounds(0, 0, 1260, 680);

        javax.swing.GroupLayout agenciesLayout = new javax.swing.GroupLayout(agencies.getContentPane());
        agencies.getContentPane().setLayout(agenciesLayout);
        agenciesLayout.setHorizontalGroup(
            agenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        agenciesLayout.setVerticalGroup(
            agenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        newAgency.setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        newAgency.setUndecorated(true);

        panel_Rep.setBackground(new java.awt.Color(0, 0, 0));
        panel_Rep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panel_Rep.setLayout(null);

        AddRep.setBackground(new java.awt.Color(255, 51, 51));
        AddRep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddRep.setForeground(new java.awt.Color(255, 255, 255));
        AddRep.setText("           Aceptar");
        AddRep.setOpaque(true);
        AddRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddRepMouseClicked(evt);
            }
        });
        panel_Rep.add(AddRep);
        AddRep.setBounds(440, 320, 145, 34);

        tf_address.setForeground(new java.awt.Color(255, 255, 255));
        tf_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addressActionPerformed(evt);
            }
        });
        panel_Rep.add(tf_address);
        tf_address.setBounds(300, 150, 210, 33);

        tf_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_director.setForeground(new java.awt.Color(255, 255, 255));
        tf_director.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00;(¤#,##0.00)"))));
        tf_director.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_director.setVerifyInputWhenFocusTarget(false);
        tf_director.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_directorKeyTyped(evt);
            }
        });
        panel_Rep.add(tf_director);
        tf_director.setBounds(640, 200, 150, 31);

        label_descRep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_descRep.setForeground(new java.awt.Color(255, 255, 255));
        label_descRep.setText("Dirección");
        panel_Rep.add(label_descRep);
        label_descRep.setBounds(210, 160, 80, 17);

        label_proveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_proveedor.setForeground(new java.awt.Color(255, 255, 255));
        label_proveedor.setText("Director");
        panel_Rep.add(label_proveedor);
        label_proveedor.setBounds(570, 210, 50, 17);

        label_numParte.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_numParte.setForeground(new java.awt.Color(255, 255, 255));
        label_numParte.setText("RTN");
        panel_Rep.add(label_numParte);
        label_numParte.setBounds(560, 110, 40, 16);

        tf_rtn.setForeground(new java.awt.Color(255, 255, 255));
        tf_rtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_rtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_rtnActionPerformed(evt);
            }
        });
        tf_rtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_rtnKeyTyped(evt);
            }
        });
        panel_Rep.add(tf_rtn);
        tf_rtn.setBounds(610, 100, 180, 31);

        label_marca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_marca.setForeground(new java.awt.Color(255, 255, 255));
        label_marca.setText("Nombre");
        panel_Rep.add(label_marca);
        label_marca.setBounds(220, 110, 60, 17);

        tf_name.setForeground(new java.awt.Color(255, 255, 255));
        tf_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        panel_Rep.add(tf_name);
        tf_name.setBounds(290, 100, 220, 31);

        tf_tel.setForeground(new java.awt.Color(255, 255, 255));
        tf_tel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_telKeyTyped(evt);
            }
        });
        panel_Rep.add(tf_tel);
        tf_tel.setBounds(640, 150, 150, 31);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción");
        panel_Rep.add(jLabel3);
        jLabel3.setBounds(500, 260, 90, 16);

        back5.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        back5.setForeground(new java.awt.Color(153, 153, 153));
        back5.setToolTipText("");
        back5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back5MouseClicked(evt);
            }
        });
        panel_Rep.add(back5);
        back5.setBounds(960, 30, 30, 30);

        label_marca2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_marca2.setForeground(new java.awt.Color(255, 255, 255));
        label_marca2.setText("Contraseña");
        panel_Rep.add(label_marca2);
        label_marca2.setBounds(210, 260, 80, 17);

        tf_desc.setForeground(new java.awt.Color(255, 255, 255));
        tf_desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        panel_Rep.add(tf_desc);
        tf_desc.setBounds(600, 250, 190, 31);
        panel_Rep.add(jSeparator3);
        jSeparator3.setBounds(210, 80, 580, 10);

        label_Rep2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        label_Rep2.setForeground(new java.awt.Color(255, 255, 255));
        label_Rep2.setText("Nueva Agencia");
        panel_Rep.add(label_Rep2);
        label_Rep2.setBounds(210, 50, 150, 23);

        label_name3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_name3.setForeground(new java.awt.Color(255, 255, 255));
        label_name3.setText("Correo electrónico");
        panel_Rep.add(label_name3);
        label_name3.setBounds(210, 210, 130, 17);

        tf_pass.setForeground(new java.awt.Color(255, 255, 255));
        tf_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_pass.setVerifyInputWhenFocusTarget(false);
        tf_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passActionPerformed(evt);
            }
        });
        tf_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_passKeyTyped(evt);
            }
        });
        panel_Rep.add(tf_pass);
        tf_pass.setBounds(310, 250, 170, 31);

        label_proveedor2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_proveedor2.setForeground(new java.awt.Color(255, 255, 255));
        label_proveedor2.setText("Teléfono");
        panel_Rep.add(label_proveedor2);
        label_proveedor2.setBounds(560, 160, 80, 17);

        tf_email.setForeground(new java.awt.Color(255, 255, 255));
        tf_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_email.setVerifyInputWhenFocusTarget(false);
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });
        tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_emailKeyTyped(evt);
            }
        });
        panel_Rep.add(tf_email);
        tf_email.setBounds(340, 200, 170, 31);

        javax.swing.GroupLayout newAgencyLayout = new javax.swing.GroupLayout(newAgency.getContentPane());
        newAgency.getContentPane().setLayout(newAgencyLayout);
        newAgencyLayout.setHorizontalGroup(
            newAgencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Rep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        newAgencyLayout.setVerticalGroup(
            newAgencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Rep, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        newAgency1.setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        newAgency1.setUndecorated(true);

        panel_Rep1.setBackground(new java.awt.Color(0, 0, 0));
        panel_Rep1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panel_Rep1.setLayout(null);

        AddRep1.setBackground(new java.awt.Color(255, 51, 51));
        AddRep1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddRep1.setForeground(new java.awt.Color(255, 255, 255));
        AddRep1.setText("           Aceptar");
        AddRep1.setOpaque(true);
        AddRep1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddRep1MouseClicked(evt);
            }
        });
        panel_Rep1.add(AddRep1);
        AddRep1.setBounds(440, 320, 145, 34);

        tf_director1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_director1.setForeground(new java.awt.Color(255, 255, 255));
        tf_director1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00;(¤#,##0.00)"))));
        tf_director1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf_director1.setVerifyInputWhenFocusTarget(false);
        tf_director1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_director1KeyTyped(evt);
            }
        });
        panel_Rep1.add(tf_director1);
        tf_director1.setBounds(650, 200, 140, 31);

        label_descRep1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_descRep1.setForeground(new java.awt.Color(255, 255, 255));
        label_descRep1.setText("Primer Apellido");
        panel_Rep1.add(label_descRep1);
        label_descRep1.setBounds(210, 160, 100, 17);

        label_proveedor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_proveedor1.setForeground(new java.awt.Color(255, 255, 255));
        label_proveedor1.setText("N° de ID");
        panel_Rep1.add(label_proveedor1);
        label_proveedor1.setBounds(580, 210, 60, 17);

        label_numParte1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_numParte1.setForeground(new java.awt.Color(255, 255, 255));
        label_numParte1.setText("Segundo Nombre");
        panel_Rep1.add(label_numParte1);
        label_numParte1.setBounds(520, 110, 120, 16);

        label_marca1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_marca1.setForeground(new java.awt.Color(255, 255, 255));
        label_marca1.setText("Primer Nombre");
        panel_Rep1.add(label_marca1);
        label_marca1.setBounds(210, 110, 100, 17);

        tf_lastname2.setForeground(new java.awt.Color(255, 255, 255));
        tf_lastname2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        panel_Rep1.add(tf_lastname2);
        tf_lastname2.setBounds(650, 150, 140, 31);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha de nacimiento");
        panel_Rep1.add(jLabel12);
        jLabel12.setBounds(500, 260, 140, 16);

        back6.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        back6.setForeground(new java.awt.Color(153, 153, 153));
        back6.setToolTipText("");
        back6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back6MouseClicked(evt);
            }
        });
        panel_Rep1.add(back6);
        back6.setBounds(960, 30, 30, 30);

        label_marca3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_marca3.setForeground(new java.awt.Color(255, 255, 255));
        label_marca3.setText("Contraseña");
        panel_Rep1.add(label_marca3);
        label_marca3.setBounds(210, 260, 80, 17);
        panel_Rep1.add(jSeparator4);
        jSeparator4.setBounds(210, 80, 580, 10);

        label_Rep3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        label_Rep3.setForeground(new java.awt.Color(255, 255, 255));
        label_Rep3.setText("Nuevo Aspirante");
        panel_Rep1.add(label_Rep3);
        label_Rep3.setBounds(210, 50, 150, 23);

        label_name4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_name4.setForeground(new java.awt.Color(255, 255, 255));
        label_name4.setText("Correo electrónico");
        panel_Rep1.add(label_name4);
        label_name4.setBounds(210, 210, 130, 17);

        tf_pass1.setForeground(new java.awt.Color(255, 255, 255));
        tf_pass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_pass1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_pass1.setVerifyInputWhenFocusTarget(false);
        tf_pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pass1ActionPerformed(evt);
            }
        });
        tf_pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_pass1KeyTyped(evt);
            }
        });
        panel_Rep1.add(tf_pass1);
        tf_pass1.setBounds(310, 250, 170, 31);

        label_proveedor3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_proveedor3.setForeground(new java.awt.Color(255, 255, 255));
        label_proveedor3.setText("Segundo Apellido");
        panel_Rep1.add(label_proveedor3);
        label_proveedor3.setBounds(520, 160, 120, 17);

        tf_email1.setForeground(new java.awt.Color(255, 255, 255));
        tf_email1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        tf_email1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_email1.setVerifyInputWhenFocusTarget(false);
        tf_email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_email1ActionPerformed(evt);
            }
        });
        tf_email1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_email1KeyTyped(evt);
            }
        });
        panel_Rep1.add(tf_email1);
        tf_email1.setBounds(340, 200, 140, 31);

        tf_name1.setForeground(new java.awt.Color(255, 255, 255));
        tf_name1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        panel_Rep1.add(tf_name1);
        tf_name1.setBounds(330, 100, 150, 31);

        tf_lastname1.setForeground(new java.awt.Color(255, 255, 255));
        tf_lastname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        panel_Rep1.add(tf_lastname1);
        tf_lastname1.setBounds(330, 150, 150, 31);

        tf_name2.setForeground(new java.awt.Color(255, 255, 255));
        tf_name2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        panel_Rep1.add(tf_name2);
        tf_name2.setBounds(650, 100, 140, 31);
        panel_Rep1.add(dateChooserCombo1);
        dateChooserCombo1.setBounds(645, 250, 150, 31);

        javax.swing.GroupLayout newAgency1Layout = new javax.swing.GroupLayout(newAgency1.getContentPane());
        newAgency1.getContentPane().setLayout(newAgency1Layout);
        newAgency1Layout.setHorizontalGroup(
            newAgency1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Rep1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        newAgency1Layout.setVerticalGroup(
            newAgency1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Rep1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        agencies1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        agencies1.setUndecorated(true);

        jPanel5.setLayout(null);

        table_agencies1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Email", "Teléfono", "Detalles", "Eliminar"
            }
        ));
        scrollPane_agencies1.setViewportView(table_agencies1);

        jPanel5.add(scrollPane_agencies1);
        scrollPane_agencies1.setBounds(100, 200, 1010, 402);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(100, 170, 1010, 10);

        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel17);
        jLabel17.setBounds(30, 30, 110, 0);

        jLabel13.setBackground(new java.awt.Color(255, 51, 51));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("  + Nuevo Aplicante");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel13);
        jLabel13.setBounds(970, 110, 140, 30);

        jLabel14.setBackground(new java.awt.Color(255, 51, 51));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel14);
        jLabel14.setBounds(1120, 20, 110, 70);

        jLabel15.setBackground(new java.awt.Color(255, 51, 51));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Aplicantes");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel15);
        jLabel15.setBounds(100, 100, 220, 50);
        jPanel5.add(jLabel16);
        jLabel16.setBounds(0, 0, 1260, 680);

        javax.swing.GroupLayout agencies1Layout = new javax.swing.GroupLayout(agencies1.getContentPane());
        agencies1.getContentPane().setLayout(agencies1Layout);
        agencies1Layout.setHorizontalGroup(
            agencies1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        agencies1Layout.setVerticalGroup(
            agencies1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        tf_pwd.setForeground(new java.awt.Color(255, 255, 255));
        tf_pwd.setText("  Password");
        tf_pwd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        tf_pwd.setOpaque(false);
        tf_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pwdMouseClicked(evt);
            }
        });
        tf_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pwdActionPerformed(evt);
            }
        });
        jPanel1.add(tf_pwd);
        tf_pwd.setBounds(460, 380, 340, 40);

        tf_user.setForeground(new java.awt.Color(255, 255, 255));
        tf_user.setText("  Username");
        tf_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        tf_user.setOpaque(false);
        tf_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_userMouseClicked(evt);
            }
        });
        tf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_userActionPerformed(evt);
            }
        });
        tf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_userKeyTyped(evt);
            }
        });
        jPanel1.add(tf_user);
        tf_user.setBounds(460, 310, 340, 40);

        errorLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errorLogin.setForeground(new java.awt.Color(255, 51, 51));
        errorLogin.setText("    Usuario o contraseña incorrecta");
        jPanel1.add(errorLogin);
        errorLogin.setBounds(460, 260, 340, 30);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                     LOG IN");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 450, 340, 40);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pwdActionPerformed

    private void tf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_userActionPerformed

    private void tf_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_userKeyTyped

    }//GEN-LAST:event_tf_userKeyTyped

    private void tf_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_userMouseClicked
        if (tf_user.getText().contains("Username")) {
            tf_user.setText("");
        }

        if (tf_pwd.getText().contains("")) {
            tf_pwd.setText("  Password");
        }
    }//GEN-LAST:event_tf_userMouseClicked

    private void tf_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pwdMouseClicked
        if (tf_pwd.getText().contains("Password")) {
            tf_pwd.setText("");
        }

        if (tf_user.getText().equals("")) {
            tf_user.setText("  Username");
        }

    }//GEN-LAST:event_tf_pwdMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        CouchDbConnector db = new StdCouchDbConnector("users", dbInstance);

        List<String> docIds = db.getAllDocIds();
        Gson gson = new Gson();
        ViewQuery q = new ViewQuery().allDocs().includeDocs(true).keys(docIds);
        ArrayList<users> listUsers = new ArrayList();
        for (int i = 0; i < db.queryView(q).getRows().size(); i++) {
            System.out.println(db.queryView(q).getRows().get(i).getDoc());
            listUsers.add(gson.fromJson(db.queryView(q).getRows().get(i).getDoc(), users.class));
        }
        for (int i = 0; i < listUsers.size(); i++) {
            if (this.tf_user.getText().equals(listUsers.get(i).getUsername()) && this.tf_pwd.getText().equals(listUsers.get(i).getPassword())) {
                System.out.println("entro");
                jFrame2.pack();
                jFrame2.setLocationRelativeTo(null);
                jFrame2.setVisible(true);
                this.setVisible(false);
            } else {
                System.out.println("no entro");
            }

        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void label_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_logoutMouseClicked
        jFrame2.dispose();
    }//GEN-LAST:event_label_logoutMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void AddRepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddRepMouseClicked
        boolean error = false;

        if (tf_address.getText().equals("")) {
            tf_address.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        if (tf_director.getText().equals("")) {
            tf_director.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        if (tf_name.getText().equals("")) {
            tf_name.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        if (tf_tel.getText().equals("")) {
            tf_tel.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        //error Missing NumPart
        if (tf_rtn.getText().equals("")) {
            tf_rtn.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        //error Missing num Fact
        if (tf_pass.getText().equals("")) {
            tf_pass.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        // error misssing marca
        if (tf_desc.getText().equals("")) {
            tf_desc.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }


    }//GEN-LAST:event_AddRepMouseClicked

    private void tf_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_addressActionPerformed

    private void tf_directorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_directorKeyTyped
    }//GEN-LAST:event_tf_directorKeyTyped

    private void tf_rtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_rtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_rtnActionPerformed

    private void back5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back5MouseClicked
        newAgency.setVisible(false);
        newAgency.dispose();
        scrollPane_agencies.setVisible(true);
    }//GEN-LAST:event_back5MouseClicked

    private void tf_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passActionPerformed

    private void tf_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        newAgency.setSize(scrollPane_agencies.getSize());
        newAgency.setLocationRelativeTo(scrollPane_agencies);
        scrollPane_agencies.setVisible(false);
        panel_Rep.setBackground(new Color(0, 0, 0, 0));
        newAgency.setBackground(new Color(0, 0, 0, 0));
        newAgency.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void label_agencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_agencyMouseClicked
        agencies.pack();
        agencies.setLocationRelativeTo(jFrame2);
        agencies.setVisible(true);
    }//GEN-LAST:event_label_agencyMouseClicked

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    private void tf_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailKeyTyped

    private void tf_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_telKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }

        if (tf_tel.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_telKeyTyped

    private void tf_rtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_rtnKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }

        if (tf_rtn.getText().length() == 14) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_rtnKeyTyped

    private void AddRep1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddRep1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddRep1MouseClicked

    private void tf_director1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_director1KeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }

        if (tf_rtn.getText().length() == 13) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_director1KeyTyped

    private void back6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back6MouseClicked
        newAgency1.setVisible(false);
        newAgency1.dispose();
        scrollPane_agencies.setVisible(true);
    }//GEN-LAST:event_back6MouseClicked

    private void tf_pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pass1ActionPerformed

    private void tf_pass1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pass1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pass1KeyTyped

    private void tf_email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_email1ActionPerformed

    private void tf_email1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_email1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_email1KeyTyped

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        newAgency1.setSize(scrollPane_agencies1.getSize());
        newAgency1.setLocationRelativeTo(scrollPane_agencies1);
        scrollPane_agencies1.setVisible(false);
        panel_Rep1.setBackground(new Color(0, 0, 0, 0));
        newAgency1.setBackground(new Color(0, 0, 0, 0));
        newAgency1.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        agencies1.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        agencies.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void label_EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_EmployeeMouseClicked
        agencies.pack();
        agencies.setLocationRelativeTo(jFrame2);
        agencies.setVisible(true);
    }//GEN-LAST:event_label_EmployeeMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddRep;
    private javax.swing.JLabel AddRep1;
    private javax.swing.JFrame agencies;
    private javax.swing.JFrame agencies1;
    private javax.swing.JLabel back5;
    private javax.swing.JLabel back6;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JLabel errorLogin;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label_Employee;
    private javax.swing.JLabel label_Rep2;
    private javax.swing.JLabel label_Rep3;
    private javax.swing.JLabel label_agency;
    private javax.swing.JLabel label_descRep;
    private javax.swing.JLabel label_descRep1;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel label_logout;
    private javax.swing.JLabel label_marca;
    private javax.swing.JLabel label_marca1;
    private javax.swing.JLabel label_marca2;
    private javax.swing.JLabel label_marca3;
    private javax.swing.JLabel label_name3;
    private javax.swing.JLabel label_name4;
    private javax.swing.JLabel label_numParte;
    private javax.swing.JLabel label_numParte1;
    private javax.swing.JLabel label_proveedor;
    private javax.swing.JLabel label_proveedor1;
    private javax.swing.JLabel label_proveedor2;
    private javax.swing.JLabel label_proveedor3;
    private javax.swing.JDialog newAgency;
    private javax.swing.JDialog newAgency1;
    private javax.swing.JPanel panel_Rep;
    private javax.swing.JPanel panel_Rep1;
    private javax.swing.JScrollPane scrollPane_agencies;
    private javax.swing.JScrollPane scrollPane_agencies1;
    private javax.swing.JTable table_agencies;
    private javax.swing.JTable table_agencies1;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_desc;
    private javax.swing.JFormattedTextField tf_director;
    private javax.swing.JFormattedTextField tf_director1;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_email1;
    private javax.swing.JTextField tf_lastname1;
    private javax.swing.JTextField tf_lastname2;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_name1;
    private javax.swing.JTextField tf_name2;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_pass1;
    private javax.swing.JTextField tf_pwd;
    private javax.swing.JTextField tf_rtn;
    private javax.swing.JTextField tf_tel;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
    CouchDbInstance dbInstance;
}

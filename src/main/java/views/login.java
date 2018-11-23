/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.google.gson.Gson;
import com.mycompany.rogueapp.agencia;
import com.mycompany.rogueapp.grados_academicos;
import com.mycompany.rogueapp.puesto;
import com.mycompany.rogueapp.users;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
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
 * @author Ricardo
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public login() {
        try {
            initComponents();

            errorLog.setVisible(false);
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

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminView = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        aspirantesView = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel77 = new javax.swing.JLabel();
        createAspirante_adminView = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_primerApellido = new javax.swing.JTextField();
        sp_month = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sp_day = new javax.swing.JSpinner();
        pf_passwordAspirante = new javax.swing.JPasswordField();
        tf_segundoNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_primerNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_usernameAspirante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_segundoApellido = new javax.swing.JTextField();
        sp_year = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        tf_identidad = new javax.swing.JTextField();
        volver = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        viewAgencias = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jb_openCreateAgency = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        viewAgenciesTable = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        createAgencies = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tf_createAgencyName = new javax.swing.JTextField();
        tf_createAgencyEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_createAgencyDirector = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_createAgencyDescription = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        tf_createAgencyRTN = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_createAgencyAddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jp_createAgencyPassword = new javax.swing.JPasswordField();
        tf_createAgencyPhone = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jb_createAgency = new javax.swing.JButton();
        createAgency = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        createPuestos = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_createIdPuesto = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cb_createRangoJerarquico = new javax.swing.JComboBox();
        cb_createRangoSalarial = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cb_createTipoPlaza = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        sp_createCantidadPlazas = new javax.swing.JSpinner();
        cb_createPuestoVacante = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        createPuesto = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        updateAspiranteData = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel84 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel45 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        cb_createRangoJerarquico1 = new javax.swing.JComboBox();
        cb_createMinRangoSalarial = new javax.swing.JComboBox();
        cb_createTipoPlaza1 = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel86 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel87 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        viewDegree = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        viewDegree1 = new javax.swing.JTable();
        jLabel60 = new javax.swing.JLabel();
        cb_nivelGradoAcademico = new javax.swing.JComboBox();
        tf_gradoAcademico = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jb_openCreateDegree = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        viewPuestos = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        viewPuestosTable = new javax.swing.JTable();
        crearNuevoPuesto = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        buscarPuestos = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        viewPuestosAspirante = new javax.swing.JTable();
        jLabel63 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel96 = new javax.swing.JLabel();
        createAdmin = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tf_usernameAdmin = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        pf_usernamePassword = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        crearAdminUser = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username_login = new javax.swing.JTextField();
        password_login = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        errorLog = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();

        jPanel3.setLayout(null);

        jButton16.setText("Cerrar Sesion");
        jPanel3.add(jButton16);
        jButton16.setBounds(630, 120, 111, 25);

        jButton15.setText("Grados Academicos");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel3.add(jButton15);
        jButton15.setBounds(470, 120, 145, 25);

        jButton14.setText("Super Administradores");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel3.add(jButton14);
        jButton14.setBounds(290, 120, 163, 25);

        jButton13.setText("Aspirantes");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel3.add(jButton13);
        jButton13.setBounds(190, 120, 93, 25);

        jButton12.setText("Agencias");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel3.add(jButton12);
        jButton12.setBounds(200, 170, 83, 25);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonAgency.png"))); // NOI18N
        jLabel73.setToolTipText("");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel73);
        jLabel73.setBounds(130, 330, 241, 242);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admins.png"))); // NOI18N
        jLabel74.setText("jLabel73");
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel74);
        jLabel74.setBounds(910, 330, 250, 240);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonEmployee.png"))); // NOI18N
        jPanel3.add(jLabel75);
        jLabel75.setBounds(390, 330, 241, 242);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonAcaemics.png"))); // NOI18N
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel76);
        jLabel76.setBounds(650, 330, 242, 242);

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logOut.png"))); // NOI18N
        logOut.setText("jLabel77");
        jPanel3.add(logOut);
        logOut.setBounds(1113, 30, 120, 50);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jLabel71.setText("jLabel71");
        jPanel3.add(jLabel71);
        jLabel71.setBounds(0, 0, 1270, 740);

        javax.swing.GroupLayout adminViewLayout = new javax.swing.GroupLayout(adminView.getContentPane());
        adminView.getContentPane().setLayout(adminViewLayout);
        adminViewLayout.setHorizontalGroup(
            adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminViewLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        adminViewLayout.setVerticalGroup(
            adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminViewLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setLayout(null);

        jButton1.setText("Crear Aspirante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(920, 260, 123, 25);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Nombre", "Fecha Nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(270, 380, 770, 270);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Aspirantes");
        jPanel4.add(jLabel79);
        jLabel79.setBounds(270, 290, 140, 40);

        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText(" + Crear Aspirante");
        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(jLabel78);
        jLabel78.setBounds(920, 300, 120, 30);
        jPanel4.add(jSeparator7);
        jSeparator7.setBounds(270, 350, 770, 20);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jLabel77.setToolTipText("");
        jPanel4.add(jLabel77);
        jLabel77.setBounds(0, 0, 1250, 760);

        javax.swing.GroupLayout aspirantesViewLayout = new javax.swing.GroupLayout(aspirantesView.getContentPane());
        aspirantesView.getContentPane().setLayout(aspirantesViewLayout);
        aspirantesViewLayout.setHorizontalGroup(
            aspirantesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        aspirantesViewLayout.setVerticalGroup(
            aspirantesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contraseña");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(690, 410, 70, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo Electrónico");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 415, 120, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Primer Apellido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 370, 90, 17);

        tf_primerApellido.setBackground(new java.awt.Color(0, 0, 0));
        tf_primerApellido.setForeground(new java.awt.Color(255, 255, 255));
        tf_primerApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_primerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_primerApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_primerApellido);
        tf_primerApellido.setBounds(440, 370, 168, 30);

        sp_month.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(sp_month);
        sp_month.setBounds(620, 460, 45, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Año");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(690, 460, 24, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mes");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(580, 460, 23, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dia");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(480, 460, 19, 17);

        sp_day.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        sp_day.setMaximumSize(new java.awt.Dimension(31, 31));
        sp_day.setMinimumSize(new java.awt.Dimension(1, 1));
        sp_day.setName(""); // NOI18N
        jPanel1.add(sp_day);
        sp_day.setBounds(510, 460, 45, 22);

        pf_passwordAspirante.setBackground(new java.awt.Color(0, 0, 0));
        pf_passwordAspirante.setForeground(new java.awt.Color(255, 255, 255));
        pf_passwordAspirante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(pf_passwordAspirante);
        pf_passwordAspirante.setBounds(788, 410, 190, 30);

        tf_segundoNombre.setBackground(new java.awt.Color(0, 0, 0));
        tf_segundoNombre.setForeground(new java.awt.Color(255, 255, 255));
        tf_segundoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(tf_segundoNombre);
        tf_segundoNombre.setBounds(790, 330, 186, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Segundo Nombre");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(650, 330, 108, 17);

        tf_primerNombre.setBackground(new java.awt.Color(0, 0, 0));
        tf_primerNombre.setForeground(new java.awt.Color(255, 255, 255));
        tf_primerNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(tf_primerNombre);
        tf_primerNombre.setBounds(440, 330, 168, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primer Nombre");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 330, 92, 17);

        tf_usernameAspirante.setBackground(new java.awt.Color(0, 0, 0));
        tf_usernameAspirante.setForeground(new java.awt.Color(255, 255, 255));
        tf_usernameAspirante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(tf_usernameAspirante);
        tf_usernameAspirante.setBounds(458, 410, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Segundo Apellido");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(650, 370, 104, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha De nacimiento");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(330, 460, 127, 17);

        tf_segundoApellido.setBackground(new java.awt.Color(0, 0, 0));
        tf_segundoApellido.setForeground(new java.awt.Color(255, 255, 255));
        tf_segundoApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(tf_segundoApellido);
        tf_segundoApellido.setBounds(790, 370, 186, 30);

        sp_year.setModel(new javax.swing.SpinnerNumberModel(2018, 1900, 9999, 1));
        jPanel1.add(sp_year);
        sp_year.setBounds(730, 460, 78, 22);

        jButton3.setText("Regresar");
        jPanel1.add(jButton3);
        jButton3.setBounds(1140, 20, 85, 25);

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Número de Identidad");
        jPanel1.add(jLabel67);
        jLabel67.setBounds(330, 510, 150, 30);

        jLabel69.setBackground(new java.awt.Color(255, 51, 51));
        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("   Agregar Aspirante");
        jLabel69.setOpaque(true);
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel69);
        jLabel69.setBounds(540, 590, 160, 30);

        tf_identidad.setBackground(new java.awt.Color(0, 0, 0));
        tf_identidad.setForeground(new java.awt.Color(255, 255, 255));
        tf_identidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_identidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_identidadActionPerformed(evt);
            }
        });
        jPanel1.add(tf_identidad);
        tf_identidad.setBounds(470, 510, 140, 30);

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volver.png"))); // NOI18N
        jPanel1.add(volver);
        volver.setBounds(30, 30, 120, 40);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel1.add(jLabel68);
        jLabel68.setBounds(0, 0, 1260, 760);

        javax.swing.GroupLayout createAspirante_adminViewLayout = new javax.swing.GroupLayout(createAspirante_adminView.getContentPane());
        createAspirante_adminView.getContentPane().setLayout(createAspirante_adminViewLayout);
        createAspirante_adminViewLayout.setHorizontalGroup(
            createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1257, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        createAspirante_adminViewLayout.setVerticalGroup(
            createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setLayout(null);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Agencias");
        jPanel5.add(jLabel58);
        jLabel58.setBounds(281, 290, 270, 67);

        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("  + Crear Agencia");
        jLabel81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel81);
        jLabel81.setBounds(910, 310, 120, 30);
        jPanel5.add(jSeparator8);
        jSeparator8.setBounds(270, 360, 760, 20);

        jb_openCreateAgency.setText("Crear Nueva Agencia");
        jb_openCreateAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_openCreateAgencyMouseClicked(evt);
            }
        });
        jPanel5.add(jb_openCreateAgency);
        jb_openCreateAgency.setBounds(930, 170, 153, 25);

        viewAgenciesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "RTN", "Dirección", "Teléfono", "Director", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane10.setViewportView(viewAgenciesTable);

        jPanel5.add(jScrollPane10);
        jScrollPane10.setBounds(270, 390, 760, 290);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel5.add(jLabel80);
        jLabel80.setBounds(0, 0, 1260, 760);

        javax.swing.GroupLayout viewAgenciasLayout = new javax.swing.GroupLayout(viewAgencias.getContentPane());
        viewAgencias.getContentPane().setLayout(viewAgenciasLayout);
        viewAgenciasLayout.setHorizontalGroup(
            viewAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        viewAgenciasLayout.setVerticalGroup(
            viewAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setLayout(null);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Descripción");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(340, 540, 65, 16);

        tf_createAgencyName.setBackground(new java.awt.Color(0, 0, 0));
        tf_createAgencyName.setForeground(new java.awt.Color(255, 255, 255));
        tf_createAgencyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_createAgencyName.setPreferredSize(new java.awt.Dimension(2, 18));
        tf_createAgencyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_createAgencyNameActionPerformed(evt);
            }
        });
        jPanel6.add(tf_createAgencyName);
        tf_createAgencyName.setBounds(490, 380, 170, 30);

        tf_createAgencyEmail.setBackground(new java.awt.Color(0, 0, 0));
        tf_createAgencyEmail.setForeground(new java.awt.Color(255, 255, 255));
        tf_createAgencyEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_createAgencyEmail.setPreferredSize(new java.awt.Dimension(2, 18));
        jPanel6.add(tf_createAgencyEmail);
        tf_createAgencyEmail.setBounds(460, 430, 200, 30);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre de la empresa");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(340, 370, 131, 30);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("RTN Empresarial");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(340, 480, 96, 30);

        tf_createAgencyDirector.setBackground(new java.awt.Color(0, 0, 0));
        tf_createAgencyDirector.setForeground(new java.awt.Color(255, 255, 255));
        tf_createAgencyDirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_createAgencyDirector.setPreferredSize(new java.awt.Dimension(2, 18));
        tf_createAgencyDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_createAgencyDirectorActionPerformed(evt);
            }
        });
        jPanel6.add(tf_createAgencyDirector);
        tf_createAgencyDirector.setBounds(820, 380, 120, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contraseña");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(690, 430, 70, 30);

        tf_createAgencyDescription.setBackground(new java.awt.Color(0, 0, 0));
        tf_createAgencyDescription.setColumns(20);
        tf_createAgencyDescription.setForeground(new java.awt.Color(255, 255, 255));
        tf_createAgencyDescription.setRows(5);
        tf_createAgencyDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(tf_createAgencyDescription);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(420, 540, 240, 59);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Dirección");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(710, 540, 52, 16);

        tf_createAgencyRTN.setBackground(new java.awt.Color(0, 0, 0));
        tf_createAgencyRTN.setForeground(new java.awt.Color(255, 255, 255));
        tf_createAgencyRTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_createAgencyRTN.setPreferredSize(new java.awt.Dimension(2, 18));
        jPanel6.add(tf_createAgencyRTN);
        tf_createAgencyRTN.setBounds(460, 480, 200, 30);

        tf_createAgencyAddress.setBackground(new java.awt.Color(0, 0, 0));
        tf_createAgencyAddress.setColumns(20);
        tf_createAgencyAddress.setForeground(new java.awt.Color(255, 255, 255));
        tf_createAgencyAddress.setRows(5);
        tf_createAgencyAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane3.setViewportView(tf_createAgencyAddress);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(770, 540, 170, 59);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Correo Electrónico");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(340, 430, 110, 30);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Director");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(760, 390, 45, 16);

        jp_createAgencyPassword.setBackground(new java.awt.Color(0, 0, 0));
        jp_createAgencyPassword.setForeground(new java.awt.Color(255, 255, 255));
        jp_createAgencyPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jp_createAgencyPassword.setPreferredSize(new java.awt.Dimension(2, 18));
        jPanel6.add(jp_createAgencyPassword);
        jp_createAgencyPassword.setBounds(780, 430, 160, 30);

        tf_createAgencyPhone.setBackground(new java.awt.Color(0, 0, 0));
        tf_createAgencyPhone.setForeground(new java.awt.Color(255, 255, 255));
        tf_createAgencyPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_createAgencyPhone.setPreferredSize(new java.awt.Dimension(2, 18));
        jPanel6.add(tf_createAgencyPhone);
        tf_createAgencyPhone.setBounds(830, 480, 110, 30);
        jPanel6.add(jSeparator9);
        jSeparator9.setBounds(340, 350, 600, 20);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Teléfono");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(760, 490, 50, 16);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nueva agencia");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(340, 310, 175, 29);

        jb_createAgency.setText("Crear");
        jb_createAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_createAgencyMouseClicked(evt);
            }
        });
        jPanel6.add(jb_createAgency);
        jb_createAgency.setBounds(1040, 450, 91, 31);

        createAgency.setBackground(new java.awt.Color(255, 51, 51));
        createAgency.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createAgency.setForeground(new java.awt.Color(255, 255, 255));
        createAgency.setText("          Aceptar");
        createAgency.setToolTipText("");
        createAgency.setOpaque(true);
        createAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAgencyMouseClicked(evt);
            }
        });
        jPanel6.add(createAgency);
        createAgency.setBounds(600, 640, 140, 30);

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel6.add(jLabel82);
        jLabel82.setBounds(0, 0, 1263, 760);

        javax.swing.GroupLayout createAgenciesLayout = new javax.swing.GroupLayout(createAgencies.getContentPane());
        createAgencies.getContentPane().setLayout(createAgenciesLayout);
        createAgenciesLayout.setHorizontalGroup(
            createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        createAgenciesLayout.setVerticalGroup(
            createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Crear puesto vacante");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(320, 340, 270, 29);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ID Puesto");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(320, 420, 80, 31);
        jPanel7.add(tf_createIdPuesto);
        tf_createIdPuesto.setBounds(450, 420, 170, 31);

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Rango jerárquico");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(320, 470, 98, 31);

        cb_createRangoJerarquico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Supervisor", "Gerente", "Director", "Nivel bajo" }));
        jPanel7.add(cb_createRangoJerarquico);
        cb_createRangoJerarquico.setBounds(430, 470, 100, 31);

        cb_createRangoSalarial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5,000 - 10,000", "10,500 - 20,000 ", "20,500 - 30,000" }));
        jPanel7.add(cb_createRangoSalarial);
        cb_createRangoSalarial.setBounds(770, 420, 160, 31);

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Rango salario");
        jPanel7.add(jLabel27);
        jLabel27.setBounds(670, 420, 78, 31);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tipo plaza");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(730, 470, 59, 31);

        cb_createTipoPlaza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiempo completo", "Medio tiempo", "Contrato", "Temporal" }));
        jPanel7.add(cb_createTipoPlaza);
        cb_createTipoPlaza.setBounds(800, 470, 130, 30);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Plazas Disponibles");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(550, 470, 110, 31);

        sp_createCantidadPlazas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel7.add(sp_createCantidadPlazas);
        sp_createCantidadPlazas.setBounds(660, 470, 45, 31);

        cb_createPuestoVacante.setText("Crear");
        cb_createPuestoVacante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_createPuestoVacanteMouseClicked(evt);
            }
        });
        jPanel7.add(cb_createPuestoVacante);
        cb_createPuestoVacante.setBounds(780, 630, 65, 25);
        jPanel7.add(jSeparator10);
        jSeparator10.setBounds(320, 390, 610, 10);

        createPuesto.setBackground(new java.awt.Color(255, 51, 51));
        createPuesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createPuesto.setForeground(new java.awt.Color(255, 255, 255));
        createPuesto.setText("        Aceptar");
        createPuesto.setOpaque(true);
        createPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createPuestoMouseClicked(evt);
            }
        });
        jPanel7.add(createPuesto);
        createPuesto.setBounds(570, 550, 120, 30);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel7.add(jLabel83);
        jLabel83.setBounds(0, 0, 1260, 760);

        javax.swing.GroupLayout createPuestosLayout = new javax.swing.GroupLayout(createPuestos.getContentPane());
        createPuestos.getContentPane().setLayout(createPuestosLayout);
        createPuestosLayout.setHorizontalGroup(
            createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        createPuestosLayout.setVerticalGroup(
            createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Estado Civil");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Casado(a)", "Divorciado(a)" }));

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Dependientes");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Antecedentes Penales");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Servicio Militar");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Datos Legales");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator11)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(279, 279, 279))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel9);
        jPanel9.setBounds(50, 420, 320, 240);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Datos Academicos");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Lista de Titulaciones");

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Titulos");

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Institucion");

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Año de graduacion");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(2018, 1900, 3000, 1));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Promedio de titulacion");

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(60, 0, 100, 1));

        jButton5.setText("Agregar Historial Academico");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator13)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel39)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addGap(29, 29, 29)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel43)
                                        .addComponent(jLabel45))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(6, 6, 6))
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel10);
        jPanel10.setBounds(50, 50, 320, 350);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Condiciones Laborales");

        cb_createRangoJerarquico1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Supervisor", "Gerente", "Director", "Nivel bajo" }));

        cb_createMinRangoSalarial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5,000-10,000", "10,500-20,000", "20,500-30,000" }));

        cb_createTipoPlaza1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiempo completo", "Medio tiempo", "Contrato", "Temporal" }));

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Rango jerárquico");

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Rango salario");

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Tipo plaza");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(42, 42, 42)
                        .addComponent(cb_createRangoJerarquico1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel85)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel56))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_createMinRangoSalarial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_createTipoPlaza1, 0, 140, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_createRangoJerarquico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(cb_createMinRangoSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(cb_createTipoPlaza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel11);
        jPanel11.setBounds(740, 440, 340, 220);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Telefono Referencia:");

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Referencia Laboral: ");

        jButton11.setText("Agregar Historial Laboral");

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Año de Finalizacion");

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(2018, 1900, 3000, 1));

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Lista De Historial Laboral ");

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Puesto");

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Año de Inicio");

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(2018, 1900, 3000, 1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Historial Laboral");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextField2)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField7)
                    .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator14))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addGap(4, 4, 4)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addGap(4, 4, 4)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel52)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addGap(30, 30, 30))
        );

        jPanel8.add(jPanel12);
        jPanel12.setBounds(390, 50, 330, 400);

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Nesecidades Especiales");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane9.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Idiomas");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane8.setViewportView(jTextArea3);

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Medicamentos");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Alergias");

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Habilidades");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane7.setViewportView(jTextArea2);

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Herramientas ");

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setForeground(java.awt.Color.white);
        jLabel86.setText("Datos Sanitarios");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel41)
                                    .addComponent(jScrollPane5)
                                    .addComponent(jScrollPane9)
                                    .addComponent(jLabel48)
                                    .addComponent(jScrollPane7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel47)
                                    .addComponent(jScrollPane4)
                                    .addComponent(jScrollPane6))))
                        .addGap(24, 24, 24))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel86)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel38))
                .addGap(4, 4, 4)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel37)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel48)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel14);
        jPanel14.setBounds(740, 50, 340, 370);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Contacto de Emergencia");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Telefono:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Parentesco:");

        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Nombre");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator15))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8)
                            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel13);
        jPanel13.setBounds(390, 470, 330, 190);

        jLabel89.setBackground(new java.awt.Color(255, 51, 51));
        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("              Actualizar Información Aspirante");
        jLabel89.setOpaque(true);
        jPanel8.add(jLabel89);
        jLabel89.setBounds(738, 686, 340, 40);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabel88.setText("jLabel88");
        jPanel8.add(jLabel88);
        jLabel88.setBounds(50, 680, 190, 60);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper.png"))); // NOI18N
        jLabel32.setText("jLabel32");
        jPanel8.add(jLabel32);
        jLabel32.setBounds(0, 0, 1110, 759);

        javax.swing.GroupLayout updateAspiranteDataLayout = new javax.swing.GroupLayout(updateAspiranteData.getContentPane());
        updateAspiranteData.getContentPane().setLayout(updateAspiranteDataLayout);
        updateAspiranteDataLayout.setHorizontalGroup(
            updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
        );
        updateAspiranteDataLayout.setVerticalGroup(
            updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.setLayout(null);

        viewDegree1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nivel", "Grado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(viewDegree1);

        jPanel15.add(jScrollPane11);
        jScrollPane11.setBounds(400, 450, 450, 170);

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Nivel");
        jPanel15.add(jLabel60);
        jLabel60.setBounds(630, 410, 27, 16);

        cb_nivelGradoAcademico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secundaria", "Pregrado", "Posgrado", "Doctorado", "Especialización" }));
        jPanel15.add(cb_nivelGradoAcademico);
        cb_nivelGradoAcademico.setBounds(670, 400, 132, 31);

        tf_gradoAcademico.setBackground(new java.awt.Color(0, 0, 0));
        tf_gradoAcademico.setForeground(new java.awt.Color(255, 255, 255));
        tf_gradoAcademico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel15.add(tf_gradoAcademico);
        tf_gradoAcademico.setBounds(450, 400, 132, 31);

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Grado");
        jPanel15.add(jLabel59);
        jLabel59.setBounds(400, 410, 34, 16);

        jb_openCreateDegree.setText("Crear");
        jb_openCreateDegree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_openCreateDegreeMouseClicked(evt);
            }
        });
        jPanel15.add(jb_openCreateDegree);
        jb_openCreateDegree.setBounds(1010, 250, 94, 25);
        jPanel15.add(jSeparator2);
        jSeparator2.setBounds(400, 370, 450, 20);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Grados académicos");
        jPanel15.add(jLabel61);
        jLabel61.setBounds(400, 330, 250, 29);

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText(" +");
        jLabel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel91MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel91);
        jLabel91.setBounds(820, 400, 30, 30);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel15.add(jLabel90);
        jLabel90.setBounds(0, 0, 1260, 750);

        javax.swing.GroupLayout viewDegreeLayout = new javax.swing.GroupLayout(viewDegree.getContentPane());
        viewDegree.getContentPane().setLayout(viewDegreeLayout);
        viewDegreeLayout.setHorizontalGroup(
            viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
        );
        viewDegreeLayout.setVerticalGroup(
            viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        jPanel16.setLayout(null);

        jButton6.setText("Buscar aspirantes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton6);
        jButton6.setBounds(920, 60, 133, 25);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Puestos");
        jPanel16.add(jLabel62);
        jLabel62.setBounds(320, 320, 130, 29);

        viewPuestosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Rango jerárquico", "Rango salarial", "Tipo de plaza", "Cantidad de plazas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane12.setViewportView(viewPuestosTable);

        jPanel16.add(jScrollPane12);
        jScrollPane12.setBounds(310, 390, 590, 230);

        crearNuevoPuesto.setText("Crear puesto");
        crearNuevoPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearNuevoPuestoMouseClicked(evt);
            }
        });
        jPanel16.add(crearNuevoPuesto);
        crearNuevoPuesto.setBounds(1080, 60, 107, 25);
        jPanel16.add(jSeparator3);
        jSeparator3.setBounds(310, 360, 590, 10);

        jLabel94.setBackground(new java.awt.Color(255, 51, 51));
        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("      Crear Puesto");
        jLabel94.setOpaque(true);
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel94);
        jLabel94.setBounds(610, 320, 140, 30);

        jLabel95.setBackground(new java.awt.Color(255, 51, 51));
        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("  Buscar Aspirantes");
        jLabel95.setOpaque(true);
        jPanel16.add(jLabel95);
        jLabel95.setBounds(760, 320, 140, 30);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel16.add(jLabel92);
        jLabel92.setBounds(0, 0, 1260, 750);

        jLabel93.setText("jLabel93");
        jPanel16.add(jLabel93);
        jLabel93.setBounds(850, 220, 48, 16);

        javax.swing.GroupLayout viewPuestosLayout = new javax.swing.GroupLayout(viewPuestos.getContentPane());
        viewPuestos.getContentPane().setLayout(viewPuestosLayout);
        viewPuestosLayout.setHorizontalGroup(
            viewPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPuestosLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        viewPuestosLayout.setVerticalGroup(
            viewPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );

        jPanel17.setLayout(null);

        jScrollPane13.setToolTipText("");

        viewPuestosAspirante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Rango jerárquico", "Rango salarial", "Tipo de plaza", "Cantidad de plazas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane13.setViewportView(viewPuestosAspirante);

        jPanel17.add(jScrollPane13);
        jScrollPane13.setBounds(360, 370, 532, 228);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Puestos disponibles");
        jLabel63.setToolTipText("");
        jPanel17.add(jLabel63);
        jLabel63.setBounds(360, 310, 250, 29);
        jPanel17.add(jSeparator4);
        jSeparator4.setBounds(360, 350, 530, 10);

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel17.add(jLabel96);
        jLabel96.setBounds(-2, -4, 1263, 760);

        javax.swing.GroupLayout buscarPuestosLayout = new javax.swing.GroupLayout(buscarPuestos.getContentPane());
        buscarPuestos.getContentPane().setLayout(buscarPuestosLayout);
        buscarPuestosLayout.setHorizontalGroup(
            buscarPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        buscarPuestosLayout.setVerticalGroup(
            buscarPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarPuestosLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel18.setLayout(null);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Crear Administrador");
        jPanel18.add(jLabel66);
        jLabel66.setBounds(520, 310, 240, 29);

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Username");
        jPanel18.add(jLabel64);
        jLabel64.setBounds(510, 390, 58, 16);

        tf_usernameAdmin.setBackground(new java.awt.Color(0, 0, 0));
        tf_usernameAdmin.setForeground(new java.awt.Color(255, 255, 255));
        tf_usernameAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel18.add(tf_usernameAdmin);
        tf_usernameAdmin.setBounds(580, 390, 190, 31);

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Password");
        jPanel18.add(jLabel65);
        jLabel65.setBounds(510, 440, 55, 16);

        pf_usernamePassword.setBackground(new java.awt.Color(0, 0, 0));
        pf_usernamePassword.setForeground(new java.awt.Color(255, 255, 255));
        pf_usernamePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel18.add(pf_usernamePassword);
        pf_usernamePassword.setBounds(580, 440, 190, 31);
        jPanel18.add(jSeparator5);
        jSeparator5.setBounds(490, 360, 290, 20);

        crearAdminUser.setText("Crear");
        crearAdminUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearAdminUserMouseClicked(evt);
            }
        });
        jPanel18.add(crearAdminUser);
        crearAdminUser.setBounds(860, 400, 65, 25);

        jLabel98.setBackground(new java.awt.Color(255, 51, 51));
        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("       Agregar Admin");
        jLabel98.setOpaque(true);
        jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel98MouseClicked(evt);
            }
        });
        jPanel18.add(jLabel98);
        jLabel98.setBounds(560, 500, 160, 31);

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel18.add(jLabel97);
        jLabel97.setBounds(10, 0, 1260, 740);

        javax.swing.GroupLayout createAdminLayout = new javax.swing.GroupLayout(createAdmin.getContentPane());
        createAdmin.getContentPane().setLayout(createAdminLayout);
        createAdminLayout.setHorizontalGroup(
            createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
        );
        createAdminLayout.setVerticalGroup(
            createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        username_login.setBackground(new java.awt.Color(0, 0, 0));
        username_login.setForeground(new java.awt.Color(255, 255, 255));
        username_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(username_login);
        username_login.setBounds(570, 350, 210, 30);

        password_login.setBackground(new java.awt.Color(0, 0, 0));
        password_login.setForeground(new java.awt.Color(255, 255, 255));
        password_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(password_login);
        password_login.setBounds(570, 420, 210, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(480, 350, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(480, 420, 90, 30);

        errorLog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLog.setForeground(new java.awt.Color(255, 51, 51));
        errorLog.setText("Usuario o contraseña incorrecta");
        jPanel2.add(errorLog);
        errorLog.setBounds(520, 300, 230, 30);

        jLabel72.setBackground(new java.awt.Color(255, 51, 51));
        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("                              LOG IN");
        jLabel72.setOpaque(true);
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel72);
        jLabel72.setBounds(480, 490, 300, 30);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roguelogo.png"))); // NOI18N
        jPanel2.add(jLabel70);
        jLabel70.setBounds(0, 0, 1260, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_createAgencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_createAgencyMouseClicked
        boolean error = false;

        if (tf_createAgencyEmail.getText().equals("")) {
            tf_createAgencyEmail.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (jp_createAgencyPassword.getText().equals("")) {
            jp_createAgencyPassword.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyRTN.getText().equals("")) {
            tf_createAgencyRTN.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyName.getText().equals("")) {
            tf_createAgencyName.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyPhone.getText().equals("")) {
            tf_createAgencyPhone.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyDirector.getText().equals("")) {
            tf_createAgencyDirector.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyAddress.getText().equals("")) {
            tf_createAgencyAddress.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyDescription.getText().equals("")) {
            tf_createAgencyDescription.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (!error) {

            System.out.println("DB insert");
            String username = tf_createAgencyEmail.getText();
            String password = jp_createAgencyPassword.getText();
            String RTN = tf_createAgencyRTN.getText();
            String nombre = tf_createAgencyName.getText();
            String direccion = tf_createAgencyAddress.getText();
            int telefono = parseInt(tf_createAgencyPhone.getText());
            String director = tf_createAgencyDirector.getText();
            String descripcion = tf_createAgencyDescription.getText();
            agencia newAgencia = new agencia(username, RTN, nombre, direccion, telefono, director, descripcion);
            users newUser = new users(username, password, "agencia");

            //--------------- Creating database----------------------------//
            CouchDbConnector dbAgencia = new StdCouchDbConnector("agencia", dbInstance);
            CouchDbConnector dbUsers = new StdCouchDbConnector("users", dbInstance);
            dbAgencia.createDatabaseIfNotExists();
            dbAgencia.create(newAgencia);
            dbUsers.createDatabaseIfNotExists();
            dbUsers.create(newUser);
            tf_createAgencyEmail.setText("");
            jp_createAgencyPassword.setText("");
            tf_createAgencyRTN.setText("");
            tf_createAgencyName.setText("");
            tf_createAgencyDirector.setText("");
            tf_createAgencyPhone.setText("");
            tf_createAgencyDescription.setText("");
            tf_createAgencyEmail.setText("");
        }
    }//GEN-LAST:event_jb_createAgencyMouseClicked

    private void cb_createPuestoVacanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_createPuestoVacanteMouseClicked
        // TODO add your handling code here:
        boolean error = false;

        if (tf_createIdPuesto.getText().equals("")) {
            tf_createIdPuesto.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        if (!error) {

            System.out.println("DB insert");

            String idPuesto = tf_createIdPuesto.getText();
            String rangoJerarquico = cb_createRangoJerarquico.getSelectedItem().toString();
            String rangoSalarial = cb_createRangoSalarial.getSelectedItem().toString();
            String tipoPlaza = cb_createTipoPlaza.getSelectedItem().toString();
            int cantidadPlazas = parseInt(sp_createCantidadPlazas.getValue().toString());

            puesto newPuesto = new puesto(idPuesto, currentUser, rangoJerarquico, rangoSalarial, tipoPlaza, cantidadPlazas);

            //--------------- Creating database----------------------------//
            CouchDbConnector dbPuesto = new StdCouchDbConnector("puesto", dbInstance);
            dbPuesto.createDatabaseIfNotExists();
            dbPuesto.create(newPuesto);

            tf_createIdPuesto.setText("");
            cb_createRangoJerarquico.setSelectedIndex(0);
            cb_createRangoSalarial.setSelectedIndex(0);
            cb_createRangoJerarquico.setSelectedIndex(0);
            cb_createTipoPlaza.setSelectedIndex(0);
            sp_createCantidadPlazas.setValue(1);

        }

    }//GEN-LAST:event_cb_createPuestoVacanteMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        viewAgencias.pack();
        viewAgencias.setLocationRelativeTo(null);
        viewAgencias.setVisible(true);

     }//GEN-LAST:event_jButton12MouseClicked

    private void jb_openCreateAgencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_openCreateAgencyMouseClicked
        createAgencies.pack();
        createAgencies.setLocationRelativeTo(null);
        createAgencies.setVisible(true);
    }//GEN-LAST:event_jb_openCreateAgencyMouseClicked

    private void crearNuevoPuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNuevoPuestoMouseClicked
        createPuestos.pack();
        createPuestos.setLocationRelativeTo(null);
        createPuestos.setVisible(true);
    }//GEN-LAST:event_crearNuevoPuestoMouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        createAdmin.pack();
        createAdmin.setLocationRelativeTo(null);
        createAdmin.setVisible(true);
    }//GEN-LAST:event_jButton14MouseClicked

    private void crearAdminUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearAdminUserMouseClicked
        boolean error = false;

        if (tf_usernameAdmin.getText().equals("")) {
            tf_usernameAdmin.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (pf_usernamePassword.getText().equals("")) {
            pf_usernamePassword.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (!error) {

            System.out.println("DB insert");

            String username = tf_usernameAdmin.getText();
            String password = pf_usernamePassword.getText();

            users newUsers = new users(username, password, "admin");

            //--------------- Creating database----------------------------//
            CouchDbConnector dbUserAdmin = new StdCouchDbConnector("users", dbInstance);
            dbUserAdmin.createDatabaseIfNotExists();
            dbUserAdmin.create(newUsers);

            tf_usernameAdmin.setText("");
            pf_usernamePassword.setText("");

        }
    }//GEN-LAST:event_crearAdminUserMouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        viewDegree.pack();
        viewDegree.setLocationRelativeTo(null);
        viewDegree.setVisible(true);
    }//GEN-LAST:event_jButton15MouseClicked

    private void tf_identidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_identidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_identidadActionPerformed

    private void tf_primerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_primerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_primerApellidoActionPerformed

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        boolean error = false;
        if (tf_usernameAspirante.getText().equals("")) {
            tf_usernameAspirante.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        
        if (tf_identidad.getText().equals("")) {
            tf_identidad.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        
        if (tf_primerNombre.getText().equals("")) {
            tf_primerNombre.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        
        if (tf_segundoNombre.getText().equals("")) {
            tf_segundoNombre.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        
        if (tf_primerApellido.getText().equals("")) {
            tf_primerApellido.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        
        if (tf_segundoApellido.getText().equals("")) {
            tf_segundoApellido.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        
        if(pf_passwordAspirante.getText().equals("")){
            pf_passwordAspirante.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        if (!error) {

            System.out.println("DB insert");
            String username = tf_usernameAspirante.getText();
            //Llave tabla aspiratenes
            String identidad = tf_identidad.getText();
            String primerNombre = tf_primerNombre.getText();
            String segundoNombre = tf_segundoNombre.getText();
            String primerApellido = tf_primerApellido.getText();
            String segundoApellido = tf_segundoApellido.getText();
            Date fechaNacimiento = new Date();
            fechaNacimiento.setMonth((int) sp_month.getValue());
            fechaNacimiento.setYear((int) sp_year.getValue());
            
            //Para que los usuarios puedan hacer CRUD de los perfiles creados por ellos
            String createdBy;

            String gradoAcademico = tf_gradoAcademico.getText();
            String nivel = cb_nivelGradoAcademico.getSelectedItem().toString();
            grados_academicos newGradoAcademico = new grados_academicos(gradoAcademico, nivel);

            //--------------- Creating database----------------------------//
            CouchDbConnector dbGradoAcademico = new StdCouchDbConnector("grados_academicos", dbInstance);
            dbGradoAcademico.createDatabaseIfNotExists();
            dbGradoAcademico.create(newGradoAcademico);

            tf_gradoAcademico.setText("");
            cb_nivelGradoAcademico.setSelectedIndex(0);

        }
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        // TODO add your handling code here:
        CouchDbConnector db = new StdCouchDbConnector("users", dbInstance);
        List<String> docIds = db.getAllDocIds();
        Gson gson = new Gson();
        ViewQuery q = new ViewQuery().allDocs().includeDocs(true).keys(docIds);
        ArrayList<users> listUsers = new ArrayList();
        for (int i = 0; i < db.queryView(q).getRows().size(); i++) {
            listUsers.add(gson.fromJson(db.queryView(q).getRows().get(i).getDoc(), users.class));
            System.out.println(gson.fromJson(db.queryView(q).getRows().get(i).getDoc(), users.class)+" ");
        }
        boolean bandera = true;
        for (int i = 0; i < listUsers.size(); i++) {
            System.out.println(listUsers.get(i).getUsername());
            System.out.println(listUsers.get(i).getPassword());
            System.out.println(this.username_login.getText());
            System.out.println(this.password_login.getText());
            if (this.username_login.getText().equals(listUsers.get(i).getUsername()) && this.password_login.getText().equals(listUsers.get(i).getPassword())) {
                if (listUsers.get(i).getType().equals("admin")) {
                    this.setVisible(false);
                    adminView.pack();
                    adminView.setLocationRelativeTo(null);
                    adminView.setVisible(true);
                    this.setVisible(false);
                    bandera = false;
                } else if (listUsers.get(i).getType().equals("aspirante")) {
                    this.setVisible(false);
                    updateAspiranteData.pack();
                    updateAspiranteData.setLocationRelativeTo(null);
                    updateAspiranteData.setVisible(true);
                    bandera = false;
                } else if (listUsers.get(i).getType().equals("agencia")) {
                    bandera = false;
                    currentUser = listUsers.get(i).getUsername();
                    viewPuestos.pack();
                    viewPuestos.setLocationRelativeTo(null);
                    viewPuestos.setVisible(true);
                }
            } else {
                //no existe ese user
                //errorLog.setVisible(true);
               // username_login.setText("");
                //password_login.setText("");
            }
            if (bandera) {
                System.out.println("");
            }
        }
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        viewAgencias.pack();
        viewAgencias.setLocationRelativeTo(null);
        viewAgencias.setVisible(true);
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        createAdmin.pack();
        createAdmin.setLocationRelativeTo(null);
        createAdmin.setVisible(true);
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        viewDegree.pack();
        viewDegree.setLocationRelativeTo(null);
        viewDegree.setVisible(true);
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        createAgencies.pack();
        createAgencies.setLocationRelativeTo(null);
        createAgencies.setVisible(true);
    }//GEN-LAST:event_jLabel81MouseClicked

    private void tf_createAgencyDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_createAgencyDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_createAgencyDirectorActionPerformed

    private void tf_createAgencyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_createAgencyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_createAgencyNameActionPerformed

    private void createAgencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAgencyMouseClicked
                boolean error = false;

        if (tf_createAgencyEmail.getText().equals("")) {
            tf_createAgencyEmail.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (jp_createAgencyPassword.getText().equals("")) {
            jp_createAgencyPassword.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyRTN.getText().equals("")) {
            tf_createAgencyRTN.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyName.getText().equals("")) {
            tf_createAgencyName.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyPhone.getText().equals("")) {
            tf_createAgencyPhone.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyDirector.getText().equals("")) {
            tf_createAgencyDirector.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyAddress.getText().equals("")) {
            tf_createAgencyAddress.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (tf_createAgencyDescription.getText().equals("")) {
            tf_createAgencyDescription.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (!error) {

            System.out.println("DB insert");
            String username = tf_createAgencyEmail.getText();
            String password = jp_createAgencyPassword.getText();
            String RTN = tf_createAgencyRTN.getText();
            String nombre = tf_createAgencyName.getText();
            String direccion = tf_createAgencyAddress.getText();
            int telefono = parseInt(tf_createAgencyPhone.getText());
            String director = tf_createAgencyDirector.getText();
            String descripcion = tf_createAgencyDescription.getText();
            agencia newAgencia = new agencia(username, RTN, nombre, direccion, telefono, director, descripcion);
            users newUser = new users(username, password, "agencia");

            //--------------- Creating database----------------------------//
            CouchDbConnector dbAgencia = new StdCouchDbConnector("agencia", dbInstance);
            CouchDbConnector dbUsers = new StdCouchDbConnector("users", dbInstance);
            dbAgencia.createDatabaseIfNotExists();
            dbAgencia.create(newAgencia);
            dbUsers.createDatabaseIfNotExists();
            dbUsers.create(newUser);
            tf_createAgencyEmail.setText("");
            jp_createAgencyPassword.setText("");
            tf_createAgencyRTN.setText("");
            tf_createAgencyName.setText("");
            tf_createAgencyDirector.setText("");
            tf_createAgencyPhone.setText("");
            tf_createAgencyDescription.setText("");
            tf_createAgencyEmail.setText("");
        }
    }//GEN-LAST:event_createAgencyMouseClicked

    private void createPuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createPuestoMouseClicked
        boolean error = false;

        if (tf_createIdPuesto.getText().equals("")) {
            tf_createIdPuesto.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        if (!error) {

            System.out.println("DB insert");

            String idPuesto = tf_createIdPuesto.getText();
            String rangoJerarquico = cb_createRangoJerarquico.getSelectedItem().toString();
            String rangoSalarial = cb_createRangoSalarial.getSelectedItem().toString();
            String tipoPlaza = cb_createTipoPlaza.getSelectedItem().toString();
            int cantidadPlazas = parseInt(sp_createCantidadPlazas.getValue().toString());

            puesto newPuesto = new puesto(idPuesto, currentUser, rangoJerarquico, rangoSalarial, tipoPlaza, cantidadPlazas);

            //--------------- Creating database----------------------------//
            CouchDbConnector dbPuesto = new StdCouchDbConnector("puesto", dbInstance);
            dbPuesto.createDatabaseIfNotExists();
            dbPuesto.create(newPuesto);

            tf_createIdPuesto.setText("");
            cb_createRangoJerarquico.setSelectedIndex(0);
            cb_createRangoSalarial.setSelectedIndex(0);
            cb_createRangoJerarquico.setSelectedIndex(0);
            cb_createTipoPlaza.setSelectedIndex(0);
            sp_createCantidadPlazas.setValue(1);

        }
    }//GEN-LAST:event_createPuestoMouseClicked

    private void jb_openCreateDegreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_openCreateDegreeMouseClicked
        boolean error = false;
        if (tf_gradoAcademico.getText().equals("")) {
            tf_gradoAcademico.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        if (!error) {

            System.out.println("DB insert");
            String gradoAcademico = tf_gradoAcademico.getText();
            String nivel = cb_nivelGradoAcademico.getSelectedItem().toString();
            grados_academicos newGradoAcademico = new grados_academicos(gradoAcademico, nivel);

            //--------------- Creating database----------------------------//
            CouchDbConnector dbGradoAcademico = new StdCouchDbConnector("grados_academicos", dbInstance);
            dbGradoAcademico.createDatabaseIfNotExists();
            dbGradoAcademico.create(newGradoAcademico);

            tf_gradoAcademico.setText("");
            cb_nivelGradoAcademico.setSelectedIndex(0);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_openCreateDegreeMouseClicked

    private void jLabel91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseClicked
        boolean error = false;
        if (tf_gradoAcademico.getText().equals("")) {
            tf_gradoAcademico.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }

        if (!error) {

            System.out.println("DB insert");
            String gradoAcademico = tf_gradoAcademico.getText();
            String nivel = cb_nivelGradoAcademico.getSelectedItem().toString();
            grados_academicos newGradoAcademico = new grados_academicos(gradoAcademico, nivel);

            //--------------- Creating database----------------------------//
            CouchDbConnector dbGradoAcademico = new StdCouchDbConnector("grados_academicos", dbInstance);
            dbGradoAcademico.createDatabaseIfNotExists();
            dbGradoAcademico.create(newGradoAcademico);

            tf_gradoAcademico.setText("");
            cb_nivelGradoAcademico.setSelectedIndex(0);

        }
    }//GEN-LAST:event_jLabel91MouseClicked

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
        createPuestos.pack();
        createPuestos.setLocationRelativeTo(null);
        createPuestos.setVisible(true);
    }//GEN-LAST:event_jLabel94MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseClicked
        boolean error = false;

        if (tf_usernameAdmin.getText().equals("")) {
            tf_usernameAdmin.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (pf_usernamePassword.getText().equals("")) {
            pf_usernamePassword.setBorder(BorderFactory.createLineBorder(Color.red));
            error = true;
        }
        if (!error) {

            System.out.println("DB insert");

            String username = tf_usernameAdmin.getText();
            String password = pf_usernamePassword.getText();

            users newUsers = new users(username, password, "admin");

            //--------------- Creating database----------------------------//
            CouchDbConnector dbUserAdmin = new StdCouchDbConnector("users", dbInstance);
            dbUserAdmin.createDatabaseIfNotExists();
            dbUserAdmin.create(newUsers);

            tf_usernameAdmin.setText("");
            pf_usernamePassword.setText("");

        }
    }//GEN-LAST:event_jLabel98MouseClicked

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    public CouchDbInstance getDbInstance() {
        return dbInstance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog adminView;
    private javax.swing.JDialog aspirantesView;
    private javax.swing.JDialog buscarPuestos;
    private javax.swing.JComboBox cb_createMinRangoSalarial;
    private javax.swing.JButton cb_createPuestoVacante;
    private javax.swing.JComboBox cb_createRangoJerarquico;
    private javax.swing.JComboBox cb_createRangoJerarquico1;
    private javax.swing.JComboBox cb_createRangoSalarial;
    private javax.swing.JComboBox cb_createTipoPlaza;
    private javax.swing.JComboBox cb_createTipoPlaza1;
    private javax.swing.JComboBox cb_nivelGradoAcademico;
    private javax.swing.JButton crearAdminUser;
    private javax.swing.JButton crearNuevoPuesto;
    private javax.swing.JDialog createAdmin;
    private javax.swing.JDialog createAgencies;
    private javax.swing.JLabel createAgency;
    private javax.swing.JDialog createAspirante_adminView;
    private javax.swing.JLabel createPuesto;
    private javax.swing.JDialog createPuestos;
    private javax.swing.JLabel errorLog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jb_createAgency;
    private javax.swing.JButton jb_openCreateAgency;
    private javax.swing.JButton jb_openCreateDegree;
    private javax.swing.JPasswordField jp_createAgencyPassword;
    private javax.swing.JLabel logOut;
    private javax.swing.JPasswordField password_login;
    private javax.swing.JPasswordField pf_passwordAspirante;
    private javax.swing.JPasswordField pf_usernamePassword;
    private javax.swing.JSpinner sp_createCantidadPlazas;
    private javax.swing.JSpinner sp_day;
    private javax.swing.JSpinner sp_month;
    private javax.swing.JSpinner sp_year;
    private javax.swing.JTextArea tf_createAgencyAddress;
    private javax.swing.JTextArea tf_createAgencyDescription;
    private javax.swing.JTextField tf_createAgencyDirector;
    private javax.swing.JTextField tf_createAgencyEmail;
    private javax.swing.JTextField tf_createAgencyName;
    private javax.swing.JTextField tf_createAgencyPhone;
    private javax.swing.JTextField tf_createAgencyRTN;
    private javax.swing.JTextField tf_createIdPuesto;
    private javax.swing.JTextField tf_gradoAcademico;
    private javax.swing.JTextField tf_identidad;
    private javax.swing.JTextField tf_primerApellido;
    private javax.swing.JTextField tf_primerNombre;
    private javax.swing.JTextField tf_segundoApellido;
    private javax.swing.JTextField tf_segundoNombre;
    private javax.swing.JTextField tf_usernameAdmin;
    private javax.swing.JTextField tf_usernameAspirante;
    private javax.swing.JDialog updateAspiranteData;
    private javax.swing.JTextField username_login;
    private javax.swing.JDialog viewAgencias;
    private javax.swing.JTable viewAgenciesTable;
    private javax.swing.JDialog viewDegree;
    private javax.swing.JTable viewDegree1;
    private javax.swing.JDialog viewPuestos;
    private javax.swing.JTable viewPuestosAspirante;
    private javax.swing.JTable viewPuestosTable;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
 CouchDbInstance dbInstance;
    String currentUser;
}

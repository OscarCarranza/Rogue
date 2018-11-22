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

            Properties log4jProp = new Properties();
            log4jProp.setProperty("log4j.rootLogger", "WARN");
            PropertyConfigurator.configure(log4jProp);
//--------------- Creating Connection--------------------------//
            HttpClient httpClient = new StdHttpClient.Builder()
                    .url("http://192.168.1.8:5984")
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
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        aspirantesView = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        createAspirante_adminView = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        viewAgencias = new javax.swing.JDialog();
        jLabel58 = new javax.swing.JLabel();
        jb_openCreateAgency = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        viewAgenciesTable = new javax.swing.JTable();
        createAgencies = new javax.swing.JDialog();
        jp_createAgencyPassword = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        tf_createAgencyRTN = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_createAgencyDirector = new javax.swing.JTextField();
        tf_createAgencyPhone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jb_createAgency = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_createAgencyAddress = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        tf_createAgencyEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_createAgencyDescription = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        tf_createAgencyName = new javax.swing.JTextField();
        createPuestos = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        cb_createPuestoVacante = new javax.swing.JButton();
        cb_createRangoSalarial = new javax.swing.JComboBox();
        sp_createCantidadPlazas = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cb_createTipoPlaza = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        tf_createIdPuesto = new javax.swing.JTextField();
        cb_createRangoJerarquico = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        updateAspiranteData = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        cb_createTipoPlaza1 = new javax.swing.JComboBox();
        jButton11 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<String>();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel52 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<String>();
        jSpinner8 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jSpinner5 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel39 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel28 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jSpinner7 = new javax.swing.JSpinner();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<String>();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel41 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        cb_createMinRangoSalarial = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        cb_createRangoJerarquico1 = new javax.swing.JComboBox();
        jTextField10 = new javax.swing.JTextField();
        viewDegree = new javax.swing.JDialog();
        jb_openCreateDegree = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        viewDegree1 = new javax.swing.JTable();
        jLabel60 = new javax.swing.JLabel();
        cb_nivelGradoAcademico = new javax.swing.JComboBox();
        tf_gradoAcademico = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        viewPuestos = new javax.swing.JDialog();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        viewPuestosTable = new javax.swing.JTable();
        crearNuevoPuesto = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        buscarPuestos = new javax.swing.JDialog();
        jScrollPane13 = new javax.swing.JScrollPane();
        viewPuestosAspirante = new javax.swing.JTable();
        jLabel63 = new javax.swing.JLabel();
        createAdmin = new javax.swing.JDialog();
        jLabel64 = new javax.swing.JLabel();
        tf_usernameAdmin = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        pf_usernamePassword = new javax.swing.JPasswordField();
        crearAdminUser = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();
        username_login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password_login = new javax.swing.JPasswordField();

        jButton12.setText("Agencias");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jButton13.setText("Aspirantes");

        jButton14.setText("Super Administradores");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        jButton15.setText("Grados Academicos");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        jButton16.setText("Cerrar Sesion");

        javax.swing.GroupLayout adminViewLayout = new javax.swing.GroupLayout(adminView.getContentPane());
        adminView.getContentPane().setLayout(adminViewLayout);
        adminViewLayout.setHorizontalGroup(
            adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminViewLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton12)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addContainerGap())
        );
        adminViewLayout.setVerticalGroup(
            adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16)
                .addGap(102, 102, 102)
                .addGroup(adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jButton1.setText("Crear Aspirante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
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

        javax.swing.GroupLayout aspirantesViewLayout = new javax.swing.GroupLayout(aspirantesView.getContentPane());
        aspirantesView.getContentPane().setLayout(aspirantesViewLayout);
        aspirantesViewLayout.setHorizontalGroup(
            aspirantesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aspirantesViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aspirantesViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        aspirantesViewLayout.setVerticalGroup(
            aspirantesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aspirantesViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setText("Contraseña");

        jLabel6.setText("Correo");

        jLabel3.setText("Primer apellido");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel9.setText("Año");

        jLabel8.setText("Mes");

        jButton2.setText("Crear Aspirante");

        jLabel10.setText("Dia");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jSpinner1.setMaximumSize(new java.awt.Dimension(31, 31));
        jSpinner1.setMinimumSize(new java.awt.Dimension(1, 1));
        jSpinner1.setName(""); // NOI18N

        jLabel11.setText("Segundo Nombre");

        jLabel5.setText("Primer Nombre");

        jLabel4.setText("Segundo Apellido");

        jLabel7.setText("Fecha De nacimiento");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2018, 1900, 9999, 1));

        jButton3.setText("Regresar");

        javax.swing.GroupLayout createAspirante_adminViewLayout = new javax.swing.GroupLayout(createAspirante_adminView.getContentPane());
        createAspirante_adminView.getContentPane().setLayout(createAspirante_adminViewLayout);
        createAspirante_adminViewLayout.setHorizontalGroup(
            createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                        .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                                .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                        .addComponent(jTextField3))
                                    .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(12, 12, 12)
                                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 200, Short.MAX_VALUE))
                            .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addContainerGap())))
            .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        createAspirante_adminViewLayout.setVerticalGroup(
            createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAspirante_adminViewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAspirante_adminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(37, 37, 37))
        );

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel58.setText("Agencias");

        jb_openCreateAgency.setText("Crear Nueva Agencia");
        jb_openCreateAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_openCreateAgencyMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout viewAgenciasLayout = new javax.swing.GroupLayout(viewAgencias.getContentPane());
        viewAgencias.getContentPane().setLayout(viewAgenciasLayout);
        viewAgenciasLayout.setHorizontalGroup(
            viewAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAgenciasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(viewAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(viewAgenciasLayout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_openCreateAgency))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        viewAgenciasLayout.setVerticalGroup(
            viewAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAgenciasLayout.createSequentialGroup()
                .addGroup(viewAgenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewAgenciasLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jb_openCreateAgency))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewAgenciasLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Nueva agencia");

        jLabel13.setText("Correo");

        jLabel20.setText("Nombre");

        jLabel18.setText("Teléfono");

        jLabel15.setText("RTN");

        jLabel19.setText("Director");

        jb_createAgency.setText("Crear");
        jb_createAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_createAgencyMouseClicked(evt);
            }
        });

        jLabel14.setText("Password");

        tf_createAgencyAddress.setColumns(20);
        tf_createAgencyAddress.setRows(5);
        jScrollPane3.setViewportView(tf_createAgencyAddress);

        jLabel17.setText("Dirección");

        tf_createAgencyDescription.setColumns(20);
        tf_createAgencyDescription.setRows(5);
        jScrollPane2.setViewportView(tf_createAgencyDescription);

        jLabel21.setText("Descripción");

        javax.swing.GroupLayout createAgenciesLayout = new javax.swing.GroupLayout(createAgencies.getContentPane());
        createAgencies.getContentPane().setLayout(createAgenciesLayout);
        createAgenciesLayout.setHorizontalGroup(
            createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAgenciesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAgenciesLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAgenciesLayout.createSequentialGroup()
                        .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(createAgenciesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jb_createAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createAgenciesLayout.createSequentialGroup()
                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_createAgencyEmail)
                                    .addComponent(tf_createAgencyRTN)
                                    .addComponent(tf_createAgencyName)
                                    .addComponent(jp_createAgencyPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(createAgenciesLayout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(createAgenciesLayout.createSequentialGroup()
                                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel19))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAgenciesLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel17)))
                                        .addGap(18, 18, 18)
                                        .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_createAgencyDirector)
                                            .addComponent(tf_createAgencyPhone)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(createAgenciesLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(97, 97, 97))))
        );
        createAgenciesLayout.setVerticalGroup(
            createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAgenciesLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAgenciesLayout.createSequentialGroup()
                        .addComponent(tf_createAgencyPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(tf_createAgencyDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(createAgenciesLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(42, 42, 42)
                        .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createAgenciesLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(141, 141, 141)
                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(createAgenciesLayout.createSequentialGroup()
                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_createAgencyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(42, 42, 42)
                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jp_createAgencyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_createAgencyRTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(29, 29, 29)
                                .addGroup(createAgenciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(tf_createAgencyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jb_createAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jLabel27.setText("Rango salario");

        cb_createPuestoVacante.setText("Crear");
        cb_createPuestoVacante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_createPuestoVacanteMouseClicked(evt);
            }
        });

        cb_createRangoSalarial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5,000 - 10,000", "10,500 - 20,000 ", "20,500 - 30,000" }));

        sp_createCantidadPlazas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel26.setText("Rango jerárquico");

        jLabel22.setText("Tipo plaza");

        cb_createTipoPlaza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiempo completo", "Medio tiempo", "Contrato", "Temporal" }));

        jLabel23.setText("No. plazas disponibles");

        cb_createRangoJerarquico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Supervisor", "Gerente", "Director", "Nivel bajo" }));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setText("Crear puesto vacante");

        jLabel25.setText("idPuesto");

        javax.swing.GroupLayout createPuestosLayout = new javax.swing.GroupLayout(createPuestos.getContentPane());
        createPuestos.getContentPane().setLayout(createPuestosLayout);
        createPuestosLayout.setHorizontalGroup(
            createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPuestosLayout.createSequentialGroup()
                .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPuestosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel24))
                    .addGroup(createPuestosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createPuestosLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(sp_createCantidadPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cb_createPuestoVacante)
                                .addGroup(createPuestosLayout.createSequentialGroup()
                                    .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel22))
                                    .addGap(41, 41, 41)
                                    .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_createRangoSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cb_createTipoPlaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cb_createRangoJerarquico, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_createIdPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        createPuestosLayout.setVerticalGroup(
            createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPuestosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel24)
                .addGap(28, 28, 28)
                .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_createIdPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(28, 28, 28)
                .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_createRangoJerarquico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(33, 33, 33)
                .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_createRangoSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cb_createTipoPlaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(createPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(sp_createCantidadPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(cb_createPuestoVacante)
                .addGap(28, 28, 28))
        );

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel29.setText("Historial Laboral");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel42.setText("Titulos");

        jLabel38.setText("Medicamentos");

        jLabel30.setText("Estado Civil");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel54.setText("Telefono Referencia:");

        jLabel53.setText("Referencia Laboral: ");

        cb_createTipoPlaza1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiempo completo", "Medio tiempo", "Contrato", "Temporal" }));

        jButton11.setText("Agregar Historial Laboral");

        jLabel43.setText("Año de graduacion");

        jLabel48.setText("Habilidades");

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel52.setText("Año de Finalizacion");

        jLabel56.setText("Rango salario");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(2018, 1900, 3000, 1));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel51.setText("Año de Inicio");

        jLabel36.setText("Servicio Militar");

        jLabel47.setText("Herramientas ");

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(2018, 1900, 3000, 1));

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(60, 0, 100, 1));

        jButton5.setText("Agregar Historial Academico");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane9.setViewportView(jTextArea4);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jLabel39.setText("Lista de Titulaciones");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));

        jLabel28.setText("Datos Academicos");

        jLabel35.setText("Antecedentes Penales");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane8.setViewportView(jTextArea3);

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(2018, 1900, 3000, 1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane7.setViewportView(jTextArea2);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jLabel46.setText("Contacto de Emergencia");

        jLabel33.setText("Telefono:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton4.setText("Actualizar Informacion Aspirante");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel49.setText("Lista De Historial Laboral ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero(a)", "Casado(a)", "Divorciado(a)" }));

        jLabel41.setText("Idiomas");

        jLabel32.setText("Nombre: ");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel37.setText("Alergias");

        jLabel34.setText("Parentesco:");

        jLabel44.setText("Institucion");

        jLabel31.setText("Dependientes");

        jLabel55.setText("Rango jerárquico");

        jLabel50.setText("Puesto");

        cb_createMinRangoSalarial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5,000-10,000", "10,500-20,000", "20,500-30,000" }));

        jLabel40.setText("Nesecidades Especiales");

        jLabel57.setText("Tipo plaza");

        jLabel45.setText("Promedio de titulacion");

        cb_createRangoJerarquico1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Supervisor", "Gerente", "Director", "Nivel bajo" }));

        javax.swing.GroupLayout updateAspiranteDataLayout = new javax.swing.GroupLayout(updateAspiranteData.getContentPane());
        updateAspiranteData.getContentPane().setLayout(updateAspiranteDataLayout);
        updateAspiranteDataLayout.setHorizontalGroup(
            updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel48))
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel41)))))
                        .addGap(79, 79, 79)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5)
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel57))
                                .addGap(41, 41, 41)
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_createTipoPlaza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_createRangoJerarquico1, 0, 140, Short.MAX_VALUE)
                                    .addComponent(cb_createMinRangoSalarial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton5))
                            .addComponent(jLabel28)
                            .addComponent(jLabel39)
                            .addComponent(jLabel42)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52)
                                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateAspiranteDataLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton11))
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel50)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        updateAspiranteDataLayout.setVerticalGroup(
            updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator4)
                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel39)
                                .addGap(9, 9, 9)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5)))
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49)
                                .addGap(9, 9, 9)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton11)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel40)
                                        .addComponent(jLabel38)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel48)
                                        .addComponent(jLabel41)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updateAspiranteDataLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_createRangoJerarquico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addGap(33, 33, 33)
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_createMinRangoSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addGap(18, 18, 18)
                        .addGroup(updateAspiranteDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(cb_createTipoPlaza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        jb_openCreateDegree.setText("Crear");
        jb_openCreateDegree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_openCreateDegreeMouseClicked(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel61.setText("Grados académicos");

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

        jLabel60.setText("Nivel");

        cb_nivelGradoAcademico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secundaria", "Pregrado", "Posgrado", "Doctorado", "Especialización" }));

        jLabel59.setText("Grado");

        javax.swing.GroupLayout viewDegreeLayout = new javax.swing.GroupLayout(viewDegree.getContentPane());
        viewDegree.getContentPane().setLayout(viewDegreeLayout);
        viewDegreeLayout.setHorizontalGroup(
            viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDegreeLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDegreeLayout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDegreeLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDegreeLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60))
                .addGap(42, 42, 42)
                .addGroup(viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_gradoAcademico)
                    .addComponent(cb_nivelGradoAcademico, 0, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_openCreateDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        viewDegreeLayout.setVerticalGroup(
            viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDegreeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addGroup(viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewDegreeLayout.createSequentialGroup()
                        .addGroup(viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_gradoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDegreeLayout.createSequentialGroup()
                        .addComponent(jb_openCreateDegree)
                        .addGap(7, 7, 7)))
                .addGroup(viewDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(cb_nivelGradoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel62.setText("Puestos");

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

        crearNuevoPuesto.setText("Crear puesto");
        crearNuevoPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearNuevoPuestoMouseClicked(evt);
            }
        });

        jButton6.setText("Buscar aspirantes");

        javax.swing.GroupLayout viewPuestosLayout = new javax.swing.GroupLayout(viewPuestos.getContentPane());
        viewPuestos.getContentPane().setLayout(viewPuestosLayout);
        viewPuestosLayout.setHorizontalGroup(
            viewPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPuestosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(viewPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(viewPuestosLayout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crearNuevoPuesto))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        viewPuestosLayout.setVerticalGroup(
            viewPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPuestosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(viewPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(crearNuevoPuesto)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

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

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel63.setText("Puestos disponibles");

        javax.swing.GroupLayout buscarPuestosLayout = new javax.swing.GroupLayout(buscarPuestos.getContentPane());
        buscarPuestos.getContentPane().setLayout(buscarPuestosLayout);
        buscarPuestosLayout.setHorizontalGroup(
            buscarPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarPuestosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel63)
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(buscarPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buscarPuestosLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        buscarPuestosLayout.setVerticalGroup(
            buscarPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarPuestosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel63)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(buscarPuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buscarPuestosLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        jLabel64.setText("Username");

        jLabel65.setText("Password");

        crearAdminUser.setText("Crear");
        crearAdminUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearAdminUserMouseClicked(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel66.setText("Crear administradores");

        javax.swing.GroupLayout createAdminLayout = new javax.swing.GroupLayout(createAdmin.getContentPane());
        createAdmin.getContentPane().setLayout(createAdminLayout);
        createAdminLayout.setHorizontalGroup(
            createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAdminLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
            .addGroup(createAdminLayout.createSequentialGroup()
                .addGroup(createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAdminLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65))
                        .addGap(18, 18, 18)
                        .addGroup(createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_usernameAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(pf_usernamePassword)))
                    .addGroup(createAdminLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(crearAdminUser)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createAdminLayout.setVerticalGroup(
            createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAdminLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel66)
                .addGap(36, 36, 36)
                .addGroup(createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(tf_usernameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(pf_usernamePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(crearAdminUser)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login_button.setText("Iniciar sesion");
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_buttonMouseClicked(evt);
            }
        });

        jLabel1.setText("Password");

        jLabel2.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(login_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username_login)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_login))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(login_button)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseClicked
        // TODO add your handling code here:
        CouchDbConnector db = new StdCouchDbConnector("users", dbInstance);
        List<String> docIds = db.getAllDocIds();
        Gson gson = new Gson();
        ViewQuery q = new ViewQuery().allDocs().includeDocs(true).keys(docIds);
        ArrayList<users> listUsers = new ArrayList();
        for (int i = 0; i < db.queryView(q).getRows().size(); i++) {
            listUsers.add(gson.fromJson(db.queryView(q).getRows().get(i).getDoc(), users.class));
        }
        boolean bandera = true;
        for (int i = 0; i < listUsers.size(); i++) {
            if (this.username_login.getText().equals(listUsers.get(i).getUsername()) && this.password_login.getText().equals(listUsers.get(i).getPassword())) {
                if (listUsers.get(i).getType().equals("admin")) {
                    this.setVisible(false);
                    adminView.pack();
                    adminView.setLocationRelativeTo(null);
                    adminView.setVisible(true);
                    this.setVisible(false);
                    bandera = false;
                    break;
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

            }
            if (bandera) {
                System.out.println("");
            }
        }
    }//GEN-LAST:event_login_buttonMouseClicked

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
    private javax.swing.JDialog createAspirante_adminView;
    private javax.swing.JDialog createPuestos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jb_createAgency;
    private javax.swing.JButton jb_openCreateAgency;
    private javax.swing.JButton jb_openCreateDegree;
    private javax.swing.JPasswordField jp_createAgencyPassword;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_login;
    private javax.swing.JPasswordField pf_usernamePassword;
    private javax.swing.JSpinner sp_createCantidadPlazas;
    private javax.swing.JTextArea tf_createAgencyAddress;
    private javax.swing.JTextArea tf_createAgencyDescription;
    private javax.swing.JTextField tf_createAgencyDirector;
    private javax.swing.JTextField tf_createAgencyEmail;
    private javax.swing.JTextField tf_createAgencyName;
    private javax.swing.JTextField tf_createAgencyPhone;
    private javax.swing.JTextField tf_createAgencyRTN;
    private javax.swing.JTextField tf_createIdPuesto;
    private javax.swing.JTextField tf_gradoAcademico;
    private javax.swing.JTextField tf_usernameAdmin;
    private javax.swing.JDialog updateAspiranteData;
    private javax.swing.JTextField username_login;
    private javax.swing.JDialog viewAgencias;
    private javax.swing.JTable viewAgenciesTable;
    private javax.swing.JDialog viewDegree;
    private javax.swing.JTable viewDegree1;
    private javax.swing.JDialog viewPuestos;
    private javax.swing.JTable viewPuestosAspirante;
    private javax.swing.JTable viewPuestosTable;
    // End of variables declaration//GEN-END:variables
 CouchDbInstance dbInstance;
    String currentUser;
}

package uas_pbo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package uts.pbo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.lang.System.Logger.Level;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import uas_pbo.Datamahasiswa;
import static uas_pbo.Datamahasiswa_.nama;

//import uts.pbo.DbUtils;
/**
 *
 * @author IT GRC
 */
public class mahasiswa_uas extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt = null;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/UAS_PBO";
    String user = "postgres";
    String password = "123";
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * Creates new form mahasiswa_uts
     */
    public mahasiswa_uas() {
        initComponents();
        txtNIM.requestFocus(); 
        tampil();
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(koneksi, user, password);
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNamaOrtu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabelMHS = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAsalSMA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA MAHASISWA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Asal SMA");

        txtNIM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIMActionPerformed(evt);
            }
        });

        txtNama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtAlamat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        txtNamaOrtu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        tbTabelMHS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbTabelMHS.setModel(new javax.swing.table.DefaultTableModel(
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
        tbTabelMHS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTabelMHSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTabelMHS);

        btnInsert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnUpload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nama Orang Tua");

        txtAsalSMA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAsalSMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsalSMAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNIM)
                                    .addComponent(txtNama)
                                    .addComponent(txtAlamat)
                                    .addComponent(txtAsalSMA)
                                    .addComponent(txtNamaOrtu)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAsalSMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnInsert)
                    .addComponent(btnClear))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpload)
                    .addComponent(btnPrint))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIMActionPerformed
        txtNama.requestFocus();
    }//GEN-LAST:event_txtNIMActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        txtAlamat.requestFocus();
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBO_UASPU");
        EntityManager em = emf.createEntityManager();

        try {
            if (txtNIM.getText().isEmpty() || txtNama.getText().isEmpty() || txtAlamat.getText().isEmpty() || txtAsalSMA.getText().isEmpty() || txtNamaOrtu.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Isi Semua Kolom terlebih dahulu");
            } else {
                em.getTransaction().begin();

                Datamahasiswa mahasiswa = new Datamahasiswa();
                mahasiswa.setNim(txtNIM.getText());
                mahasiswa.setNama(txtNama.getText());
                mahasiswa.setAlamat(txtAlamat.getText());
                mahasiswa.setAsalSma(txtAsalSMA.getText());
                mahasiswa.setNamaOrangtua(txtNamaOrtu.getText());
                em.persist(mahasiswa);

                em.getTransaction().commit();

                JOptionPane.showMessageDialog(null, "Berhasil disimpan");

                tampil();
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        } finally {
            em.close();  
        }       
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBO_UASPU");
        EntityManager em = emf.createEntityManager();       

        try {

            if (txtNIM.getText().isEmpty() || txtNama.getText().isEmpty() || txtAlamat.getText().isEmpty() || txtAsalSMA.getText().isEmpty() || txtNamaOrtu.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Isi Semua Kolom terlebih dahulu");
            } else {
                em.getTransaction().begin();

                String Nim = txtNIM.getText();
                Datamahasiswa mahasiswa = em.find(Datamahasiswa.class, Nim);

                if (mahasiswa != null) {
                    mahasiswa.setNama(txtNama.getText());
                    mahasiswa.setAlamat(txtAlamat.getText());
                    mahasiswa.setAsalSma(txtAsalSMA.getText());
                    mahasiswa.setNamaOrangtua(txtNamaOrtu.getText());
                    em.getTransaction().commit();
                    JOptionPane.showMessageDialog(null, "data mahasiswa berhasil diperbarui");

                    tampil();
                } else {
                    JOptionPane.showMessageDialog(null, "data mahasiswa tidak ditemukan dengan NIM : " + Nim);
                    em.getTransaction().rollback();
                }
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Gagal memperbarui dataBuku");
            System.out.println(e.getMessage());
        } finally {
            em.close();  
        }}
    
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBO_UASPU");
        EntityManager em = emf.createEntityManager();

        try {
            if (txtNIM.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Masukkan NIM yang akan dihapus");
            } else {
                em.getTransaction().begin();
                
                String Nim = txtNIM.getText();
                Datamahasiswa mahasiswa = em.find(Datamahasiswa.class, Nim);

                if (mahasiswa != null) {
                    em.remove(mahasiswa);

                    em.getTransaction().commit();
                    JOptionPane.showMessageDialog(null, "data mahasiswa berhasil dihapus");

                    tampil();
                } else {
                    JOptionPane.showMessageDialog(null, "data mahasiswa tidak ditemukan dengan NIM : " + Nim);
                    em.getTransaction().rollback();
                }
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Gagal menghapus data mahasiswa");
            System.out.println(e.getMessage());
        } finally {
            em.close();  
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        bersih();
        txtNIM.setEditable(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void tbTabelMHSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTabelMHSMouseClicked
        int row = tbTabelMHS.getSelectedRow();
        txtNIM.setText(tbTabelMHS.getValueAt(row, 0).toString());
        txtNama.setText(tbTabelMHS.getValueAt(row, 1).toString());
        txtAlamat.setText(tbTabelMHS.getValueAt(row, 2).toString());
        txtAsalSMA.setText(tbTabelMHS.getValueAt(row, 3).toString());
        txtNamaOrtu.setText(tbTabelMHS.getValueAt(row, 4).toString());
        txtNIM.setEditable(false);
    }//GEN-LAST:event_tbTabelMHSMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            JasperReport reports;
            String path = "src\\uas_pbo\\report1.jasper";
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint print = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(print, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed

          JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBO_UASPU");
        EntityManager em = emf.createEntityManager();
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File filePilihan = jfc.getSelectedFile();
            System.out.println("yang dipilih : " + filePilihan.getAbsolutePath());

            try (BufferedReader br = new BufferedReader(new FileReader(filePilihan))) {
                Class.forName(driver);
                conn = DriverManager.getConnection(koneksi, user, password);
                String baris;
                String pemisah = ",";

                while ((baris = br.readLine()) != null) {
                    String[] data = baris.split(pemisah);
                    String NIM = data[0];
                    String nama = data[1];
                    String alamat = data[2];
                    String asal_sma = data[3];
                    String nama_ortu = data[4];

                    if (!NIM.isEmpty() && !nama.isEmpty() && !alamat.isEmpty() && !asal_sma.isEmpty() && !nama_ortu.isEmpty()) {
                        em.getTransaction().begin();

                        Datamahasiswa mk = new Datamahasiswa();
                        mk.setNim(NIM);
                        mk.setNama(nama);
                        mk.setAlamat(alamat);
                        mk.setAsalSma(asal_sma);
                        mk.setNamaOrangtua(nama_ortu);

                        em.persist(mk);

                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Sukses diinput");
                        tampil();
                    } else {
                        JOptionPane.showMessageDialog(null, "Gagal diinput");
                    }
                }
                em.close();  
                emf.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Gagal diinput");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Gagal diinput");
            } catch (ClassNotFoundException | SQLException ex) {
            }
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        login y = new login();
        y.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        txtAsalSMA.requestFocus();
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void txtAsalSMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsalSMAActionPerformed
        txtNamaOrtu.requestFocus();
    }//GEN-LAST:event_txtAsalSMAActionPerformed

    public void tampil() {
        EntityManager em = Persistence.createEntityManagerFactory("PBO_UASPU").createEntityManager();

        Query q = em.createNamedQuery("Datamahasiswa.findAll");
        List<Datamahasiswa> hasil = q.getResultList();

        DefaultTableModel tbmhs = new DefaultTableModel(new String[]{"NIM", "Nama", "Alamat", "Asal SMA", "Nama Orang Tua"}, 0);
        for (Datamahasiswa data : hasil) {
            Object[] baris = new Object[5];
            baris[0] = data.getNim();
            baris[1] = data.getNama();
            baris[2] = data.getAlamat();
            baris[3] = data.getAsalSma();
            baris[4] = data.getNamaOrangtua();
            tbmhs.addRow(baris);
        }
        tbTabelMHS.setModel(tbmhs);
    }

    public void bersih() {
        txtNIM.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtAsalSMA.setText("");
        txtNamaOrtu.setText("");
    }

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
            java.util.logging.Logger.getLogger(mahasiswa_uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswa_uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswa_uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswa_uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mahasiswa_uas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTabelMHS;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAsalSMA;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNamaOrtu;
    // End of variables declaration//GEN-END:variables

//    private int masukkanData(Connection conn, String nim, String nama, String SKS, String SemesterAjar) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    private void peringatan(String simpan_Gagal) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
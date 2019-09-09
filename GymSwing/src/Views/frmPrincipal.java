/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.EmpresaDAO;
import Models.Empresa;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author coron
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setInfos();
    }

    public void setInfos() {
        AtualizaDataHora();
        EmpresaDAO empDao = new EmpresaDAO();
        Empresa emp = empDao.getEmpresaPorId(1);
        lblVersaoSistema.setText(emp.getFantasia());
        

    }

    public void AtualizaDataHora() {
        Thread th = new Thread(new Runnable() { //cria uma thread
            public void run() {
                while (true) { //roda indefinidamente
                    Date data = (Date) Calendar.getInstance().getTime();
                    DateFormat d = DateFormat.getDateInstance();
                    DateFormat h = DateFormat.getTimeInstance();
                    lblData.setText(d.format(data));
                    lblHora.setText(h.format(data));
                    try {
                        Thread.sleep(1000); //espera 1 segundo para fazer a nova evolução
                    } catch (InterruptedException ex) {
                    }
                }
            }
        });
        th.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnFrmPrincipal = new javax.swing.JPanel();
        txtPainelInfo = new javax.swing.JPanel();
        lblVersaoSistema = new javax.swing.JLabel();
        lblUserLogado = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        btnAlunos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G - System");
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        pnFrmPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        txtPainelInfo.setBackground(new java.awt.Color(204, 204, 255));

        lblVersaoSistema.setText("Sistema versão");

        lblUserLogado.setText("usuario logado");

        lblData.setText("Data");

        lblHora.setText("Hora");

        javax.swing.GroupLayout txtPainelInfoLayout = new javax.swing.GroupLayout(txtPainelInfo);
        txtPainelInfo.setLayout(txtPainelInfoLayout);
        txtPainelInfoLayout.setHorizontalGroup(
            txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPainelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVersaoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblUserLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        txtPainelInfoLayout.setVerticalGroup(
            txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPainelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVersaoSistema)
                    .addComponent(lblUserLogado)
                    .addComponent(lblHora)
                    .addComponent(lblData))
                .addContainerGap())
        );

        btnAlunos.setText("ALUNOS");
        btnAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFrmPrincipalLayout = new javax.swing.GroupLayout(pnFrmPrincipal);
        pnFrmPrincipal.setLayout(pnFrmPrincipalLayout);
        pnFrmPrincipalLayout.setHorizontalGroup(
            pnFrmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPainelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnFrmPrincipalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFrmPrincipalLayout.setVerticalGroup(
            pnFrmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFrmPrincipalLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(txtPainelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnFrmPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnFrmPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosActionPerformed
        // TODO add your handling code here:
        frmListarAlunos  listarAlunos = new frmListarAlunos(true);
        listarAlunos.setVisible(true);
    }//GEN-LAST:event_btnAlunosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlunos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUserLogado;
    private javax.swing.JLabel lblVersaoSistema;
    private javax.swing.JPanel pnFrmPrincipal;
    private javax.swing.JPanel txtPainelInfo;
    // End of variables declaration//GEN-END:variables
}

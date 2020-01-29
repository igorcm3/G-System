/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.EmpresaDAO;
import Models.Empresa;
import Uteis.Funcoes;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author coron
 */
public class frmPrincipal extends javax.swing.JFrame {
    // Atributos
    private ImageIcon imgAlu;
    
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setInfos();
        Funcoes.setLookAndFellSistema();
    }

    public void setInfos() {
        AtualizaDataHora();
        EmpresaDAO empDao = new EmpresaDAO();
        Empresa emp = empDao.getEmpresaPorId(1);
        if (emp.equals(null)) {
            lblEmpresa.setText("Empresa não cadastrada");
        } else {
            lblEmpresa.setText(emp.getFantasia()); // para testes, ajsutar depois}

        }
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
        lblEmpresa = new javax.swing.JLabel();
        lblVersaoSistema = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btnAluno = new javax.swing.JPanel();
        lblAluno = new javax.swing.JLabel();
        menuTopo = new javax.swing.JMenuBar();
        menuNovo = new javax.swing.JMenu();
        alunoMenu = new javax.swing.JMenuItem();
        sep1 = new javax.swing.JPopupMenu.Separator();
        personalMenu = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G - System");
        setSize(new java.awt.Dimension(900, 500));

        pnFrmPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnFrmPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        pnFrmPrincipal.setPreferredSize(new java.awt.Dimension(900, 492));

        txtPainelInfo.setBackground(new java.awt.Color(237, 241, 244));

        lblEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEmpresa.setText("Empresa");

        lblVersaoSistema.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblVersaoSistema.setText("    Sistema versão");

        lblHora.setText("Hora");

        lblData.setText("Data");

        javax.swing.GroupLayout txtPainelInfoLayout = new javax.swing.GroupLayout(txtPainelInfo);
        txtPainelInfo.setLayout(txtPainelInfoLayout);
        txtPainelInfoLayout.setHorizontalGroup(
            txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPainelInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVersaoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        txtPainelInfoLayout.setVerticalGroup(
            txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPainelInfoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVersaoSistema)
                        .addComponent(lblEmpresa))
                    .addGroup(txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHora)
                        .addComponent(lblData)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAluno.setBackground(new java.awt.Color(246, 246, 250));
        btnAluno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlunoMouseClicked(evt);
            }
        });

        lblAluno.setBackground(new java.awt.Color(0, 0, 0));
        lblAluno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblAluno.setText("Alunos");

        javax.swing.GroupLayout btnAlunoLayout = new javax.swing.GroupLayout(btnAluno);
        btnAluno.setLayout(btnAlunoLayout);
        btnAlunoLayout.setHorizontalGroup(
            btnAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(btnAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnAlunoLayout.createSequentialGroup()
                    .addGap(0, 36, Short.MAX_VALUE)
                    .addComponent(lblAluno)
                    .addGap(0, 35, Short.MAX_VALUE)))
        );
        btnAlunoLayout.setVerticalGroup(
            btnAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(btnAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnAlunoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAluno)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnFrmPrincipalLayout = new javax.swing.GroupLayout(pnFrmPrincipal);
        pnFrmPrincipal.setLayout(pnFrmPrincipalLayout);
        pnFrmPrincipalLayout.setHorizontalGroup(
            pnFrmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFrmPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnFrmPrincipalLayout.createSequentialGroup()
                .addComponent(txtPainelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnFrmPrincipalLayout.setVerticalGroup(
            pnFrmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFrmPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                .addComponent(txtPainelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuTopo.setBackground(new java.awt.Color(255, 255, 255));
        menuTopo.setForeground(new java.awt.Color(255, 255, 255));

        menuNovo.setBackground(new java.awt.Color(0, 122, 217));
        menuNovo.setText("Novo");

        alunoMenu.setText("Aluno");
        alunoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoMenuActionPerformed(evt);
            }
        });
        menuNovo.add(alunoMenu);
        menuNovo.add(sep1);

        personalMenu.setText("Personal");
        menuNovo.add(personalMenu);

        menuTopo.add(menuNovo);

        menuAjuda.setBackground(new java.awt.Color(0, 122, 217));
        menuAjuda.setText("Ajuda");
        menuTopo.add(menuAjuda);

        setJMenuBar(menuTopo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnFrmPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnFrmPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
        
    private void alunoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoMenuActionPerformed
        // TODO add your handling code here:
        frmListarAlunos listarAlunos = new frmListarAlunos(true);
        listarAlunos.setVisible(true);
    }//GEN-LAST:event_alunoMenuActionPerformed

    private void btnAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlunoMouseClicked
        // TODO add your handling code here:
        frmListarAlunos listarAlunos = new frmListarAlunos(true);
        listarAlunos.setVisible(true);        
    }//GEN-LAST:event_btnAlunoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alunoMenu;
    private javax.swing.JPanel btnAluno;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblVersaoSistema;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuNovo;
    private javax.swing.JMenuBar menuTopo;
    private javax.swing.JMenuItem personalMenu;
    private javax.swing.JPanel pnFrmPrincipal;
    private javax.swing.JPopupMenu.Separator sep1;
    private javax.swing.JPanel txtPainelInfo;
    // End of variables declaration//GEN-END:variables
}

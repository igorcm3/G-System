/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.EmpresaDAO;
import Models.Empresa;
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

    private ImageIcon imgAlu;

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setInfos();
        setIconAluno(2);
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
    
    public void setIconAluno(int numIcon){
        BufferedImage img = null;
        try {
            // Here set the path to your image
            if (numIcon == 1) {
                img = ImageIO.read(new File("src/Imagens/ag1.png"));
            }else{
                img = ImageIO.read(new File("src/Imagens/ag2.png"));
            }     
        } catch (IOException e) {
        }
        imgAlu = new ImageIcon(img);
        btnAlunoImg.setIcon(imgAlu);
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
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblVersaoSistema = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        btnAlunoImg = new javax.swing.JLabel();
        menuTopo = new javax.swing.JMenuBar();
        menuNovo = new javax.swing.JMenu();
        alunoMenu = new javax.swing.JMenuItem();
        sep1 = new javax.swing.JPopupMenu.Separator();
        personalMenu = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G - System");
        setPreferredSize(new java.awt.Dimension(900, 500));
        setSize(new java.awt.Dimension(900, 500));

        pnFrmPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnFrmPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        pnFrmPrincipal.setPreferredSize(new java.awt.Dimension(900, 492));

        txtPainelInfo.setBackground(new java.awt.Color(237, 241, 244));
        txtPainelInfo.setPreferredSize(new java.awt.Dimension(900, 39));

        lblData.setText("Data");

        lblHora.setText("Hora");

        lblVersaoSistema.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblVersaoSistema.setText("    Sistema versão");

        lblEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEmpresa.setText("Empresa");

        javax.swing.GroupLayout txtPainelInfoLayout = new javax.swing.GroupLayout(txtPainelInfo);
        txtPainelInfo.setLayout(txtPainelInfoLayout);
        txtPainelInfoLayout.setHorizontalGroup(
            txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPainelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVersaoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        txtPainelInfoLayout.setVerticalGroup(
            txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPainelInfoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmpresa)
                        .addComponent(lblVersaoSistema))
                    .addGroup(txtPainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHora)
                        .addComponent(lblData)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAlunoImg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlunoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ag2.png"))); // NOI18N
        btnAlunoImg.setText("Aluno");
        btnAlunoImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlunoImgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlunoImgMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnFrmPrincipalLayout = new javax.swing.GroupLayout(pnFrmPrincipal);
        pnFrmPrincipal.setLayout(pnFrmPrincipalLayout);
        pnFrmPrincipalLayout.setHorizontalGroup(
            pnFrmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPainelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
            .addGroup(pnFrmPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlunoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFrmPrincipalLayout.setVerticalGroup(
            pnFrmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFrmPrincipalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnAlunoImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(txtPainelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuTopo.setBackground(new java.awt.Color(0, 122, 217));
        menuTopo.setForeground(new java.awt.Color(0, 122, 217));

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
            .addComponent(pnFrmPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnFrmPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alunoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoMenuActionPerformed
        // TODO add your handling code here:
        frmListarAlunos listarAlunos = new frmListarAlunos(true);
        listarAlunos.setVisible(true);
    }//GEN-LAST:event_alunoMenuActionPerformed

    private void btnAlunoImgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlunoImgMouseReleased
        // TODO add your handling code here:
        setIconAluno(2);
        frmListarAlunos listarAlunos = new frmListarAlunos(true);
        listarAlunos.setVisible(true);        
    }//GEN-LAST:event_btnAlunoImgMouseReleased

    private void btnAlunoImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlunoImgMousePressed
        // TODO add your handling code here:
        setIconAluno(1);       
    }//GEN-LAST:event_btnAlunoImgMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alunoMenu;
    private javax.swing.JLabel btnAlunoImg;
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

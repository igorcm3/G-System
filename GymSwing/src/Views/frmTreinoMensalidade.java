package Views;

import DAO.TreinoDAO;
import Models.Treino;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class frmTreinoMensalidade extends javax.swing.JDialog {

    protected frmAluno frameAluno;

    public frmTreinoMensalidade(boolean modal, frmAluno framAluno) {
        this.setModal(modal);
        initComponents();
        setLocationRelativeTo(null);
        this.frameAluno = framAluno;
        carregarTreinoMensalidade();
        carregarTreinos();
    }
    
    public void carregarTreinos() {

        TreinoDAO pDAO = new TreinoDAO();
        List<Treino> t = pDAO.listarTreinos();
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel();
        for (Treino tr : t) {
            defaultComboBox.addElement(tr);
        }
        cbTreinos.setModel(defaultComboBox);

    }

    private void carregarTreinoMensalidade() {
        // if aluno existe, carrega mensalidade para edi;áo, else desablida, aguarda configurar treino
        habilitaMensalidade(false);
    }

    private void habilitaMensalidade(boolean hab) {
        txtValor.setEnabled(hab);
        cbStatus.setEnabled(hab);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelTreino = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnConfirmarTreinmo = new javax.swing.JButton();
        painelPossuiPersonal = new javax.swing.JPanel();
        rbUsaPersonalSim = new javax.swing.JRadioButton();
        rbUsaPersonalNao = new javax.swing.JRadioButton();
        painelTreinos = new javax.swing.JPanel();
        cbTreinos = new javax.swing.JComboBox<>();
        btnNovoTreino = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        painelResumoTreino = new javax.swing.JPanel();
        lblInfoTreino = new javax.swing.JLabel();
        lblInfotreino2 = new javax.swing.JLabel();
        lblinfoTreino3 = new javax.swing.JLabel();
        painelMensalidade = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblMensalidade = new javax.swing.JLabel();
        lblTreino = new javax.swing.JLabel();
        sep = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Treino e mensalidade");

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));

        painelTreino.setBackground(new java.awt.Color(255, 255, 255));
        painelTreino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setText("*Após selecionar o treino, clique em \"Confirmar\" para gerar a mensalidade");

        btnConfirmarTreinmo.setText("Confirmar");
        btnConfirmarTreinmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarTreinmoActionPerformed(evt);
            }
        });

        painelPossuiPersonal.setBackground(new java.awt.Color(255, 255, 255));
        painelPossuiPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Utiliza personal?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        rbUsaPersonalSim.setBackground(new java.awt.Color(255, 255, 255));
        rbUsaPersonalSim.setSelected(true);
        rbUsaPersonalSim.setText("Não");
        rbUsaPersonalSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbUsaPersonalSimMouseClicked(evt);
            }
        });

        rbUsaPersonalNao.setBackground(new java.awt.Color(255, 255, 255));
        rbUsaPersonalNao.setText("Sim");
        rbUsaPersonalNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbUsaPersonalNaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelPossuiPersonalLayout = new javax.swing.GroupLayout(painelPossuiPersonal);
        painelPossuiPersonal.setLayout(painelPossuiPersonalLayout);
        painelPossuiPersonalLayout.setHorizontalGroup(
            painelPossuiPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPossuiPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPossuiPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbUsaPersonalSim, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(rbUsaPersonalNao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        painelPossuiPersonalLayout.setVerticalGroup(
            painelPossuiPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPossuiPersonalLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(rbUsaPersonalSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbUsaPersonalNao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTreinos.setBackground(new java.awt.Color(255, 255, 255));
        painelTreinos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Escolha o treino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        cbTreinos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnNovoTreino.setText("+");
        btnNovoTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoTreinoActionPerformed(evt);
            }
        });

        jLabel5.setText("Cadastrar treino");

        javax.swing.GroupLayout painelTreinosLayout = new javax.swing.GroupLayout(painelTreinos);
        painelTreinos.setLayout(painelTreinosLayout);
        painelTreinosLayout.setHorizontalGroup(
            painelTreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTreinos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelTreinosLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovoTreino)))
                .addContainerGap())
        );
        painelTreinosLayout.setVerticalGroup(
            painelTreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelTreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        painelResumoTreino.setBackground(new java.awt.Color(252, 248, 248));
        painelResumoTreino.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Resumo do treino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        lblInfoTreino.setText("Treino: ");

        lblInfotreino2.setText("Utuliza personal:");

        lblinfoTreino3.setText("Mensalidade sugerida:");

        javax.swing.GroupLayout painelResumoTreinoLayout = new javax.swing.GroupLayout(painelResumoTreino);
        painelResumoTreino.setLayout(painelResumoTreinoLayout);
        painelResumoTreinoLayout.setHorizontalGroup(
            painelResumoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResumoTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelResumoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfotreino2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblinfoTreino3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelResumoTreinoLayout.setVerticalGroup(
            painelResumoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResumoTreinoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfoTreino)
                .addGap(18, 18, 18)
                .addComponent(lblInfotreino2)
                .addGap(18, 18, 18)
                .addComponent(lblinfoTreino3)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout painelTreinoLayout = new javax.swing.GroupLayout(painelTreino);
        painelTreino.setLayout(painelTreinoLayout);
        painelTreinoLayout.setHorizontalGroup(
            painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addGroup(painelTreinoLayout.createSequentialGroup()
                        .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelResumoTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelTreinoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnConfirmarTreinmo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelTreinoLayout.createSequentialGroup()
                                .addComponent(painelPossuiPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(painelTreinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        painelTreinoLayout.setVerticalGroup(
            painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPossuiPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTreinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelResumoTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(btnConfirmarTreinmo)
                .addContainerGap())
        );

        painelMensalidade.setBackground(new java.awt.Color(255, 255, 255));
        painelMensalidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true));

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor");

        jLabel2.setText("Status");

        jLabel3.setText("Data pagamento");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "Não pago" }));

        javax.swing.GroupLayout painelMensalidadeLayout = new javax.swing.GroupLayout(painelMensalidade);
        painelMensalidade.setLayout(painelMensalidadeLayout);
        painelMensalidadeLayout.setHorizontalGroup(
            painelMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMensalidadeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelMensalidadeLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelMensalidadeLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        painelMensalidadeLayout.setVerticalGroup(
            painelMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMensalidadeLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(painelMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(painelMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jButton1.setText("Salvar");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblMensalidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMensalidade.setForeground(new java.awt.Color(1, 12, 119));
        lblMensalidade.setText("Mensalidade");

        lblTreino.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTreino.setForeground(new java.awt.Color(1, 12, 119));
        lblTreino.setText("Treino");

        sep.setForeground(new java.awt.Color(83, 83, 84));
        sep.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(painelTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(sep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(painelMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelMensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sep))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnNovoTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoTreinoActionPerformed
        // TODO add your handling code here:
        frmTreino frmtreino = new frmTreino(true);
        frmtreino.setVisible(true);
    }//GEN-LAST:event_btnNovoTreinoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnConfirmarTreinmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarTreinmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarTreinmoActionPerformed

    private void rbUsaPersonalSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbUsaPersonalSimMouseClicked
        // TODO add your handling code here:
        if (rbUsaPersonalSim.isSelected()) {
            rbUsaPersonalNao.setSelected(false);
        } else {
            rbUsaPersonalSim.setSelected(true);
        }

    }//GEN-LAST:event_rbUsaPersonalSimMouseClicked

    private void rbUsaPersonalNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbUsaPersonalNaoMouseClicked
        // TODO add your handling code here:
        if (rbUsaPersonalNao.isSelected()) {
            rbUsaPersonalSim.setSelected(false);

        } else {
            rbUsaPersonalNao.setSelected(true);
        }
    }//GEN-LAST:event_rbUsaPersonalNaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarTreinmo;
    private javax.swing.JButton btnNovoTreino;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbTreinos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblInfoTreino;
    private javax.swing.JLabel lblInfotreino2;
    private javax.swing.JLabel lblMensalidade;
    private javax.swing.JLabel lblTreino;
    private javax.swing.JLabel lblinfoTreino3;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelMensalidade;
    private javax.swing.JPanel painelPossuiPersonal;
    private javax.swing.JPanel painelResumoTreino;
    private javax.swing.JPanel painelTreino;
    private javax.swing.JPanel painelTreinos;
    private javax.swing.JRadioButton rbUsaPersonalNao;
    private javax.swing.JRadioButton rbUsaPersonalSim;
    private javax.swing.JSeparator sep;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

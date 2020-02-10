package Views;

import DAO.MensalidadeDAO;
import DAO.TreinoDAO;
import Models.Mensalidade;
import Models.Treino;
import Uteis.Funcoes;
import Uteis.FuncoesBD;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class frmTreinoMensalidade extends javax.swing.JDialog {

    protected Treino treino;
    protected Mensalidade mensalidade;
    protected frmAluno frameAluno;
//    protected SimpleDateFormat formatarData;

    public frmTreinoMensalidade(boolean modal, frmAluno framAluno) {
        this.setModal(modal);
        initComponents();
        setLocationRelativeTo(null);
        this.frameAluno = framAluno;
        carregarTreinoMensalidade();
        carregarTreinos();
        mensalidade = new Mensalidade();
//        formatarData = new SimpleDateFormat("dd-MM-yyyy");
//        jCalendar.addPropertyChangeListener(
//            new PropertyChangeListener() {
//            @Override
//            public void propertyChange(PropertyChangeEvent e) {
//                atualizaData();
//            }
//        });
//        jCalendar.getCalendar().setTime(new Date());
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
        btnSalvar.setEnabled(hab);
    }

    private void PreencherLabelsTreino() {
        if (treino.equals(null)) {

        }
        lblTreino.setText("Treino: " + treino.toString());
        if (rbUsaPersonalSim.isSelected()) {
            lblUtilizaPersonal.setText("Utiliza personal: Sim");
        } else {
            lblUtilizaPersonal.setText("Utiliza personal: Não");
        }
    }

    private void selecionarTreinoCombo() {
        TreinoDAO pDAO = new TreinoDAO();
        treino = (Treino) cbTreinos.getSelectedItem();
    }
//
//    private void atualizaData() {
//        if (jCalendar.getCalendar().getTime() == null) {
//            System.exit(0);
//        }
//        txtDataFormatada.setText(formatarData.format(jCalendar.getCalendar().getTime()));
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelTreino = new javax.swing.JPanel();
        btnConfirmarTreinmo = new javax.swing.JButton();
        painelPossuiPersonal = new javax.swing.JPanel();
        rbUsaPersonalSim = new javax.swing.JRadioButton();
        rbUsaPersonalNao = new javax.swing.JRadioButton();
        painelTreinos = new javax.swing.JPanel();
        cbTreinos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Treino = new javax.swing.JLabel();
        sep = new javax.swing.JSeparator();
        painelResumoTreino = new javax.swing.JPanel();
        lblTreino = new javax.swing.JLabel();
        lblUtilizaPersonal = new javax.swing.JLabel();
        lblTreinoDiasSemana = new javax.swing.JLabel();
        lblValorTreino = new javax.swing.JLabel();
        lblMensalidade1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Treino e mensalidade");
        setResizable(false);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));
        painelFundo.setPreferredSize(new java.awt.Dimension(790, 490));

        painelTreino.setBackground(new java.awt.Color(255, 255, 255));
        painelTreino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true));

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
                .addGroup(painelPossuiPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbUsaPersonalNao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbUsaPersonalSim, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        painelPossuiPersonalLayout.setVerticalGroup(
            painelPossuiPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPossuiPersonalLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(rbUsaPersonalSim)
                .addGap(18, 18, 18)
                .addComponent(rbUsaPersonalNao)
                .addGap(24, 24, 24))
        );

        painelTreinos.setBackground(new java.awt.Color(255, 255, 255));
        painelTreinos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Escolha o treino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        cbTreinos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout painelTreinosLayout = new javax.swing.GroupLayout(painelTreinos);
        painelTreinos.setLayout(painelTreinosLayout);
        painelTreinosLayout.setHorizontalGroup(
            painelTreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTreinosLayout.setVerticalGroup(
            painelTreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(cbTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 8, 123), 2), "Informe o valor da mensalidade"));

        jLabel1.setText("Valor");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout painelTreinoLayout = new javax.swing.GroupLayout(painelTreino);
        painelTreino.setLayout(painelTreinoLayout);
        painelTreinoLayout.setHorizontalGroup(
            painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelTreinoLayout.createSequentialGroup()
                        .addComponent(painelPossuiPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelTreinoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmarTreinmo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        painelTreinoLayout.setVerticalGroup(
            painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPossuiPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTreinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmarTreinmo)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Treino.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Treino.setForeground(new java.awt.Color(1, 12, 119));
        Treino.setText("Treino");

        sep.setForeground(new java.awt.Color(83, 83, 84));
        sep.setOrientation(javax.swing.SwingConstants.VERTICAL);

        painelResumoTreino.setBackground(new java.awt.Color(252, 248, 248));
        painelResumoTreino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true));

        lblTreino.setText("Treino:");
        lblTreino.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblUtilizaPersonal.setText("Utiliza personal:");

        lblTreinoDiasSemana.setText("Dias semana:");
        lblTreinoDiasSemana.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblValorTreino.setText("Valor a ser pago mensalmente: ");

        javax.swing.GroupLayout painelResumoTreinoLayout = new javax.swing.GroupLayout(painelResumoTreino);
        painelResumoTreino.setLayout(painelResumoTreinoLayout);
        painelResumoTreinoLayout.setHorizontalGroup(
            painelResumoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResumoTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelResumoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUtilizaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTreinoDiasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        painelResumoTreinoLayout.setVerticalGroup(
            painelResumoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResumoTreinoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTreino)
                .addGap(18, 18, 18)
                .addComponent(lblTreinoDiasSemana)
                .addGap(18, 18, 18)
                .addComponent(lblUtilizaPersonal)
                .addGap(18, 18, 18)
                .addComponent(lblValorTreino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblMensalidade1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMensalidade1.setForeground(new java.awt.Color(1, 12, 119));
        lblMensalidade1.setText("Resumo da Mensalidade");

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Treino, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(painelTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelResumoTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(lblMensalidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Treino, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensalidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sep)
                    .addComponent(painelResumoTreino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnSalvar))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnConfirmarTreinmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarTreinmoActionPerformed
        // TODO add your handling code here:
        selecionarTreinoCombo();
        PreencherLabelsTreino();
        habilitaMensalidade(true);
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (treino.equals(null)) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar mensalidade, verifique o treino!", "Mensalidade", 1);
            System.exit(0);
        } else {
            if (txtValor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o valor para a mensalidade!", "Mensalidade", 1);  
            }else {
            mensalidade.setIdTreino(treino);
            //mensalidade.setPago(cbStatus.getSelectedIndex() == 0);
            mensalidade.setValor(Float.parseFloat(txtValor.getText()));
            //mensalidade.setDataPagamento(new Date());
            MensalidadeDAO mDAO = new MensalidadeDAO();
            mDAO.persist(mensalidade);
            frameAluno.setMensalidade(mensalidade);
            frameAluno.atualizarMensalidade();
            int resultMenssage = Funcoes.MsgConfirmaçãoOk("Mensalidade gerada com suceso!", "Mensalidade");
            if (resultMenssage >= 0) {
                this.dispose();
            }            
            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Treino;
    private javax.swing.JButton btnConfirmarTreinmo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbTreinos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensalidade1;
    private javax.swing.JLabel lblTreino;
    private javax.swing.JLabel lblTreinoDiasSemana;
    private javax.swing.JLabel lblUtilizaPersonal;
    private javax.swing.JLabel lblValorTreino;
    private javax.swing.JPanel painelFundo;
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

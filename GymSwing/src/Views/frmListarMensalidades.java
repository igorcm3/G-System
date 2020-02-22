package Views;

import DAO.MensalidadeDAO;
import Models.Mensalidade;
import Models.Treino;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Igor Corona
 */
public class frmListarMensalidades extends javax.swing.JDialog {

    protected ImageIcon imgAlu;
    protected frmAluno frameAluno;
    private DefaultListModel listaMensalidades = new DefaultListModel();
    protected Mensalidade mensalidade;
    protected boolean origemAluno;

    public frmListarMensalidades(frmAluno framAluno) {
        iniciarTela();
        this.frameAluno = framAluno;
        origemAluno = true;
        btnConfirmar.setVisible(true);
        btnSair.setVisible(true);
    }

    public frmListarMensalidades() {
        iniciarTela();
        origemAluno = false;
        btnConfirmar.setVisible(false);
        btnSair.setVisible(false);
    }

    public void iniciarTela() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
        carregarMensalidades();
    }

    public void carregarMensalidades() {
        listaMensalidades = new DefaultListModel();
        MensalidadeDAO mDAO = new MensalidadeDAO();
        List<Mensalidade> mensalidades = mDAO.listarMensalidade();
        for (Mensalidade m : mensalidades) {
            listaMensalidades.addElement(m);
        }
        jListMensalidades.setModel(listaMensalidades);
        jListMensalidades.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    System.out.println("Index lista -> " + jListMensalidades.getSelectedIndex());
                    mensalidade = (Mensalidade) listaMensalidades.getElementAt(jListMensalidades.getSelectedIndex());
                    atualizaLabelsInfo(!jListMensalidades.isSelectionEmpty());
                }
            }
        });
    }

    public void atualizaLabelsInfo(boolean HaIndexSelecionado) {
        lblMensalidadeTitle.setVisible(HaIndexSelecionado);
        lblMensalidade.setVisible(HaIndexSelecionado);
        lblTreino.setVisible(HaIndexSelecionado);
        lblValor.setVisible(HaIndexSelecionado);
        lblDiasSemana.setVisible(!HaIndexSelecionado);
        if ((HaIndexSelecionado) && (!mensalidade.equals(null))) {
            lblMensalidade.setText("Mensalidade: " + mensalidade.toString());
            lblTreino.setText("Treino: " + mensalidade.getIdTreino().toString().substring(0, 27) + ".");
            lblValor.setText("Valor: R$:" + mensalidade.getValor());
            lblDiasSemana.setText("Dias da semana: " + mensalidade.getIdTreino().getDiasSemana());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMensalidades = new javax.swing.JList<>();
        btnConfirmar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblBtnAdd = new javax.swing.JLabel();
        lblBtnRemover = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMensalidade = new javax.swing.JLabel();
        lblTreino = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblDiasSemana = new javax.swing.JLabel();
        lblMensalidadeTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mensalidade");
        setMaximumSize(new java.awt.Dimension(375, 490));
        setPreferredSize(new java.awt.Dimension(375, 490));
        setResizable(false);
        setSize(new java.awt.Dimension(375, 490));

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));
        painelFundo.setMaximumSize(new java.awt.Dimension(375, 490));

        jListMensalidades.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jListMensalidades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListMensalidades.setToolTipText("");
        jListMensalidades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jListMensalidades);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        lblBtnAdd.setBackground(new java.awt.Color(153, 255, 255));
        lblBtnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add_60.png"))); // NOI18N
        lblBtnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBtnAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBtnAddMouseReleased(evt);
            }
        });
        jPanel1.add(lblBtnAdd);

        lblBtnRemover.setBackground(new java.awt.Color(153, 255, 255));
        lblBtnRemover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lixeira_60.png"))); // NOI18N
        lblBtnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBtnRemoverMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBtnRemoverMouseReleased(evt);
            }
        });
        jPanel1.add(lblBtnRemover);

        jPanel2.setBackground(new java.awt.Color(153, 214, 236));
        jPanel2.setMaximumSize(new java.awt.Dimension(204, 163));
        jPanel2.setMinimumSize(new java.awt.Dimension(204, 163));

        lblMensalidade.setText("Mensalidade:");

        lblTreino.setText("Mensalidade:");

        lblValor.setText("Mensalidade:");

        lblDiasSemana.setText("Mensalidade:");

        lblMensalidadeTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMensalidadeTitle.setText("Mensalidade selecionada");
        lblMensalidadeTitle.setToolTipText("");
        lblMensalidadeTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblMensalidadeTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDiasSemana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblMensalidadeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensalidade)
                .addGap(18, 18, 18)
                .addComponent(lblTreino)
                .addGap(18, 18, 18)
                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDiasSemana)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar)
                    .addComponent(btnSair))
                .addGap(62, 62, 62))
        );

        getContentPane().add(painelFundo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAddMousePressed
        // TODO add your handling code here:
        imgAlu = new ImageIcon("src\\Imagens\\add_30.png");
        lblBtnAdd.setIcon(imgAlu);
    }//GEN-LAST:event_lblBtnAddMousePressed

    private void lblBtnAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAddMouseReleased
        // TODO add your handling code here:
        imgAlu = new ImageIcon("src\\Imagens\\add_60.png");
        lblBtnAdd.setIcon(imgAlu);
        frmTreinoMensalidade telaTreinoMernsalidade = new frmTreinoMensalidade();
        telaTreinoMernsalidade.setVisible(true);
    }//GEN-LAST:event_lblBtnAddMouseReleased

    private void lblBtnRemoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnRemoverMousePressed
        // TODO add your handling code here:
        imgAlu = new ImageIcon("src\\Imagens\\lixeira_30.png");
        lblBtnRemover.setIcon(imgAlu);
    }//GEN-LAST:event_lblBtnRemoverMousePressed

    private void lblBtnRemoverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnRemoverMouseReleased
        // TODO add your handling code here:
        imgAlu = new ImageIcon("src\\Imagens\\lixeira_60.png");
        lblBtnRemover.setIcon(imgAlu);
        //Metodo de exclusao.
    }//GEN-LAST:event_lblBtnRemoverMouseReleased

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        mensalidade = (Mensalidade) listaMensalidades.getElementAt(jListMensalidades.getSelectedIndex());

        if (origemAluno) {

            frameAluno.setMensalidade(mensalidade);
            //gerarMensalidadeAluno(frameAluno.aluno, );
            //frameAluno.atualizarMensalidade();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSair;
    private javax.swing.JList<String> jListMensalidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBtnAdd;
    private javax.swing.JLabel lblBtnRemover;
    private javax.swing.JLabel lblDiasSemana;
    private javax.swing.JLabel lblMensalidade;
    private javax.swing.JLabel lblMensalidadeTitle;
    private javax.swing.JLabel lblTreino;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painelFundo;
    // End of variables declaration//GEN-END:variables
}

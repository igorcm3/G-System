package Views;

import DAO.AlunoDAO;
import Models.Aluno;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class frmListarAlunos extends javax.swing.JDialog {
    private ImageIcon imgAlu;
    private DefaultTableModel dtm;

    public frmListarAlunos(Boolean modal) {
        setModal(modal);
        initComponents();
        setLocationRelativeTo(null);
        atualizaTabela();       
    }

    // metodos
    public void atualizaTabela() {
        dtm = (DefaultTableModel) tableAlunos.getModel();
        AlunoDAO alunoDao = new AlunoDAO();
        try {
            List<Aluno> listaAluno = alunoDao.listarAlunos();    
            for (Aluno aluno : listaAluno) {
                //string nome, string treino, string personal, float valor, pago string
                dtm.insertRow(dtm.getRowCount(), new Object[]{retornaAlunoNome(aluno.getNome()),
                    retornaTreino(aluno),
                    retornaPersonal(aluno),
                    retornaMensalidade(aluno.getIdMensalidade().getValor()),
                    retornaAlunoPago(aluno.getIdMensalidade().getPago())
                }); // refatorar! utilizaR METODO NA CLASSE Funcoes que retorna o array de object, ja formatado, levar todas as funcoes de "retorna" para la 
            }
        } catch (Exception e) {
            //Funcoes.MsgSimples(e.toString(), "Erro");
        }
    }

    public String retornaAlunoPago(Boolean pago) {
        if (pago) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    //------------------ VERIFICAR ESSAS VALICAD;ÖES, ALUNS CAMPOS SAO OBRIGATORIOS NMOP CADASTRO DE ALUNO< USADO SOMENTE PARA TESTES AS FUNCOES.
    public String retornaAlunoNome(String nome) {
        if (!nome.equals("")) {
            return nome;
        } else {
            return "Sem nome";
        }
    }

    public String retornaTreino(Aluno a) {
        if (a.getIdMensalidade().getIdTreino() == null) {
            return "Sem treino cadastrado";
        } else {
            return a.getIdMensalidade().getIdTreino().getNome();
        }
    }

    public String retornaPersonal(Aluno a) {
        if (a.getIdPersonal() == null) {
            return "Sem";
        } else {
            return a.getIdPersonal().getNome();
        }
    }

    public Float retornaMensalidade(Float p) {
        if (!p.equals(null)) {
            return p;
        } else {
            return Float.parseFloat("0.0");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnListarAlunos = new javax.swing.JPanel();
        painelCabecalho = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        lblBtnAdd = new javax.swing.JLabel();
        lblBtnRemover = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        painelPesquisar = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblBtnProcurar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos");
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(20, 0));

        pnListarAlunos.setBackground(new java.awt.Color(255, 255, 255));
        pnListarAlunos.setPreferredSize(new java.awt.Dimension(790, 490));
        pnListarAlunos.setLayout(new javax.swing.BoxLayout(pnListarAlunos, javax.swing.BoxLayout.Y_AXIS));

        painelCabecalho.setBackground(new java.awt.Color(255, 255, 255));
        painelCabecalho.setPreferredSize(new java.awt.Dimension(790, 100));
        painelCabecalho.setRequestFocusEnabled(false);

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

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

        lblBtnRemover.setBackground(new java.awt.Color(153, 255, 255));
        lblBtnRemover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lixeira_60_1.png"))); // NOI18N
        lblBtnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBtnRemoverMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBtnRemoverMouseReleased(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        painelPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        painelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Pesquisar"));

        txtPesquisa.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBtnProcurar.setBackground(new java.awt.Color(153, 255, 255));
        lblBtnProcurar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search_48.png"))); // NOI18N
        lblBtnProcurar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelPesquisarLayout = new javax.swing.GroupLayout(painelPesquisar);
        painelPesquisar.setLayout(painelPesquisarLayout);
        painelPesquisarLayout.setHorizontalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBtnProcurar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPesquisarLayout.setVerticalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
        painelCabecalho.setLayout(painelCabecalhoLayout);
        painelCabecalhoLayout.setHorizontalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblBtnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCabecalhoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblBtnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pnListarAlunos.add(painelCabecalho);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tableAlunos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        tableAlunos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Treino", "Personal", "Valor", "Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAlunos.setFocusCycleRoot(true);
        tableAlunos.setGridColor(new java.awt.Color(255, 255, 255));
        tableAlunos.setIntercellSpacing(new java.awt.Dimension(1, 5));
        tableAlunos.setRowHeight(22);
        tableAlunos.setSelectionBackground(new java.awt.Color(161, 203, 235));
        tableAlunos.setSelectionForeground(new java.awt.Color(51, 51, 255));
        tableAlunos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableAlunos);
        if (tableAlunos.getColumnModel().getColumnCount() > 0) {
            tableAlunos.getColumnModel().getColumn(0).setMinWidth(250);
            tableAlunos.getColumnModel().getColumn(0).setPreferredWidth(250);
            tableAlunos.getColumnModel().getColumn(0).setMaxWidth(600);
            tableAlunos.getColumnModel().getColumn(1).setMinWidth(230);
            tableAlunos.getColumnModel().getColumn(1).setPreferredWidth(230);
            tableAlunos.getColumnModel().getColumn(1).setMaxWidth(600);
            tableAlunos.getColumnModel().getColumn(2).setMinWidth(110);
            tableAlunos.getColumnModel().getColumn(2).setPreferredWidth(110);
            tableAlunos.getColumnModel().getColumn(2).setMaxWidth(300);
            tableAlunos.getColumnModel().getColumn(3).setResizable(false);
            tableAlunos.getColumnModel().getColumn(4).setResizable(false);
        }

        pnListarAlunos.add(jScrollPane1);

        getContentPane().add(pnListarAlunos, java.awt.BorderLayout.CENTER);

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
        frmAluno telaAluno = new frmAluno(true, true);
        telaAluno.setVisible(true);        
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBtnAdd;
    private javax.swing.JLabel lblBtnProcurar;
    private javax.swing.JLabel lblBtnRemover;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelPesquisar;
    private javax.swing.JPanel pnListarAlunos;
    private javax.swing.JTable tableAlunos;
    private javax.swing.JFormattedTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}

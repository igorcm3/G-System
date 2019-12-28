package Views;

import DAO.AlunoDAO;
import Models.Aluno;
import Uteis.Funcoes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class frmListarAlunos extends javax.swing.JDialog {

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlunos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos");
        setResizable(false);

        pnListarAlunos.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tableAlunos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableAlunos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableAlunos.setForeground(new java.awt.Color(0, 102, 255));
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
        tableAlunos.setGridColor(new java.awt.Color(255, 255, 255));
        tableAlunos.setIntercellSpacing(new java.awt.Dimension(1, 5));
        tableAlunos.setRowHeight(22);
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

        jButton1.setText("Novo aluno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");

        jLabel1.setText("Opções de filtro");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Aluno:");

        javax.swing.GroupLayout pnListarAlunosLayout = new javax.swing.GroupLayout(pnListarAlunos);
        pnListarAlunos.setLayout(pnListarAlunosLayout);
        pnListarAlunosLayout.setHorizontalGroup(
            pnListarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListarAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnListarAlunosLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListarAlunosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        pnListarAlunosLayout.setVerticalGroup(
            pnListarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListarAlunosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnListarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnListarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnListarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnListarAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnListarAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmAluno aluno = new frmAluno(true, true);
        aluno.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnListarAlunos;
    private javax.swing.JTable tableAlunos;
    // End of variables declaration//GEN-END:variables
}

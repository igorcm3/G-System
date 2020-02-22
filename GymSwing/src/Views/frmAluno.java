/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.AlunoDAO;
import DAO.PersonalDAO;
import Models.Aluno;
import Models.Enderecos;
import Models.Medidas;
import Models.Mensalidade;
import Models.Personal;
import Models.Receber;
import Models.Treino;
import Uteis.Funcoes;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author coron
 */
public class frmAluno extends javax.swing.JDialog {

    protected Aluno aluno;
    protected Enderecos endereco;
    protected Medidas medidas;
    protected Personal personal;
    protected Treino treino;
    protected Mensalidade mensalidade;
    protected Receber receber;
    protected boolean novoAluno;

    /**
     * Creates new form frmAluno
     */
    public frmAluno(boolean modal, boolean novoAluno) {
        setModal(modal);
        this.novoAluno = novoAluno;
        initComponents();
        setLocationRelativeTo(null);
        aluno = new Aluno();
        personal = new Personal();
        rbMasc.setSelected(true);
        rbPersonalNao.setSelected(true);
        // PreencherCamposAluno(novoAluno);
        this.getContentPane().setBackground(Color.white);
        carregarPersonais();
    }

    public void atualizarMensalidade() {
        lblTreino.setText(mensalidade.getIdTreino().toString() + "  " + mensalidade.getIdTreino().getQuantidadeSemana() + "x");
        if (!novoAluno) {
            lblMensalidade.setText(mensalidade.getValor() + " - " + receber.getDataPagamento().toString());
            if (receber.getPago()) {
                lblStatusMensalidade.setBackground(Color.green);
                lblStatusMensalidade.setForeground(Color.green);
                lblStatusMensalidade.setText("Pago!");
            } else {
                lblStatusMensalidade.setBackground(Color.red);
                lblStatusMensalidade.setForeground(Color.red);
                lblStatusMensalidade.setText("Não Pago!");
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvarAluno = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        painelAbas = new javax.swing.JTabbedPane();
        painelALuno = new javax.swing.JPanel();
        painelAluno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbMasc = new javax.swing.JRadioButton();
        rbFem = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRgCpf = new javax.swing.JTextField();
        painelEnderecoAluno = new javax.swing.JPanel();
        btnEndereco = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        painelPersonal = new javax.swing.JPanel();
        cbPersonais = new javax.swing.JComboBox<>();
        rbPersonalSim = new javax.swing.JRadioButton();
        rbPersonalNao = new javax.swing.JRadioButton();
        separador = new javax.swing.JSeparator();
        painelFUndoAbaMensalidade = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblStatusMensalidade = new javax.swing.JLabel();
        lblMensalidade = new javax.swing.JLabel();
        lblTreino = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bntnMensalidade = new javax.swing.JButton();
        lblMensalidade1 = new javax.swing.JLabel();
        lblMensalidade2 = new javax.swing.JLabel();
        btnGerarReceber = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aluno");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(790, 490));
        setPreferredSize(new java.awt.Dimension(790, 490));
        setResizable(false);
        setSize(new java.awt.Dimension(790, 490));

        btnSalvarAluno.setText("Salvar");
        btnSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlunoActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        painelAbas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                painelAbasStateChanged(evt);
            }
        });

        painelALuno.setBackground(new java.awt.Color(255, 255, 255));
        painelALuno.setPreferredSize(new java.awt.Dimension(790, 490));

        painelAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel2.setText("Nome");

        jLabel4.setText("Sexo");

        rbMasc.setBackground(new java.awt.Color(255, 255, 255));
        rbMasc.setText("Masculino");
        rbMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMascActionPerformed(evt);
            }
        });

        rbFem.setBackground(new java.awt.Color(255, 255, 255));
        rbFem.setText("Femenino");
        rbFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemActionPerformed(evt);
            }
        });

        jLabel3.setText("Celular");

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        jLabel5.setText("CPF");

        txtRgCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRgCpfKeyTyped(evt);
            }
        });

        painelEnderecoAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelEnderecoAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        btnEndereco.setText("Adicionar endereço");
        btnEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnderecoActionPerformed(evt);
            }
        });

        lblEndereco.setText("Endereço: ");

        lblNumero.setText("Nº: ");

        lblCidade.setText("Cidade: ");

        lblEstado.setText("UF:");

        javax.swing.GroupLayout painelEnderecoAlunoLayout = new javax.swing.GroupLayout(painelEnderecoAluno);
        painelEnderecoAluno.setLayout(painelEnderecoAlunoLayout);
        painelEnderecoAlunoLayout.setHorizontalGroup(
            painelEnderecoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEnderecoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelEnderecoAlunoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelEnderecoAlunoLayout.setVerticalGroup(
            painelEnderecoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEndereco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPersonal.setBackground(new java.awt.Color(255, 255, 255));
        painelPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        rbPersonalSim.setBackground(new java.awt.Color(255, 255, 255));
        rbPersonalSim.setText("Sim");
        rbPersonalSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPersonalSimActionPerformed(evt);
            }
        });

        rbPersonalNao.setBackground(new java.awt.Color(255, 255, 255));
        rbPersonalNao.setText("Não");
        rbPersonalNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPersonalNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPersonalLayout = new javax.swing.GroupLayout(painelPersonal);
        painelPersonal.setLayout(painelPersonalLayout);
        painelPersonalLayout.setHorizontalGroup(
            painelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPersonalLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(painelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelPersonalLayout.createSequentialGroup()
                        .addComponent(rbPersonalNao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbPersonalSim, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbPersonais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        painelPersonalLayout.setVerticalGroup(
            painelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPersonalSim)
                    .addComponent(rbPersonalNao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(cbPersonais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separador.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout painelAlunoLayout = new javax.swing.GroupLayout(painelAluno);
        painelAluno.setLayout(painelAlunoLayout);
        painelAlunoLayout.setHorizontalGroup(
            painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlunoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelAlunoLayout.createSequentialGroup()
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbMasc)
                            .addComponent(rbFem)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelAlunoLayout.createSequentialGroup()
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelular)
                            .addComponent(txtRgCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEnderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        painelAlunoLayout.setVerticalGroup(
            painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlunoLayout.createSequentialGroup()
                .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelAlunoLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(painelEnderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(painelPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelAlunoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbMasc)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFem)
                        .addGap(18, 18, 18)
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(painelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRgCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelALunoLayout = new javax.swing.GroupLayout(painelALuno);
        painelALuno.setLayout(painelALunoLayout);
        painelALunoLayout.setHorizontalGroup(
            painelALunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelALunoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(painelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelALunoLayout.setVerticalGroup(
            painelALunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelALunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        painelAbas.addTab("Informações pessoais", painelALuno);
        painelALuno.getAccessibleContext().setAccessibleDescription("");

        painelFUndoAbaMensalidade.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 8, 123), 2, true), "Treino e mensalidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblStatusMensalidade.setToolTipText("");
        lblStatusMensalidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setText("Treino:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setText("Valor:");

        jLabel9.setText("Status:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(lblStatusMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblStatusMensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)))
                                .addGap(5, 5, 5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bntnMensalidade.setBackground(new java.awt.Color(255, 255, 255));
        bntnMensalidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bntnMensalidade.setForeground(new java.awt.Color(0, 51, 153));
        bntnMensalidade.setText("+");
        bntnMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntnMensalidadeActionPerformed(evt);
            }
        });

        lblMensalidade1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMensalidade1.setForeground(new java.awt.Color(1, 12, 119));
        lblMensalidade1.setText("Cadastrar/ alterar Mensalidade");

        lblMensalidade2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMensalidade2.setForeground(new java.awt.Color(1, 12, 119));
        lblMensalidade2.setText("Gerar receber");

        btnGerarReceber.setBackground(new java.awt.Color(255, 255, 255));
        btnGerarReceber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGerarReceber.setForeground(new java.awt.Color(0, 51, 153));
        btnGerarReceber.setText("+");
        btnGerarReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarReceberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFUndoAbaMensalidadeLayout = new javax.swing.GroupLayout(painelFUndoAbaMensalidade);
        painelFUndoAbaMensalidade.setLayout(painelFUndoAbaMensalidadeLayout);
        painelFUndoAbaMensalidadeLayout.setHorizontalGroup(
            painelFUndoAbaMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFUndoAbaMensalidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFUndoAbaMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFUndoAbaMensalidadeLayout.createSequentialGroup()
                        .addComponent(lblMensalidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntnMensalidade))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFUndoAbaMensalidadeLayout.createSequentialGroup()
                        .addComponent(lblMensalidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGerarReceber)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        painelFUndoAbaMensalidadeLayout.setVerticalGroup(
            painelFUndoAbaMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFUndoAbaMensalidadeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painelFUndoAbaMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensalidade1)
                    .addComponent(bntnMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(painelFUndoAbaMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensalidade2)
                    .addComponent(btnGerarReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        painelAbas.addTab("Treino e financeiro", painelFUndoAbaMensalidade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAluno)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        painelAbas.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnderecoActionPerformed
        // TODO add your handling code here:
        frmCadastrarEndereco frmEndereco = new frmCadastrarEndereco(true, this);
        frmEndereco.setVisible(true);
    }//GEN-LAST:event_btnEnderecoActionPerformed

    private void rbMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMascActionPerformed
        // TODO add your handling code here:
        if (rbMasc.isSelected()) {
            rbFem.setSelected(false);

        } else {
            rbMasc.setSelected(true);
        }
    }//GEN-LAST:event_rbMascActionPerformed

    private void rbFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemActionPerformed
        // TODO add your handling code here:
        if (rbFem.isSelected()) {
            rbMasc.setSelected(false);
        } else {
            rbFem.setSelected(true);
        }
    }//GEN-LAST:event_rbFemActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        Funcoes.permitirSomenteNumeros(evt);
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtRgCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRgCpfKeyTyped
        // TODO add your handling code here:
        Funcoes.permitirSomenteNumeros(evt);
    }//GEN-LAST:event_txtRgCpfKeyTyped

    private void bntnMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntnMensalidadeActionPerformed
        // TODO add your handling code here:
        if ((!aluno.equals(null)) || (aluno != null)) {
            frmListarMensalidades frmMensalidade = new frmListarMensalidades(this);
            frmMensalidade.setVisible(true);
        } else {
            Funcoes.MsgWarningSimples("Salve o aluno para habilitar a mensalidade.", "Aluno");
        }

    }//GEN-LAST:event_bntnMensalidadeActionPerformed

    private void btnSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlunoActionPerformed
        // TODO add your handling code here:
        if (!validarObjetos()) {
            System.exit(0);
        } else {
            salvarAluno();
        }
    }//GEN-LAST:event_btnSalvarAlunoActionPerformed

    private void painelAbasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_painelAbasStateChanged
        // TODO add your handling code here:   
        System.out.println("Entrou aba "+ painelAbas.getSelectedIndex());
        switch (painelAbas.getSelectedIndex()) {
            case 1:
                if (novoAluno) {
                    painelAbas.setSelectedIndex(0);
                    Funcoes.MsgWarningSimples("Conclua o cadastro do aluno para habilitar a mensalidade.", "Aluno");
                }
                break;
        }
    }//GEN-LAST:event_painelAbasStateChanged

    private void rbPersonalNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPersonalNaoActionPerformed
        // TODO add your handling code here:
        if (rbPersonalNao.isSelected()) {
            rbPersonalSim.setSelected(false);

        } else {
            rbPersonalNao.setSelected(true);
        }
        cbPersonais.setEnabled(false);
    }//GEN-LAST:event_rbPersonalNaoActionPerformed

    private void rbPersonalSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPersonalSimActionPerformed
        // TODO add your handling code here:
        if (rbPersonalSim.isSelected()) {
            rbPersonalNao.setSelected(false);

        } else {
            rbPersonalSim.setSelected(true);
        }
        cbPersonais.setEnabled(true);
    }//GEN-LAST:event_rbPersonalSimActionPerformed

    private void btnGerarReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarReceberActionPerformed
        // TODO add your handling code here:
        //FuncoesDB
    }//GEN-LAST:event_btnGerarReceberActionPerformed

    public Boolean validarObjetos() {
        return true;
        // funcoes de validação dos objetos globais., return iniciar com false, ficar true caso passe todos.

    }

    public void salvarAluno() {
        AlunoDAO alunoDAO = new AlunoDAO();
        // objetos -> chaves estrangeiras em aluno, somente mensalidade é not null.
        this.aluno.setIdEndereco(endereco);
        //this.aluno.setIdMedidas(medidas);
        if (personal != null && rbPersonalSim.isSelected()) {
            this.aluno.setIdPersonal(personal);
        }

        if (mensalidade != null) {
            this.mensalidade.setIdTreino(treino);
            this.aluno.setIdMensalidade(mensalidade);
        }

        // demais campos --> campos que são preenchidos direto na tela
        this.aluno.setNome(txtNome.getText());
        if (rbMasc.isSelected()) {
            this.aluno.setSexo('M');
        } else {
            this.aluno.setSexo('F');
        }
        this.aluno.setCelular(txtCelular.getText());
        this.aluno.setRgcpf(txtRgCpf.getText());
        if (novoAluno) {
            alunoDAO.persist(aluno);
            novoAluno = false;
        } else {
            alunoDAO.merge(aluno);
        }

        Funcoes.MsgWarningSimples("Aluno salvo com sucesso", "Cadastro de aluno");

    }

    public void PreencherCamposAluno(boolean novoAluno) {
        if (novoAluno = false) {
            //aluno.get
        }

    }

    public boolean atualizarEnderecoAluno() {
        // na tela de endereços, passa o endereço para o objeto gloal de aluno dessa tela
        // essa função apenas preenche os componentes com o endereço.
        aluno.setIdEndereco(this.endereco);
        lblEndereco.setText("End: " + aluno.getIdEndereco().getEndereco());
        lblNumero.setText("Nº: " + aluno.getIdEndereco().getNumero());
        lblCidade.setText("Cidade: " + aluno.getIdEndereco().getCidade());
        lblEstado.setText("Estado: " + aluno.getIdEndereco().getUf());
        btnEndereco.setText("Alterar endereço");
        if (aluno.equals(null)) {
            return false;
        } else {
            return true;
        }

    }

    public void carregarPersonais() {

        PersonalDAO pDAO = new PersonalDAO();
        List<Personal> p = pDAO.listarPersonals();
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel();
        for (Personal ps : p) {
            defaultComboBox.addElement(ps);
            personal = ps;
        }
        cbPersonais.setModel(defaultComboBox);
        if (rbPersonalNao.isSelected()) {
            cbPersonais.setEnabled(false);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntnMensalidade;
    private javax.swing.JButton btnEndereco;
    private javax.swing.JButton btnGerarReceber;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarAluno;
    private javax.swing.JComboBox<String> cbPersonais;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMensalidade;
    private javax.swing.JLabel lblMensalidade1;
    private javax.swing.JLabel lblMensalidade2;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblStatusMensalidade;
    private javax.swing.JLabel lblTreino;
    private javax.swing.JPanel painelALuno;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelAluno;
    private javax.swing.JPanel painelEnderecoAluno;
    private javax.swing.JPanel painelFUndoAbaMensalidade;
    private javax.swing.JPanel painelPersonal;
    private javax.swing.JRadioButton rbFem;
    private javax.swing.JRadioButton rbMasc;
    private javax.swing.JRadioButton rbPersonalNao;
    private javax.swing.JRadioButton rbPersonalSim;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRgCpf;
    // End of variables declaration//GEN-END:variables

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Enderecos getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderecos endereco) {
        this.endereco = endereco;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Cliente;
import classes.Conta;
import classes.ContaMovimento;
import classes.ContaPoupanca;
import classes.Emprestimo;
import conexao.DAO.ClienteDAO;
import conexao.DAO.ContaMovimentoDAO;
import conexao.DAO.EmprestimoDAO;
import conexao.DAO.ContaPoupancaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class TelaEdicaoCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaEdicaoCliente() {
        initComponents();
        setLocationRelativeTo(null);
        comboBoxLista();
        comboBoxCliente();
        comboBoxEmprestimo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCPF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        bCadastrar = new javax.swing.JButton();
        cbConta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbClientes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        bCadastrar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbEmprestimo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 2, true), "Cadastro de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(102, 0, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Conta");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        tfNome.setBackground(new java.awt.Color(255, 255, 255));
        tfNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfCPF.setBackground(new java.awt.Color(255, 255, 255));
        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        bCadastrar.setBackground(new java.awt.Color(102, 0, 102));
        bCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bCadastrar.setText("Editar");
        bCadastrar.setFocusable(false);
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        cbConta.setBackground(new java.awt.Color(255, 255, 255));
        cbConta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email:");

        cbClientes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cliente:");

        bCadastrar1.setBackground(new java.awt.Color(255, 0, 0));
        bCadastrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        bCadastrar1.setText("Deletar");
        bCadastrar1.setFocusable(false);
        bCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrar1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Carregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        cbEmprestimo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmprestimoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Emp:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbEmprestimo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbConta, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfEmail)
                                .addComponent(tfCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        alteraDadosCliente();
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void cbContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbContaActionPerformed

    private void bCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrar1ActionPerformed
        deletaCliente();
    }//GEN-LAST:event_bCadastrar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregaDadosCliente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmprestimoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEdicaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdicaoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bCadastrar1;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbConta;
    private javax.swing.JComboBox<String> cbEmprestimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
    public void comboBoxCliente() {
        ClienteDAO cd1 = new ClienteDAO();

        ArrayList<Cliente> clientes = cd1.buscarClienteSemFiltro();

        for (Cliente cliente : clientes) {
            cbClientes.addItem("Nome: " + cliente.getNome() + " - CPF: " + cliente.getCpf());
            System.out.println(cliente.getCpf());
        }

    }

    public void comboBoxLista() {
        ContaPoupancaDAO cpd1 = new ContaPoupancaDAO();
        ContaMovimentoDAO cmd1 = new ContaMovimentoDAO();
        ArrayList<Conta> contasPoupanca = new ArrayList();
        ArrayList<Conta> contasMovimento = new ArrayList();
        ArrayList<Conta> contas = new ArrayList();

        contasPoupanca = cpd1.buscarContasPoupanca();
        contasMovimento = cmd1.buscarContasMovimento();
        contas.addAll(contasPoupanca);
        contas.addAll(contasMovimento);

        for (Conta conta : contas) {

            if (conta instanceof ContaPoupanca) {
                ContaPoupanca aux = (ContaPoupanca) conta;
                if (aux.getCliente_cpf() == null) {
                    cbConta.addItem("Poupança - N° " + Integer.toString(aux.getNumero()) + " - Rendimento: " + Float.toString(aux.getRendimento()));
                }
            } else if (conta instanceof ContaMovimento) {
                ContaMovimento aux = (ContaMovimento) conta;
                if (aux.getCliente_cpf() == null) {
                    cbConta.addItem("Movimento - N° " + Integer.toString(aux.getNumero()) + " - Limite: " + Float.toString(aux.getLimite()));
                }
            }
        }
    }

    public void comboBoxEmprestimo() {
        EmprestimoDAO ed1 = new EmprestimoDAO();
        ArrayList<Emprestimo> emprestimos = ed1.buscarEmprestimoSemFiltro();

        for (Emprestimo emprestimo : emprestimos) {
            cbEmprestimo.addItem("Empréstimo N° " + emprestimo.getNumero() + " - Valor: R$ " + emprestimo.getValor());
        }
    }

    public void carregaDadosCliente() {
        ClienteDAO cd1 = new ClienteDAO();
        String[] partes = cbClientes.getSelectedItem().toString().split(" ");
        String clienteCPF = partes[partes.length - 1];
        try {
            Cliente c1 = cd1.buscarClientePorCpf(clienteCPF);

            tfNome.setText(c1.getNome());
            tfEmail.setText(c1.getEmail());
            tfCPF.setText(c1.getCpf());
        } catch (Exception e) {
            System.out.println("Deu ruim!");
        }
    }

    public void alteraDadosCliente() {
        Cliente c1 = new Cliente();
        if (!tfNome.getText().equals("") && !tfEmail.getText().equals("") && !tfCPF.getText().equals("")) {

            try {
                c1.setNome(tfNome.getText());
                c1.setEmail(tfEmail.getText());
                c1.setCpf(tfCPF.getText());
                ClienteDAO cd1 = new ClienteDAO();
                String[] partesCliente = cbClientes.getSelectedItem().toString().split(" ");
                String[] partesEmprestimo = cbEmprestimo.getSelectedItem().toString().split(" ");
                String clienteCPF = partesCliente[partesCliente.length - 1];

                if (cd1.atualizarCliente(clienteCPF, c1)) {

                    try {
                        String[] partes = cbConta.getSelectedItem().toString().split(" ");

                        if (partes[0].equals("Poupança")) {
                            ContaPoupancaDAO cpd1 = new ContaPoupancaDAO();
                            ContaPoupanca conta = cpd1.buscarContaPoupancaPorNumero(Integer.parseInt(partes[3]));
                            conta.setCliente_cpf(tfCPF.getText());
                            cpd1.atualizarContaPoupanca(Integer.parseInt(partes[3]), conta);
                        } else if (partes[0].equals("Movimento")) {
                            ContaMovimentoDAO cmd1 = new ContaMovimentoDAO();
                            ContaMovimento conta = cmd1.buscarContaMovimentoPorNumero(Integer.parseInt(partes[3]));
                            conta.setCliente_cpf(tfCPF.getText());
                            cmd1.atulizarContaMovimento(Integer.parseInt(partes[3]), conta);
                        }

                    } catch (Exception e) {
                        System.out.println("Nenhuma conta disponível!");
                    }

                    EmprestimoDAO ed1 = new EmprestimoDAO();
                    int empNumero = Integer.parseInt(partesEmprestimo[2]);
                    ed1.emprestimoHasCliente(empNumero, c1.getCpf());

                    JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                    TelaMenu tm = new TelaMenu();
                    tm.setVisible(true);
                    this.setVisible(false);
                } else {
                    limpar();
                    JOptionPane.showMessageDialog(null, "Cliente não pôde ser criado!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Valores digitados são incorretos!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Carregue um cliente!");
        }
    }

    public void deletaCliente() {
        ClienteDAO cd1 = new ClienteDAO();

        if (!tfNome.getText().equals("") && !tfEmail.getText().equals("") && !tfCPF.getText().equals("")) {

            if (cd1.deletarCliente(tfCPF.getText())) {
                JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
                TelaMenu tm = new TelaMenu();
                tm.setVisible(true);
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Carregue um cliente!");
        }
    }

    public void limpar() {
        tfCPF.setText("");
        tfEmail.setText("");
        tfNome.setText("");
    }
}
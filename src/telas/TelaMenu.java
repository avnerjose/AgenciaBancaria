/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Fabio
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
        setLocationRelativeTo(null);
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
        bConta = new javax.swing.JButton();
        bCliente = new javax.swing.JButton();
        bEmprestimo = new javax.swing.JButton();
        bEmprestimo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 2, true), "Agência Centrium", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(153, 0, 153))); // NOI18N

        bConta.setBackground(new java.awt.Color(153, 0, 153));
        bConta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bConta.setForeground(new java.awt.Color(255, 255, 255));
        bConta.setText("Cadastrar Nova Conta");
        bConta.setFocusable(false);
        bConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bContaActionPerformed(evt);
            }
        });

        bCliente.setBackground(new java.awt.Color(153, 0, 153));
        bCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bCliente.setForeground(new java.awt.Color(255, 255, 255));
        bCliente.setText("Cadastrar Novo Cliente");
        bCliente.setFocusable(false);
        bCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClienteActionPerformed(evt);
            }
        });

        bEmprestimo.setBackground(new java.awt.Color(153, 0, 153));
        bEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        bEmprestimo.setText("Cadastrar Novo Emprestimo");
        bEmprestimo.setFocusable(false);
        bEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmprestimoActionPerformed(evt);
            }
        });

        bEmprestimo1.setBackground(new java.awt.Color(153, 0, 153));
        bEmprestimo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bEmprestimo1.setForeground(new java.awt.Color(255, 255, 255));
        bEmprestimo1.setText("Editar Cliente Existente");
        bEmprestimo1.setFocusable(false);
        bEmprestimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmprestimo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEmprestimo1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConta, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(bConta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(bCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(bEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(bEmprestimo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bContaActionPerformed
        TelaConta t1 = new TelaConta();
        t1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bContaActionPerformed

    private void bClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClienteActionPerformed
        TelaCliente t1 = new TelaCliente();
        t1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bClienteActionPerformed

    private void bEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmprestimoActionPerformed
        TelaEmprestimo t1 = new TelaEmprestimo();
        t1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bEmprestimoActionPerformed

    private void bEmprestimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmprestimo1ActionPerformed
        TelaEdicaoCliente t1 = new TelaEdicaoCliente();
        t1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bEmprestimo1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCliente;
    private javax.swing.JButton bConta;
    private javax.swing.JButton bEmprestimo;
    private javax.swing.JButton bEmprestimo1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soma;

import javax.swing.JOptionPane;

/**
 *
 * @author Rever
 */
public class frmPrincipal extends javax.swing.JDialog
{

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPrimeiroNumero = new javax.swing.JLabel();
        txfPrimeiroNumero = new javax.swing.JTextField();
        lblSegundoNumero = new javax.swing.JLabel();
        txfSegundoNumero = new javax.swing.JTextField();
        btnMultiplicar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setMinimumSize(new java.awt.Dimension(225, 312));
        setResizable(false);

        lblPrimeiroNumero.setText("Digite o primeiro número");

        lblSegundoNumero.setText("Digite o segundo número");

        btnMultiplicar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnMultiplicar.setText("x");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultiplicarActionPerformed(evt);
            }
        });

        lblResultado.setText("Resultado");

        btnSomar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSomarActionPerformed(evt);
            }
        });

        btnSubtrair.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultado)
                    .addComponent(txfPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundoNumero)
                    .addComponent(lblPrimeiroNumero)
                    .addComponent(txfSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblPrimeiroNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSegundoNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplicarActionPerformed
    {//GEN-HEADEREND:event_btnMultiplicarActionPerformed
        Double numero1 = 0.0, numero2 = 0.0, resultado = 0.0;

        try
        {
            numero1 = Double.parseDouble(txfPrimeiroNumero.getText());

            try
            {
                numero2 = Double.parseDouble(txfSegundoNumero.getText());
                resultado = numero1 * numero2;
                lblResultado.setText("Resultado: " + resultado.toString());

            }
            catch (Exception e)
            {
                lblResultado.setText("<html>Digite um número válido<br>no segundo espaço</html>");
            }

        }
        catch (Exception e)
        {
            lblResultado.setText("<html>Digite um número válido<br>no primeiro espaço</html>");
        }

    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomarActionPerformed
    {//GEN-HEADEREND:event_btnSomarActionPerformed
        Double numero1 = 0.0, numero2 = 0.0, resultado = 0.0;

        try
        {
            numero1 = Double.parseDouble(txfPrimeiroNumero.getText());

            try
            {
                numero2 = Double.parseDouble(txfSegundoNumero.getText());
                resultado = numero1 + numero2;
                lblResultado.setText("Resultado: " + resultado.toString());

            }
            catch (Exception e)
            {
                lblResultado.setText("<html>Digite um número válido<br>no segundo espaço</html>");
            }

        }
        catch (Exception e)
        {
            lblResultado.setText("<html>Digite um número válido<br>no primeiro espaço</html>");
        }
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubtrairActionPerformed
    {//GEN-HEADEREND:event_btnSubtrairActionPerformed
        Double numero1 = 0.0, numero2 = 0.0, resultado = 0.0;

        try
        {
            numero1 = Double.parseDouble(txfPrimeiroNumero.getText());

            try
            {
                numero2 = Double.parseDouble(txfSegundoNumero.getText());
                resultado = numero1 - numero2;
                lblResultado.setText("Resultado: " + resultado.toString());

            }
            catch (Exception e)
            {
                lblResultado.setText("<html>Digite um número válido<br>no segundo espaço</html>");
            }

        }
        catch (Exception e)
        {
            lblResultado.setText("<html>Digite um número válido<br>no primeiro espaço</html>");
        }

    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDividirActionPerformed
    {//GEN-HEADEREND:event_btnDividirActionPerformed
        Double numero1 = 0.0, numero2 = 0.0, resultado = 0.0;

        try
        {
            numero1 = Double.parseDouble(txfPrimeiroNumero.getText());

            try
            {
                numero2 = Double.parseDouble(txfSegundoNumero.getText());
                resultado = numero1 / numero2;
                lblResultado.setText("Resultado: " + resultado.toString());

            }
            catch (Exception e)
            {
                lblResultado.setText("<html>Digite um número válido<br>no segundo espaço</html>");
            }

        }
        catch (Exception e)
        {
            lblResultado.setText("<html>Digite um número válido<br>no primeiro espaço</html>");
        }

        if (resultado == Double.POSITIVE_INFINITY || resultado == Double.NEGATIVE_INFINITY)
        {
            lblResultado.setText("Não pode ser dividido por 0");
        }

    }//GEN-LAST:event_btnDividirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JLabel lblPrimeiroNumero;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegundoNumero;
    private javax.swing.JTextField txfPrimeiroNumero;
    private javax.swing.JTextField txfSegundoNumero;
    // End of variables declaration//GEN-END:variables
}

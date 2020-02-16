/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciudadInflable.frame;

import com.ciudadInflable.fonts.Fuente;
import com.sistema.entidad.Usuario;
import com.sistema.logica.UsuarioLog;
import com.sistema.servicio.ServicioUsuario;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Fuente tipoFuente;

    public Login() {
        tipoFuente = new Fuente();
        initComponents();
        this.setLocationRelativeTo(null); //hace que cuando se ejecuta el programa salga en el centro
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.decker, 0, 18));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.decker, 0, 18));
        txtUserName.setFont(tipoFuente.fuente(tipoFuente.decker, 0, 18));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imageView1 = new com.ciudadInflable.animaciones.ImageView();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jpIngreso.setPreferredSize(new java.awt.Dimension(290, 580));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 187, -1, -1));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Contraseña:");
        jpIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 30));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("Usuario:");
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/smilemonkey.gif"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jpIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 170));

        txtUserName.setForeground(new java.awt.Color(153, 153, 153));
        txtUserName.setText("Ingrese el usuario...");
        txtUserName.setToolTipText("");
        txtUserName.setBorder(null);
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jpIngreso.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 160, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 210, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 30));

        txtPassword.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("password123456");
        txtPassword.setToolTipText("");
        txtPassword.setBorder(null);
        txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPassword.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPasswordMouseExited(evt);
            }
        });
        txtPassword.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtPasswordInputMethodTextChanged(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jpIngreso.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 170, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/icons8-show-password-30(2).png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel5FocusGained(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        jpIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 30, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/icons8_Key_32px.png"))); // NOI18N
        jpIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/icons8_customer_32px_1.png"))); // NOI18N
        jpIngreso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/icons8_Menu_32px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpIngreso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/Enter_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/Enter_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/Enter_ON.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/Enter_ON.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 120, 40));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageView1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout imageView1Layout = new javax.swing.GroupLayout(imageView1);
        imageView1.setLayout(imageView1Layout);
        imageView1Layout.setHorizontalGroup(
            imageView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        imageView1Layout.setVerticalGroup(
            imageView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(imageView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 120));
        imageView1.setImage(com.ciudadInflable.animaciones.ImageLoader.load("icons8-open-box-80.png"));
        imageView1.setScale(.5);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        txtPassword.selectAll();
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed

        txtPassword.setEchoChar((char) 0);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/icons8-show-password-30(1).png")));


    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        txtPassword.setEchoChar('●');
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/icons8-show-password-30(2).png")));
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel5FocusGained

    }//GEN-LAST:event_jLabel5FocusGained

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setToolTipText("Oprimir para mostrar la contraseña.");
    }//GEN-LAST:event_jLabel5MouseEntered

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        txtUserName.selectAll();
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/smilemonkey.gif")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/monoMedioSonriendo.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void txtPasswordInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPasswordInputMethodTextChanged

    }//GEN-LAST:event_txtPasswordInputMethodTextChanged

    private void txtPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/seenoevil.gif")));
    }//GEN-LAST:event_txtPasswordMouseEntered

    private void txtPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseExited

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ciudadInflable/image/smilemonkey.gif")));
    }//GEN-LAST:event_txtPasswordMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Usuario usuario = new Usuario();

        if (txtUserName.getText().equalsIgnoreCase("") || txtPassword.getText().equalsIgnoreCase("")) {
            System.out.println("Debe llenar los campos");
        } else {
            usuario.setNombreUsuario(txtUserName.getText());
            usuario.setContrasenna(txtPassword.getText());
            
            ServicioUsuario servicioUsuario = new ServicioUsuario();
            
            try {
                
                Usuario logeado = servicioUsuario.login(usuario);
                
                if (logeado != null) {
                    
                    SuperAdminWindow sU = new SuperAdminWindow();
                    sU.setLocationRelativeTo(null);
                    sU.setVisible(true);
                    this.dispose();
                    
                }else{
                    System.out.println("Algo sale mal");
                }
                
                
            } catch (Exception e) {
            }
            
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">sdadsdadadada
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ciudadInflable.animaciones.ImageView imageView1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
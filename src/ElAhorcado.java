
import javax.swing.JButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xp
 */
public class ElAhorcado extends javax.swing.JFrame {

    /**
     * Creates new form ElAhorcado
     */
    public ElAhorcado() {
        initComponents();
    }

    private void chequeaBoton(JButton botonPulsado){
        botonPulsado.setVisible(false);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 480, 103));

        jPanel1.setPreferredSize(new java.awt.Dimension(405, 405));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 420, 357));

        jButton1.setText("a");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 49, 48));

        jButton2.setText("b");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 49, 48));

        jButton3.setText("d");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 49, 48));

        jButton4.setText("e");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 49, 48));

        jButton5.setText("c");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 49, 48));

        jButton6.setText("f");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 49, 48));

        jButton7.setText("k");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 49, 48));

        jButton8.setText("j");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 49, 48));

        jButton9.setText("h");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 49, 48));

        jButton10.setText("g");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 49, 48));

        jButton11.setText("l");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 49, 48));

        jButton12.setText("i");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 49, 48));

        jButton13.setText("u");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 49, 48));

        jButton14.setText("r");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton14MousePressed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 49, 48));

        jButton16.setText("v");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton16MousePressed(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 49, 48));

        jButton17.setText("s");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton17MousePressed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 49, 48));

        jButton18.setText("w");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton18MousePressed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 49, 48));

        jButton19.setText("p");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton19MousePressed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 49, 48));

        jButton20.setText("o");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton20MousePressed(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 49, 48));

        jButton21.setText("n");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton21MousePressed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 49, 48));

        jButton22.setText("m");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton22MousePressed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 49, 48));

        jButton23.setText("q");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23MousePressed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 49, 48));

        jButton24.setText("ñ");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton24MousePressed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 49, 48));

        jButton25.setText("x");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton25MousePressed(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 49, 48));

        jButton15.setText("y");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton15MousePressed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 690, 49, 48));

        jButton29.setText("z");
        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton29MousePressed(evt);
            }
        });
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 690, 49, 48));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton12MousePressed

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton13MousePressed

    private void jButton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton14MousePressed

    private void jButton16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton16MousePressed

    private void jButton17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton17MousePressed

    private void jButton18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton18MousePressed

    private void jButton19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton19MousePressed

    private void jButton20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton20MousePressed

    private void jButton21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton21MousePressed

    private void jButton22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton22MousePressed

    private void jButton23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton23MousePressed

    private void jButton24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton24MousePressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton25MousePressed

    private void jButton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton15MousePressed

    private void jButton29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_jButton29MousePressed

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
            java.util.logging.Logger.getLogger(ElAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElAhorcado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

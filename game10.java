/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRITHVI MUKESH
 */
public class game10 extends javax.swing.JFrame {
 String a,u,w1,w2;
    String ms;  
    int i=0,j=0;
    int q;
    /**
     * Creates new form game10
     */
    public game10() {
        initComponents();
        l.setText("Enter the players name");
        t.setText("");
        t1.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 36)); // NOI18N
        l.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(l);
        l.setBounds(320, 70, 520, 50);

        jLabel1.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jLabel1.setText("First Player");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 210, 170, 60);

        jLabel2.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jLabel2.setText("Second Player");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 330, 170, 60);

        t.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        getContentPane().add(t);
        t.setBounds(380, 210, 340, 60);

        t1.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(380, 330, 340, 60);

        jButton1.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 470, 150, 50);

        jButton2.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 470, 160, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sparks-1920x1200.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 960, 670);

        setBounds(0, 0, 952, 711);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       a=t.getText();
        u=t1.getText();
        if(a.equals("")||u.equals(""))
        {
            l.setText("Please!! Enter the players name");
        }
        else
        {
            i=a.length();
            j=u.length();
            if(i>j)
            {
                ms="Hey!!  "+a+"  Let's start the game";
                // repaint();
                 w1=""+a+" is Blue";
                w2=""+u+" is Red";               
                q=0;
            }
            else
            {
                ms="Hey!!  "+u+"  Let's start the game";
                //repaint();
                w1=""+u+" is Blue";
                w2=""+a+" is Red";
                q=1;
            }
        }
        if(!(ms.equals("")))
        {
            /*String c;
            c=ms;*/
            game11 g11;
            g11=new game11(ms,q,a,u,w1,w2);
            g11.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t.setText("");
        t1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(game10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l;
    private javax.swing.JTextField t;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}


import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onura
 */
public class jframeDemo extends javax.swing.JFrame {

    /**
     * Creates new form jframeDemo
     */
    public jframeDemo() {
        initComponents();
        round1 = new Round();
        arrayLblDealer[0] = lblDealerCard1;
        arrayLblDealer[1] = lblDealerCard2;
        arrayLblDealer[2] = lblDealerCard3;
        arrayLblDealer[3] = lblDealerCard4;
        arrayLblDealer[4] = lblDealerCard5;
        
        arrayLblPlayer[0] = lblPlayerCard1;
        arrayLblPlayer[1] = lblPlayerCard2;
        arrayLblPlayer[2] = lblPlayerCard3;
        arrayLblPlayer[3] = lblPlayerCard4;
        arrayLblPlayer[4] = lblPlayerCard5;
        
        countPlayer = 2;
        countDealer = 2;
        countFirstTime = 2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        lblPlayerCard1 = new javax.swing.JLabel();
        lblPlayerCard4 = new javax.swing.JLabel();
        lblPlayerCard2 = new javax.swing.JLabel();
        lblPlayerCard3 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        lblDealerCards = new javax.swing.JLabel();
        lblPlayerCards = new javax.swing.JLabel();
        lblDealerCard2 = new javax.swing.JLabel();
        lblDealerCard1 = new javax.swing.JLabel();
        lblDealerCard4 = new javax.swing.JLabel();
        lblDealerCard3 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblDealerCard5 = new javax.swing.JLabel();
        lblPlayerCard5 = new javax.swing.JLabel();
        btnDrawCard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BlackJack by Avcı");
        setBackground(new java.awt.Color(255, 153, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 51, 51));
        setLocation(new java.awt.Point(550, 250));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("Script MT Bold", 0, 48)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(204, 0, 0));
        lblWelcome.setText("Welcome to BlackJack Game");
        getContentPane().add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 574, 81));

        lblPlayerCard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPlayerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 282, 120, 151));

        lblPlayerCard4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPlayerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 120, 162));

        lblPlayerCard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPlayerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 274, 120, 162));

        lblPlayerCard3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPlayerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 274, 120, 162));

        btnStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStart.setText("New Game");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 25, 161, 59));

        lblDealerCards.setFont(new java.awt.Font("Monotype Corsiva", 2, 30)); // NOI18N
        lblDealerCards.setText("Dealer Cards :");
        getContentPane().add(lblDealerCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 158, 157, 86));

        lblPlayerCards.setFont(new java.awt.Font("Monotype Corsiva", 2, 30)); // NOI18N
        lblPlayerCards.setText("Your Cards :");
        getContentPane().add(lblPlayerCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 321, 144, 59));

        lblDealerCard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDealerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 112, 120, 152));

        lblDealerCard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDealerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 112, 120, 152));

        lblDealerCard4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDealerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 120, 152));

        lblDealerCard3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDealerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 112, 120, 152));

        lblMessage.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(51, 153, 0));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 340, 59));

        lblDealerCard5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDealerCard5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 120, 152));

        lblPlayerCard5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPlayerCard5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 120, 162));

        btnDrawCard.setBackground(new java.awt.Color(102, 255, 51));
        btnDrawCard.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnDrawCard.setText("Draw Card");
        btnDrawCard.setEnabled(false);
        btnDrawCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawCardActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrawCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 160, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 830, 20));

        btnStop.setBackground(new java.awt.Color(255, 51, 51));
        btnStop.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        btnStop.setText("Stop");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 160, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        round1.start();
        
        lblPlayerCard1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.playerCards.get(0).toString() + ".png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());// TODO add your handling code here:
        
        lblPlayerCard2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.playerCards.get(1).toString() + ".png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());// TODO add your handling code here:      

        lblDealerCard1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.dealerCards.get(0).toString() + ".png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
       
        lblDealerCard2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/backOfCard.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        
        //Reseting the panel
        for ( int i = 0; i < 3; i++){
            arrayLblDealer[ i + 2].setIcon(null);
            arrayLblPlayer[ i + 2].setIcon(null);
        }
        lblMessage.setText("");
        
        countPlayer = 2;
        countDealer = 2;
        countFirstTime = 2;

        //Enabiling the buttons
        btnDrawCard.setEnabled(true);
        btnStop.setEnabled(true);
       
        //Black Jack for the firt time
        if( (round1.playerCards.get(0).value == 1|| round1.playerCards.get(1).value == 1) && round1.playerCards.get(0).realValue + round1.playerCards.get(1).realValue == 21 ){
           round1.open();
           btnDrawCard.setEnabled(false);
           btnStop.setEnabled(false);
           lblMessage.setText("Let's see what the dealer has");
           
           lblDealerCard2.setIcon(new javax.swing.JLabel() {
                public javax.swing.Icon getIcon() {
                    try {
                        return new javax.swing.ImageIcon(
                            new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.dealerCards.get(1).toString() + ".png")
                        );
                    } catch (java.net.MalformedURLException e) {
                    }
                    return null;
                }
            }.getIcon());
           
           while( round1.getSumOfDealer() < 17){
               round1.drawForDealer();
               lblMessage.setText("One more for the dealer");
               arrayLblDealer[countFirstTime].setIcon(new javax.swing.JLabel() {
                   public javax.swing.Icon getIcon() {
                       try {
                            return new javax.swing.ImageIcon(
                                new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.dealerCards.get(countFirstTime).toString() + ".png")
                            );
                        } catch (java.net.MalformedURLException e) {
                    }
                       return null;
                    }
                }.getIcon());
               countFirstTime++;
            }
           
           if ( round1.getSumOfDealer() != 21)
               lblMessage.setText("Black jack. You won!");
           else
               lblMessage.setText("It is a draw");
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnDrawCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawCardActionPerformed
        round1.drawForPlayer();
        arrayLblPlayer[countPlayer].setIcon(new javax.swing.JLabel() {
                   public javax.swing.Icon getIcon() {
                       try {
                            return new javax.swing.ImageIcon(
                                new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.playerCards.get(countPlayer).toString() + ".png")
                            );
                        } catch (java.net.MalformedURLException e) {
                          }
                       return null;
                    }
        }.getIcon());
        countPlayer++;
        
        if ( round1.getSumOfPlayer() > 20){
            btnDrawCard.setEnabled(false);
            btnStop.setEnabled(false);
            //balck jack after drawing a card
            if ( round1.getSumOfPlayer() == 21){
                //set visible
                lblDealerCard2.setIcon(new javax.swing.JLabel() {
                    public javax.swing.Icon getIcon() {
                        try {
                            return new javax.swing.ImageIcon(
                                new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.dealerCards.get(1).toString() + ".png")
                            );
                        } catch (java.net.MalformedURLException e) {
                        }
                    return null;
                    }
                }.getIcon());
                
                while( round1.getSumOfDealer() < 17){
                   round1.drawForDealer();
                   arrayLblDealer[countDealer].setIcon(new javax.swing.JLabel() {
                    public javax.swing.Icon getIcon() {
                        try {
                            return new javax.swing.ImageIcon(
                                new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.dealerCards.get(countDealer).toString() + ".png")
                            );
                        } catch (java.net.MalformedURLException e) {
                          }
                        return null;
                    }
                    }.getIcon());
                   countDealer++;
               }
                
                if ( round1.getSumOfDealer() != 21)
                  lblMessage.setText("Black jack. You won!");
               else
                  lblMessage.setText("It is a draw");
            }
            else{
                lblDealerCard2.setIcon(new javax.swing.JLabel() {
                    public javax.swing.Icon getIcon() {
                        try {
                            return new javax.swing.ImageIcon(
                                new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.dealerCards.get(1).toString() + ".png")
                            );
                        } catch (java.net.MalformedURLException e) {
                        }
                    return null;
                    }
                }.getIcon());
                lblMessage.setText("You are busted!");
            }
        }
    }//GEN-LAST:event_btnDrawCardActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        btnDrawCard.setEnabled(false);
        btnStop.setEnabled(false);
        lblDealerCard2.setIcon(new javax.swing.JLabel() {
                public javax.swing.Icon getIcon() {
                    try {
                        return new javax.swing.ImageIcon(
                            new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.dealerCards.get(1).toString() + ".png")
                        );
                    } catch (java.net.MalformedURLException e) {
                    }
                    return null;
                }
            }.getIcon());
        
        while( round1.getSumOfDealer() < 17){
               round1.drawForDealer();
               lblMessage.setText("One more for the dealer");
               arrayLblDealer[countDealer].setIcon(new javax.swing.JLabel() {
                   public javax.swing.Icon getIcon() {
                       try {
                            return new javax.swing.ImageIcon(
                                new java.net.URL("file:/C:/Users/onura/Documents/NetBeansProjects/demo1/pictures/" + round1.dealerCards.get(countDealer).toString() + ".png")
                            );
                        } catch (java.net.MalformedURLException e) {
                    }
                       return null;
                    }
                }.getIcon());
               countDealer++;
            }
        
            if ( round1.getSumOfDealer() > 21){
                  lblMessage.setText( "You won!");
            }
            else if ( round1.getSumOfPlayer() > round1.getSumOfDealer())
               lblMessage.setText( "You won!");
            else if ( round1.getSumOfPlayer() == round1.getSumOfDealer())
               lblMessage.setText( "It is a draw");
            else
               lblMessage.setText( "You lost!");
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(jframeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframeDemo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrawCard;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDealerCard1;
    private javax.swing.JLabel lblDealerCard2;
    private javax.swing.JLabel lblDealerCard3;
    private javax.swing.JLabel lblDealerCard4;
    private javax.swing.JLabel lblDealerCard5;
    private javax.swing.JLabel lblDealerCards;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPlayerCard1;
    private javax.swing.JLabel lblPlayerCard2;
    private javax.swing.JLabel lblPlayerCard3;
    private javax.swing.JLabel lblPlayerCard4;
    private javax.swing.JLabel lblPlayerCard5;
    private javax.swing.JLabel lblPlayerCards;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
    private static Round round1;
    private static JLabel[] arrayLblDealer = new JLabel[5];
    private static JLabel[] arrayLblPlayer = new JLabel[5];
    private static int countPlayer;
    private static int countDealer;
    private static int countFirstTime;
}

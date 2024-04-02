package tictactoe;

import javax.swing.JButton;

public class Window extends javax.swing.JFrame {

    private final char player;
    private final char computer;

    private char nextPlayer;
    private int turn;
    private int player_wins = 0, computer_wins = 0;

    public Window(char playerTurn) {
        initComponents();

        if (playerTurn == 'X') {
            player = 'X';
            computer = 'O';
        } else {
            player = 'O';
            computer = 'X';
        }
        turn = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        x_Player = new javax.swing.JLabel();
        y_Player = new javax.swing.JLabel();
        feld10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        feld1 = new javax.swing.JButton();
        feld2 = new javax.swing.JButton();
        feld3 = new javax.swing.JButton();
        feld4 = new javax.swing.JButton();
        feld5 = new javax.swing.JButton();
        feld6 = new javax.swing.JButton();
        feld7 = new javax.swing.JButton();
        feld8 = new javax.swing.JButton();
        feld9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setForeground(new java.awt.Color(12, 15, 13));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dashboard");

        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Players:");

        x_Player.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        x_Player.setForeground(new java.awt.Color(12, 15, 13));
        x_Player.setText("X :     0  ");

        y_Player.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        y_Player.setForeground(new java.awt.Color(12, 15, 13));
        y_Player.setText("O :     0");

        feld10.setBackground(new java.awt.Color(255, 255, 255));
        feld10.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld10.setForeground(new java.awt.Color(255, 0, 51));
        feld10.setText("Reset");
        feld10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld10.setPreferredSize(new java.awt.Dimension(80, 30));
        feld10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x_Player, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y_Player, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(feld10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(x_Player, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(y_Player, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(feld10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel3.setBackground(new java.awt.Color(251, 251, 251));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 400));

        feld1.setBackground(new java.awt.Color(255, 255, 255));
        feld1.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld1.setForeground(new java.awt.Color(255, 0, 51));
        feld1.setText(" ");
        feld1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld1.setPreferredSize(new java.awt.Dimension(80, 30));
        feld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld1ActionPerformed(evt);
            }
        });

        feld2.setBackground(new java.awt.Color(255, 255, 255));
        feld2.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld2.setForeground(new java.awt.Color(255, 0, 51));
        feld2.setText(" ");
        feld2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld2.setPreferredSize(new java.awt.Dimension(80, 30));
        feld2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld2ActionPerformed(evt);
            }
        });

        feld3.setBackground(new java.awt.Color(255, 255, 255));
        feld3.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld3.setForeground(new java.awt.Color(255, 0, 51));
        feld3.setText(" ");
        feld3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld3.setPreferredSize(new java.awt.Dimension(80, 30));
        feld3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld3ActionPerformed(evt);
            }
        });

        feld4.setBackground(new java.awt.Color(255, 255, 255));
        feld4.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld4.setForeground(new java.awt.Color(255, 0, 51));
        feld4.setText(" ");
        feld4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld4.setPreferredSize(new java.awt.Dimension(80, 30));
        feld4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld4ActionPerformed(evt);
            }
        });

        feld5.setBackground(new java.awt.Color(255, 255, 255));
        feld5.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld5.setForeground(new java.awt.Color(255, 0, 51));
        feld5.setText(" ");
        feld5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld5.setPreferredSize(new java.awt.Dimension(80, 30));
        feld5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld5ActionPerformed(evt);
            }
        });

        feld6.setBackground(new java.awt.Color(255, 255, 255));
        feld6.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld6.setForeground(new java.awt.Color(255, 0, 51));
        feld6.setText(" ");
        feld6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld6.setPreferredSize(new java.awt.Dimension(80, 30));
        feld6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld6ActionPerformed(evt);
            }
        });

        feld7.setBackground(new java.awt.Color(255, 255, 255));
        feld7.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld7.setForeground(new java.awt.Color(255, 0, 51));
        feld7.setText(" ");
        feld7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld7.setPreferredSize(new java.awt.Dimension(80, 30));
        feld7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld7ActionPerformed(evt);
            }
        });

        feld8.setBackground(new java.awt.Color(255, 255, 255));
        feld8.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld8.setForeground(new java.awt.Color(255, 0, 51));
        feld8.setText(" ");
        feld8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld8.setPreferredSize(new java.awt.Dimension(80, 30));
        feld8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld8ActionPerformed(evt);
            }
        });

        feld9.setBackground(new java.awt.Color(255, 255, 255));
        feld9.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        feld9.setForeground(new java.awt.Color(255, 0, 51));
        feld9.setText(" ");
        feld9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        feld9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        feld9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feld9.setPreferredSize(new java.awt.Dimension(80, 30));
        feld9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feld9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feld1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feld2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feld3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feld4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feld5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feld6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feld7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feld8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feld9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(feld7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feld8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feld9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(feld4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(feld5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(feld6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(feld1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(feld2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(feld3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Tic Tac Toe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void feld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld1ActionPerformed
        update(feld1);
    }//GEN-LAST:event_feld1ActionPerformed

    private void feld4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld4ActionPerformed
        update(feld4);
    }//GEN-LAST:event_feld4ActionPerformed

    private void feld7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld7ActionPerformed
        update(feld7);
    }//GEN-LAST:event_feld7ActionPerformed

    private void feld2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld2ActionPerformed
        update(feld2);
    }//GEN-LAST:event_feld2ActionPerformed

    private void feld5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld5ActionPerformed
        update(feld5);
    }//GEN-LAST:event_feld5ActionPerformed

    private void feld8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld8ActionPerformed
        update(feld8);
    }//GEN-LAST:event_feld8ActionPerformed

    private void feld3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld3ActionPerformed
        update(feld3);
    }//GEN-LAST:event_feld3ActionPerformed

    private void feld6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld6ActionPerformed
        update(feld6);
    }//GEN-LAST:event_feld6ActionPerformed

    private void feld9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld9ActionPerformed
        update(feld9);
    }//GEN-LAST:event_feld9ActionPerformed

    private void feld10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feld10ActionPerformed
        ResetFeld();
    }//GEN-LAST:event_feld10ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window('/').setVisible(false);
                new ChooseThePlayer().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton feld1;
    private static javax.swing.JButton feld10;
    private static javax.swing.JButton feld2;
    private static javax.swing.JButton feld3;
    private static javax.swing.JButton feld4;
    private static javax.swing.JButton feld5;
    private static javax.swing.JButton feld6;
    private static javax.swing.JButton feld7;
    private static javax.swing.JButton feld8;
    private static javax.swing.JButton feld9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel x_Player;
    private javax.swing.JLabel y_Player;
    // End of variables declaration//GEN-END:variables

   private void update(JButton f) {
    char gText = f.getText().charAt(0);

    if (gText == ' ') {
        f.setText(String.valueOf(player));
        char[] board = {feld1.getText().charAt(0), feld2.getText().charAt(0),
            feld3.getText().charAt(0), feld4.getText().charAt(0), feld5.getText().charAt(0),
            feld6.getText().charAt(0), feld7.getText().charAt(0), feld8.getText().charAt(0),
            feld9.getText().charAt(0)};
        CheckWinner cw = new CheckWinner(board, player);
        int winner = cw.getWinner();
        if (winner == 0) { // Wenn kein Gewinner, lass den Computer ziehen
            makeBestMove(); // Computer macht den besten Zug
            // Aktualisiere das Board und überprüfe erneut auf einen Gewinner
            board = new char[]{feld1.getText().charAt(0), feld2.getText().charAt(0),
                feld3.getText().charAt(0), feld4.getText().charAt(0), feld5.getText().charAt(0),
                feld6.getText().charAt(0), feld7.getText().charAt(0), feld8.getText().charAt(0),
                feld9.getText().charAt(0)};
            cw = new CheckWinner(board, player);
            winner = cw.getWinner();
        }

        if (winner != 0) {
            if (winner == -1) {
                computer_wins++;
            } else if (winner == 1) {
                player_wins++;
            }
            ResetFeld();
        } else if (winner == 2) {
            ResetFeld();
        }

        if (player_wins == 3 && computer_wins < 3) {
            new WinnerWindow("Congratulations! You won :)", 1).setVisible(true);
            player_wins = 0;
            computer_wins = 0;
            ResetFeld();
        } else if (computer_wins == 3 && player_wins < 3) {
            new WinnerWindow("Unfortunately, you lost :(", -1).setVisible(true);
            player_wins = 0;
            computer_wins = 0;
            ResetFeld();
        }
    }
        turn = turn == 1 ? -1 : 1;
}


    private void ResetFeld() {
        JButton[] board = {feld1, feld2, feld3, feld4, feld5, feld6, feld7, feld8, feld9};
        for (JButton f : board) {
            f.setText(" ");
        }
        System.out.println("reset!!!!!!!!!!");
        x_Player.setText("X :     " + player_wins);
        y_Player.setText("O :     " + computer_wins);
    }

    
// Methode zur Bewertung der Spielzustände 
private int minimax(char[] board, int depth, boolean isMaximizing) {
    CheckWinner cw = new CheckWinner(board, player);
    int winner = cw.getWinner();
    
    if (winner != 0) return winner; // Rückgabe des Bewertungswerts
    
    if (isMaximizing) {
        int bestScore = Integer.MIN_VALUE;
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                board[i] = computer; // Zug ausführen
                int score = minimax(board, depth + 1, false);
                board[i] = ' '; // Zug rückgängig machen
                bestScore = Math.max(score, bestScore);
            }
        }
        return bestScore;
    } else {
        int bestScore = Integer.MAX_VALUE;
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                board[i] = player; // Zug ausführen
                int score = minimax(board, depth + 1, true);
                board[i] = ' '; // Zug rückgängig machen
                bestScore = Math.min(score, bestScore);
            }
        }
        return bestScore;
    }
}

// Methode zur Auswahl und Ausführung des besten Zugs für den Computer
private void makeBestMove() {
    int bestScore = Integer.MIN_VALUE;
    int move = -1;
    char[] board = {feld1.getText().charAt(0), feld2.getText().charAt(0), feld3.getText().charAt(0),
                    feld4.getText().charAt(0), feld5.getText().charAt(0), feld6.getText().charAt(0),
                    feld7.getText().charAt(0), feld8.getText().charAt(0), feld9.getText().charAt(0)};
    for (int i = 0; i < board.length; i++) {
        if (board[i] == ' ') {
            board[i] = computer;
            int score = minimax(board, 0, false);
            board[i] = ' ';
            if (score > bestScore) {
                bestScore = score;
                move = i;
            }
        }
    }
    if (move != -1) {
        updateMove(move, computer);
    }
}

// Hilfsmethode zur Ausführung eines Zugs
private void updateMove(int position, char player) {
    JButton[] buttons = {feld1, feld2, feld3, feld4, feld5, feld6, feld7, feld8, feld9};
    if(position >= 0 && position < buttons.length) {
        buttons[position].setText(String.valueOf(player));
        turn = turn == 1 ? -1 : 1; // Spielerwechsel
    }
}

}




import java.awt.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhumi Jain
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {
    private String startgame="x";
    private int xcount=0;
    private int ocount=0;
    public TIC_TAC_TOE_GAME() {
        initComponents();
    }
    private void gamescore(){
        playerx.setText(String.valueOf(xcount));
        playero.setText(String.valueOf(ocount));
    }
    private void choose_a_player()
    {
        if(startgame.equalsIgnoreCase("x")){
            startgame="o";
        }
        else{
            startgame="x";
        }
    }
    private void WinningGame(){
        String b1=txtbtn1.getText(); 
        String b2=txtbtn2.getText();
        String b3=txtbtn3.getText();
        
        String b4=txtbtn4.getText();
        String b5=txtbtn5.getText();
        String b6=txtbtn6.getText();
        
        String b7=txtbtn7.getText();
        String b8=txtbtn8.getText();
        String b9=txtbtn9.getText();
        //player Xcoding
        if(b1==("x")&& b2==("x") && b3==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn3.setBackground(Color.GREEN);
            txtbtn2.setBackground(Color.GREEN);
        }
         if(b4==("x")&& b5==("x") && b6==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn4.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN); 
        }
          if(b7==("x")&& b8==("x") && b9==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn7.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN); 
        }
           if(b1==("x")&& b4==("x") && b7==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn4.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN); 
        }
            if(b2==("x")&& b5==("x") && b8==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn2.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);
        }
             if(b3==("x")&& b6==("x") && b9==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);
        }
              if(b3==("x")&& b5==("x") && b7==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN);
        }
               if(b1==("x")&& b5==("x") && b9==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);  
        }
               //player o coding
                  if(b1==("x")&& b2==("x") && b3==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn3.setBackground(Color.GREEN);
            txtbtn2.setBackground(Color.GREEN);
                        
            
        }
         if(b4==("x")&& b5==("x") && b6==("x")){
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn4.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN); 
        }
         if(b7==("o")&& b8==("o") && b9==("o")){
            JOptionPane.showMessageDialog(this, "player  O wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn7.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN); 
        }
         if(b1==("o")&& b4==("o") && b7==("o")){
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn4.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN); 
        }
            if(b2==("o")&& b5==("o") && b8==("o")){
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn2.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);
        }
             if(b3==("o")&& b6==("o") && b9==("o")){
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);
        }
              if(b3==("o")&& b5==("o") && b7==("o")){
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN);
        }
               if(b1==("o")&& b5==("o") && b9==("o")){
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);  
        }
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
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE_GAME");

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setBackground(new java.awt.Color(102, 0, 51));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("TIC-TAC-TOE-GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtbtn7.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Ebrima", 0, 48)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(153, 0, 255));
        txtexit.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        txtexit.setText("EXIT!");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(153, 0, 153));
        txtreset.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));

        playero.setBackground(new java.awt.Color(102, 0, 102));
        playero.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        playero.setForeground(new java.awt.Color(102, 0, 102));
        playero.setText("   PLAYER-O :");
        playero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));

        jLabel3.setBackground(new java.awt.Color(102, 0, 102));
        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("  XXXXXXXXX");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));

        playerx.setBackground(new java.awt.Color(102, 0, 102));
        playerx.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        playerx.setForeground(new java.awt.Color(102, 0, 102));
        playerx.setText("   PLAYER-X :");
        playerx.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));

        jLabel5.setBackground(new java.awt.Color(102, 0, 102));
        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setText(" XXXXXXXXX");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        txtbtn8.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn8.setForeground(Color.red);
        }
        else{
            txtbtn8.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
   
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn9.setForeground(Color.red);
        }
        else{
            txtbtn9.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
   
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
         txtbtn2.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn2.setForeground(Color.red);
        }
        else{
            txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
   
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn3.setForeground(Color.red);
        }
        else{
            txtbtn3.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
   
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn5.setForeground(Color.red);
        }
        else{
            txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
   
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn6.setForeground(Color.red);
        }
        else{
            txtbtn6.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
   
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        txtbtn7.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn7.setForeground(Color.red);
        }
        else{
            txtbtn7.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
   
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"if you want to exit",
                "TIC TAC TOE",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        txtbtn1.setBackground(Color.LIGHT_GRAY);
         txtbtn2.setBackground(Color.LIGHT_GRAY);
          txtbtn3.setBackground(Color.LIGHT_GRAY);
           txtbtn4.setBackground(Color.LIGHT_GRAY); 
            txtbtn5.setBackground(Color.LIGHT_GRAY);
             txtbtn6.setBackground(Color.LIGHT_GRAY);
              txtbtn7.setBackground(Color.LIGHT_GRAY);
              txtbtn8.setBackground(Color.LIGHT_GRAY);
               txtbtn9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_txtresetActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn1.setForeground(Color.red);
        }
        else{
            txtbtn1.setForeground(Color.magenta);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        txtbtn4.setText(startgame);
         if(startgame.equalsIgnoreCase("x")){
            txtbtn4.setForeground(Color.red);
        }
        else{
            txtbtn4.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
   
    }//GEN-LAST:event_txtbtn4ActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}

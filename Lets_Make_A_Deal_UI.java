/***********************************************************************
 *                               Program Three                         *
 *                                                                     *
 * Name:        Mika Morgan                                            *
 * Class:       CMPS 5113: Advanced Programming Language Concepts      *
 * Objective:   This program will state numerous facts about the       *
 *              members of a family, and then name rules to establish  *
 *              family relationships (such as sister, brother, aunt,   *
 *              cousin, etc. The program can be queried to list names  *
 *              that fit each relationship or state the facts given.   *
 ***********************************************************************/
package my.lets_make_a_deal;

import java.awt.Color;
import static java.awt.SystemColor.text;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.Random;
import javax.swing.border.LineBorder;


public class Lets_Make_A_Deal_UI extends javax.swing.JFrame {

    /*
     * Creates new form Lets_Make_A_Deal_UI
     */
    public Lets_Make_A_Deal_UI() {
        initComponents();
    }
    
    static String door1, door2, door3, selection;
    static int displayed, wins, losses;

    /*
     * This method is called from within the constructor to initialize the form.
     * Everything here is automatic from the Design layout
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lmad_door.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lmad_door.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lmad_door.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane2.setText("Choose a door to reveal your prize!");
        jScrollPane2.setViewportView(jTextPane2);

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("KEEP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("CHANGE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(30, 240, 30));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("PLAY AGAIN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("WINS");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("LOSSES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel5.setText("Let's Make a Deal!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addGap(318, 318, 318)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(filler2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(filler6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(62, 62, 62)
                                                .addComponent(jButton3))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(339, 339, 339)
                                        .addComponent(filler9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filler11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(filler6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19)
                                                .addComponent(filler8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, 0)
                                        .addComponent(filler11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)))
                                .addGap(0, 0, 0)
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(filler10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(filler9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        
        //Hide the keep, change, and play again buttons until the first selection has been made
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //If the player selects the first door
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Add a border around the selected door to emphasize it and set the user selection
        jButton1.setBorderPainted(true);
        jButton1.setBorder(new LineBorder(Color.RED, 10));
        
        selection = "1";

        //Reveal a goat and update instructions
        jTextPane2.setText("Oh, a goat has been revealed! Would you like to keep your door or change your selection?");
        if(door2.equals("goat")){
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png")));
            displayed = 2;
        }
        else{
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png"))); 
            displayed = 3;
        }
        
        //Show the buttons that allow the player to choose
        jButton4.setVisible(true);
        jButton5.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    //If the player selects the second door
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Add a border around the selected door to emphasize it and set the user selection
        jButton2.setBorderPainted(true);
        jButton2.setBorder(new LineBorder(Color.RED, 10));
        
        selection = "2";
        
        //Reveal a goat and update instructions
        jTextPane2.setText("Oh, a goat has been revealed! Would you like to keep your door or change your selection?");
        if(door1.equals("goat")){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png")));
            displayed = 1;
        }
        else{
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png")));
            displayed = 3;
        }
        
        //Show the buttons that allow the player to choose
        jButton4.setVisible(true);
        jButton5.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Add a border around the selected door to emphasize it and set the selection
        jButton3.setBorderPainted(true);
        jButton3.setBorder(new LineBorder(Color.RED, 10));
        
        selection = "3";
        
        //Reveal a goat and update instructions
        jTextPane2.setText("Oh, a goat has been revealed! Would you like to keep your door or change your selection?");
        if(door1.equals("goat")){
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png")));
            displayed = 1;
        }
        else{
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png")));
            displayed = 2;
        }
        
        //Show the buttons that allow the player to choose
        jButton4.setVisible(true);
        jButton5.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    //If the user decides to keep their original selection
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //They decided to keep their original selection. Change nothing and display the ending
        endGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    //If the user decides to change their original selection
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //They decided to change their selection. Change selection variable and border,
        //then display ending
        switch(selection){
            case "1":
                jButton1.setBorderPainted(false);
                if(displayed == 2){
                    selection = "3";
                    jButton3.setBorderPainted(true);
                    jButton3.setBorder(new LineBorder(Color.RED, 10));
                }
                else{
                    selection = "2";
                    jButton2.setBorderPainted(true);
                    jButton2.setBorder(new LineBorder(Color.RED, 10));
                }
                break;
            case "2":
                jButton2.setBorderPainted(false);
                if(displayed == 1){
                    selection = "3";
                    jButton3.setBorderPainted(true);
                    jButton3.setBorder(new LineBorder(Color.RED, 10));
                }
                else{
                    selection = "1";
                    jButton1.setBorderPainted(true);
                    jButton1.setBorder(new LineBorder(Color.RED, 10));
                }
                break;
            case "3":
                jButton3.setBorderPainted(false);
                if(displayed == 2){
                    selection = "1";
                    jButton1.setBorderPainted(true);
                    jButton1.setBorder(new LineBorder(Color.RED, 10));
                }
                else{
                    selection = "2";
                    jButton2.setBorderPainted(true);
                    jButton2.setBorder(new LineBorder(Color.RED, 10));
                }
                break;
        }
        endGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmad_door.png")));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmad_door.png")));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmad_door.png")));
        
        jButton1.setBorderPainted(false);
        jButton2.setBorderPainted(false);
        jButton3.setBorderPainted(false);
        selection = "0";
        
        Random rand = new Random();
        int car = rand.nextInt(3) + 1;
        
        if(car == 1){
            door1 = "car";
            door2 = "goat";
            door3 = "goat";
        }
        else if(car == 2){
            door1 = "goat";
            door2 = "car";
            door3 = "goat";
        }
        else{
            door1 = "goat";
            door2 = "goat";
            door3 = "car";
        }
        
        jTextPane2.setText("Choose a door to make your selection");
    }//GEN-LAST:event_jButton6ActionPerformed

    public void endGame(){
        switch(selection){
            case "1": 
                if(door1.equals("car")){
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car.png")));
                    jTextPane2.setText("You won! Woo!");
                    wins++;
                }
                else{
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png")));
                    jTextPane2.setText("Better luck next time");
                    losses++;
                }
                break;
            case "2": 
                if(door2.equals("car")){
                    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car.png")));
                    jTextPane2.setText("You won! Woo!");
                    wins++;
                }
                else{
                    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png")));
                    jTextPane2.setText("Better luck next time");
                    losses++;
                }
                break;
            case "3": 
                if(door3.equals("car")){
                    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car.png")));
                    jTextPane2.setText("You won! Woo!");
                    wins++;
                }
                else{
                    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.png")));
                    jTextPane2.setText("Better luck next time");
                    losses++;
                }
        }
        jLabel3.setText(" " + wins);
        jLabel4.setText(" " + losses);
        jButton6.setVisible(true);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Create a random number generator and decide which door has the car
        Random rand = new Random();
        int car = rand.nextInt(3) + 1;
        
        if(car == 1){
            door1 = "car";
            door2 = "goat";
            door3 = "goat";
        }
        else if(car == 2){
            door1 = "goat";
            door2 = "car";
            door3 = "goat";
        }
        else{
            door1 = "goat";
            door2 = "goat";
            door3 = "car";
        }
        
        wins = 0;
        losses = 0;
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lets_Make_A_Deal_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}

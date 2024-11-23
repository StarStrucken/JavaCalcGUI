/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorGUI;



/**
 *
 * @author Ivan Costa
 */
public class CalculatorHardware extends javax.swing.JFrame {
    String equation = "";
    double answer;
    
    /**
     * Creates new form CalculatorHardware
     */
    public CalculatorHardware() {
        this.answer = 0;
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        buttonClearAll = new javax.swing.JButton();
        buttonSeven = new javax.swing.JButton();
        buttonFour = new javax.swing.JButton();
        buttonOne = new javax.swing.JButton();
        buttonZero = new javax.swing.JButton();
        buttonDecimal = new javax.swing.JButton();
        buttonClearEntry = new javax.swing.JButton();
        buttonFive = new javax.swing.JButton();
        buttonEight = new javax.swing.JButton();
        buttonTwo = new javax.swing.JButton();
        buttonNine = new javax.swing.JButton();
        buttonSix = new javax.swing.JButton();
        buttonThree = new javax.swing.JButton();
        buttonEqual = new javax.swing.JButton();
        buttonTimes = new javax.swing.JButton();
        buttonExponent = new javax.swing.JButton();
        buttonMinus = new javax.swing.JButton();
        buttonPlus = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(132, 136, 138));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        screen.setBackground(new java.awt.Color(230, 255, 204));
        screen.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(screen);

        buttonClearAll.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonClearAll.setText("CA");
        buttonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearAllActionPerformed(evt);
            }
        });

        buttonSeven.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonSeven.setText("7");
        buttonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSevenActionPerformed(evt);
            }
        });

        buttonFour.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonFour.setText("4");
        buttonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourActionPerformed(evt);
            }
        });

        buttonOne.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonOne.setText("1");
        buttonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOneActionPerformed(evt);
            }
        });

        buttonZero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        buttonZero.setText("0");
        buttonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZeroActionPerformed(evt);
            }
        });

        buttonDecimal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonDecimal.setText(".");
        buttonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecimalActionPerformed(evt);
            }
        });

        buttonClearEntry.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonClearEntry.setText("CE");
        buttonClearEntry.setToolTipText("");
        buttonClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearEntryActionPerformed(evt);
            }
        });

        buttonFive.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonFive.setText("5");
        buttonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiveActionPerformed(evt);
            }
        });

        buttonEight.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonEight.setText("8");
        buttonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEightActionPerformed(evt);
            }
        });

        buttonTwo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonTwo.setText("2");
        buttonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwoActionPerformed(evt);
            }
        });

        buttonNine.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonNine.setText("9");
        buttonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNineActionPerformed(evt);
            }
        });

        buttonSix.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonSix.setText("6");
        buttonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixActionPerformed(evt);
            }
        });

        buttonThree.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonThree.setText("3");
        buttonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThreeActionPerformed(evt);
            }
        });

        buttonEqual.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonEqual.setText("=");
        buttonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualActionPerformed(evt);
            }
        });

        buttonTimes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonTimes.setText("x");
        buttonTimes.setActionCommand("X");
        buttonTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimesActionPerformed(evt);
            }
        });

        buttonExponent.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonExponent.setText("^");
        buttonExponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExponentActionPerformed(evt);
            }
        });

        buttonMinus.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonMinus.setText("-");
        buttonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinusActionPerformed(evt);
            }
        });

        buttonPlus.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonPlus.setText("+");
        buttonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlusActionPerformed(evt);
            }
        });

        buttonDivide.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        buttonDivide.setText("÷");
        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(buttonClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonExponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonMinus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonTimes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonDivide, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExponent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
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

    private void buttonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwoActionPerformed
        equation += buttonTwo.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonTwoActionPerformed

    private void buttonTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimesActionPerformed
        equation += buttonTimes.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonTimesActionPerformed

    private void buttonExponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExponentActionPerformed
        equation += buttonExponent.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonExponentActionPerformed

    private void buttonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualActionPerformed
        double  operator1;
        
    }//GEN-LAST:event_buttonEqualActionPerformed

    private void buttonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZeroActionPerformed
        equation += buttonZero.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonZeroActionPerformed

    private void buttonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSevenActionPerformed
        equation += buttonSeven.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonSevenActionPerformed

    private void buttonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourActionPerformed
        equation += buttonFour.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonFourActionPerformed

    private void buttonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOneActionPerformed
        equation += buttonOne.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonOneActionPerformed

    private void buttonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecimalActionPerformed
        equation += buttonDecimal.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonDecimalActionPerformed

    private void buttonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThreeActionPerformed
        equation += buttonThree.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonThreeActionPerformed

    private void buttonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlusActionPerformed
        equation += buttonPlus.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonPlusActionPerformed

    private void buttonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinusActionPerformed
        equation += buttonMinus.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonMinusActionPerformed

    private void buttonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixActionPerformed
        equation += buttonSix.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonSixActionPerformed

    private void buttonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiveActionPerformed
        equation += buttonFive.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonFiveActionPerformed

    private void buttonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEightActionPerformed
        equation += buttonEight.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonEightActionPerformed

    private void buttonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNineActionPerformed
        equation += buttonNine.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonNineActionPerformed

    private void buttonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivideActionPerformed
        equation += buttonDivide.getText();
        screen.setText(equation);
    }//GEN-LAST:event_buttonDivideActionPerformed

    private void buttonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearAllActionPerformed
        equation = "";
        screen.setText("");
    }//GEN-LAST:event_buttonClearAllActionPerformed

    private void buttonClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearEntryActionPerformed
                
    }//GEN-LAST:event_buttonClearEntryActionPerformed
    
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
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorHardware().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClearAll;
    private javax.swing.JButton buttonClearEntry;
    private javax.swing.JButton buttonDecimal;
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonEight;
    private javax.swing.JButton buttonEqual;
    private javax.swing.JButton buttonExponent;
    private javax.swing.JButton buttonFive;
    private javax.swing.JButton buttonFour;
    private javax.swing.JButton buttonMinus;
    private javax.swing.JButton buttonNine;
    private javax.swing.JButton buttonOne;
    private javax.swing.JButton buttonPlus;
    private javax.swing.JButton buttonSeven;
    private javax.swing.JButton buttonSix;
    private javax.swing.JButton buttonThree;
    private javax.swing.JButton buttonTimes;
    private javax.swing.JButton buttonTwo;
    private javax.swing.JButton buttonZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea screen;
    // End of variables declaration//GEN-END:variables
}

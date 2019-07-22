package calculadora;

public class Calculadora2 extends javax.swing.JFrame {
    
    String M1;
    String M2;
    String Signos;
    
    public Calculadora2() {
        initComponents();
        this.setLocationRelativeTo(null);
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JTextField();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));

        Pantalla.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        Pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Pantalla.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(255, 102, 0)));
        Pantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        B2.setBackground(new java.awt.Color(51, 0, 51));
        B2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B2.setForeground(new java.awt.Color(102, 102, 255));
        B2.setText("2");
        B2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(51, 0, 51));
        B1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B1.setForeground(new java.awt.Color(102, 102, 255));
        B1.setText("1");
        B1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(51, 0, 51));
        B3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B3.setForeground(new java.awt.Color(102, 102, 255));
        B3.setText("3");
        B3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(51, 0, 51));
        B4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B4.setForeground(new java.awt.Color(102, 102, 255));
        B4.setText("4");
        B4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(51, 0, 51));
        B5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B5.setForeground(new java.awt.Color(102, 102, 255));
        B5.setText("5");
        B5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(51, 0, 51));
        B6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B6.setForeground(new java.awt.Color(102, 102, 255));
        B6.setText("6");
        B6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(51, 0, 51));
        B7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B7.setForeground(new java.awt.Color(102, 102, 255));
        B7.setText("7");
        B7.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(51, 0, 51));
        B8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B8.setForeground(new java.awt.Color(102, 0, 255));
        B8.setText("8");
        B8.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(51, 0, 51));
        B9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B9.setForeground(new java.awt.Color(102, 102, 255));
        B9.setText("9");
        B9.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B10.setBackground(new java.awt.Color(51, 0, 51));
        B10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B10.setForeground(new java.awt.Color(102, 102, 255));
        B10.setText("0");
        B10.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        B11.setBackground(new java.awt.Color(51, 0, 51));
        B11.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B11.setForeground(new java.awt.Color(102, 102, 255));
        B11.setText("+/-");
        B11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B19.setBackground(new java.awt.Color(51, 0, 51));
        B19.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B19.setForeground(new java.awt.Color(102, 102, 255));
        B19.setText(".");
        B19.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B19ActionPerformed(evt);
            }
        });

        B13.setBackground(new java.awt.Color(51, 0, 51));
        B13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B13.setForeground(new java.awt.Color(102, 102, 255));
        B13.setText("CE");
        B13.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        B14.setBackground(new java.awt.Color(51, 0, 51));
        B14.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B14.setForeground(new java.awt.Color(102, 102, 255));
        B14.setText("C");
        B14.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });

        B15.setBackground(new java.awt.Color(51, 0, 51));
        B15.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B15.setForeground(new java.awt.Color(102, 102, 255));
        B15.setText("-");
        B15.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });

        B16.setBackground(new java.awt.Color(51, 0, 51));
        B16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B16.setForeground(new java.awt.Color(102, 102, 255));
        B16.setText("+");
        B16.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B16ActionPerformed(evt);
            }
        });

        B17.setBackground(new java.awt.Color(51, 0, 51));
        B17.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B17.setForeground(new java.awt.Color(102, 102, 255));
        B17.setText("*");
        B17.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B17ActionPerformed(evt);
            }
        });

        B18.setBackground(new java.awt.Color(51, 0, 51));
        B18.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B18.setForeground(new java.awt.Color(102, 102, 255));
        B18.setText("/");
        B18.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B18ActionPerformed(evt);
            }
        });

        B20.setBackground(new java.awt.Color(51, 0, 51));
        B20.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        B20.setForeground(new java.awt.Color(102, 102, 255));
        B20.setText("=");
        B20.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, new java.awt.Color(204, 204, 204)));
        B20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B16, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(B14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(B9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(B15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B11, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(B10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B18ActionPerformed
        if(!Pantalla.getText().equals("")){
            M1 = Pantalla.getText();
            Signos = "/";
            Pantalla.setText("");
        }
    }//GEN-LAST:event_B18ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        Pantalla.setText(Pantalla.getText()+"1");
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        Pantalla.setText(Pantalla.getText()+"2");
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        Pantalla.setText(Pantalla.getText()+"3");
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        Pantalla.setText(Pantalla.getText()+"4");
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        Pantalla.setText(Pantalla.getText()+"5");
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        Pantalla.setText(Pantalla.getText()+"6");
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        Pantalla.setText(Pantalla.getText()+"7");
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        Pantalla.setText(Pantalla.getText()+"8");
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        Pantalla.setText(Pantalla.getText()+"9");
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        Pantalla.setText(Pantalla.getText()+"0");
    }//GEN-LAST:event_B10ActionPerformed

    private void B19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B19ActionPerformed
        String G;
        G = Pantalla.getText();
        
        if(G.length() <= 0){
            Pantalla.setText("0.");
        }
        else{
            if(!existepunto(Pantalla.getText())){
                Pantalla.setText(Pantalla.getText()+".");
            }
        }
    }//GEN-LAST:event_B19ActionPerformed

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14ActionPerformed
        String G;
        G = Pantalla.getText();
        
        if(G.length()> 0 ){
            G = G.substring(0, G.length()-1);
            Pantalla.setText(G);
        }
    }//GEN-LAST:event_B14ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        Pantalla.setText("");
    }//GEN-LAST:event_B13ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
        if(!Pantalla.getText().equals("")){
            M1 = Pantalla.getText();
            Signos = "-";
            Pantalla.setText("");
        }
    }//GEN-LAST:event_B15ActionPerformed

    private void B16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B16ActionPerformed
        if(!Pantalla.getText().equals("")){
            M1 = Pantalla.getText();
            Signos = "+";
            Pantalla.setText("");
        }
    }//GEN-LAST:event_B16ActionPerformed

    private void B17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B17ActionPerformed
        if(!Pantalla.getText().equals("")){
            M1 = Pantalla.getText();
            Signos = "*";
            Pantalla.setText("");
        }
    }//GEN-LAST:event_B17ActionPerformed
public static String calculadora(String M1,String M2,String Signos){
    Double resultado = 0.0;
    String respuesta;
    
    if(Signos.equals("-")){
        resultado = Double.parseDouble(M1)-Double.parseDouble(M2);
    }
    if(Signos.equals("+")){
        resultado = Double.parseDouble(M1)+Double.parseDouble(M2);
    }
    if(Signos.equals("*")){
        resultado = Double.parseDouble(M1)*Double.parseDouble(M2);
    }
    if(Signos.equals("/")){
        if(Double.parseDouble(M2) == 0){
            String cadena="Error";
            respuesta = cadena;
            return respuesta;
        }else{
            resultado = Double.parseDouble(M1)/Double.parseDouble(M2);
        }
    }
    respuesta = resultado.toString();
    return respuesta;
}
    
    private void B20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B20ActionPerformed
        String resultado;
        M2 = Pantalla.getText();
        if(!M2.equals("")){
            resultado = calculadora(M1,M2,Signos);
            Pantalla.setText(resultado);
        }
    }//GEN-LAST:event_B20ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        Double num;
        String G;

        G = Pantalla.getText();
        if(G.length() > 0 ){
            num = (-1)*Double.parseDouble(G);
            Pantalla.setText(num.toString());
        }
    }//GEN-LAST:event_B11ActionPerformed

    public static boolean existepunto(String G){
        boolean resultado;
        resultado = false;
        
        for(int i = 0;1 < G.length();i++){
            if(G.substring(i, i+1).equals(".")){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
    private javax.swing.JButton B17;
    private javax.swing.JButton B18;
    private javax.swing.JButton B19;
    private javax.swing.JButton B2;
    private javax.swing.JButton B20;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JTextField Pantalla;
    // End of variables declaration//GEN-END:variables
}

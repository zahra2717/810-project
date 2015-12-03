

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;


public class RunQuiz extends JFrame {

   private String filename;
    public RunQuiz(String filename) {
        initComponents();
        this.filename = filename;
                
    }

    public RunQuiz() {
         initComponents();
    }


    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jLabel5 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel9 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton6 = new JButton();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jButton7 = new JButton();
        jButton5 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jButton4 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);

        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel2.setEnabled(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);

        buttonGroup1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Select an answer");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Read the question");

        jButton1.setText("Previous Question");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next Question");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Save my answer");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton7.setText("Save editions on question");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addComponent(jTextField3, GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, GroupLayout.Alignment.LEADING))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton4)
                                .addComponent(jRadioButton3)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton1))
                            .addGap(26, 26, 26)
                            .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 504, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jRadioButton2)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton3))
                            .addComponent(jRadioButton1))
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton4)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton5.setText("I am done..Show my results");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Exam is Running ..");

        jButton4.setText("Save editions on the quizz");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
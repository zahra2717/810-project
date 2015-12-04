
import java.awt.event.ItemEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jintao
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Jintao L
 */
public class AddQuiz extends JFrame {

  
    public AddQuiz() {
        initComponents();
        setQuestionPanelState(false);
    }


    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jTextField1 = new JTextField();
        jLabel1 = new JLabel();
        jTextField2 = new JTextField();
        jLabel2 = new JLabel();
        jTextField3 = new JTextField();
        jLabel3 = new JLabel();
        jTextField4 = new JTextField();
        jLabel4 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel9 = new JLabel();
        jTextField7 = new JTextField();
        jButton1 = new JButton();
        jComboBox1 = new JComboBox();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jTextField5 = new JTextField();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jTextField6 = new JTextField();
        jButton2 = new JButton();
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);

        jLabel1.setText("Enter Answer one : ");

        jLabel2.setText("Enter Answer two : ");

        jLabel3.setText("Enter Answer three : ");

        jLabel4.setText("Enter Answer four : ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);

        buttonGroup1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Add answers :");

        jLabel6.setText("correct");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel9.setText("Write question");

        jTextField7.setText("0");
        jTextField7.setEnabled(false);

        jButton1.setText("Add question");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Single choice", "Multi choice", "code" , "regix" , "Formula" }));
        jComboBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(jRadioButton1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addComponent(jRadioButton3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addComponent(jRadioButton4)))
                            .addComponent(jRadioButton2)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField5.setText("quiz");

        jLabel7.setText("Enter name of the quiz");

        jLabel8.setText("Enter number of questions");

        jTextField6.setText("5");

        jButton2.setText("Create new Quiz");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save Quiz");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 647, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addComponent(jButton2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }
int total=0;
    quiz myquiz;
    int current = 0;
    
    public void setQuestionPanelState(boolean b){
     jPanel1.setEnabled(b);
     jTextArea1.setEnabled(b);
     jTextField1.setEnabled(b);
     jTextField2.setEnabled(b);
     jTextField3.setEnabled(b);
     jTextField4.setEnabled(b);
     jRadioButton1.setEnabled(b);
     jRadioButton2.setEnabled(b);
     jRadioButton3.setEnabled(b);
     jRadioButton4.setEnabled(b);
     jButton1.setEnabled(b);
    jComboBox1.setEnabled(b);
     
    }
    
    private void jButton2ActionPerformed(ActionEvent evt) {
      
        try{
           total = Integer.parseInt(jTextField6.getText());
       }catch(Exception e ){
            JOptionPane.showMessageDialog(rootPane, "Please enter number of questions");
            return;
       }
      if(jTextField5.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane, "Please enter name of quiz");
            return;
      }  
      myquiz = new quiz(total);
setQuestionPanelState(true);
    jTextField7.setText("1");
    jButton2.setEnabled(false);
      
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    System.out.println(jComboBox1.getSelectedIndex());
        String question = jTextArea1.getText();
      if(question.equals("")){
           JOptionPane.showMessageDialog(rootPane, "Please enter the question");
            return;
      }
 
     if(jComboBox1.getSelectedIndex()<2){
              String answer1 = jTextField1.getText() , 
              answer2 = jTextField2.getText() , 
              answer3 = jTextField3.getText() , 
              answer4 = jTextField4.getText();
     if(answer1.equals("")||answer2.equals("")||answer3.equals("")||answer4.equals("")){
      JOptionPane.showMessageDialog(rootPane, "One of the answers is empty !");
            return;    
     }
         ArrayList<Integer> correct_answers = new ArrayList<>();
      if(jRadioButton1.isSelected())correct_answers.add(1);
      if(jRadioButton2.isSelected())correct_answers.add(2);
       if(jRadioButton3.isSelected())correct_answers.add(3);
      if(jRadioButton4.isSelected())correct_answers.add(4);
question q = new question(question, answer1, answer2, answer3, answer4, correct_answers, null, jComboBox1.getSelectedIndex());
 myquiz.add(q);
jTextArea1.setText("");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jRadioButton1.setSelected(true);
jRadioButton2.setSelected(false);

jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);

current++;
jTextField7.setText(String.valueOf(current+1));

if(current==total){
setQuestionPanelState(false);
jTextField7.setText("done");
   jButton3.setEnabled(true);
   return;
}
     }else{
         
        String answer = jTextArea2.getText();
              if(answer.equals("")){
           JOptionPane.showMessageDialog(rootPane, "Please enter the answer");
            return;
      } 
   question q  = new question(question,2 ,  answer, "");
   myquiz.add(q);
jTextArea1.setText("");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jRadioButton1.setSelected(true);
jRadioButton2.setSelected(false);

jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);

current++;
jTextField7.setText(String.valueOf(current+1));

if(current==total){
setQuestionPanelState(false);
jTextField7.setText("done");
   jButton3.setEnabled(true);
   return;
}       
         
         
     }
     jComboBox1.setSelectedIndex(0);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        try {
            String name = "quizzes/"+jTextField5.getText()+".quiz";
            name.replace(" ", "");
            System.out.println(name);
            File folder = new File(name);
            if(!folder.exists())folder.createNewFile();
            PrintWriter pw = new PrintWriter(folder);
            pw.append(jTextField5.getText()+"\n");
            pw.append(jTextField6.getText()+"\n");
for(int i=0;i<total;i++)
{
    if(myquiz.getQuestion(i).getType()!=2){
     pw.write(myquiz.getQuestion(i).getType() + "\n");

        pw.write(myquiz.getQuestion(i).getText()+"\n");
    pw.write("@@@@@\n");
      pw.write(myquiz.getQuestion(i).getAnswer1()+"\n");
    pw.write("@@@@@\n");
      pw.write(myquiz.getQuestion(i).getAnswer2()+"\n");
    pw.write("@@@@@\n");
      pw.write(myquiz.getQuestion(i).getAnswer3()+"\n");
     pw.write("@@@@@\n");
      pw.write(myquiz.getQuestion(i).getAnswer4()+"\n");
     pw.write("@@@@@\n");
    for(int j=0;j<myquiz.getQuestion(i).getCorrectAnswers().size();j++)
        pw.write(myquiz.getQuestion(i).getCorrectAnswers().get(j)+" ");
    pw.write("\n");
    pw.write("@@@@@\n");
    pw.write("\n");
    } else{
            pw.write(myquiz.getQuestion(i).getType() + "\n");

     pw.write(myquiz.getQuestion(i).getText()+"\n");
    pw.write("@@@@@\n");
        pw.write(myquiz.getQuestion(i).getCorrextCode()+"\n");
 pw.write("@@@@@\n");
    pw.write("\n");
    }
}   
 pw.close();
   JOptionPane.showMessageDialog(rootPane,"Quiz added successfully");
 this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        } catch (IOException ex) {
            Logger.getLogger(AddQuiz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jComboBox1ItemStateChanged(ItemEvent evt) {

       if (evt.getStateChange() == ItemEvent.SELECTED) {
        if(jComboBox1.getSelectedIndex()>=2)
            jTextArea2.setEnabled(true);
       }else if(jComboBox1.getSelectedIndex()==1)
       {
         buttonGroup1.remove(jRadioButton1);
                  buttonGroup1.remove(jRadioButton2);
         buttonGroup1.remove(jRadioButton3);
         buttonGroup1.remove(jRadioButton4);
            jTextArea2.setEnabled(false);

       }
       else if(jComboBox1.getSelectedIndex()==0)
       {
         buttonGroup1.add(jRadioButton1);
                  buttonGroup1.add(jRadioButton2);
         buttonGroup1.add(jRadioButton3);
         buttonGroup1.add(jRadioButton4);
          jTextArea2.setEnabled(false);

       }
       

    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuiz().setVisible(true);
            }
        });
    }

 
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;

}

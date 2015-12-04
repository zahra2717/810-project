
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

    int max=0;
   public void prepareQuiz() throws FileNotFoundException{
       File f  = new File("quizzes/"+filename+".quiz");
       Scanner sc  = new Scanner(f);
       //String name = sc.next();
       int count = sc.nextInt();
       max=count;
       myquiz = new quiz(count);
    for(int i=0;i<count;i++)
    {
        int type = sc.nextInt();
        if(type!=2){
        String question = "";
      String temp = sc.next();
        while(!temp.equals("@@@@@"))
        {
            question+=temp+" ";
            temp=sc.next();
        }
         String answer1 = "";
       temp = sc.next();
        while(!temp.equals("@@@@@"))
        {
            answer1+=temp+" ";
            temp=sc.next();
        }  
         String answer2 = "";
       temp = sc.next();
        while(!temp.equals("@@@@@"))
        {
            answer2+=temp+" ";
            temp=sc.next();
        }  
           String answer3 = "";
       temp = sc.next();
        while(!temp.equals("@@@@@"))
        {
            answer3+=temp+" ";
            temp=sc.next();
        }  
           String answer4 = "";
       temp = sc.next();
        while(!temp.equals("@@@@@"))
        {
            answer4+=temp+" ";
            temp=sc.next();
        }  
        
            ArrayList<Integer> answers = new ArrayList<>();
              temp = sc.next();
        while(!temp.equals("@@@@@"))
        {
            answers.add(Integer.parseInt(temp));
            temp=sc.next();
        }  
   
       question q  = new question(question, answer1, answer2, answer3, answer4, answers , new   ArrayList<Integer>() , type);
       myquiz.add(q);}
        else{
            
          String question = "";
      String temp = sc.next();
        while(!temp.equals("@@@@@"))
        {
            question+=temp+" ";
            temp=sc.next();
        }
         String answer = "";
       temp = sc.next();
        while(!temp.equals("@@@@@"))
        {
            answer+=temp+" ";
            temp=sc.next();
        }     
       question q  = new question(question, 2, answer, "");
         myquiz.add(q);
            
        }
    }
    
   } 
    
    public  void setQuestion(int index){
        jLabel2.setText("Question : " + (index+1) + "/" + myquiz.getNumQuestions());
   question q  = myquiz.getQuestion(index);
  if(q.getType()==0){
         jTextArea2.setText("");
        jTextArea2.setEnabled(false);
             jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
    jRadioButton3.setEnabled(true);
    jRadioButton4.setEnabled(true);
        jTextField1.setEnabled(true);
jTextField2.setEnabled(true);
jTextField3.setEnabled(true);
jTextField4.setEnabled(true);
         buttonGroup1.add(jRadioButton1);
                  buttonGroup1.add(jRadioButton2);
         buttonGroup1.add(jRadioButton3);
         buttonGroup1.add(jRadioButton4);
   jTextArea1.setText(q.getText());
   jTextField1.setText(q.getAnswer1());
      jTextField2.setText(q.getAnswer2());
   jTextField3.setText(q.getAnswer3());
   jTextField4.setText(q.getAnswer4());
   
   if(GUI.usertype==1){    jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    jRadioButton4.setSelected(false);
      if(q.getCorrectAnswers().contains(1))jRadioButton1.setSelected(true);
    if(q.getCorrectAnswers().contains(2))jRadioButton2.setSelected(true);

      if(q.getCorrectAnswers().contains(3))jRadioButton3.setSelected(true);
  if(q.getCorrectAnswers().contains(4))jRadioButton4.setSelected(true);   
   }else
if(q.getUserAnswers().size()>0){
  
  if(q.getUserAnswers().contains(1))jRadioButton1.setSelected(true);
    if(q.getUserAnswers().contains(2))jRadioButton2.setSelected(true);

      if(q.getUserAnswers().contains(3))jRadioButton3.setSelected(true);
  if(q.getUserAnswers().contains(4))jRadioButton4.setSelected(true);

  
}
  }
    if(q.getType()==1){
        jTextArea2.setText("");
        jTextArea2.setEnabled(false);
           jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
    jRadioButton3.setEnabled(true);
    jRadioButton4.setEnabled(true);
    jTextField1.setEnabled(true);
jTextField2.setEnabled(true);
jTextField3.setEnabled(true);
jTextField4.setEnabled(true);
           buttonGroup1.remove(jRadioButton1);
                  buttonGroup1.remove(jRadioButton2);
         buttonGroup1.remove(jRadioButton3);
         buttonGroup1.remove(jRadioButton4);
   jTextArea1.setText(q.getText());
   jTextField1.setText(q.getAnswer1());
      jTextField2.setText(q.getAnswer2());
   jTextField3.setText(q.getAnswer3());
   jTextField4.setText(q.getAnswer4());
    if(GUI.usertype==1){
           jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    jRadioButton4.setSelected(false);
      if(q.getCorrectAnswers().contains(1))jRadioButton1.setSelected(true);
    if(q.getCorrectAnswers().contains(2))jRadioButton2.setSelected(true);

      if(q.getCorrectAnswers().contains(3))jRadioButton3.setSelected(true);
  if(q.getCorrectAnswers().contains(4))jRadioButton4.setSelected(true);  
 
   }else
if(q.getUserAnswers().size()>0){
  
  if(q.getUserAnswers().contains(1))jRadioButton1.setSelected(true);
    if(q.getUserAnswers().contains(2))jRadioButton2.setSelected(true);

      if(q.getUserAnswers().contains(3))jRadioButton3.setSelected(true);
  if(q.getUserAnswers().contains(4))jRadioButton4.setSelected(true);

  
}
  } 
        if(q.getType()==2){
           jTextArea2.setEnabled(true);
    jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
    jRadioButton3.setEnabled(false);
    jRadioButton4.setEnabled(false);
jTextField1.setEnabled(false);
jTextField2.setEnabled(false);
jTextField3.setEnabled(false);
jTextField4.setEnabled(false);

   jTextArea1.setText(q.getText());
   jTextField1.setText("");
      jTextField2.setText("");
   jTextField3.setText("");
   jTextField4.setText("");
   if(GUI.usertype==1){
     jTextArea2.setText(q.getCorrextCode());  
   }
   else
if(!q.getUserCode().equals("")){
jTextArea2.setText(q.getUserCode());

  
}else jTextArea2.setText("write the answer here please ..");
  } 
    }
    int index=0;
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
    
    }
      
    private void jButton1ActionPerformed(ActionEvent evt) {
 if(index-1>-1){
        setQuestion(--index);
    }else
        JOptionPane.showMessageDialog(rootPane, "there is no previous questions , this is the first one");
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
    if(index+1<=max-1){
        setQuestion(++index);

    }else
        JOptionPane.showMessageDialog(rootPane, "there is no next questions , this is the last one");
    }
quiz myquiz;
    private void jButton6ActionPerformed(ActionEvent evt) {
    if(myquiz.getQuestion(index).getType()!=2){ 
      if(jRadioButton1.isSelected()) myquiz.getQuestion(index).getUserAnswers().add(1);
      if(jRadioButton2.isSelected()) myquiz.getQuestion(index).getUserAnswers().add(2);
         if(jRadioButton3.isSelected()) myquiz.getQuestion(index).getUserAnswers().add(3);
            if(jRadioButton4.isSelected()) myquiz.getQuestion(index).getUserAnswers().add(4);
    }else{
      myquiz.getQuestion(index).setUserCode(jTextArea2.getText());
    }
      JOptionPane.showMessageDialog(rootPane, "Your answer is saved.");
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
      int score = myquiz.getScore();
      double percentage = (double)score/(double)myquiz.getNumQuestions()*100;
      String result = "";
      if(percentage>50)
     result = String.format("Dear student\n"
                + "your score is : %.2f /100\n"
               + "You have answered "+score+" questions correctly out of " + myquiz.getNumQuestions()+""
                + "\n that is impressive , you passed  , congratulations" , percentage);
      else
      result = String.format("Dear student\n"
                + "your score is : %.2f /100\n"
               + "You have answered "+score+" questions correctly out of " + myquiz.getNumQuestions()+""
                + "\n sorry you didnt you passed  , try again later" , percentage);
        JOptionPane.showMessageDialog(rootPane,result);
         this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

    private void formComponentShown(ComponentEvent evt) {
           try {
           prepareQuiz(); setQuestion(index);
           if(GUI.usertype==1){
               jLabel1.setText("Quiz Editor");
           jButton6.setVisible(false);
               jButton5.setVisible(false);

           }else{
               jButton4.setVisible(false);
               jButton7.setVisible(false);

           }
       } catch (FileNotFoundException ex) {
           Logger.getLogger(RunQuiz.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }
    private void jButton7ActionPerformed(ActionEvent evt) {
    String question = jTextArea1.getText();
      if(question.equals("")){
           JOptionPane.showMessageDialog(rootPane, "Please enter the question");
            return;
      }
 
     if(myquiz.getQuestion(index).getType()!=2){
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
myquiz.getQuestion(index).setText(question);
myquiz.getQuestion(index).setAnswer1(answer1);
myquiz.getQuestion(index).setAnswer2(answer2);
myquiz.getQuestion(index).setAnswer3(answer3);
myquiz.getQuestion(index).setAnswer4(answer4);
myquiz.getQuestion(index).setCorrectAnswers(correct_answers);





     }else{
         
        String answer = jTextArea2.getText();
              if(answer.equals("")){
           JOptionPane.showMessageDialog(rootPane, "Please enter the answer code");
            return;
      } 
myquiz.getQuestion(index).setText(question);
myquiz.getQuestion(index).setCorrextCode(answer);


     
         
         
     }
 JOptionPane.showMessageDialog(rootPane, "Saved !");
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
            try {
            String name = "quizzes/"+filename+".quiz";
            name.replace(" ", "");
            System.out.println(name);
            File folder = new File(name);
            if(!folder.exists())folder.createNewFile();
            PrintWriter pw = new PrintWriter(folder);
            pw.append(filename+"\n");
            pw.append(myquiz.getNumQuestions()+"\n");
for(int i=0;i<myquiz.getNumQuestions();i++)
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
   JOptionPane.showMessageDialog(rootPane,"Quiz Updated successfully");
 this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        } catch (IOException ex) {
            Logger.getLogger(AddQuiz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    public static void main(String args[]) {
     
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunQuiz().setVisible(true);
            }
        });
    }

                 
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel5;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
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
   
}

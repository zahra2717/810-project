/**
 *
 * @author Zahra
 */
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;



public class GUI extends JFrame {
	   
    public GUI() {
        initComponents();
    }

  

    private void initComponents() {

        jPanel1 = new JPanel();
        jButton2 = new JButton();
        jTextField1 = new JTextField();
        jLabel1 = new JLabel();
        jTextField2 = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton3 = new JButton();
        jPanel2 = new JPanel();
        jLabel4 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<String>();
        jButton1 = new JButton();
        jButton4 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        jButton2.setText("Add a new Quiz");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jTextField1.setText("admin");
        jLabel1.setText("Username");
        jTextField2.setText("admin");
        jLabel2.setText("Password");
        jLabel3.setText("Log in");
        jButton3.setText("log in");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
       
       jButton4.setEnabled(false);
       jButton4.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent evt) {
       		jButton4ActionPerformed(evt);
       	}
       });
       jButton4.setText("log out");

       GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
       jPanel1Layout.setHorizontalGroup(
       	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
       		.addGroup(jPanel1Layout.createSequentialGroup()
       			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
       				.addGroup(jPanel1Layout.createSequentialGroup()
       					.addGap(28)
       					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
       						.addComponent(jLabel3)
       						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
       							.addGroup(jPanel1Layout.createSequentialGroup()
       								.addComponent(jLabel1)
       								.addPreferredGap(ComponentPlacement.UNRELATED)
       								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
       							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
       								.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       								.addGroup(jPanel1Layout.createSequentialGroup()
       									.addComponent(jLabel2)
       									.addPreferredGap(ComponentPlacement.UNRELATED)
       									.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
       								.addComponent(jButton4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
       				.addGroup(jPanel1Layout.createSequentialGroup()
       					.addContainerGap()
       					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)))
       			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );
       jPanel1Layout.setVerticalGroup(
       	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
       		.addGroup(jPanel1Layout.createSequentialGroup()
       			.addContainerGap()
       			.addComponent(jLabel3)
       			.addPreferredGap(ComponentPlacement.UNRELATED)
       			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
       				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
       				.addComponent(jLabel1))
       			.addPreferredGap(ComponentPlacement.RELATED)
       			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
       				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
       				.addComponent(jLabel2))
       			.addPreferredGap(ComponentPlacement.UNRELATED)
       			.addComponent(jButton3)
       			.addPreferredGap(ComponentPlacement.RELATED)
       			.addComponent(jButton4)
       			.addPreferredGap(ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
       			.addComponent(jButton2)
       			.addContainerGap())
       );
        jPanel1.setLayout(jPanel1Layout);
        jLabel4.setText("Start a quiz");
        jScrollPane1.setViewportView(jList1);
        jButton1.setText("Open selected");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
   GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
   jPanel2Layout.setHorizontalGroup(
   	jPanel2Layout.createParallelGroup(Alignment.LEADING)
   		.addGroup(jPanel2Layout.createSequentialGroup()
   			.addContainerGap()
   			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
   				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
   				.addGroup(jPanel2Layout.createSequentialGroup()
   					.addComponent(jLabel4)
   					.addGap(0, 189, Short.MAX_VALUE))
   				.addComponent(jButton1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
   			.addContainerGap())
   );
   jPanel2Layout.setVerticalGroup(
   	jPanel2Layout.createParallelGroup(Alignment.LEADING)
   		.addGroup(jPanel2Layout.createSequentialGroup()
   			.addContainerGap()
   			.addComponent(jLabel4)
   			.addPreferredGap(ComponentPlacement.UNRELATED)
   			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
   			.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
   			.addComponent(jButton1)
   			.addContainerGap())
   );
        jPanel2.setLayout(jPanel2Layout);

GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pack();
    }                    

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(usertype==1)
       {
           AddQuiz q = new AddQuiz(this);
           q.setVisible(true);
       }else
           JOptionPane.showMessageDialog(rootPane, "you have to log in as a teacher to continue");
    }//GEN-LAST:event_jButton2ActionPerformed
public void refershQuizzesList(){
    File f = new File("quizzes");
    if(!f.exists()){
        f.mkdir();
        return;
    }
   String[] quizzesNames = f.list();
    DefaultListModel<String> model = new DefaultListModel<String>();
  for (int i = 0; i < quizzesNames.length; i++) {
      model.add(i, quizzesNames[i].replace(".quiz",""));

    }
  jList1.setModel(model);   
}
    private void formComponentShown(ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
refershQuizzesList();
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   if(jList1.getSelectedValue()==null){
       JOptionPane.showMessageDialog(rootPane, "Please select a quiz first !");
       return;
   }
        String selected = jList1.getSelectedValue().toString();
        RunQuiz r  = new RunQuiz(selected , this);
        r.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed
public static int usertype=0;
    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          if(jTextField1.getText().equals("admin") && jTextField2.getText().equals("admin"))
       {
          usertype=1;
          JOptionPane.showMessageDialog(rootPane, "Welcome adminstrator");
          jButton3.setEnabled(false);
          jButton4.setEnabled(true);
       }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(ActionEvent evt){
    	usertype=0;
    	jButton3.setEnabled(true);
    	jButton4.setEnabled(false);
    }

    
    public static void main(String args[]) {
   

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JList<String> jList1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JTextField jTextField2;
}

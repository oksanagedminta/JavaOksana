
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.util.regex.*;


class new_account {
    new_account(){
        JFrame logs=new JFrame (" Account creater ");
        JLabel label=new JLabel (" Create a new account ");
        JLabel label1=new JLabel ("NAME");
        JLabel label2=new JLabel ("EMAIL ID");
        JLabel label3=new JLabel ("PASSWORD");
        JLabel label4=new JLabel ("ADDRESS");
        JLabel label5=new JLabel ("PHONE NUMBER");
        JTextField textLabel1=new JTextField();
        JTextField textLabel2=new JTextField();
        JPasswordField textLabel3=new JPasswordField();
        JTextField textLabel4=new JTextField();
        JTextArea textArea=new JTextArea("+371");
        JTextField textLabel5=new JTextField();
        JButton poga=new JButton ("CREATE ACCOUNT");

        logs.setVisible(true);
        logs.setLayout(null);
        logs.setSize(500, 400);

        label.setBounds(130, 20, 80, 30);
        label.setSize(200, 40);
        label.setFont(new Font("Aril", Font.BOLD, 18));
        label1.setBounds(20, 70, 80, 30);
        label1.setSize(120, 28);
        label2.setBounds(20, 100, 80, 30);
        label2.setSize(120, 28);
        label3.setBounds(20, 130, 80, 30);
        label3.setSize(120, 28);
        label4.setBounds(20, 160, 80, 30);
        label4.setSize(120, 28);
        label5.setBounds(20, 190, 80, 30);
        label5.setSize(120, 28);
        textLabel1.setBounds(120, 70, 80, 30);
        textLabel1.setSize(280, 28);
        textLabel1.setHorizontalAlignment(JLabel.CENTER);
        textLabel2.setBounds(120, 100, 80, 30);
        textLabel2.setSize(280, 28);
        textLabel3.setBounds(120, 130, 80, 30);
        textLabel3.setSize(280, 28);
        textLabel4.setBounds(120, 160, 80, 30);
        textLabel4.setSize(280, 28);
        textArea.setBounds(180, 190, 80, 30);
        textArea.setSize(40, 28);
        textArea.setForeground(Color.gray);
        textArea.setFont(new Font("Arial", Font.BOLD, 16));
        textLabel5.setBounds(220, 190, 80, 30);
        textLabel5.setSize(120, 28);
        poga.setBounds(120, 240, 80, 30);
        poga.setSize(150, 35);

        logs.add(label);
        logs.add(label1);
        logs.add(label2);
        logs.add(label3);
        logs.add(label4);
        logs.add(label5);
        logs.add(textLabel1);
        logs.add(textLabel2);
        logs.add(textLabel3);
        logs.add(textLabel4);
        logs.add(textArea);
        logs.add(textLabel5);       
        logs.add(poga);

        poga.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            if(ae.getActionCommand()==poga.getActionCommand())
            {     
                try{
                    String PATTERN="[0-9]{0,10}";
                    Pattern skaitli=Pattern.compile(PATTERN);
                    Matcher jabut=skaitli.matcher(textLabel5.getText());


                    if ((textLabel1.getText().isEmpty()) || (textLabel2.getText().isEmpty()) || (textLabel3.getText().isEmpty()) ||(textLabel4.getText().isEmpty()) ||(textArea.getText().isEmpty()) ||(textLabel5.getText().isEmpty()))
                    {FileWriter fileWriter = new FileWriter("account_rejected.txt", true);
                    fileWriter.write("\n" + label1.getText() + " : " + textLabel1.getText() + "\n");
                    fileWriter.write(label2.getText() + " : " + textLabel2.getText() + "\n");
                    fileWriter.write(label3.getText() + " : " + textLabel3.getText() + "\n");
                    fileWriter.write(label4.getText() + " : " + textLabel4.getText() + "\n");
                    fileWriter.write(label5.getText() + " : " + textArea.getText() + " " + textLabel5.getText() + "\n");
                    fileWriter.close();
                        JOptionPane.showMessageDialog(null, " Some fields are empty! ");    
                        
                        
                    
                    }else if (! jabut.matches()) 
                    {FileWriter fileWriter = new FileWriter("account_rejected.txt", true);
                    fileWriter.write("\n" + label1.getText() + " : " + textLabel1.getText() + "\n");
                    fileWriter.write(label2.getText() + " : " + textLabel2.getText() + "\n");
                    fileWriter.write(label3.getText() + " : " + textLabel3.getText() + "\n");
                    fileWriter.write(label4.getText() + " : " + textLabel4.getText() + "\n");
                    fileWriter.write(label5.getText() + " : " + textArea.getText() + " " + textLabel5.getText() + "\n");
                    fileWriter.close();
                        
                        JOptionPane.showMessageDialog(null, " For the PHONE NUMBER field, \n digits only can be used. ");
                    
                    } else {
                        {FileWriter fileWriter2 = new FileWriter("account_created.txt", true);
                        fileWriter2.write("\n" + label1.getText() + " : " + textLabel1.getText() + "\n");
                        fileWriter2.write(label2.getText() + " : " + textLabel2.getText() + "\n");
                        fileWriter2.write(label3.getText() + " : " + textLabel3.getText() + "\n");
                        fileWriter2.write(label4.getText() + " : " + textLabel4.getText() + "\n");
                        fileWriter2.write(label5.getText() + " : " + textArea.getText() + " " + textLabel5.getText() + "\n");
                        fileWriter2.close();

                        }
                        JOptionPane.showMessageDialog(null, " New account is successfylly created! " +"\n" + textLabel1.getText() + ", You are welcome! ");{
                            poga.setEnabled(false);
                        }  
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e + " Oops. Something went wrong! ");
                    e.printStackTrace();
                }
            }
            }
        });
    }
public static void main (String[] args) {
    new new_account();
}
}

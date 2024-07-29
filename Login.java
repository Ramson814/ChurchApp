 
package churchApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
 
public class Login extends JFrame implements ActionListener {
    
    JLabel lab;
    JTextField pinnumber,cardnumber;
    JButton login,cancel,signup;
    ImageIcon image;
    
    Login(){
        getContentPane().setBackground(new Color(0,153,255));
        setLayout(null);
        setUndecorated(true);
        
        
        JLabel head = new JLabel("RAMSONWARE COMPANY || CHURCH APP MINISTERS");
        head.setBounds(40, 20, 650, 30);
        head.setFont(new Font("Raleway", Font.BOLD, 24));
        head.setForeground(Color.orange);
        add(head);
         
        JPanel line = new JPanel();
        line.setBounds(2, 63, 775, 5);
        line.setBackground(Color.WHITE);
        add(line);
        
        JLabel cardno=new JLabel("USERNAME : ");
        cardno.setBounds(80,130,180,30);
        cardno.setFont(new Font("Raleway",Font.BOLD,18));
        cardno.setForeground(Color.WHITE);
        add(cardno);
        
        cardnumber=new JTextField();
        cardnumber.setBounds(230,130,250,30);
        cardnumber.setFont(new Font("Raleway",Font.BOLD,14));
        
        add(cardnumber);
        
        JLabel cardno1=new JLabel("EMAIL : ");
        cardno1.setBounds(80,210,180,30);
        cardno1.setFont(new Font("Raleway",Font.BOLD,18));
        cardno1.setForeground(Color.WHITE);
        add(cardno1);
        
        pinnumber=new JTextField();
        pinnumber.setBounds(230,210,250,30);
        pinnumber.setFont(new Font("Raleway",Font.BOLD,14));
        add(pinnumber);
        
        
        login=new JButton("LOGIN");
        login.setBounds(200,310,120,30);
        login.setFont(new Font("Serif",Font.BOLD,18));
        login.setBorder(null);
        login.setBackground(Color.WHITE);
        login.setForeground(new Color(0,153,255));
        login.addActionListener(this);
        add(login);
        
        cancel=new JButton("CANCEL");
        cancel.setBounds(380,310,120,30);
        cancel.setFont(new Font("Serif",Font.BOLD,18));
        cancel.setBorder(null);
        cancel.addActionListener(this);
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(new Color(0,153,255));
        add(cancel);
        
        signup=new JButton("SIGN UP");
        signup.setBounds(290,390,120,30);
        signup.addActionListener(this);
        signup.setBorder(null);
        signup.setBackground(Color.WHITE);
        signup.setForeground(new Color(0,153,255));
        signup.setFont(new Font("Serif",Font.BOLD,18));
        add(signup);
        
        setSize(700,490);
        setLocation(130,50);
        //frame.pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            String cardno=cardnumber.getText();
            String pinno=pinnumber.getText();
            String query="select * from login where cardnumber='"+cardno+"' and pinnumber='"+pinno+"' ";
            try{
            Conn con=new Conn();
            ResultSet rs=con.stmt.executeQuery(query);
             if(rs.next()){
                 String formno=rs.getString("formno");
                 System.out.println("Your login formno is: "+formno);
                 setVisible(false);
                 //new Transactions(pinno,formno).setVisible(true);
             }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect pinnumber or card number");
                setVisible(false);
                 new Login();
            }
            
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "YOUR INFORMATION MIGHT NOT BE CORRECT\n\tPLEASE CHECK OUT WISELY!!!!");
        }
            
        }
        
        
        else if(ae.getSource()==cancel){
            System.exit(0);
        }
        else {
            setVisible(false);
            new SignUp(""); 
        }
    }
    
    public static void main(String []args){
        new Login();
    }
}

 
package churchApplication;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.lang.System.Logger;
import javax.imageio.ImageIO;
import java.sql.*;
 
public class AdmnChurch extends JFrame implements ActionListener,Runnable{
    JLabel head,lab,imageProfile;
    JButton addbtn,viewbtn,removebtn,updatebtn,logout,profile,printCard;
    ImageIcon image;
    String empId,action,empName;
    JTable table;
    JPanel panel;
    private ImageIcon format=null;
    
     AdmnChurch(){
     
        
         System.out.println("EmpID is :"+empId);
         System.out.println("EmpID is :"+empName);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
         setUndecorated(true);
 
        try{
            File file=new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\ChurchApp\\src\\Icons\\light3.jpg");
            ImageIO.read(file);
            Image image2=ImageIO.read(file).getScaledInstance(1100, 720, Image.SCALE_DEFAULT);
            ImageIcon image=new ImageIcon(image2);
            lab=new JLabel(image);
            lab.setBounds(0,120,1100,720);
            add(lab); 
        }catch(Exception e){
            e.printStackTrace();
        }
        
        this.setContentPane(lab);    
        
        imageProfile=new JLabel("AREA");
        imageProfile.setBounds(60,10,100,100);
        imageProfile.setFont(new Font("SAN_SERIF",Font.BOLD,14));
        imageProfile.setForeground(Color.RED);
        add(imageProfile);
         
        head = new JLabel("CHURCH REGISTRATION SYSTEM");
        head.setBounds(240, 20, 800, 30);
        head.setFont(new Font("Raleway", Font.BOLD, 40));
        head.setForeground(Color.RED);
        add(head);
        
       
        addbtn=new JButton("Add Employee");
        addbtn.setBounds(540,90,170,30);
        addbtn.setFont(new Font("SAN_SERIF",Font.BOLD,13));
        addbtn.addActionListener(this);
        add(addbtn);
        
        viewbtn=new JButton("View Employee");
        viewbtn.setBounds(750,90,170,30);
        viewbtn.setFont(new Font("SAN_SERIF",Font.BOLD,13));
        viewbtn.addActionListener(this);
        add(viewbtn);
        
        updatebtn=new JButton("Update Employee");
        updatebtn.setBounds(540,150,170,30);
        updatebtn.setFont(new Font("SAN_SERIF",Font.BOLD,13));
        updatebtn.addActionListener(this);
        add(updatebtn);
        
        removebtn=new JButton("Remove Employee");
        removebtn.setBounds(750,150,170,30);
        removebtn.setFont(new Font("SAN_SERIF",Font.BOLD,13));
        removebtn.addActionListener(this);
        add(removebtn);
        
          try{
            File file=new File("C:\\Users\\RAMSON\\Downloads\\logout3.png");
            ImageIO.read(file);
            Image image3=ImageIO.read(file).getScaledInstance(30, 30, Image.SCALE_DEFAULT);
            image=new ImageIcon(image3);
          }catch(Exception e){
              e.printStackTrace();
          }
          
        printCard=new JButton();
        printCard.setText("Print CardID");
        printCard.setBounds(760,510,150,30);
        printCard.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        printCard.addActionListener(this);
        add(printCard);
          
          
        logout=new JButton();
        logout.setIcon(image); // 
        logout.setText("  Logout");
        logout.setBounds(760,570,150,30);
        logout.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        logout.addActionListener(this);
        add(logout);
        
        
        profile=new JButton();
        profile.setText("  Choose Profile");
        profile.setBounds(60,550,180,30);
        profile.setFont(new Font("SAN_SERIF",Font.BOLD,14));
        profile.addActionListener(this);
        add(profile);
     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// EXIT_ON_CLOSE will end up the task i.e running task
        setResizable(false);
        setSize(1100, 720);
        setLocation(180, 20);
        setVisible(true);
        
     
     
 
    }
 
   public void actionPerformed(ActionEvent ae){
//       if(ae.getSource()==addbtn){
//           action="Home";
//           setVisible(false);
//           new AddEmployee(action,action,empId).setVisible(true);
//       }
//       else if(ae.getSource()==viewbtn){
//           setVisible(false);
//           new ViewEmployee(empId);
//       }
//       else if(ae.getSource()==updatebtn){
//           setVisible(false);
//           new UpdateEmployee(empId);
//       }
//       else if(ae.getSource()==removebtn){
//           setVisible(false);
//           new RemoveEmployee(empId);
//       }
//        else if(ae.getSource()==logout){
//           setVisible(false);
//           new Login();
//        }
//        else if(ae.getSource()==printCard){
//           setVisible(false);
//           new EmployeeCard("");
//        }
// 
//     
//        else if(ae.getSource()==profile){
//          setVisible(false);
//           new ProfileUpload( empId,empName);
//              
//         }
   }
   
   public void run(){
        
   }
    public static void main(String []args){
        new AdmnChurch();
    }
    
    
}

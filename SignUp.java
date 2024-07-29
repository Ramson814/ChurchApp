 
package churchApplication;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.*;

 
public class SignUp extends JFrame implements ActionListener {
    
     JTextField jname,jfname,jemail,jaddress,jphone,jdesignation,jsalary,jazam;
     JButton add,back,print;
     JDateChooser jdob;
     JComboBox jeducation;
     JLabel employeeID;
    String employeeid,action;
    
    JPanel pan1;
    
    SignUp(String action){
        this.action=action;
        
        Random ran=new Random();
        Long empId=Math.abs((ran.nextLong() % 900000L)+100000L);
        employeeid=empId.toString();
        
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
        pan1=new JPanel();
        pan1.setBounds(0,0,800,590);
        pan1.setBackground(Color.WHITE);
        add(pan1);
        
        GroupLayout pan1Layout=new GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(pan1Layout.createParallelGroup());
        
        JLabel cardno = new JLabel("Worshipper Details ");
        cardno.setBounds(240, 50, 400, 30);
        cardno.setFont(new Font("Raleway", Font.BOLD, 22));
        pan1.add(cardno);
        
        JLabel labname = new JLabel("Name :");
        labname.setBounds(80, 140, 100, 30);
        labname.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labname);
        
        jname=new JTextField();
        jname.setBounds(190,140,180,30);
        jname.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jname);
        
        JLabel labfname = new JLabel("Father's Name:");
        labfname.setBounds(390, 140, 150, 30);
        labfname.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labfname);
        
        jfname=new JTextField();
        jfname.setBounds(550,140,180,30);
        jfname.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jfname);
        
        JLabel labedob = new JLabel("Date of Birth :");
        labedob.setBounds(80, 200, 120, 30);
        labedob.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labedob);
      
        
        jdob = new JDateChooser();
        SimpleDateFormat sdf=new SimpleDateFormat();
        jdob.setDateFormatString("dd/MM/yyyy");
        jdob.getDate();
        jdob.setBounds(190,200,180,30);
        jdob.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jdob);
        
        
        JLabel labeladdress = new JLabel("Baptised Name:");
        labeladdress.setBounds(390, 200, 130, 30);
        labeladdress.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labeladdress);
        
        jsalary=new JTextField();
        jsalary.setBounds(550,200,180,30);
        jsalary.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jsalary);
       
        JLabel labelgender = new JLabel("Address:");
        labelgender.setBounds(80,260,180,30);
        labelgender.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labelgender);
        
        jaddress=new JTextField();
        jaddress.setBounds(190,260,180,30);
        jaddress.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jaddress);
        
        
        JLabel labcity = new JLabel("Phone :");
        labcity.setBounds(390, 260, 100, 30);
        labcity.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labcity);
        
        jphone=new JTextField();
        jphone.setBounds(550,260,180,30);
        jphone.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jphone);

      
        JLabel labelemail = new JLabel("Email :");
        labelemail.setBounds(80, 320, 100, 30);
        labelemail.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labelemail);
        
        jemail=new JTextField();
        jemail.setBounds(190,320,180,30);
        jemail.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jemail);
        
        JLabel labeducation = new JLabel("Highest Education:");
        labeducation.setBounds(390, 320, 150, 30);
        labeducation.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labeducation);
        
        String [] valEducation={"PHD","MASTERS","DEGREE","DIPLOMA","CERTIFICATE","SECONDARY","PRIMARY","Non-Educated",};
        
        jeducation=new JComboBox(valEducation);
        jeducation.setBounds(550, 320, 180, 30);
        jeducation.setFont(new Font("Raleway", Font.PLAIN, 15));
        jeducation.setBackground(Color.WHITE);
        pan1.add(jeducation);
        
        
        
        JLabel labstate = new JLabel("Designation:");
        labstate.setBounds(80, 380, 120, 30);
        labstate.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labstate);
        
        jdesignation=new JTextField();
        jdesignation.setBounds(190,380,180,30);
        jdesignation.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jdesignation);
       
        
        JLabel labcouncil1 = new JLabel("REG No :");
        labcouncil1.setBounds(390, 380, 120, 30);
        labcouncil1.setFont(new Font("Raleway", Font.BOLD, 16));
        pan1.add(labcouncil1);
        
        jazam=new JTextField();
        jazam.setBounds(550,380,180,30);
        jazam.setFont(new Font("Raleway",Font.BOLD,14));
        pan1.add(jazam);
        
        JLabel labcouncil = new JLabel("Member ID :");
        labcouncil.setBounds(80, 500, 120, 30);
        labcouncil.setFont(new Font("Raleway", Font.BOLD, 17));
        pan1.add(labcouncil);
        
        employeeID=new JLabel();
        employeeID.setBounds(190,500,200,30);
        employeeID.setFont(new Font("Raleway",Font.BOLD,16));
        pan1.add(employeeID);
        
        employeeID.setText(employeeid);
        
        add=new JButton("Submit");
        add.setBounds(250,595,120,30);
        add.setFont(new Font("Serif",Font.BOLD,18));
        add.addActionListener(this);
        add(add);
        
        back=new JButton("Cancel");
        back.setBounds(540,595,120,30);
        back.setFont(new Font("Serif",Font.BOLD,18));
        back.addActionListener(this);
        add(back);
        
        print=new JButton("Print");
        print.setBounds(400,640,120,30);
        print.setFont(new Font("Serif",Font.BOLD,18));
        print.addActionListener(this);
        add(print);
        
        if(action.equals("LOGIN")){
            add.setText("Register");
 
        }
        
        else if(action.equals("Home")){
            add.setText("Add Employee");
            
        }
        
         setResizable(false);
         setSize(800,720);
         setLocation(90,20);
       // pack();
        setLocationRelativeTo(null);
         setVisible(true);
    }
 
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==add){
            
            String name=jname.getText();
            String fname=jfname.getText();
            String salary=jsalary.getText();
            String address=jaddress.getText();
            String phone=jphone.getText();
            String email=jemail.getText();
            String designation=jdesignation.getText();
            String education=jeducation.getSelectedItem().toString();
            String azamno=jazam.getText();
            String dob=(String)jdob.getDateFormatString();
            String empId=employeeID.getText();
            
        if(action.equals("LOGIN")){
        
             try{
                Conn con=new Conn();
                String query="insert into  employee values ('"+name+"''"+fname+"','"+dob+"''"+salary+"','"+address+"','"+phone+"','"+email+"','"+designation+"','"+education+"' ,'"+azamno+"','"+empId+"')";
               // con.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Detail added successfully");
                setVisible(false);
                new Login().setVisible(true);
              
            }catch(Exception e){
                System.out.println(e);
            }
           }
           
           else if(action.equals("Home")){
                try{
                Conn con=new Conn();
                String query="insert into  employee values ('"+name+"''"+fname+"','"+dob+"''"+salary+"','"+address+"','"+phone+"','"+email+"','"+designation+"','"+education+"' ,'"+azamno+"','"+empId+"')";
               // con.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Detail added successfully");
                setVisible(false);
                // new Home("","").setVisible(true);
              
            }catch(Exception e){
                System.out.println(e);
            }
               
           }
        }
        else if(ae.getSource()==back){
//            if(action.equals("LOGIN")){
              setVisible(false);
              new Login().setVisible(true);
//               }
//            else{
//            setVisible(false);
           // new Home("","");
//            }
        }
        else if (ae.getSource()==print){
          PrinterJob job = PrinterJob.getPrinterJob(); 
          job.setJobName("Print Data");
          job.setPrintable(new Printable(){
          public int print(Graphics pg, PageFormat pf, int pageNum) {
              if (pageNum >0) {
                  return Printable.NO_SUCH_PAGE;
              }
              
               Graphics2D g2 =(Graphics2D)pg;
               g2.translate(pf.getImageableX(), pf.getImageableY());
               g2.scale(0.78,1.41);
           
               
                pan1.paint (g2);
                return Printable.PAGE_EXISTS;
          }
     });
     boolean ok = job.printDialog();
     if(ok){
          try{
             job.print();
         }catch (PrinterException ex){
             
         }
        }
        
    }
    } 
     public static void main(String []args){
        new SignUp("");
    }
    
}

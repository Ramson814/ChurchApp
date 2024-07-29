 
 
package churchApplication;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;

public class Splash1 extends JFrame implements ActionListener{
    JLabel head,head2,lab1,lab2,arrow,arrow1,arrow2,login,signup,passport,photo,login2,login1;
    JPanel pan1,pan2;
     
     
    
   Splash1(){
        getContentPane().setBackground(new Color(87, 89, 87));
        setLayout(null);
        
       setUndecorated(true);
 
        pan1=new JPanel();
        pan1.setBounds(0,0,700,700);
        add(pan1);
 
        lab1=new JLabel();
        lab1.setBounds(0,0,700,700);
        pan1.add(lab1);
        
        lab2=new JLabel();
        lab2.setBounds(0,0,700,700);
        pan1.add(lab2);
        
         try{
        File file=new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\ChurchApp\\src\\Icons\\world´s worshipers 1.png");
            ImageIO.read(file);
            Image image2=ImageIO.read(file).getScaledInstance(lab1.getWidth(), lab1.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image=new ImageIcon(image2);
            
           //lab1=new JLabel(image);
             lab1.setBounds(0,0,700,700);
             lab1.setIcon(image);
            // add(lab1);
            //this.setContentPane(lab1);
        }catch(Exception e){
            e.printStackTrace();
        }
         
         
             try{
        File file=new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\ChurchApp\\src\\Icons\\world´s worshipers 2.png");
            ImageIO.read(file);
            Image image2=ImageIO.read(file).getScaledInstance(lab2.getWidth(), lab2.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image=new ImageIcon(image2);

             lab2.setBounds(0,0,700,700);
             lab2.setIcon(image);
           
        }catch(Exception e){
            e.printStackTrace();
        }
         
   
        head = new JLabel("RAMSONWARE || STATIONARY");
        head.setBounds(35, 28, 620, 30);
        head.setFont(new Font("SAN_SERIF", Font.BOLD, 39));
        head.setForeground(new Color(31, 24, 181));
        head.setVisible(false);
        //lab2.add(head); 
        
        passport = new JLabel("PassPort Size");
        passport.setBounds(425 , 82, 620, 30);
        passport.setFont(new Font("Raleway", Font.PLAIN, 31));
        passport.setForeground(new Color(204,204,204));
//        passport.setVisible(false);
        lab2.add(passport);
        
        photo = new JLabel("PhotoPrinting");
        photo.setBounds(425, 228, 620, 35);
        photo.setFont(new Font("Raleway", Font.PLAIN, 31));
        photo.setForeground(new Color(204,204,204));
//        photo.setVisible(false);
        lab2.add(photo);
        
        arrow=new JLabel("");
        arrow.setBounds(730, 610, 90, 30);
        arrow.setForeground(Color.GREEN);
        arrow.setFont(new Font("Serif",Font.BOLD,40));
        add(arrow);
        
              try{
        File file=new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\ChurchApp\\src\\Icons\\PRINTER.jpg");
            ImageIO.read(file);
            Image image2=ImageIO.read(file).getScaledInstance(lab2.getWidth(), lab2.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image=new ImageIcon(image2);
            
           //lab1=new JLabel(image);
             lab2.setBounds(0,0,700,700);
             lab2.setIcon(image);
            // add(lab1);
            //this.setContentPane(lab1);
        }catch(Exception e){
            e.printStackTrace();
        }
            
        
        
        
        arrow1=new JLabel("=>");
        arrow1.setBounds(830, 620, 90, 30);
        arrow1.setForeground(Color.WHITE);
        arrow1.setFont(new Font("Serif",Font.BOLD,30));
        add(arrow1);
        arrow1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae){
             arrow1.setVisible(false);
             arrow2.setVisible(true);
             head.setVisible(true);
             arrow.setVisible(false);
             login.setVisible(true);
             signup.setVisible(true);
             lab1.setVisible(false);
             lab2.setVisible(true);
            }
        });
        
        
        arrow2=new JLabel("");
        arrow2.setBounds(830, 620, 90, 30);
        arrow2.setVisible(false);
        arrow2.setFont(new Font("Serif",Font.BOLD,30));
        arrow2.setForeground(Color.WHITE);
        add(arrow2);
        arrow2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae){
             arrow2.setVisible(false);
             arrow1.setVisible(true);
             login.setVisible(false);
             arrow.setVisible(true);
             head.setVisible(false);
             signup.setVisible(false);
             lab2.setVisible(false);
             lab1.setVisible(true);
            }
        });
        
        
        
        login1=new JLabel(" ");
        login1.setBounds(710,480,190,30);
        login1.setFont(new Font("Serif",Font.BOLD,22));
        login1.setForeground(Color.WHITE);
        //login.setVisible(false);
        add(login1);
        
        login2=new JLabel(" ");
        login2.setBounds(710,520,190,30);
        login2.setFont(new Font("Serif",Font.BOLD,22));
        login2.setForeground(Color.WHITE);
       // login.setVisible(false);
       // add(login2);
        
        login=new JLabel("   ");
        login.setBounds(710,560,190,30);
        login.setFont(new Font("Serif",Font.BOLD,22));
        login.setForeground(Color.WHITE);
        login.setVisible(false);
        login.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae){
                 
             setVisible(false);
             new Login().setVisible(true);
            }
        });

        add(login);
        
        signup=new JLabel(" ");
        signup.setBounds(709,600,210,30);
        signup.setFont(new Font("Serif",Font.BOLD,22));
        signup.setForeground(Color.WHITE);
        signup.setVisible(false);
        signup.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae){
                 
             setVisible(false);
             new Login().setVisible(true);            }
        });

        add(signup);
        
        int i=1;
         while (i<11) {                
                arrow.setVisible(false);
                
                  try {
                      Thread.sleep(300);
                  } catch (Exception e) {
                      System.out.println(""+e);
                  }
                  
                  arrow.setVisible(true);
                
                  try {
                      Thread.sleep(300);
                  } catch (Exception e) {
                      System.out.println(""+e);
                  }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(900, 900);
        setLocation(100, 10);
        setLocationRelativeTo(null);
        setVisible(true);
        
        i++;
        
     }
   }
   
 
   public void actionPerformed(ActionEvent ae){
    
       
   }
   public static void main(String [] args){
       new Splash1();
       
   }

   
}

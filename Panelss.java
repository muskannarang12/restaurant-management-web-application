/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelss;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class Panelss extends JFrame implements ActionListener {

    JTextField name;
    JPanel npanel;
    JButton login, logout;
    JButton menu, order, showsales, showpayments, employees;
    JPanel btnpanel;
    JLabel user, pass;
    JTextField username;
    JPasswordField password;
    JPanel upanel;
    DefaultTableModel model;
    JButton loginbtn;
    ImageIcon img;
    JLabel label ,labelpic;
    JCheckBox cb;
    JLabel lbl, lbl2, lbl3, lbl5;
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
    JCheckBox d1, d2, d3;
    JCheckBox s1, s2, s3, s4, s5;
    JPanel pnl, pnl2;
    JButton orderbtn;
    JTextField n, q;
    JLabel nm, qu;
    JTextField q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26, q27, q28;
    JButton delete, update,remove,add;
    JPanel spanel;
    JTextField txt;
    JTextArea area;
    JTextField feedback;
    JButton save;
    JTable etable;
    JScrollPane scroll;
    String data[][]={{"ID","NAME","PHONE NUMBER","SALARY", "CITY" },
        { "101","Amit","02337314232","35000", "kandhkot"},    
                          {"102","ritik","0765324156","15000", "sukkur"},    
                          {"103","deepak","04367654321","70,000", "Hyderabad" },
                      {"104","shubham","04367462321","20,000", "Shikarpur" },
      {"105","shubham","04367462321","40,000", "deharki" },
  {"106","rahul","043676541","50,000", "karachi" }};
    
      
            
   
    String column[]={"ID" ,"NAME","PHONE NUMBER "," SALARY" , "ADDRESS"};     

    
    double amount = 0;
            String msg = " VISHAN RESTAURANT \n";
            String X;
          
    public Panelss() {
        setSize(1800,1000);
        setMinimumSize(new Dimension(1000,1000));
        name = new JTextField(30);
        name.setText(" VISHAN RESTAURANT MANAGEMENT SYSTEM");
        name.setFont(new Font("serif", Font.BOLD, 25));
        name.setPreferredSize(new Dimension(100, 100));
        name.setBackground(Color.PINK);

        login = new JButton();
        login.setText("Login");
        login.addActionListener(new login());
        logout = new JButton("Logout");
        logout.setEnabled(false);
        logout.addActionListener(new logout());

        npanel = new JPanel();
        npanel.add(name);
        npanel.add(login);
        npanel.add(logout);
        npanel.setLayout(new FlowLayout());
        npanel.setBackground(Color.pink);
        npanel.setPreferredSize(new Dimension(100, 100));

        menu = new JButton();
        menu.setText("SHOW MENU ITEMS");
        menu.setPreferredSize(new Dimension(200, 150));
        menu.addActionListener(new menu());
        menu.setEnabled(false);
        order = new JButton();
        order.setText("ORDER MANAGEMENT");
        order.setPreferredSize(new Dimension(200, 150));
        order.addActionListener(new order());
        order.setEnabled(false);
        order.setVisible(true);
        showsales = new JButton(" UPDATE ORDER ");
        showsales.addActionListener(new update());
        showsales.setEnabled(false);
        showsales.setPreferredSize(new Dimension(200, 150));
        showsales.setVisible(true);
        showpayments = new JButton("GIVE FEEDBACK");
        showpayments.setPreferredSize(new Dimension(200, 150));
        showpayments.setEnabled(false);
        showpayments.setVisible(true);
        showpayments.addActionListener(new feedback());
        employees = new JButton("MANAGE EMPLOYEES");
        employees.setPreferredSize(new Dimension(200, 150));
        employees.setEnabled(false);
        employees.addActionListener(new manage());
        employees.setVisible(true);
     
      
       
        btnpanel = new JPanel();
        btnpanel.setPreferredSize(new Dimension(200, 800));
        btnpanel.add(menu);
        btnpanel.add(order);
        btnpanel.add(showsales);
        btnpanel.add(employees);
        btnpanel.add(showpayments);
        btnpanel.setVisible(true);

        spanel = new JPanel();
        spanel.setPreferredSize(new Dimension(1300, 100));
        spanel.setBackground(Color.lightGray);
        add(spanel, BorderLayout.SOUTH);

        txt = new JTextField(50);
        txt.setBackground(Color.white);
        txt.setForeground(Color.black);
        txt.setBounds(600, 1200, 300, 100);
        txt.setFont(new Font("SERIF", Font.PLAIN, 20));
        spanel.add(txt);

        upanel = new JPanel();
        upanel.setBackground( Color.darkGray);
        upanel.setPreferredSize(new Dimension(1500, 1700));
        Dimension sizze = upanel.getPreferredSize(); //Gets the size of the image
        upanel.setBounds(200, 100, sizze.height, sizze.width); //Sets the location of the image
        upanel.setVisible(false);
        upanel.setLayout(null);
        add(upanel);
        
        
        user = new JLabel("\n Enter Username:");
        user.setForeground(Color.pink);
        user.setFont(new Font("SERIF", Font.PLAIN, 20));
        user.setBounds(150, 100, 450, 25);
        user.setVisible(false);
        username = new JTextField(40);
        username.setBounds(340, 100, 300, 25);
        username.setFont(new Font("SERIF", Font.PLAIN, 20));
        username.setVisible(false);
        pass = new JLabel("\n Enter Password:");
        pass.setForeground(Color.pink);
        pass.setBounds(150, 160, 950, 25);
        pass.setFont(new Font("SERIF", Font.PLAIN, 20));
        pass.setVisible(false);
        password = new JPasswordField(40);
        password.setBounds(340, 160, 300, 30);
        password.setFont(new Font("SERIF", Font.PLAIN, 20));
        password.setVisible(false);
        cb = new JCheckBox("Login as client");
        cb.setForeground(Color.pink);
        cb.setBackground(Color.darkGray);
        cb.setBounds(340, 200, 450, 25);
        cb.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb.setVisible(false);
        cb.addItemListener(new action());

            
              
        
        loginbtn = new JButton("LOGIN");
        loginbtn.setBounds(270, 250, 300, 25);
        loginbtn.setForeground(Color.pink);
        loginbtn.setPreferredSize(new Dimension(50, 50));
        loginbtn.addActionListener(new loginbtn());
        loginbtn.setVisible(false);
        
        labelpic = new JLabel();
        labelpic.setIcon(new ImageIcon("hh.jpg"));
        Dimension siize = labelpic.getPreferredSize(); 
        labelpic.setBounds(400, 300, siize.width, siize.height); 
        labelpic.setVisible(false);
        
        label = new JLabel();
        label.setIcon(new ImageIcon("food.jpg"));
        Dimension size = label.getPreferredSize(); 
        label.setBounds(330, 120, size.width, size.height); 
        add(label);  
        label.setVisible(true);
     
 
        upanel.add(user);
        upanel.add(username);
        upanel.add(pass);
        upanel.add(password);
        upanel.add(cb);
        upanel.add(loginbtn);
        upanel.add(labelpic);
       

        lbl = new JLabel("\t \t STARTERS:");
        lbl.setBounds(80, 20, 220, 50);
        lbl.setFont(new Font("SERIF", Font.ITALIC, 25));
        lbl.setForeground(Color.RED);
        lbl.setBackground(Color.white);
        lbl.setOpaque(true);
        cb1 = new JCheckBox("FRIES.........50$");
        cb1.setBounds(80, 80, 220, 50);
        cb1.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb1.setForeground(Color.RED);
        cb1.setBackground(Color.darkGray);
        q1 = new JTextField();
        q1.setBounds(325, 90, 40, 30);
        q1.setBackground(Color.white);
        q1.setVisible(false); 
        cb2 = new JCheckBox("FISH FINGER.........78$");
        cb2.setBounds(80, 130, 250, 50);
        cb2.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb2.setForeground(Color.RED);
        cb2.setBackground(Color.darkGray); 
        q2 = new JTextField();
        q2.setBounds(325, 140, 40, 30);
        q2.setBackground(Color.white);
        q2.setVisible(false);
        cb3 = new JCheckBox("CHEESE NAAN.........80$");
        cb3.setBounds(80, 180, 250, 50);
        cb3.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb3.setForeground(Color.RED);
        cb3.setBackground(Color.darkGray);
        q3 = new JTextField();
        q3.setVisible(false);
        q3.setBounds(325, 190, 40, 30);
        q3.setBackground(Color.white);
        cb4 = new JCheckBox("MEATBALL.........59$");
        cb4.setBounds(80, 230, 250, 50);
        cb4.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb4.setForeground(Color.RED);
        q4 = new JTextField();
        q4.setBounds(325, 240, 40, 30);
        q4.setBackground(Color.white);
        q4.setVisible(false);
        cb4.setBackground(Color.darkGray);
        cb5 = new JCheckBox("RASHMI KABAB.........98$");
        cb5.setBounds(80, 280, 250, 50);
        cb5.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb5.setForeground(Color.RED);
        cb5.setBackground(Color.darkGray);
        q5 = new JTextField();
        q5.setBounds(325, 290, 40, 30);
        q5.setBackground(Color.white);
        q5.setVisible(false);
        cb6 = new JCheckBox("MALAI BOOTI.........346$");
        cb6.setBounds(80, 330, 250, 50);
        cb6.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb6.setForeground(Color.RED);
        q6 = new JTextField();
        q6.setBounds(325, 340, 40, 30);
        q6.setBackground(Color.white);
        q6.setVisible(false);
        cb6.setBackground(Color.darkGray);
        cb7 = new JCheckBox("SPRING ROLLS.........50$");
        cb7.setBounds(80, 380, 250, 50);
        cb7.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb7.setForeground(Color.RED);
        q7 = new JTextField();
        q7.setBounds(325, 390, 40, 30);
        q7.setBackground(Color.white);
        q7.setVisible(false);
        cb7.setBackground(Color.darkGray);
        cb8 = new JCheckBox("CAESAR SALAD.........50$");
        cb8.setBounds(80, 430, 250, 50);
        cb8.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb8.setForeground(Color.RED);
        cb8.setBackground(Color.darkGray);
        q8 = new JTextField();
        q8.setVisible(false);
        q8.setBounds(325, 440, 40, 30);
        q8.setBackground(Color.white);
        cb9 = new JCheckBox("WINGS.........50$");
        cb9.setBounds(80, 480, 250, 50);
        cb9.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb9.setForeground(Color.RED);
        cb9.setBackground(Color.darkGray);
        q9 = new JTextField();
        q9.setBounds(325, 490, 40, 30);
        q9.setVisible(false);
        q9.setBackground(Color.white);
        cb10 = new JCheckBox("HOTSHOTS.........50$");
        cb10.setBounds(80, 530, 250, 50);
        cb10.setFont(new Font("SERIF", Font.PLAIN, 20));
        cb10.setForeground(Color.RED);
        cb10.setBackground(Color.darkGray);
        q10 = new JTextField();
        q10.setBounds(325, 540, 40, 30);
        q10.setBackground(Color.white);
        q10.setVisible(false);

        lbl2 = new JLabel("\t \t FAMILY PLATTERS:");
        lbl2.setBounds(420, 20, 350, 50);
        lbl2.setFont(new Font("SERIF", Font.ITALIC, 25));
        lbl2.setForeground(Color.RED);
        lbl2.setBackground(Color.white);
        lbl2.setOpaque(true);

        c1 = new JCheckBox("MUTTON MASKA HANDI........200$");
        c1.setBounds(420, 80, 350, 50);
        c1.setFont(new Font("SERIF", Font.PLAIN, 20));
        c1.setForeground(Color.RED);
        c1.setBackground(Color.darkGray);
        q11 = new JTextField();
        q11.setBounds(770, 90, 40, 30);
        q11.setBackground(Color.white);
        q11.setVisible(false);

        c2 = new JCheckBox("CHICKEN SHAHI HANDI.........170$");
        c2.setBounds(420, 130, 350, 50);
        c2.setFont(new Font("SERIF", Font.PLAIN, 20));
        c2.setForeground(Color.RED);
        c2.setBackground(Color.darkGray);
        q12 = new JTextField();
        q12.setBounds(770, 140, 40, 30);
        q12.setBackground(Color.white);
        q12.setVisible(false);

        c3 = new JCheckBox("PANEER RASHMI HANDI.........47800$");
        c3.setBounds(420, 180, 350, 50);
        c3.setFont(new Font("SERIF", Font.PLAIN, 20));
        c3.setForeground(Color.RED);
        c3.setBackground(Color.darkGray);
        q13 = new JTextField();
        q13.setBounds(770, 190, 40, 30);
        q13.setBackground(Color.white);
        q13.setVisible(false);

        c4 = new JCheckBox("MUTTON SIJJI.........300$");
        c4.setBounds(420, 230, 350, 50);
        c4.setFont(new Font("SERIF", Font.PLAIN, 20));
        c4.setForeground(Color.RED);
        c4.setBackground(Color.darkGray);
        q14 = new JTextField();
        q14.setBounds(770, 240, 40, 30);
        q14.setBackground(Color.white);
        q14.setVisible(false);

        c6 = new JCheckBox("CHICKEN DHAKA.........555$");
        c6.setBounds(420, 280, 350, 50);
        c6.setFont(new Font("SERIF", Font.PLAIN, 20));
        c6.setForeground(Color.RED);
        c6.setBackground(Color.darkGray);
        q16 = new JTextField();
        q16.setBounds(770, 290, 40, 30);
        q16.setBackground(Color.white);
        q16.setVisible(false);

        c5 = new JCheckBox("CHICKEN CHOWMIEN.........850$");
        c5.setBounds(420, 330, 350, 50);
        c5.setFont(new Font("SERIF", Font.PLAIN, 20));
        c5.setForeground(Color.RED);
        c5.setBackground(Color.darkGray);

        q15 = new JTextField();
        q15.setBounds(770, 340, 40, 30);
        q15.setBackground(Color.white);
        q15.setVisible(false);

        c7 = new JCheckBox("WHITE DAHI KARAHI.........270$");
        c7.setBounds(420, 380, 350, 50);
        c7.setFont(new Font("SERIF", Font.PLAIN, 20));
        c7.setForeground(Color.RED);
        c7.setBackground(Color.darkGray);

        q17 = new JTextField();
        q17.setBounds(770, 390, 40, 30);
        q17.setBackground(Color.white);
        q17.setVisible(false);

        c8 = new JCheckBox("MIX VEGETABLE.........500$");
        c8.setBounds(420, 430, 350, 50);
        c8.setFont(new Font("SERIF", Font.PLAIN, 20));
        c8.setBackground(Color.darkGray);
        c8.setForeground(Color.RED);
        q18 = new JTextField();
        q18.setBounds(770, 440, 40, 30);
        q18.setBackground(Color.white);
        q18.setBackground(Color.white);
        q18.setVisible(false);

        c9 = new JCheckBox("PALAK PANEER.........780$");
        c9.setBackground(Color.darkGray);
        c9.setBounds(420, 480, 350, 50);
        c9.setFont(new Font("SERIF", Font.PLAIN, 20));
        c9.setForeground(Color.RED);
        q19 = new JTextField();
        q19.setBounds(770, 490, 40, 30);
        q19.setBackground(Color.white);
        q19.setVisible(false);

        c10 = new JCheckBox("SHAHI DAAL........400$");
        c10.setBounds(420, 530, 350, 50);
        c10.setFont(new Font("SERIF", Font.PLAIN, 20));
        c10.setForeground(Color.RED);
        c10.setBackground(Color.darkGray);

        q20 = new JTextField();
        q20.setBounds(770, 540, 40, 30);
        q20.setBackground(Color.white);
        q20.setVisible(false);

        lbl3 = new JLabel("SOUP & SALAD");
        lbl3.setBounds(870, 20, 350, 50);
        lbl3.setFont(new Font("SERIF", Font.ITALIC, 25));
        lbl3.setForeground(Color.RED);
        lbl3.setBackground(Color.white);
        lbl3.setOpaque(true);

        s1 = new JCheckBox("CHIKEN CORN SOUP.........300$");
        s1.setBounds(870, 80, 350, 50);
        s1.setFont(new Font("SERIF", Font.PLAIN, 20));
        s1.setForeground(Color.RED);
        s1.setBackground(Color.darkGray);
        q21 = new JTextField();
        q21.setBounds(1240, 90, 40, 30);
        q21.setBackground(Color.white);
        q21.setVisible(false);

        s2 = new JCheckBox("HOT & SOUR SOUP.........750$");
        s2.setBounds(870, 130, 350, 50);
        s2.setFont(new Font("SERIF", Font.PLAIN, 20));
        s2.setForeground(Color.RED);
        s2.setBackground(Color.darkGray);
        q22 = new JTextField();
        q22.setBounds(1240, 140, 40, 30);
        q22.setVisible(false);
        q22.setBackground(Color.white);

        s5 = new JCheckBox("RAITA.........59$");
        s5.setBounds(870, 180, 350, 50);
        s5.setFont(new Font("SERIF", Font.PLAIN, 20));
        s5.setForeground(Color.RED);
        s5.setBackground(Color.darkGray);
        q23 = new JTextField();
        q23.setBounds(1240, 190, 40, 30);
        q23.setBackground(Color.white);
        q23.setVisible(false);

        s3 = new JCheckBox("FRESH GREEN SALD.........70$");
        s3.setBounds(870, 230, 350, 50);
        s3.setFont(new Font("SERIF", Font.PLAIN, 20));
        s3.setForeground(Color.RED);
        s3.setBackground(Color.darkGray);
        q24 = new JTextField();
        q24.setBounds(1240, 240, 40, 30);
        q24.setBackground(Color.white);
        q24.setVisible(false);

        s4 = new JCheckBox("RUSSIAN SALAD.........90$");
        s4.setBounds(870, 280, 350, 50);
        s4.setFont(new Font("SERIF", Font.PLAIN, 20));
        s4.setForeground(Color.RED);
        s4.setBackground(Color.darkGray);
        q25 = new JTextField();
        q25.setBounds(1240, 290, 40, 30);
        q25.setVisible(false);
        q25.setBackground(Color.white);

        lbl5 = new JLabel(" DESERT");
        lbl5.setBounds(870, 330, 370, 50);
        lbl5.setFont(new Font("SERIF", Font.ITALIC, 25));
        lbl5.setForeground(Color.RED);
        lbl5.setBackground(Color.white);
        d1 = new JCheckBox("ICE-CREAM........215$");
        d1.setBounds(870, 380, 350, 50);
        d1.setFont(new Font("SERIF", Font.PLAIN, 20));
        d1.setForeground(Color.RED);
        d1.setBackground(Color.darkGray);
        q26 = new JTextField();
        q26.setBounds(1240, 390, 40, 30);
        q26.setBackground(Color.white);
        q26.setBackground(Color.white);
        q26.setBackground(Color.white);
        q26.setVisible(false);
        d2 = new JCheckBox("KULFI FALUDA.........240$");
        d2.setBounds(870, 430, 350, 50);
        d2.setFont(new Font("SERIF", Font.PLAIN, 20));
        d2.setForeground(Color.RED);
        d2.setBackground(Color.darkGray);
        q27 = new JTextField();
        q27.setBounds(1240, 440, 40, 30);
        q27.setBackground(Color.white);
        q27.setBackground(Color.white);
        q27.setBackground(Color.white);
        q27.setVisible(false);
        d3 = new JCheckBox("VISHAN HOT BROWNIE........500$");
        d3.setBounds(870, 480, 350, 50);
        d3.setFont(new Font("SERIF", Font.PLAIN, 20));
        d3.setForeground(Color.RED);
        d3.setBackground(Color.darkGray);

        q28 = new JTextField();
        q28.setBounds(1240, 490, 40, 30);
        q28.setBackground(Color.white);
        q28.setBackground(Color.white);
        q28.setBackground(Color.white);
        q28.setVisible(false);

        lbl.setVisible(true);
        cb1.setVisible(true);
        cb2.setVisible(true);
        cb3.setVisible(true);
        cb4.setVisible(true);
        cb5.setVisible(true);
        cb6.setVisible(true);
        cb7.setVisible(true);
        cb8.setVisible(true);
        cb9.setVisible(true);
        cb10.setVisible(true);
        lbl2.setVisible(true);
        c1.setVisible(true);
        c2.setVisible(true);
        c3.setVisible(true);
        c4.setVisible(true);
        c5.setVisible(true);
        c6.setVisible(true);
        c7.setVisible(true);
        c8.setVisible(true);
        c9.setVisible(true);
        c10.setVisible(true);
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        s5.setVisible(true);
        d1.setVisible(true);
        d2.setVisible(true);
        d3.setVisible(true);
        lbl3.setVisible(true);
        lbl5.setVisible(true);

        pnl = new JPanel();
        pnl.setLayout(null);
        pnl.setBackground(Color.darkGray);
        pnl.add(lbl);
        pnl.add(cb1);
        pnl.add(q1);
        pnl.add(q2);
        pnl.add(q3);
        pnl.add(q4);
        pnl.add(q5);
        pnl.add(q6);
        pnl.add(q7);
        pnl.add(q8);
        pnl.add(q9);
        pnl.add(q10);
        pnl.add(cb2);
        pnl.add(cb3);
        pnl.add(cb4);
        pnl.add(cb5);
        pnl.add(cb6);
        pnl.add(cb7);
        pnl.add(cb8);
        pnl.add(cb9);
        pnl.add(cb10);
        pnl.add(lbl2);
        pnl.add(c1);
        pnl.add(c2);
        pnl.add(c3);
        pnl.add(c4);
        pnl.add(c5);
        pnl.add(c6);
        pnl.add(c7);
        pnl.add(c8);
        pnl.add(c9);
        pnl.add(c10);
        pnl.add(s1);
        pnl.add(s2);
        pnl.add(s3);
        pnl.add(s4);
        pnl.add(s5);
        pnl.add(lbl3);
        pnl.add(lbl5);
        pnl.add(d1);
        pnl.add(d2);
        pnl.add(d3);
        pnl.add(q11);
        pnl.add(q12);
        pnl.add(q13);
        pnl.add(q14);
        pnl.add(q15);
        pnl.add(q16);
        pnl.add(q17);
        pnl.add(q18);
        pnl.add(q19);
        pnl.add(q20);
        pnl.add(q21);
        pnl.add(q22);
        pnl.add(q23);
        pnl.add(q24);
        pnl.add(q25);
        pnl.add(q26);
        pnl.add(q27);
        pnl.add(q28);

        orderbtn = new JButton("PLACE YOUR ORDER");
        orderbtn.setBackground(Color.yellow);
        orderbtn.setForeground(Color.blue);
        orderbtn.setBounds(600, 800, 250, 70);
        orderbtn.setFont(new Font("Arial", Font.BOLD, 18));
        orderbtn.addActionListener(new orderbtn());

        pnl.add(orderbtn);
        pnl.setVisible(false);

        n = new JTextField(30);
        n.setBackground(Color.white);
        n.setForeground(Color.red);
        n.setFont(new Font("Arial", Font.BOLD, 18));
        n.setVisible(false);
        n.setBounds(700, 650, 300, 50);

        n.setVisible(false);

        nm = new JLabel(" Enter Your Name:");
        nm.setForeground(Color.red);
        nm.setVisible(false);
        nm.setBounds(400, 650, 300, 50);
        nm.setFont(new Font("Arial", Font.BOLD, 18));
        nm.setVisible(false);

        delete = new JButton("       DELETE        ");
        delete.setForeground(Color.darkGray);
        delete.setVisible(false);
        delete.setBounds(100, 300, 400, 400);
        delete.setVisible(false);
        delete.setBackground(Color.yellow);
        delete.setFont(new Font("Arial", Font.BOLD, 25));

        add = new JButton("       UPDATE       ");
        add.setForeground(Color.darkGray);
        add.setFont(new Font("Arial", Font.BOLD, 25));
        add.setVisible(false);
        add.setBounds(950, 300, 400, 400);
        add.setVisible(false);
        add.setBackground(Color.yellow);
       add.addActionListener(new add());
        
        area = new JTextArea("Vishan Restaurant Management System " + "\n" +"\n"+" We would like to get your feedback about " +"\n" +"your experience at Vishan. " + "\n" + 
     
                " We invite your comment and suggestion in order to maintain" +"\n"+  "and improve the quality of our food and Cleanliness. " 
                +"\n" + " Please take out a moment and fill  out" +"\n"+ "the comment section " +"\n" +
                "Thankyou in advance for your support!!");
        
        area.setBounds(400, 100, 500, 500);
        area.setForeground(Color.white);
        area.setBackground(Color.darkGray);
        area.setVisible(false);
        area.setFont(new Font("Dialog", Font.BOLD, 25));
        
        
        feedback = new JTextField(50);
        feedback .setBounds(400, 600, 500, 150);
        feedback .setForeground(Color.darkGray);
        feedback .setBackground(Color.white);
        feedback .setVisible(true);
        feedback .setFont(new Font("SERIF", Font.BOLD, 20));
        
        save = new JButton("SAVE");
        save.setBounds(600, 770, 150, 80);
        save.setForeground(Color.darkGray);
       save.setBackground(Color.yellow);
        save.setVisible(true);
        save.setFont(new Font("SERIF", Font.BOLD, 16));
        save.addActionListener(new thanks());
        
         model = new DefaultTableModel(data, column);
       etable=new JTable(model);    
       etable.setBounds(200,80,700,500);   
       etable.setFont(new Font("Arial", Font.BOLD, 17));
       etable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
       scroll =new JScrollPane(etable); 
       etable.setVisible(false);
       scroll.setVisible(false);
        
        
        remove = new JButton("remove");
        remove.setForeground(Color.DARK_GRAY);
        remove.setVisible(false);
        remove.setBounds(450, 600, 100, 70);
        remove.setBackground(Color.yellow);
        remove.setFont(new Font("Arial", Font.BOLD, 17));
        remove.addActionListener(new removerow());
       
                 
        update = new JButton("Add");
        update.setForeground(Color.DARK_GRAY);
        update.setVisible(false);
        update.setBounds(650, 600, 100, 70);
        update.setBackground(Color.yellow);
        update.setFont(new Font("Arial", Font.BOLD, 17));
       update.addActionListener(new addrow());
     

       
            
        pnl.add(etable);
        pnl.add(remove);
        pnl.add(update);
        pnl.add(scroll);
        pnl.add(save);
        pnl.add(area);
        pnl.add(feedback);
        pnl.add(n);
        pnl.add(add);
        pnl.add(delete);
        pnl.add(nm);

        add(pnl, BorderLayout.CENTER);
        add(npanel, BorderLayout.NORTH);
        add(btnpanel, BorderLayout.WEST);

    }

    public static void main(String args[]) {
        Panelss obj = new Panelss();
        obj.setVisible(true);
        obj.setTitle("Restaurant Management web application ");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    private  class addrow implements ActionListener {

        public addrow() {
              if(etable.getSelectedRow() == +1) {
                 // model.addRow();
                  JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
              } else {
              }
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
           
        }
    }

    private class removerow implements ActionListener {

        public removerow() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(etable.getSelectedRow() != -1) {
               model.removeRow(etable.getSelectedRow());
               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
            }
        }
        
    }

    private class action implements ItemListener {

        public action() {
        }

        @Override
        public void itemStateChanged(ItemEvent ie) {
            
             if (ie.getStateChange()==1){
              
                employees.setVisible(false);}             
           
        }
    }

    private  class manage implements ActionListener {

        public manage() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            
       
           
             pnl.setVisible(true);
             etable.setVisible(true);
             remove.setVisible(true);
             save.setVisible(false);
             update.setVisible(true);
             feedback.setVisible(false);
            scroll.setVisible(true);
            lbl.setVisible(false);
            cb1.setVisible(false);
            cb2.setVisible(false);
            cb3.setVisible(false);
            cb4.setVisible(false);
            cb5.setVisible(false);
            cb6.setVisible(false);
            cb7.setVisible(false);
            cb8.setVisible(false);
            cb9.setVisible(false);
            cb10.setVisible(false);
            lbl2.setVisible(false);
            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
            c9.setVisible(false);
            c10.setVisible(false); 
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(false);
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            lbl3.setVisible(false);
            lbl5.setVisible(false);
            add.setVisible(false);
            delete.setVisible(false); 
            area.setVisible(false);
        }
    }

    private  class thanks implements ActionListener {

        public thanks() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();
            if (cmd == "SAVE")
            {
            String y = feedback.getText();
             JOptionPane.showMessageDialog(feedback,
                     "THANKYOU SO MUCH FOR THE FEEDBACK"  , " Message ",
                    JOptionPane.INFORMATION_MESSAGE);
             
             
     
            String path = "E:\\java\\panelss\\src\\panelss\\feedback.txt";
         
          File file = new File(path);
         
            try{
            file.createNewFile();
            
            FileWriter writer = new FileWriter(path);
            writer.write(y +"");
            writer.close();
            }
            
            catch(IOException e)
            {
                System.out.println("File Error");
            }   
            
            }
        }
    }

    private  class feedback implements ActionListener {

        public feedback() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
           label.setVisible(false);
            save.setVisible(true);
            etable.setVisible(false);
            feedback.setVisible(true);
            remove.setVisible(false);
            upanel.setVisible(false);
            area.setVisible(true);
            pnl.setVisible(true);
            orderbtn.setVisible(false);
            spanel.setVisible(false);
            add.setVisible(false);
            delete.setVisible(false);
            n.setVisible(false);
            nm.setVisible(false);
            lbl.setVisible(false);
            cb1.setVisible(false);
            cb2.setVisible(false);
            cb3.setVisible(false);
            cb4.setVisible(false);
            cb5.setVisible(false);
            cb6.setVisible(false);
            cb7.setVisible(false);
            cb8.setVisible(false);
            cb9.setVisible(false);
            cb10.setVisible(false);
            lbl2.setVisible(false);
            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
            c9.setVisible(false);
            c10.setVisible(false); 
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(false);
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            lbl3.setVisible(false);
            lbl5.setVisible(false);
            q1.setVisible(false);
            q2.setVisible(false);
            q3.setVisible(false);
            q4.setVisible(false);
            q5.setVisible(false);
            q6.setVisible(false);
            q7.setVisible(false);
            q8.setVisible(false);
            q9.setVisible(false);
            q10.setVisible(false);
            q11.setVisible(false);
            q12.setVisible(false);
            q13.setVisible(false);
            q14.setVisible(false);
            q15.setVisible(false);
            q16.setVisible(false);
            q17.setVisible(false);
            q18.setVisible(false);
            q19.setVisible(false);
            q20.setVisible(false);
            q21.setVisible(false);
            q22.setVisible(false);
            q23.setVisible(false);
            q24.setVisible(false);
            q25.setVisible(false);
            q26.setVisible(false);
            q27.setVisible(false);
            q28.setVisible(false);
            upanel.setVisible(false);

            
        }
    }

    private class add implements ActionListener {

        public add() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(order, msg + "\n" + "Name: " + X + "\n"
                    + "Your total bill is:" + amount, " Reciept ",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class logout implements ActionListener {

        public logout() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            String mn = ae.getActionCommand();
            if (mn == "Logout") {
             
              int res =  JOptionPane.showConfirmDialog(logout, " Are you sure to logout?");
              if (res == 0)
                  
              { menu.setEnabled(false);
                order.setEnabled(false);
                upanel.setVisible(false);
                label.setVisible(false);
                showsales.setEnabled(false);
                showpayments.setEnabled(false);
                employees.setEnabled(false);
                login.setEnabled(true);
                logout.setEnabled(false);
                pnl.setVisible(false);
                txt.setText("login your account");
               npanel.setVisible(true);}
               else if (res == 1)
                       {
                       
                       
                menu.setEnabled(true);
                order.setEnabled(true);
                showsales.setEnabled(true);
                employees.setEnabled(true);
                showpayments.setEnabled(true);
                label.setVisible(true);
                login.setEnabled(false);
                logout.setEnabled(true);
                pnl.setVisible(false);
               npanel.setVisible(true);
                       }
            }
        }
    }

    private class update implements ActionListener {

        public update() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            save.setVisible(false);
            feedback .setVisible(false);
            area.setVisible(false);
            remove.setVisible(false);
            pnl.setVisible(true);
            etable.setVisible(false);
            upanel.setVisible(false);
            label.setVisible(false);
            orderbtn.setVisible(false);
            add.setVisible(true);
            spanel.setVisible(false);
            update.setVisible(false);
            delete.setVisible(true);
            n.setVisible(false);
            nm.setVisible(false);
            lbl.setVisible(false);
            cb1.setVisible(false);
            cb2.setVisible(false);
            cb3.setVisible(false);
            cb4.setVisible(false);
            cb5.setVisible(false);
            cb6.setVisible(false);
            cb7.setVisible(false);
            cb8.setVisible(false);
            cb9.setVisible(false);
            cb10.setVisible(false);
            lbl2.setVisible(false);
            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
            c9.setVisible(false);
            c10.setVisible(false);
            s1.setVisible(false);
            s2.setVisible(false);
            s3.setVisible(false);
            s4.setVisible(false);
            s5.setVisible(false);
            d1.setVisible(false);
            d2.setVisible(false);
            d3.setVisible(false);
            lbl3.setVisible(false);
            lbl5.setVisible(false);
            q1.setVisible(false);
            q2.setVisible(false);
            q3.setVisible(false);
            q4.setVisible(false);
            q5.setVisible(false);
            q6.setVisible(false);
            q7.setVisible(false);
            q8.setVisible(false);
            q9.setVisible(false);
            q10.setVisible(false);
            q11.setVisible(false);
            q12.setVisible(false);
            q13.setVisible(false);
            q14.setVisible(false);
            q15.setVisible(false);
            q16.setVisible(false);
            q17.setVisible(false);
            q18.setVisible(false);
            q19.setVisible(false);
            q20.setVisible(false);
            q21.setVisible(false);
            q22.setVisible(false);
            q23.setVisible(false);
            q24.setVisible(false);
            q25.setVisible(false);
            q26.setVisible(false);
            q27.setVisible(false);
            q28.setVisible(false);

        }
    }

    private class login implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();
            if (cmd == "Login") {
                
                upanel.setVisible(true);
                label.setVisible(false);
                labelpic.setVisible(true); 
                user.setVisible(true);
                username.setVisible(true);
                pass.setVisible(true);
                password.setVisible(true);
                cb.setVisible(true);
                loginbtn.setVisible(true);
                txt.setText("login your account first");

            }
        }
    }

    private class loginbtn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();
            String usertext = username.getText();
            String passtext = password.getText();

            if (cmd == "LOGIN") {
                if (usertext.equalsIgnoreCase("vishan") && passtext.equalsIgnoreCase("1000")) {
                    JOptionPane.showMessageDialog(loginbtn, "login successfully! ");
                   
                    upanel.setVisible(false);
                    label.setVisible(true);
                    menu.setEnabled(true);
                    order.setEnabled(true);
                    showsales.setEnabled(true);
                     employees.setEnabled(true);
                    showpayments.setEnabled(true);
                    logout.setEnabled(true);
                    login.setEnabled(false);
                    txt.setText("WELCOME!!!");
                    user.setVisible(false);
                    username.setVisible(false);
                    pass.setVisible(false);
                    password.setVisible(false);
                    cb.setVisible(false);
                    loginbtn.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(loginbtn, "INVALID USERNAME OR PASSWORD");
                }
            }
        }
    }

    private class menu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();
            if (cmd == "SHOW MENU ITEMS") {
                save.setVisible(false);
                feedback.setVisible(false);
                upanel.setVisible(false);
                label.setVisible(false);
                n.setVisible(false);
                nm.setVisible(false);
                remove.setVisible(false);
                etable.setVisible(false);
                spanel.setVisible(false);
                pnl.setVisible(true);
                orderbtn.setVisible(false);
                q1.setVisible(false);
                q2.setVisible(false);
                q3.setVisible(false);
                q4.setVisible(false);
                q5.setVisible(false);
                q6.setVisible(false);
                q7.setVisible(false);
                q8.setVisible(false);
                q9.setVisible(false);
                q10.setVisible(false);
                q11.setVisible(false);
                q12.setVisible(false);
                q13.setVisible(false);
                q14.setVisible(false);
                q15.setVisible(false);
                update.setVisible(false);
                q16.setVisible(false);
                q17.setVisible(false);
                q18.setVisible(false);
                q19.setVisible(false);
                q20.setVisible(false);
                q21.setVisible(false);
                q22.setVisible(false);
                q23.setVisible(false);
                q24.setVisible(false);
                q25.setVisible(false);
                q26.setVisible(false);
                q27.setVisible(false);
                q28.setVisible(false);

            }
        }
    }

    private class order implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String cmd = a.getActionCommand();
            if (cmd == "ORDER MANAGEMENT") {
                save.setVisible(false);
                upanel.setVisible(false);
                spanel.setVisible(false);
                add.setVisible(false);
                delete.setVisible(false);
                label.setVisible(false);
                pnl.setVisible(true);
                orderbtn.setVisible(true);
                n.setVisible(true);
                update.setVisible(false);
                nm.setVisible(true);
                q1.setVisible(true);
                q2.setVisible(true);
                q3.setVisible(true);
                q4.setVisible(true);
                q5.setVisible(true);
                q6.setVisible(true);
                q7.setVisible(true);
                q8.setVisible(true);
                q9.setVisible(true);
                q10.setVisible(true);
                q11.setVisible(true);
                q12.setVisible(true);
                q13.setVisible(true);
                q14.setVisible(true);
                q15.setVisible(true);
                q16.setVisible(true);
                q17.setVisible(true);
                q18.setVisible(true);
                q19.setVisible(true);
                q20.setVisible(true);
                q21.setVisible(true);
                q22.setVisible(true);
                q23.setVisible(true);
                q24.setVisible(true);
                q25.setVisible(true);
                q26.setVisible(true);
                q27.setVisible(true);
                q28.setVisible(true);

            }
        }
    }

    private class orderbtn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

           
                    X = n.getText();

            if (cb1.isSelected()) {
                Double a = Double.parseDouble(q1.getText());

                amount += 50 * a;
                msg += "FRIES:50$\n" + "@" + a;
            }
            if (cb2.isSelected()) {
                Double b = Double.parseDouble(q2.getText());
                amount += 78 * b;
                msg += "Fish finger:78$ \n" + "@" + b;
            }
            if (cb3.isSelected()) {
                Double c = Double.parseDouble(q3.getText());
                amount += 80 * c;
                msg += "CHEESE NAAN:80$\n" + "@" + c;
            }
            if (cb4.isSelected()) {
                Double d = Double.parseDouble(q4.getText());
                amount += 59 * d;
                msg += "MEATBALL:59$\n" + "@" + d;
            }
            if (cb5.isSelected()) {
                Double e = Double.parseDouble(q5.getText());
                amount += 98 * e;
                msg += "RASHMI KABAB:98$\n" + "@" + e;
            }
            if (cb6.isSelected()) {
                Double f = Double.parseDouble(q6.getText());
                amount += 346 * f;
                msg += "MALAI BOOTI:346$\n" + "@" + f;
            }
            if (cb7.isSelected()) {
                Double g = Double.parseDouble(q7.getText());
                amount += 50 * g;
                msg += "SPRING ROLLS:50$\n" + "@" + g;
            }

            if (cb8.isSelected()) {
                Double h = Double.parseDouble(q8.getText());
                amount += 50 * h;
                msg += "CAESAR SALAD:50$\n" + "@" + h;
            }
            if (cb9.isSelected()) {
                Double A = Double.parseDouble(q9.getText());
                amount += 50 * A;
                msg += "WINGS:50$\n" + "@" + A;
            }
            if (cb10.isSelected()) {
                Double B = Double.parseDouble(q10.getText());
                amount += 50 * B;
                msg += "HOTSHOTS:50$\n" + "@" + B;
            }
            if (c1.isSelected()) {
                Double i = Double.parseDouble(q11.getText());
                amount += 200 * i;
                msg += "MUTTON MASKA HANDI:200$\n" + "@" + i;
            }
            if (c2.isSelected()) {
                Double h = Double.parseDouble(q12.getText());
                amount += 170 * h;
                msg += "CHICKEN SHAHI HANDI:170$\n" + "@" + h;
            }
            if (c3.isSelected()) {
                Double k = Double.parseDouble(q13.getText());
                amount += 478 * k;
                msg += "PANEER RASHMI HANDI:478$\n" + "@" + k;
            }
            if (c4.isSelected()) {
                Double j = Double.parseDouble(q14.getText());
                amount += 300 * j;
                msg += "MUTTON SIJJI:300$\n" + "@" + j;
            }
            if (c6.isSelected()) {
                Double l = Double.parseDouble(q15.getText());
                amount += 555 * l;
                msg += "CHICKEN DHAKA:555$\n" + "@" + l;
            }
            if (c5.isSelected()) {
                Double r = Double.parseDouble(q16.getText());
                amount += 850 * r;
                msg += "CHICKEN CHOWMIEN:850$\n" + "@" + r;
            }
            if (c7.isSelected()) {
                Double p = Double.parseDouble(q17.getText());
                amount += 270 * p;
                msg += "WHITE DAHI KARAHI:270$\n" + "@" + p;
            }
            if (c8.isSelected()) {
                Double n = Double.parseDouble(q18.getText());
                amount += 500 * n;
                msg += "MIX VEGETABLE:500$\n" + "@" + n;
            }
            if (c9.isSelected()) {
                Double m = Double.parseDouble(q19.getText());
                amount += 780 * m;
                msg += "PALAK PANEER:780$\n" + "@" + m;
            }
            if (c10.isSelected()) {
                Double o = Double.parseDouble(q20.getText());
                amount += 400 * o;
                msg += "SHAHI DAAL:400$\n" + "@" + o;
            }
            if (s1.isSelected()) {
                Double s = Double.parseDouble(q21.getText());
                amount += 300 * s;
                msg += "CHICKEN CORN SOUP:300$\n" + "@" + s;
            }
            if (s2.isSelected()) {
                Double t = Double.parseDouble(q22.getText());
                amount += 750 * t;
                msg += "HOT & SOUR SOUP:750$\n" + "@" + t;
            }
            if (s5.isSelected()) {
                Double v = Double.parseDouble(q23.getText());
                amount += 59 * v;
                msg += "RAITA:59$\n" + "@" + v;
            }
            if (s3.isSelected()) {
                Double u = Double.parseDouble(q24.getText());
                amount += 70 * u;
                msg += "FRESH GREEN SALAD:70$\n" + "@" + u;
            }
            if (s4.isSelected()) {
                Double w = Double.parseDouble(q25.getText());
                amount += 90 * w;
                msg += "RUSSIAN SALAD:90$\n" + "@" + w;
            }
            if (d1.isSelected()) {
                Double x = Double.parseDouble(q26.getText());
                amount += 215 * x;
                msg += "ICE-CREAM:215$\n" + "@" + x;
            }
            if (d2.isSelected()) {
                Double y = Double.parseDouble(q27.getText());
                amount += 240 * y;
                msg += "KULFI FALUDA:240$\n" + "@" + y;
            }
            if (d3.isSelected()) {
                Double z = Double.parseDouble(q28.getText());
                amount += 500 * z;
                msg += "VISHAN HOT BROWNIE:500$\n" + "@" + z;
            }

            msg += " ........\n";

            JOptionPane.showMessageDialog(order, msg + "\n" + "Name: " + X + "\n"
                    + "Your total bill is:" + amount, " Reciept ",
                    JOptionPane.INFORMATION_MESSAGE);

        }

    }

}

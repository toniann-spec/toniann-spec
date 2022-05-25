import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.border.BevelBorder;

public class MenuGuide extends JFrame{
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JPanel UserP;
		private JScrollPane sp;
		JScrollPane scrollPane;
		private JTable table;
		private JTable table_2;
		private JTextPane txtpn;
		private JTextField txtJc;
		private JTextField txtDT;
		private JTextField Username;
		private JPasswordField PasswordField;
		private JPasswordField SystemKF;
		private JButton Menu;
		private JButton ok;
		private JButton Left;
		private JButton Down;
		private JButton Up;
		private JButton Right;
		public MenuGuide() {
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 657, 501);
			contentPane = new JPanel();
			contentPane.setBackground(Color.GRAY);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			contentPane.setVisible(true);
			
			
			UserP = new JPanel();
			UserP.setBackground(SystemColor.textHighlight);
		 	UserP.setBounds(10, 11, 600, 291);
		 	UserP.setVisible(false);
		 	contentPane.add(UserP);
		 	UserP.setLayout(null);
		 	
		 	 SimpleAttributeSet bSet = new SimpleAttributeSet();
		     StyleConstants.setAlignment(bSet, StyleConstants.ALIGN_CENTER);
		     StyleConstants.setUnderline(bSet, true);
		     StyleConstants.setFontFamily(bSet, "Arial Rounded MT Bold");
		     StyleConstants.setFontSize(bSet, 24);
		 	
		 	txtpn = new JTextPane();
			txtpn.setText("\n\nWelcome to Jamaican Cable TV");
			txtpn.setEditable(false);
			StyledDocument doc = txtpn.getStyledDocument();
			doc.setParagraphAttributes(0, 104, bSet, false);
			txtpn.setBounds(43, 26, 518, 261);
			contentPane.add(txtpn);
		 				
			sp = new JScrollPane();
			JScrollBar spb = sp.getVerticalScrollBar();
			sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
			sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			sp.setBounds(10,73, 90, 229);
			getContentPane().add(sp);
			sp.setVisible(false);
		
			
			scrollPane = new JScrollPane();
			JScrollBar spb2 = scrollPane.getVerticalScrollBar();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			spb2.setModel(spb.getModel());
			scrollPane.setBounds(98, 73, 502, 229);
			getContentPane().add(scrollPane);
			scrollPane.setVisible(false);
						
			
			Menu = new JButton("Menu");
			Menu.setBounds(255, 338, 114, 33);
			Menu.setVisible(true);
			contentPane.add(Menu);
			
		 	ok = new JButton("Ok");
			ok.setBounds(275, 354, 64, 33);
			contentPane.add(ok);
			ok.setVisible(false);
		 	
		 	Left = new JButton("Left");
			Left.setBounds(194, 354, 73, 33);
			contentPane.add(Left);
			Left.setVisible(false);
			
			Right = new JButton("Right");
			Right.setBounds(351, 354, 73, 33);
			contentPane.add(Right);
			Right.setVisible(false);
			
			Up = new JButton("UP");
			Up.setBounds(250, 313, 114, 33);
			contentPane.add(Up);
			Up.setVisible(false);
			
			Down = new JButton("Down");
			Down.setBounds(250, 393, 114, 33);
			contentPane.add(Down);
			Down.setVisible(false);
			
			Font font1 = new Font("SansSerif", Font.BOLD, 15);
			txtJc = new JTextField();
			txtJc.setText("JCTCL Cable TV Programme Listing");
			txtJc.setBounds(10, 40, 339, 33);
			txtJc.setColumns(10);
			txtJc.setFont(font1);
			txtJc.setBorder(null);
			contentPane.add(txtJc);
			txtJc.setEditable(false);
		
			txtJc.setVisible(false);
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("E dd MMMM yyyy HH:mm:ss");
			Font font2 = new Font("SansSerif", Font.BOLD, 15);
			txtDT = new JTextField();
			txtDT.setText(""+formatter.format(calendar.getTime()));
			txtDT.setBounds(349, 40, 251, 33);txtDT.setColumns(10);
			txtDT.setFont(font2);
			txtDT.setBorder(null);
			contentPane.add(txtDT);
			txtDT.setEditable(false);
			txtDT.setVisible(false);
		
			//Channel Table
			table = new JTable();
			
			table.setBorder(new BevelBorder(BevelBorder.RAISED, null, SystemColor.activeCaption, null, null));
			table.setBackground(SystemColor.inactiveCaption);
			table.setSize(90, 227);
			table.setFocusable(false);
			table.setRowSelectionAllowed(false);
		    table.setModel(new DefaultTableModel(
		    	new Object[][] { {"200-CNN"},{"201-BBC"},{"202-TBN"},{"203-TVJ"},{"204-CVM"},{"205-USA"},{"206-DSN"},{"207-FAM"},
		    					{"208-KID"},{"209-WCH"},{"210-COM"}	},
		    	new String[] {
		    		"Channel"
		    	}
		    ));
			sp.setViewportView(table);
			
			//program table
			Calendar T = Calendar.getInstance();
			
			
			int boardHeight = 11;
			int boardWidth = 24;
			int a=0;
			DefaultTableModel model = new DefaultTableModel(boardHeight, boardWidth);
	
			table_2 = new JTable(model);
			  
			table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			
			for(int i=0;i<boardWidth;i++) {
				T.add(Calendar.HOUR,a);
				String c= T.get(Calendar.AM_PM)==1 ? "pm":"am";
				int q= T.get(Calendar.HOUR)==0?12:T.get(Calendar.HOUR);
				String p =""+q+":"+0+0+c;
				table_2.getColumnModel().getColumn(i).setHeaderValue(p);
				a=1;
			}
			
			
		      
			scrollPane.setViewportView(table_2);
		
			table_2.setFocusable(false);
			table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 	table_2.setCellSelectionEnabled(true);
		 	table_2.setSelectionBackground(Color.BLUE);
		 	table_2.setSelectionForeground(Color.yellow.brighter());
		 	
		 	Username = new JTextField();
		 	Username.setBounds(229, 20, 167, 36);
		 	UserP.add(Username);
		 	Username.setColumns(10);
		 	
		 	PasswordField = new JPasswordField();
		 	PasswordField.setBounds(229, 83, 167, 36);
		 	UserP.add(PasswordField);
		 	
		 	JLabel lblNewLabel = new JLabel("Username");
		 	lblNewLabel.setBounds(132, 28, 63, 20);
		 	UserP.add(lblNewLabel);
		 	
		 	JLabel lblNewLabel_1 = new JLabel("Password");
		 	lblNewLabel_1.setBounds(132, 94, 46, 14);
		 	UserP.add(lblNewLabel_1);
		 	
		 	JButton LogIn = new JButton("log In");
		 	LogIn.setBounds(204, 156, 207, 48);
		 	UserP.add(LogIn);
		 	
		 	JButton CreateUser = new JButton("Create New User");
		 	
		 	CreateUser.setBounds(204, 208, 207, 48);
		 	UserP.add(CreateUser);
		 	
		 	JPanel addPro = new JPanel();
		 	addPro.setBounds(443, 292, 180, 155);
		 	UserP.add(addPro);
		 	addPro.setBackground(Color.LIGHT_GRAY);
		 	addPro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		 	addPro.setLayout(null);
			
		 	JButton Search1 = new JButton("Search");
		 	Search1.setBounds(486, 313, 103, 23);
		 	Search1.setVisible(false);
			contentPane.add(Search1);
		 	
		 	JLabel Systemk = new JLabel("Enter system Key");
		 	Systemk.setBounds(24, 338, 120, 20);
		 	Systemk.setVisible(false);
		 	contentPane.add(Systemk);
		 	SystemKF = new JPasswordField();
		 	SystemKF.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent arg0) {
		 			
		 			char [] p3=SystemKF.getPassword();
		 			String p4= new String(p3);
		 			if(p4.equals("10")) {
		 				
		 				UserP.setVisible(true);
		 				SystemKF.setVisible(false);
		 				SystemKF.setText(null);
		 				Search1.setVisible(false);
		 				Systemk.setVisible(false);
		 				Menu.setVisible(false);
						ok.setVisible(false);
						Left.setVisible(false);
						Right.setVisible(false);
						Up.setVisible(false);
						Down.setVisible(false);
						scrollPane.setVisible(false);
						txtJc.setVisible(false);
						txtDT.setVisible(false);
						sp.setVisible(false);
		 				
		 			}
		 		}
		 	});
		 	SystemKF.setBounds(32, 308, 70, 23);
		 	SystemKF.setVisible(false);
		 	contentPane.add(SystemKF);
		 	
		 	
		 
		 
			
			
			
			
			Search1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//Object ValueAt1 = table_2.getValueAt(table_2.getSelectedRow(),table_2.getSelectedColumn());

					int ans = JOptionPane.showConfirmDialog(null, "Would you like to Search for a programme ?\n","Search Menu", JOptionPane.YES_NO_OPTION); 
					
						if (ans == JOptionPane.YES_OPTION) 
						{
							try 
							{
							  
							Search s = new Search();
							s.setVisible(true);
							
					        }
							
						catch (Exception e) 
							{
							System.err.println("An Error Occured");
							e.printStackTrace();
							}
					   }

				    }
				});
			table_2.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e){
					Object ValueAt = table_2.getValueAt(table_2.getSelectedRow(),table_2.getSelectedColumn());	
					if(0==table_2.getSelectedColumn()) {
						txtpn.setVisible(true);
									            
						
						if(ValueAt!=null) {
						txtpn.setText("\n\n\nCurrently Watching\n\n"+ValueAt.toString());
						}else {txtpn.setText("\n\n\n No Programme is Listed at this time \n\n");}
						
						Menu.setVisible(true);
						SystemKF.setVisible(false);
						Systemk.setVisible(false);
						Search1.setVisible(false);
						ok.setVisible(false);
						Left.setVisible(false);
						Right.setVisible(false);
						Up.setVisible(false);
						Down.setVisible(false);
						scrollPane.setVisible(false);
						txtJc.setVisible(false);
						txtDT.setVisible(false);
						sp.setVisible(false);
						
					} else {
						
						 if(ValueAt!=null) {
					Menu m = new Menu();
					m.setVisible(true);
						 }else {JOptionPane.showMessageDialog(null, "No Program Listed for this time");}
					
			}}});
		 	LogIn.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			try {
		 				
		 				int i=0;
		 				Scanner User1 = new Scanner(new File("Users.txt"));
		 				User1.useDelimiter(", ");
		 				while (User1.hasNext()) {
							String n =  User1.next();
							if(n.equals("\n")==false)
							{
							String p = 	User1.next();
							
							if (n.equalsIgnoreCase(Username.getText())) {
								char[] p1= PasswordField.getPassword();
								String p2= new String(p1);
											
								if(p.equalsIgnoreCase(p2)){
								i=1;
											try {
												addProgramN frame = new addProgramN();
												frame.setVisible(true);
											} catch (Exception e3) {
												e3.printStackTrace();
											}
																										
								
								
								break;
								}
							}
		 				}
							}
						User1.close();
						if(i==0) {
							Username.setText(null);
							PasswordField.setText(null);
							JOptionPane.showMessageDialog(null, "Username or Password does not match our records\n Please Try Again");
							
						}else {
						Frame[] name=getFrames();
						name[0].dispose();
						}
		 			}catch (Exception e1) {
						e1.printStackTrace();
					}
		 			
		 		}
		 	});
		 	CreateUser.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			
		 			try {
		 				FileWriter User1 = new FileWriter("Users.txt", true);
		 				char[]p=PasswordField.getPassword();
		 				String p1= new String(p);
		 				
						User1.write(", "+Username.getText()+", "+p1+", \n");
						User1.close();
						Username.setText(null);
						PasswordField.setText(null);
						UserP.setVisible(false);
						Search1.setVisible(true);
						SystemKF.setVisible(true);
						Systemk.setVisible(true);
						ok.setVisible(true);
						Left.setVisible(true);
						Right.setVisible(true);
						Up.setVisible(true);
						Down.setVisible(true);
						scrollPane.setVisible(true);
						txtJc.setVisible(true);
						txtDT.setVisible(true);
						sp.setVisible(true);
			 			txtpn.setVisible(false);
						Menu.setVisible(false);
		 			
		 			}catch (Exception e1) {
						e1.printStackTrace();
					}
		 			
		 		}
		 	});
		 	Menu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ReadFromFile(table,table_2,model,boardHeight, boardWidth);
					txtpn.setVisible(false);
					Menu.setVisible(false);
					SystemKF.setVisible(true);
					Systemk.setVisible(true);
					Search1.setVisible(true);
					ok.setVisible(true);
					Left.setVisible(true);
					Right.setVisible(true);
					Up.setVisible(true);
					Down.setVisible(true);
					sp.setVisible(true);
					txtJc.setVisible(true);
					txtDT.setVisible(true);
					ok.setVisible(true);
					scrollPane.setVisible(true);
					
					
				}
				
				
				
			});
			ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object ValueAt = table_2.getValueAt(table_2.getSelectedRow(),table_2.getSelectedColumn());	
					if(0==table_2.getSelectedColumn()) {
						txtpn.setVisible(true);
									            
						
						if(ValueAt!=null) {
						txtpn.setText("\n\n\nCurrently Watching\n\n"+ValueAt.toString());
						}else {txtpn.setText("\n\n\n No Programme is Listed at this time \n\n");}
						
						
						Menu.setVisible(true);
						SystemKF.setVisible(false);
						Systemk.setVisible(false);
						Search1.setVisible(false);
						ok.setVisible(false);
						Left.setVisible(false);
						Right.setVisible(false);
						Up.setVisible(false);
						Down.setVisible(false);
						scrollPane.setVisible(false);
						txtJc.setVisible(false);
						txtDT.setVisible(false);
						sp.setVisible(false);
						
					} else {
						
						 if(ValueAt!=null) {
					Menu m = new Menu();
					m.setVisible(true);
						 }else {JOptionPane.showMessageDialog(null, "No Program Listed for this time");}
					
			}}});
			Left.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(table_2.getSelectedRow()<0||table_2.getSelectedColumn()<0) {
									table_2.setColumnSelectionInterval(0, 0);
									table_2.setRowSelectionInterval(0,0);
									
								}
								int currentSelectedCol = table_2.getSelectedColumn();
								
	
						        if (currentSelectedCol > 0) {
						            //To move left substract 1 from the current selected row
						        	table_2.setColumnSelectionInterval(currentSelectedCol-1,currentSelectedCol-1);
						        } else {
						            JOptionPane.showMessageDialog(null, "You have reached the end!! Press Move Down Button");
						        }
								
							}});
			Right.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(table_2.getSelectedRow()<0||table_2.getSelectedColumn()<0) {
									table_2.setColumnSelectionInterval(0, 0);
									table_2.setRowSelectionInterval(0,0);
									
								}
								int currentSelectedCol = table_2.getSelectedColumn();
								
	
						        if (currentSelectedCol < table_2.getColumnCount()-1) {
						            //To move Right add 1 from the current selected row
						        	table_2.setColumnSelectionInterval(currentSelectedCol+1,currentSelectedCol+1);
						        	table_2.setAutoscrolls(Right.isSelected());
						        } else {
						            JOptionPane.showMessageDialog(null, "You have reached the end!! Press Move Down Button");
						        }	
									
							}});
			Up.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								
								if(table_2.getSelectedRow()<0||table_2.getSelectedColumn()<0) {
									table_2.setColumnSelectionInterval(0, 0);
									table_2.setRowSelectionInterval(0,0);
									
								}
								int currentSelectedRow = table_2.getSelectedRow();
								
	
								        if (currentSelectedRow > 0) {
								            //To move up substract 1 from the current selected row
								        	table_2.setRowSelectionInterval(currentSelectedRow-1,currentSelectedRow-1);
								        } else {
								            JOptionPane.showMessageDialog(null, "You have reached the end!! Press Move Down Button");
								        }
									
									
									
							}});
			Down.addActionListener(new ActionListener() {
					
					
							public void actionPerformed(ActionEvent e) {
							
								if(table_2.getSelectedRow()<0||table_2.getSelectedColumn()<0) {
									table_2.setColumnSelectionInterval(0, 0);
									table_2.setRowSelectionInterval(0,0);
									
								}
								int currentSelectedRow = table_2.getSelectedRow();
								
	
								        if (currentSelectedRow < table_2.getRowCount()-1) {
								            //To move down add 1 from the current selected row
								        	table_2.setRowSelectionInterval(currentSelectedRow+1,currentSelectedRow+1);
								        } else {
						            JOptionPane.showMessageDialog(null, "You have reached the end!! Press Move Up Button");
						        }
						
						
						
							}});
		 	
				
		 	
		 	
			
		}
		public static void ReadFromFile(JTable z,JTable t, DefaultTableModel m, int row, int col)
		{
			
			try
			{
				
				row = 0;
				col = 0;
				int i=1, a=0;
				String  ch = null, co = null, tit=null, time = null, status = null,  capin = null, des = null, rate = null, dr = null, lma = null;
				Scanner s = new Scanner (new File("Programme.txt") );
				s.useDelimiter(", ");
						while(s.hasNext()){
						
						ch = s.next();
						if(ch.equals("\n")==false)
						{
						co = s.next();
						tit = s.next();
						capin = s.next();
						status = s.next();
						des = s.next();
						time = s.next();
						if(time.equals("\n")==false)
						{
						rate= s.next();
						if(rate.equals("\n")==false)
						  {dr=s.next();
							 if(dr.equals("\n")==false)
							  {lma= s.next();
								} 
							 }}
					
						
					try {
						pop(z,t,m,row,col,ch,tit,time,co);
						//if(s.hasNext()==false){break;}
						row=0;col=0;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						}
						}
						
			s.close();	
			}
							//}
			catch (Exception e)
			{
			e.printStackTrace();
			}
	
}
		public static String ReadFromFile(Object r)
		{
			String Out=null;
			try
			{
				
				
				String  ch = null, co = null, tit=null, time = null, status = null,  capin = null, des = null, rate = null, dr = null, lma = null;
				
				Scanner s = new Scanner (new File("Programme.txt") );
				
				s.useDelimiter(", ");
				while (s.hasNext())
				{
					
					ch = s.next();
					co = s.next();
					tit = s.next();
					capin = s.next();
					status = s.next();
					des = s.next();
					time = s.next();
					if(time.equals("\n")==false)
					{
					
					rate= s.next();
										
						
						
						if(rate.equals("\n")==false)
						  {
							  Out = "The Title is : "+tit+"\n Status Indicator: "+status+"\n Caption Indicator: "+capin+"\n Description:"
				            		  +des+"\n "+rate;
							  dr=s.next();
							  
							  if(dr.equals("\n")==false)
							  {
								 
								  lma= s.next();
								  if (lma.equals("\n")==false) {
									  Out = "The Title is : "+tit+"\n Status Indicator: "+status+"\n Caption Indicator: "+capin+"\n Description:"
						            		  +des+"\n "+"Rateing: "+rate+"\n "+dr+"\nList of Major Actors: "+lma;
								  }else {
									  Out = "The Title is : "+tit+"\n Status Indicator: "+status+"\n Caption Indicator: "+capin+"\n Description:"
						            		  +des+"\n "+rate+"\nList of Major Actors:  "+dr;
								  }
								  
								  
							  } 
							 
						  }else {
							  Out = "The Title is : "+tit+"\n Status Indicator: "+status+"\n Caption Indicator: "+capin+"\n Description:"
				            		  +des+"\n ";
						  }
					if (r.toString().equalsIgnoreCase(tit))
					{
					break;
					}
				}}
				
				s.close();	
				
					
				}
			
			catch (Exception e)
			{
			e.printStackTrace();
			}
		if(Out==null)Out="Information could not be found";
	return Out;	
}
		public static  void pop(JTable z,JTable t, DefaultTableModel m, int row, int col,String ch,String tit,String time,String co) {
			row=0;
			col=0;
		
			
				while(col*row<=264){
			if (z.getValueAt(row, 0).toString().equalsIgnoreCase(ch))
			{
				//System.out.println(" "+co+" "+tit);
				
			//System.out.println(t.getColumnModel().getColumn(col).getHeaderValue().toString()+" "+time+" "+tit);
			if(t.getColumnModel().getColumn(col).getHeaderValue().toString().equalsIgnoreCase(time)==true) {
				
			m.setValueAt(tit, row, col);
			
			}
			
			t.getColumnModel().getColumn(col).setCellRenderer(new StatusColumnCellRenderer());	
		  
		  
		     
			
			
			
			
			}
		
			col++;
			if(col==23)
				{ col=0; row++;
				if(row==11){
				col=23;break;
				}}
			
		
				}	
		
			row=0;
			col=0;
		}
		



public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Menu() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Get More Details ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Object ValueAt1 = table_2.getValueAt(table_2.getSelectedRow(),table_2.getSelectedColumn());
									
					try {
						String Out= ReadFromFile(ValueAt1);
						
				          JOptionPane.showMessageDialog(null,"\nMore Details \n"+Out);
						} 
					catch (Exception e) 
						{
						
						System.err.println("An Error Occured");
						e.printStackTrace();
						}
				   

			    }
			});
		btn1.setBounds(168, 69, 130, 23);
		contentPane.add(btn1);
		
		
		JButton btn2 = new JButton("View Later ");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			Object ValueAt1 = table_2.getValueAt(table_2.getSelectedRow(),table_2.getSelectedColumn());
			if(ValueAt1!=null) {
			 int ans = JOptionPane.showConfirmDialog(null, "Would you like to view \n "+ValueAt1.toString()+"\n Later?", ""+ValueAt1.toString(), JOptionPane.YES_NO_OPTION); 
			
				if (ans == JOptionPane.YES_OPTION) 
				{
				try {
					FileWriter myWriter1 = new FileWriter("View Later.txt", true);
					myWriter1.write(ValueAt1.toString()+"\n ");
					myWriter1.close();
					} 
				catch (IOException e) 
					{
					System.err.println("An Error Occured");
					e.printStackTrace();
					}
			   }
			}else {JOptionPane.showMessageDialog(null, "No Program Listed for this time");}
			}
		});
		btn2.setBounds(168, 125, 130, 23);
		contentPane.add(btn2);
		
		
		JLabel lblNewLabel = new JLabel("What Would You Like To Do?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(94, 11, 264, 14);
		contentPane.add(lblNewLabel);
	}

}
public class Search extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	
	public Search() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SearchLabel = new JLabel("SEARCH");
		SearchLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		SearchLabel.setBounds(72, 109, 63, 14);
		contentPane.add(SearchLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				
			      {
				    
					String s = textField.getText();
					String Out = ReadFromFile(s);
					
			      if (Out==null)Out="Programme not found!";
			      JOptionPane.showMessageDialog(null,Out); 		
			    }    
				catch(Exception e)
			      {
			          System.err.println("Catch ALL exception occurred");
			          e.printStackTrace();
			      }
			   
			      
	  }		

    });
		textField.setBounds(145, 102, 252, 29);
		contentPane.add(textField);
		textField.setColumns(10);
	}

} 

}


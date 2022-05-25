import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class addProgramN extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPanel k;
	private JTextField textField_2;
	private final ButtonGroup ChGroup = new ButtonGroup();
	private final ButtonGroup PtyGroup = new ButtonGroup();
	private final ButtonGroup TGroup = new ButtonGroup();
	private final ButtonGroup hourGroup = new ButtonGroup();
	private final ButtonGroup CapGroup = new ButtonGroup();
	private final ButtonGroup StatusGroup = new ButtonGroup();


	/**
	 * Launch the application.
	*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addProgramN frame = new addProgramN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addProgramN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setBackground(SystemColor.inactiveCaption);
		getContentPane().setLayout(null);
		
		k= new JPanel();
		k.setBounds(0, 0, 775, 618);
		k.setLayout(null);
		k.setVisible(true);
		k.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(k);
		
		JLabel lblNewLabel_1 = new JLabel("Programme Menu");
		lblNewLabel_1.setFont(new Font("Wide Latin", Font.BOLD, 20));
		lblNewLabel_1.setBounds(216, 11, 340, 33);
		k.add(lblNewLabel_1);
		
		JLabel ChannelL = new JLabel("Channel");
		ChannelL.setBounds(52, 55, 107, 33);
		k.add(ChannelL);
		JRadioButton CNN = new JRadioButton("200-CNN");
		ChGroup.add(CNN);
		CNN.setBounds(200, 52, 90, 23);
		k.add(CNN);
		
		JRadioButton BBC = new JRadioButton("201-BBC");
		ChGroup.add(BBC);
		BBC.setBounds(292, 51, 80, 23);
		k.add(BBC);
		
		JRadioButton TBN = new JRadioButton("202-TBN");
		ChGroup.add(TBN);
		TBN.setBounds(374, 51, 86, 23);
		k.add(TBN);
		
		JRadioButton TVJ = new JRadioButton("203-TVJ");
		ChGroup.add(TVJ);
		TVJ.setBounds(462, 51, 110, 23);
		k.add(TVJ);
		
		JRadioButton CVM = new JRadioButton("204-CVM");
		ChGroup.add(CVM);
		CVM.setBounds(572, 51, 97, 23);
		k.add(CVM);
		
		JRadioButton USA = new JRadioButton("205-USA");
		ChGroup.add(USA);
		USA.setBounds(200, 78, 90, 23);
		k.add(USA);
		
		JRadioButton DSN = new JRadioButton("206-DSN");
		ChGroup.add(DSN);
		DSN.setBounds(292, 77, 80, 23);
		k.add(DSN);
		
		JRadioButton FAM = new JRadioButton("207-FAM");
		ChGroup.add(FAM);
		FAM.setBounds(374, 77, 86, 23);
		k.add(FAM);
		
		JRadioButton KIDS = new JRadioButton("208-KID");
		ChGroup.add(KIDS);
		KIDS.setBounds(462, 77, 110, 23);
		k.add(KIDS);
		
		JRadioButton WCH = new JRadioButton("209-WCH");
		ChGroup.add(WCH);
		WCH.setBounds(572, 77, 97, 23);
		k.add(WCH);
		
		JRadioButton COM = new JRadioButton("210-COM");
		ChGroup.add(COM);
		COM.setBounds(200, 104, 90, 23);
		k.add(COM);
		
		JLabel lblNewLabel = new JLabel("Discription");
		lblNewLabel.setBounds(52, 461, 138, 33);
		k.add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(200, 462, 271, 70);
		k.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Time");
		lblNewLabel_1_1.setBounds(52, 178, 107, 33);
		k.add(lblNewLabel_1_1);
		
		JRadioButton am = new JRadioButton("am");
		TGroup.add(am);
		am.setBounds(200, 264, 48, 23);
		k.add(am);
		
		JRadioButton pm = new JRadioButton("pm");
		TGroup.add(pm);
		pm.setBounds(292, 264, 56, 23);
		k.add(pm);
		
		
		
		
		JRadioButton Movies = new JRadioButton("Movies");
		PtyGroup.add(Movies);
		Movies.setBounds(200, 130, 69, 23);
		k.add(Movies);
		
		JRadioButton News = new JRadioButton("News");
		PtyGroup.add(News);
		News.setBounds(292, 129, 69, 23);
		k.add(News);
		
		JRadioButton Weather = new JRadioButton("Weather");
		PtyGroup.add(Weather);
		Weather.setBounds(374, 129, 86, 23);
		k.add(Weather);
		
		JRadioButton Comedy = new JRadioButton("Comedy");
		PtyGroup.add(Comedy);
		Comedy.setBounds(462, 129, 110, 23);
		k.add(Comedy);
		
		JRadioButton General = new JRadioButton("General");
		PtyGroup.add(General);
		General.setBounds(572, 129, 97, 23);
		k.add(General);
		
		JRadioButton Kids = new JRadioButton("Kids");
		PtyGroup.add(Kids);
		Kids.setBounds(200, 156, 69, 23);
		k.add(Kids);
		
		JRadioButton Gospel = new JRadioButton("Gospel");
		PtyGroup.add(Gospel);
		Gospel.setBounds(292, 154, 80, 23);
		k.add(Gospel);
		
		
		
		JLabel ProType = new JLabel("Programme Type");
		ProType.setBounds(52, 127, 107, 33);
		k.add(ProType);
		
		JLabel lblTitle = new JLabel("Programme Title");
		lblTitle.setBounds(52, 395, 138, 33);
		k.add(lblTitle);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(200, 396, 209, 33);
		k.add(textField_2);

		JRadioButton hour_1 = new JRadioButton("1");
		hourGroup.add(hour_1);
		hour_1.setBounds(200, 184, 45, 23);
		k.add(hour_1);
		
		JRadioButton hour_2 = new JRadioButton("2");
		hourGroup.add(hour_2);
		hour_2.setBounds(292, 183, 42, 23);
		k.add(hour_2);
		
		JRadioButton hour_3 = new JRadioButton("3");
		hourGroup.add(hour_3);
		hour_3.setBounds(374, 183, 44, 23);
		k.add(hour_3);
		
		JRadioButton hour_4 = new JRadioButton("4");
		hourGroup.add(hour_4);
		hour_4.setBounds(462, 183, 110, 23);
		k.add(hour_4);
		
		JRadioButton hour_5 = new JRadioButton("5");
		hourGroup.add(hour_5);
		hour_5.setBounds(572, 183, 97, 23);
		k.add(hour_5);
		
		JRadioButton hour_6 = new JRadioButton("6");
		hourGroup.add(hour_6);
		hour_6.setBounds(200, 212, 45, 23);
		k.add(hour_6);
		
		JRadioButton hour_7 = new JRadioButton("7");
		hourGroup.add(hour_7);
		hour_7.setBounds(292, 211, 51, 23);
		k.add(hour_7);
		
		JRadioButton hour_8 = new JRadioButton("8");
		hourGroup.add(hour_8);
		hour_8.setBounds(374, 211, 44, 23);
		k.add(hour_8);
		
		JRadioButton hour_9 = new JRadioButton("9");
		hourGroup.add(hour_9);
		hour_9.setBounds(462, 209, 110, 23);
		k.add(hour_9);
		
		JRadioButton hour_10 = new JRadioButton("10");
		hourGroup.add(hour_10);
		hour_10.setBounds(572, 211, 97, 23);
		k.add(hour_10);
		
		JRadioButton hour_11 = new JRadioButton("11");
		hourGroup.add(hour_11);
		hour_11.setBounds(200, 238, 48, 23);
		k.add(hour_11);
		
		JRadioButton hour_12 = new JRadioButton("12");
		hourGroup.add(hour_12);
		hour_12.setBounds(292, 237, 56, 23);
		k.add(hour_12);
		
		
		JLabel Caption = new JLabel("Caption");
		Caption.setBounds(52, 294, 138, 33);
		k.add(Caption);
		
		JRadioButton C_yes = new JRadioButton("Yes");
		CapGroup.add(C_yes);
		C_yes.setBounds(200, 300, 69, 23);
		k.add(C_yes);
		
		JRadioButton C_No = new JRadioButton("No");
		CapGroup.add(C_No);
		C_No.setBounds(292, 299, 69, 23);
		k.add(C_No);
		
		JLabel Indicator = new JLabel("Status");
		Indicator.setBounds(52, 338, 138, 33);
		k.add(Indicator);
		
		JRadioButton New = new JRadioButton("New");
		StatusGroup.add(New);
		New.setBounds(200, 344, 69, 23);
		k.add(New);
		
		JRadioButton Live = new JRadioButton("Live");
		StatusGroup.add(Live);
		Live.setBounds(292, 343, 69, 23);
		k.add(Live);
		
		JRadioButton Repeat = new JRadioButton("Repeat");
		StatusGroup.add(Repeat);
		Repeat.setBounds(374, 343, 110, 23);
		k.add(Repeat);
		
		JButton Writer = new JButton("Add Programme");
		Writer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Programme cur = null;
				String ch=null,co=null,tit=null,time=null,TT=null,sat=null,des=null,Proty=null;
				boolean cc;
				ch= CNN.isSelected()? CNN.getText():BBC.isSelected()?BBC.getText(): TBN.isSelected()?TBN.getText():
					TVJ.isSelected()?TVJ.getText():CVM.isSelected()?CVM.getText():USA.isSelected()?USA.getText():
						DSN.isSelected()?DSN.getText():FAM.isSelected()?FAM.getText():KIDS.isSelected()?KIDS.getText():
							WCH.isSelected()?WCH.getText():COM.isSelected()?COM.getText():null;
							
				Proty= Movies.isSelected()?Movies.getText():News.isSelected()?News.getText():Weather.isSelected()?Weather.getText():
					Comedy.isSelected()?Comedy.getText():General.isSelected()?General.getText():Kids.isSelected()?Kids.getText():
						Gospel.isSelected()?Gospel.getText():null;
						if(Proty!=null) {
						co=Proty.equals("Movies")?"red":Proty.equals("Weather")?"green":Proty.equals("Comdey")?"yellow":Proty.equals("Kids")?"purple":Proty.equals("Gospel")?"blue":"white";
						}
				time= hour_1.isSelected()?hour_1.getText():hour_2.isSelected()?hour_2.getText():hour_3.isSelected()?hour_3.getText():
					hour_4.isSelected()?hour_4.getText():hour_5.isSelected()?hour_5.getText():hour_6.isSelected()?hour_6.getText():
						hour_7.isSelected()?hour_7.getText():hour_8.isSelected()?hour_8.getText():hour_9.isSelected()?hour_9.getText():
							hour_10.isSelected()?hour_10.getText():hour_11.isSelected()?hour_11.getText():hour_12.isSelected()?hour_12.getText():"0";
				int hour= Integer.parseInt(time);
				TT= am.isSelected()?am.getText():pm.isSelected()?pm.getText():null;
				cc= C_yes.isSelected()?true:C_No.isSelected()?false:false;
				
				sat=New.isSelected()?New.getText():Live.isSelected()?Live.getText():Repeat.isSelected()?Repeat.getText():null;
				tit=textField_2.getText();
				des=textField.getText();
				
						if(ch==null||co==null||tit==null||hour==0||TT==null||sat==null||des==null) {
							JOptionPane.showMessageDialog(null, "All Field must be entered/Selected \n Please Try Again");
						
						}else {
							 cur = new Programme(ch,co,tit,new Time(hour,0,0,TT),cc,sat,des);	
							System.out.println(cur.toString());
							try {
								MenuGuide frame = new MenuGuide();
								frame.setVisible(true);
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							
						}
					if(cur!=null) {
					FileWriter m = new FileWriter("Programme.txt",true);
					m.write(cur.WriteToF()+"\n");
					m.close();
					Frame[] name=getFrames();
					name[0].dispose();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		Writer.setBounds(305, 556, 138, 33);
		k.add(Writer);
		
		
	}
}

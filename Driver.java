import java.awt.*;
import java.io.File;
import java.io.FileWriter;
//import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
					
		
		try {
			initialize ();
							
			News Nightly1= new News("200-CNN","white","Nightly News", new Time(7,00,00,"pm"),false,"Live","This is 7 o'clock news","Prime Time");
			News Intl1 = new News("200-CNN","white","Intl News",new Time(8,00,00,"pm"),false,"Live","This is 8 o'clock news","International Time");
			News Nightly2 =new News("200-CNN","white","Nightly News", new Time(9,00,00,"pm"),false,"Repeat","This is 9 o'clock news","Prime Time");
			News Intl2 =new News("200-CNN","white","Intl News",new Time(10,00,00,"pm"),false,"Reapet","This is 10 o'clock news","International Time");
			News Nightly3 =new News("200-CNN","white","Nightly News", new Time(11,00,00,"pm"),false,"Repeat","This is 11 o'clock news","Prime Time");
			
			News World =new News("201-BBC","white","World News",new Time(7,00,00,"pm"),false,"Live","This is 7 o'clock news","World News");
			News Sports =new News("201-BBC","white","Sports News",new Time(8,00,00,"pm"),false,"Live","This is 8 o'clock news","Sports News");
			General BBC =new General("201-BBC","white","BBC Presents",new Time(9,00,00,"pm"),false,"Repeat","This is BBC Show");
			News Asia = new News("201-BBC","white","Asia News",new Time(10,00,00,"pm"),false,"Live","This is 10 o'clock news","Asia New period");
			News World1 = new News("201-BBC","white","World Update",new Time(11,00,00,"pm"),false,"Live","This is 11 o'clock news","World Update Period");
			
			Gospel Gospel1 = new Gospel("202-TBN","blue","Gospel Train",new Time(7,00,00,"pm"),false,"Live","This is the Gospel Train","Christianity");
			Gospel Gospel2 = new Gospel("202-TBN","blue","Billy Graham",new Time(8,00,00,"pm"),false,"Live","This is the Gospel Train","Christianity");
			Gospel Gospel3 = new Gospel("202-TBN","blue","Road To Glory",new Time(9,00,00,"pm"),false,"Live","This is the Gospel Train","Christianity");
			Gospel Gospel4 = new Gospel("202-TBN","blue","World Today",new Time(10,00,00,"pm"),false,"Live","This is the Gospel Train","Christianity");
			Gospel Gospel5 = new Gospel("202-TBN","blue","Praise the Lord",new Time(11,00,00,"pm"),false,"Live","This is the Gospel Train","Christianity");
			
			News tvj1= new News("203-TVJ","white","Prime Time News", new Time(7,00,00,"pm"),false,"Live","This is 7 o'clock news","Prime Time");
			General tvj2= new General("203-TVJ","white","TVJ Highlights", new Time(8,00,00,"pm"),false,"Repeat","This is TVJ Highlights");
			General tvj3 =new General("203-TVJ","white","Inside Schools",new Time(9,00,00,"pm"),false,"Repeat","This is Inside Schools Special");
			General tvj4 =new General("203-TVJ","white","Suzan Show",new Time(10,00,00,"pm"),false,"Live","This is Suzan Show");
			News tvj5= new News("203-TVJ","white","News Repeat", new Time(11,00,00,"pm"),false,"Repeat","This is 7 o'clock news","Prime Time");
			
			News cvm = new News("204-CVM","white","Isses in the News", new Time(7,00,00,"pm"),false,"Repeat","This is 7 o'clock news","Isses in the News");
			News cvm1 = new News("204-CVM","white","CVM News", new Time(8,00,00,"pm"),false,"Repeat","This is 8 o'clock news","CVM news hour");
			News cvm2 = new News("204-CVM","white","CVM News", new Time(9,00,00,"pm"),false,"Repeat","This is 9 o'clock news","CVM news hour");
			News cvm3 = new News("204-CVM","white","CVM News", new Time(10,00,00,"pm"),false,"Repeat","This is 10 o'clock news","CVM news hour");
			News cvm4 = new News("204-CVM","white","CVM News", new Time(11,00,00,"pm"),false,"Repeat","This is 11 o'clock news","CVM news hour");
			
			Movies usa = new Movies("205-USA","red","NCIS", new Time(7,00,00,"pm"),false,"Repeat","This is NCIS",5.5,new Date(25,12,1992),"Chris Charles");
			Movies usa1 = new Movies("205-USA","red","NCIS-LA", new Time(8,00,00,"pm"),false,"Repeat","This is NCIS-LA",5.5,new Date(25,12,1992),"Chris Charles");
			Movies usa2 = new Movies("205-USA","red","NCIS-NY", new Time(9,00,00,"pm"),false,"Repeat","This is NCIS-NY",5.5,new Date(25,12,1992),"Chris Charles");
			Movies usa3 = new Movies("205-USA","red","NCIS", new Time(10,00,00,"pm"),false,"Repeat","This is NCIS",5.5,new Date(25,12,1992),"Chris Charles");
			Movies usa4 = new Movies("205-USA","red","NCIS-LA", new Time(11,00,00,"pm"),false,"Repeat","This is NCIS-LA",5.5,new Date(25,12,1992),"Chris Charles");
			
			General dsn= new General("206-DSN","white","Wendy Woo", new Time(7,00,00,"pm"),false,"New","This is Wendy Woo vs School ");
			General dsn1= new General("206-DSN","white","Every body Hates Chris", new Time(8,00,00,"pm"),false,"New","This is Every body Hates Chris ");
			General dsn2= new General("206-DSN","white","Wendy Woo", new Time(9,00,00,"pm"),false,"New","This is Wendy Woo ep1 ");
			General dsn3= new General("206-DSN","white","Every Body Dance", new Time(10,00,00,"pm"),false,"New","This is Wendy Woo ep3 ");
			General dsn4= new General("206-DSN","white","Wendy Woo", new Time(11,00,00,"pm"),false,"New","This is Wendy Woo ep4");
			
			General fam= new General("207-FAM","white","Best Christmas Ever", new Time(7,00,00,"pm"),true,"New","This is the Best Christmas Ever");
			General fam1= new General("207-FAM","white","Happy Time", new Time(8,00,00,"pm"),true,"New","This is Happy Time");
			General fam2= new General("207-FAM","white","Discovery", new Time(9,00,00,"pm"),true,"New","This is Discovery");
			General fam3= new General("207-FAM","white","Dinosaur World", new Time(10,00,00,"pm"),true,"New","This is Dinosaur World");
			General fam4= new General("207-FAM","white","Best Christmas Ever", new Time(11,00,00,"pm"),true,"Repeat","This is the Best Christmas Ever");
			
			Kids kid= new Kids("208-KID","purple","Sesame Street",new Time(7,00,00,"pm"),true,"New Episode","This is Sesame Street","Age Ranage: 0-10");
			Kids kid1= new Kids("208-KID","purple","Big Bear in the Blue House",new Time(8,00,00,"pm"),true,"New Episode","This is Big Bear in the Blue House","Age Ranage: 3-14");
			Kids kid2= new Kids("208-KID","purple","Sesame Street",new Time(9,00,00,"pm"),true,"New Episode","This is Sesame Street","Age Ranage: 0-10");
			Kids kid3= new Kids("208-KID","purple","Sesame Street",new Time(10,00,00,"pm"),true,"Repeat Episode","This is Sesame Street","Age Ranage: 0-10");
			Kids kid4= new Kids("208-KID","purple","Sesame Street",new Time(11,00,00,"pm"),true,"New Episode","This is Sesame Street","Age Ranage: 0-10");
			
			Weather wch= new Weather("209-WCH","green","Weather Update",new Time(7,00,00,"pm"),false,"Live","This is Weather Update",5);
			Weather wch1= new Weather("209-WCH","green","Storm Alert",new Time(8,00,00,"pm"),true,"Live","This is Storm Alert",3);
			Weather wch2= new Weather("209-WCH","green","Weather Update",new Time(9,00,00,"pm"),false,"Live","This is Weather Update",4);
			Weather wch3= new Weather("209-WCH","green","Weather Update",new Time(10,00,00,"pm"),true,"Live","This is Weather Update",2);
			Weather wch4= new Weather("209-WCH","green","Weather Update",new Time(11,00,00,"pm"),false,"Live","This is Weather Update",7);
			
			Comedy com = new Comedy("210-COM","yellow","Oliver Samuels",new Time(7,00,00,"pm"),true,"Live","This is Comedy hour",5.5,"Oliver Samuels",new Date(12,12,12));
			Comedy com1 = new Comedy("210-COM","yellow","Jammie Fox",new Time(8,00,00,"pm"),true,"Live","This is Comedy hour",5.5,"Jammie Fox",new Date(12,12,12));
			Comedy com2 = new Comedy("210-COM","yellow","Kevin Harts",new Time(9,00,00,"pm"),true,"Live","This is Comedy hour",5.5,"Kevin Hart",new Date(12,12,12));
			Comedy com3 = new Comedy("210-COM","yellow","Jerry Seinfeld",new Time(10,00,00,"pm"),true,"Live","This is Comedy hour",5.5,"Jerry Seinfeld",new Date(12,12,12));
			Comedy com4 = new Comedy("210-COM","yellow","Robin Williams",new Time(11,00,00,"pm"),true,"Live","This is Comedy hour",5.5,"Robin Williams",new Date(12,12,12));
			
			
			
			WriteToFile(Nightly1);			
			WriteToFile(Intl1);
			WriteToFile(Nightly2);WriteToFile(Intl2);WriteToFile(Nightly3);WriteToFile(World);
			WriteToFile(Sports);WriteToFile(BBC);WriteToFile(Asia);WriteToFile(World1);WriteToFile(Gospel1);WriteToFile(Gospel2);
			WriteToFile(Gospel3);WriteToFile(Gospel4);WriteToFile(Gospel5);WriteToFile(tvj1);WriteToFile(tvj2);WriteToFile(tvj3);
			WriteToFile(tvj4);WriteToFile(tvj5);WriteToFile(cvm);WriteToFile(cvm1);WriteToFile(cvm2);WriteToFile(cvm3);
			WriteToFile(cvm4);WriteToFile(usa);WriteToFile(usa1);WriteToFile(usa2);WriteToFile(usa3);WriteToFile(usa4);
			WriteToFile(dsn);WriteToFile(dsn1);WriteToFile(dsn2);WriteToFile(dsn3);WriteToFile(dsn4);WriteToFile(fam);
			WriteToFile(fam1);WriteToFile(fam2);WriteToFile(fam3);WriteToFile(fam4);WriteToFile(kid);WriteToFile(kid1);
			WriteToFile(kid2);WriteToFile(kid3);WriteToFile(kid4);WriteToFile(wch);WriteToFile(wch1);WriteToFile(wch2);
			WriteToFile(wch3);WriteToFile(wch4);WriteToFile(com);WriteToFile(com1);WriteToFile(com2);WriteToFile(com3);
			WriteToFile(com4);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
				  
				     
			

		
		/**
		 * Launch the application.
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGuide frame = new MenuGuide();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		/**
		 * Create the frame.
		 */
		


}
	public static void initialize ()
	{
		 try
	      {
	          FileWriter w = new FileWriter("Programme.txt",false);
	          w.close();
	      }
	      catch(Exception e)
	      {
	          System.err.println("File could not be opened");
	          e.printStackTrace();
	      }
		 }
		 public static void WriteToFile (Programme obj)
			{
			      try
			      {
			          FileWriter w = new FileWriter("Programme.txt", true);
			          w.write(obj.WriteToF()); 
			          w.close();
			      }
			      catch(Exception e)
			      {
			          System.err.println("File could not be opened");
			          e.printStackTrace();
			      }
			     
			}   
			
			
			public static void DisplayFromFile()
			  {
				String Out = null;
			      try
			      {
			          Scanner s = new Scanner(new File("ProgrammeListing.txt"));
			          s.useDelimiter(", ");
			          
			       
			          
			          
			          
			          while (s.hasNext()) 
			          {
			             Out = s.nextLine();
			              
			              System.out.println (" " +Out+"\n ");
			              
			    			
			          }
			          s.close();
			      }catch(Exception e)
			      {
			          System.err.println("An I/O exception occurred");
			          e.printStackTrace();
			      } 
			  }
	}

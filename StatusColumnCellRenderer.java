import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class StatusColumnCellRenderer extends DefaultTableCellRenderer {
	
	   private static final long serialVersionUID = 1L;
	   public Component getTableCellRendererComponent(JTable table, Object value,
	            boolean isSelected, boolean hasFocus, int row, int col) {

	      Component  c = super.getTableCellRendererComponent(table, value,
	              isSelected, hasFocus, row, col);
	   
	     Object valueAt = table.getModel().getValueAt(row, col);
	    
	     String s = "";
	     if (valueAt != null) {
	    	 
	    	 String co= ReadFromFile(valueAt);
	        s = valueAt.toString();
	     
	  
	     

	     if (co.equalsIgnoreCase("blue") ) {
	        
	        c.setBackground(Color.blue);
	     } else if (co.equalsIgnoreCase("red")) {
	        
	        c.setBackground(Color.red);
	     }else if (co.equalsIgnoreCase("purple")) {
		        
		        c.setBackground(Color.getHSBColor(273, 100,82));
		     }else if (co.equalsIgnoreCase("green")) {
			        
			        c.setBackground(Color.green.brighter().brighter());
			     }  else if (co.equalsIgnoreCase("yellow")) {
			        
			        c.setBackground(Color.yellow);
			     }else if (co.equalsIgnoreCase("white")) {
	        
	        c.setBackground(Color.WHITE);
	     }
	     }else {  
	    	 c.setBackground(null);
	    	 
	     }
	     
	     return c;
	  }
	   public static String ReadFromFile(Object r)
		{
			String Out=null;
			String  ch = null, co = null, Title1=null, time = null, status = null,  capin = null, des = null, rate = null, dr = null, lma = null;
			try
			{
				
				
				
				
				Scanner s = new Scanner (new File("Programme.txt") );
				
				s.useDelimiter(", ");
				while (s.hasNext())
				{
					
					ch = s.next();
					if(ch.equals("\n")==false) {
					co = s.next();
					Title1 = s.next();
					capin = s.next();
					status = s.next();
					des = s.next();
					time = s.next();
					if(time.equals("\n")==false) {
					rate= s.next();
					if(rate.equals("\n")==false){		 
					 dr=s.next();
					if(dr.equals("\n")==false){
					 lma= s.next();
						  
							  		} 
							 
						  		}
				
							}
					
						}
					
					if(Title1.equals(r.toString())) {
						break;
					}
				}
				
				s.close();	
				
					
				}
			
			catch (Exception e)
			{
			e.printStackTrace();
			}
		if(co.equals(null)==true) {
			co="white";
		}
	return co;	
}

	}	


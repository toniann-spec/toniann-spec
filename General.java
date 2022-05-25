public class General extends Programme{
		
		public General()
		{
			super();
			
		}
		public General(String Channel,String Colour,String Title, Time T,boolean Cap,String Sat, String Dur)
		{
			super(Channel,Colour,Title,T,Cap,Sat,Dur);
			
		}
		public General(General obj)
		{
			super(obj);
			
		}
	
		@Override
		public String WriteToF() {
			
			String out;
			out= super.WriteToF()+"\n";
					return out;
			
		}
		@Override
		public String toString() 
		{
			String out;
			out="";
			return out;
		}
	
}

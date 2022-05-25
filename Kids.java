public class Kids extends Programme {
		private String age_Range;
		
		public Kids()
		{
			super();
			age_Range = "";
			
		}
		public Kids(String Channel,String Colour,String Title, Time T,boolean Cap,String Sat, String Dur, String age_Range)
		{
			super(Channel, Colour,Title,T,Cap,Sat,Dur);
			this.age_Range = age_Range;
			
		}
		public Kids(Kids obj) 
		{
			super(obj);
			this.age_Range = obj.age_Range;
			
		}
		public String getAge_Range() {
			return age_Range;
		}
		public void setAge_Range(String age_Range) {
			this.age_Range = age_Range;
		}
		
		@Override
		public String WriteToF() {
			
			String out;
			out= super.WriteToF()+getAge_Range()+", \n";
					return out;
			
		}
	
		@Override
		public String toString() {
			String out;
			super.toString();
			out = "Age Range"+age_Range+"\nLength:"+super.toString();
			System.out.println(out);
			return out;
		};
}

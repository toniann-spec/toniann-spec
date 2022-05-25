public class Programme {
		
		protected String Channel;
		protected String Colour;
		protected String Title;
		protected boolean CapI;
		protected String SatI;
		protected String Desc;
		protected Time Time;
		
		Programme(){
			
			Channel="000-Programe";
			Colour="red";
			Title="New Show";
			CapI=false;
			SatI="Repeat";
			Desc="1 hour";
			Time = new Time();
			
			
		}
		Programme( String Channel,String Colour,String Title, Time T,boolean Cap,String Sat, String Dur)
		{
			
			this.Channel=Channel;
			this.Colour=Colour;
			this.Title=Title;
			this.CapI=Cap;
			this.SatI=Sat;
			this.Desc=Dur;
			Time=T;
			
		}
		Programme(Programme obj)
		{
			
			this.Channel=obj.Channel;
			this.Colour=obj.Colour;
			this.Title=obj.Title;
			this.CapI=obj.CapI;
			this.SatI=obj.SatI;
			this.Desc=obj.Desc;
			Time=obj.Time;
			
		}
	
		
		public boolean isCapI() {
			return CapI;
		}
		public void setCapI(boolean capI) {
			CapI = capI;
		}
		public String getSatI() {
			return SatI;
		}
		public void setSatI(String satI) {
			SatI = satI;
		}
		public String getDesc() {
			return Desc;
		}
		public void setDesc(String Desc) {
			this.Desc = Desc;
		}
		public String getChannel() {
			return Channel;
		}
		public void setChannel(String channel) {
			Channel = channel;
		}
		public String getColour() {
			return Colour;
		}
		public void setColour(String colour) {
			Colour = colour;
		}
		public String getTitle() {
			return Title;
		}
		public void setTitle(String title) {
			Title = title;
		}
		public Time getTime() {
			return Time;
		}
		public void setTime(Time T) {
			Time=T;
		}
		
		public String WriteToF() {
		String out;
		out=", "+Channel+", "+Colour+", "+Title+", "+CapI +", "+SatI+", "+ Desc +", "+Time+", ";
		return out;
		}
		@Override
		public String toString() {
			
			String out;
			out= "Channel: " + Channel +"\n Title: " + Title + "\n Time Playing: "+Time+"\n";
			//System.out.println(out);
			return out;
	
		
	
	}
}

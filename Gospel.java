public class Gospel extends Programme {
		private String denomination;
	
		public Gospel()
		{
			super();
			denomination = "Christianity";
			
		}
		public Gospel(String Channel,String Colour,String Title, Time T,boolean Cap,String Sat, String Dur, String denomination)
		{
			super(Channel,Colour,Title,T,Cap,Sat,Dur);
			this.denomination = denomination;
		
			
		}
		public Gospel(Gospel obj)
		{
			super(obj);
			this.denomination = obj.denomination;
			
		}
		public String getDenomination() {
			return denomination;
		}
		public void setDenomination(String denomination) {
			this.denomination = denomination;
		}
		@Override
		public String WriteToF() {
			
			String out;
			out= super.WriteToF()+getDenomination()+", \n";
					return out;
			
		}
	
		@Override
		public String toString() {
			String out;
			out = ""+super.toString()+" "+denomination;
			System.out.println(out);
			return out;
		};
}

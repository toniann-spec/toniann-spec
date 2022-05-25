public class Comedy extends Programme {
	
	private double ratings;
		private String actor_l;
		private Date date_R;
		
		public Comedy()
		{
			super();
			ratings = 5.5;
			 actor_l = "";
			date_R = new Date();
			
		}
		public Comedy(String Channel,String Colour,String Title, Time T,boolean Cap,String Sat, String Dur, double ratings, String actor_l, Date date_R)
		{
			super(Channel, Colour, Title,T,Cap,Sat,Dur);
			this.ratings = ratings;
			this.actor_l = actor_l;
			this.date_R = date_R;
			
			
		}
		public Comedy(Comedy obj)
		{
			super(obj);
			this.ratings = obj.ratings;
			this.actor_l = obj.actor_l;
			this.date_R = obj.date_R;
			
		}
		public double getRatings() {
			return ratings;
		}
		public void setRatings(double ratings) {
			this.ratings = ratings;
		}
		public String getActor_l() {
			return  actor_l;
		}
		public void setActor_l(String actor_l) {
			this.actor_l = actor_l;
		}
		public Date getDate_R() {
			return date_R;
		}
		public void setDate_R(Date date_R) {
			this.date_R = date_R;
		}
		@Override
		public String WriteToF() {
			
			String out;
			out= super.WriteToF()+getRatings()+", "+getDate_R()+", "+ getActor_l()+",\n";
					return out;
			
		}
		
	
		
		@Override
		public String toString() {
		String out;
		//super.toString();
		out = " "+super.toString()+" "+" "+ratings+" ";
		System.out.println("Tilte: " +super.getTitle());
		System.out.println("\n Ratings: " +getRatings());
		System.out.println("\n Actor(s): "+getActor_l());
		
		System.out.println(out);
		return out;
	};
}
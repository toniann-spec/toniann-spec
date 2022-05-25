public class Movies extends Programme 
{
		private double ratings;
		private Date date_r;
		private String actor_l;
	
		public Movies()
		{
			super();
			ratings = 0.0;
			date_r = new Date();
			actor_l = "";
			
		}
		public Movies(String Channel,String Colour,String Title, Time T,boolean Cap,String Sat, String Dur, double ratings, Date date_r, String actor_l)
		{
			super(Channel,Colour,Title,T,Cap,Sat,Dur);
			this.ratings = ratings;
			this.date_r = date_r;
			this.actor_l = actor_l;	
			
		}
		public Movies(Movies obj)
		{
			super(obj);
			this.ratings = obj.ratings;
			this.date_r = obj.date_r;
			this.actor_l = obj.actor_l;	
			
		}
		
		
		public double getRatings() {
			return ratings;
		}
		public void setRatings(double ratings) {
			this.ratings = ratings;
		}
		public Date getDate_R() {
			return date_r;
		}
		public void setDate_R(Date date_r) {
			this.date_r = date_r;
		}
		public String getActor_l() {
			return actor_l;
		}
		public void setActor_l(String actor_l) {
			this.actor_l = actor_l;
		}
		@Override
		public String WriteToF() {
			
			String out;
			out= super.WriteToF()+getRatings()+", "+getDate_R()+", "+ getActor_l()+", \n";
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
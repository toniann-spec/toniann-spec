public class Weather extends Programme
{
	private double ratings ;
	
	
	public Weather()//default
	{
		super();
		ratings= 0.0;
	}
	public Weather(String Channel,String Colour,String Title, Time T,boolean Cap,String Sat, String Dur, double ratings)
	{
		super(Channel, Colour, Title,T, Cap,Sat,Dur);
		this.ratings = ratings;
		
	}
	public Weather(Weather obj)
	{
		super(obj);
		this.ratings = obj.ratings;
		
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	@Override
	public String WriteToF() {
		
		String out;
		out= super.WriteToF()+getRatings()+", \n";
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
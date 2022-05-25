public class Time
{
			private int hour;
			private int minute;
			private int second;
			private String per;
		
		
		
		public Time()//DEFAULT
		{
			this.hour= 7;
			this.minute=00;
			this.second= 00;
			this.per= "am";
		}
		public Time (int hour, int minute, int second,String p)//PRIMARY
		{
			this.hour=hour;
			this.minute=minute;
			this.second=second;
			per=p;
			
		}
		
		public Time(Time obj)//COPY
		{
			
			this.hour=obj.hour;
			this.minute=obj.minute;
			this.second=obj.second;
			per=obj.per;
		}
		
		public String getPer() {
			return per;
		}
		public void setPer(String per) {
			this.per = per;
		}
		public int gethour() {
			return hour;
		}
		public void sethour(int hour) {
			this.hour = hour;
		}
		public int getminute() {
			return minute;
		}
		public void setminute(int minute) {
			this.minute = minute;
		}
		public int getsecond() {
			return second;
		}
		public void setsecond(int second) {
			this.second = second;
		}
		
		
		@Override
		public String toString() {
			String out;
			out=""+ hour + ":" + minute + second+per;
			
			return out;
		}
	/*	public void display ()
		{
			System.out.println("Time: "+hour+"/"+minute+"/"+second);
		
		
		}*/

}
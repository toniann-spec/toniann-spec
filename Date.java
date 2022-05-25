public class Date{
		private int day;
		private int month;
		private int year;		
		public Date()//DEFAULT
			{
				this.day= 10;
				this.month=10;
				this.year= 2020;
			}
		public Date (int day, int month, int year)//PRIMARY
			{
				this.day=day;
				this.month=month;
				this.year=year;
				
			}
		public Date(Date obj)//COPY
			{
				
				this.day=obj.day;
				this.month=obj.month;
				this.year=obj.year;
			}
		public int getDay() 
		{
			return day;
		}
		public void setDay(int day) 
		{
			this.day = day;
		}
		public int getMonth() 
		{
			return month;
		}
		public void setMonth(int month)
		{
			this.month = month;
		}
		public int getYear()
		{
			return year;
		}
		public void setYear(int year)
		{
			this.year = year;
		}
		public String toString()
		{
			String out;
			out="DATE: "+day+"/"+month+"/"+year;
			
			return out;
			
			
		
		
		
		}

}
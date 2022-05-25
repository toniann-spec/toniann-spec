public class News extends Programme {	
		private String news_ep;
		public News() 
		{
			super();
			news_ep = "";
		}
		public News(String Channel,String Colour,String Title,Time T,boolean Cap,String Sat, String Dur,String p) 
		{
			super(Channel,Colour,Title,T,Cap,Sat,Dur);
			this.news_ep = p;
		}
		public News(News obj) 
		{
			super(obj);
			this.news_ep = obj.news_ep;
		}
		public String getNews_ep() {
			return news_ep;
		}
		public void setNews_ep(String news_ep) {
			this.news_ep = news_ep;
		}
		@Override
		public String WriteToF() {
			
			String out;
			out= super.WriteToF()+getNews_ep()+", \n";
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
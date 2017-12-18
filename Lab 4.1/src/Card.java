//Katherin Solis
public class Card {

	  private int pv;
	  private String suite;
	  private  String rank;

	   //parameterized Card with three parameters
	   public Card(int pointValue, String suite, String rank)
		 {
	       this.pv = pointValue;
	       this.suite = suite;
	       this.rank = rank;
	   }
	   void info(){
	        System.out.println("rank: "+rank+" suit: "+suite+" pointValue: "+pv);
	   }



		 public boolean (Card Card2)
		 {
			 if(this.pv == card2.pv)
			 {
				 return true;
			 }
			 return false;
		 }


	   public String toString()
	   {
			 return "{"+ this.getrank() + " " + this.getsuit() + " " + this.getpv()+ "}";

	   }

		 public String getrank()
		 {
			 return this.rank;
		 }

		 public String getsuit()
		 {
			 return this.suit;
		 }

		 public String getpv()
		 {
			 return this.getpv;
		 }


	}

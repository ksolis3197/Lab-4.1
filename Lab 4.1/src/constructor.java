
public class constructor {

	   int pv;  
	   String suite;
	   String rank;
		    
	   //parameterized constructor with three parameters
	   constructor(int pointValue, String suite, String rank){  
	       this.pv = pointValue;  
	       this.suite = suite;  
	       this.rank = rank;
	   }  
	   void info(){
	        System.out.println("rank: "+rank+" suit: "+suite+" pointValue: "+pv);
	   }  
		   
	   public static void main(String args[]){  
		constructor obj1 = new constructor(2,"Ace","Clubs");  
		constructor obj2 = new constructor(10,"King","Clubs");  
		obj1.info();  
		obj2.info();  
	   }  
	   
	   public boolean equals (String toString)
	   {
		   String object = "Ace";
		   if ( object == toString)
		   {
			   return true;
		   }
		return false;
		   
	   }
	}
//
//public class Card {
//	
//	public static void Constructor( String rank, String suit, int pointValue)
//	{
//		rank = ("");
//		suit = ("");
//		pointValue = 0;
//		String [] diffRanks = ("King", "Queen", "Jack");
//	}
//	
//
//
//}
import java.util.*;

public class RankList {
   public static void main(String args[]) {

	  ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/

	  obj.add("King");
	  obj.add("Queen");
	  obj.add("Bishop");
	  obj.add("Joker");



	  /* Displaying array list elements */
	//  System.out.println("Currently the array list has following elements:"+obj);

	  /*Add element at the given index*/
	  obj.add(3,"Ace");

	  /*Remove elements from array list like this*/
	  obj.remove("Bishop");
	

//	  System.out.println("Current array list is:"+obj);
//
//	  /*Remove element from the given index*/
//	  obj.remove(1);

	  System.out.println("Rank list is:"+obj);
   }
}
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class Deck
{
  private ArrayList<Card> notHanded;
  private ArrayList<Card> handed;

  public Deck( String[] ranks, String[] suits, int[] pv)
  {
    for (int i = 0; i<suits.length; i++)
    {
      for (int j = 0; j<ranks.length; j++)
      {
        for(int k = 0; k<pv.length; k++)
        {
          Card n = new Card( ranks[j],suits[i],values[k]);
          this.notHanded.add(n);
        }
      }
    }
  }

  public boolean empty()
  {
    if(notHanded.size() ==0)
    {
      return true;
    }
    return false;
  }

  public int size()
  {
    return this.notHanded.size();
  }

  public List<Card> handed()
  {
    if(!empty())
    {
      Card l = notHanded.get((int) Math.random() * this.size());
      handed.add(l);
      return l;

    }

    return null;
  }

  public void shuffle()
  {

    int m = 0;
    int n = 0;

    for(int o = 0; o < handed.size(); o ++)
    {
      notHanded.add(o, handed.get(o));
      handed.remove(o);
    }

    While( m > 1)
    {
      n = ((int)Math.random()*51);
      Card  holder1 = handed.get(m);
      Card  holder2 = handed.get(n);
      handed.set(m,holder2);
      handed.set(n,holder1);
      m--;
    }

  }

}

//   public List
// Card obj1 = new Card(2,"Ace","Clubs");
// Card obj2 = new Card(10,"King","Clubs");
// obj1.info();
// obj2.info();
// }

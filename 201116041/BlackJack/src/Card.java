

public class Card {
    //String card[] = {"¢¼","¡Þ","¢¾","¢À"};
    String cardnum[]={"A","2","3","4","5","6","7",
	              "8","9","10","J","Q","K"};
    String Deck[]=new String[52];
    int numDeck[]= new int[52];
    int rand=0;

    void myRandom() 
    {          
	int b=0;
	    while(b<52){
	  	for(int i=0;i<cardnum.length;i++)    
	  	{
	  	   // for(int j= 0; j<card.length;j++)
	  	   // {
	  		
	  	        Deck[b]= cardnum[i];//+card[j];
	  	        b++;}
	  	    
	  	  //  }
	    }
	    for(int i=0; i < Deck.length*2; i++ ) {
		
		int x = (int)(Math.random()*Deck.length);
		int y = (int)(Math.random()*Deck.length);
		String temp = Deck[x];
		Deck[x] = Deck[y];
		Deck[y] = temp;
		}

    }

    void getCards(int[] cs, int player)
    {
	myRandom();
	
	
    }
}

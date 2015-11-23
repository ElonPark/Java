package Exercise2;

public class SutdaDeck {
    final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
	    for(int i=0; i < cards.length; i++) {
		
		int num =i%10 +1;
		//boolean b=(i<10)&&(num ==1 || num ==3 || num ==8);
		boolean b;
	if((i<10)&&(num ==1 || num ==3 || num ==8))
	{
	    b=true;
	}
	else
	{
	    b=false;
	}
	/*cards[i] = new SutdaCard(num,b);
	 if( i >= 10 ) {
	    cards[i] = new SutdaCard(i-9, false);
	    }
	    else {
	    cards[i] = new SutdaCard(i+1, false);
	    if( i+1 == 1 || i+1 == 3 || i+1 == 8) {
	    cards[i].isKwang = true; 
	    }
	       
	  }*/
	cards[i] = new SutdaCard(num,b);        
	 }
    }
	void shuffle()
	{
	    for(int i=0; i < cards.length*2; i++ ) {
		
		int x = (int)(Math.random()*cards.length);
		int y = (int)(Math.random()*cards.length);
		SutdaCard temp = cards[x];
		cards[x] = cards[y];
		cards[y] = temp;
		}
	}
	SutdaCard pick(int index)
	{
	   
	    return cards[index];
	}
	SutdaCard pick()
	{
	    return cards[(int)(Math.random()*20)];

	    
	}
	
	

}

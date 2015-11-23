package cardClass;



public class cradDeck {
    final int CARD_NUM = 52;
    rCrad[] cards = new rCrad[CARD_NUM];
    cradDeck() {
   	    for(int i=0; i < cards.length; i++) {
   		
   		int num =i%13;
   		String model="";
   		
   	if(i >=0 && i<13)
   	{
   	   model="spade";
   	}
   	else if(i >14 && i<25)
   	{
   	 model="diamond";
   	}
   	else if(i >25 && i<38)
   	{
   	 model="diamond";
   	}
   	else if(i >38 && i<=52)
   	{
   	 model="diamond";
   	}
   	cards[i]=new rCrad(num,model);
   	 }  	    
    }
    void shuffle()
	{
	    for(int i=0; i < cards.length; i++ ) {
		rCrad temp = null;
		int index = (int)(Math.random()*52);
		temp = cards[i];
		cards[i] = cards[index];
		cards[index] = temp;
		}
	}
    rCrad pick(int index)
	{
	   
	    return cards[index];
	}
    rCrad pick()
	{
	    return cards[(int)(Math.random()*52)];

	    
	}
}

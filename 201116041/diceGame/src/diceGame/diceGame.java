package diceGame;

public class diceGame {

    public static void main(String[] args) {
	
	dice dice= new dice();
	while(dice.coin !=0)
	{
	dice.myRandom();
	dice.finding();
	dice.result();
	if(dice.coin ==0){
	    System.out.println("\n������ �����ϴ�. �Ѱ� ����"); 
	}
	}

    }
    

}

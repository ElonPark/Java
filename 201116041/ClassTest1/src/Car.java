
public class Car {
	
	String carName;
	String carColor;
	String maker;
	int iSpeed;
	
	void speedUp()
	{
		iSpeed += 10;
		
	}
	void speedDown()
	{
		iSpeed -= 10;
		if(iSpeed <0)
		{
			stop();
		}
	}
	void stop(){
		iSpeed =0;
	}
	
	String  carInfo(String cn)
	{
		return cn+" �� �̸� : "+carName 
				+ "\t���� : "+ carColor
				+ "\t������ : "+maker;
	}

}

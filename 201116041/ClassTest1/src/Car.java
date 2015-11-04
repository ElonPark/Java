
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
		return cn+" 차 이름 : "+carName 
				+ "\t색상 : "+ carColor
				+ "\t제조사 : "+maker;
	}

}

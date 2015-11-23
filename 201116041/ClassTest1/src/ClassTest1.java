
public class ClassTest1 {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.setChannel(11);
		tv.dispChannel();
		
		Car car1;
		car1 = new Car();
		
		
		System.out.println("1. "+car1.carInfo("car1"));
		
		car1.carName="소나타";
		car1.carColor="Balck";
		car1.maker="현대";
		
		System.out.println("1. "+car1.carInfo("car1"));
		System.out.println("car1 speed: "+car1.iSpeed);
		
		for(int i = 0; i<3;i++)
		{
			car1.speedUp();
		}
		System.out.println("car1 speed: "+car1.iSpeed);
		
		for(int i = 0; i<5;i++)
		{
			car1.speedDown();
		}
		System.out.println("car1 speed: "+car1.iSpeed);


	}

}


class Television
{
	int channelNum; //멤버 변수, 클래스내에 메소드들도 사용 가능
	
	void setChannel(int newChan) //setter , getter
	{
		int i;
		channelNum = newChan;
		
		
	}
	
	void dispChannel()
	{
		System.out.println("현재 채널은 "+channelNum+"입니다." );
		
	}
}
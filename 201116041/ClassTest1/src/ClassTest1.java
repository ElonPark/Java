
public class ClassTest1 {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.setChannel(11);
		tv.dispChannel();
		
		Car car1;
		car1 = new Car();
		
		
		System.out.println("1. "+car1.carInfo("car1"));
		
		car1.carName="�ҳ�Ÿ";
		car1.carColor="Balck";
		car1.maker="����";
		
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
	int channelNum; //��� ����, Ŭ�������� �޼ҵ�鵵 ��� ����
	
	void setChannel(int newChan) //setter , getter
	{
		int i;
		channelNum = newChan;
		
		
	}
	
	void dispChannel()
	{
		System.out.println("���� ä���� "+channelNum+"�Դϴ�." );
		
	}
}
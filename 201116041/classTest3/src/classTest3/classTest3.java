package classTest3;


public class classTest3 {

    public static void main(String[] args) {

	mClass cls = new mClass();//�ν��Ͻ��� �̿��� ȣ��
	
	
	cls.setTag(100);
	int r= cls.getTag();
	System.out.println(r);
	cls.mCalssMethod();
	
	mClass.number++;//���ø��� �̿��� ȣ��
	
	cls.plusNum();
	cls.plusNum();
	cls.plusNum();
	
	//mClass cls =mClass.staticMethod();//static �޼ҵ�(Ŭ���� �޼ҵ�)
	
	

    }

}

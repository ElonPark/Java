package classTest3;


public class classTest3 {

    public static void main(String[] args) {

	mClass cls = new mClass();//인스턴스를 이용해 호출
	
	
	cls.setTag(100);
	int r= cls.getTag();
	System.out.println(r);
	cls.mCalssMethod();
	
	mClass.number++;//템플릿을 이용해 호출
	
	cls.plusNum();
	cls.plusNum();
	cls.plusNum();
	
	//mClass cls =mClass.staticMethod();//static 메소드(클래스 메소드)
	
	

    }

}

package constructorTest;

public class constructorTest {

    public static void main(String[] args) {
	
	mClass cls = new mClass("Hello java");
	
	cls=null;//�Ҹ��� ������� ���� ����
	
	System.gc();//������ �ݷ���

    }

}

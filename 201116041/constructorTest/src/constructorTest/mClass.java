package constructorTest;

public class mClass {
    
    int num;
    boolean b;
    /*������ : �޼ҵ�
     * ���� ���� ����.
     * �μ��� ���� �� �ִ�.
     * Over Load ����
     * ������ ���� Ŭ���� ��� ����.
     * ������ �ڵ� ȣ��ȴ�.
     * ���������� ȣ���� ���� ����.
     */
    
    mClass()
    {
	System.out.println("mClass �⺻ ������()");
    }
    mClass(String s)
    {
	//this(10, true);
	System.out.println("mClass �⺻ ������(String s)"+s);
    }
    mClass(int i)
    {
	System.out.println("mClass �⺻ ������(int i)"+i);
    }
    mClass(int i,String s)
    {
	System.out.println("mClass �⺻ ������(int i,String s)"+i+s);
    }
    
    
    /*�Ҹ���
     * 
     */

}

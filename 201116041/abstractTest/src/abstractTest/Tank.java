package abstractTest;

public class Tank extends Unit {

    @Override
    void move(int x, int y) {
	// TODO �ڵ� ������ �޼ҵ� ����
	
	System.out.println(x+","+y+"�� �̵�");

    }

    @Override
    void stop() {
	// TODO �ڵ� ������ �޼ҵ� ����
	System.out.println("����");

    }
    void changeMode()
    {
	System.out.println("������");
    }

}

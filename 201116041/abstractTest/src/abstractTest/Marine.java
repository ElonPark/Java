package abstractTest;

public class Marine extends Unit {

    @Override
    void move(int x, int y) {
	// TODO �ڵ� ������ �޼ҵ� ����
	
	System.out.println(x+","+y+"�� �̵�");
	stimPack();
    }

    @Override
    void stop() {
	// TODO �ڵ� ������ �޼ҵ� ����
	System.out.println("����");

    }
    void stimPack(){
	System.out.println("������ ���");

    }

}

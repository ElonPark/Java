package abstractTest;

public class Dropship extends Unit {

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
    void load()
    {
	System.out.println("����");

    }
    void unload()
    {
	System.out.println("����");

    }

}

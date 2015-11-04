package abstractTest;

public class Dropship extends Unit {

    @Override
    void move(int x, int y) {
	// TODO 자동 생성된 메소드 스텁
	
	System.out.println(x+","+y+"로 이동");

    }

    @Override
    void stop() {
	// TODO 자동 생성된 메소드 스텁
	System.out.println("멈춤");

    }
    void load()
    {
	System.out.println("승차");

    }
    void unload()
    {
	System.out.println("하차");

    }

}

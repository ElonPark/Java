package abstractTest;

public class Tank extends Unit {

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
    void changeMode()
    {
	System.out.println("시즈모드");
    }

}

package abstractTest;

public class Marine extends Unit {

    @Override
    void move(int x, int y) {
	// TODO 자동 생성된 메소드 스텁
	
	System.out.println(x+","+y+"로 이동");
	stimPack();
    }

    @Override
    void stop() {
	// TODO 자동 생성된 메소드 스텁
	System.out.println("멈춤");

    }
    void stimPack(){
	System.out.println("스팀팩 사용");

    }

}

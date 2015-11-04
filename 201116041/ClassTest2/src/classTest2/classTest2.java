package classTest2;

import java.awt.Toolkit;
import java.util.Scanner;

public class classTest2 {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
    /*
	while(true){
	randClass rcls = new randClass();
	
	rcls.init();

	
	rcls.loop();
	
	rcls.result();
	int nextPlay;
	 try{
	System.out.println("한판 더 하시겠습니까? Yes(1) No(2)");
	nextPlay = sc.nextInt();	
	if(nextPlay == 1){
	    System.out.println("게임 시작");
	}
	else if(nextPlay == 2){
	    System.out.println("게임 종료");
		break;
	}
    
	 }catch(Exception e){
		System.out.println("다시 기입하시기 바랍니다");
	}
    }
	    
	 //   Toolkit.getDefaultToolkit().beep();
	baseball bcls = new baseball();
	bcls.myRandom();
	
	bcls.loop();
	bcls.result();*/
	jSort sor = new jSort();
	
	sor.sortProcess();
	
    }
}

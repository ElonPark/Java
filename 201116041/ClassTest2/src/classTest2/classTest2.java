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
	System.out.println("���� �� �Ͻðڽ��ϱ�? Yes(1) No(2)");
	nextPlay = sc.nextInt();	
	if(nextPlay == 1){
	    System.out.println("���� ����");
	}
	else if(nextPlay == 2){
	    System.out.println("���� ����");
		break;
	}
    
	 }catch(Exception e){
		System.out.println("�ٽ� �����Ͻñ� �ٶ��ϴ�");
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

import java.util.Scanner;

public class Student {
  String name;//�̸�
  int ban;//��
  int no;//��ȣ
  int kor;//����
  int eng;//����
  int math;//����
 

  int getTotal(int...num){
	  int iTotal=0;
	  for(int i= 0; i<num.length;i++){
		iTotal= iTotal+num[i];
	  }
	  return iTotal=kor+eng+math;
  }
  int getAverage(){
	  int iAver;
	  return iAver = getTotal()/3;
  }
  
}

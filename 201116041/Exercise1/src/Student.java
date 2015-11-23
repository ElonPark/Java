import java.util.Scanner;

public class Student {
  String name;//이름
  int ban;//반
  int no;//번호
  int kor;//국어
  int eng;//영어
  int math;//수학
 

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

package methodTest;

public class methodTest {
	/*
	static void method(int count, String code){
		System.out.println(code+" 시험 결과는 ");
		if(count >=80)
		{
			System.out.println("합격입니다.");
			
		}
		else
		{
			System.out.println("불합격입니다.");
		}
		
	}
	
	public static int method1(int n1, int n2)
	{
		int r;
		r= n1*n2;
		return r;
	}*/
	public static void method2(int n1, int n2, int []re)
	{
		
		re[0]= n1*n2;
		
	}
	
	//합계 메소드 
	public static int Sum(int arr[])
	{
		int r = 0;
		for(int i= 0; i<arr.length;i++)
		{
		 r+= arr[i];
		}	
		return r;
	}
	//평균 메소드
	public static int Ave(int arr[])
	{
		int r = 0;
		r= Sum(arr)/arr.length;
		return r;
	}
	//%21 메소드
	public static int finding(int arr[])
	{
		int r = 0;
		r= Sum(arr)%21;
		return r;
	}
	public static boolean isNumber(String str) {  
        boolean check = true;
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                check = false;
                break; 
            }
        }
    return check;  
   }
	
	static int myRandom(int min, int max){
		return (int) (Math.random() * (max - min + 1)) + min;
	}
	static void Lotto(int lNum[],int nNum[]){
	
	   int r,w;
		w=0;
		System.out.print("이번주 로또 번호는 ");
		boolean swit[] = new boolean[45];
		for(int i=0;i<45;i++)swit[i]=false;//0이 45개
		while(w<6)
		{
		r = (int)(Math.random()*45);
		if(swit[r]==false)
		{
			swit[r] = true; //00000 10000
			lNum[w] =r+1; //1~45
			for(int i = 0;i<lNum.length; i++)
			{
				for(int j = 0;j<nNum.length; j++)
				{
					if(lNum[i]==nNum[j]) w--;
				}
			}
			
			w++;
		}
		}
		for(int i=0;i<lNum.length;i++){
		System.out.print(lNum[i]+" ");
		}
		System.out.println("입니다.");
		
	}
	public static void main(String[] args) {
		
		
		int dp=0;
		int ran[]={9,6,2,7,8} ;
		dp= Sum(ran);
		System.out.println("합계: "+dp);
		dp= Ave(ran);
		System.out.println("평균: "+dp);
		dp= finding(ran);
		System.out.println("나머지: "+dp);
		
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "123o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		int min=5;
		int max=30;
		dp=myRandom(min,max);
		System.out.println(dp);
		int lotto[] = new int[6];
		int del[] = {45,7,9,12,21,5};
		Lotto(lotto,del);
		
		for(int i=0;i<del.length;i++){
			System.out.print(del[i]+" ");
			}
		
		
	/*
		int english =78;
		int math = 80;
		
		method(english,"영어");
		method(math,"수학");
		method(80,"국어");
		
		int r =method1(24,45);
		System.out.println("r= "+r);
		
		int num[] = new int[1];
		
		method2(24,45,num);
		System.out.println("num= "+num[0]);
		
		
		
		System.out.println("영어 시험 결과는 ");
		if(english >=80)
		{
			System.out.println("합격입니다.");
			
		}
		else
		{
			System.out.println("불합격입니다.");
		}
		System.out.println("영어 시험 결과는 ");
		if(math >=80)
		{
			System.out.println("합격입니다.");
			
		}
		else
		{
			System.out.println("불합격입니다.");
		}
	*/
		

	}

}

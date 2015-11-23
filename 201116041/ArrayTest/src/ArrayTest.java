
public class ArrayTest {

	public static void main(String[] args) {
		
		//Array(배열):같은 자료형들의 묶음
		
		int num1,num2,num3,num4,num5;
		char c1,c2,c3;
        String str1,str2,str3;
        
        //자료형 배열 변수명[index number]; == *포인터 변수 ==[]
        // index number:[10] == 0 ~ 9
        /*
        int Array[] = new int[5]; // int []Array ==int *Array == int* Array
        
        Array[0] = 100;
        Array[1] = 200;
        Array[2] = 300;
        Array[3] = 400;
        Array[4] = 500;
        
        for(int i = 0; i<5; i++)
        {
        	System.out.println("Array["+i+"]= "+Array[i]);
        }
        
        int Array1[] = {100,200,300,400,500};
        for(int i = 0; i<5; i++)
        {
        	System.out.println("Array1["+i+"]= "+Array1[i]);
        }
        
        
        char []mo;
        
        mo = new char[2];
        
        mo[0] ='A';
        mo[1] ='B';
        
        for(int i = 0; i<mo.length; i++)
        {
        	System.out.print(mo[i]);
        }
        
        
        int[] arr ={122,20,255,140,56};
  
        
        for(int i = 0; i<arr.length; i++)
        {
        	
        	double sum = (double)arr[i] /255.0;
        	System.out.println(sum);
        	
        }
        
        //Alias (==별명,분신)
        
        int Arr[] = { 2,4,6};
        int Alias[];
        
        Alias = Arr;  //참조
        
         for(int i = 0; i<Alias.length; i++)
          {
                	
            // System.out.println(Alias[i]);
                	
           }
         for(int i = 0; i<Alias.length; i++)
         {
             Alias[i] +=1;  	
            System.out.println(Arr[i]);
               	
          }
         
         int Arr[] = { 2,4,6};
         int Alias[] =new int[3];
         for(int i = 0; i<Alias.length; i++)
         {
             Alias[] = Arr[];  	//값 복사
            System.out.println(Arr[i]);
               	
          }
          
        
        int myArray[] = { 1,2,3,4,5};
        int youArray[] = { 6,7,8,9,10};
        //int m [] = new int[5];
        
       // m = myArray;
        //myArray = youArray;
        //youArray = m;
        //for(int i = 0; i<5; i++)
        {
             m = myArray[i];
             myArray = youArray[i];
             youArray[i] = m;
           System.out.println(myArray[i]);
           
              	
         }
        for(int i = 0; i<5; i++)
        {
            
          
           System.out.println(youArray[i]);
              	
         }
       
        int myArray[] = { 1,2,3,4,5};
        int youArray[] = { 6,7,8,9,10};
        int m;
        int myAlias[];
        int youAlias[];
        int tempAlias[];
        
        myAlias = myArray;
        youAlias = youArray;
        for(int i = 0; i<myAlias.length; i++)
        {
            
          
          // System.out.println(youAlias[i]);
              	
         }
        tempAlias = myAlias;
        myAlias = youAlias;
        youAlias = tempAlias;
        for(int i = 0; i<myAlias.length; i++)
        {
            
          
           //System.out.println(youAlias[i]);
              	
         }
        
        //int Arra[] = new int[5];// 0~4까지
        //Arra[5] =12; 없는 번지에 값을 넣기때문에 에러
        
        
        //for each
       for(int i : myAlias ){
    	   System.out.println(i);
       }
        
        int Arr2[][]; //int [][]Arr2 == **Arr2
        // Arr2[열][행] == Arr2[큰 묶음][작은 묶음] 
        
        //3*4
        Arr2 = new int[3][]; //Array[3][4] == *(*(Array+3)+4)
        
        int ko1[];
        
        ko1 = new int[4];
        ko1[0] =10;
        ko1[1] =20;
        ko1[2] =30;
        ko1[3] =40;
        
        int ko2[];
        ko2 =new int [4];
        ko2[0] = 100;
        ko2[1] = 200;
        ko2[2] = 300;
        ko2[3] = 400;
        
        int ko3[];
        ko3 =new int [4];
        ko3[0] = 1000;
        ko3[1] = 2000;
        ko3[2] = 3000;
        ko3[3] = 4000;
        
        Arr2[0] =ko1;
        Arr2[1] =ko2;
        Arr2[2] =ko3;
     
        for(int i=0; i<4; i++)
        {
        	for(int j= 0;j<4;j++){
        		System.out.print("Arr2["+i+"]["+j+"]= "+Arr2[i][j]+" ");
        	}
        	System.out.println();
        }
       
        // Arr2_1[][];
        int Arr2_1[][];
        
        Arr2_1 =new int [3][];
        
        Arr2_1[0]= new int[4];
        Arr2_1[1]= new int[4];
        Arr2_1[2]= new int[4];
        
        Arr2_1[0][0] =10;
        Arr2_1[0][1] =20;
        Arr2_1[0][2] =30;
        Arr2_1[0][3] =40;
        
        Arr2_1[1][0] =100;
        Arr2_1[1][1] =200;
        Arr2_1[1][2] =300;
        Arr2_1[1][3] =400;
        
        Arr2_1[2][0] =100;
        Arr2_1[2][1] =200;
        Arr2_1[2][2] =300;
        Arr2_1[2][3] =400;
        
        int Arr2_2[][];
        Arr2_2 = new int[3][4];
        //int Arr2_2[][] = new int [3][4];
        Arr2_2[0][0] =10;
        Arr2_2[0][1] =20;
        Arr2_2[0][2] =30;
        Arr2_2[0][3] =40;
        
        Arr2_2[1][0] =100;
        Arr2_2[1][1] =200;
        Arr2_2[1][2] =300;
        Arr2_2[1][3] =400;
        
        Arr2_2[2][0] =100;
        Arr2_2[2][1] =200;
        Arr2_2[2][2] =300;
        Arr2_2[2][3] =400;
        */
        int map1[][] = { //4열 5행
        		{1,2,3,4,5},
        		{1,2,3,4,5},
        		{1,2,3,4,5},
        		{1,2,3,4,5}
        };
         int map2[][] = { //4열 5행
        		{2,4,6,8,10},
        		{2,4,6,8,10},
        		{2,4,6,8,10},
        		{2,4,6,8,10}
        };
       /* for(int i=0; i<4; i++)
        {
        	for(int j= 0;j<4;j++){
        		System.out.print(map1[i][j]+" ");
        		
        	}
        	System.out.println();
        }
        for(int i=0; i<4; i++)
        {
        	for(int j= 0;j<4;j++){
        		System.out.print(map2[i][j]+" ");
        	}
        	System.out.println();
        }
        int mAlias1[][];
        int mAlias2[][];
        int swap[][];
        
        mAlias1 = map1;
        mAlias2 = map2;
        
        swap =  mAlias1;
        mAlias1=  mAlias2;
        mAlias2 =  swap;
        System.out.println();
        for(int i=0; i<4; i++)
        {
        	for(int j= 0;j<4;j++){
        		System.out.print(mAlias1[i][j]+" ");
        		
        	}
        	System.out.println();
        }
        for(int i=0; i<4; i++)
        {
        	for(int j= 0;j<4;j++){
        		System.out.print(mAlias2[i][j]+" ");
        		
        	}
        	System.out.println();
        }
        
        //2차원 배열 데이터 -> 1차원 배열 데이터
        
        int map3[] = new int[20];
        
        //map-> map3
        for(int i=0; i<4; i++)
        {
        	for(int j= 0;j<5;j++)
        	{
        		map3[i * 5 +j] =map1[i][j];
        		
        	}
        	System.out.println();
        }
        for(int i=0; i<map3.length; i++)
        {
        	for(int j= 0;j<map3.length;j++){
        		System.out.print("map3["+j+"]= "+map3[i]+ " ");
        		
        		if(i%5 ==4)System.out.println();
        		
        	}
        	System.out.println();
        }
       
        
        int[][] arr = {
    			{ 5, 5, 5, 5, 5},
    			{10,10,10,10,10},
    			{20,20,20,20,20},
    			{30,30,30,30,30}
    		};
        int a[] = new int[20];
    		int total = 0;
    		float average = 0;
    		for(int i=0; i<4; i++)
            {
            	for(int j= 0;j<5;j++){
            		
                 a[i * 5 +j]= arr[i][j];
                 
            	}
            	System.out.println();
            }
    		for(int i=0; i<a.length; i++)
            {
            	total += a[i];
            	average=(float)total/a.length;
            	}
            	
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
			money= money%coinUnit[i];
		}
		
         
        int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
     	int[] counter = new int[4];
     	
     	for(int i=0; i < answer.length;i++) {
     		counter[answer[i]-1]++;
     	}
     	for(int i=0; i < counter.length;i++) {
     		System.out.print(counter[i]);
     		for(int j=0; j < counter[i];j++) {
         		System.out.print("*");
         		
         	}
     		System.out.println();
		
     	}
     	int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
			int n = answer[i] - 1;
			counter[n]++;
		}
		for(int i=0; i < counter.length;i++) {
			System.out.print(counter[i]);
			for(int j = 0;j < counter[i]; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	
/*         char[] abcCode =
     		{ 	'`','~','!','@','#','$','%','^','&','*',
     			'(',')','-','_','+','=','|','[',']','{',
     			'}',';',':',',','.','/'};

     			// 0 1 2 3 4 5 6 7 8 9
     	char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

         String src = "abc123";
     	String result = "";
     	
     	// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
     	for(int i=0; i < src.length();i++) {
     		char ch = src.charAt(i);
     		
     		if('a' <= ch && ch <='z'){
     			result += abcCode[ch -'a'];
     		}
     		else if ('0' <= ch && ch <= '9')
     		{
     			result += numCode[ch -'0'];
     		}
     	}
     	System.out.println("src:"+src);
     	System.out.println("result:"+result);

*/

	}
	

}

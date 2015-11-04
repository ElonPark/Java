package ranTest02;



public class ramTest02 {

	public static void main(String[] args) {
		
		int b[] = new int[20];
        int c[] = new int[10];
        int sum=0;
        double average =0;
        /*boolean ck= true;
        int ran=0;
        
        for(int i=0;i<10;i++)
		{

            for(int j=0; j<b.length;j++)
            {
            	int a = (int)(Math.random() * 20);	
            	b[j]= a;
            	
            	if (b[i] == b[j] && i!=j) { // 배열에 저장된값과 현재 랜덤값 비교
            	      ck = false;
            	      ran = (int) (Math.random() * 6); // 같으면 다시생성
            	      b[j]= ran;
            	      break;
            	     }else{
            	      ck = true;
            	     }
            }
		
           c[i]= b[i]%10;
           System.out.print(c[i]+" ");
           
           sum +=c[i];
           average=(double)sum/c.length;
		}*/
     
        int[] arr = new int[10];
        int ran;
        int check = 0;
        boolean ck = false;
        
        while(true){ 
         check = 0;
         for (int i = 0; i <=9 ; i++) {
          ran = (int) (Math.random() * 20); 
          arr[i] = ran; 
          for (int j = 0; j <= i; j++) {
           if (arr[i] == arr[j] && i!=j) { 
            ck = false;
            ran = (int) (Math.random() * 20); // 
            arr[i] = ran;
            break;
           }else{
            ck = true;
           }
          }
          if(ck ==true){
           check++;
          }
         }
         if(check == arr.length){
          break;
         }
        }
        for (int i = 0; i <= 9; i++) {
        	   System.out.print(arr[i]+" "); //마지막으로 값을 확인
        	   sum +=arr[i];
               average=(double)sum/arr.length;
        	  }
		
		 System.out.println("");
		 System.out.println("합계: "+sum);
		 System.out.println("평균: "+average);
		
       
		 int max = arr[0];
		 int min = arr[0];
		    for (int n = 1; n < arr.length; n++){
		      if (c[n] > max) max = arr[n];
		      
		    }
		       System.out.println("최대값: "+max);
		    for (int k = 1; k < arr.length; k++)
		    {
		        if (arr[k] < min) min = arr[k];
		        
		    }
		    System.out.println("최소값: "+min);
		    
        
	}
}

package dataArrTest;

import java.util.Scanner;

import dataArrTest.MyData;

public class mainClass
{
    
    public static void main(String[] args)
    {
        // TODO 자동 생성된 메소드 스텁
        Scanner sc = new Scanner(System.in);
        MyData myda = new MyData();
        int in = -1;
        while (true)
        {
            System.out.println("어떤 작업을 하시겠습니까?");
            System.out
                    .print("1.insert 2.remove 3.updata 4.search 5.print\n: ");
            in = sc.nextInt();
            
           
            // 1~5
            switch (in)
            {
              
                case 1:
                    myda._insert();
                    break;
                case 2:
                    myda._remove();
                    break;
                case 3:
                    myda._updata();
                    break;
                case 4:
                    myda._search();
                    break;
                case 5:
                    myda._print();
                    break;
            }
            
        }
        
    }
    
}

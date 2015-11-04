package dataArrTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class MyData
{
    
    LinkedList<Datas> myda = new LinkedList<Datas>();
    
    int findNumber;
    
    Scanner sc = new Scanner(System.in);
    
    MyData()
    {
    
    }
    
    Datas _input()
    {
        Datas data = new Datas();
        
        System.out.println("번호을 설정하세요");
        data.setNumber(sc.nextInt());
        System.out.println("이름을 입력하세요");
        data.setName(sc.next());
        System.out.println("휴대폰 번호를 입력하세요");
        data.setPhoneNumber(sc.next());
        System.out.println("주소를 입력하세요");
        data.setAddress(sc.next());
        return data;
    }
    
    void _insert()
    {
        myda.add(_input());
        
    }
    
    void _remove()
    {
        _search();
        if (findNumber == -1) return;
        
        myda.remove(findNumber);
        System.out.println((findNumber + 1) + "번쨰 데이터는 삭제되었습니다");
        
    }
    
    void _updata()
    {
        _search();
        if (findNumber == -1) return;
        
        System.out.println("수정할 데이터를 입력해 주십시오");
        Datas dt = _input();
        
        myda.set(findNumber, dt);
        
    }
    
    void _search()
    {
        System.out.print("검색할 이름을 입력 = ");
        String sName = sc.next();
        int fNumber = -1;
        
        for (int i = 0; i < myda.size(); i++)
        {
            if (myda.get(i).getName().equals(sName))
            {
                fNumber = i;
                break;
            }
        }
        if (fNumber != -1)
        {
            System.out.println("검색한 데이터는 있습니다");
            System.out.println("데이터는 " + (fNumber + 1) + "번째입니다");
        }
        else
        {
            System.out.println("검색한 데이터가 없습니다");
        }
        this.findNumber = fNumber;
    }
    
    void _sort(int snum)
    {
        
        Collections.sort(myda, new Comparator<Datas>() {
            public int compare(Datas obj1, Datas obj2)
            {
                if (snum == 1)
                {
                    return obj1.getNumber() < obj2.getNumber() ? -1
                            : obj1.getNumber() > obj2.getNumber() ? 1 : 0;
                }
                else if (snum == 2) { return obj1.getName()
                        .compareToIgnoreCase(obj2.getName()); }
                return -1;
            }
            
        });
        
    }
    
    
    void _print()
    {
        System.out.println("정렬 기준을 선택하세요 1.번호 , 2.이름");
        int n = sc.nextInt();
        _sort(n);
        
        for (int i = 0; i < myda.size(); i++)
        {
            Datas dt = myda.get(i);
            System.out.println(dt.getNumber() + " " + dt.getName() + " "
                    + dt.getPhoneNumber() + " " + dt.getAddress());
        }
    }
    
}

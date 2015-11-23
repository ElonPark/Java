package userCoffee;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

public class BaseClass
{
    Insert in = new Insert();
    
    Delete de = new Delete();
    
    Search se = new Search();
    
    Update up = new Update();
    
    Scanner sc = new Scanner(System.in);
    
    String s= null;
    
    void method()
    {
       
        int orderNum = 0;
        int price = 0;
        String name = "";
        String id = "";
        String pw = "";
        String menu = "아메리카노";
        String size = "톨";
        String status = "준비중";
        String birth = "000000";
        boolean sl = true;
         
        while (sl)
        {
            System.out.println("주문하시려면 로그인 하세요");
            System.out.print(" 1.로그인 2.회원가입 \n: ");
            int lo = sc.nextInt();
            if (lo == 1)
            {
                System.out.print("ID: ");
                id = sc.next();
                System.out.print("PW: ");
                pw = sc.next();
                UserDto ud = se.Asearch(id, pw);
                
                if (ud != null)
                {
                    
                    System.out.println(ud.getName() + "님 환영합니다!");
                    
                    sl = false;
                    
                }
                else
                {
                    System.out.println("id 혹은 비밀번호가 틀렸습니다.");
                    sl = true;
                    
                }
                
            }
            else if (lo == 2)
            {
                System.out.println("회원가입--정보를 입력하여주세요");
                System.out.print("ID: ");
                id = sc.next();
                System.out.print("PW: ");
                pw = sc.next();
                System.out.print("NAME: ");
                name = sc.next();
                System.out.print("BirthDay (YYYYMMDD): ");
                birth = sc.next();
                in.sineup(id, pw, name, birth);
                sl = true;
            }
            else
            {
                System.out.println("잘못 입력하셨습니다.");
                sl = true;
                
            }
        }
        boolean dss = true;
        
        while (dss)
        {
            
            orderNum = 0;
            TableView tvvv = se.NumSearch();
            orderNum += tvvv.getOrderNum();
            System.out.println("음료를 선택하세요");
            System.out.print("1.에스프레소 2.아메리카노 3.카페라떼 4.프라푸치노\n: ");
            int sd = sc.nextInt();
            switch (sd)
            {
                case 1:
                    price = 5000;
                    menu = "에스프레소";
                    break;
                case 2:
                    price = 5000;
                    menu = "아메리카노";
                    break;
                case 3:
                    price = 6000;
                    menu = "카페라떼";
                    break;
                case 4:
                    price = 7000;
                    menu = "프라푸치노";
                    break;
                default:
                    System.out.println("다시 입력하세요");
                    dss = true;
                    break;
            }
            
            if (sd != 4 && sd != 1)
            {
                System.out.print("1.HOT , 2. ICE\n: ");
                int h = sc.nextInt();
                if (h == 2)
                {
                    price += 500;
                    menu += "(ICE)";
                }
            }
            System.out.println("사이즈를 선택하세요");
            System.out.print("1.톨 2.스몰 3.그란데 4.벤티\n: ");
            int si = sc.nextInt();
            switch (si)
            {
                case 1:
                    price -= 1000;
                    size = " 톨 ";
                    break;
                case 2:
                    size = " 스몰";
                    break;
                case 3:
                    price = 2000;
                    size = "그란데";
                    break;
                case 4:
                    price += 3000;
                    size = " 벤티";
                    break;
                default:
                    System.out.println("다시 입력하세요");
                    dss = true;
                    break;
            }
            
            orderNum += 1;
            in.Order(orderNum, id, menu, size, price, status);
            System.out.println("주문 내역입니다. ");
            
            TableView tv2 = se.Osearch(orderNum);
            System.out.print("음료: " + tv2.getMenu() + " 사이즈: " + tv2.getSize()
                    + " 가격: " + tv2.getPrice() + " \n");
            System.out.print("주문 하시겠습니까? 1.주문 2.다시 주문 3.취소\n: ");
            
            int dsi = sc.nextInt();
            switch (dsi)
            
            {
                case 1:
                    dss = false;
                    System.out.println("주문 완료!");
                    s = " 주문번호: " + tv2.getOrderNum() +" ID: "+tv2.getId()+ ", 음료명: "
                            + tv2.getMenu() + ", 사이즈: " + tv2.getSize()
                            + ", 가격: " + tv2.getPrice();
                    System.out.print("다른 음료도 주문하시겠습니까? 1.Yes 2.No\n: ");
                    int dcg = sc.nextInt();
                    if (dcg == 1)
                    {
                        dss = true;
                    }
                    else
                    {
                        System.out.println("주문 종료");
                    }
                    break;
                case 2:
                    
                    de.Cancel(orderNum);
                    dss = true;
                    break;
                case 3:
                    
                    de.Cancel(orderNum);
                    dss = false;
                    sl = true;
                    break;
                default:
                    System.out.println("다시 입력하세요");
                    dss = true;
                    break;
            }
        }
        
    }
}

package adminCoffee;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Baseclass 
{
    
    Insert in = new Insert();
    
    Delete de = new Delete();
    
    Search se = new Search();
    
    Update up = new Update();
    
    Scanner sc = new Scanner(System.in);
    
    UserList ul = new UserList();
    int lo=0;
   
    void method()
    {
        
        while (true)
        {
            TableView tv = null;
           
            System.out
                    .println("\n------------------------관리자 메뉴-------------------------------\n");
            System.out
                    .print("     1.서빙 완료 2.주문 목록 3.음료 주문수 4.매출 \n 5.회원 목록 6.회원정보 수정 7.회원 삭제 8.주문목록 삭제\n==> ");
            lo = sc.nextInt();
            switch (lo)
            {
                case 1:
                    System.out.println("주문번호를 입력하세요");
                    int onum = sc.nextInt();
                    up.update(onum);
                    tv = se.Osearch(onum);
                    System.out.println("서빙 완료!");
                    System.out.println("  주문번호: " + tv.getOrderNum() + ", 음료명: "
                            + tv.getMenu() + ", 사이즈: " + tv.getSize() + ", 가격: "
                            + tv.getPrice() + ", 상태: " + tv.getOrderStatus());
                    System.out
                            .println("----------------------------------------------------------------");
                    break;
                case 2:
                    List<TableView> list2 = ul.OrderList();
                    
                    System.out
                            .println("----------------------------------------------------------------");
                    for (int i = 0; i < list2.size(); i++)
                    {
                        tv = list2.get(i);
                        System.out.println("  주문번호: " + tv.getOrderNum()
                                + ", ID: " + tv.getId() + ", 음료명: "
                                + tv.getMenu() + ", 사이즈: " + tv.getSize()
                                + ", 가격: " + tv.getPrice() + ", 상태: "
                                + tv.getOrderStatus());
                    }
                    System.out
                            .println("----------------------------------------------------------------");
                    break;
                case 3:
                    
                    List<TableView> list = ul.TopOrder();
                    
                    System.out.println("-----------------");
                    for (int i = 0; i < list.size(); i++)
                    {
                        tv = list.get(i);
                        System.out.println("  " + tv.getMenu() + ": "
                                + tv.getPrice() + "잔");
                    }
                    System.out.println("-----------------");
                    break;
                case 4:
                    tv = se.NumSearch();
                    System.out.println("매출: " + tv.getPrice() + "원");
                    break;
                case 5:
                    List<UserDto> list3 = ul.userList();
                    System.out
                            .println("----------------------------------------------------------------");
                    for (int i = 0; i < list3.size(); i++)
                    {
                        UserDto dt = list3.get(i);
                        System.out.println(" ID: " + dt.getId() + ", NAME: "
                                + dt.getName() + ", BIRTHDAY: " + dt.getBirth()
                                + ", JOINDATE: " + dt.getJoindate());
                    }
                    System.out
                            .println("----------------------------------------------------------------");
                    break;
                case 6:
                    System.out.print("변경할 회원의 ID: ");
                    String id = sc.next();
                    System.out.println("변경할 정보를 입력하여주세요");
                    System.out.print("PW: ");
                    String pw = sc.next();
                    System.out.print("NAME: ");
                    String name = sc.next();
                    System.out.print("BirthDay (YYYYMMDD): ");
                    String birth = sc.next();
                    up.UserFix(id, pw, name, birth);
                    System.out.print("변경 완료!");
                    System.out
                            .println("----------------------------------------------------------------");
                    UserDto uDto = se.Asearch(id);
                    System.out.println(" ID: " + uDto.getId() + ", NAME: "
                            + uDto.getName() + ", BIRTHDAY: " + uDto.getBirth()
                            + ", JOINDATE: " + uDto.getJoindate());
                    System.out
                            .println("----------------------------------------------------------------");
                    break;
                case 7:
                    System.out.print("삭제하고 싶은 회원의 ID를 입력하세요\n: ");
                    String idd = sc.next();
                    de.del(idd);
                    System.out.print("삭제 완료!");
                    break;
                case 8:
                    System.out.println("모든 주문을 삭제합니다.");
                    de.Orderdel();
                    System.out.println("  삭제 되었습니다.");
                    break;
                default:
                    System.out.println("다시 입력하세요");
                    method();
                    break;
            }
        }
     
    }
}

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
                    .println("\n------------------------������ �޴�-------------------------------\n");
            System.out
                    .print("     1.���� �Ϸ� 2.�ֹ� ��� 3.���� �ֹ��� 4.���� \n 5.ȸ�� ��� 6.ȸ������ ���� 7.ȸ�� ���� 8.�ֹ���� ����\n==> ");
            lo = sc.nextInt();
            switch (lo)
            {
                case 1:
                    System.out.println("�ֹ���ȣ�� �Է��ϼ���");
                    int onum = sc.nextInt();
                    up.update(onum);
                    tv = se.Osearch(onum);
                    System.out.println("���� �Ϸ�!");
                    System.out.println("  �ֹ���ȣ: " + tv.getOrderNum() + ", �����: "
                            + tv.getMenu() + ", ������: " + tv.getSize() + ", ����: "
                            + tv.getPrice() + ", ����: " + tv.getOrderStatus());
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
                        System.out.println("  �ֹ���ȣ: " + tv.getOrderNum()
                                + ", ID: " + tv.getId() + ", �����: "
                                + tv.getMenu() + ", ������: " + tv.getSize()
                                + ", ����: " + tv.getPrice() + ", ����: "
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
                                + tv.getPrice() + "��");
                    }
                    System.out.println("-----------------");
                    break;
                case 4:
                    tv = se.NumSearch();
                    System.out.println("����: " + tv.getPrice() + "��");
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
                    System.out.print("������ ȸ���� ID: ");
                    String id = sc.next();
                    System.out.println("������ ������ �Է��Ͽ��ּ���");
                    System.out.print("PW: ");
                    String pw = sc.next();
                    System.out.print("NAME: ");
                    String name = sc.next();
                    System.out.print("BirthDay (YYYYMMDD): ");
                    String birth = sc.next();
                    up.UserFix(id, pw, name, birth);
                    System.out.print("���� �Ϸ�!");
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
                    System.out.print("�����ϰ� ���� ȸ���� ID�� �Է��ϼ���\n: ");
                    String idd = sc.next();
                    de.del(idd);
                    System.out.print("���� �Ϸ�!");
                    break;
                case 8:
                    System.out.println("��� �ֹ��� �����մϴ�.");
                    de.Orderdel();
                    System.out.println("  ���� �Ǿ����ϴ�.");
                    break;
                default:
                    System.out.println("�ٽ� �Է��ϼ���");
                    method();
                    break;
            }
        }
     
    }
}

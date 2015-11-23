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
        String menu = "�Ƹ޸�ī��";
        String size = "��";
        String status = "�غ���";
        String birth = "000000";
        boolean sl = true;
         
        while (sl)
        {
            System.out.println("�ֹ��Ͻ÷��� �α��� �ϼ���");
            System.out.print(" 1.�α��� 2.ȸ������ \n: ");
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
                    
                    System.out.println(ud.getName() + "�� ȯ���մϴ�!");
                    
                    sl = false;
                    
                }
                else
                {
                    System.out.println("id Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
                    sl = true;
                    
                }
                
            }
            else if (lo == 2)
            {
                System.out.println("ȸ������--������ �Է��Ͽ��ּ���");
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
                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
                sl = true;
                
            }
        }
        boolean dss = true;
        
        while (dss)
        {
            
            orderNum = 0;
            TableView tvvv = se.NumSearch();
            orderNum += tvvv.getOrderNum();
            System.out.println("���Ḧ �����ϼ���");
            System.out.print("1.���������� 2.�Ƹ޸�ī�� 3.ī��� 4.����Ǫġ��\n: ");
            int sd = sc.nextInt();
            switch (sd)
            {
                case 1:
                    price = 5000;
                    menu = "����������";
                    break;
                case 2:
                    price = 5000;
                    menu = "�Ƹ޸�ī��";
                    break;
                case 3:
                    price = 6000;
                    menu = "ī���";
                    break;
                case 4:
                    price = 7000;
                    menu = "����Ǫġ��";
                    break;
                default:
                    System.out.println("�ٽ� �Է��ϼ���");
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
            System.out.println("����� �����ϼ���");
            System.out.print("1.�� 2.���� 3.�׶��� 4.��Ƽ\n: ");
            int si = sc.nextInt();
            switch (si)
            {
                case 1:
                    price -= 1000;
                    size = " �� ";
                    break;
                case 2:
                    size = " ����";
                    break;
                case 3:
                    price = 2000;
                    size = "�׶���";
                    break;
                case 4:
                    price += 3000;
                    size = " ��Ƽ";
                    break;
                default:
                    System.out.println("�ٽ� �Է��ϼ���");
                    dss = true;
                    break;
            }
            
            orderNum += 1;
            in.Order(orderNum, id, menu, size, price, status);
            System.out.println("�ֹ� �����Դϴ�. ");
            
            TableView tv2 = se.Osearch(orderNum);
            System.out.print("����: " + tv2.getMenu() + " ������: " + tv2.getSize()
                    + " ����: " + tv2.getPrice() + " \n");
            System.out.print("�ֹ� �Ͻðڽ��ϱ�? 1.�ֹ� 2.�ٽ� �ֹ� 3.���\n: ");
            
            int dsi = sc.nextInt();
            switch (dsi)
            
            {
                case 1:
                    dss = false;
                    System.out.println("�ֹ� �Ϸ�!");
                    s = " �ֹ���ȣ: " + tv2.getOrderNum() +" ID: "+tv2.getId()+ ", �����: "
                            + tv2.getMenu() + ", ������: " + tv2.getSize()
                            + ", ����: " + tv2.getPrice();
                    System.out.print("�ٸ� ���ᵵ �ֹ��Ͻðڽ��ϱ�? 1.Yes 2.No\n: ");
                    int dcg = sc.nextInt();
                    if (dcg == 1)
                    {
                        dss = true;
                    }
                    else
                    {
                        System.out.println("�ֹ� ����");
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
                    System.out.println("�ٽ� �Է��ϼ���");
                    dss = true;
                    break;
            }
        }
        
    }
}

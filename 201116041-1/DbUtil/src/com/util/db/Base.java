package com.util.db;

import java.util.List;
import java.util.Scanner;

public class Base
{
    Insert in = new Insert();
    
    Delete de = new Delete();
    
    Search se = new Search();
    
    Update up = new Update();
    
    UserList ul = new UserList();
    
    DBConnection dec;
    
    Scanner sc = new Scanner(System.in);
    
    public void method()
    {
        while(true) {
        int s = -1;
        System.out.print("1.�Է� 2.���� 3.�˻� 4.���� 5.��ȸ\n: ");
        s = sc.nextInt();
        s -= 1;
        switch (s)
        {
            case 0:
                System.out.print("ID: ");
                String id = sc.next();
                System.out.print("NAME: ");
                String name = sc.next();
                System.out.print("AGE: ");
                int age = sc.nextInt();
                int cnt = in.join(id, name, age);
                break;
            case 1:
                System.out.print("������ ID �Է�: ");
                id = sc.next();
                Serout(id);
                de.del(id);
                System.out.print("���� �Ϸ�\n");
                break;
            case 2:
                System.out.print("�˻��� ID �Է�: ");
                id = sc.next();
                Serout(id);
                break;
            case 3:
                System.out.print("������ ID �Է�: ");
                id = sc.next();
                Serout(id);
                
                System.out.print("NAME: ");
                name = sc.next();
                System.out.print("AGE: ");
                age = sc.nextInt();
                up.update(id,name, age);
                System.out.print("���� �Ϸ�\n");
             
                break;
            case 4:
                alveiw();
                break;
            default:
                System.out.println("�´� ���ڸ� �Է��ϼ���");
                break;
        }
        }
    }
    
    void Serout(String id)
    {
        System.out.println(id + " �˻� ���");
        UserDto uDto = se.search(id);
        
        if (uDto != null)
        {
            System.out.println("ID: " + uDto.getID());
            System.out.println("NAME: " + uDto.getName());
            System.out.println("AGE: " + uDto.getAge());
            System.out.println("JOINDATE: " + uDto.getJoindate());
        }
        else
        {
            System.out.println(id + "�� �������� �ʴ� ID�Դϴ�.");
        }
   
    }
    
    void alveiw()
    {
 List<UserDto> list = ul.userList();
        System.out.println("��� ���� ���");
        System.out.println("���̵�\t�̸�\t����\t������");
        for (int i = 0; i < list.size(); i++)
        {
            UserDto dto = list.get(i);
            System.out.println(dto.getID() + "\t" + dto.getName() + "\t"
                    + dto.getAge() + "\t" + dto.getJoindate());
        }
    }
}

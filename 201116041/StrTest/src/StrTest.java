import java.util.Scanner;

public class StrTest
{
    
    public static void main(String[] args)
    {
        /*
         * String str ="apple"; // -> apple \0 == ' '
         * 
         * //ù��° ���� �˻� boolean b = str.startsWith("a"); System.out.println("b= "
         * + b);
         * 
         * //������ ���� �˻� b = str.endsWith("e"); System.out.println("b= "+ b);
         * 
         * //���ڿ� �� String str1 = "abc"; String str2 = "ab";
         * 
         * //str2 = str2 +"c";
         * 
         * if(str1 == str2) //������ �⺻���� ���Ѵ�. { System.out.print("str1�� str2�� ����"
         * ); } b= str1.equals(str2); //���ڳ��� ���Ҷ� ����. ���ڰ� ������
         * System.out.println("b= "+ b);
         * 
         * //���� ����
         * 
         * //char str[10] = "Abcde"; -> class
         * 
         * int indexof = str.indexOf("l");
         * 
         * System.out.println("indexof = "+ indexof);
         * 
         * //���ڿ��� ����
         * 
         * int len = str.length(); System.out.println("len = "+ len);
         * 
         * //������ ���� String str3 = str.replace("p", "c"); System.out.println(
         * "str3 = "+ str3);
         * 
         * //�迭 ��ȯ String str4 = "217:56:18:70"; String[] split
         * =str4.split(":"); int num[] =new int[4]; for(int i=0; i<4; i++) {
         * System.out.println("split["+i+"]" + split[i]);
         * num[i]=Integer.parseInt(split[i]); }
         * 
         * for(int i=0; i<4; i++) { System.out.println("num["+i+"]" + num[i]);
         * 
         * }
         * 
         * //���� ->���ڿ�; int numform = 123; String tostr =
         * Integer.toString(numform);
         * 
         * //���ڿ� �κ� ���� String str5 = "ABCDE"; String substr =
         * str5.substring(1,3); System.out.println("substr= " + substr);
         * 
         * //�� ���ڸ� ���� char c =str5.charAt(2); System.out.println("c= " + c);
         * 
         * //str5 = str5 + str3; str5= str5.concat(str3); System.out.println(
         * "str5= " + str5);
         * 
         * int i = 123456789; str5 = String.format("%,d", i);
         * System.out.println("str5= " + str5);
         * 
         * double d =123.456789; str5 = String.format("%.1f", d);
         * System.out.println("str5= " + str5);
         * 
         * 
         * //contains ���ڿ��� ���� String str6 = "ABCDE"; b = str6.contains("BC");
         * System.out.println("b= "+ b);
         * 
         * // "ABCDE -> "EDCBA" //StringBuffer StringBuffer sb = new
         * StringBuffer(str6);
         * 
         * System.out.println("str6= "+ sb.reverse());
         * 
         * //char String strbuf = ""; len = str6.length(); //0~4 for(int h= len
         * -1; h>=0; h--) //5 -1 =4 ->3->2->1->0 �ں��� �ѱ��ھ� �о ��� { strbuf +=
         * str6.charAt(h); }
         * 
         * System.out.println("strbuf= "+ strbuf);
         */
        /*
         * //usr input Scanner sc = new Scanner(System.in); int peple = 0;
         * String name = ""; int age= 0; String pNumber = ""; String adress =
         * ""; int gender = 0; int penum =0; int sech= 0; String str=
         * " :  :  :  :  :  "; String[] split =str.split(":");
         * 
         * 
         * //�Է��� ��� �ο��� System.out.print("�ο����� �Է��ϼ���\n :"); peple =
         * sc.nextInt();
         * 
         * for(int i = 0; i < peple; i++){
         * 
         * //�̸� ���� System.out.print("�̸��� �Է��ϼ���\n :"); name = sc.next();
         * 
         * 
         * //���� ���� System.out.print("���̸� �Է��ϼ���\n :"); age = sc.nextInt();
         * 
         * //��ȭ��ȣ ���� System.out.print("��ȭ��ȣ�� �Է��ϼ���\n :"); pNumber = sc.next();
         * 
         * 
         * //�ּ� System.out.print("�ּҸ� �Է��ϼ��� \n :"); adress = sc.next();
         * 
         * //���� ���� System.out.print("������ �Է��ϼ���\n :"); gender = sc.nextInt();
         * String ge=""; if(gender ==1){ ge = "����"; } else if(gender ==2){ ge =
         * "����"; }
         * 
         * //��ȣ �ڵ� ���� penum+=1;
         * 
         * 
         * //�޾ƿ� ���� ��Ʈ������ �迭
         * 
         * split[i]= penum+":"+name+":"+age+":"+pNumber+":"+adress+":"+ge;
         * 
         * 
         * } for(int i = 0; i<split.length; i++){
         * System.out.print(split[i]+"\n");
         * 
         * }
         */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("������ ����");
        
        int count = 3;
        String name = new String();
        int age = 0;
        String phone = new String();
        String add = new String();
        int human = 0;
        
        int id = 1;
        int sech = 0;
        
        System.out.print("�ο����� �Է��ϼ���\n :");
        count = sc.nextInt();
        // �Է��� ����� �ο���
        String datas[] = new String[count];
        
        for (int i = 0; i < count; i++)
        {
            // �̸�
            System.out.print("name = ");
            name = sc.next();
            // ����
            System.out.print("age = ");
            age = sc.nextInt();
            // ��ȭ��ȣ
            System.out.print("phone = ");
            phone = sc.next();
            // �ּ�
            System.out.print("add = ");
            add = sc.next();
            // ����
            System.out.print("human = ");
            human = sc.nextInt();
            String ge = "";
            if (human == 1)
            {
                ge = "����";
            }
            else if (human == 2)
            {
                ge = "����";
            }
            
            // System.out.println(name +"-"+ age + "-"+ phone + "-"+ add + "-"+
            // human);
            
            datas[i] = id + "-" + name + "-" + age + "-" + phone + "-" + add
                    + "-" + human;
                    
            // ��ȣ ����
            id += 1;
        }
        
        for (int i = 0; i < count; i++)
        {
            System.out.println(datas[i]);
        }
        
        String ageStr[] = new String[count];
        // int ageStr[] = new int[count];
        for (int i = 0; i < count; i++)
        {
            String[] split = datas[i].split("-");
            ageStr[i] = split[2];
            
            System.out.println("���̴� " + ageStr[i]);
        }
        // ��ȣ �˻�
        
        System.out.print("ã���ô� ID�� �Է��ϼ���\n:");
        sech = sc.nextInt();
        // while(true){
        // for(int i = 0; i<split.length; i++){
        // if(sech==1){
        System.out.println(sech + "��" + datas[sech - 1] + "�Դϴ�");
        
        // �̸�
        System.out.print("name = ");
        name = sc.next();
        // ����
        System.out.print("age = ");
        age = sc.nextInt();
        // ��ȭ��ȣ
        System.out.print("phone = ");
        phone = sc.next();
        // �ּ�
        System.out.print("add = ");
        add = sc.next();
        // ����
        System.out.print("human = ");
        human = sc.nextInt();
        String ge = "";
        if (human == 1)
        {
            ge = "����";
        }
        else if (human == 2)
        {
            ge = "����";
        }
        
        // System.out.println(name +"-"+ age + "-"+ phone + "-"+ add + "-"+
        // human);
        
        datas[sech - 1] = sech + "-" + name + "-" + age + "-" + phone + "-"
                + add + "-" + human;
        System.out.println(datas[sech - 1]);
        // break;
        // }
        // else
        // System.out.println(sech+"��"+split[penum-1]+"�Դϴ�");
        // }
        // }
        
    }
    
}

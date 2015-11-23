import java.util.Scanner;

public class StrTest
{
    
    public static void main(String[] args)
    {
        /*
         * String str ="apple"; // -> apple \0 == ' '
         * 
         * //첫번째 문자 검색 boolean b = str.startsWith("a"); System.out.println("b= "
         * + b);
         * 
         * //마지막 문자 검색 b = str.endsWith("e"); System.out.println("b= "+ b);
         * 
         * //문자열 비교 String str1 = "abc"; String str2 = "ab";
         * 
         * //str2 = str2 +"c";
         * 
         * if(str1 == str2) //문자의 기본값을 비교한다. { System.out.print("str1과 str2는 같다"
         * ); } b= str1.equals(str2); //문자끼리 비교할때 쓴다. 문자가 같으면
         * System.out.println("b= "+ b);
         * 
         * //문자 산출
         * 
         * //char str[10] = "Abcde"; -> class
         * 
         * int indexof = str.indexOf("l");
         * 
         * System.out.println("indexof = "+ indexof);
         * 
         * //문자열의 길이
         * 
         * int len = str.length(); System.out.println("len = "+ len);
         * 
         * //문자의 변경 String str3 = str.replace("p", "c"); System.out.println(
         * "str3 = "+ str3);
         * 
         * //배열 변환 String str4 = "217:56:18:70"; String[] split
         * =str4.split(":"); int num[] =new int[4]; for(int i=0; i<4; i++) {
         * System.out.println("split["+i+"]" + split[i]);
         * num[i]=Integer.parseInt(split[i]); }
         * 
         * for(int i=0; i<4; i++) { System.out.println("num["+i+"]" + num[i]);
         * 
         * }
         * 
         * //숫자 ->문자열; int numform = 123; String tostr =
         * Integer.toString(numform);
         * 
         * //문자열 부분 추출 String str5 = "ABCDE"; String substr =
         * str5.substring(1,3); System.out.println("substr= " + substr);
         * 
         * //한 문자를 리턴 char c =str5.charAt(2); System.out.println("c= " + c);
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
         * //contains 문자열이 포함 String str6 = "ABCDE"; b = str6.contains("BC");
         * System.out.println("b= "+ b);
         * 
         * // "ABCDE -> "EDCBA" //StringBuffer StringBuffer sb = new
         * StringBuffer(str6);
         * 
         * System.out.println("str6= "+ sb.reverse());
         * 
         * //char String strbuf = ""; len = str6.length(); //0~4 for(int h= len
         * -1; h>=0; h--) //5 -1 =4 ->3->2->1->0 뒤부터 한글자씩 읽어서 출력 { strbuf +=
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
         * //입력할 사람 인원수 System.out.print("인원수를 입력하세요\n :"); peple =
         * sc.nextInt();
         * 
         * for(int i = 0; i < peple; i++){
         * 
         * //이름 관리 System.out.print("이름을 입력하세요\n :"); name = sc.next();
         * 
         * 
         * //나이 관리 System.out.print("나이를 입력하세요\n :"); age = sc.nextInt();
         * 
         * //전화번호 관리 System.out.print("전화번호를 입력하세요\n :"); pNumber = sc.next();
         * 
         * 
         * //주소 System.out.print("주소를 입력하세요 \n :"); adress = sc.next();
         * 
         * //성별 관리 System.out.print("성별을 입력하세요\n :"); gender = sc.nextInt();
         * String ge=""; if(gender ==1){ ge = "남자"; } else if(gender ==2){ ge =
         * "여자"; }
         * 
         * //번호 자동 설정 penum+=1;
         * 
         * 
         * //받아온 모든걸 스트링으로 배열
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
        
        System.out.println("데이터 관리");
        
        int count = 3;
        String name = new String();
        int age = 0;
        String phone = new String();
        String add = new String();
        int human = 0;
        
        int id = 1;
        int sech = 0;
        
        System.out.print("인원수를 입력하세요\n :");
        count = sc.nextInt();
        // 입력할 사람의 인원수
        String datas[] = new String[count];
        
        for (int i = 0; i < count; i++)
        {
            // 이름
            System.out.print("name = ");
            name = sc.next();
            // 나이
            System.out.print("age = ");
            age = sc.nextInt();
            // 전화번호
            System.out.print("phone = ");
            phone = sc.next();
            // 주소
            System.out.print("add = ");
            add = sc.next();
            // 성별
            System.out.print("human = ");
            human = sc.nextInt();
            String ge = "";
            if (human == 1)
            {
                ge = "남자";
            }
            else if (human == 2)
            {
                ge = "여자";
            }
            
            // System.out.println(name +"-"+ age + "-"+ phone + "-"+ add + "-"+
            // human);
            
            datas[i] = id + "-" + name + "-" + age + "-" + phone + "-" + add
                    + "-" + human;
                    
            // 번호 설정
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
            
            System.out.println("나이는 " + ageStr[i]);
        }
        // 번호 검색
        
        System.out.print("찾으시는 ID를 입력하세요\n:");
        sech = sc.nextInt();
        // while(true){
        // for(int i = 0; i<split.length; i++){
        // if(sech==1){
        System.out.println(sech + "는" + datas[sech - 1] + "입니다");
        
        // 이름
        System.out.print("name = ");
        name = sc.next();
        // 나이
        System.out.print("age = ");
        age = sc.nextInt();
        // 전화번호
        System.out.print("phone = ");
        phone = sc.next();
        // 주소
        System.out.print("add = ");
        add = sc.next();
        // 성별
        System.out.print("human = ");
        human = sc.nextInt();
        String ge = "";
        if (human == 1)
        {
            ge = "남자";
        }
        else if (human == 2)
        {
            ge = "여자";
        }
        
        // System.out.println(name +"-"+ age + "-"+ phone + "-"+ add + "-"+
        // human);
        
        datas[sech - 1] = sech + "-" + name + "-" + age + "-" + phone + "-"
                + add + "-" + human;
        System.out.println(datas[sech - 1]);
        // break;
        // }
        // else
        // System.out.println(sech+"는"+split[penum-1]+"입니다");
        // }
        // }
        
    }
    
}

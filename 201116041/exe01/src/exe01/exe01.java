package exe01;

import java.util.Scanner;

public class exe01
{
    /*
     * public static int method(int n1, String t, int n2) { int r=0; switch(t) {
     * case "+": r = n1 + n2; break; case "-": r = n1 - n2; break; case "*": r =
     * n1 * n2; break; case "/": r = n1 / n2; break; } return r; } public static
     * void method1(int[] n1) { n1[0]++; System.out.println("  "+n1[0]); }
     * public static double getDistance(double x,double y, double x1,double y1)
     * { double d = 0.0; d = Math.sqrt(Math.pow(y1 -y, 2.0)+Math.pow(x1-x,
     * 2.0));
     * 
     * return d; }
     */
    /*
     * public static int[] shuffle(int[] r_num) { r_num=new int[9]; int r,w;
     * w=0; boolean swit[] = new boolean[9]; for(int
     * i=0;i<9;i++)swit[i]=false;// 00000 00000
     * 
     * while(w<9) { r = (int)(Math.random()*9); if(swit[r]==false) { swit[r] =
     * true; //00000 10000 r_num[w] =r+1; //1~10 w++; } } return r_num;
     * 
     * 
     * } public static int getResult(int s1, int s2,int n[]) { int n1; n[0] =
     * s1%s2; n1 = s1/s2;
     * 
     * 
     * return n1;
     * 
     * }
     */
    public static int[] getDouble(int[] n)
    {
        for (int i = 0; i < n.length; i++)
        {
            n[i] = n[i] * 2;
        }
        return n;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1[] = { 1, 2, 3, 4, 5 };
        int result[] = new int[5];
        result = getDouble(num1);
        
        System.out.println(java.util.Arrays.toString(result));
        /*
         * Scanner scan = new Scanner(System.in); int num1=0, num2=0; int
         * result=0; int[] tag = new int[1]; System.out.println("첫번째 수 = ");
         * num1=scan.nextInt(); System.out.println("두번째 수 = ");
         * num2=scan.nextInt();
         * 
         * result = getResult(num1, num2,tag);
         * 
         * System.out.println(result); System.out.println(tag[0]);
         * 
         * /* int[] original = {1,2,3,4,5,6,7,8,9};
         * System.out.println(java.util.Arrays.toString(original)); int[] result
         * = shuffle(original);
         * System.out.println(java.util.Arrays.toString(result));
         * 
         * 
         * Scanner scan = new Scanner(System.in);
         * 
         * double x1,y1,x2,y2; x1 = 1.0; y1 = 1.0;
         * 
         * x2= 2.0; y2= 2.0;
         * 
         * double rd = getDistance(x1,y1,x2,y2);
         * 
         * System.out.println("rd=  "+rd);
         * 
         * int[] number= new int[1]; number[0] = 7; System.out.println("  "
         * +number[0]); method1(number); System.out.println("  "+number[0]);
         * 
         * int num1,num2; String tag; int result =0;
         * 
         * System.out.println("첫번째 수 = "); num1=scan.nextInt();
         * System.out.println("연산자 = "); tag=scan.next(); System.out.println(
         * "두번째 수 = "); num2=scan.nextInt();
         * 
         * result = method(num1,tag,num2); System.out.println(num1+ tag+ num2+
         * " = "+result);
         */
    }
    
}

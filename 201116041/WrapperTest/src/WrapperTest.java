import java.lang.*;
public class WrapperTest {

	public static void main(String[] args) {
		/*
		//byte 
		byte b= 12;
		Byte ob = new Byte(b);
		Byte ob1 =new Byte(b);
		
		
		
		
		String str =ob.toString();
		System.out.println("str= " +str);
		
		boolean bo =ob1.equals(ob);
		System.out.println("bo= " +bo);
		
		
		short s = 32;
		Short os = new Short(s);
		
		double  d= 7.6;
		Double od = new Double(d);
		String str1 =od.toString();
		System.out.println("str1= " +str1);
		float f = 32.24f;
		Float of = new Float(f);

		//문자열로 바뀐것 ->수치로..
		
		//string-> 숫자
		Double dnum =  Double.parseDouble(str1);
		System.out.println("dnum= " +dnum);
		dnum = Double.valueOf(str1);
		System.out.println("dnum= " +dnum);
		*/
		String str1 = "124";
		String str2 = "73";
		String str3 = "4.987";
		
		int i = Integer.parseInt(str1);
		Byte ob = new Byte(str2);
		Double od = Double.valueOf(str3);
		System.out.println(i);
		System.out.println(ob.byteValue());
		System.out.println(od.doubleValue());
		
		
	}

}

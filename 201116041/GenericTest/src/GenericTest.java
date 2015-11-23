
public class GenericTest {

    public static void main(String[] args) {
	
	calClass<Double, String> ccls1 = new calClass();
	calClass<Double, String> ccls2 = new calClass();
	
	double r= ccls1.getNum1(23.12) * ccls2.getNum1(34.48);
	
	System.out.println("r= "+r);
	
	/*
	BoxClass bo = new BoxClass(123);
	Integer i= (Integer)bo.get();
	System.out.println("i= "+i);
	BoxClass sbo = new BoxClass("Hello");
	String s= (String)sbo.get();
	System.out.println("s= "+s);*/
	
	BoxClass<Integer> bo = new BoxClass<Integer> (new Integer(123));
	Integer i= bo.get();
	System.out.println("i= "+i);
	
	BoxClass<String> sbo = new BoxClass("Hello");
	String s= sbo.get();
	System.out.println("s= "+s);

	/*
	 * Generic
	 * 여러 자료형을 융통성있게 설정할 수 있다.
	 * : 자료형 변수
	 */

    }

}

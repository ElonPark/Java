
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraListTest
{
    
    public static void main(String[] args)
    {
        
        ArrayList<MyClass> arrMycls = new ArrayList<MyClass>();
        
        arrMycls.add(new MyClass(1, "������", "15"));
        arrMycls.add(new MyClass(4, "�ڼ���", "52"));
        arrMycls.add(new MyClass(6, "������", "16"));
        arrMycls.add(new MyClass(3, "������", "23"));
        arrMycls.add(new MyClass(2, "������", "30"));
        arrMycls.add(new MyClass(5, "�ν�ũ", "21"));
        
        // sorting
        Collections.sort(arrMycls, new Comparator<MyClass>() {
            public int compare(MyClass obj1, MyClass obj2)
            {
                // return obj1.getNumber() < obj2.getNumber() ? -1
                // : obj1.getNumber() > obj2.getNumber() ? 1 : 0;
               // return obj1.getNumber() > obj2.getNumber() ? -1
                     //   : obj1.getNumber() < obj2.getNumber() ? 1 : 0;
                
               // return  obj1.age.compareToIgnoreCase(obj2.age);
                return  obj1.name.compareToIgnoreCase(obj2.name);       
            }
            
        });
        for (MyClass temp : arrMycls)
        {
            temp.output();
        }
        
        /*
         * ArrayList<Integer> arrInt = new ArrayList<Integer>();
         * 
         * 
         * //�߰�== INSERT arrInt.add(111); //[0] arrInt.add(222); //[1]
         * arrInt.add(333); //[2]
         * 
         * for(int i = 0; i< arrInt.size(); i++) {
         * System.out.println(arrInt.get(i)); } System.out.println(""); //���ϴ� ����
         * �߰� arrInt.add(1, 112); for(int i = 0; i< arrInt.size(); i++) {
         * System.out.println(arrInt.get(i)); } System.out.println(""); //���� ==
         * UPDATA arrInt.set(2, 234); for(int i = 0; i< arrInt.size(); i++) {
         * System.out.println(arrInt.get(i)); } System.out.println(""); //���� ==
         * DELETE arrInt.remove(1); for(int i = 0; i< arrInt.size(); i++) {
         * System.out.println(arrInt.get(i)); } System.out.println("");
         * 
         * //�˻� ==SELECT int rnum;
         * 
         * rnum = arrInt.indexOf(234); System.out.println(rnum +"���� "
         * +arrInt.get(rnum)); System.out.println("");
         * 
         * 
         * ArrayList<String> arrStr = new ArrayList<String>();
         * 
         * //�߰� arrStr.add("��"); arrStr.add("��"); arrStr.add("��"); for(int i =
         * 0; i< arrStr.size(); i++) { System.out.println(arrStr.get(i)); }
         * System.out.println("");
         * 
         * //���ϴ� ���� �߰� arrStr.add(2, "�ٶ�"); for(int i = 0; i< arrStr.size();
         * i++) { System.out.println(arrStr.get(i)); } System.out.println("");
         * //���� arrStr.set(2, "��"); for(int i = 0; i< arrStr.size(); i++) {
         * System.out.println(arrStr.get(i)); } System.out.println(""); //�˻� int
         * sst; sst = arrStr.indexOf("��"); System.out.println(sst+"���� "
         * +arrStr.get(sst)); System.out.println(""); //���� arrStr.remove("��");
         * for(int i = 0; i< arrStr.size(); i++) {
         * System.out.println(arrStr.get(i)); } System.out.println("");
         * 
         * 
         * 
         * ArrayList<MyClass> arrMycls = new ArrayList<MyClass>();
         * 
         * // �߰� MyClass cls = new MyClass(); cls.input(1001, "ȫ�浿");
         * arrMycls.add(cls); MyClass cls2 = new MyClass(); cls2.input(1002,
         * "������"); arrMycls.add(cls2); MyClass cls3 = new MyClass();
         * cls3.input(1003, "��Ÿũ"); arrMycls.add(cls3); MyClass cls4 = new
         * MyClass(); cls4.input(1004, "��ǻ��"); arrMycls.add(cls4);
         * 
         * cls.input(1002, "������"); arrMycls.add(cls); for(int i = 0; i<
         * arrMycls.size(); i++) { MyClass mc = arrMycls.get(i); mc.output(); }
         * System.out.println("");
         * 
         * for (MyClass temp : arrMycls) { temp.output(); }
         * System.out.println(""); // ���ϴ� ���� �߰� MyClass cls5 = new MyClass();
         * cls5.input(1012, "�ں�"); arrMycls.add(1, cls5); for (MyClass temp :
         * arrMycls) { temp.output(); } System.out.println(""); // ���� MyClass
         * cls6 = new MyClass(); cls6.input(1011, "ȣũ����"); arrMycls.set(0,
         * cls6);
         * 
         * for (MyClass temp : arrMycls) { temp.output(); }
         * System.out.println(""); // �˻� int scls; scls =
         * arrMycls.indexOf(cls5);
         * 
         * System.out.println(cls6.hashCode()); int r = 0; for (int i = 0; i <
         * arrMycls.size(); i++) // for(MyClass temp: arrMycls) { MyClass temp =
         * arrMycls.get(i); if (temp.name.toString() == "������") { r = i;
         * temp.output(); break; } }
         * 
         * MyClass mc =arrMycls.get(scls); mc.output();
         * 
         * System.out.println(""); // ����
         * 
         * arrMycls.remove(2);
         * 
         * for (MyClass temp : arrMycls) { temp.output(); }
         * System.out.println(""); arrMycls.clear();// ��ü ���� for (MyClass temp :
         * arrMycls) { temp.output(); } System.out.println("");
         * 
         * 
         * Iterator it = arrInt.iterator(); while(it.hasNext()) {
         * System.out.println(it.next()); }
         * 
         * ListIterator lit = arrInt.listIterator(); while(lit.hasNext()) {
         * System.out.println(lit.next()); }
         */
        
    }
    
}
